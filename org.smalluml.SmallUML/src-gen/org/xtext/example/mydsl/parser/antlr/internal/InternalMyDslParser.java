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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'Classe'", "'Sous-Classe'", "'Super-Classe'", "'Abstraite='", "'Attribut'", "'Methode'", "'('", "')'", "'Association'", "'Role'", "'['", "'..'", "']'", "'TypeDonnee'", "'Enumeration'", "'Chaine'", "'Entier'", "'Booleen'", "'Vrai'", "'Faux'", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRulePackage"
    // InternalMyDsl.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalMyDsl.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalMyDsl.g:65:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMyDsl.g:71:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elementsPackage_4_0= ruleElementPackage ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nom_2_0 = null;

        EObject lv_elementsPackage_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Package' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elementsPackage_4_0= ruleElementPackage ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Package' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elementsPackage_4_0= ruleElementPackage ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Package' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elementsPackage_4_0= ruleElementPackage ) )* otherlv_5= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Package' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elementsPackage_4_0= ruleElementPackage ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: ( (lv_elementsPackage_4_0= ruleElementPackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==22||(LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:114:4: (lv_elementsPackage_4_0= ruleElementPackage )
            	    {
            	    // InternalMyDsl.g:114:4: (lv_elementsPackage_4_0= ruleElementPackage )
            	    // InternalMyDsl.g:115:5: lv_elementsPackage_4_0= ruleElementPackage
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsPackageElementPackageParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elementsPackage_4_0=ruleElementPackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elementsPackage",
            	    						lv_elementsPackage_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.ElementPackage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleElementPackage"
    // InternalMyDsl.g:140:1: entryRuleElementPackage returns [EObject current=null] : iv_ruleElementPackage= ruleElementPackage EOF ;
    public final EObject entryRuleElementPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementPackage = null;


        try {
            // InternalMyDsl.g:140:55: (iv_ruleElementPackage= ruleElementPackage EOF )
            // InternalMyDsl.g:141:2: iv_ruleElementPackage= ruleElementPackage EOF
            {
             newCompositeNode(grammarAccess.getElementPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementPackage=ruleElementPackage();

            state._fsp--;

             current =iv_ruleElementPackage; 
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
    // $ANTLR end "entryRuleElementPackage"


    // $ANTLR start "ruleElementPackage"
    // InternalMyDsl.g:147:1: ruleElementPackage returns [EObject current=null] : (this_Classe_0= ruleClasse | this_Association_1= ruleAssociation | this_Enumeration_2= ruleEnumeration | this_TypeDonnee_3= ruleTypeDonnee ) ;
    public final EObject ruleElementPackage() throws RecognitionException {
        EObject current = null;

        EObject this_Classe_0 = null;

        EObject this_Association_1 = null;

        EObject this_Enumeration_2 = null;

        EObject this_TypeDonnee_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:153:2: ( (this_Classe_0= ruleClasse | this_Association_1= ruleAssociation | this_Enumeration_2= ruleEnumeration | this_TypeDonnee_3= ruleTypeDonnee ) )
            // InternalMyDsl.g:154:2: (this_Classe_0= ruleClasse | this_Association_1= ruleAssociation | this_Enumeration_2= ruleEnumeration | this_TypeDonnee_3= ruleTypeDonnee )
            {
            // InternalMyDsl.g:154:2: (this_Classe_0= ruleClasse | this_Association_1= ruleAssociation | this_Enumeration_2= ruleEnumeration | this_TypeDonnee_3= ruleTypeDonnee )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:155:3: this_Classe_0= ruleClasse
                    {

                    			newCompositeNode(grammarAccess.getElementPackageAccess().getClasseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Classe_0=ruleClasse();

                    state._fsp--;


                    			current = this_Classe_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:164:3: this_Association_1= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getElementPackageAccess().getAssociationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_1=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:173:3: this_Enumeration_2= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getElementPackageAccess().getEnumerationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:182:3: this_TypeDonnee_3= ruleTypeDonnee
                    {

                    			newCompositeNode(grammarAccess.getElementPackageAccess().getTypeDonneeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeDonnee_3=ruleTypeDonnee();

                    state._fsp--;


                    			current = this_TypeDonnee_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleElementPackage"


    // $ANTLR start "entryRuleClasse"
    // InternalMyDsl.g:194:1: entryRuleClasse returns [EObject current=null] : iv_ruleClasse= ruleClasse EOF ;
    public final EObject entryRuleClasse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClasse = null;


        try {
            // InternalMyDsl.g:194:47: (iv_ruleClasse= ruleClasse EOF )
            // InternalMyDsl.g:195:2: iv_ruleClasse= ruleClasse EOF
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
    // InternalMyDsl.g:201:1: ruleClasse returns [EObject current=null] : ( () otherlv_1= 'Classe' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )* (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Abstraite=' ( (lv_classeAbstraite_12_0= ruleEBoolean ) ) otherlv_13= '}' ) ;
    public final EObject ruleClasse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nom_2_0 = null;

        EObject lv_attributs_4_0 = null;

        EObject lv_cardinalites_5_0 = null;

        EObject lv_sousClasses_7_0 = null;

        EObject lv_methodes_8_0 = null;

        AntlrDatatypeRuleToken lv_classeAbstraite_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:207:2: ( ( () otherlv_1= 'Classe' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )* (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Abstraite=' ( (lv_classeAbstraite_12_0= ruleEBoolean ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:208:2: ( () otherlv_1= 'Classe' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )* (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Abstraite=' ( (lv_classeAbstraite_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:208:2: ( () otherlv_1= 'Classe' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )* (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Abstraite=' ( (lv_classeAbstraite_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            // InternalMyDsl.g:209:3: () otherlv_1= 'Classe' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )* (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )? otherlv_11= 'Abstraite=' ( (lv_classeAbstraite_12_0= ruleEBoolean ) ) otherlv_13= '}'
            {
            // InternalMyDsl.g:209:3: ()
            // InternalMyDsl.g:210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClasseAccess().getClasseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClasseAccess().getClasseKeyword_1());
            		
            // InternalMyDsl.g:220:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:221:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:221:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:222:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClasseAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClasseRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:243:3: ( ( (lv_attributs_4_0= ruleAttribut ) ) | ( (lv_cardinalites_5_0= ruleCardinalite ) ) | (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) ) | ( (lv_methodes_8_0= ruleMethode ) ) )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                    {
                    alt3=2;
                    }
                    break;
                case 15:
                    {
                    alt3=3;
                    }
                    break;
                case 19:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:244:4: ( (lv_attributs_4_0= ruleAttribut ) )
            	    {
            	    // InternalMyDsl.g:244:4: ( (lv_attributs_4_0= ruleAttribut ) )
            	    // InternalMyDsl.g:245:5: (lv_attributs_4_0= ruleAttribut )
            	    {
            	    // InternalMyDsl.g:245:5: (lv_attributs_4_0= ruleAttribut )
            	    // InternalMyDsl.g:246:6: lv_attributs_4_0= ruleAttribut
            	    {

            	    						newCompositeNode(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_attributs_4_0=ruleAttribut();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClasseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributs",
            	    							lv_attributs_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.Attribut");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:264:4: ( (lv_cardinalites_5_0= ruleCardinalite ) )
            	    {
            	    // InternalMyDsl.g:264:4: ( (lv_cardinalites_5_0= ruleCardinalite ) )
            	    // InternalMyDsl.g:265:5: (lv_cardinalites_5_0= ruleCardinalite )
            	    {
            	    // InternalMyDsl.g:265:5: (lv_cardinalites_5_0= ruleCardinalite )
            	    // InternalMyDsl.g:266:6: lv_cardinalites_5_0= ruleCardinalite
            	    {

            	    						newCompositeNode(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_cardinalites_5_0=ruleCardinalite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClasseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"cardinalites",
            	    							lv_cardinalites_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Cardinalite");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:284:4: (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) )
            	    {
            	    // InternalMyDsl.g:284:4: (otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) ) )
            	    // InternalMyDsl.g:285:5: otherlv_6= 'Sous-Classe' ( (lv_sousClasses_7_0= ruleClasse ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	    					newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getSousClasseKeyword_4_2_0());
            	    				
            	    // InternalMyDsl.g:289:5: ( (lv_sousClasses_7_0= ruleClasse ) )
            	    // InternalMyDsl.g:290:6: (lv_sousClasses_7_0= ruleClasse )
            	    {
            	    // InternalMyDsl.g:290:6: (lv_sousClasses_7_0= ruleClasse )
            	    // InternalMyDsl.g:291:7: lv_sousClasses_7_0= ruleClasse
            	    {

            	    							newCompositeNode(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_4_2_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_sousClasses_7_0=ruleClasse();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getClasseRule());
            	    							}
            	    							add(
            	    								current,
            	    								"sousClasses",
            	    								lv_sousClasses_7_0,
            	    								"org.xtext.example.mydsl.MyDsl.Classe");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:310:4: ( (lv_methodes_8_0= ruleMethode ) )
            	    {
            	    // InternalMyDsl.g:310:4: ( (lv_methodes_8_0= ruleMethode ) )
            	    // InternalMyDsl.g:311:5: (lv_methodes_8_0= ruleMethode )
            	    {
            	    // InternalMyDsl.g:311:5: (lv_methodes_8_0= ruleMethode )
            	    // InternalMyDsl.g:312:6: lv_methodes_8_0= ruleMethode
            	    {

            	    						newCompositeNode(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_methodes_8_0=ruleMethode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClasseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methodes",
            	    							lv_methodes_8_0,
            	    							"org.xtext.example.mydsl.MyDsl.Methode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:330:3: (otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:331:4: otherlv_9= 'Super-Classe' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getClasseAccess().getSuperClasseKeyword_5_0());
                    			
                    // InternalMyDsl.g:335:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMyDsl.g:336:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMyDsl.g:336:5: (otherlv_10= RULE_ID )
                    // InternalMyDsl.g:337:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClasseRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_10, grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getClasseAccess().getAbstraiteKeyword_6());
            		
            // InternalMyDsl.g:353:3: ( (lv_classeAbstraite_12_0= ruleEBoolean ) )
            // InternalMyDsl.g:354:4: (lv_classeAbstraite_12_0= ruleEBoolean )
            {
            // InternalMyDsl.g:354:4: (lv_classeAbstraite_12_0= ruleEBoolean )
            // InternalMyDsl.g:355:5: lv_classeAbstraite_12_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getClasseAccess().getClasseAbstraiteEBooleanParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_classeAbstraite_12_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClasseRule());
            					}
            					set(
            						current,
            						"classeAbstraite",
            						true,
            						"org.xtext.example.mydsl.MyDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMyDsl.g:380:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalMyDsl.g:380:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalMyDsl.g:381:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalMyDsl.g:387:1: ruleAttribut returns [EObject current=null] : (otherlv_0= 'Attribut' ( (lv_type_1_0= ruleType ) ) ( (lv_nom_2_0= ruleEString ) ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_nom_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:393:2: ( (otherlv_0= 'Attribut' ( (lv_type_1_0= ruleType ) ) ( (lv_nom_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:394:2: (otherlv_0= 'Attribut' ( (lv_type_1_0= ruleType ) ) ( (lv_nom_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:394:2: (otherlv_0= 'Attribut' ( (lv_type_1_0= ruleType ) ) ( (lv_nom_2_0= ruleEString ) ) )
            // InternalMyDsl.g:395:3: otherlv_0= 'Attribut' ( (lv_type_1_0= ruleType ) ) ( (lv_nom_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributAccess().getAttributKeyword_0());
            		
            // InternalMyDsl.g:399:3: ( (lv_type_1_0= ruleType ) )
            // InternalMyDsl.g:400:4: (lv_type_1_0= ruleType )
            {
            // InternalMyDsl.g:400:4: (lv_type_1_0= ruleType )
            // InternalMyDsl.g:401:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:418:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:419:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:419:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:420:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleMethode"
    // InternalMyDsl.g:441:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalMyDsl.g:441:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalMyDsl.g:442:2: iv_ruleMethode= ruleMethode EOF
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
    // InternalMyDsl.g:448:1: ruleMethode returns [EObject current=null] : ( () otherlv_1= 'Methode' ( (lv_typeDeRetour_2_0= ruleType ) ) ( (lv_nom_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= 'Abstraite=' ( (lv_methodeAbstraite_8_0= ruleEBoolean ) ) ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_typeDeRetour_2_0 = null;

        AntlrDatatypeRuleToken lv_nom_3_0 = null;

        EObject lv_parametres_5_0 = null;

        AntlrDatatypeRuleToken lv_methodeAbstraite_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:454:2: ( ( () otherlv_1= 'Methode' ( (lv_typeDeRetour_2_0= ruleType ) ) ( (lv_nom_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= 'Abstraite=' ( (lv_methodeAbstraite_8_0= ruleEBoolean ) ) ) )
            // InternalMyDsl.g:455:2: ( () otherlv_1= 'Methode' ( (lv_typeDeRetour_2_0= ruleType ) ) ( (lv_nom_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= 'Abstraite=' ( (lv_methodeAbstraite_8_0= ruleEBoolean ) ) )
            {
            // InternalMyDsl.g:455:2: ( () otherlv_1= 'Methode' ( (lv_typeDeRetour_2_0= ruleType ) ) ( (lv_nom_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= 'Abstraite=' ( (lv_methodeAbstraite_8_0= ruleEBoolean ) ) )
            // InternalMyDsl.g:456:3: () otherlv_1= 'Methode' ( (lv_typeDeRetour_2_0= ruleType ) ) ( (lv_nom_3_0= ruleEString ) ) otherlv_4= '(' ( (lv_parametres_5_0= ruleAttribut ) )* otherlv_6= ')' otherlv_7= 'Abstraite=' ( (lv_methodeAbstraite_8_0= ruleEBoolean ) )
            {
            // InternalMyDsl.g:456:3: ()
            // InternalMyDsl.g:457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodeAccess().getMethodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getMethodeKeyword_1());
            		
            // InternalMyDsl.g:467:3: ( (lv_typeDeRetour_2_0= ruleType ) )
            // InternalMyDsl.g:468:4: (lv_typeDeRetour_2_0= ruleType )
            {
            // InternalMyDsl.g:468:4: (lv_typeDeRetour_2_0= ruleType )
            // InternalMyDsl.g:469:5: lv_typeDeRetour_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getTypeDeRetourTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_typeDeRetour_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"typeDeRetour",
            						lv_typeDeRetour_2_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:486:3: ( (lv_nom_3_0= ruleEString ) )
            // InternalMyDsl.g:487:4: (lv_nom_3_0= ruleEString )
            {
            // InternalMyDsl.g:487:4: (lv_nom_3_0= ruleEString )
            // InternalMyDsl.g:488:5: lv_nom_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getNomEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_nom_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_3_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMyDsl.g:509:3: ( (lv_parametres_5_0= ruleAttribut ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:510:4: (lv_parametres_5_0= ruleAttribut )
            	    {
            	    // InternalMyDsl.g:510:4: (lv_parametres_5_0= ruleAttribut )
            	    // InternalMyDsl.g:511:5: lv_parametres_5_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_parametres_5_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parametres",
            	    						lv_parametres_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodeAccess().getAbstraiteKeyword_7());
            		
            // InternalMyDsl.g:536:3: ( (lv_methodeAbstraite_8_0= ruleEBoolean ) )
            // InternalMyDsl.g:537:4: (lv_methodeAbstraite_8_0= ruleEBoolean )
            {
            // InternalMyDsl.g:537:4: (lv_methodeAbstraite_8_0= ruleEBoolean )
            // InternalMyDsl.g:538:5: lv_methodeAbstraite_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getMethodeAbstraiteEBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_methodeAbstraite_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"methodeAbstraite",
            						true,
            						"org.xtext.example.mydsl.MyDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:559:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalMyDsl.g:559:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalMyDsl.g:560:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:566:1: ruleAssociation returns [EObject current=null] : ( () otherlv_1= 'Association' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_cardinalites_4_0= ruleCardinalite ) ) ( (lv_cardinalites_5_0= ruleCardinalite ) )+ otherlv_6= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nom_2_0 = null;

        EObject lv_cardinalites_4_0 = null;

        EObject lv_cardinalites_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:572:2: ( ( () otherlv_1= 'Association' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_cardinalites_4_0= ruleCardinalite ) ) ( (lv_cardinalites_5_0= ruleCardinalite ) )+ otherlv_6= '}' ) )
            // InternalMyDsl.g:573:2: ( () otherlv_1= 'Association' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_cardinalites_4_0= ruleCardinalite ) ) ( (lv_cardinalites_5_0= ruleCardinalite ) )+ otherlv_6= '}' )
            {
            // InternalMyDsl.g:573:2: ( () otherlv_1= 'Association' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_cardinalites_4_0= ruleCardinalite ) ) ( (lv_cardinalites_5_0= ruleCardinalite ) )+ otherlv_6= '}' )
            // InternalMyDsl.g:574:3: () otherlv_1= 'Association' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_cardinalites_4_0= ruleCardinalite ) ) ( (lv_cardinalites_5_0= ruleCardinalite ) )+ otherlv_6= '}'
            {
            // InternalMyDsl.g:574:3: ()
            // InternalMyDsl.g:575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssociationAccess().getAssociationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalMyDsl.g:585:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:586:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:586:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:587:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:608:3: ( (lv_cardinalites_4_0= ruleCardinalite ) )
            // InternalMyDsl.g:609:4: (lv_cardinalites_4_0= ruleCardinalite )
            {
            // InternalMyDsl.g:609:4: (lv_cardinalites_4_0= ruleCardinalite )
            // InternalMyDsl.g:610:5: lv_cardinalites_4_0= ruleCardinalite
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_cardinalites_4_0=ruleCardinalite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					add(
            						current,
            						"cardinalites",
            						lv_cardinalites_4_0,
            						"org.xtext.example.mydsl.MyDsl.Cardinalite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:627:3: ( (lv_cardinalites_5_0= ruleCardinalite ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:628:4: (lv_cardinalites_5_0= ruleCardinalite )
            	    {
            	    // InternalMyDsl.g:628:4: (lv_cardinalites_5_0= ruleCardinalite )
            	    // InternalMyDsl.g:629:5: lv_cardinalites_5_0= ruleCardinalite
            	    {

            	    					newCompositeNode(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cardinalites_5_0=ruleCardinalite();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cardinalites",
            	    						lv_cardinalites_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.Cardinalite");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:654:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:654:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:655:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:661:1: ruleType returns [EObject current=null] : (this_Chaine_0= ruleChaine | this_Booleen_1= ruleBooleen | this_Entier_2= ruleEntier | this_TypeDonnee_3= ruleTypeDonnee | this_Enumeration_4= ruleEnumeration ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Chaine_0 = null;

        EObject this_Booleen_1 = null;

        EObject this_Entier_2 = null;

        EObject this_TypeDonnee_3 = null;

        EObject this_Enumeration_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:667:2: ( (this_Chaine_0= ruleChaine | this_Booleen_1= ruleBooleen | this_Entier_2= ruleEntier | this_TypeDonnee_3= ruleTypeDonnee | this_Enumeration_4= ruleEnumeration ) )
            // InternalMyDsl.g:668:2: (this_Chaine_0= ruleChaine | this_Booleen_1= ruleBooleen | this_Entier_2= ruleEntier | this_TypeDonnee_3= ruleTypeDonnee | this_Enumeration_4= ruleEnumeration )
            {
            // InternalMyDsl.g:668:2: (this_Chaine_0= ruleChaine | this_Booleen_1= ruleBooleen | this_Entier_2= ruleEntier | this_TypeDonnee_3= ruleTypeDonnee | this_Enumeration_4= ruleEnumeration )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:669:3: this_Chaine_0= ruleChaine
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getChaineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Chaine_0=ruleChaine();

                    state._fsp--;


                    			current = this_Chaine_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:678:3: this_Booleen_1= ruleBooleen
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Booleen_1=ruleBooleen();

                    state._fsp--;


                    			current = this_Booleen_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:687:3: this_Entier_2= ruleEntier
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEntierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entier_2=ruleEntier();

                    state._fsp--;


                    			current = this_Entier_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:696:3: this_TypeDonnee_3= ruleTypeDonnee
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeDonneeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeDonnee_3=ruleTypeDonnee();

                    state._fsp--;


                    			current = this_TypeDonnee_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:705:3: this_Enumeration_4= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:717:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:717:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:718:2: iv_ruleElement= ruleElement EOF
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
    // InternalMyDsl.g:724:1: ruleElement returns [EObject current=null] : ( (lv_nom_0_0= ruleEString ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nom_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:730:2: ( ( (lv_nom_0_0= ruleEString ) ) )
            // InternalMyDsl.g:731:2: ( (lv_nom_0_0= ruleEString ) )
            {
            // InternalMyDsl.g:731:2: ( (lv_nom_0_0= ruleEString ) )
            // InternalMyDsl.g:732:3: (lv_nom_0_0= ruleEString )
            {
            // InternalMyDsl.g:732:3: (lv_nom_0_0= ruleEString )
            // InternalMyDsl.g:733:4: lv_nom_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getElementAccess().getNomEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nom_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getElementRule());
            				}
            				set(
            					current,
            					"nom",
            					lv_nom_0_0,
            					"org.xtext.example.mydsl.MyDsl.EString");
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
    // InternalMyDsl.g:753:1: entryRuleCardinalite returns [EObject current=null] : iv_ruleCardinalite= ruleCardinalite EOF ;
    public final EObject entryRuleCardinalite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalite = null;


        try {
            // InternalMyDsl.g:753:52: (iv_ruleCardinalite= ruleCardinalite EOF )
            // InternalMyDsl.g:754:2: iv_ruleCardinalite= ruleCardinalite EOF
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
    // InternalMyDsl.g:760:1: ruleCardinalite returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_multipliciteInf_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_multipliciteSup_5_0= ruleEInt ) ) otherlv_6= ']' ) ;
    public final EObject ruleCardinalite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_nom_1_0 = null;

        AntlrDatatypeRuleToken lv_multipliciteInf_3_0 = null;

        AntlrDatatypeRuleToken lv_multipliciteSup_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:766:2: ( (otherlv_0= 'Role' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_multipliciteInf_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_multipliciteSup_5_0= ruleEInt ) ) otherlv_6= ']' ) )
            // InternalMyDsl.g:767:2: (otherlv_0= 'Role' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_multipliciteInf_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_multipliciteSup_5_0= ruleEInt ) ) otherlv_6= ']' )
            {
            // InternalMyDsl.g:767:2: (otherlv_0= 'Role' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_multipliciteInf_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_multipliciteSup_5_0= ruleEInt ) ) otherlv_6= ']' )
            // InternalMyDsl.g:768:3: otherlv_0= 'Role' ( (lv_nom_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_multipliciteInf_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_multipliciteSup_5_0= ruleEInt ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCardinaliteAccess().getRoleKeyword_0());
            		
            // InternalMyDsl.g:772:3: ( (lv_nom_1_0= ruleEString ) )
            // InternalMyDsl.g:773:4: (lv_nom_1_0= ruleEString )
            {
            // InternalMyDsl.g:773:4: (lv_nom_1_0= ruleEString )
            // InternalMyDsl.g:774:5: lv_nom_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCardinaliteAccess().getNomEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_nom_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinaliteRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:795:3: ( (lv_multipliciteInf_3_0= ruleEInt ) )
            // InternalMyDsl.g:796:4: (lv_multipliciteInf_3_0= ruleEInt )
            {
            // InternalMyDsl.g:796:4: (lv_multipliciteInf_3_0= ruleEInt )
            // InternalMyDsl.g:797:5: lv_multipliciteInf_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinaliteAccess().getMultipliciteInfEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_multipliciteInf_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinaliteRule());
            					}
            					set(
            						current,
            						"multipliciteInf",
            						lv_multipliciteInf_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getCardinaliteAccess().getFullStopFullStopKeyword_4());
            		
            // InternalMyDsl.g:818:3: ( (lv_multipliciteSup_5_0= ruleEInt ) )
            // InternalMyDsl.g:819:4: (lv_multipliciteSup_5_0= ruleEInt )
            {
            // InternalMyDsl.g:819:4: (lv_multipliciteSup_5_0= ruleEInt )
            // InternalMyDsl.g:820:5: lv_multipliciteSup_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getCardinaliteAccess().getMultipliciteSupEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_multipliciteSup_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCardinaliteRule());
            					}
            					set(
            						current,
            						"multipliciteSup",
            						lv_multipliciteSup_5_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalMyDsl.g:845:1: entryRuleTypeDonnee returns [EObject current=null] : iv_ruleTypeDonnee= ruleTypeDonnee EOF ;
    public final EObject entryRuleTypeDonnee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDonnee = null;


        try {
            // InternalMyDsl.g:845:51: (iv_ruleTypeDonnee= ruleTypeDonnee EOF )
            // InternalMyDsl.g:846:2: iv_ruleTypeDonnee= ruleTypeDonnee EOF
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
    // InternalMyDsl.g:852:1: ruleTypeDonnee returns [EObject current=null] : ( () otherlv_1= 'TypeDonnee' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributs_4_0= ruleAttribut ) )* otherlv_5= '}' ) ;
    public final EObject ruleTypeDonnee() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nom_2_0 = null;

        EObject lv_attributs_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:858:2: ( ( () otherlv_1= 'TypeDonnee' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributs_4_0= ruleAttribut ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:859:2: ( () otherlv_1= 'TypeDonnee' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributs_4_0= ruleAttribut ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:859:2: ( () otherlv_1= 'TypeDonnee' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributs_4_0= ruleAttribut ) )* otherlv_5= '}' )
            // InternalMyDsl.g:860:3: () otherlv_1= 'TypeDonnee' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_attributs_4_0= ruleAttribut ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:860:3: ()
            // InternalMyDsl.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeDonneeAccess().getTypeDonneeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_1());
            		
            // InternalMyDsl.g:871:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:872:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:872:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:873:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTypeDonneeAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:894:3: ( (lv_attributs_4_0= ruleAttribut ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:895:4: (lv_attributs_4_0= ruleAttribut )
            	    {
            	    // InternalMyDsl.g:895:4: (lv_attributs_4_0= ruleAttribut )
            	    // InternalMyDsl.g:896:5: lv_attributs_4_0= ruleAttribut
            	    {

            	    					newCompositeNode(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_attributs_4_0=ruleAttribut();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTypeDonneeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributs",
            	    						lv_attributs_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribut");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:921:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalMyDsl.g:921:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalMyDsl.g:922:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalMyDsl.g:928:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'Enumeration' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nom_2_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:934:2: ( ( () otherlv_1= 'Enumeration' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:935:2: ( () otherlv_1= 'Enumeration' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:935:2: ( () otherlv_1= 'Enumeration' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}' )
            // InternalMyDsl.g:936:3: () otherlv_1= 'Enumeration' ( (lv_nom_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleElement ) )* otherlv_5= '}'
            {
            // InternalMyDsl.g:936:3: ()
            // InternalMyDsl.g:937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalMyDsl.g:947:3: ( (lv_nom_2_0= ruleEString ) )
            // InternalMyDsl.g:948:4: (lv_nom_2_0= ruleEString )
            {
            // InternalMyDsl.g:948:4: (lv_nom_2_0= ruleEString )
            // InternalMyDsl.g:949:5: lv_nom_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNomEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nom_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:970:3: ( (lv_elements_4_0= ruleElement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:971:4: (lv_elements_4_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:971:4: (lv_elements_4_0= ruleElement )
            	    // InternalMyDsl.g:972:5: lv_elements_4_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_elements_4_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMyDsl.g:997:1: entryRuleChaine returns [EObject current=null] : iv_ruleChaine= ruleChaine EOF ;
    public final EObject entryRuleChaine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChaine = null;


        try {
            // InternalMyDsl.g:997:47: (iv_ruleChaine= ruleChaine EOF )
            // InternalMyDsl.g:998:2: iv_ruleChaine= ruleChaine EOF
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
    // InternalMyDsl.g:1004:1: ruleChaine returns [EObject current=null] : ( () otherlv_1= 'Chaine' ) ;
    public final EObject ruleChaine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1010:2: ( ( () otherlv_1= 'Chaine' ) )
            // InternalMyDsl.g:1011:2: ( () otherlv_1= 'Chaine' )
            {
            // InternalMyDsl.g:1011:2: ( () otherlv_1= 'Chaine' )
            // InternalMyDsl.g:1012:3: () otherlv_1= 'Chaine'
            {
            // InternalMyDsl.g:1012:3: ()
            // InternalMyDsl.g:1013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChaineAccess().getChaineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getChaineAccess().getChaineKeyword_1());
            		

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
    // InternalMyDsl.g:1027:1: entryRuleEntier returns [EObject current=null] : iv_ruleEntier= ruleEntier EOF ;
    public final EObject entryRuleEntier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntier = null;


        try {
            // InternalMyDsl.g:1027:47: (iv_ruleEntier= ruleEntier EOF )
            // InternalMyDsl.g:1028:2: iv_ruleEntier= ruleEntier EOF
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
    // InternalMyDsl.g:1034:1: ruleEntier returns [EObject current=null] : ( () otherlv_1= 'Entier' ) ;
    public final EObject ruleEntier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1040:2: ( ( () otherlv_1= 'Entier' ) )
            // InternalMyDsl.g:1041:2: ( () otherlv_1= 'Entier' )
            {
            // InternalMyDsl.g:1041:2: ( () otherlv_1= 'Entier' )
            // InternalMyDsl.g:1042:3: () otherlv_1= 'Entier'
            {
            // InternalMyDsl.g:1042:3: ()
            // InternalMyDsl.g:1043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntierAccess().getEntierAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEntierAccess().getEntierKeyword_1());
            		

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
    // InternalMyDsl.g:1057:1: entryRuleBooleen returns [EObject current=null] : iv_ruleBooleen= ruleBooleen EOF ;
    public final EObject entryRuleBooleen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleen = null;


        try {
            // InternalMyDsl.g:1057:48: (iv_ruleBooleen= ruleBooleen EOF )
            // InternalMyDsl.g:1058:2: iv_ruleBooleen= ruleBooleen EOF
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
    // InternalMyDsl.g:1064:1: ruleBooleen returns [EObject current=null] : ( () otherlv_1= 'Booleen' ) ;
    public final EObject ruleBooleen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1070:2: ( ( () otherlv_1= 'Booleen' ) )
            // InternalMyDsl.g:1071:2: ( () otherlv_1= 'Booleen' )
            {
            // InternalMyDsl.g:1071:2: ( () otherlv_1= 'Booleen' )
            // InternalMyDsl.g:1072:3: () otherlv_1= 'Booleen'
            {
            // InternalMyDsl.g:1072:3: ()
            // InternalMyDsl.g:1073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleenAccess().getBooleenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleenAccess().getBooleenKeyword_1());
            		

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
    // InternalMyDsl.g:1087:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1087:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1088:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1094:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1100:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1101:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1101:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1102:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1110:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:1121:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:1121:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:1122:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:1128:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Vrai' | kw= 'Faux' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1134:2: ( (kw= 'Vrai' | kw= 'Faux' ) )
            // InternalMyDsl.g:1135:2: (kw= 'Vrai' | kw= 'Faux' )
            {
            // InternalMyDsl.g:1135:2: (kw= 'Vrai' | kw= 'Faux' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1136:3: kw= 'Vrai'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getVraiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1142:3: kw= 'Faux'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFauxKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1151:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1151:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1152:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1158:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1164:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1165:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1165:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1166:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1166:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1167:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018406000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000008F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000F8404000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}