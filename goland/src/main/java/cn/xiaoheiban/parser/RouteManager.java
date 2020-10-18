package cn.xiaoheiban.parser;

import cn.xiaoheiban.psi.nodes.HttpRouteNode;
import cn.xiaoheiban.psi.nodes.StructNameNode;
import com.intellij.lang.ASTNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RouteManager implements DuplicateManager<HttpRouteNode> {
    private static Set<HttpRouteNode> routeSet;
    private static RouteManager instance;

    private RouteManager() {
        routeSet = new HashSet<>();
    }

    public static RouteManager getInstance() {
        if (instance == null) {
            instance = new RouteManager();
        }
        return instance;
    }

    @Override
    public void init() {
        routeSet.clear();
    }

    @Override
    public void add(HttpRouteNode el) {
        if (el == null) return;
        routeSet.add(el);
    }

    @Override
    public Map<String, Set<ASTNode>> getDuplicate() {
        Map<String, Set<ASTNode>> tmp = new HashMap();
        Map<String, Set<ASTNode>> ret = new HashMap();
        routeSet.forEach((el) -> {
            String key = el.getName();
            if (key==null){
                return;
            }
            Set<ASTNode> set = tmp.get(key);
            if (set == null) {
                set = new HashSet<>();
            }
            if(!el.isValid()||!el.isPhysical())return;
            set.add(el.getNode());
            tmp.put(key, set);
        });
        tmp.forEach((key, astNodes) -> {
            if (astNodes.size() > 1) {
                ret.put(key, astNodes);
            }
        });
        return ret;
    }
}
