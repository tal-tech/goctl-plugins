package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.RouteManager;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class HttpRouteNode extends AntlrPsiNode {

    public HttpRouteNode(@NotNull ASTNode node) {
        super(node);
        RouteManager.getInstance().add(this);
    }

    @Override
    public String getName() {
        return getText().replaceAll(" ", "");
    }
}
