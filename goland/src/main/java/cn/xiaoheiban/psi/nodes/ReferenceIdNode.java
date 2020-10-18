package cn.xiaoheiban.psi.nodes;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class ReferenceIdNode extends AntlrPsiNode {
    public ReferenceIdNode(@NotNull ASTNode node) {
        super(node);
    }

}
