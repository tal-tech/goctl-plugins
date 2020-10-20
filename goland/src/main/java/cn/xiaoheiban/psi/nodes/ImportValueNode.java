package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.ImportValueManager;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class ImportValueNode extends IPsiNode {
    public ImportValueNode(@NotNull ASTNode node) {
        super(node);
        ImportValueManager.getInstance().add(this);
    }

}
