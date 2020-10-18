package cn.xiaoheiban.psi.nodes;

import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class TagNode extends AntlrPsiNode {
    public TagNode(@NotNull ASTNode node) {
        super(node);
    }
}
