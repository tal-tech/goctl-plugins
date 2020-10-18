package cn.xiaoheiban.language;

import cn.xiaoheiban.highlighting.ApiSyntaxHighlighter;
import cn.xiaoheiban.parser.HandlerValueManager;
import cn.xiaoheiban.parser.ImportValueManager;
import cn.xiaoheiban.parser.RouteManager;
import cn.xiaoheiban.parser.StructManager;
import cn.xiaoheiban.psi.nodes.*;
import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.apache.commons.collections.map.HashedMap;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public class ApiAnnotator implements Annotator {
    public static final Map<String, Set<PsiElement>> pathNodeMap = new HashedMap();
    public static final Map<String, Set<PsiElement>> handlerNodeMap = new HashedMap();


    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (element instanceof ApiRootNode) {
            Map<String, Set<ASTNode>> duplicateStruct = StructManager.getInstance().getDuplicate();
            duplicateStruct.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    holder.createErrorAnnotation(el, "struct " + s + " redeclare in this api");
                });
            });

            Map<String, Set<ASTNode>> duplicateImport = ImportValueManager.getInstance().getDuplicate();
            duplicateImport.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    holder.createErrorAnnotation(el, "import " + s + " redeclare in this api");
                });
            });

        } else if (element instanceof ServiceRouteNode) {
            Map<String, Set<ASTNode>> duplicateRoute = RouteManager.getInstance().getDuplicate();
            Map<String, Set<ASTNode>> duplicateHandler = HandlerValueManager.getInstance().getDuplicate();
            duplicateRoute.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    holder.createErrorAnnotation(el, "http route " + s + " redeclare in this api");
                });
            });
            duplicateHandler.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    holder.createErrorAnnotation(el, "handler " + s + " redeclare in this api");
                });
            });
        } else if (element instanceof StructNode) {
            StructNode node = (StructNode) element;
            Map<String, Set<PsiElement>> duplicateField = node.getDuplicateField();
            duplicateField.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    holder.createErrorAnnotation(el, "filed [" + s + "] redeclare in this struct");
                });
            });
        } else if (element instanceof ReferenceIdNode || element instanceof ServiceNameNode) {//RULE_referenceId
            holder.createInfoAnnotation(element, element.getText()).setTextAttributes(ApiSyntaxHighlighter.IDENTIFIER);
        }
    }

}
