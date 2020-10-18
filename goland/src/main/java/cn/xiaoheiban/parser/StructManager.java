package cn.xiaoheiban.parser;

import cn.xiaoheiban.psi.nodes.StructNameNode;
import com.intellij.lang.ASTNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StructManager implements DuplicateManager<StructNameNode> {
    private static Set<StructNameNode> structNameNodeSet;
    private static StructManager instance;

    private StructManager() {
        structNameNodeSet = new HashSet<>();
    }

    public static StructManager getInstance() {
        if (instance == null) {
            instance = new StructManager();
        }
        return instance;
    }

    @Override
    public void init() {
        structNameNodeSet.clear();
    }

    @Override
    public void add(StructNameNode el) {
        if (el == null) return;
        structNameNodeSet.add(el);
    }

    @Override
    public Map<String, Set<ASTNode>> getDuplicate() {
        Map<String, Set<ASTNode>> tmp = new HashMap();
        Map<String, Set<ASTNode>> ret = new HashMap();
        structNameNodeSet.forEach((el) -> {
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
