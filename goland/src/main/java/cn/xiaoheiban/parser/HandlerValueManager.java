package cn.xiaoheiban.parser;

import cn.xiaoheiban.psi.nodes.HandlerValueNode;
import com.intellij.lang.ASTNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HandlerValueManager implements DuplicateManager<HandlerValueNode> {
    private static Set<HandlerValueNode> handlerSet;
    private static HandlerValueManager instance;

    private HandlerValueManager() {
        handlerSet = new HashSet<>();
    }

    public static HandlerValueManager getInstance() {
        if (instance == null) {
            instance = new HandlerValueManager();
        }
        return instance;
    }

    @Override
    public void init() {
        handlerSet.clear();
    }

    @Override
    public void add(HandlerValueNode el) {
        if (el == null) return;
        handlerSet.add(el);
    }

    @Override
    public Map<String, Set<ASTNode>> getDuplicate() {
        Map<String, Set<ASTNode>> tmp = new HashMap();
        Map<String, Set<ASTNode>> ret = new HashMap();
        handlerSet.forEach((el) -> {
            String key = el.getHandlerName();
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
