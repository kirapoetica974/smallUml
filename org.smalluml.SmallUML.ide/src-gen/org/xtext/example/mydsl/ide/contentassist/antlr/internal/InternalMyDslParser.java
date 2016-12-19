package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vrai'", "'Faux'", "'Package'", "'{'", "'}'", "'Classe'", "'Abstraite='", "'Sous-Classe'", "'Super-Classe'", "'Attribut'", "'Methode'", "'('", "')'", "'Association'", "'Role'", "'['", "'..'", "']'", "'TypeDonnee'", "'Enumeration'", "'Chaine'", "'Entier'", "'Booleen'", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePackage"
    // InternalMyDsl.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePackage EOF )
            // InternalMyDsl.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalMyDsl.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Package__Group__0 )
            // InternalMyDsl.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleElementPackage"
    // InternalMyDsl.g:78:1: entryRuleElementPackage : ruleElementPackage EOF ;
    public final void entryRuleElementPackage() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleElementPackage EOF )
            // InternalMyDsl.g:80:1: ruleElementPackage EOF
            {
             before(grammarAccess.getElementPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleElementPackage();

            state._fsp--;

             after(grammarAccess.getElementPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementPackage"


    // $ANTLR start "ruleElementPackage"
    // InternalMyDsl.g:87:1: ruleElementPackage : ( ( rule__ElementPackage__Alternatives ) ) ;
    public final void ruleElementPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__ElementPackage__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__ElementPackage__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__ElementPackage__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__ElementPackage__Alternatives )
            {
             before(grammarAccess.getElementPackageAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__ElementPackage__Alternatives )
            // InternalMyDsl.g:94:4: rule__ElementPackage__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementPackage__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementPackageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementPackage"


    // $ANTLR start "entryRuleClasse"
    // InternalMyDsl.g:103:1: entryRuleClasse : ruleClasse EOF ;
    public final void entryRuleClasse() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleClasse EOF )
            // InternalMyDsl.g:105:1: ruleClasse EOF
            {
             before(grammarAccess.getClasseRule()); 
            pushFollow(FOLLOW_1);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getClasseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClasse"


    // $ANTLR start "ruleClasse"
    // InternalMyDsl.g:112:1: ruleClasse : ( ( rule__Classe__Group__0 ) ) ;
    public final void ruleClasse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Classe__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Classe__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Classe__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Classe__Group__0 )
            {
             before(grammarAccess.getClasseAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Classe__Group__0 )
            // InternalMyDsl.g:119:4: rule__Classe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClasse"


    // $ANTLR start "entryRuleAttribut"
    // InternalMyDsl.g:128:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAttribut EOF )
            // InternalMyDsl.g:130:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalMyDsl.g:137:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribut__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribut__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Attribut__Group__0 )
            // InternalMyDsl.g:144:4: rule__Attribut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleMethode"
    // InternalMyDsl.g:153:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMethode EOF )
            // InternalMyDsl.g:155:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getMethodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalMyDsl.g:162:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Methode__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Methode__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Methode__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Methode__Group__0 )
            // InternalMyDsl.g:169:4: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleAssociation"
    // InternalMyDsl.g:178:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAssociation EOF )
            // InternalMyDsl.g:180:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalMyDsl.g:187:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Association__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Association__Group__0 )
            // InternalMyDsl.g:194:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleType EOF )
            // InternalMyDsl.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:219:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:228:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleElement EOF )
            // InternalMyDsl.g:230:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:237:1: ruleElement : ( ( rule__Element__NomAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Element__NomAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Element__NomAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Element__NomAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__Element__NomAssignment )
            {
             before(grammarAccess.getElementAccess().getNomAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__Element__NomAssignment )
            // InternalMyDsl.g:244:4: rule__Element__NomAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Element__NomAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNomAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleCardinalite"
    // InternalMyDsl.g:253:1: entryRuleCardinalite : ruleCardinalite EOF ;
    public final void entryRuleCardinalite() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleCardinalite EOF )
            // InternalMyDsl.g:255:1: ruleCardinalite EOF
            {
             before(grammarAccess.getCardinaliteRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinalite();

            state._fsp--;

             after(grammarAccess.getCardinaliteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinalite"


    // $ANTLR start "ruleCardinalite"
    // InternalMyDsl.g:262:1: ruleCardinalite : ( ( rule__Cardinalite__Group__0 ) ) ;
    public final void ruleCardinalite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Cardinalite__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Cardinalite__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Cardinalite__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Cardinalite__Group__0 )
            {
             before(grammarAccess.getCardinaliteAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Cardinalite__Group__0 )
            // InternalMyDsl.g:269:4: rule__Cardinalite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinaliteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalite"


    // $ANTLR start "entryRuleTypeDonnee"
    // InternalMyDsl.g:278:1: entryRuleTypeDonnee : ruleTypeDonnee EOF ;
    public final void entryRuleTypeDonnee() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleTypeDonnee EOF )
            // InternalMyDsl.g:280:1: ruleTypeDonnee EOF
            {
             before(grammarAccess.getTypeDonneeRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDonnee();

            state._fsp--;

             after(grammarAccess.getTypeDonneeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeDonnee"


    // $ANTLR start "ruleTypeDonnee"
    // InternalMyDsl.g:287:1: ruleTypeDonnee : ( ( rule__TypeDonnee__Group__0 ) ) ;
    public final void ruleTypeDonnee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__TypeDonnee__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__TypeDonnee__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__TypeDonnee__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__TypeDonnee__Group__0 )
            {
             before(grammarAccess.getTypeDonneeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__TypeDonnee__Group__0 )
            // InternalMyDsl.g:294:4: rule__TypeDonnee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDonneeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDonnee"


    // $ANTLR start "entryRuleEnumeration"
    // InternalMyDsl.g:303:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleEnumeration EOF )
            // InternalMyDsl.g:305:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalMyDsl.g:312:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Enumeration__Group__0 )
            // InternalMyDsl.g:319:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleChaine"
    // InternalMyDsl.g:328:1: entryRuleChaine : ruleChaine EOF ;
    public final void entryRuleChaine() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleChaine EOF )
            // InternalMyDsl.g:330:1: ruleChaine EOF
            {
             before(grammarAccess.getChaineRule()); 
            pushFollow(FOLLOW_1);
            ruleChaine();

            state._fsp--;

             after(grammarAccess.getChaineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChaine"


    // $ANTLR start "ruleChaine"
    // InternalMyDsl.g:337:1: ruleChaine : ( ( rule__Chaine__Group__0 ) ) ;
    public final void ruleChaine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Chaine__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Chaine__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Chaine__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Chaine__Group__0 )
            {
             before(grammarAccess.getChaineAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Chaine__Group__0 )
            // InternalMyDsl.g:344:4: rule__Chaine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chaine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChaineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChaine"


    // $ANTLR start "entryRuleEntier"
    // InternalMyDsl.g:353:1: entryRuleEntier : ruleEntier EOF ;
    public final void entryRuleEntier() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleEntier EOF )
            // InternalMyDsl.g:355:1: ruleEntier EOF
            {
             before(grammarAccess.getEntierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntier();

            state._fsp--;

             after(grammarAccess.getEntierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntier"


    // $ANTLR start "ruleEntier"
    // InternalMyDsl.g:362:1: ruleEntier : ( ( rule__Entier__Group__0 ) ) ;
    public final void ruleEntier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Entier__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Entier__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Entier__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Entier__Group__0 )
            {
             before(grammarAccess.getEntierAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Entier__Group__0 )
            // InternalMyDsl.g:369:4: rule__Entier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntier"


    // $ANTLR start "entryRuleBooleen"
    // InternalMyDsl.g:378:1: entryRuleBooleen : ruleBooleen EOF ;
    public final void entryRuleBooleen() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleBooleen EOF )
            // InternalMyDsl.g:380:1: ruleBooleen EOF
            {
             before(grammarAccess.getBooleenRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleen();

            state._fsp--;

             after(grammarAccess.getBooleenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleen"


    // $ANTLR start "ruleBooleen"
    // InternalMyDsl.g:387:1: ruleBooleen : ( ( rule__Booleen__Group__0 ) ) ;
    public final void ruleBooleen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Booleen__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Booleen__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Booleen__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Booleen__Group__0 )
            {
             before(grammarAccess.getBooleenAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Booleen__Group__0 )
            // InternalMyDsl.g:394:4: rule__Booleen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleen"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleEString EOF )
            // InternalMyDsl.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:428:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:430:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:437:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:444:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:453:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleEInt EOF )
            // InternalMyDsl.g:455:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:462:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:469:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__ElementPackage__Alternatives"
    // InternalMyDsl.g:477:1: rule__ElementPackage__Alternatives : ( ( ruleClasse ) | ( ruleAssociation ) | ( ruleEnumeration ) | ( ruleTypeDonnee ) );
    public final void rule__ElementPackage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ruleClasse ) | ( ruleAssociation ) | ( ruleEnumeration ) | ( ruleTypeDonnee ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:482:2: ( ruleClasse )
                    {
                    // InternalMyDsl.g:482:2: ( ruleClasse )
                    // InternalMyDsl.g:483:3: ruleClasse
                    {
                     before(grammarAccess.getElementPackageAccess().getClasseParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClasse();

                    state._fsp--;

                     after(grammarAccess.getElementPackageAccess().getClasseParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:488:2: ( ruleAssociation )
                    {
                    // InternalMyDsl.g:488:2: ( ruleAssociation )
                    // InternalMyDsl.g:489:3: ruleAssociation
                    {
                     before(grammarAccess.getElementPackageAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getElementPackageAccess().getAssociationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:494:2: ( ruleEnumeration )
                    {
                    // InternalMyDsl.g:494:2: ( ruleEnumeration )
                    // InternalMyDsl.g:495:3: ruleEnumeration
                    {
                     before(grammarAccess.getElementPackageAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getElementPackageAccess().getEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:500:2: ( ruleTypeDonnee )
                    {
                    // InternalMyDsl.g:500:2: ( ruleTypeDonnee )
                    // InternalMyDsl.g:501:3: ruleTypeDonnee
                    {
                     before(grammarAccess.getElementPackageAccess().getTypeDonneeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeDonnee();

                    state._fsp--;

                     after(grammarAccess.getElementPackageAccess().getTypeDonneeParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementPackage__Alternatives"


    // $ANTLR start "rule__Classe__Alternatives_4"
    // InternalMyDsl.g:510:1: rule__Classe__Alternatives_4 : ( ( ( rule__Classe__AttributsAssignment_4_0 ) ) | ( ( rule__Classe__CardinalitesAssignment_4_1 ) ) | ( ( rule__Classe__Group_4_2__0 ) ) | ( ( rule__Classe__MethodesAssignment_4_3 ) ) );
    public final void rule__Classe__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( rule__Classe__AttributsAssignment_4_0 ) ) | ( ( rule__Classe__CardinalitesAssignment_4_1 ) ) | ( ( rule__Classe__Group_4_2__0 ) ) | ( ( rule__Classe__MethodesAssignment_4_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:515:2: ( ( rule__Classe__AttributsAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:515:2: ( ( rule__Classe__AttributsAssignment_4_0 ) )
                    // InternalMyDsl.g:516:3: ( rule__Classe__AttributsAssignment_4_0 )
                    {
                     before(grammarAccess.getClasseAccess().getAttributsAssignment_4_0()); 
                    // InternalMyDsl.g:517:3: ( rule__Classe__AttributsAssignment_4_0 )
                    // InternalMyDsl.g:517:4: rule__Classe__AttributsAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__AttributsAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClasseAccess().getAttributsAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:521:2: ( ( rule__Classe__CardinalitesAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:521:2: ( ( rule__Classe__CardinalitesAssignment_4_1 ) )
                    // InternalMyDsl.g:522:3: ( rule__Classe__CardinalitesAssignment_4_1 )
                    {
                     before(grammarAccess.getClasseAccess().getCardinalitesAssignment_4_1()); 
                    // InternalMyDsl.g:523:3: ( rule__Classe__CardinalitesAssignment_4_1 )
                    // InternalMyDsl.g:523:4: rule__Classe__CardinalitesAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__CardinalitesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClasseAccess().getCardinalitesAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:527:2: ( ( rule__Classe__Group_4_2__0 ) )
                    {
                    // InternalMyDsl.g:527:2: ( ( rule__Classe__Group_4_2__0 ) )
                    // InternalMyDsl.g:528:3: ( rule__Classe__Group_4_2__0 )
                    {
                     before(grammarAccess.getClasseAccess().getGroup_4_2()); 
                    // InternalMyDsl.g:529:3: ( rule__Classe__Group_4_2__0 )
                    // InternalMyDsl.g:529:4: rule__Classe__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClasseAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:533:2: ( ( rule__Classe__MethodesAssignment_4_3 ) )
                    {
                    // InternalMyDsl.g:533:2: ( ( rule__Classe__MethodesAssignment_4_3 ) )
                    // InternalMyDsl.g:534:3: ( rule__Classe__MethodesAssignment_4_3 )
                    {
                     before(grammarAccess.getClasseAccess().getMethodesAssignment_4_3()); 
                    // InternalMyDsl.g:535:3: ( rule__Classe__MethodesAssignment_4_3 )
                    // InternalMyDsl.g:535:4: rule__Classe__MethodesAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__MethodesAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getClasseAccess().getMethodesAssignment_4_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Alternatives_4"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:543:1: rule__Type__Alternatives : ( ( ruleChaine ) | ( ruleBooleen ) | ( ruleEntier ) | ( ruleTypeDonnee ) | ( ruleEnumeration ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( ( ruleChaine ) | ( ruleBooleen ) | ( ruleEntier ) | ( ruleTypeDonnee ) | ( ruleEnumeration ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:548:2: ( ruleChaine )
                    {
                    // InternalMyDsl.g:548:2: ( ruleChaine )
                    // InternalMyDsl.g:549:3: ruleChaine
                    {
                     before(grammarAccess.getTypeAccess().getChaineParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleChaine();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getChaineParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:554:2: ( ruleBooleen )
                    {
                    // InternalMyDsl.g:554:2: ( ruleBooleen )
                    // InternalMyDsl.g:555:3: ruleBooleen
                    {
                     before(grammarAccess.getTypeAccess().getBooleenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleen();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:560:2: ( ruleEntier )
                    {
                    // InternalMyDsl.g:560:2: ( ruleEntier )
                    // InternalMyDsl.g:561:3: ruleEntier
                    {
                     before(grammarAccess.getTypeAccess().getEntierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEntier();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:566:2: ( ruleTypeDonnee )
                    {
                    // InternalMyDsl.g:566:2: ( ruleTypeDonnee )
                    // InternalMyDsl.g:567:3: ruleTypeDonnee
                    {
                     before(grammarAccess.getTypeAccess().getTypeDonneeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeDonnee();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getTypeDonneeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:572:2: ( ruleEnumeration )
                    {
                    // InternalMyDsl.g:572:2: ( ruleEnumeration )
                    // InternalMyDsl.g:573:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:582:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:587:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:587:2: ( RULE_STRING )
                    // InternalMyDsl.g:588:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:593:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:593:2: ( RULE_ID )
                    // InternalMyDsl.g:594:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:603:1: rule__EBoolean__Alternatives : ( ( 'Vrai' ) | ( 'Faux' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( 'Vrai' ) | ( 'Faux' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:608:2: ( 'Vrai' )
                    {
                    // InternalMyDsl.g:608:2: ( 'Vrai' )
                    // InternalMyDsl.g:609:3: 'Vrai'
                    {
                     before(grammarAccess.getEBooleanAccess().getVraiKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getVraiKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:614:2: ( 'Faux' )
                    {
                    // InternalMyDsl.g:614:2: ( 'Faux' )
                    // InternalMyDsl.g:615:3: 'Faux'
                    {
                     before(grammarAccess.getEBooleanAccess().getFauxKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFauxKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // InternalMyDsl.g:624:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalMyDsl.g:629:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalMyDsl.g:636:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:640:1: ( ( () ) )
            // InternalMyDsl.g:641:1: ( () )
            {
            // InternalMyDsl.g:641:1: ( () )
            // InternalMyDsl.g:642:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalMyDsl.g:643:2: ()
            // InternalMyDsl.g:643:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalMyDsl.g:651:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:655:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalMyDsl.g:656:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalMyDsl.g:663:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:667:1: ( ( 'Package' ) )
            // InternalMyDsl.g:668:1: ( 'Package' )
            {
            // InternalMyDsl.g:668:1: ( 'Package' )
            // InternalMyDsl.g:669:2: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalMyDsl.g:678:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:682:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalMyDsl.g:683:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalMyDsl.g:690:1: rule__Package__Group__2__Impl : ( ( rule__Package__NomAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( ( ( rule__Package__NomAssignment_2 ) ) )
            // InternalMyDsl.g:695:1: ( ( rule__Package__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:695:1: ( ( rule__Package__NomAssignment_2 ) )
            // InternalMyDsl.g:696:2: ( rule__Package__NomAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:697:2: ( rule__Package__NomAssignment_2 )
            // InternalMyDsl.g:697:3: rule__Package__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalMyDsl.g:705:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:709:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalMyDsl.g:710:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalMyDsl.g:717:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:721:1: ( ( '{' ) )
            // InternalMyDsl.g:722:1: ( '{' )
            {
            // InternalMyDsl.g:722:1: ( '{' )
            // InternalMyDsl.g:723:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalMyDsl.g:732:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:736:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalMyDsl.g:737:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalMyDsl.g:744:1: rule__Package__Group__4__Impl : ( ( rule__Package__ElementsPackageAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ( rule__Package__ElementsPackageAssignment_4 )* ) )
            // InternalMyDsl.g:749:1: ( ( rule__Package__ElementsPackageAssignment_4 )* )
            {
            // InternalMyDsl.g:749:1: ( ( rule__Package__ElementsPackageAssignment_4 )* )
            // InternalMyDsl.g:750:2: ( rule__Package__ElementsPackageAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getElementsPackageAssignment_4()); 
            // InternalMyDsl.g:751:2: ( rule__Package__ElementsPackageAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16||LA6_0==24||(LA6_0>=29 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:751:3: rule__Package__ElementsPackageAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__ElementsPackageAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsPackageAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalMyDsl.g:759:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( rule__Package__Group__5__Impl )
            // InternalMyDsl.g:764:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalMyDsl.g:770:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( ( '}' ) )
            // InternalMyDsl.g:775:1: ( '}' )
            {
            // InternalMyDsl.g:775:1: ( '}' )
            // InternalMyDsl.g:776:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Classe__Group__0"
    // InternalMyDsl.g:786:1: rule__Classe__Group__0 : rule__Classe__Group__0__Impl rule__Classe__Group__1 ;
    public final void rule__Classe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( rule__Classe__Group__0__Impl rule__Classe__Group__1 )
            // InternalMyDsl.g:791:2: rule__Classe__Group__0__Impl rule__Classe__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Classe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0"


    // $ANTLR start "rule__Classe__Group__0__Impl"
    // InternalMyDsl.g:798:1: rule__Classe__Group__0__Impl : ( () ) ;
    public final void rule__Classe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:802:1: ( ( () ) )
            // InternalMyDsl.g:803:1: ( () )
            {
            // InternalMyDsl.g:803:1: ( () )
            // InternalMyDsl.g:804:2: ()
            {
             before(grammarAccess.getClasseAccess().getClasseAction_0()); 
            // InternalMyDsl.g:805:2: ()
            // InternalMyDsl.g:805:3: 
            {
            }

             after(grammarAccess.getClasseAccess().getClasseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__0__Impl"


    // $ANTLR start "rule__Classe__Group__1"
    // InternalMyDsl.g:813:1: rule__Classe__Group__1 : rule__Classe__Group__1__Impl rule__Classe__Group__2 ;
    public final void rule__Classe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:817:1: ( rule__Classe__Group__1__Impl rule__Classe__Group__2 )
            // InternalMyDsl.g:818:2: rule__Classe__Group__1__Impl rule__Classe__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Classe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1"


    // $ANTLR start "rule__Classe__Group__1__Impl"
    // InternalMyDsl.g:825:1: rule__Classe__Group__1__Impl : ( 'Classe' ) ;
    public final void rule__Classe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( ( 'Classe' ) )
            // InternalMyDsl.g:830:1: ( 'Classe' )
            {
            // InternalMyDsl.g:830:1: ( 'Classe' )
            // InternalMyDsl.g:831:2: 'Classe'
            {
             before(grammarAccess.getClasseAccess().getClasseKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getClasseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__1__Impl"


    // $ANTLR start "rule__Classe__Group__2"
    // InternalMyDsl.g:840:1: rule__Classe__Group__2 : rule__Classe__Group__2__Impl rule__Classe__Group__3 ;
    public final void rule__Classe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( rule__Classe__Group__2__Impl rule__Classe__Group__3 )
            // InternalMyDsl.g:845:2: rule__Classe__Group__2__Impl rule__Classe__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Classe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2"


    // $ANTLR start "rule__Classe__Group__2__Impl"
    // InternalMyDsl.g:852:1: rule__Classe__Group__2__Impl : ( ( rule__Classe__NomAssignment_2 ) ) ;
    public final void rule__Classe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( ( rule__Classe__NomAssignment_2 ) ) )
            // InternalMyDsl.g:857:1: ( ( rule__Classe__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:857:1: ( ( rule__Classe__NomAssignment_2 ) )
            // InternalMyDsl.g:858:2: ( rule__Classe__NomAssignment_2 )
            {
             before(grammarAccess.getClasseAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:859:2: ( rule__Classe__NomAssignment_2 )
            // InternalMyDsl.g:859:3: rule__Classe__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Classe__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__2__Impl"


    // $ANTLR start "rule__Classe__Group__3"
    // InternalMyDsl.g:867:1: rule__Classe__Group__3 : rule__Classe__Group__3__Impl rule__Classe__Group__4 ;
    public final void rule__Classe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:871:1: ( rule__Classe__Group__3__Impl rule__Classe__Group__4 )
            // InternalMyDsl.g:872:2: rule__Classe__Group__3__Impl rule__Classe__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3"


    // $ANTLR start "rule__Classe__Group__3__Impl"
    // InternalMyDsl.g:879:1: rule__Classe__Group__3__Impl : ( '{' ) ;
    public final void rule__Classe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( '{' ) )
            // InternalMyDsl.g:884:1: ( '{' )
            {
            // InternalMyDsl.g:884:1: ( '{' )
            // InternalMyDsl.g:885:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__3__Impl"


    // $ANTLR start "rule__Classe__Group__4"
    // InternalMyDsl.g:894:1: rule__Classe__Group__4 : rule__Classe__Group__4__Impl rule__Classe__Group__5 ;
    public final void rule__Classe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( rule__Classe__Group__4__Impl rule__Classe__Group__5 )
            // InternalMyDsl.g:899:2: rule__Classe__Group__4__Impl rule__Classe__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4"


    // $ANTLR start "rule__Classe__Group__4__Impl"
    // InternalMyDsl.g:906:1: rule__Classe__Group__4__Impl : ( ( rule__Classe__Alternatives_4 )* ) ;
    public final void rule__Classe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( ( rule__Classe__Alternatives_4 )* ) )
            // InternalMyDsl.g:911:1: ( ( rule__Classe__Alternatives_4 )* )
            {
            // InternalMyDsl.g:911:1: ( ( rule__Classe__Alternatives_4 )* )
            // InternalMyDsl.g:912:2: ( rule__Classe__Alternatives_4 )*
            {
             before(grammarAccess.getClasseAccess().getAlternatives_4()); 
            // InternalMyDsl.g:913:2: ( rule__Classe__Alternatives_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18||(LA7_0>=20 && LA7_0<=21)||LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:913:3: rule__Classe__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Classe__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__4__Impl"


    // $ANTLR start "rule__Classe__Group__5"
    // InternalMyDsl.g:921:1: rule__Classe__Group__5 : rule__Classe__Group__5__Impl rule__Classe__Group__6 ;
    public final void rule__Classe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( rule__Classe__Group__5__Impl rule__Classe__Group__6 )
            // InternalMyDsl.g:926:2: rule__Classe__Group__5__Impl rule__Classe__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__5"


    // $ANTLR start "rule__Classe__Group__5__Impl"
    // InternalMyDsl.g:933:1: rule__Classe__Group__5__Impl : ( ( rule__Classe__Group_5__0 )? ) ;
    public final void rule__Classe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:937:1: ( ( ( rule__Classe__Group_5__0 )? ) )
            // InternalMyDsl.g:938:1: ( ( rule__Classe__Group_5__0 )? )
            {
            // InternalMyDsl.g:938:1: ( ( rule__Classe__Group_5__0 )? )
            // InternalMyDsl.g:939:2: ( rule__Classe__Group_5__0 )?
            {
             before(grammarAccess.getClasseAccess().getGroup_5()); 
            // InternalMyDsl.g:940:2: ( rule__Classe__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:940:3: rule__Classe__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Classe__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClasseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__5__Impl"


    // $ANTLR start "rule__Classe__Group__6"
    // InternalMyDsl.g:948:1: rule__Classe__Group__6 : rule__Classe__Group__6__Impl rule__Classe__Group__7 ;
    public final void rule__Classe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( rule__Classe__Group__6__Impl rule__Classe__Group__7 )
            // InternalMyDsl.g:953:2: rule__Classe__Group__6__Impl rule__Classe__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Classe__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__6"


    // $ANTLR start "rule__Classe__Group__6__Impl"
    // InternalMyDsl.g:960:1: rule__Classe__Group__6__Impl : ( 'Abstraite=' ) ;
    public final void rule__Classe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:964:1: ( ( 'Abstraite=' ) )
            // InternalMyDsl.g:965:1: ( 'Abstraite=' )
            {
            // InternalMyDsl.g:965:1: ( 'Abstraite=' )
            // InternalMyDsl.g:966:2: 'Abstraite='
            {
             before(grammarAccess.getClasseAccess().getAbstraiteKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getAbstraiteKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__6__Impl"


    // $ANTLR start "rule__Classe__Group__7"
    // InternalMyDsl.g:975:1: rule__Classe__Group__7 : rule__Classe__Group__7__Impl rule__Classe__Group__8 ;
    public final void rule__Classe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( rule__Classe__Group__7__Impl rule__Classe__Group__8 )
            // InternalMyDsl.g:980:2: rule__Classe__Group__7__Impl rule__Classe__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Classe__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__7"


    // $ANTLR start "rule__Classe__Group__7__Impl"
    // InternalMyDsl.g:987:1: rule__Classe__Group__7__Impl : ( ( rule__Classe__ClasseAbstraiteAssignment_7 ) ) ;
    public final void rule__Classe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( ( rule__Classe__ClasseAbstraiteAssignment_7 ) ) )
            // InternalMyDsl.g:992:1: ( ( rule__Classe__ClasseAbstraiteAssignment_7 ) )
            {
            // InternalMyDsl.g:992:1: ( ( rule__Classe__ClasseAbstraiteAssignment_7 ) )
            // InternalMyDsl.g:993:2: ( rule__Classe__ClasseAbstraiteAssignment_7 )
            {
             before(grammarAccess.getClasseAccess().getClasseAbstraiteAssignment_7()); 
            // InternalMyDsl.g:994:2: ( rule__Classe__ClasseAbstraiteAssignment_7 )
            // InternalMyDsl.g:994:3: rule__Classe__ClasseAbstraiteAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Classe__ClasseAbstraiteAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getClasseAbstraiteAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__7__Impl"


    // $ANTLR start "rule__Classe__Group__8"
    // InternalMyDsl.g:1002:1: rule__Classe__Group__8 : rule__Classe__Group__8__Impl ;
    public final void rule__Classe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( rule__Classe__Group__8__Impl )
            // InternalMyDsl.g:1007:2: rule__Classe__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__8"


    // $ANTLR start "rule__Classe__Group__8__Impl"
    // InternalMyDsl.g:1013:1: rule__Classe__Group__8__Impl : ( '}' ) ;
    public final void rule__Classe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( '}' ) )
            // InternalMyDsl.g:1018:1: ( '}' )
            {
            // InternalMyDsl.g:1018:1: ( '}' )
            // InternalMyDsl.g:1019:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group__8__Impl"


    // $ANTLR start "rule__Classe__Group_4_2__0"
    // InternalMyDsl.g:1029:1: rule__Classe__Group_4_2__0 : rule__Classe__Group_4_2__0__Impl rule__Classe__Group_4_2__1 ;
    public final void rule__Classe__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( rule__Classe__Group_4_2__0__Impl rule__Classe__Group_4_2__1 )
            // InternalMyDsl.g:1034:2: rule__Classe__Group_4_2__0__Impl rule__Classe__Group_4_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Classe__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_4_2__0"


    // $ANTLR start "rule__Classe__Group_4_2__0__Impl"
    // InternalMyDsl.g:1041:1: rule__Classe__Group_4_2__0__Impl : ( 'Sous-Classe' ) ;
    public final void rule__Classe__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1045:1: ( ( 'Sous-Classe' ) )
            // InternalMyDsl.g:1046:1: ( 'Sous-Classe' )
            {
            // InternalMyDsl.g:1046:1: ( 'Sous-Classe' )
            // InternalMyDsl.g:1047:2: 'Sous-Classe'
            {
             before(grammarAccess.getClasseAccess().getSousClasseKeyword_4_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSousClasseKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_4_2__0__Impl"


    // $ANTLR start "rule__Classe__Group_4_2__1"
    // InternalMyDsl.g:1056:1: rule__Classe__Group_4_2__1 : rule__Classe__Group_4_2__1__Impl ;
    public final void rule__Classe__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( rule__Classe__Group_4_2__1__Impl )
            // InternalMyDsl.g:1061:2: rule__Classe__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_4_2__1"


    // $ANTLR start "rule__Classe__Group_4_2__1__Impl"
    // InternalMyDsl.g:1067:1: rule__Classe__Group_4_2__1__Impl : ( ( rule__Classe__SousClassesAssignment_4_2_1 ) ) ;
    public final void rule__Classe__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( ( ( rule__Classe__SousClassesAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:1072:1: ( ( rule__Classe__SousClassesAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:1072:1: ( ( rule__Classe__SousClassesAssignment_4_2_1 ) )
            // InternalMyDsl.g:1073:2: ( rule__Classe__SousClassesAssignment_4_2_1 )
            {
             before(grammarAccess.getClasseAccess().getSousClassesAssignment_4_2_1()); 
            // InternalMyDsl.g:1074:2: ( rule__Classe__SousClassesAssignment_4_2_1 )
            // InternalMyDsl.g:1074:3: rule__Classe__SousClassesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__SousClassesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getSousClassesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_4_2__1__Impl"


    // $ANTLR start "rule__Classe__Group_5__0"
    // InternalMyDsl.g:1083:1: rule__Classe__Group_5__0 : rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1 ;
    public final void rule__Classe__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1 )
            // InternalMyDsl.g:1088:2: rule__Classe__Group_5__0__Impl rule__Classe__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Classe__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__0"


    // $ANTLR start "rule__Classe__Group_5__0__Impl"
    // InternalMyDsl.g:1095:1: rule__Classe__Group_5__0__Impl : ( 'Super-Classe' ) ;
    public final void rule__Classe__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( ( 'Super-Classe' ) )
            // InternalMyDsl.g:1100:1: ( 'Super-Classe' )
            {
            // InternalMyDsl.g:1100:1: ( 'Super-Classe' )
            // InternalMyDsl.g:1101:2: 'Super-Classe'
            {
             before(grammarAccess.getClasseAccess().getSuperClasseKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSuperClasseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__0__Impl"


    // $ANTLR start "rule__Classe__Group_5__1"
    // InternalMyDsl.g:1110:1: rule__Classe__Group_5__1 : rule__Classe__Group_5__1__Impl ;
    public final void rule__Classe__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1114:1: ( rule__Classe__Group_5__1__Impl )
            // InternalMyDsl.g:1115:2: rule__Classe__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__1"


    // $ANTLR start "rule__Classe__Group_5__1__Impl"
    // InternalMyDsl.g:1121:1: rule__Classe__Group_5__1__Impl : ( ( rule__Classe__SuperClasseAssignment_5_1 ) ) ;
    public final void rule__Classe__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( ( ( rule__Classe__SuperClasseAssignment_5_1 ) ) )
            // InternalMyDsl.g:1126:1: ( ( rule__Classe__SuperClasseAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1126:1: ( ( rule__Classe__SuperClasseAssignment_5_1 ) )
            // InternalMyDsl.g:1127:2: ( rule__Classe__SuperClasseAssignment_5_1 )
            {
             before(grammarAccess.getClasseAccess().getSuperClasseAssignment_5_1()); 
            // InternalMyDsl.g:1128:2: ( rule__Classe__SuperClasseAssignment_5_1 )
            // InternalMyDsl.g:1128:3: rule__Classe__SuperClasseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__SuperClasseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getSuperClasseAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__Group_5__1__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalMyDsl.g:1137:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalMyDsl.g:1142:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Attribut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0"


    // $ANTLR start "rule__Attribut__Group__0__Impl"
    // InternalMyDsl.g:1149:1: rule__Attribut__Group__0__Impl : ( 'Attribut' ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( ( 'Attribut' ) )
            // InternalMyDsl.g:1154:1: ( 'Attribut' )
            {
            // InternalMyDsl.g:1154:1: ( 'Attribut' )
            // InternalMyDsl.g:1155:2: 'Attribut'
            {
             before(grammarAccess.getAttributAccess().getAttributKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getAttributKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__0__Impl"


    // $ANTLR start "rule__Attribut__Group__1"
    // InternalMyDsl.g:1164:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalMyDsl.g:1169:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1"


    // $ANTLR start "rule__Attribut__Group__1__Impl"
    // InternalMyDsl.g:1176:1: rule__Attribut__Group__1__Impl : ( ( rule__Attribut__TypeAssignment_1 ) ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1180:1: ( ( ( rule__Attribut__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:1181:1: ( ( rule__Attribut__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:1181:1: ( ( rule__Attribut__TypeAssignment_1 ) )
            // InternalMyDsl.g:1182:2: ( rule__Attribut__TypeAssignment_1 )
            {
             before(grammarAccess.getAttributAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:1183:2: ( rule__Attribut__TypeAssignment_1 )
            // InternalMyDsl.g:1183:3: rule__Attribut__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__1__Impl"


    // $ANTLR start "rule__Attribut__Group__2"
    // InternalMyDsl.g:1191:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( rule__Attribut__Group__2__Impl )
            // InternalMyDsl.g:1196:2: rule__Attribut__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2"


    // $ANTLR start "rule__Attribut__Group__2__Impl"
    // InternalMyDsl.g:1202:1: rule__Attribut__Group__2__Impl : ( ( rule__Attribut__NomAssignment_2 ) ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( ( ( rule__Attribut__NomAssignment_2 ) ) )
            // InternalMyDsl.g:1207:1: ( ( rule__Attribut__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:1207:1: ( ( rule__Attribut__NomAssignment_2 ) )
            // InternalMyDsl.g:1208:2: ( rule__Attribut__NomAssignment_2 )
            {
             before(grammarAccess.getAttributAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:1209:2: ( rule__Attribut__NomAssignment_2 )
            // InternalMyDsl.g:1209:3: rule__Attribut__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__0"
    // InternalMyDsl.g:1218:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // InternalMyDsl.g:1223:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0"


    // $ANTLR start "rule__Methode__Group__0__Impl"
    // InternalMyDsl.g:1230:1: rule__Methode__Group__0__Impl : ( () ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( () ) )
            // InternalMyDsl.g:1235:1: ( () )
            {
            // InternalMyDsl.g:1235:1: ( () )
            // InternalMyDsl.g:1236:2: ()
            {
             before(grammarAccess.getMethodeAccess().getMethodeAction_0()); 
            // InternalMyDsl.g:1237:2: ()
            // InternalMyDsl.g:1237:3: 
            {
            }

             after(grammarAccess.getMethodeAccess().getMethodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0__Impl"


    // $ANTLR start "rule__Methode__Group__1"
    // InternalMyDsl.g:1245:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // InternalMyDsl.g:1250:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1"


    // $ANTLR start "rule__Methode__Group__1__Impl"
    // InternalMyDsl.g:1257:1: rule__Methode__Group__1__Impl : ( 'Methode' ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( 'Methode' ) )
            // InternalMyDsl.g:1262:1: ( 'Methode' )
            {
            // InternalMyDsl.g:1262:1: ( 'Methode' )
            // InternalMyDsl.g:1263:2: 'Methode'
            {
             before(grammarAccess.getMethodeAccess().getMethodeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getMethodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1__Impl"


    // $ANTLR start "rule__Methode__Group__2"
    // InternalMyDsl.g:1272:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // InternalMyDsl.g:1277:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2"


    // $ANTLR start "rule__Methode__Group__2__Impl"
    // InternalMyDsl.g:1284:1: rule__Methode__Group__2__Impl : ( ( rule__Methode__TypeDeRetourAssignment_2 ) ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ( rule__Methode__TypeDeRetourAssignment_2 ) ) )
            // InternalMyDsl.g:1289:1: ( ( rule__Methode__TypeDeRetourAssignment_2 ) )
            {
            // InternalMyDsl.g:1289:1: ( ( rule__Methode__TypeDeRetourAssignment_2 ) )
            // InternalMyDsl.g:1290:2: ( rule__Methode__TypeDeRetourAssignment_2 )
            {
             before(grammarAccess.getMethodeAccess().getTypeDeRetourAssignment_2()); 
            // InternalMyDsl.g:1291:2: ( rule__Methode__TypeDeRetourAssignment_2 )
            // InternalMyDsl.g:1291:3: rule__Methode__TypeDeRetourAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Methode__TypeDeRetourAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getTypeDeRetourAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__3"
    // InternalMyDsl.g:1299:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // InternalMyDsl.g:1304:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3"


    // $ANTLR start "rule__Methode__Group__3__Impl"
    // InternalMyDsl.g:1311:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__NomAssignment_3 ) ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ( rule__Methode__NomAssignment_3 ) ) )
            // InternalMyDsl.g:1316:1: ( ( rule__Methode__NomAssignment_3 ) )
            {
            // InternalMyDsl.g:1316:1: ( ( rule__Methode__NomAssignment_3 ) )
            // InternalMyDsl.g:1317:2: ( rule__Methode__NomAssignment_3 )
            {
             before(grammarAccess.getMethodeAccess().getNomAssignment_3()); 
            // InternalMyDsl.g:1318:2: ( rule__Methode__NomAssignment_3 )
            // InternalMyDsl.g:1318:3: rule__Methode__NomAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Methode__NomAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNomAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3__Impl"


    // $ANTLR start "rule__Methode__Group__4"
    // InternalMyDsl.g:1326:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // InternalMyDsl.g:1331:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Methode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4"


    // $ANTLR start "rule__Methode__Group__4__Impl"
    // InternalMyDsl.g:1338:1: rule__Methode__Group__4__Impl : ( '(' ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( '(' ) )
            // InternalMyDsl.g:1343:1: ( '(' )
            {
            // InternalMyDsl.g:1343:1: ( '(' )
            // InternalMyDsl.g:1344:2: '('
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4__Impl"


    // $ANTLR start "rule__Methode__Group__5"
    // InternalMyDsl.g:1353:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // InternalMyDsl.g:1358:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Methode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5"


    // $ANTLR start "rule__Methode__Group__5__Impl"
    // InternalMyDsl.g:1365:1: rule__Methode__Group__5__Impl : ( ( rule__Methode__ParametresAssignment_5 )* ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( ( ( rule__Methode__ParametresAssignment_5 )* ) )
            // InternalMyDsl.g:1370:1: ( ( rule__Methode__ParametresAssignment_5 )* )
            {
            // InternalMyDsl.g:1370:1: ( ( rule__Methode__ParametresAssignment_5 )* )
            // InternalMyDsl.g:1371:2: ( rule__Methode__ParametresAssignment_5 )*
            {
             before(grammarAccess.getMethodeAccess().getParametresAssignment_5()); 
            // InternalMyDsl.g:1372:2: ( rule__Methode__ParametresAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1372:3: rule__Methode__ParametresAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Methode__ParametresAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getParametresAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5__Impl"


    // $ANTLR start "rule__Methode__Group__6"
    // InternalMyDsl.g:1380:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl rule__Methode__Group__7 ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( rule__Methode__Group__6__Impl rule__Methode__Group__7 )
            // InternalMyDsl.g:1385:2: rule__Methode__Group__6__Impl rule__Methode__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Methode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6"


    // $ANTLR start "rule__Methode__Group__6__Impl"
    // InternalMyDsl.g:1392:1: rule__Methode__Group__6__Impl : ( ')' ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( ')' ) )
            // InternalMyDsl.g:1397:1: ( ')' )
            {
            // InternalMyDsl.g:1397:1: ( ')' )
            // InternalMyDsl.g:1398:2: ')'
            {
             before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6__Impl"


    // $ANTLR start "rule__Methode__Group__7"
    // InternalMyDsl.g:1407:1: rule__Methode__Group__7 : rule__Methode__Group__7__Impl rule__Methode__Group__8 ;
    public final void rule__Methode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__Methode__Group__7__Impl rule__Methode__Group__8 )
            // InternalMyDsl.g:1412:2: rule__Methode__Group__7__Impl rule__Methode__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Methode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__7"


    // $ANTLR start "rule__Methode__Group__7__Impl"
    // InternalMyDsl.g:1419:1: rule__Methode__Group__7__Impl : ( 'Abstraite=' ) ;
    public final void rule__Methode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( 'Abstraite=' ) )
            // InternalMyDsl.g:1424:1: ( 'Abstraite=' )
            {
            // InternalMyDsl.g:1424:1: ( 'Abstraite=' )
            // InternalMyDsl.g:1425:2: 'Abstraite='
            {
             before(grammarAccess.getMethodeAccess().getAbstraiteKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getAbstraiteKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__7__Impl"


    // $ANTLR start "rule__Methode__Group__8"
    // InternalMyDsl.g:1434:1: rule__Methode__Group__8 : rule__Methode__Group__8__Impl ;
    public final void rule__Methode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__Methode__Group__8__Impl )
            // InternalMyDsl.g:1439:2: rule__Methode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__8"


    // $ANTLR start "rule__Methode__Group__8__Impl"
    // InternalMyDsl.g:1445:1: rule__Methode__Group__8__Impl : ( ( rule__Methode__MethodeAbstraiteAssignment_8 ) ) ;
    public final void rule__Methode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ( rule__Methode__MethodeAbstraiteAssignment_8 ) ) )
            // InternalMyDsl.g:1450:1: ( ( rule__Methode__MethodeAbstraiteAssignment_8 ) )
            {
            // InternalMyDsl.g:1450:1: ( ( rule__Methode__MethodeAbstraiteAssignment_8 ) )
            // InternalMyDsl.g:1451:2: ( rule__Methode__MethodeAbstraiteAssignment_8 )
            {
             before(grammarAccess.getMethodeAccess().getMethodeAbstraiteAssignment_8()); 
            // InternalMyDsl.g:1452:2: ( rule__Methode__MethodeAbstraiteAssignment_8 )
            // InternalMyDsl.g:1452:3: rule__Methode__MethodeAbstraiteAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Methode__MethodeAbstraiteAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getMethodeAbstraiteAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__8__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalMyDsl.g:1461:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalMyDsl.g:1466:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalMyDsl.g:1473:1: rule__Association__Group__0__Impl : ( () ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( () ) )
            // InternalMyDsl.g:1478:1: ( () )
            {
            // InternalMyDsl.g:1478:1: ( () )
            // InternalMyDsl.g:1479:2: ()
            {
             before(grammarAccess.getAssociationAccess().getAssociationAction_0()); 
            // InternalMyDsl.g:1480:2: ()
            // InternalMyDsl.g:1480:3: 
            {
            }

             after(grammarAccess.getAssociationAccess().getAssociationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalMyDsl.g:1488:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalMyDsl.g:1493:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalMyDsl.g:1500:1: rule__Association__Group__1__Impl : ( 'Association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( 'Association' ) )
            // InternalMyDsl.g:1505:1: ( 'Association' )
            {
            // InternalMyDsl.g:1505:1: ( 'Association' )
            // InternalMyDsl.g:1506:2: 'Association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalMyDsl.g:1515:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalMyDsl.g:1520:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalMyDsl.g:1527:1: rule__Association__Group__2__Impl : ( ( rule__Association__NomAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ( rule__Association__NomAssignment_2 ) ) )
            // InternalMyDsl.g:1532:1: ( ( rule__Association__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:1532:1: ( ( rule__Association__NomAssignment_2 ) )
            // InternalMyDsl.g:1533:2: ( rule__Association__NomAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:1534:2: ( rule__Association__NomAssignment_2 )
            // InternalMyDsl.g:1534:3: rule__Association__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalMyDsl.g:1542:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalMyDsl.g:1547:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalMyDsl.g:1554:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1558:1: ( ( '{' ) )
            // InternalMyDsl.g:1559:1: ( '{' )
            {
            // InternalMyDsl.g:1559:1: ( '{' )
            // InternalMyDsl.g:1560:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalMyDsl.g:1569:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalMyDsl.g:1574:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalMyDsl.g:1581:1: rule__Association__Group__4__Impl : ( ( rule__Association__CardinalitesAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( ( rule__Association__CardinalitesAssignment_4 ) ) )
            // InternalMyDsl.g:1586:1: ( ( rule__Association__CardinalitesAssignment_4 ) )
            {
            // InternalMyDsl.g:1586:1: ( ( rule__Association__CardinalitesAssignment_4 ) )
            // InternalMyDsl.g:1587:2: ( rule__Association__CardinalitesAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getCardinalitesAssignment_4()); 
            // InternalMyDsl.g:1588:2: ( rule__Association__CardinalitesAssignment_4 )
            // InternalMyDsl.g:1588:3: rule__Association__CardinalitesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Association__CardinalitesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getCardinalitesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalMyDsl.g:1596:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalMyDsl.g:1601:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalMyDsl.g:1608:1: rule__Association__Group__5__Impl : ( ( ( rule__Association__CardinalitesAssignment_5 ) ) ( ( rule__Association__CardinalitesAssignment_5 )* ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( ( ( ( rule__Association__CardinalitesAssignment_5 ) ) ( ( rule__Association__CardinalitesAssignment_5 )* ) ) )
            // InternalMyDsl.g:1613:1: ( ( ( rule__Association__CardinalitesAssignment_5 ) ) ( ( rule__Association__CardinalitesAssignment_5 )* ) )
            {
            // InternalMyDsl.g:1613:1: ( ( ( rule__Association__CardinalitesAssignment_5 ) ) ( ( rule__Association__CardinalitesAssignment_5 )* ) )
            // InternalMyDsl.g:1614:2: ( ( rule__Association__CardinalitesAssignment_5 ) ) ( ( rule__Association__CardinalitesAssignment_5 )* )
            {
            // InternalMyDsl.g:1614:2: ( ( rule__Association__CardinalitesAssignment_5 ) )
            // InternalMyDsl.g:1615:3: ( rule__Association__CardinalitesAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getCardinalitesAssignment_5()); 
            // InternalMyDsl.g:1616:3: ( rule__Association__CardinalitesAssignment_5 )
            // InternalMyDsl.g:1616:4: rule__Association__CardinalitesAssignment_5
            {
            pushFollow(FOLLOW_22);
            rule__Association__CardinalitesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getCardinalitesAssignment_5()); 

            }

            // InternalMyDsl.g:1619:2: ( ( rule__Association__CardinalitesAssignment_5 )* )
            // InternalMyDsl.g:1620:3: ( rule__Association__CardinalitesAssignment_5 )*
            {
             before(grammarAccess.getAssociationAccess().getCardinalitesAssignment_5()); 
            // InternalMyDsl.g:1621:3: ( rule__Association__CardinalitesAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1621:4: rule__Association__CardinalitesAssignment_5
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Association__CardinalitesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getCardinalitesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalMyDsl.g:1630:1: rule__Association__Group__6 : rule__Association__Group__6__Impl ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1634:1: ( rule__Association__Group__6__Impl )
            // InternalMyDsl.g:1635:2: rule__Association__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalMyDsl.g:1641:1: rule__Association__Group__6__Impl : ( '}' ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( ( '}' ) )
            // InternalMyDsl.g:1646:1: ( '}' )
            {
            // InternalMyDsl.g:1646:1: ( '}' )
            // InternalMyDsl.g:1647:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Cardinalite__Group__0"
    // InternalMyDsl.g:1657:1: rule__Cardinalite__Group__0 : rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1 ;
    public final void rule__Cardinalite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1661:1: ( rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1 )
            // InternalMyDsl.g:1662:2: rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cardinalite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__0"


    // $ANTLR start "rule__Cardinalite__Group__0__Impl"
    // InternalMyDsl.g:1669:1: rule__Cardinalite__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Cardinalite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1673:1: ( ( 'Role' ) )
            // InternalMyDsl.g:1674:1: ( 'Role' )
            {
            // InternalMyDsl.g:1674:1: ( 'Role' )
            // InternalMyDsl.g:1675:2: 'Role'
            {
             before(grammarAccess.getCardinaliteAccess().getRoleKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__0__Impl"


    // $ANTLR start "rule__Cardinalite__Group__1"
    // InternalMyDsl.g:1684:1: rule__Cardinalite__Group__1 : rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2 ;
    public final void rule__Cardinalite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1688:1: ( rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2 )
            // InternalMyDsl.g:1689:2: rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Cardinalite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__1"


    // $ANTLR start "rule__Cardinalite__Group__1__Impl"
    // InternalMyDsl.g:1696:1: rule__Cardinalite__Group__1__Impl : ( ( rule__Cardinalite__NomAssignment_1 ) ) ;
    public final void rule__Cardinalite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1700:1: ( ( ( rule__Cardinalite__NomAssignment_1 ) ) )
            // InternalMyDsl.g:1701:1: ( ( rule__Cardinalite__NomAssignment_1 ) )
            {
            // InternalMyDsl.g:1701:1: ( ( rule__Cardinalite__NomAssignment_1 ) )
            // InternalMyDsl.g:1702:2: ( rule__Cardinalite__NomAssignment_1 )
            {
             before(grammarAccess.getCardinaliteAccess().getNomAssignment_1()); 
            // InternalMyDsl.g:1703:2: ( rule__Cardinalite__NomAssignment_1 )
            // InternalMyDsl.g:1703:3: rule__Cardinalite__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinaliteAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__1__Impl"


    // $ANTLR start "rule__Cardinalite__Group__2"
    // InternalMyDsl.g:1711:1: rule__Cardinalite__Group__2 : rule__Cardinalite__Group__2__Impl rule__Cardinalite__Group__3 ;
    public final void rule__Cardinalite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1715:1: ( rule__Cardinalite__Group__2__Impl rule__Cardinalite__Group__3 )
            // InternalMyDsl.g:1716:2: rule__Cardinalite__Group__2__Impl rule__Cardinalite__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Cardinalite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__2"


    // $ANTLR start "rule__Cardinalite__Group__2__Impl"
    // InternalMyDsl.g:1723:1: rule__Cardinalite__Group__2__Impl : ( '[' ) ;
    public final void rule__Cardinalite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1727:1: ( ( '[' ) )
            // InternalMyDsl.g:1728:1: ( '[' )
            {
            // InternalMyDsl.g:1728:1: ( '[' )
            // InternalMyDsl.g:1729:2: '['
            {
             before(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__2__Impl"


    // $ANTLR start "rule__Cardinalite__Group__3"
    // InternalMyDsl.g:1738:1: rule__Cardinalite__Group__3 : rule__Cardinalite__Group__3__Impl rule__Cardinalite__Group__4 ;
    public final void rule__Cardinalite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( rule__Cardinalite__Group__3__Impl rule__Cardinalite__Group__4 )
            // InternalMyDsl.g:1743:2: rule__Cardinalite__Group__3__Impl rule__Cardinalite__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Cardinalite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__3"


    // $ANTLR start "rule__Cardinalite__Group__3__Impl"
    // InternalMyDsl.g:1750:1: rule__Cardinalite__Group__3__Impl : ( ( rule__Cardinalite__MultipliciteInfAssignment_3 ) ) ;
    public final void rule__Cardinalite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1754:1: ( ( ( rule__Cardinalite__MultipliciteInfAssignment_3 ) ) )
            // InternalMyDsl.g:1755:1: ( ( rule__Cardinalite__MultipliciteInfAssignment_3 ) )
            {
            // InternalMyDsl.g:1755:1: ( ( rule__Cardinalite__MultipliciteInfAssignment_3 ) )
            // InternalMyDsl.g:1756:2: ( rule__Cardinalite__MultipliciteInfAssignment_3 )
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteInfAssignment_3()); 
            // InternalMyDsl.g:1757:2: ( rule__Cardinalite__MultipliciteInfAssignment_3 )
            // InternalMyDsl.g:1757:3: rule__Cardinalite__MultipliciteInfAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__MultipliciteInfAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCardinaliteAccess().getMultipliciteInfAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__3__Impl"


    // $ANTLR start "rule__Cardinalite__Group__4"
    // InternalMyDsl.g:1765:1: rule__Cardinalite__Group__4 : rule__Cardinalite__Group__4__Impl rule__Cardinalite__Group__5 ;
    public final void rule__Cardinalite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1769:1: ( rule__Cardinalite__Group__4__Impl rule__Cardinalite__Group__5 )
            // InternalMyDsl.g:1770:2: rule__Cardinalite__Group__4__Impl rule__Cardinalite__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Cardinalite__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__4"


    // $ANTLR start "rule__Cardinalite__Group__4__Impl"
    // InternalMyDsl.g:1777:1: rule__Cardinalite__Group__4__Impl : ( '..' ) ;
    public final void rule__Cardinalite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1781:1: ( ( '..' ) )
            // InternalMyDsl.g:1782:1: ( '..' )
            {
            // InternalMyDsl.g:1782:1: ( '..' )
            // InternalMyDsl.g:1783:2: '..'
            {
             before(grammarAccess.getCardinaliteAccess().getFullStopFullStopKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getFullStopFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__4__Impl"


    // $ANTLR start "rule__Cardinalite__Group__5"
    // InternalMyDsl.g:1792:1: rule__Cardinalite__Group__5 : rule__Cardinalite__Group__5__Impl rule__Cardinalite__Group__6 ;
    public final void rule__Cardinalite__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1796:1: ( rule__Cardinalite__Group__5__Impl rule__Cardinalite__Group__6 )
            // InternalMyDsl.g:1797:2: rule__Cardinalite__Group__5__Impl rule__Cardinalite__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Cardinalite__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__5"


    // $ANTLR start "rule__Cardinalite__Group__5__Impl"
    // InternalMyDsl.g:1804:1: rule__Cardinalite__Group__5__Impl : ( ( rule__Cardinalite__MultipliciteSupAssignment_5 ) ) ;
    public final void rule__Cardinalite__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1808:1: ( ( ( rule__Cardinalite__MultipliciteSupAssignment_5 ) ) )
            // InternalMyDsl.g:1809:1: ( ( rule__Cardinalite__MultipliciteSupAssignment_5 ) )
            {
            // InternalMyDsl.g:1809:1: ( ( rule__Cardinalite__MultipliciteSupAssignment_5 ) )
            // InternalMyDsl.g:1810:2: ( rule__Cardinalite__MultipliciteSupAssignment_5 )
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteSupAssignment_5()); 
            // InternalMyDsl.g:1811:2: ( rule__Cardinalite__MultipliciteSupAssignment_5 )
            // InternalMyDsl.g:1811:3: rule__Cardinalite__MultipliciteSupAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__MultipliciteSupAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCardinaliteAccess().getMultipliciteSupAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__5__Impl"


    // $ANTLR start "rule__Cardinalite__Group__6"
    // InternalMyDsl.g:1819:1: rule__Cardinalite__Group__6 : rule__Cardinalite__Group__6__Impl ;
    public final void rule__Cardinalite__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1823:1: ( rule__Cardinalite__Group__6__Impl )
            // InternalMyDsl.g:1824:2: rule__Cardinalite__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__6"


    // $ANTLR start "rule__Cardinalite__Group__6__Impl"
    // InternalMyDsl.g:1830:1: rule__Cardinalite__Group__6__Impl : ( ']' ) ;
    public final void rule__Cardinalite__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ']' ) )
            // InternalMyDsl.g:1835:1: ( ']' )
            {
            // InternalMyDsl.g:1835:1: ( ']' )
            // InternalMyDsl.g:1836:2: ']'
            {
             before(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__Group__6__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__0"
    // InternalMyDsl.g:1846:1: rule__TypeDonnee__Group__0 : rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1 ;
    public final void rule__TypeDonnee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1850:1: ( rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1 )
            // InternalMyDsl.g:1851:2: rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TypeDonnee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__0"


    // $ANTLR start "rule__TypeDonnee__Group__0__Impl"
    // InternalMyDsl.g:1858:1: rule__TypeDonnee__Group__0__Impl : ( () ) ;
    public final void rule__TypeDonnee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1862:1: ( ( () ) )
            // InternalMyDsl.g:1863:1: ( () )
            {
            // InternalMyDsl.g:1863:1: ( () )
            // InternalMyDsl.g:1864:2: ()
            {
             before(grammarAccess.getTypeDonneeAccess().getTypeDonneeAction_0()); 
            // InternalMyDsl.g:1865:2: ()
            // InternalMyDsl.g:1865:3: 
            {
            }

             after(grammarAccess.getTypeDonneeAccess().getTypeDonneeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__0__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__1"
    // InternalMyDsl.g:1873:1: rule__TypeDonnee__Group__1 : rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2 ;
    public final void rule__TypeDonnee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2 )
            // InternalMyDsl.g:1878:2: rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TypeDonnee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__1"


    // $ANTLR start "rule__TypeDonnee__Group__1__Impl"
    // InternalMyDsl.g:1885:1: rule__TypeDonnee__Group__1__Impl : ( 'TypeDonnee' ) ;
    public final void rule__TypeDonnee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1889:1: ( ( 'TypeDonnee' ) )
            // InternalMyDsl.g:1890:1: ( 'TypeDonnee' )
            {
            // InternalMyDsl.g:1890:1: ( 'TypeDonnee' )
            // InternalMyDsl.g:1891:2: 'TypeDonnee'
            {
             before(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__1__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__2"
    // InternalMyDsl.g:1900:1: rule__TypeDonnee__Group__2 : rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3 ;
    public final void rule__TypeDonnee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1904:1: ( rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3 )
            // InternalMyDsl.g:1905:2: rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TypeDonnee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__2"


    // $ANTLR start "rule__TypeDonnee__Group__2__Impl"
    // InternalMyDsl.g:1912:1: rule__TypeDonnee__Group__2__Impl : ( ( rule__TypeDonnee__NomAssignment_2 ) ) ;
    public final void rule__TypeDonnee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1916:1: ( ( ( rule__TypeDonnee__NomAssignment_2 ) ) )
            // InternalMyDsl.g:1917:1: ( ( rule__TypeDonnee__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:1917:1: ( ( rule__TypeDonnee__NomAssignment_2 ) )
            // InternalMyDsl.g:1918:2: ( rule__TypeDonnee__NomAssignment_2 )
            {
             before(grammarAccess.getTypeDonneeAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:1919:2: ( rule__TypeDonnee__NomAssignment_2 )
            // InternalMyDsl.g:1919:3: rule__TypeDonnee__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnee__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeDonneeAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__2__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__3"
    // InternalMyDsl.g:1927:1: rule__TypeDonnee__Group__3 : rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4 ;
    public final void rule__TypeDonnee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4 )
            // InternalMyDsl.g:1932:2: rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__TypeDonnee__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__3"


    // $ANTLR start "rule__TypeDonnee__Group__3__Impl"
    // InternalMyDsl.g:1939:1: rule__TypeDonnee__Group__3__Impl : ( '{' ) ;
    public final void rule__TypeDonnee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1943:1: ( ( '{' ) )
            // InternalMyDsl.g:1944:1: ( '{' )
            {
            // InternalMyDsl.g:1944:1: ( '{' )
            // InternalMyDsl.g:1945:2: '{'
            {
             before(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__3__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__4"
    // InternalMyDsl.g:1954:1: rule__TypeDonnee__Group__4 : rule__TypeDonnee__Group__4__Impl rule__TypeDonnee__Group__5 ;
    public final void rule__TypeDonnee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1958:1: ( rule__TypeDonnee__Group__4__Impl rule__TypeDonnee__Group__5 )
            // InternalMyDsl.g:1959:2: rule__TypeDonnee__Group__4__Impl rule__TypeDonnee__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__TypeDonnee__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__4"


    // $ANTLR start "rule__TypeDonnee__Group__4__Impl"
    // InternalMyDsl.g:1966:1: rule__TypeDonnee__Group__4__Impl : ( ( rule__TypeDonnee__AttributsAssignment_4 )* ) ;
    public final void rule__TypeDonnee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1970:1: ( ( ( rule__TypeDonnee__AttributsAssignment_4 )* ) )
            // InternalMyDsl.g:1971:1: ( ( rule__TypeDonnee__AttributsAssignment_4 )* )
            {
            // InternalMyDsl.g:1971:1: ( ( rule__TypeDonnee__AttributsAssignment_4 )* )
            // InternalMyDsl.g:1972:2: ( rule__TypeDonnee__AttributsAssignment_4 )*
            {
             before(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_4()); 
            // InternalMyDsl.g:1973:2: ( rule__TypeDonnee__AttributsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1973:3: rule__TypeDonnee__AttributsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypeDonnee__AttributsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__4__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__5"
    // InternalMyDsl.g:1981:1: rule__TypeDonnee__Group__5 : rule__TypeDonnee__Group__5__Impl ;
    public final void rule__TypeDonnee__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1985:1: ( rule__TypeDonnee__Group__5__Impl )
            // InternalMyDsl.g:1986:2: rule__TypeDonnee__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__5"


    // $ANTLR start "rule__TypeDonnee__Group__5__Impl"
    // InternalMyDsl.g:1992:1: rule__TypeDonnee__Group__5__Impl : ( '}' ) ;
    public final void rule__TypeDonnee__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( ( '}' ) )
            // InternalMyDsl.g:1997:1: ( '}' )
            {
            // InternalMyDsl.g:1997:1: ( '}' )
            // InternalMyDsl.g:1998:2: '}'
            {
             before(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalMyDsl.g:2008:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2012:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalMyDsl.g:2013:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalMyDsl.g:2020:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2024:1: ( ( () ) )
            // InternalMyDsl.g:2025:1: ( () )
            {
            // InternalMyDsl.g:2025:1: ( () )
            // InternalMyDsl.g:2026:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalMyDsl.g:2027:2: ()
            // InternalMyDsl.g:2027:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalMyDsl.g:2035:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2039:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalMyDsl.g:2040:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalMyDsl.g:2047:1: rule__Enumeration__Group__1__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2051:1: ( ( 'Enumeration' ) )
            // InternalMyDsl.g:2052:1: ( 'Enumeration' )
            {
            // InternalMyDsl.g:2052:1: ( 'Enumeration' )
            // InternalMyDsl.g:2053:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalMyDsl.g:2062:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalMyDsl.g:2067:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalMyDsl.g:2074:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NomAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ( rule__Enumeration__NomAssignment_2 ) ) )
            // InternalMyDsl.g:2079:1: ( ( rule__Enumeration__NomAssignment_2 ) )
            {
            // InternalMyDsl.g:2079:1: ( ( rule__Enumeration__NomAssignment_2 ) )
            // InternalMyDsl.g:2080:2: ( rule__Enumeration__NomAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNomAssignment_2()); 
            // InternalMyDsl.g:2081:2: ( rule__Enumeration__NomAssignment_2 )
            // InternalMyDsl.g:2081:3: rule__Enumeration__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalMyDsl.g:2089:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalMyDsl.g:2094:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalMyDsl.g:2101:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2105:1: ( ( '{' ) )
            // InternalMyDsl.g:2106:1: ( '{' )
            {
            // InternalMyDsl.g:2106:1: ( '{' )
            // InternalMyDsl.g:2107:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalMyDsl.g:2116:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalMyDsl.g:2121:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalMyDsl.g:2128:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__ElementsAssignment_4 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2132:1: ( ( ( rule__Enumeration__ElementsAssignment_4 )* ) )
            // InternalMyDsl.g:2133:1: ( ( rule__Enumeration__ElementsAssignment_4 )* )
            {
            // InternalMyDsl.g:2133:1: ( ( rule__Enumeration__ElementsAssignment_4 )* )
            // InternalMyDsl.g:2134:2: ( rule__Enumeration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getEnumerationAccess().getElementsAssignment_4()); 
            // InternalMyDsl.g:2135:2: ( rule__Enumeration__ElementsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2135:3: rule__Enumeration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Enumeration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalMyDsl.g:2143:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2147:1: ( rule__Enumeration__Group__5__Impl )
            // InternalMyDsl.g:2148:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalMyDsl.g:2154:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( ( '}' ) )
            // InternalMyDsl.g:2159:1: ( '}' )
            {
            // InternalMyDsl.g:2159:1: ( '}' )
            // InternalMyDsl.g:2160:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Chaine__Group__0"
    // InternalMyDsl.g:2170:1: rule__Chaine__Group__0 : rule__Chaine__Group__0__Impl rule__Chaine__Group__1 ;
    public final void rule__Chaine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2174:1: ( rule__Chaine__Group__0__Impl rule__Chaine__Group__1 )
            // InternalMyDsl.g:2175:2: rule__Chaine__Group__0__Impl rule__Chaine__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Chaine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chaine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chaine__Group__0"


    // $ANTLR start "rule__Chaine__Group__0__Impl"
    // InternalMyDsl.g:2182:1: rule__Chaine__Group__0__Impl : ( () ) ;
    public final void rule__Chaine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2186:1: ( ( () ) )
            // InternalMyDsl.g:2187:1: ( () )
            {
            // InternalMyDsl.g:2187:1: ( () )
            // InternalMyDsl.g:2188:2: ()
            {
             before(grammarAccess.getChaineAccess().getChaineAction_0()); 
            // InternalMyDsl.g:2189:2: ()
            // InternalMyDsl.g:2189:3: 
            {
            }

             after(grammarAccess.getChaineAccess().getChaineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chaine__Group__0__Impl"


    // $ANTLR start "rule__Chaine__Group__1"
    // InternalMyDsl.g:2197:1: rule__Chaine__Group__1 : rule__Chaine__Group__1__Impl ;
    public final void rule__Chaine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2201:1: ( rule__Chaine__Group__1__Impl )
            // InternalMyDsl.g:2202:2: rule__Chaine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chaine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chaine__Group__1"


    // $ANTLR start "rule__Chaine__Group__1__Impl"
    // InternalMyDsl.g:2208:1: rule__Chaine__Group__1__Impl : ( 'Chaine' ) ;
    public final void rule__Chaine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( ( 'Chaine' ) )
            // InternalMyDsl.g:2213:1: ( 'Chaine' )
            {
            // InternalMyDsl.g:2213:1: ( 'Chaine' )
            // InternalMyDsl.g:2214:2: 'Chaine'
            {
             before(grammarAccess.getChaineAccess().getChaineKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getChaineAccess().getChaineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chaine__Group__1__Impl"


    // $ANTLR start "rule__Entier__Group__0"
    // InternalMyDsl.g:2224:1: rule__Entier__Group__0 : rule__Entier__Group__0__Impl rule__Entier__Group__1 ;
    public final void rule__Entier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2228:1: ( rule__Entier__Group__0__Impl rule__Entier__Group__1 )
            // InternalMyDsl.g:2229:2: rule__Entier__Group__0__Impl rule__Entier__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Entier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entier__Group__0"


    // $ANTLR start "rule__Entier__Group__0__Impl"
    // InternalMyDsl.g:2236:1: rule__Entier__Group__0__Impl : ( () ) ;
    public final void rule__Entier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2240:1: ( ( () ) )
            // InternalMyDsl.g:2241:1: ( () )
            {
            // InternalMyDsl.g:2241:1: ( () )
            // InternalMyDsl.g:2242:2: ()
            {
             before(grammarAccess.getEntierAccess().getEntierAction_0()); 
            // InternalMyDsl.g:2243:2: ()
            // InternalMyDsl.g:2243:3: 
            {
            }

             after(grammarAccess.getEntierAccess().getEntierAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entier__Group__0__Impl"


    // $ANTLR start "rule__Entier__Group__1"
    // InternalMyDsl.g:2251:1: rule__Entier__Group__1 : rule__Entier__Group__1__Impl ;
    public final void rule__Entier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( rule__Entier__Group__1__Impl )
            // InternalMyDsl.g:2256:2: rule__Entier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entier__Group__1"


    // $ANTLR start "rule__Entier__Group__1__Impl"
    // InternalMyDsl.g:2262:1: rule__Entier__Group__1__Impl : ( 'Entier' ) ;
    public final void rule__Entier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( 'Entier' ) )
            // InternalMyDsl.g:2267:1: ( 'Entier' )
            {
            // InternalMyDsl.g:2267:1: ( 'Entier' )
            // InternalMyDsl.g:2268:2: 'Entier'
            {
             before(grammarAccess.getEntierAccess().getEntierKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntierAccess().getEntierKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entier__Group__1__Impl"


    // $ANTLR start "rule__Booleen__Group__0"
    // InternalMyDsl.g:2278:1: rule__Booleen__Group__0 : rule__Booleen__Group__0__Impl rule__Booleen__Group__1 ;
    public final void rule__Booleen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2282:1: ( rule__Booleen__Group__0__Impl rule__Booleen__Group__1 )
            // InternalMyDsl.g:2283:2: rule__Booleen__Group__0__Impl rule__Booleen__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Booleen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Booleen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleen__Group__0"


    // $ANTLR start "rule__Booleen__Group__0__Impl"
    // InternalMyDsl.g:2290:1: rule__Booleen__Group__0__Impl : ( () ) ;
    public final void rule__Booleen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2294:1: ( ( () ) )
            // InternalMyDsl.g:2295:1: ( () )
            {
            // InternalMyDsl.g:2295:1: ( () )
            // InternalMyDsl.g:2296:2: ()
            {
             before(grammarAccess.getBooleenAccess().getBooleenAction_0()); 
            // InternalMyDsl.g:2297:2: ()
            // InternalMyDsl.g:2297:3: 
            {
            }

             after(grammarAccess.getBooleenAccess().getBooleenAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleen__Group__0__Impl"


    // $ANTLR start "rule__Booleen__Group__1"
    // InternalMyDsl.g:2305:1: rule__Booleen__Group__1 : rule__Booleen__Group__1__Impl ;
    public final void rule__Booleen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( rule__Booleen__Group__1__Impl )
            // InternalMyDsl.g:2310:2: rule__Booleen__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleen__Group__1"


    // $ANTLR start "rule__Booleen__Group__1__Impl"
    // InternalMyDsl.g:2316:1: rule__Booleen__Group__1__Impl : ( 'Booleen' ) ;
    public final void rule__Booleen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( ( 'Booleen' ) )
            // InternalMyDsl.g:2321:1: ( 'Booleen' )
            {
            // InternalMyDsl.g:2321:1: ( 'Booleen' )
            // InternalMyDsl.g:2322:2: 'Booleen'
            {
             before(grammarAccess.getBooleenAccess().getBooleenKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBooleenAccess().getBooleenKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Booleen__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2332:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2336:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2337:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2344:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2348:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2349:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2349:1: ( ( '-' )? )
            // InternalMyDsl.g:2350:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2351:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2351:3: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2359:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2363:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2364:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2370:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2375:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2375:1: ( RULE_INT )
            // InternalMyDsl.g:2376:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Package__NomAssignment_2"
    // InternalMyDsl.g:2386:1: rule__Package__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__Package__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2390:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2391:2: ( ruleEString )
            {
            // InternalMyDsl.g:2391:2: ( ruleEString )
            // InternalMyDsl.g:2392:3: ruleEString
            {
             before(grammarAccess.getPackageAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NomAssignment_2"


    // $ANTLR start "rule__Package__ElementsPackageAssignment_4"
    // InternalMyDsl.g:2401:1: rule__Package__ElementsPackageAssignment_4 : ( ruleElementPackage ) ;
    public final void rule__Package__ElementsPackageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( ruleElementPackage ) )
            // InternalMyDsl.g:2406:2: ( ruleElementPackage )
            {
            // InternalMyDsl.g:2406:2: ( ruleElementPackage )
            // InternalMyDsl.g:2407:3: ruleElementPackage
            {
             before(grammarAccess.getPackageAccess().getElementsPackageElementPackageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElementPackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsPackageElementPackageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsPackageAssignment_4"


    // $ANTLR start "rule__Classe__NomAssignment_2"
    // InternalMyDsl.g:2416:1: rule__Classe__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__Classe__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2421:2: ( ruleEString )
            {
            // InternalMyDsl.g:2421:2: ( ruleEString )
            // InternalMyDsl.g:2422:3: ruleEString
            {
             before(grammarAccess.getClasseAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__NomAssignment_2"


    // $ANTLR start "rule__Classe__AttributsAssignment_4_0"
    // InternalMyDsl.g:2431:1: rule__Classe__AttributsAssignment_4_0 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2435:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:2436:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:2436:2: ( ruleAttribut )
            // InternalMyDsl.g:2437:3: ruleAttribut
            {
             before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__AttributsAssignment_4_0"


    // $ANTLR start "rule__Classe__CardinalitesAssignment_4_1"
    // InternalMyDsl.g:2446:1: rule__Classe__CardinalitesAssignment_4_1 : ( ruleCardinalite ) ;
    public final void rule__Classe__CardinalitesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2450:1: ( ( ruleCardinalite ) )
            // InternalMyDsl.g:2451:2: ( ruleCardinalite )
            {
            // InternalMyDsl.g:2451:2: ( ruleCardinalite )
            // InternalMyDsl.g:2452:3: ruleCardinalite
            {
             before(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalite();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__CardinalitesAssignment_4_1"


    // $ANTLR start "rule__Classe__SousClassesAssignment_4_2_1"
    // InternalMyDsl.g:2461:1: rule__Classe__SousClassesAssignment_4_2_1 : ( ruleClasse ) ;
    public final void rule__Classe__SousClassesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2465:1: ( ( ruleClasse ) )
            // InternalMyDsl.g:2466:2: ( ruleClasse )
            {
            // InternalMyDsl.g:2466:2: ( ruleClasse )
            // InternalMyDsl.g:2467:3: ruleClasse
            {
             before(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__SousClassesAssignment_4_2_1"


    // $ANTLR start "rule__Classe__MethodesAssignment_4_3"
    // InternalMyDsl.g:2476:1: rule__Classe__MethodesAssignment_4_3 : ( ruleMethode ) ;
    public final void rule__Classe__MethodesAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( ( ruleMethode ) )
            // InternalMyDsl.g:2481:2: ( ruleMethode )
            {
            // InternalMyDsl.g:2481:2: ( ruleMethode )
            // InternalMyDsl.g:2482:3: ruleMethode
            {
             before(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__MethodesAssignment_4_3"


    // $ANTLR start "rule__Classe__SuperClasseAssignment_5_1"
    // InternalMyDsl.g:2491:1: rule__Classe__SuperClasseAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Classe__SuperClasseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2495:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2496:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2496:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2497:3: ( RULE_ID )
            {
             before(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_5_1_0()); 
            // InternalMyDsl.g:2498:3: ( RULE_ID )
            // InternalMyDsl.g:2499:4: RULE_ID
            {
             before(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__SuperClasseAssignment_5_1"


    // $ANTLR start "rule__Classe__ClasseAbstraiteAssignment_7"
    // InternalMyDsl.g:2510:1: rule__Classe__ClasseAbstraiteAssignment_7 : ( ruleEBoolean ) ;
    public final void rule__Classe__ClasseAbstraiteAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:2515:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:2515:2: ( ruleEBoolean )
            // InternalMyDsl.g:2516:3: ruleEBoolean
            {
             before(grammarAccess.getClasseAccess().getClasseAbstraiteEBooleanParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getClasseAbstraiteEBooleanParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classe__ClasseAbstraiteAssignment_7"


    // $ANTLR start "rule__Attribut__TypeAssignment_1"
    // InternalMyDsl.g:2525:1: rule__Attribut__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Attribut__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( ( ruleType ) )
            // InternalMyDsl.g:2530:2: ( ruleType )
            {
            // InternalMyDsl.g:2530:2: ( ruleType )
            // InternalMyDsl.g:2531:3: ruleType
            {
             before(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__TypeAssignment_1"


    // $ANTLR start "rule__Attribut__NomAssignment_2"
    // InternalMyDsl.g:2540:1: rule__Attribut__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribut__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2544:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2545:2: ( ruleEString )
            {
            // InternalMyDsl.g:2545:2: ( ruleEString )
            // InternalMyDsl.g:2546:3: ruleEString
            {
             before(grammarAccess.getAttributAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__NomAssignment_2"


    // $ANTLR start "rule__Methode__TypeDeRetourAssignment_2"
    // InternalMyDsl.g:2555:1: rule__Methode__TypeDeRetourAssignment_2 : ( ruleType ) ;
    public final void rule__Methode__TypeDeRetourAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2559:1: ( ( ruleType ) )
            // InternalMyDsl.g:2560:2: ( ruleType )
            {
            // InternalMyDsl.g:2560:2: ( ruleType )
            // InternalMyDsl.g:2561:3: ruleType
            {
             before(grammarAccess.getMethodeAccess().getTypeDeRetourTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getTypeDeRetourTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__TypeDeRetourAssignment_2"


    // $ANTLR start "rule__Methode__NomAssignment_3"
    // InternalMyDsl.g:2570:1: rule__Methode__NomAssignment_3 : ( ruleEString ) ;
    public final void rule__Methode__NomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2574:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2575:2: ( ruleEString )
            {
            // InternalMyDsl.g:2575:2: ( ruleEString )
            // InternalMyDsl.g:2576:3: ruleEString
            {
             before(grammarAccess.getMethodeAccess().getNomEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getNomEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__NomAssignment_3"


    // $ANTLR start "rule__Methode__ParametresAssignment_5"
    // InternalMyDsl.g:2585:1: rule__Methode__ParametresAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Methode__ParametresAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:2590:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:2590:2: ( ruleAttribut )
            // InternalMyDsl.g:2591:3: ruleAttribut
            {
             before(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getParametresAttributParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__ParametresAssignment_5"


    // $ANTLR start "rule__Methode__MethodeAbstraiteAssignment_8"
    // InternalMyDsl.g:2600:1: rule__Methode__MethodeAbstraiteAssignment_8 : ( ruleEBoolean ) ;
    public final void rule__Methode__MethodeAbstraiteAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2604:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:2605:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:2605:2: ( ruleEBoolean )
            // InternalMyDsl.g:2606:3: ruleEBoolean
            {
             before(grammarAccess.getMethodeAccess().getMethodeAbstraiteEBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getMethodeAbstraiteEBooleanParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__MethodeAbstraiteAssignment_8"


    // $ANTLR start "rule__Association__NomAssignment_2"
    // InternalMyDsl.g:2615:1: rule__Association__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__Association__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2619:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2620:2: ( ruleEString )
            {
            // InternalMyDsl.g:2620:2: ( ruleEString )
            // InternalMyDsl.g:2621:3: ruleEString
            {
             before(grammarAccess.getAssociationAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NomAssignment_2"


    // $ANTLR start "rule__Association__CardinalitesAssignment_4"
    // InternalMyDsl.g:2630:1: rule__Association__CardinalitesAssignment_4 : ( ruleCardinalite ) ;
    public final void rule__Association__CardinalitesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( ( ruleCardinalite ) )
            // InternalMyDsl.g:2635:2: ( ruleCardinalite )
            {
            // InternalMyDsl.g:2635:2: ( ruleCardinalite )
            // InternalMyDsl.g:2636:3: ruleCardinalite
            {
             before(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalite();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CardinalitesAssignment_4"


    // $ANTLR start "rule__Association__CardinalitesAssignment_5"
    // InternalMyDsl.g:2645:1: rule__Association__CardinalitesAssignment_5 : ( ruleCardinalite ) ;
    public final void rule__Association__CardinalitesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( ( ruleCardinalite ) )
            // InternalMyDsl.g:2650:2: ( ruleCardinalite )
            {
            // InternalMyDsl.g:2650:2: ( ruleCardinalite )
            // InternalMyDsl.g:2651:3: ruleCardinalite
            {
             before(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalite();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getCardinalitesCardinaliteParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__CardinalitesAssignment_5"


    // $ANTLR start "rule__Element__NomAssignment"
    // InternalMyDsl.g:2660:1: rule__Element__NomAssignment : ( ruleEString ) ;
    public final void rule__Element__NomAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2664:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2665:2: ( ruleEString )
            {
            // InternalMyDsl.g:2665:2: ( ruleEString )
            // InternalMyDsl.g:2666:3: ruleEString
            {
             before(grammarAccess.getElementAccess().getNomEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementAccess().getNomEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__NomAssignment"


    // $ANTLR start "rule__Cardinalite__NomAssignment_1"
    // InternalMyDsl.g:2675:1: rule__Cardinalite__NomAssignment_1 : ( ruleEString ) ;
    public final void rule__Cardinalite__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2679:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2680:2: ( ruleEString )
            {
            // InternalMyDsl.g:2680:2: ( ruleEString )
            // InternalMyDsl.g:2681:3: ruleEString
            {
             before(grammarAccess.getCardinaliteAccess().getNomEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardinaliteAccess().getNomEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__NomAssignment_1"


    // $ANTLR start "rule__Cardinalite__MultipliciteInfAssignment_3"
    // InternalMyDsl.g:2690:1: rule__Cardinalite__MultipliciteInfAssignment_3 : ( ruleEInt ) ;
    public final void rule__Cardinalite__MultipliciteInfAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2694:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2695:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2695:2: ( ruleEInt )
            // InternalMyDsl.g:2696:3: ruleEInt
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteInfEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinaliteAccess().getMultipliciteInfEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__MultipliciteInfAssignment_3"


    // $ANTLR start "rule__Cardinalite__MultipliciteSupAssignment_5"
    // InternalMyDsl.g:2705:1: rule__Cardinalite__MultipliciteSupAssignment_5 : ( ruleEInt ) ;
    public final void rule__Cardinalite__MultipliciteSupAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2710:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2710:2: ( ruleEInt )
            // InternalMyDsl.g:2711:3: ruleEInt
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteSupEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCardinaliteAccess().getMultipliciteSupEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinalite__MultipliciteSupAssignment_5"


    // $ANTLR start "rule__TypeDonnee__NomAssignment_2"
    // InternalMyDsl.g:2720:1: rule__TypeDonnee__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__TypeDonnee__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2725:2: ( ruleEString )
            {
            // InternalMyDsl.g:2725:2: ( ruleEString )
            // InternalMyDsl.g:2726:3: ruleEString
            {
             before(grammarAccess.getTypeDonneeAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeDonneeAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__NomAssignment_2"


    // $ANTLR start "rule__TypeDonnee__AttributsAssignment_4"
    // InternalMyDsl.g:2735:1: rule__TypeDonnee__AttributsAssignment_4 : ( ruleAttribut ) ;
    public final void rule__TypeDonnee__AttributsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2739:1: ( ( ruleAttribut ) )
            // InternalMyDsl.g:2740:2: ( ruleAttribut )
            {
            // InternalMyDsl.g:2740:2: ( ruleAttribut )
            // InternalMyDsl.g:2741:3: ruleAttribut
            {
             before(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnee__AttributsAssignment_4"


    // $ANTLR start "rule__Enumeration__NomAssignment_2"
    // InternalMyDsl.g:2750:1: rule__Enumeration__NomAssignment_2 : ( ruleEString ) ;
    public final void rule__Enumeration__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2755:2: ( ruleEString )
            {
            // InternalMyDsl.g:2755:2: ( ruleEString )
            // InternalMyDsl.g:2756:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNomEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNomEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NomAssignment_2"


    // $ANTLR start "rule__Enumeration__ElementsAssignment_4"
    // InternalMyDsl.g:2765:1: rule__Enumeration__ElementsAssignment_4 : ( ruleElement ) ;
    public final void rule__Enumeration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( ( ruleElement ) )
            // InternalMyDsl.g:2770:2: ( ruleElement )
            {
            // InternalMyDsl.g:2770:2: ( ruleElement )
            // InternalMyDsl.g:2771:3: ruleElement
            {
             before(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ElementsAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000061018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000061010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000023E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002340002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000003E1010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002340000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000061010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});

}