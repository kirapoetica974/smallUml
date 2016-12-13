/*
 * generated by Xtext 2.10.0
 */
grammar InternalSmallUML;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.smalluml.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.smalluml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.smalluml.services.SmallUMLGrammarAccess;

}
@parser::members {
	private SmallUMLGrammarAccess grammarAccess;

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleClasse
entryRuleClasse
:
{ before(grammarAccess.getClasseRule()); }
	 ruleClasse
{ after(grammarAccess.getClasseRule()); } 
	 EOF 
;

// Rule Classe
ruleClasse 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClasseAccess().getGroup()); }
		(rule__Classe__Group__0)
		{ after(grammarAccess.getClasseAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribut
entryRuleAttribut
:
{ before(grammarAccess.getAttributRule()); }
	 ruleAttribut
{ after(grammarAccess.getAttributRule()); } 
	 EOF 
;

// Rule Attribut
ruleAttribut 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributAccess().getGroup()); }
		(rule__Attribut__Group__0)
		{ after(grammarAccess.getAttributAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMethode
entryRuleMethode
:
{ before(grammarAccess.getMethodeRule()); }
	 ruleMethode
{ after(grammarAccess.getMethodeRule()); } 
	 EOF 
;

// Rule Methode
ruleMethode 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMethodeAccess().getGroup()); }
		(rule__Methode__Group__0)
		{ after(grammarAccess.getMethodeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleElement
entryRuleElement
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getElementAccess().getNomElementAssignment()); }
		(rule__Element__NomElementAssignment)
		{ after(grammarAccess.getElementAccess().getNomElementAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCardinalite
entryRuleCardinalite
:
{ before(grammarAccess.getCardinaliteRule()); }
	 ruleCardinalite
{ after(grammarAccess.getCardinaliteRule()); } 
	 EOF 
;

// Rule Cardinalite
ruleCardinalite 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCardinaliteAccess().getGroup()); }
		(rule__Cardinalite__Group__0)
		{ after(grammarAccess.getCardinaliteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeDonnee
entryRuleTypeDonnee
:
{ before(grammarAccess.getTypeDonneeRule()); }
	 ruleTypeDonnee
{ after(grammarAccess.getTypeDonneeRule()); } 
	 EOF 
;

// Rule TypeDonnee
ruleTypeDonnee 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeDonneeAccess().getGroup()); }
		(rule__TypeDonnee__Group__0)
		{ after(grammarAccess.getTypeDonneeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumeration
entryRuleEnumeration
:
{ before(grammarAccess.getEnumerationRule()); }
	 ruleEnumeration
{ after(grammarAccess.getEnumerationRule()); } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationAccess().getGroup()); }
		(rule__Enumeration__Group__0)
		{ after(grammarAccess.getEnumerationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChaine
entryRuleChaine
:
{ before(grammarAccess.getChaineRule()); }
	 ruleChaine
{ after(grammarAccess.getChaineRule()); } 
	 EOF 
;

// Rule Chaine
ruleChaine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChaineAccess().getNomTypeAssignment()); }
		(rule__Chaine__NomTypeAssignment)
		{ after(grammarAccess.getChaineAccess().getNomTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntier
entryRuleEntier
:
{ before(grammarAccess.getEntierRule()); }
	 ruleEntier
{ after(grammarAccess.getEntierRule()); } 
	 EOF 
;

// Rule Entier
ruleEntier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntierAccess().getNomTypeAssignment()); }
		(rule__Entier__NomTypeAssignment)
		{ after(grammarAccess.getEntierAccess().getNomTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleen
entryRuleBooleen
:
{ before(grammarAccess.getBooleenRule()); }
	 ruleBooleen
{ after(grammarAccess.getBooleenRule()); } 
	 EOF 
;

// Rule Booleen
ruleBooleen 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleenAccess().getNomTypeAssignment()); }
		(rule__Booleen__NomTypeAssignment)
		{ after(grammarAccess.getBooleenAccess().getNomTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__0__Impl
	rule__Classe__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getClasseKeyword_0()); }
	'Classe'
	{ after(grammarAccess.getClasseAccess().getClasseKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__1__Impl
	rule__Classe__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getNomClasseAssignment_1()); }
	(rule__Classe__NomClasseAssignment_1)
	{ after(grammarAccess.getClasseAccess().getNomClasseAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__2__Impl
	rule__Classe__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__3__Impl
	rule__Classe__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getAttributsKeyword_3()); }
	'Attributs'
	{ after(grammarAccess.getClasseAccess().getAttributsKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__4__Impl
	rule__Classe__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__5__Impl
	rule__Classe__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getAttributsAssignment_5()); }
	(rule__Classe__AttributsAssignment_5)*
	{ after(grammarAccess.getClasseAccess().getAttributsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__6__Impl
	rule__Classe__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__7__Impl
	rule__Classe__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getMethodesKeyword_7()); }
	'Methodes'
	{ after(grammarAccess.getClasseAccess().getMethodesKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__8__Impl
	rule__Classe__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_8()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__9__Impl
	rule__Classe__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getMethodesAssignment_9()); }
	(rule__Classe__MethodesAssignment_9)*
	{ after(grammarAccess.getClasseAccess().getMethodesAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__10__Impl
	rule__Classe__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__11__Impl
	rule__Classe__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getCardinalitesKeyword_11()); }
	'Cardinalites'
	{ after(grammarAccess.getClasseAccess().getCardinalitesKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__12__Impl
	rule__Classe__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_12()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__13__Impl
	rule__Classe__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getCardinalitesAssignment_13()); }
	(rule__Classe__CardinalitesAssignment_13)*
	{ after(grammarAccess.getClasseAccess().getCardinalitesAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__14__Impl
	rule__Classe__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_14()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__15__Impl
	rule__Classe__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getSousClassesKeyword_15()); }
	'Sous-Classes'
	{ after(grammarAccess.getClasseAccess().getSousClassesKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__16__Impl
	rule__Classe__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_16()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__17__Impl
	rule__Classe__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getSousClassesAssignment_17()); }
	(rule__Classe__SousClassesAssignment_17)*
	{ after(grammarAccess.getClasseAccess().getSousClassesAssignment_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__18__Impl
	rule__Classe__Group__19
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_18()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__19
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__19__Impl
	rule__Classe__Group__20
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__19__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getSuperClasseKeyword_19()); }
	'Super-Classe'
	{ after(grammarAccess.getClasseAccess().getSuperClasseKeyword_19()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__20
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__20__Impl
	rule__Classe__Group__21
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__20__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_20()); }
	'{'
	{ after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_20()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__21
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__21__Impl
	rule__Classe__Group__22
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__21__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getSuperClasseAssignment_21()); }
	(rule__Classe__SuperClasseAssignment_21)
	{ after(grammarAccess.getClasseAccess().getSuperClasseAssignment_21()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__22
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__22__Impl
	rule__Classe__Group__23
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__22__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_22()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_22()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__23
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Classe__Group__23__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__Group__23__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_23()); }
	'}'
	{ after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_23()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribut__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__0__Impl
	rule__Attribut__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getAttributKeyword_0()); }
	'Attribut'
	{ after(grammarAccess.getAttributAccess().getAttributKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__1__Impl
	rule__Attribut__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__2__Impl
	rule__Attribut__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getNomAttributAssignment_2()); }
	(rule__Attribut__NomAttributAssignment_2)
	{ after(grammarAccess.getAttributAccess().getNomAttributAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__3__Impl
	rule__Attribut__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getTypeAssignment_3()); }
	(rule__Attribut__TypeAssignment_3)
	{ after(grammarAccess.getAttributAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribut__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Methode__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__0__Impl
	rule__Methode__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); }
	'Methode'
	{ after(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__1__Impl
	rule__Methode__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__2__Impl
	rule__Methode__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getTypeDeRetourAssignment_2()); }
	(rule__Methode__TypeDeRetourAssignment_2)
	{ after(grammarAccess.getMethodeAccess().getTypeDeRetourAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__3__Impl
	rule__Methode__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getNomMethodeAssignment_3()); }
	(rule__Methode__NomMethodeAssignment_3)
	{ after(grammarAccess.getMethodeAccess().getNomMethodeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__4__Impl
	rule__Methode__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__5__Impl
	rule__Methode__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getParametresAssignment_5()); }
	(rule__Methode__ParametresAssignment_5)*
	{ after(grammarAccess.getMethodeAccess().getParametresAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__6__Impl
	rule__Methode__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Methode__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinalite__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinalite__Group__0__Impl
	rule__Cardinalite__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinalite__Group__1__Impl
	rule__Cardinalite__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinaliteAccess().getMultipliciteAssignment_1()); }
	(rule__Cardinalite__MultipliciteAssignment_1)
	{ after(grammarAccess.getCardinaliteAccess().getMultipliciteAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinalite__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_2()); }
	']'
	{ after(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeDonnee__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDonnee__Group__0__Impl
	rule__TypeDonnee__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_0()); }
	'TypeDonnee'
	{ after(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDonnee__Group__1__Impl
	rule__TypeDonnee__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDonneeAccess().getNomTypeAssignment_1()); }
	(rule__TypeDonnee__NomTypeAssignment_1)
	{ after(grammarAccess.getTypeDonneeAccess().getNomTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDonnee__Group__2__Impl
	rule__TypeDonnee__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDonnee__Group__3__Impl
	rule__TypeDonnee__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_3()); }
	(rule__TypeDonnee__AttributsAssignment_3)*
	{ after(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeDonnee__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__0__Impl
	rule__Enumeration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); }
	'Enumeration'
	{ after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__1__Impl
	rule__Enumeration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getNomEnumerationAssignment_1()); }
	(rule__Enumeration__NomEnumerationAssignment_1)
	{ after(grammarAccess.getEnumerationAccess().getNomEnumerationAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__2__Impl
	rule__Enumeration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__3__Impl
	rule__Enumeration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getElementsAssignment_3()); }
	(rule__Enumeration__ElementsAssignment_3)*
	{ after(grammarAccess.getEnumerationAccess().getElementsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Classe__NomClasseAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getNomClasseEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getClasseAccess().getNomClasseEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__AttributsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_5_0()); }
		ruleAttribut
		{ after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__MethodesAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_9_0()); }
		ruleMethode
		{ after(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__CardinalitesAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_13_0()); }
		ruleCardinalite
		{ after(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__SousClassesAssignment_17
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_17_0()); }
		ruleClasse
		{ after(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_17_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Classe__SuperClasseAssignment_21
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_21_0()); }
		(
			{ before(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_21_0_1()); }
			RULE_ID
			{ after(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_21_0_1()); }
		)
		{ after(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_21_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__NomAttributAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getNomAttributEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getAttributAccess().getNomAttributEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribut__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributAccess().getTypeTypeCrossReference_3_0()); }
		(
			{ before(grammarAccess.getAttributAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAttributAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getAttributAccess().getTypeTypeCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__TypeDeRetourAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getTypeDeRetourTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getMethodeAccess().getTypeDeRetourTypeIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getMethodeAccess().getTypeDeRetourTypeIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getMethodeAccess().getTypeDeRetourTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__NomMethodeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getNomMethodeEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getMethodeAccess().getNomMethodeEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Methode__ParametresAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0()); }
		ruleAttribut
		{ after(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Element__NomElementAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getElementAccess().getNomElementEStringParserRuleCall_0()); }
		ruleEString
		{ after(grammarAccess.getElementAccess().getNomElementEStringParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinalite__MultipliciteAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinaliteAccess().getMultipliciteEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getCardinaliteAccess().getMultipliciteEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__NomTypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDonneeAccess().getNomTypeEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getTypeDonneeAccess().getNomTypeEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeDonnee__AttributsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_3_0()); }
		ruleAttribut
		{ after(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__NomEnumerationAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getNomEnumerationEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getEnumerationAccess().getNomEnumerationEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__ElementsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_3_0()); }
		ruleElement
		{ after(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Chaine__NomTypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); }
		(
			{ before(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); }
			'Chaine'
			{ after(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); }
		)
		{ after(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entier__NomTypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); }
		(
			{ before(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); }
			'Entier'
			{ after(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); }
		)
		{ after(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Booleen__NomTypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); }
		(
			{ before(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); }
			'Booleen'
			{ after(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); }
		)
		{ after(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
