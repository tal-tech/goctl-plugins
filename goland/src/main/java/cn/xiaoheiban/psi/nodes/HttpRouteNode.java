package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.RouteManager;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class HttpRouteNode extends IPsiNode {

    public HttpRouteNode(@NotNull ASTNode node) {
        super(node);
        RouteManager.getInstance().add(this);
    }


}
