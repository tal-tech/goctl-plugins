package cn.xiaoheiban.psi.nodes;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class ServiceNameNode extends AntlrPsiNode {
    public ServiceNameNode(@NotNull ASTNode node) {
        super(node);
    }

}
