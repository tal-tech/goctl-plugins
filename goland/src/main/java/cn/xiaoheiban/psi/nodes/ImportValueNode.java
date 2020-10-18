package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.parser.ImportValueManager;
import com.intellij.lang.ASTNode;
import org.antlr.jetbrains.adapter.psi.AntlrPsiNode;
import org.jetbrains.annotations.NotNull;

public class ImportValueNode extends AntlrPsiNode {
    public ImportValueNode(@NotNull ASTNode node) {
        super(node);
        ImportValueManager.getInstance().add(this);
    }

    public String getImportName() {
        return this.getText();
    }

}
