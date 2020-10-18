package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.HandlerValueManager;
import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class HandlerValueNode extends AntlrPsiNode {
    public HandlerValueNode(@NotNull ASTNode node) {
        super(node);
        HandlerValueManager.getInstance().add(this);
    }

    public String getHandlerName() {
        return this.getText();
    }

}
