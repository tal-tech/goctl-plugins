package cn.xiaoheiban.psi.nodes;

import cn.xiaoheiban.antlr4.ApiParser;
import cn.xiaoheiban.parser.ApiParserDefinition;
import cn.xiaoheiban.psi.ApiFile;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.jetbrains.adapter.SymtabUtils;
import org.antlr.jetbrains.adapter.psi.ScopeNode;
import org.apache.commons.collections.map.HashedMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApiRootNode extends IPsiNode implements ScopeNode {

    public ApiRootNode(@NotNull ASTNode node) {
        super(node);
    }

    public Map<String, Set<StructNameNode>> getAllStructMap() {
        Map<String, Set<StructNameNode>> ret = new HashedMap();
        List<ASTNode> structs = ApiFile.findChildren(this, ApiParserDefinition.rule(ApiParser.RULE_structType));
        List<ASTNode> alias = ApiFile.findChildren(this, ApiParserDefinition.rule(ApiParser.RULE_typeAlias));
        List<ASTNode> groupAlias = ApiFile.findChildren(this, ApiParserDefinition.rule(ApiParser.RULE_typeGroupAlias));
        Set<ASTNode> children = new HashSet<>();
        children.addAll(structs);
        children.addAll(alias);
        children.addAll(groupAlias);
        for (ASTNode node : children) {
            ASTNode childByType = node.findChildByType(ApiParserDefinition.rule(ApiParser.RULE_structNameId));
            if (childByType == null) {
                continue;
            }
            String text = childByType.getText();
            StructNameNode structNameNode = new StructNameNode(node);
            Set<StructNameNode> nodeSet = ret.get(text);
            if (nodeSet == null) {
                nodeSet = new HashSet<>();
            }
            nodeSet.add(structNameNode);
            ret.put(text, nodeSet);
        }
        return ret;
    }


    @Override
    public @Nullable PsiElement resolve(PsiNamedElement element) {
        PsiElement psiElement = SymtabUtils.resolve(this, ApiParserDefinition.ELEMENT_FACTORY, element, "/api/typeStatement/typeSingleSpec/typeAlias/structNameId/IDENT");
        if (psiElement != null) {
            return psiElement;
        }
        psiElement = SymtabUtils.resolve(this, ApiParserDefinition.ELEMENT_FACTORY, element, "/api/typeStatement/typeSingleSpec/typeStruct/structType/structNameId/IDENT");
        if (psiElement != null) {
            return psiElement;
        }
        psiElement = SymtabUtils.resolve(this, ApiParserDefinition.ELEMENT_FACTORY, element, "/api/typeStatement/typeGroupSpec/typeGroupBody/typeGroupAlias/structNameId/IDENT");
        if (psiElement != null) {
            return psiElement;
        }

        psiElement = SymtabUtils.resolve(this, ApiParserDefinition.ELEMENT_FACTORY, element, "/api/typeStatement/typeGroupSpec/typeGroupBody/structType/structNameId/IDENT");
        return psiElement;
    }
}
