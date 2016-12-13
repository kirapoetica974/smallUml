package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Classe'", "'{'", "'Attributs'", "'}'", "'Methodes'", "'Cardinalites'", "'Sous-Classes'", "'Super-Classe'", "'Attribut'", "'Methode'", "'('", "')'", "'['", "']'", "'TypeDonnee'", "'Enumeration'", "'Chaine'", "'Entier'", "'Booleen'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }



     	private SmallUMLGrammarAccess grammarAccess;

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Classe";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleClasse"
    // InternalSmallUML.g:64:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalSmallUML.g:64:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalSmallUML.g:65:2: iv_ruleClasse= ruleClasse EOF
            {
             newCompositeNode(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClasse=ruleClasse();

            state._fsp--;

             current =iv_ruleClasse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalSmallUML.g:71:1: ruleClasse returns [EObject current=null] : (otherlv_0= 'Classe' ( (lv_nomClasse_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Attributs' otherlv_4= '{' ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= '}' otherlv_7= 'Methodes' otherlv_8= '{' ( (lv_methodes_9_0= ruleMethode ) )* otherlv_10= '}' otherlv_11= 'Cardinalites' otherlv_12= '{' ( (lv_cardinalites_13_0= ruleCardinalite ) )* otherlv_14= '}' otherlv_15= 'Sous-Classes' otherlv_16= '{' ( (lv_sousClasses_17_0= ruleClasse ) )* otherlv_18= '}' otherlv_19= 'Super-Classe' otherlv_20= '{' ( (otherlv_21= RULE_ID ) ) otherlv_22= '}' otherlv_23= '}' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_nomClasse_1_0 = null;

        EObject lv_attributs_5_0 = null;

        EObject lv_methodes_9_0 = null;

        EObject lv_cardinalites_13_0 = null;

        EObject lv_sousClasses_17_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( (otherlv_0= 'Classe' ( (lv_nomClasse_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Attributs' otherlv_4= '{' ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= '}' otherlv_7= 'Methodes' otherlv_8= '{' ( (lv_methodes_9_0= ruleMethode ) )* otherlv_10= '}' otherlv_11= 'Cardinalites' otherlv_12= '{' ( (lv_cardinalites_13_0= ruleCardinalite ) )* otherlv_14= '}' otherlv_15= 'Sous-Classes' otherlv_16= '{' ( (lv_sousClasses_17_0= ruleClasse ) )* otherlv_18= '}' otherlv_19= 'Super-Classe' otherlv_20= '{' ( (otherlv_21= RULE_ID ) ) otherlv_22= '}' otherlv_23= '}' ) )
            // InternalSmallUML.g:78:2: (otherlv_0= 'Classe' ( (lv_nomClasse_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Attributs' otherlv_4= '{' ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= '}' otherlv_7= 'Methodes' otherlv_8= '{' ( (lv_methodes_9_0= ruleMethode ) )* otherlv_10= '}' otherlv_11= 'Cardinalites' otherlv_12= '{' ( (lv_cardinalites_13_0= ruleCardinalite ) )* otherlv_14= '}' otherlv_15= 'Sous-Classes' otherlv_16= '{' ( (lv_sousClasses_17_0= ruleClasse ) )* otherlv_18= '}' otherlv_19= 'Super-Classe' otherlv_20= '{' ( (otherlv_21= RULE_ID ) ) otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalSmallUML.g:78:2: (otherlv_0= 'Classe' ( (lv_nomClasse_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Attributs' otherlv_4= '{' ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= '}' otherlv_7= 'Methodes' otherlv_8= '{' ( (lv_methodes_9_0= ruleMethode ) )* otherlv_10= '}' otherlv_11= 'Cardinalites' otherlv_12= '{' ( (lv_cardinalites_13_0= ruleCardinalite ) )* otherlv_14= '}' otherlv_15= 'Sous-Classes' otherlv_16= '{' ( (lv_sousClasses_17_0= ruleClasse ) )* otherlv_18= '}' otherlv_19= 'Super-Classe' otherlv_20= '{' ( (otherlv_21= RULE_ID ) ) otherlv_22= '}' otherlv_23= '}' )
            // InternalSmallUML.g:79:3: otherlv_0= 'Classe' ( (lv_nomClasse_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Attributs' otherlv_4= '{' ( (lv_attributs_5_0= ruleAttribut ) )* otherlv_6= '}' otherlv_7= 'Methodes' otherlv_8= '{' ( (lv_methodes_9_0= ruleMethode ) )* otherlv_10= '}' otherlv_11= 'Cardinalites' otherlv_12= '{' ( (lv_cardinalites_13_0= ruleCardinalite ) )* otherlv_14= '}' otherlv_15= 'Sous-Classes' otherlv_16= '{' ( (lv_sousClasses_17_0= ruleClasse ) )* otherlv_18= '}' otherlv_19= 'Super-Classe' otherlv_20= '{' ( (otherlv_21= RULE_ID ) ) otherlv_22= '}' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClasseKeyword_0());
            		
            // InternalSmallUML.g:83:3: ( (lv_nomClasse_1_0= ruleEString ) )
            // InternalSmallUML.g:84:4: (lv_nomClasse_1_0= ruleEString )
            {
            // InternalSmallUML.g:84:4: (lv_nomClasse_1_0= ruleEString )
            // InternalSmallUML.g:85:5: lv_nomClasse_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClasseAccess().getNomClasseEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nomClasse_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClasseRule());
            					}
            					set(
            						current,
            						"nomClasse",
            						lv_nomClasse_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getAttributsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:114:3: ( (lv_attributs_5_0= ruleAttribut ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSmallUML.g:115:4: (lv_attributs_5_0= ruleAttribut )
            	    {
            	    // InternalSmallUML.g:115:4: (lv_attributs_5_0= ruleAttribut )
            	    // InternalSmallUML.g:116:5: lv_attributs_5_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributs_5_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_5_0,
            	    						"org.smalluml.SmallUML.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getClasseAccess().getMethodesKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSmallUML.g:145:3: ( (lv_methodes_9_0= ruleMethode ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallUML.g:146:4: (lv_methodes_9_0= ruleMethode )
            	    {
            	    // InternalSmallUML.g:146:4: (lv_methodes_9_0= ruleMethode )
            	    // InternalSmallUML.g:147:5: lv_methodes_9_0= ruleMethode
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_methodes_9_0=ruleMethode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodes",
            	    						lv_methodes_9_0,
            	    						"org.smalluml.SmallUML.Methode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getClasseAccess().getCardinalitesKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalSmallUML.g:176:3: ( (lv_cardinalites_13_0= ruleCardinalite ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUML.g:177:4: (lv_cardinalites_13_0= ruleCardinalite )
            	    {
            	    // InternalSmallUML.g:177:4: (lv_cardinalites_13_0= ruleCardinalite )
            	    // InternalSmallUML.g:178:5: lv_cardinalites_13_0= ruleCardinalite
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_cardinalites_13_0=ruleCardinalite();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cardinalites",
            	    						lv_cardinalites_13_0,
            	    						"org.smalluml.SmallUML.Cardinalite");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_14=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getClasseAccess().getSousClassesKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSmallUML.g:207:3: ( (lv_sousClasses_17_0= ruleClasse ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmallUML.g:208:4: (lv_sousClasses_17_0= ruleClasse )
            	    {
            	    // InternalSmallUML.g:208:4: (lv_sousClasses_17_0= ruleClasse )
            	    // InternalSmallUML.g:209:5: lv_sousClasses_17_0= ruleClasse
            	    {

            	    					newCompositeNode(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_sousClasses_17_0=ruleClasse();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClasseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sousClasses",
            	    						lv_sousClasses_17_0,
            	    						"org.smalluml.SmallUML.Classe");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getClasseAccess().getSuperClasseKeyword_19());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_20, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_20());
            		
            // InternalSmallUML.g:238:3: ( (otherlv_21= RULE_ID ) )
            // InternalSmallUML.g:239:4: (otherlv_21= RULE_ID )
            {
            // InternalSmallUML.g:239:4: (otherlv_21= RULE_ID )
            // InternalSmallUML.g:240:5: otherlv_21= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClasseRule());
            					}
            				
            otherlv_21=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_21, grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_21_0());
            				

            }


            }

            otherlv_22=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_22, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_22());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalSmallUML.g:263:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalSmallUML.g:263:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalSmallUML.g:264:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalSmallUML.g:270:1: ruleAttribut returns [EObject current=null] : (otherlv_0= 'Attribut' otherlv_1= '{' ( (lv_nomAttribut_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nomAttribut_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:276:2: ( (otherlv_0= 'Attribut' otherlv_1= '{' ( (lv_nomAttribut_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' ) )
            // InternalSmallUML.g:277:2: (otherlv_0= 'Attribut' otherlv_1= '{' ( (lv_nomAttribut_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            {
            // InternalSmallUML.g:277:2: (otherlv_0= 'Attribut' otherlv_1= '{' ( (lv_nomAttribut_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '}' )
            // InternalSmallUML.g:278:3: otherlv_0= 'Attribut' otherlv_1= '{' ( (lv_nomAttribut_2_0= ruleEString ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSmallUML.g:286:3: ( (lv_nomAttribut_2_0= ruleEString ) )
            // InternalSmallUML.g:287:4: (lv_nomAttribut_2_0= ruleEString )
            {
            // InternalSmallUML.g:287:4: (lv_nomAttribut_2_0= ruleEString )
            // InternalSmallUML.g:288:5: lv_nomAttribut_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getNomAttributEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_nomAttribut_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"nomAttribut",
            						lv_nomAttribut_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:305:3: ( (otherlv_3= RULE_ID ) )
            // InternalSmallUML.g:306:4: (otherlv_3= RULE_ID )
            {
            // InternalSmallUML.g:306:4: (otherlv_3= RULE_ID )
            // InternalSmallUML.g:307:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributAccess().getTypeTypeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleMethode"
    // InternalSmallUML.g:326:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalSmallUML.g:326:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalSmallUML.g:327:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalSmallUML.g:333:1: ruleMethode returns [EObject current=null] : (otherlv_0= 'Methode' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_nomMethode_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= '}' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_nomMethode_3_0 = null;

        EObject lv_parametres_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:339:2: ( (otherlv_0= 'Methode' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_nomMethode_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= '}' ) )
            // InternalSmallUML.g:340:2: (otherlv_0= 'Methode' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_nomMethode_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= '}' )
            {
            // InternalSmallUML.g:340:2: (otherlv_0= 'Methode' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_nomMethode_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= '}' )
            // InternalSmallUML.g:341:3: otherlv_0= 'Methode' otherlv_1= '{' ( (otherlv_2= RULE_ID ) ) ( (lv_nomMethode_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodeAccess().getMethodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSmallUML.g:349:3: ( (otherlv_2= RULE_ID ) )
            // InternalSmallUML.g:350:4: (otherlv_2= RULE_ID )
            {
            // InternalSmallUML.g:350:4: (otherlv_2= RULE_ID )
            // InternalSmallUML.g:351:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getTypeDeRetourTypeCrossReference_2_0());
            				

            }


            }

            // InternalSmallUML.g:362:3: ( (lv_nomMethode_3_0= ruleEString ) )
            // InternalSmallUML.g:363:4: (lv_nomMethode_3_0= ruleEString )
            {
            // InternalSmallUML.g:363:4: (lv_nomMethode_3_0= ruleEString )
            // InternalSmallUML.g:364:5: lv_nomMethode_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getNomMethodeEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_nomMethode_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"nomMethode",
            						lv_nomMethode_3_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalSmallUML.g:385:3: ( (lv_parametres_5_0= ruleAttribut ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:386:4: (lv_parametres_5_0= ruleAttribut )
            	    {
            	    // InternalSmallUML.g:386:4: (lv_parametres_5_0= ruleAttribut )
            	    // InternalSmallUML.g:387:5: lv_parametres_5_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_parametres_5_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parametres",
            	    						lv_parametres_5_0,
            	    						"org.smalluml.SmallUML.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleElement"
    // InternalSmallUML.g:416:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSmallUML.g:416:48: (iv_ruleElement= ruleElement EOF )
            // InternalSmallUML.g:417:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSmallUML.g:423:1: ruleElement returns [EObject current=null] : ( (lv_nomElement_0_0= ruleEString ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nomElement_0_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:429:2: ( ( (lv_nomElement_0_0= ruleEString ) ) )
            // InternalSmallUML.g:430:2: ( (lv_nomElement_0_0= ruleEString ) )
            {
            // InternalSmallUML.g:430:2: ( (lv_nomElement_0_0= ruleEString ) )
            // InternalSmallUML.g:431:3: (lv_nomElement_0_0= ruleEString )
            {
            // InternalSmallUML.g:431:3: (lv_nomElement_0_0= ruleEString )
            // InternalSmallUML.g:432:4: lv_nomElement_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getElementAccess().getNomElementEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nomElement_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getElementRule());
            				}
            				set(
            					current,
            					"nomElement",
            					lv_nomElement_0_0,
            					"org.smalluml.SmallUML.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCardinalite"
    // InternalSmallUML.g:452:1: entryRuleCardinalite returns [EObject current=null] : iv_ruleCardinalite= ruleCardinalite EOF ;
    public final EObject entryRuleCardinalite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalite = null;


        try {
            // InternalSmallUML.g:452:52: (iv_ruleCardinalite= ruleCardinalite EOF )
            // InternalSmallUML.g:453:2: iv_ruleCardinalite= ruleCardinalite EOF
            {
             newCompositeNode(grammarAccess.getCardinaliteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalite=ruleCardinalite();

            state._fsp--;

             current =iv_ruleCardinalite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalite"


    // $ANTLR start "ruleCardinalite"
    // InternalSmallUML.g:459:1: ruleCardinalite returns [EObject current=null] : (otherlv_0= '[' ( (lv_multiplicite_1_0= ruleEString ) ) otherlv_2= ']' ) ;
    public final EObject ruleCardinalite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_multiplicite_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:465:2: ( (otherlv_0= '[' ( (lv_multiplicite_1_0= ruleEString ) ) otherlv_2= ']' ) )
            // InternalSmallUML.g:466:2: (otherlv_0= '[' ( (lv_multiplicite_1_0= ruleEString ) ) otherlv_2= ']' )
            {
            // InternalSmallUML.g:466:2: (otherlv_0= '[' ( (lv_multiplicite_1_0= ruleEString ) ) otherlv_2= ']' )
            // InternalSmallUML.g:467:3: otherlv_0= '[' ( (lv_multiplicite_1_0= ruleEString ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSmallUML.g:471:3: ( (lv_multiplicite_1_0= ruleEString ) )
            // InternalSmallUML.g:472:4: (lv_multiplicite_1_0= ruleEString )
            {
            // InternalSmallUML.g:472:4: (lv_multiplicite_1_0= ruleEString )
            // InternalSmallUML.g:473:5: lv_multiplicite_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinaliteAccess().getMultipliciteEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_multiplicite_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinaliteRule());
            					}
            					set(
            						current,
            						"multiplicite",
            						lv_multiplicite_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinalite"


    // $ANTLR start "entryRuleTypeDonnee"
    // InternalSmallUML.g:498:1: entryRuleTypeDonnee returns [EObject current=null] : iv_ruleTypeDonnee= ruleTypeDonnee EOF ;
    public final EObject entryRuleTypeDonnee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDonnee = null;


        try {
            // InternalSmallUML.g:498:51: (iv_ruleTypeDonnee= ruleTypeDonnee EOF )
            // InternalSmallUML.g:499:2: iv_ruleTypeDonnee= ruleTypeDonnee EOF
            {
             newCompositeNode(grammarAccess.getTypeDonneeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDonnee=ruleTypeDonnee();

            state._fsp--;

             current =iv_ruleTypeDonnee; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDonnee"


    // $ANTLR start "ruleTypeDonnee"
    // InternalSmallUML.g:505:1: ruleTypeDonnee returns [EObject current=null] : (otherlv_0= 'TypeDonnee' ( (lv_nomType_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' ) ;
    public final EObject ruleTypeDonnee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nomType_1_0 = null;

        EObject lv_attributs_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:511:2: ( (otherlv_0= 'TypeDonnee' ( (lv_nomType_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' ) )
            // InternalSmallUML.g:512:2: (otherlv_0= 'TypeDonnee' ( (lv_nomType_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' )
            {
            // InternalSmallUML.g:512:2: (otherlv_0= 'TypeDonnee' ( (lv_nomType_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}' )
            // InternalSmallUML.g:513:3: otherlv_0= 'TypeDonnee' ( (lv_nomType_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_attributs_3_0= ruleAttribut ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_0());
            		
            // InternalSmallUML.g:517:3: ( (lv_nomType_1_0= ruleEString ) )
            // InternalSmallUML.g:518:4: (lv_nomType_1_0= ruleEString )
            {
            // InternalSmallUML.g:518:4: (lv_nomType_1_0= ruleEString )
            // InternalSmallUML.g:519:5: lv_nomType_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeDonneeAccess().getNomTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nomType_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
            					}
            					set(
            						current,
            						"nomType",
            						lv_nomType_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:540:3: ( (lv_attributs_3_0= ruleAttribut ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:541:4: (lv_attributs_3_0= ruleAttribut )
            	    {
            	    // InternalSmallUML.g:541:4: (lv_attributs_3_0= ruleAttribut )
            	    // InternalSmallUML.g:542:5: lv_attributs_3_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributs_3_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_3_0,
            	    						"org.smalluml.SmallUML.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDonnee"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:567:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:567:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:568:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:574:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_nomEnumeration_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nomEnumeration_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:580:2: ( (otherlv_0= 'Enumeration' ( (lv_nomEnumeration_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // InternalSmallUML.g:581:2: (otherlv_0= 'Enumeration' ( (lv_nomEnumeration_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // InternalSmallUML.g:581:2: (otherlv_0= 'Enumeration' ( (lv_nomEnumeration_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}' )
            // InternalSmallUML.g:582:3: otherlv_0= 'Enumeration' ( (lv_nomEnumeration_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUML.g:586:3: ( (lv_nomEnumeration_1_0= ruleEString ) )
            // InternalSmallUML.g:587:4: (lv_nomEnumeration_1_0= ruleEString )
            {
            // InternalSmallUML.g:587:4: (lv_nomEnumeration_1_0= ruleEString )
            // InternalSmallUML.g:588:5: lv_nomEnumeration_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNomEnumerationEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nomEnumeration_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"nomEnumeration",
            						lv_nomEnumeration_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:609:3: ( (lv_elements_3_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallUML.g:610:4: (lv_elements_3_0= ruleElement )
            	    {
            	    // InternalSmallUML.g:610:4: (lv_elements_3_0= ruleElement )
            	    // InternalSmallUML.g:611:5: lv_elements_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_elements_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"org.smalluml.SmallUML.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleChaine"
    // InternalSmallUML.g:636:1: entryRuleChaine returns [EObject current=null] : iv_ruleChaine= ruleChaine EOF ;
    public final EObject entryRuleChaine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaine = null;


        try {
            // InternalSmallUML.g:636:47: (iv_ruleChaine= ruleChaine EOF )
            // InternalSmallUML.g:637:2: iv_ruleChaine= ruleChaine EOF
            {
             newCompositeNode(grammarAccess.getChaineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChaine=ruleChaine();

            state._fsp--;

             current =iv_ruleChaine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChaine"


    // $ANTLR start "ruleChaine"
    // InternalSmallUML.g:643:1: ruleChaine returns [EObject current=null] : ( (lv_nomType_0_0= 'Chaine' ) ) ;
    public final EObject ruleChaine() throws RecognitionException {
        EObject current = null;

        Token lv_nomType_0_0=null;


        	enterRule();

        try {
            // InternalSmallUML.g:649:2: ( ( (lv_nomType_0_0= 'Chaine' ) ) )
            // InternalSmallUML.g:650:2: ( (lv_nomType_0_0= 'Chaine' ) )
            {
            // InternalSmallUML.g:650:2: ( (lv_nomType_0_0= 'Chaine' ) )
            // InternalSmallUML.g:651:3: (lv_nomType_0_0= 'Chaine' )
            {
            // InternalSmallUML.g:651:3: (lv_nomType_0_0= 'Chaine' )
            // InternalSmallUML.g:652:4: lv_nomType_0_0= 'Chaine'
            {
            lv_nomType_0_0=(Token)match(input,27,FOLLOW_2); 

            				newLeafNode(lv_nomType_0_0, grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChaineRule());
            				}
            				setWithLastConsumed(current, "nomType", lv_nomType_0_0, "Chaine");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChaine"


    // $ANTLR start "entryRuleEntier"
    // InternalSmallUML.g:667:1: entryRuleEntier returns [EObject current=null] : iv_ruleEntier= ruleEntier EOF ;
    public final EObject entryRuleEntier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntier = null;


        try {
            // InternalSmallUML.g:667:47: (iv_ruleEntier= ruleEntier EOF )
            // InternalSmallUML.g:668:2: iv_ruleEntier= ruleEntier EOF
            {
             newCompositeNode(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntier=ruleEntier();

            state._fsp--;

             current =iv_ruleEntier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalSmallUML.g:674:1: ruleEntier returns [EObject current=null] : ( (lv_nomType_0_0= 'Entier' ) ) ;
    public final EObject ruleEntier() throws RecognitionException {
        EObject current = null;

        Token lv_nomType_0_0=null;


        	enterRule();

        try {
            // InternalSmallUML.g:680:2: ( ( (lv_nomType_0_0= 'Entier' ) ) )
            // InternalSmallUML.g:681:2: ( (lv_nomType_0_0= 'Entier' ) )
            {
            // InternalSmallUML.g:681:2: ( (lv_nomType_0_0= 'Entier' ) )
            // InternalSmallUML.g:682:3: (lv_nomType_0_0= 'Entier' )
            {
            // InternalSmallUML.g:682:3: (lv_nomType_0_0= 'Entier' )
            // InternalSmallUML.g:683:4: lv_nomType_0_0= 'Entier'
            {
            lv_nomType_0_0=(Token)match(input,28,FOLLOW_2); 

            				newLeafNode(lv_nomType_0_0, grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntierRule());
            				}
            				setWithLastConsumed(current, "nomType", lv_nomType_0_0, "Entier");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleBooleen"
    // InternalSmallUML.g:698:1: entryRuleBooleen returns [EObject current=null] : iv_ruleBooleen= ruleBooleen EOF ;
    public final EObject entryRuleBooleen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleen = null;


        try {
            // InternalSmallUML.g:698:48: (iv_ruleBooleen= ruleBooleen EOF )
            // InternalSmallUML.g:699:2: iv_ruleBooleen= ruleBooleen EOF
            {
             newCompositeNode(grammarAccess.getBooleenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleen=ruleBooleen();

            state._fsp--;

             current =iv_ruleBooleen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleen"


    // $ANTLR start "ruleBooleen"
    // InternalSmallUML.g:705:1: ruleBooleen returns [EObject current=null] : ( (lv_nomType_0_0= 'Booleen' ) ) ;
    public final EObject ruleBooleen() throws RecognitionException {
        EObject current = null;

        Token lv_nomType_0_0=null;


        	enterRule();

        try {
            // InternalSmallUML.g:711:2: ( ( (lv_nomType_0_0= 'Booleen' ) ) )
            // InternalSmallUML.g:712:2: ( (lv_nomType_0_0= 'Booleen' ) )
            {
            // InternalSmallUML.g:712:2: ( (lv_nomType_0_0= 'Booleen' ) )
            // InternalSmallUML.g:713:3: (lv_nomType_0_0= 'Booleen' )
            {
            // InternalSmallUML.g:713:3: (lv_nomType_0_0= 'Booleen' )
            // InternalSmallUML.g:714:4: lv_nomType_0_0= 'Booleen'
            {
            lv_nomType_0_0=(Token)match(input,29,FOLLOW_2); 

            				newLeafNode(lv_nomType_0_0, grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleenRule());
            				}
            				setWithLastConsumed(current, "nomType", lv_nomType_0_0, "Booleen");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleen"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:729:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:729:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:730:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:736:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:742:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:743:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:743:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:744:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:752:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004030L});

}