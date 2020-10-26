package cn.xiaoheiban.parser;

import cn.xiaoheiban.psi.nodes.IPsiNode;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.text.StringUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateManager {
    private Set<IPsiNode> duplicates;

    protected DuplicateManager() {
        duplicates = new HashSet<>();
    }

    public void init() {
        duplicates.clear();
    }

    public void add(IPsiNode el) {
        if (el == null) return;
        duplicates.add(el);
    }

    public boolean contains(IPsiNode node) {
        String key = node.getKey();
        Set<String> set = new HashSet<>();
        duplicates.forEach((el) -> {
            if (!el.isValid() || !el.isPhysical()) {
                return;
            }
            if (StringUtil.isEmptyOrSpaces(el.getKey())) {
                return;
            }
            set.add(el.getKey());
        });
        return set.contains(key);
    }

    public Map<String, Set<IPsiNode>> getDuplicate() {
        Map<String, Set<IPsiNode>> tmp = new HashMap();
        Map<String, Set<IPsiNode>> ret = new HashMap();
        Set<ASTNode> matchSet = new HashSet<>();
        duplicates.forEach((el) -> {
            String key = el.getKey();
            // filename filter
            int index = key.indexOf(":");
            if (index <= 0) {
                return;
            }
            Set<IPsiNode> set = tmp.get(key);
            if (set == null) {
                set = new HashSet<>();
            }
            if (!el.isValid() || !el.isPhysical() || matchSet.contains(el.getNode())) return;
            matchSet.add(el.getNode());
            set.add(el);
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
