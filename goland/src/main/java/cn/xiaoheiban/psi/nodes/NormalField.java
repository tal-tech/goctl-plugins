package cn.xiaoheiban.psi.nodes;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class NormalField extends AntlrPsiNode {
    public NormalField(@NotNull ASTNode node) {
        super(node);
    }

    public String getFieldName() {
        return getFieldNode().getText();
    }

    public PsiElement getFieldNode() {
        return this.getFirstChild();
    }
}
