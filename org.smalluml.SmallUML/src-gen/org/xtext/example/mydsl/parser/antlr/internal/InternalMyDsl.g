/*
 * generated by Xtext 2.10.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Package";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	iv_rulePackage=rulePackage
	{ $current=$iv_rulePackage.current; }
	EOF;

// Rule Package
rulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPackageAccess().getPackageAction_0(),
					$current);
			}
		)
		otherlv_1='Package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageElementPackageParserRuleCall_4_0());
				}
				lv_elementsPackage_4_0=ruleElementPackage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageRule());
					}
					add(
						$current,
						"elementsPackage",
						lv_elementsPackage_4_0,
						"org.xtext.example.mydsl.MyDsl.ElementPackage");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleElementPackage
entryRuleElementPackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementPackageRule()); }
	iv_ruleElementPackage=ruleElementPackage
	{ $current=$iv_ruleElementPackage.current; }
	EOF;

// Rule ElementPackage
ruleElementPackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getElementPackageAccess().getClasseParserRuleCall_0());
		}
		this_Classe_0=ruleClasse
		{
			$current = $this_Classe_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementPackageAccess().getAssociationParserRuleCall_1());
		}
		this_Association_1=ruleAssociation
		{
			$current = $this_Association_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementPackageAccess().getEnumerationParserRuleCall_2());
		}
		this_Enumeration_2=ruleEnumeration
		{
			$current = $this_Enumeration_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementPackageAccess().getTypeDonneeParserRuleCall_3());
		}
		this_TypeDonnee_3=ruleTypeDonnee
		{
			$current = $this_TypeDonnee_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClasse
entryRuleClasse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClasseRule()); }
	iv_ruleClasse=ruleClasse
	{ $current=$iv_ruleClasse.current; }
	EOF;

// Rule Classe
ruleClasse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClasseAccess().getClasseAction_0(),
					$current);
			}
		)
		otherlv_1='Classe'
		{
			newLeafNode(otherlv_1, grammarAccess.getClasseAccess().getClasseKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClasseAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClasseRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_4_0_0());
					}
					lv_attributs_4_0=ruleAttribut
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClasseRule());
						}
						add(
							$current,
							"attributs",
							lv_attributs_4_0,
							"org.xtext.example.mydsl.MyDsl.Attribut");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_4_1_0());
					}
					lv_cardinalites_5_0=ruleCardinalite
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClasseRule());
						}
						add(
							$current,
							"cardinalites",
							lv_cardinalites_5_0,
							"org.xtext.example.mydsl.MyDsl.Cardinalite");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_6='Sous-Classe'
				{
					newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getSousClasseKeyword_4_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_4_2_1_0());
						}
						lv_sousClasses_7_0=ruleClasse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClasseRule());
							}
							add(
								$current,
								"sousClasses",
								lv_sousClasses_7_0,
								"org.xtext.example.mydsl.MyDsl.Classe");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_4_3_0());
					}
					lv_methodes_8_0=ruleMethode
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClasseRule());
						}
						add(
							$current,
							"methodes",
							lv_methodes_8_0,
							"org.xtext.example.mydsl.MyDsl.Methode");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			otherlv_9='Super-Classe'
			{
				newLeafNode(otherlv_9, grammarAccess.getClasseAccess().getSuperClasseKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClasseRule());
						}
					}
					otherlv_10=RULE_ID
					{
						newLeafNode(otherlv_10, grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_5_1_0());
					}
				)
			)
		)?
		otherlv_11='Abstraite='
		{
			newLeafNode(otherlv_11, grammarAccess.getClasseAccess().getAbstraiteKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClasseAccess().getClasseAbstraiteEBooleanParserRuleCall_7_0());
				}
				lv_classeAbstraite_12_0=ruleEBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClasseRule());
					}
					set(
						$current,
						"classeAbstraite",
						true,
						"org.xtext.example.mydsl.MyDsl.EBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleAttribut
entryRuleAttribut returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributRule()); }
	iv_ruleAttribut=ruleAttribut
	{ $current=$iv_ruleAttribut.current; }
	EOF;

// Rule Attribut
ruleAttribut returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Attribut'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_1_0());
				}
				lv_type_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.xtext.example.mydsl.MyDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMethode
entryRuleMethode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodeRule()); }
	iv_ruleMethode=ruleMethode
	{ $current=$iv_ruleMethode.current; }
	EOF;

// Rule Methode
ruleMethode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMethodeAccess().getMethodeAction_0(),
					$current);
			}
		)
		otherlv_1='Methode'
		{
			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getMethodeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodeAccess().getTypeDeRetourTypeParserRuleCall_2_0());
				}
				lv_typeDeRetour_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodeRule());
					}
					set(
						$current,
						"typeDeRetour",
						lv_typeDeRetour_2_0,
						"org.xtext.example.mydsl.MyDsl.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodeAccess().getNomEStringParserRuleCall_3_0());
				}
				lv_nom_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodeRule());
					}
					set(
						$current,
						"nom",
						lv_nom_3_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0());
				}
				lv_parametres_5_0=ruleAttribut
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodeRule());
					}
					add(
						$current,
						"parametres",
						lv_parametres_5_0,
						"org.xtext.example.mydsl.MyDsl.Attribut");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='Abstraite='
		{
			newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getAbstraiteKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMethodeAccess().getMethodeAbstraiteEBooleanParserRuleCall_8_0());
				}
				lv_methodeAbstraite_8_0=ruleEBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMethodeRule());
					}
					set(
						$current,
						"methodeAbstraite",
						true,
						"org.xtext.example.mydsl.MyDsl.EBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAssociationAccess().getAssociationAction_0(),
					$current);
			}
		)
		otherlv_1='Association'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_4_0());
				}
				lv_cardinalites_4_0=ruleCardinalite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					add(
						$current,
						"cardinalites",
						lv_cardinalites_4_0,
						"org.xtext.example.mydsl.MyDsl.Cardinalite");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_5_0());
				}
				lv_cardinalites_5_0=ruleCardinalite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					add(
						$current,
						"cardinalites",
						lv_cardinalites_5_0,
						"org.xtext.example.mydsl.MyDsl.Cardinalite");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getChaineParserRuleCall_0());
		}
		this_Chaine_0=ruleChaine
		{
			$current = $this_Chaine_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getBooleenParserRuleCall_1());
		}
		this_Booleen_1=ruleBooleen
		{
			$current = $this_Booleen_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEntierParserRuleCall_2());
		}
		this_Entier_2=ruleEntier
		{
			$current = $this_Entier_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getTypeDonneeParserRuleCall_3());
		}
		this_TypeDonnee_3=ruleTypeDonnee
		{
			$current = $this_TypeDonnee_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_4());
		}
		this_Enumeration_4=ruleEnumeration
		{
			$current = $this_Enumeration_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getElementAccess().getNomEStringParserRuleCall_0());
			}
			lv_nom_0_0=ruleEString
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getElementRule());
				}
				set(
					$current,
					"nom",
					lv_nom_0_0,
					"org.xtext.example.mydsl.MyDsl.EString");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCardinalite
entryRuleCardinalite returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinaliteRule()); }
	iv_ruleCardinalite=ruleCardinalite
	{ $current=$iv_ruleCardinalite.current; }
	EOF;

// Rule Cardinalite
ruleCardinalite returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Role'
		{
			newLeafNode(otherlv_0, grammarAccess.getCardinaliteAccess().getRoleKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinaliteAccess().getNomEStringParserRuleCall_1_0());
				}
				lv_nom_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinaliteRule());
					}
					set(
						$current,
						"nom",
						lv_nom_1_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinaliteAccess().getMultipliciteInfEIntParserRuleCall_3_0());
				}
				lv_multipliciteInf_3_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinaliteRule());
					}
					set(
						$current,
						"multipliciteInf",
						lv_multipliciteInf_3_0,
						"org.xtext.example.mydsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='..'
		{
			newLeafNode(otherlv_4, grammarAccess.getCardinaliteAccess().getFullStopFullStopKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinaliteAccess().getMultipliciteSupEIntParserRuleCall_5_0());
				}
				lv_multipliciteSup_5_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinaliteRule());
					}
					set(
						$current,
						"multipliciteSup",
						lv_multipliciteSup_5_0,
						"org.xtext.example.mydsl.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleTypeDonnee
entryRuleTypeDonnee returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDonneeRule()); }
	iv_ruleTypeDonnee=ruleTypeDonnee
	{ $current=$iv_ruleTypeDonnee.current; }
	EOF;

// Rule TypeDonnee
ruleTypeDonnee returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTypeDonneeAccess().getTypeDonneeAction_0(),
					$current);
			}
		)
		otherlv_1='TypeDonnee'
		{
			newLeafNode(otherlv_1, grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeDonneeAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_4_0());
				}
				lv_attributs_4_0=ruleAttribut
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
					}
					add(
						$current,
						"attributs",
						lv_attributs_4_0,
						"org.xtext.example.mydsl.MyDsl.Attribut");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
					$current);
			}
		)
		otherlv_1='Enumeration'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getNomEStringParserRuleCall_2_0());
				}
				lv_nom_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					set(
						$current,
						"nom",
						lv_nom_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_4_0());
				}
				lv_elements_4_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"elements",
						lv_elements_4_0,
						"org.xtext.example.mydsl.MyDsl.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleChaine
entryRuleChaine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChaineRule()); }
	iv_ruleChaine=ruleChaine
	{ $current=$iv_ruleChaine.current; }
	EOF;

// Rule Chaine
ruleChaine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getChaineAccess().getChaineAction_0(),
					$current);
			}
		)
		otherlv_1='Chaine'
		{
			newLeafNode(otherlv_1, grammarAccess.getChaineAccess().getChaineKeyword_1());
		}
	)
;

// Entry rule entryRuleEntier
entryRuleEntier returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntierRule()); }
	iv_ruleEntier=ruleEntier
	{ $current=$iv_ruleEntier.current; }
	EOF;

// Rule Entier
ruleEntier returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getEntierAccess().getEntierAction_0(),
					$current);
			}
		)
		otherlv_1='Entier'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntierAccess().getEntierKeyword_1());
		}
	)
;

// Entry rule entryRuleBooleen
entryRuleBooleen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleenRule()); }
	iv_ruleBooleen=ruleBooleen
	{ $current=$iv_ruleBooleen.current; }
	EOF;

// Rule Booleen
ruleBooleen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleenAccess().getBooleenAction_0(),
					$current);
			}
		)
		otherlv_1='Booleen'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleenAccess().getBooleenKeyword_1());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEBoolean
entryRuleEBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBooleanRule()); }
	iv_ruleEBoolean=ruleEBoolean
	{ $current=$iv_ruleEBoolean.current.getText(); }
	EOF;

// Rule EBoolean
ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='Vrai'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getVraiKeyword_0());
		}
		    |
		kw='Faux'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFauxKeyword_1());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
