package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.HandlerValueManager;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class HandlerValueNode extends IPsiNode {
    public HandlerValueNode(@NotNull ASTNode node) {
        super(node);
        HandlerValueManager.getInstance().add(this);
    }

}
