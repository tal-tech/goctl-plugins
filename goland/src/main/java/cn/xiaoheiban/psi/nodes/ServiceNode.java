package cn.xiaoheiban.psi.nodes;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class ServiceNode extends AntlrPsiNode {
    public ServiceNode(@NotNull ASTNode node) {
        super(node);
    }

}
