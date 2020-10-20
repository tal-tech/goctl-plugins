package cn.xiaoheiban.language;

import cn.xiaoheiban.highlighting.ApiSyntaxHighlighter;
import cn.xiaoheiban.parser.HandlerValueManager;
import cn.xiaoheiban.parser.ImportValueManager;
import cn.xiaoheiban.parser.RouteManager;
import cn.xiaoheiban.parser.StructManager;
import cn.xiaoheiban.psi.nodes.*;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Set;

public class ApiAnnotator implements Annotator {

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof IPsiNode)) {
            return;
        }
        IPsiNode psi = (IPsiNode) element;
        String filename = psi.getFileName();
        if (element instanceof ApiRootNode) {
            Map<String, Set<IPsiNode>> duplicateStruct = StructManager.getInstance().getDuplicate();
            Map<String, Set<IPsiNode>> duplicateRoute = RouteManager.getInstance().getDuplicate();
            Map<String, Set<IPsiNode>> duplicateImport = ImportValueManager.getInstance().getDuplicate();
            Map<String, Set<IPsiNode>> duplicateHandler = HandlerValueManager.getInstance().getDuplicate();

            duplicateStruct.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    if (!filename.equals(el.getFileName())) {
                        return;
                    }
                    holder.createErrorAnnotation(el, "struct " + el.getName() + " redeclare in this api");
                });
            });


            duplicateImport.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    if (!filename.equals(el.getFileName())) {
                        return;
                    }
                    holder.createErrorAnnotation(el, "import " + el.getName() + " redeclare in this api");
                });
            });
            duplicateRoute.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    if (!filename.equals(el.getFileName())) {
                        return;
                    }
                    holder.createErrorAnnotation(el, "http route " + el.getName() + " redeclare in this api");
                });
            });
            duplicateHandler.forEach((s, psiElements) -> {
                if (psiElements == null || s == null) return;
                psiElements.forEach(el -> {
                    if (el == null) return;
                    if (!filename.equals(el.getFileName())) {
                        return;
                    }
                    holder.createErrorAnnotation(el, "handler " + el.getName() + " redeclare in this api");
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
        } else if (element instanceof ServiceNameNode) {
            holder.createInfoAnnotation(element, element.getText()).setTextAttributes(ApiSyntaxHighlighter.IDENTIFIER);
        } else if (element instanceof ReferenceIdNode) {//RULE_referenceId
            if (StructManager.getInstance().contains(psi)) {
                holder.createInfoAnnotation(element, element.getText()).setTextAttributes(ApiSyntaxHighlighter.IDENTIFIER);
                return;
            }
            holder.createErrorAnnotation(element, "can not resolve " + psi.getName());
        }
    }

}
