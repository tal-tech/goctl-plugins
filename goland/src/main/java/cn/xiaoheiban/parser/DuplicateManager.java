package cn.xiaoheiban.parser;

import com.intellij.lang.ASTNode;

import java.util.Map;
import java.util.Set;

public interface DuplicateManager<T> {
    void add(T el);

    void init();

    Map<String, Set<ASTNode>> getDuplicate();
}
