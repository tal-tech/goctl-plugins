package cn.xiaoheiban.psi;

import cn.xiaoheiban.antlr4.ApiParser;
import cn.xiaoheiban.language.ApiFileType;
import cn.xiaoheiban.language.ApiLanguage;
import cn.xiaoheiban.psi.nodes.ApiRootNode;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.fileChooser.FileElement;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.jetbrains.adapter.lexer.RuleIElementType;
import org.antlr.jetbrains.adapter.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ApiFile extends PsiFileBase {

    public ApiFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, ApiLanguage.INSTANCE);
    }

    @Override
    public ScopeNode getContext() {
        return null;
    }

    @Override
    public String toString() {
        return "Api File";
    }

    public static List<ASTNode> findChildren(PsiElement element, IElementType elementType) {
        if (element == null) {
            return null;
        }
        PsiElement[] children = element.getChildren();
        if (children == null) {
            return null;
        }
        List<ASTNode> list = new ArrayList<>();
        for (PsiElement el : children) {
            ASTNode node = el.getNode();
            if (node == null) {
                continue;
            }
            IElementType et = node.getElementType();
            if (et.equals(elementType)) {
                list.add(node);
            }
            List<ASTNode> astNodes = findChildren(el, elementType);
            list.addAll(astNodes);
        }
        return list;
    }

    public static ASTNode findChild(PsiElement element, IElementType elementType) {
        if (element == null) {
            return null;
        }
        PsiElement[] children = element.getChildren();
        if (children == null) {
            return null;
        }
        List<ASTNode> list = new ArrayList<>();
        for (PsiElement el : children) {
            ASTNode node = el.getNode();
            if (node == null) {
                continue;
            }
            IElementType et = node.getElementType();
            if (et.equals(elementType)) {
                list.add(node);
            }
            List<ASTNode> astNodes = findChildren(el, elementType);
            list.addAll(astNodes);
        }
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    public static ApiRootNode getRoot(PsiElement element) {
        while (true) {
            if (element == null) {
                return null;
            }
            if (element instanceof  ApiFile){
                return new ApiRootNode(element.getFirstChild().getNode());
            }
            ASTNode node = element.getNode();
            if (node == null) {
                return null;
            }
            IElementType elementType = node.getElementType();
            if (elementType instanceof RuleIElementType) {
                RuleIElementType ruleElType = (RuleIElementType) elementType;
                int ruleIndex = ruleElType.getRuleIndex();
                if (ruleIndex == ApiParser.RULE_api) {
                    return new ApiRootNode(node);
                }
            }
            element = element.getParent();
        }
    }

    @Override
    public @NotNull FileType getFileType() {
        return ApiFileType.INSTANCE;
    }
}
