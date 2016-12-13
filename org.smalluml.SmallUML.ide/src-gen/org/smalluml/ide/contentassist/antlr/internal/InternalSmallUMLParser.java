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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Classe'", "'{'", "'Attributs'", "'}'", "'Methodes'", "'Cardinalites'", "'Sous-Classes'", "'Super-Classe'", "'Attribut'", "'Methode'", "'('", "')'", "'['", "']'", "'TypeDonnee'", "'Enumeration'", "'Chaine'", "'Entier'", "'Booleen'"
    };
    public static final int RULE_STRING=4;
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


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }


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



    // $ANTLR start "entryRuleClasse"
    // InternalSmallUML.g:53:1: entryRuleClasse : ruleClasse EOF ;
    public final void entryRuleClasse() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( ruleClasse EOF )
            // InternalSmallUML.g:55:1: ruleClasse EOF
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
    // InternalSmallUML.g:62:1: ruleClasse : ( ( rule__Classe__Group__0 ) ) ;
    public final void ruleClasse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__Classe__Group__0 ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__Classe__Group__0 ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__Classe__Group__0 ) )
            // InternalSmallUML.g:68:3: ( rule__Classe__Group__0 )
            {
             before(grammarAccess.getClasseAccess().getGroup()); 
            // InternalSmallUML.g:69:3: ( rule__Classe__Group__0 )
            // InternalSmallUML.g:69:4: rule__Classe__Group__0
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
    // InternalSmallUML.g:78:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleAttribut EOF )
            // InternalSmallUML.g:80:1: ruleAttribut EOF
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
    // InternalSmallUML.g:87:1: ruleAttribut : ( ( rule__Attribut__Group__0 ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__Attribut__Group__0 ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__Attribut__Group__0 ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__Attribut__Group__0 ) )
            // InternalSmallUML.g:93:3: ( rule__Attribut__Group__0 )
            {
             before(grammarAccess.getAttributAccess().getGroup()); 
            // InternalSmallUML.g:94:3: ( rule__Attribut__Group__0 )
            // InternalSmallUML.g:94:4: rule__Attribut__Group__0
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
    // InternalSmallUML.g:103:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleMethode EOF )
            // InternalSmallUML.g:105:1: ruleMethode EOF
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
    // InternalSmallUML.g:112:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__Methode__Group__0 ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__Methode__Group__0 ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__Methode__Group__0 ) )
            // InternalSmallUML.g:118:3: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // InternalSmallUML.g:119:3: ( rule__Methode__Group__0 )
            // InternalSmallUML.g:119:4: rule__Methode__Group__0
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


    // $ANTLR start "entryRuleElement"
    // InternalSmallUML.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleElement EOF )
            // InternalSmallUML.g:130:1: ruleElement EOF
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
    // InternalSmallUML.g:137:1: ruleElement : ( ( rule__Element__NomElementAssignment ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Element__NomElementAssignment ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Element__NomElementAssignment ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Element__NomElementAssignment ) )
            // InternalSmallUML.g:143:3: ( rule__Element__NomElementAssignment )
            {
             before(grammarAccess.getElementAccess().getNomElementAssignment()); 
            // InternalSmallUML.g:144:3: ( rule__Element__NomElementAssignment )
            // InternalSmallUML.g:144:4: rule__Element__NomElementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Element__NomElementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getNomElementAssignment()); 

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
    // InternalSmallUML.g:153:1: entryRuleCardinalite : ruleCardinalite EOF ;
    public final void entryRuleCardinalite() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleCardinalite EOF )
            // InternalSmallUML.g:155:1: ruleCardinalite EOF
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
    // InternalSmallUML.g:162:1: ruleCardinalite : ( ( rule__Cardinalite__Group__0 ) ) ;
    public final void ruleCardinalite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__Cardinalite__Group__0 ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__Cardinalite__Group__0 ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__Cardinalite__Group__0 ) )
            // InternalSmallUML.g:168:3: ( rule__Cardinalite__Group__0 )
            {
             before(grammarAccess.getCardinaliteAccess().getGroup()); 
            // InternalSmallUML.g:169:3: ( rule__Cardinalite__Group__0 )
            // InternalSmallUML.g:169:4: rule__Cardinalite__Group__0
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
    // InternalSmallUML.g:178:1: entryRuleTypeDonnee : ruleTypeDonnee EOF ;
    public final void entryRuleTypeDonnee() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleTypeDonnee EOF )
            // InternalSmallUML.g:180:1: ruleTypeDonnee EOF
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
    // InternalSmallUML.g:187:1: ruleTypeDonnee : ( ( rule__TypeDonnee__Group__0 ) ) ;
    public final void ruleTypeDonnee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__TypeDonnee__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__TypeDonnee__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__TypeDonnee__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__TypeDonnee__Group__0 )
            {
             before(grammarAccess.getTypeDonneeAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__TypeDonnee__Group__0 )
            // InternalSmallUML.g:194:4: rule__TypeDonnee__Group__0
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
    // InternalSmallUML.g:203:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:205:1: ruleEnumeration EOF
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
    // InternalSmallUML.g:212:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:219:4: rule__Enumeration__Group__0
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
    // InternalSmallUML.g:228:1: entryRuleChaine : ruleChaine EOF ;
    public final void entryRuleChaine() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleChaine EOF )
            // InternalSmallUML.g:230:1: ruleChaine EOF
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
    // InternalSmallUML.g:237:1: ruleChaine : ( ( rule__Chaine__NomTypeAssignment ) ) ;
    public final void ruleChaine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Chaine__NomTypeAssignment ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Chaine__NomTypeAssignment ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Chaine__NomTypeAssignment ) )
            // InternalSmallUML.g:243:3: ( rule__Chaine__NomTypeAssignment )
            {
             before(grammarAccess.getChaineAccess().getNomTypeAssignment()); 
            // InternalSmallUML.g:244:3: ( rule__Chaine__NomTypeAssignment )
            // InternalSmallUML.g:244:4: rule__Chaine__NomTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Chaine__NomTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getChaineAccess().getNomTypeAssignment()); 

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
    // InternalSmallUML.g:253:1: entryRuleEntier : ruleEntier EOF ;
    public final void entryRuleEntier() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleEntier EOF )
            // InternalSmallUML.g:255:1: ruleEntier EOF
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
    // InternalSmallUML.g:262:1: ruleEntier : ( ( rule__Entier__NomTypeAssignment ) ) ;
    public final void ruleEntier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__Entier__NomTypeAssignment ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__Entier__NomTypeAssignment ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__Entier__NomTypeAssignment ) )
            // InternalSmallUML.g:268:3: ( rule__Entier__NomTypeAssignment )
            {
             before(grammarAccess.getEntierAccess().getNomTypeAssignment()); 
            // InternalSmallUML.g:269:3: ( rule__Entier__NomTypeAssignment )
            // InternalSmallUML.g:269:4: rule__Entier__NomTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Entier__NomTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntierAccess().getNomTypeAssignment()); 

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
    // InternalSmallUML.g:278:1: entryRuleBooleen : ruleBooleen EOF ;
    public final void entryRuleBooleen() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleBooleen EOF )
            // InternalSmallUML.g:280:1: ruleBooleen EOF
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
    // InternalSmallUML.g:287:1: ruleBooleen : ( ( rule__Booleen__NomTypeAssignment ) ) ;
    public final void ruleBooleen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Booleen__NomTypeAssignment ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Booleen__NomTypeAssignment ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Booleen__NomTypeAssignment ) )
            // InternalSmallUML.g:293:3: ( rule__Booleen__NomTypeAssignment )
            {
             before(grammarAccess.getBooleenAccess().getNomTypeAssignment()); 
            // InternalSmallUML.g:294:3: ( rule__Booleen__NomTypeAssignment )
            // InternalSmallUML.g:294:4: rule__Booleen__NomTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Booleen__NomTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleenAccess().getNomTypeAssignment()); 

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
    // InternalSmallUML.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleEString EOF )
            // InternalSmallUML.g:305:1: ruleEString EOF
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
    // InternalSmallUML.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:319:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:319:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUML.g:327:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:331:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:332:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:332:2: ( RULE_STRING )
                    // InternalSmallUML.g:333:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:338:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:338:2: ( RULE_ID )
                    // InternalSmallUML.g:339:3: RULE_ID
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


    // $ANTLR start "rule__Classe__Group__0"
    // InternalSmallUML.g:348:1: rule__Classe__Group__0 : rule__Classe__Group__0__Impl rule__Classe__Group__1 ;
    public final void rule__Classe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:352:1: ( rule__Classe__Group__0__Impl rule__Classe__Group__1 )
            // InternalSmallUML.g:353:2: rule__Classe__Group__0__Impl rule__Classe__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:360:1: rule__Classe__Group__0__Impl : ( 'Classe' ) ;
    public final void rule__Classe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:364:1: ( ( 'Classe' ) )
            // InternalSmallUML.g:365:1: ( 'Classe' )
            {
            // InternalSmallUML.g:365:1: ( 'Classe' )
            // InternalSmallUML.g:366:2: 'Classe'
            {
             before(grammarAccess.getClasseAccess().getClasseKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getClasseKeyword_0()); 

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
    // $ANTLR end "rule__Classe__Group__0__Impl"


    // $ANTLR start "rule__Classe__Group__1"
    // InternalSmallUML.g:375:1: rule__Classe__Group__1 : rule__Classe__Group__1__Impl rule__Classe__Group__2 ;
    public final void rule__Classe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:379:1: ( rule__Classe__Group__1__Impl rule__Classe__Group__2 )
            // InternalSmallUML.g:380:2: rule__Classe__Group__1__Impl rule__Classe__Group__2
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
    // InternalSmallUML.g:387:1: rule__Classe__Group__1__Impl : ( ( rule__Classe__NomClasseAssignment_1 ) ) ;
    public final void rule__Classe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:391:1: ( ( ( rule__Classe__NomClasseAssignment_1 ) ) )
            // InternalSmallUML.g:392:1: ( ( rule__Classe__NomClasseAssignment_1 ) )
            {
            // InternalSmallUML.g:392:1: ( ( rule__Classe__NomClasseAssignment_1 ) )
            // InternalSmallUML.g:393:2: ( rule__Classe__NomClasseAssignment_1 )
            {
             before(grammarAccess.getClasseAccess().getNomClasseAssignment_1()); 
            // InternalSmallUML.g:394:2: ( rule__Classe__NomClasseAssignment_1 )
            // InternalSmallUML.g:394:3: rule__Classe__NomClasseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Classe__NomClasseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getNomClasseAssignment_1()); 

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
    // InternalSmallUML.g:402:1: rule__Classe__Group__2 : rule__Classe__Group__2__Impl rule__Classe__Group__3 ;
    public final void rule__Classe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:406:1: ( rule__Classe__Group__2__Impl rule__Classe__Group__3 )
            // InternalSmallUML.g:407:2: rule__Classe__Group__2__Impl rule__Classe__Group__3
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
    // InternalSmallUML.g:414:1: rule__Classe__Group__2__Impl : ( '{' ) ;
    public final void rule__Classe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:418:1: ( ( '{' ) )
            // InternalSmallUML.g:419:1: ( '{' )
            {
            // InternalSmallUML.g:419:1: ( '{' )
            // InternalSmallUML.g:420:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSmallUML.g:429:1: rule__Classe__Group__3 : rule__Classe__Group__3__Impl rule__Classe__Group__4 ;
    public final void rule__Classe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:433:1: ( rule__Classe__Group__3__Impl rule__Classe__Group__4 )
            // InternalSmallUML.g:434:2: rule__Classe__Group__3__Impl rule__Classe__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:441:1: rule__Classe__Group__3__Impl : ( 'Attributs' ) ;
    public final void rule__Classe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:445:1: ( ( 'Attributs' ) )
            // InternalSmallUML.g:446:1: ( 'Attributs' )
            {
            // InternalSmallUML.g:446:1: ( 'Attributs' )
            // InternalSmallUML.g:447:2: 'Attributs'
            {
             before(grammarAccess.getClasseAccess().getAttributsKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getAttributsKeyword_3()); 

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
    // InternalSmallUML.g:456:1: rule__Classe__Group__4 : rule__Classe__Group__4__Impl rule__Classe__Group__5 ;
    public final void rule__Classe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:460:1: ( rule__Classe__Group__4__Impl rule__Classe__Group__5 )
            // InternalSmallUML.g:461:2: rule__Classe__Group__4__Impl rule__Classe__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:468:1: rule__Classe__Group__4__Impl : ( '{' ) ;
    public final void rule__Classe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:472:1: ( ( '{' ) )
            // InternalSmallUML.g:473:1: ( '{' )
            {
            // InternalSmallUML.g:473:1: ( '{' )
            // InternalSmallUML.g:474:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_4()); 

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
    // InternalSmallUML.g:483:1: rule__Classe__Group__5 : rule__Classe__Group__5__Impl rule__Classe__Group__6 ;
    public final void rule__Classe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:487:1: ( rule__Classe__Group__5__Impl rule__Classe__Group__6 )
            // InternalSmallUML.g:488:2: rule__Classe__Group__5__Impl rule__Classe__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:495:1: rule__Classe__Group__5__Impl : ( ( rule__Classe__AttributsAssignment_5 )* ) ;
    public final void rule__Classe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:499:1: ( ( ( rule__Classe__AttributsAssignment_5 )* ) )
            // InternalSmallUML.g:500:1: ( ( rule__Classe__AttributsAssignment_5 )* )
            {
            // InternalSmallUML.g:500:1: ( ( rule__Classe__AttributsAssignment_5 )* )
            // InternalSmallUML.g:501:2: ( rule__Classe__AttributsAssignment_5 )*
            {
             before(grammarAccess.getClasseAccess().getAttributsAssignment_5()); 
            // InternalSmallUML.g:502:2: ( rule__Classe__AttributsAssignment_5 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmallUML.g:502:3: rule__Classe__AttributsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Classe__AttributsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getAttributsAssignment_5()); 

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
    // InternalSmallUML.g:510:1: rule__Classe__Group__6 : rule__Classe__Group__6__Impl rule__Classe__Group__7 ;
    public final void rule__Classe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:514:1: ( rule__Classe__Group__6__Impl rule__Classe__Group__7 )
            // InternalSmallUML.g:515:2: rule__Classe__Group__6__Impl rule__Classe__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:522:1: rule__Classe__Group__6__Impl : ( '}' ) ;
    public final void rule__Classe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:526:1: ( ( '}' ) )
            // InternalSmallUML.g:527:1: ( '}' )
            {
            // InternalSmallUML.g:527:1: ( '}' )
            // InternalSmallUML.g:528:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_6()); 

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
    // InternalSmallUML.g:537:1: rule__Classe__Group__7 : rule__Classe__Group__7__Impl rule__Classe__Group__8 ;
    public final void rule__Classe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:541:1: ( rule__Classe__Group__7__Impl rule__Classe__Group__8 )
            // InternalSmallUML.g:542:2: rule__Classe__Group__7__Impl rule__Classe__Group__8
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:549:1: rule__Classe__Group__7__Impl : ( 'Methodes' ) ;
    public final void rule__Classe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:553:1: ( ( 'Methodes' ) )
            // InternalSmallUML.g:554:1: ( 'Methodes' )
            {
            // InternalSmallUML.g:554:1: ( 'Methodes' )
            // InternalSmallUML.g:555:2: 'Methodes'
            {
             before(grammarAccess.getClasseAccess().getMethodesKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getMethodesKeyword_7()); 

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
    // InternalSmallUML.g:564:1: rule__Classe__Group__8 : rule__Classe__Group__8__Impl rule__Classe__Group__9 ;
    public final void rule__Classe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:568:1: ( rule__Classe__Group__8__Impl rule__Classe__Group__9 )
            // InternalSmallUML.g:569:2: rule__Classe__Group__8__Impl rule__Classe__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__9();

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
    // InternalSmallUML.g:576:1: rule__Classe__Group__8__Impl : ( '{' ) ;
    public final void rule__Classe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:580:1: ( ( '{' ) )
            // InternalSmallUML.g:581:1: ( '{' )
            {
            // InternalSmallUML.g:581:1: ( '{' )
            // InternalSmallUML.g:582:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__Classe__Group__9"
    // InternalSmallUML.g:591:1: rule__Classe__Group__9 : rule__Classe__Group__9__Impl rule__Classe__Group__10 ;
    public final void rule__Classe__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:595:1: ( rule__Classe__Group__9__Impl rule__Classe__Group__10 )
            // InternalSmallUML.g:596:2: rule__Classe__Group__9__Impl rule__Classe__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Classe__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__10();

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
    // $ANTLR end "rule__Classe__Group__9"


    // $ANTLR start "rule__Classe__Group__9__Impl"
    // InternalSmallUML.g:603:1: rule__Classe__Group__9__Impl : ( ( rule__Classe__MethodesAssignment_9 )* ) ;
    public final void rule__Classe__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:607:1: ( ( ( rule__Classe__MethodesAssignment_9 )* ) )
            // InternalSmallUML.g:608:1: ( ( rule__Classe__MethodesAssignment_9 )* )
            {
            // InternalSmallUML.g:608:1: ( ( rule__Classe__MethodesAssignment_9 )* )
            // InternalSmallUML.g:609:2: ( rule__Classe__MethodesAssignment_9 )*
            {
             before(grammarAccess.getClasseAccess().getMethodesAssignment_9()); 
            // InternalSmallUML.g:610:2: ( rule__Classe__MethodesAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmallUML.g:610:3: rule__Classe__MethodesAssignment_9
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Classe__MethodesAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getMethodesAssignment_9()); 

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
    // $ANTLR end "rule__Classe__Group__9__Impl"


    // $ANTLR start "rule__Classe__Group__10"
    // InternalSmallUML.g:618:1: rule__Classe__Group__10 : rule__Classe__Group__10__Impl rule__Classe__Group__11 ;
    public final void rule__Classe__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:622:1: ( rule__Classe__Group__10__Impl rule__Classe__Group__11 )
            // InternalSmallUML.g:623:2: rule__Classe__Group__10__Impl rule__Classe__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Classe__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__11();

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
    // $ANTLR end "rule__Classe__Group__10"


    // $ANTLR start "rule__Classe__Group__10__Impl"
    // InternalSmallUML.g:630:1: rule__Classe__Group__10__Impl : ( '}' ) ;
    public final void rule__Classe__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:634:1: ( ( '}' ) )
            // InternalSmallUML.g:635:1: ( '}' )
            {
            // InternalSmallUML.g:635:1: ( '}' )
            // InternalSmallUML.g:636:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Classe__Group__10__Impl"


    // $ANTLR start "rule__Classe__Group__11"
    // InternalSmallUML.g:645:1: rule__Classe__Group__11 : rule__Classe__Group__11__Impl rule__Classe__Group__12 ;
    public final void rule__Classe__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:649:1: ( rule__Classe__Group__11__Impl rule__Classe__Group__12 )
            // InternalSmallUML.g:650:2: rule__Classe__Group__11__Impl rule__Classe__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Classe__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__12();

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
    // $ANTLR end "rule__Classe__Group__11"


    // $ANTLR start "rule__Classe__Group__11__Impl"
    // InternalSmallUML.g:657:1: rule__Classe__Group__11__Impl : ( 'Cardinalites' ) ;
    public final void rule__Classe__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:661:1: ( ( 'Cardinalites' ) )
            // InternalSmallUML.g:662:1: ( 'Cardinalites' )
            {
            // InternalSmallUML.g:662:1: ( 'Cardinalites' )
            // InternalSmallUML.g:663:2: 'Cardinalites'
            {
             before(grammarAccess.getClasseAccess().getCardinalitesKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getCardinalitesKeyword_11()); 

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
    // $ANTLR end "rule__Classe__Group__11__Impl"


    // $ANTLR start "rule__Classe__Group__12"
    // InternalSmallUML.g:672:1: rule__Classe__Group__12 : rule__Classe__Group__12__Impl rule__Classe__Group__13 ;
    public final void rule__Classe__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:676:1: ( rule__Classe__Group__12__Impl rule__Classe__Group__13 )
            // InternalSmallUML.g:677:2: rule__Classe__Group__12__Impl rule__Classe__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Classe__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__13();

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
    // $ANTLR end "rule__Classe__Group__12"


    // $ANTLR start "rule__Classe__Group__12__Impl"
    // InternalSmallUML.g:684:1: rule__Classe__Group__12__Impl : ( '{' ) ;
    public final void rule__Classe__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:688:1: ( ( '{' ) )
            // InternalSmallUML.g:689:1: ( '{' )
            {
            // InternalSmallUML.g:689:1: ( '{' )
            // InternalSmallUML.g:690:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Classe__Group__12__Impl"


    // $ANTLR start "rule__Classe__Group__13"
    // InternalSmallUML.g:699:1: rule__Classe__Group__13 : rule__Classe__Group__13__Impl rule__Classe__Group__14 ;
    public final void rule__Classe__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:703:1: ( rule__Classe__Group__13__Impl rule__Classe__Group__14 )
            // InternalSmallUML.g:704:2: rule__Classe__Group__13__Impl rule__Classe__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__Classe__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__14();

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
    // $ANTLR end "rule__Classe__Group__13"


    // $ANTLR start "rule__Classe__Group__13__Impl"
    // InternalSmallUML.g:711:1: rule__Classe__Group__13__Impl : ( ( rule__Classe__CardinalitesAssignment_13 )* ) ;
    public final void rule__Classe__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:715:1: ( ( ( rule__Classe__CardinalitesAssignment_13 )* ) )
            // InternalSmallUML.g:716:1: ( ( rule__Classe__CardinalitesAssignment_13 )* )
            {
            // InternalSmallUML.g:716:1: ( ( rule__Classe__CardinalitesAssignment_13 )* )
            // InternalSmallUML.g:717:2: ( rule__Classe__CardinalitesAssignment_13 )*
            {
             before(grammarAccess.getClasseAccess().getCardinalitesAssignment_13()); 
            // InternalSmallUML.g:718:2: ( rule__Classe__CardinalitesAssignment_13 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmallUML.g:718:3: rule__Classe__CardinalitesAssignment_13
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Classe__CardinalitesAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getCardinalitesAssignment_13()); 

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
    // $ANTLR end "rule__Classe__Group__13__Impl"


    // $ANTLR start "rule__Classe__Group__14"
    // InternalSmallUML.g:726:1: rule__Classe__Group__14 : rule__Classe__Group__14__Impl rule__Classe__Group__15 ;
    public final void rule__Classe__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:730:1: ( rule__Classe__Group__14__Impl rule__Classe__Group__15 )
            // InternalSmallUML.g:731:2: rule__Classe__Group__14__Impl rule__Classe__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Classe__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__15();

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
    // $ANTLR end "rule__Classe__Group__14"


    // $ANTLR start "rule__Classe__Group__14__Impl"
    // InternalSmallUML.g:738:1: rule__Classe__Group__14__Impl : ( '}' ) ;
    public final void rule__Classe__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:742:1: ( ( '}' ) )
            // InternalSmallUML.g:743:1: ( '}' )
            {
            // InternalSmallUML.g:743:1: ( '}' )
            // InternalSmallUML.g:744:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Classe__Group__14__Impl"


    // $ANTLR start "rule__Classe__Group__15"
    // InternalSmallUML.g:753:1: rule__Classe__Group__15 : rule__Classe__Group__15__Impl rule__Classe__Group__16 ;
    public final void rule__Classe__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:757:1: ( rule__Classe__Group__15__Impl rule__Classe__Group__16 )
            // InternalSmallUML.g:758:2: rule__Classe__Group__15__Impl rule__Classe__Group__16
            {
            pushFollow(FOLLOW_4);
            rule__Classe__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__16();

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
    // $ANTLR end "rule__Classe__Group__15"


    // $ANTLR start "rule__Classe__Group__15__Impl"
    // InternalSmallUML.g:765:1: rule__Classe__Group__15__Impl : ( 'Sous-Classes' ) ;
    public final void rule__Classe__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:769:1: ( ( 'Sous-Classes' ) )
            // InternalSmallUML.g:770:1: ( 'Sous-Classes' )
            {
            // InternalSmallUML.g:770:1: ( 'Sous-Classes' )
            // InternalSmallUML.g:771:2: 'Sous-Classes'
            {
             before(grammarAccess.getClasseAccess().getSousClassesKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSousClassesKeyword_15()); 

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
    // $ANTLR end "rule__Classe__Group__15__Impl"


    // $ANTLR start "rule__Classe__Group__16"
    // InternalSmallUML.g:780:1: rule__Classe__Group__16 : rule__Classe__Group__16__Impl rule__Classe__Group__17 ;
    public final void rule__Classe__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:784:1: ( rule__Classe__Group__16__Impl rule__Classe__Group__17 )
            // InternalSmallUML.g:785:2: rule__Classe__Group__16__Impl rule__Classe__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Classe__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__17();

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
    // $ANTLR end "rule__Classe__Group__16"


    // $ANTLR start "rule__Classe__Group__16__Impl"
    // InternalSmallUML.g:792:1: rule__Classe__Group__16__Impl : ( '{' ) ;
    public final void rule__Classe__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:796:1: ( ( '{' ) )
            // InternalSmallUML.g:797:1: ( '{' )
            {
            // InternalSmallUML.g:797:1: ( '{' )
            // InternalSmallUML.g:798:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Classe__Group__16__Impl"


    // $ANTLR start "rule__Classe__Group__17"
    // InternalSmallUML.g:807:1: rule__Classe__Group__17 : rule__Classe__Group__17__Impl rule__Classe__Group__18 ;
    public final void rule__Classe__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:811:1: ( rule__Classe__Group__17__Impl rule__Classe__Group__18 )
            // InternalSmallUML.g:812:2: rule__Classe__Group__17__Impl rule__Classe__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Classe__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__18();

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
    // $ANTLR end "rule__Classe__Group__17"


    // $ANTLR start "rule__Classe__Group__17__Impl"
    // InternalSmallUML.g:819:1: rule__Classe__Group__17__Impl : ( ( rule__Classe__SousClassesAssignment_17 )* ) ;
    public final void rule__Classe__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:823:1: ( ( ( rule__Classe__SousClassesAssignment_17 )* ) )
            // InternalSmallUML.g:824:1: ( ( rule__Classe__SousClassesAssignment_17 )* )
            {
            // InternalSmallUML.g:824:1: ( ( rule__Classe__SousClassesAssignment_17 )* )
            // InternalSmallUML.g:825:2: ( rule__Classe__SousClassesAssignment_17 )*
            {
             before(grammarAccess.getClasseAccess().getSousClassesAssignment_17()); 
            // InternalSmallUML.g:826:2: ( rule__Classe__SousClassesAssignment_17 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:826:3: rule__Classe__SousClassesAssignment_17
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Classe__SousClassesAssignment_17();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getClasseAccess().getSousClassesAssignment_17()); 

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
    // $ANTLR end "rule__Classe__Group__17__Impl"


    // $ANTLR start "rule__Classe__Group__18"
    // InternalSmallUML.g:834:1: rule__Classe__Group__18 : rule__Classe__Group__18__Impl rule__Classe__Group__19 ;
    public final void rule__Classe__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:838:1: ( rule__Classe__Group__18__Impl rule__Classe__Group__19 )
            // InternalSmallUML.g:839:2: rule__Classe__Group__18__Impl rule__Classe__Group__19
            {
            pushFollow(FOLLOW_17);
            rule__Classe__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__19();

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
    // $ANTLR end "rule__Classe__Group__18"


    // $ANTLR start "rule__Classe__Group__18__Impl"
    // InternalSmallUML.g:846:1: rule__Classe__Group__18__Impl : ( '}' ) ;
    public final void rule__Classe__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:850:1: ( ( '}' ) )
            // InternalSmallUML.g:851:1: ( '}' )
            {
            // InternalSmallUML.g:851:1: ( '}' )
            // InternalSmallUML.g:852:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_18()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__Classe__Group__18__Impl"


    // $ANTLR start "rule__Classe__Group__19"
    // InternalSmallUML.g:861:1: rule__Classe__Group__19 : rule__Classe__Group__19__Impl rule__Classe__Group__20 ;
    public final void rule__Classe__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:865:1: ( rule__Classe__Group__19__Impl rule__Classe__Group__20 )
            // InternalSmallUML.g:866:2: rule__Classe__Group__19__Impl rule__Classe__Group__20
            {
            pushFollow(FOLLOW_4);
            rule__Classe__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__20();

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
    // $ANTLR end "rule__Classe__Group__19"


    // $ANTLR start "rule__Classe__Group__19__Impl"
    // InternalSmallUML.g:873:1: rule__Classe__Group__19__Impl : ( 'Super-Classe' ) ;
    public final void rule__Classe__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:877:1: ( ( 'Super-Classe' ) )
            // InternalSmallUML.g:878:1: ( 'Super-Classe' )
            {
            // InternalSmallUML.g:878:1: ( 'Super-Classe' )
            // InternalSmallUML.g:879:2: 'Super-Classe'
            {
             before(grammarAccess.getClasseAccess().getSuperClasseKeyword_19()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSuperClasseKeyword_19()); 

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
    // $ANTLR end "rule__Classe__Group__19__Impl"


    // $ANTLR start "rule__Classe__Group__20"
    // InternalSmallUML.g:888:1: rule__Classe__Group__20 : rule__Classe__Group__20__Impl rule__Classe__Group__21 ;
    public final void rule__Classe__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:892:1: ( rule__Classe__Group__20__Impl rule__Classe__Group__21 )
            // InternalSmallUML.g:893:2: rule__Classe__Group__20__Impl rule__Classe__Group__21
            {
            pushFollow(FOLLOW_18);
            rule__Classe__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__21();

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
    // $ANTLR end "rule__Classe__Group__20"


    // $ANTLR start "rule__Classe__Group__20__Impl"
    // InternalSmallUML.g:900:1: rule__Classe__Group__20__Impl : ( '{' ) ;
    public final void rule__Classe__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:904:1: ( ( '{' ) )
            // InternalSmallUML.g:905:1: ( '{' )
            {
            // InternalSmallUML.g:905:1: ( '{' )
            // InternalSmallUML.g:906:2: '{'
            {
             before(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_20()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__Classe__Group__20__Impl"


    // $ANTLR start "rule__Classe__Group__21"
    // InternalSmallUML.g:915:1: rule__Classe__Group__21 : rule__Classe__Group__21__Impl rule__Classe__Group__22 ;
    public final void rule__Classe__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:919:1: ( rule__Classe__Group__21__Impl rule__Classe__Group__22 )
            // InternalSmallUML.g:920:2: rule__Classe__Group__21__Impl rule__Classe__Group__22
            {
            pushFollow(FOLLOW_19);
            rule__Classe__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__22();

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
    // $ANTLR end "rule__Classe__Group__21"


    // $ANTLR start "rule__Classe__Group__21__Impl"
    // InternalSmallUML.g:927:1: rule__Classe__Group__21__Impl : ( ( rule__Classe__SuperClasseAssignment_21 ) ) ;
    public final void rule__Classe__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:931:1: ( ( ( rule__Classe__SuperClasseAssignment_21 ) ) )
            // InternalSmallUML.g:932:1: ( ( rule__Classe__SuperClasseAssignment_21 ) )
            {
            // InternalSmallUML.g:932:1: ( ( rule__Classe__SuperClasseAssignment_21 ) )
            // InternalSmallUML.g:933:2: ( rule__Classe__SuperClasseAssignment_21 )
            {
             before(grammarAccess.getClasseAccess().getSuperClasseAssignment_21()); 
            // InternalSmallUML.g:934:2: ( rule__Classe__SuperClasseAssignment_21 )
            // InternalSmallUML.g:934:3: rule__Classe__SuperClasseAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Classe__SuperClasseAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getClasseAccess().getSuperClasseAssignment_21()); 

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
    // $ANTLR end "rule__Classe__Group__21__Impl"


    // $ANTLR start "rule__Classe__Group__22"
    // InternalSmallUML.g:942:1: rule__Classe__Group__22 : rule__Classe__Group__22__Impl rule__Classe__Group__23 ;
    public final void rule__Classe__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:946:1: ( rule__Classe__Group__22__Impl rule__Classe__Group__23 )
            // InternalSmallUML.g:947:2: rule__Classe__Group__22__Impl rule__Classe__Group__23
            {
            pushFollow(FOLLOW_19);
            rule__Classe__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Classe__Group__23();

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
    // $ANTLR end "rule__Classe__Group__22"


    // $ANTLR start "rule__Classe__Group__22__Impl"
    // InternalSmallUML.g:954:1: rule__Classe__Group__22__Impl : ( '}' ) ;
    public final void rule__Classe__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:958:1: ( ( '}' ) )
            // InternalSmallUML.g:959:1: ( '}' )
            {
            // InternalSmallUML.g:959:1: ( '}' )
            // InternalSmallUML.g:960:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_22()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_22()); 

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
    // $ANTLR end "rule__Classe__Group__22__Impl"


    // $ANTLR start "rule__Classe__Group__23"
    // InternalSmallUML.g:969:1: rule__Classe__Group__23 : rule__Classe__Group__23__Impl ;
    public final void rule__Classe__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:973:1: ( rule__Classe__Group__23__Impl )
            // InternalSmallUML.g:974:2: rule__Classe__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classe__Group__23__Impl();

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
    // $ANTLR end "rule__Classe__Group__23"


    // $ANTLR start "rule__Classe__Group__23__Impl"
    // InternalSmallUML.g:980:1: rule__Classe__Group__23__Impl : ( '}' ) ;
    public final void rule__Classe__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:984:1: ( ( '}' ) )
            // InternalSmallUML.g:985:1: ( '}' )
            {
            // InternalSmallUML.g:985:1: ( '}' )
            // InternalSmallUML.g:986:2: '}'
            {
             before(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_23()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__Classe__Group__23__Impl"


    // $ANTLR start "rule__Attribut__Group__0"
    // InternalSmallUML.g:996:1: rule__Attribut__Group__0 : rule__Attribut__Group__0__Impl rule__Attribut__Group__1 ;
    public final void rule__Attribut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1000:1: ( rule__Attribut__Group__0__Impl rule__Attribut__Group__1 )
            // InternalSmallUML.g:1001:2: rule__Attribut__Group__0__Impl rule__Attribut__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1008:1: rule__Attribut__Group__0__Impl : ( 'Attribut' ) ;
    public final void rule__Attribut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1012:1: ( ( 'Attribut' ) )
            // InternalSmallUML.g:1013:1: ( 'Attribut' )
            {
            // InternalSmallUML.g:1013:1: ( 'Attribut' )
            // InternalSmallUML.g:1014:2: 'Attribut'
            {
             before(grammarAccess.getAttributAccess().getAttributKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSmallUML.g:1023:1: rule__Attribut__Group__1 : rule__Attribut__Group__1__Impl rule__Attribut__Group__2 ;
    public final void rule__Attribut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1027:1: ( rule__Attribut__Group__1__Impl rule__Attribut__Group__2 )
            // InternalSmallUML.g:1028:2: rule__Attribut__Group__1__Impl rule__Attribut__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1035:1: rule__Attribut__Group__1__Impl : ( '{' ) ;
    public final void rule__Attribut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1039:1: ( ( '{' ) )
            // InternalSmallUML.g:1040:1: ( '{' )
            {
            // InternalSmallUML.g:1040:1: ( '{' )
            // InternalSmallUML.g:1041:2: '{'
            {
             before(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalSmallUML.g:1050:1: rule__Attribut__Group__2 : rule__Attribut__Group__2__Impl rule__Attribut__Group__3 ;
    public final void rule__Attribut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1054:1: ( rule__Attribut__Group__2__Impl rule__Attribut__Group__3 )
            // InternalSmallUML.g:1055:2: rule__Attribut__Group__2__Impl rule__Attribut__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Attribut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__3();

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
    // InternalSmallUML.g:1062:1: rule__Attribut__Group__2__Impl : ( ( rule__Attribut__NomAttributAssignment_2 ) ) ;
    public final void rule__Attribut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1066:1: ( ( ( rule__Attribut__NomAttributAssignment_2 ) ) )
            // InternalSmallUML.g:1067:1: ( ( rule__Attribut__NomAttributAssignment_2 ) )
            {
            // InternalSmallUML.g:1067:1: ( ( rule__Attribut__NomAttributAssignment_2 ) )
            // InternalSmallUML.g:1068:2: ( rule__Attribut__NomAttributAssignment_2 )
            {
             before(grammarAccess.getAttributAccess().getNomAttributAssignment_2()); 
            // InternalSmallUML.g:1069:2: ( rule__Attribut__NomAttributAssignment_2 )
            // InternalSmallUML.g:1069:3: rule__Attribut__NomAttributAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__NomAttributAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNomAttributAssignment_2()); 

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


    // $ANTLR start "rule__Attribut__Group__3"
    // InternalSmallUML.g:1077:1: rule__Attribut__Group__3 : rule__Attribut__Group__3__Impl rule__Attribut__Group__4 ;
    public final void rule__Attribut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1081:1: ( rule__Attribut__Group__3__Impl rule__Attribut__Group__4 )
            // InternalSmallUML.g:1082:2: rule__Attribut__Group__3__Impl rule__Attribut__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Attribut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribut__Group__4();

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
    // $ANTLR end "rule__Attribut__Group__3"


    // $ANTLR start "rule__Attribut__Group__3__Impl"
    // InternalSmallUML.g:1089:1: rule__Attribut__Group__3__Impl : ( ( rule__Attribut__TypeAssignment_3 ) ) ;
    public final void rule__Attribut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1093:1: ( ( ( rule__Attribut__TypeAssignment_3 ) ) )
            // InternalSmallUML.g:1094:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            {
            // InternalSmallUML.g:1094:1: ( ( rule__Attribut__TypeAssignment_3 ) )
            // InternalSmallUML.g:1095:2: ( rule__Attribut__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributAccess().getTypeAssignment_3()); 
            // InternalSmallUML.g:1096:2: ( rule__Attribut__TypeAssignment_3 )
            // InternalSmallUML.g:1096:3: rule__Attribut__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Attribut__Group__3__Impl"


    // $ANTLR start "rule__Attribut__Group__4"
    // InternalSmallUML.g:1104:1: rule__Attribut__Group__4 : rule__Attribut__Group__4__Impl ;
    public final void rule__Attribut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1108:1: ( rule__Attribut__Group__4__Impl )
            // InternalSmallUML.g:1109:2: rule__Attribut__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__Group__4__Impl();

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
    // $ANTLR end "rule__Attribut__Group__4"


    // $ANTLR start "rule__Attribut__Group__4__Impl"
    // InternalSmallUML.g:1115:1: rule__Attribut__Group__4__Impl : ( '}' ) ;
    public final void rule__Attribut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1119:1: ( ( '}' ) )
            // InternalSmallUML.g:1120:1: ( '}' )
            {
            // InternalSmallUML.g:1120:1: ( '}' )
            // InternalSmallUML.g:1121:2: '}'
            {
             before(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Attribut__Group__4__Impl"


    // $ANTLR start "rule__Methode__Group__0"
    // InternalSmallUML.g:1131:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1135:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // InternalSmallUML.g:1136:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1143:1: rule__Methode__Group__0__Impl : ( 'Methode' ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1147:1: ( ( 'Methode' ) )
            // InternalSmallUML.g:1148:1: ( 'Methode' )
            {
            // InternalSmallUML.g:1148:1: ( 'Methode' )
            // InternalSmallUML.g:1149:2: 'Methode'
            {
             before(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); 

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
    // $ANTLR end "rule__Methode__Group__0__Impl"


    // $ANTLR start "rule__Methode__Group__1"
    // InternalSmallUML.g:1158:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1162:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // InternalSmallUML.g:1163:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1170:1: rule__Methode__Group__1__Impl : ( '{' ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1174:1: ( ( '{' ) )
            // InternalSmallUML.g:1175:1: ( '{' )
            {
            // InternalSmallUML.g:1175:1: ( '{' )
            // InternalSmallUML.g:1176:2: '{'
            {
             before(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalSmallUML.g:1185:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1189:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // InternalSmallUML.g:1190:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1197:1: rule__Methode__Group__2__Impl : ( ( rule__Methode__TypeDeRetourAssignment_2 ) ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1201:1: ( ( ( rule__Methode__TypeDeRetourAssignment_2 ) ) )
            // InternalSmallUML.g:1202:1: ( ( rule__Methode__TypeDeRetourAssignment_2 ) )
            {
            // InternalSmallUML.g:1202:1: ( ( rule__Methode__TypeDeRetourAssignment_2 ) )
            // InternalSmallUML.g:1203:2: ( rule__Methode__TypeDeRetourAssignment_2 )
            {
             before(grammarAccess.getMethodeAccess().getTypeDeRetourAssignment_2()); 
            // InternalSmallUML.g:1204:2: ( rule__Methode__TypeDeRetourAssignment_2 )
            // InternalSmallUML.g:1204:3: rule__Methode__TypeDeRetourAssignment_2
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
    // InternalSmallUML.g:1212:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1216:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // InternalSmallUML.g:1217:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalSmallUML.g:1224:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__NomMethodeAssignment_3 ) ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1228:1: ( ( ( rule__Methode__NomMethodeAssignment_3 ) ) )
            // InternalSmallUML.g:1229:1: ( ( rule__Methode__NomMethodeAssignment_3 ) )
            {
            // InternalSmallUML.g:1229:1: ( ( rule__Methode__NomMethodeAssignment_3 ) )
            // InternalSmallUML.g:1230:2: ( rule__Methode__NomMethodeAssignment_3 )
            {
             before(grammarAccess.getMethodeAccess().getNomMethodeAssignment_3()); 
            // InternalSmallUML.g:1231:2: ( rule__Methode__NomMethodeAssignment_3 )
            // InternalSmallUML.g:1231:3: rule__Methode__NomMethodeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Methode__NomMethodeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNomMethodeAssignment_3()); 

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
    // InternalSmallUML.g:1239:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1243:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // InternalSmallUML.g:1244:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:1251:1: rule__Methode__Group__4__Impl : ( '(' ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1255:1: ( ( '(' ) )
            // InternalSmallUML.g:1256:1: ( '(' )
            {
            // InternalSmallUML.g:1256:1: ( '(' )
            // InternalSmallUML.g:1257:2: '('
            {
             before(grammarAccess.getMethodeAccess().getLeftParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1266:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1270:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // InternalSmallUML.g:1271:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalSmallUML.g:1278:1: rule__Methode__Group__5__Impl : ( ( rule__Methode__ParametresAssignment_5 )* ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1282:1: ( ( ( rule__Methode__ParametresAssignment_5 )* ) )
            // InternalSmallUML.g:1283:1: ( ( rule__Methode__ParametresAssignment_5 )* )
            {
            // InternalSmallUML.g:1283:1: ( ( rule__Methode__ParametresAssignment_5 )* )
            // InternalSmallUML.g:1284:2: ( rule__Methode__ParametresAssignment_5 )*
            {
             before(grammarAccess.getMethodeAccess().getParametresAssignment_5()); 
            // InternalSmallUML.g:1285:2: ( rule__Methode__ParametresAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:1285:3: rule__Methode__ParametresAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Methode__ParametresAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalSmallUML.g:1293:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl rule__Methode__Group__7 ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1297:1: ( rule__Methode__Group__6__Impl rule__Methode__Group__7 )
            // InternalSmallUML.g:1298:2: rule__Methode__Group__6__Impl rule__Methode__Group__7
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
    // InternalSmallUML.g:1305:1: rule__Methode__Group__6__Impl : ( ')' ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1309:1: ( ( ')' ) )
            // InternalSmallUML.g:1310:1: ( ')' )
            {
            // InternalSmallUML.g:1310:1: ( ')' )
            // InternalSmallUML.g:1311:2: ')'
            {
             before(grammarAccess.getMethodeAccess().getRightParenthesisKeyword_6()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSmallUML.g:1320:1: rule__Methode__Group__7 : rule__Methode__Group__7__Impl ;
    public final void rule__Methode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1324:1: ( rule__Methode__Group__7__Impl )
            // InternalSmallUML.g:1325:2: rule__Methode__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__7__Impl();

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
    // InternalSmallUML.g:1331:1: rule__Methode__Group__7__Impl : ( '}' ) ;
    public final void rule__Methode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1335:1: ( ( '}' ) )
            // InternalSmallUML.g:1336:1: ( '}' )
            {
            // InternalSmallUML.g:1336:1: ( '}' )
            // InternalSmallUML.g:1337:2: '}'
            {
             before(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Cardinalite__Group__0"
    // InternalSmallUML.g:1347:1: rule__Cardinalite__Group__0 : rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1 ;
    public final void rule__Cardinalite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1351:1: ( rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1 )
            // InternalSmallUML.g:1352:2: rule__Cardinalite__Group__0__Impl rule__Cardinalite__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1359:1: rule__Cardinalite__Group__0__Impl : ( '[' ) ;
    public final void rule__Cardinalite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1363:1: ( ( '[' ) )
            // InternalSmallUML.g:1364:1: ( '[' )
            {
            // InternalSmallUML.g:1364:1: ( '[' )
            // InternalSmallUML.g:1365:2: '['
            {
             before(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getLeftSquareBracketKeyword_0()); 

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
    // InternalSmallUML.g:1374:1: rule__Cardinalite__Group__1 : rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2 ;
    public final void rule__Cardinalite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1378:1: ( rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2 )
            // InternalSmallUML.g:1379:2: rule__Cardinalite__Group__1__Impl rule__Cardinalite__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSmallUML.g:1386:1: rule__Cardinalite__Group__1__Impl : ( ( rule__Cardinalite__MultipliciteAssignment_1 ) ) ;
    public final void rule__Cardinalite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1390:1: ( ( ( rule__Cardinalite__MultipliciteAssignment_1 ) ) )
            // InternalSmallUML.g:1391:1: ( ( rule__Cardinalite__MultipliciteAssignment_1 ) )
            {
            // InternalSmallUML.g:1391:1: ( ( rule__Cardinalite__MultipliciteAssignment_1 ) )
            // InternalSmallUML.g:1392:2: ( rule__Cardinalite__MultipliciteAssignment_1 )
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteAssignment_1()); 
            // InternalSmallUML.g:1393:2: ( rule__Cardinalite__MultipliciteAssignment_1 )
            // InternalSmallUML.g:1393:3: rule__Cardinalite__MultipliciteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__MultipliciteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinaliteAccess().getMultipliciteAssignment_1()); 

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
    // InternalSmallUML.g:1401:1: rule__Cardinalite__Group__2 : rule__Cardinalite__Group__2__Impl ;
    public final void rule__Cardinalite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1405:1: ( rule__Cardinalite__Group__2__Impl )
            // InternalSmallUML.g:1406:2: rule__Cardinalite__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinalite__Group__2__Impl();

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
    // InternalSmallUML.g:1412:1: rule__Cardinalite__Group__2__Impl : ( ']' ) ;
    public final void rule__Cardinalite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1416:1: ( ( ']' ) )
            // InternalSmallUML.g:1417:1: ( ']' )
            {
            // InternalSmallUML.g:1417:1: ( ']' )
            // InternalSmallUML.g:1418:2: ']'
            {
             before(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCardinaliteAccess().getRightSquareBracketKeyword_2()); 

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


    // $ANTLR start "rule__TypeDonnee__Group__0"
    // InternalSmallUML.g:1428:1: rule__TypeDonnee__Group__0 : rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1 ;
    public final void rule__TypeDonnee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1432:1: ( rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1 )
            // InternalSmallUML.g:1433:2: rule__TypeDonnee__Group__0__Impl rule__TypeDonnee__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1440:1: rule__TypeDonnee__Group__0__Impl : ( 'TypeDonnee' ) ;
    public final void rule__TypeDonnee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1444:1: ( ( 'TypeDonnee' ) )
            // InternalSmallUML.g:1445:1: ( 'TypeDonnee' )
            {
            // InternalSmallUML.g:1445:1: ( 'TypeDonnee' )
            // InternalSmallUML.g:1446:2: 'TypeDonnee'
            {
             before(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getTypeDonneeKeyword_0()); 

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
    // $ANTLR end "rule__TypeDonnee__Group__0__Impl"


    // $ANTLR start "rule__TypeDonnee__Group__1"
    // InternalSmallUML.g:1455:1: rule__TypeDonnee__Group__1 : rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2 ;
    public final void rule__TypeDonnee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1459:1: ( rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2 )
            // InternalSmallUML.g:1460:2: rule__TypeDonnee__Group__1__Impl rule__TypeDonnee__Group__2
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
    // InternalSmallUML.g:1467:1: rule__TypeDonnee__Group__1__Impl : ( ( rule__TypeDonnee__NomTypeAssignment_1 ) ) ;
    public final void rule__TypeDonnee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1471:1: ( ( ( rule__TypeDonnee__NomTypeAssignment_1 ) ) )
            // InternalSmallUML.g:1472:1: ( ( rule__TypeDonnee__NomTypeAssignment_1 ) )
            {
            // InternalSmallUML.g:1472:1: ( ( rule__TypeDonnee__NomTypeAssignment_1 ) )
            // InternalSmallUML.g:1473:2: ( rule__TypeDonnee__NomTypeAssignment_1 )
            {
             before(grammarAccess.getTypeDonneeAccess().getNomTypeAssignment_1()); 
            // InternalSmallUML.g:1474:2: ( rule__TypeDonnee__NomTypeAssignment_1 )
            // InternalSmallUML.g:1474:3: rule__TypeDonnee__NomTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnee__NomTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDonneeAccess().getNomTypeAssignment_1()); 

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
    // InternalSmallUML.g:1482:1: rule__TypeDonnee__Group__2 : rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3 ;
    public final void rule__TypeDonnee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1486:1: ( rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3 )
            // InternalSmallUML.g:1487:2: rule__TypeDonnee__Group__2__Impl rule__TypeDonnee__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:1494:1: rule__TypeDonnee__Group__2__Impl : ( '{' ) ;
    public final void rule__TypeDonnee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1498:1: ( ( '{' ) )
            // InternalSmallUML.g:1499:1: ( '{' )
            {
            // InternalSmallUML.g:1499:1: ( '{' )
            // InternalSmallUML.g:1500:2: '{'
            {
             before(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSmallUML.g:1509:1: rule__TypeDonnee__Group__3 : rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4 ;
    public final void rule__TypeDonnee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1513:1: ( rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4 )
            // InternalSmallUML.g:1514:2: rule__TypeDonnee__Group__3__Impl rule__TypeDonnee__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:1521:1: rule__TypeDonnee__Group__3__Impl : ( ( rule__TypeDonnee__AttributsAssignment_3 )* ) ;
    public final void rule__TypeDonnee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1525:1: ( ( ( rule__TypeDonnee__AttributsAssignment_3 )* ) )
            // InternalSmallUML.g:1526:1: ( ( rule__TypeDonnee__AttributsAssignment_3 )* )
            {
            // InternalSmallUML.g:1526:1: ( ( rule__TypeDonnee__AttributsAssignment_3 )* )
            // InternalSmallUML.g:1527:2: ( rule__TypeDonnee__AttributsAssignment_3 )*
            {
             before(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_3()); 
            // InternalSmallUML.g:1528:2: ( rule__TypeDonnee__AttributsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallUML.g:1528:3: rule__TypeDonnee__AttributsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TypeDonnee__AttributsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTypeDonneeAccess().getAttributsAssignment_3()); 

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
    // InternalSmallUML.g:1536:1: rule__TypeDonnee__Group__4 : rule__TypeDonnee__Group__4__Impl ;
    public final void rule__TypeDonnee__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1540:1: ( rule__TypeDonnee__Group__4__Impl )
            // InternalSmallUML.g:1541:2: rule__TypeDonnee__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnee__Group__4__Impl();

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
    // InternalSmallUML.g:1547:1: rule__TypeDonnee__Group__4__Impl : ( '}' ) ;
    public final void rule__TypeDonnee__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1551:1: ( ( '}' ) )
            // InternalSmallUML.g:1552:1: ( '}' )
            {
            // InternalSmallUML.g:1552:1: ( '}' )
            // InternalSmallUML.g:1553:2: '}'
            {
             before(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDonneeAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:1563:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1567:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:1568:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1575:1: rule__Enumeration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1579:1: ( ( 'Enumeration' ) )
            // InternalSmallUML.g:1580:1: ( 'Enumeration' )
            {
            // InternalSmallUML.g:1580:1: ( 'Enumeration' )
            // InternalSmallUML.g:1581:2: 'Enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUML.g:1590:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1594:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:1595:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
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
    // InternalSmallUML.g:1602:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NomEnumerationAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1606:1: ( ( ( rule__Enumeration__NomEnumerationAssignment_1 ) ) )
            // InternalSmallUML.g:1607:1: ( ( rule__Enumeration__NomEnumerationAssignment_1 ) )
            {
            // InternalSmallUML.g:1607:1: ( ( rule__Enumeration__NomEnumerationAssignment_1 ) )
            // InternalSmallUML.g:1608:2: ( rule__Enumeration__NomEnumerationAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNomEnumerationAssignment_1()); 
            // InternalSmallUML.g:1609:2: ( rule__Enumeration__NomEnumerationAssignment_1 )
            // InternalSmallUML.g:1609:3: rule__Enumeration__NomEnumerationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NomEnumerationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNomEnumerationAssignment_1()); 

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
    // InternalSmallUML.g:1617:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1621:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:1622:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUML.g:1629:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1633:1: ( ( '{' ) )
            // InternalSmallUML.g:1634:1: ( '{' )
            {
            // InternalSmallUML.g:1634:1: ( '{' )
            // InternalSmallUML.g:1635:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSmallUML.g:1644:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1648:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:1649:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSmallUML.g:1656:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ElementsAssignment_3 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1660:1: ( ( ( rule__Enumeration__ElementsAssignment_3 )* ) )
            // InternalSmallUML.g:1661:1: ( ( rule__Enumeration__ElementsAssignment_3 )* )
            {
            // InternalSmallUML.g:1661:1: ( ( rule__Enumeration__ElementsAssignment_3 )* )
            // InternalSmallUML.g:1662:2: ( rule__Enumeration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getEnumerationAccess().getElementsAssignment_3()); 
            // InternalSmallUML.g:1663:2: ( rule__Enumeration__ElementsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSmallUML.g:1663:3: rule__Enumeration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Enumeration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getElementsAssignment_3()); 

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
    // InternalSmallUML.g:1671:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1675:1: ( rule__Enumeration__Group__4__Impl )
            // InternalSmallUML.g:1676:2: rule__Enumeration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4__Impl();

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
    // InternalSmallUML.g:1682:1: rule__Enumeration__Group__4__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1686:1: ( ( '}' ) )
            // InternalSmallUML.g:1687:1: ( '}' )
            {
            // InternalSmallUML.g:1687:1: ( '}' )
            // InternalSmallUML.g:1688:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Classe__NomClasseAssignment_1"
    // InternalSmallUML.g:1698:1: rule__Classe__NomClasseAssignment_1 : ( ruleEString ) ;
    public final void rule__Classe__NomClasseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1702:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1703:2: ( ruleEString )
            {
            // InternalSmallUML.g:1703:2: ( ruleEString )
            // InternalSmallUML.g:1704:3: ruleEString
            {
             before(grammarAccess.getClasseAccess().getNomClasseEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getNomClasseEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Classe__NomClasseAssignment_1"


    // $ANTLR start "rule__Classe__AttributsAssignment_5"
    // InternalSmallUML.g:1713:1: rule__Classe__AttributsAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Classe__AttributsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1717:1: ( ( ruleAttribut ) )
            // InternalSmallUML.g:1718:2: ( ruleAttribut )
            {
            // InternalSmallUML.g:1718:2: ( ruleAttribut )
            // InternalSmallUML.g:1719:3: ruleAttribut
            {
             before(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getAttributsAttributParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Classe__AttributsAssignment_5"


    // $ANTLR start "rule__Classe__MethodesAssignment_9"
    // InternalSmallUML.g:1728:1: rule__Classe__MethodesAssignment_9 : ( ruleMethode ) ;
    public final void rule__Classe__MethodesAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1732:1: ( ( ruleMethode ) )
            // InternalSmallUML.g:1733:2: ( ruleMethode )
            {
            // InternalSmallUML.g:1733:2: ( ruleMethode )
            // InternalSmallUML.g:1734:3: ruleMethode
            {
             before(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getMethodesMethodeParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Classe__MethodesAssignment_9"


    // $ANTLR start "rule__Classe__CardinalitesAssignment_13"
    // InternalSmallUML.g:1743:1: rule__Classe__CardinalitesAssignment_13 : ( ruleCardinalite ) ;
    public final void rule__Classe__CardinalitesAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1747:1: ( ( ruleCardinalite ) )
            // InternalSmallUML.g:1748:2: ( ruleCardinalite )
            {
            // InternalSmallUML.g:1748:2: ( ruleCardinalite )
            // InternalSmallUML.g:1749:3: ruleCardinalite
            {
             before(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalite();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getCardinalitesCardinaliteParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__Classe__CardinalitesAssignment_13"


    // $ANTLR start "rule__Classe__SousClassesAssignment_17"
    // InternalSmallUML.g:1758:1: rule__Classe__SousClassesAssignment_17 : ( ruleClasse ) ;
    public final void rule__Classe__SousClassesAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1762:1: ( ( ruleClasse ) )
            // InternalSmallUML.g:1763:2: ( ruleClasse )
            {
            // InternalSmallUML.g:1763:2: ( ruleClasse )
            // InternalSmallUML.g:1764:3: ruleClasse
            {
             before(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleClasse();

            state._fsp--;

             after(grammarAccess.getClasseAccess().getSousClassesClasseParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__Classe__SousClassesAssignment_17"


    // $ANTLR start "rule__Classe__SuperClasseAssignment_21"
    // InternalSmallUML.g:1773:1: rule__Classe__SuperClasseAssignment_21 : ( ( RULE_ID ) ) ;
    public final void rule__Classe__SuperClasseAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1777:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:1778:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:1778:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:1779:3: ( RULE_ID )
            {
             before(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_21_0()); 
            // InternalSmallUML.g:1780:3: ( RULE_ID )
            // InternalSmallUML.g:1781:4: RULE_ID
            {
             before(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_21_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClasseAccess().getSuperClasseClasseIDTerminalRuleCall_21_0_1()); 

            }

             after(grammarAccess.getClasseAccess().getSuperClasseClasseCrossReference_21_0()); 

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
    // $ANTLR end "rule__Classe__SuperClasseAssignment_21"


    // $ANTLR start "rule__Attribut__NomAttributAssignment_2"
    // InternalSmallUML.g:1792:1: rule__Attribut__NomAttributAssignment_2 : ( ruleEString ) ;
    public final void rule__Attribut__NomAttributAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1796:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1797:2: ( ruleEString )
            {
            // InternalSmallUML.g:1797:2: ( ruleEString )
            // InternalSmallUML.g:1798:3: ruleEString
            {
             before(grammarAccess.getAttributAccess().getNomAttributEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributAccess().getNomAttributEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribut__NomAttributAssignment_2"


    // $ANTLR start "rule__Attribut__TypeAssignment_3"
    // InternalSmallUML.g:1807:1: rule__Attribut__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Attribut__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1811:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:1812:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:1812:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:1813:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributAccess().getTypeTypeCrossReference_3_0()); 
            // InternalSmallUML.g:1814:3: ( RULE_ID )
            // InternalSmallUML.g:1815:4: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Attribut__TypeAssignment_3"


    // $ANTLR start "rule__Methode__TypeDeRetourAssignment_2"
    // InternalSmallUML.g:1826:1: rule__Methode__TypeDeRetourAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Methode__TypeDeRetourAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1830:1: ( ( ( RULE_ID ) ) )
            // InternalSmallUML.g:1831:2: ( ( RULE_ID ) )
            {
            // InternalSmallUML.g:1831:2: ( ( RULE_ID ) )
            // InternalSmallUML.g:1832:3: ( RULE_ID )
            {
             before(grammarAccess.getMethodeAccess().getTypeDeRetourTypeCrossReference_2_0()); 
            // InternalSmallUML.g:1833:3: ( RULE_ID )
            // InternalSmallUML.g:1834:4: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getTypeDeRetourTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getTypeDeRetourTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMethodeAccess().getTypeDeRetourTypeCrossReference_2_0()); 

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


    // $ANTLR start "rule__Methode__NomMethodeAssignment_3"
    // InternalSmallUML.g:1845:1: rule__Methode__NomMethodeAssignment_3 : ( ruleEString ) ;
    public final void rule__Methode__NomMethodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1849:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1850:2: ( ruleEString )
            {
            // InternalSmallUML.g:1850:2: ( ruleEString )
            // InternalSmallUML.g:1851:3: ruleEString
            {
             before(grammarAccess.getMethodeAccess().getNomMethodeEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMethodeAccess().getNomMethodeEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Methode__NomMethodeAssignment_3"


    // $ANTLR start "rule__Methode__ParametresAssignment_5"
    // InternalSmallUML.g:1860:1: rule__Methode__ParametresAssignment_5 : ( ruleAttribut ) ;
    public final void rule__Methode__ParametresAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1864:1: ( ( ruleAttribut ) )
            // InternalSmallUML.g:1865:2: ( ruleAttribut )
            {
            // InternalSmallUML.g:1865:2: ( ruleAttribut )
            // InternalSmallUML.g:1866:3: ruleAttribut
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


    // $ANTLR start "rule__Element__NomElementAssignment"
    // InternalSmallUML.g:1875:1: rule__Element__NomElementAssignment : ( ruleEString ) ;
    public final void rule__Element__NomElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1879:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1880:2: ( ruleEString )
            {
            // InternalSmallUML.g:1880:2: ( ruleEString )
            // InternalSmallUML.g:1881:3: ruleEString
            {
             before(grammarAccess.getElementAccess().getNomElementEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementAccess().getNomElementEStringParserRuleCall_0()); 

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
    // $ANTLR end "rule__Element__NomElementAssignment"


    // $ANTLR start "rule__Cardinalite__MultipliciteAssignment_1"
    // InternalSmallUML.g:1890:1: rule__Cardinalite__MultipliciteAssignment_1 : ( ruleEString ) ;
    public final void rule__Cardinalite__MultipliciteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1894:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1895:2: ( ruleEString )
            {
            // InternalSmallUML.g:1895:2: ( ruleEString )
            // InternalSmallUML.g:1896:3: ruleEString
            {
             before(grammarAccess.getCardinaliteAccess().getMultipliciteEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCardinaliteAccess().getMultipliciteEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cardinalite__MultipliciteAssignment_1"


    // $ANTLR start "rule__TypeDonnee__NomTypeAssignment_1"
    // InternalSmallUML.g:1905:1: rule__TypeDonnee__NomTypeAssignment_1 : ( ruleEString ) ;
    public final void rule__TypeDonnee__NomTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1909:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1910:2: ( ruleEString )
            {
            // InternalSmallUML.g:1910:2: ( ruleEString )
            // InternalSmallUML.g:1911:3: ruleEString
            {
             before(grammarAccess.getTypeDonneeAccess().getNomTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTypeDonneeAccess().getNomTypeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypeDonnee__NomTypeAssignment_1"


    // $ANTLR start "rule__TypeDonnee__AttributsAssignment_3"
    // InternalSmallUML.g:1920:1: rule__TypeDonnee__AttributsAssignment_3 : ( ruleAttribut ) ;
    public final void rule__TypeDonnee__AttributsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1924:1: ( ( ruleAttribut ) )
            // InternalSmallUML.g:1925:2: ( ruleAttribut )
            {
            // InternalSmallUML.g:1925:2: ( ruleAttribut )
            // InternalSmallUML.g:1926:3: ruleAttribut
            {
             before(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getTypeDonneeAccess().getAttributsAttributParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TypeDonnee__AttributsAssignment_3"


    // $ANTLR start "rule__Enumeration__NomEnumerationAssignment_1"
    // InternalSmallUML.g:1935:1: rule__Enumeration__NomEnumerationAssignment_1 : ( ruleEString ) ;
    public final void rule__Enumeration__NomEnumerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1939:1: ( ( ruleEString ) )
            // InternalSmallUML.g:1940:2: ( ruleEString )
            {
            // InternalSmallUML.g:1940:2: ( ruleEString )
            // InternalSmallUML.g:1941:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNomEnumerationEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNomEnumerationEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Enumeration__NomEnumerationAssignment_1"


    // $ANTLR start "rule__Enumeration__ElementsAssignment_3"
    // InternalSmallUML.g:1950:1: rule__Enumeration__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Enumeration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1954:1: ( ( ruleElement ) )
            // InternalSmallUML.g:1955:2: ( ruleElement )
            {
            // InternalSmallUML.g:1955:2: ( ruleElement )
            // InternalSmallUML.g:1956:3: ruleElement
            {
             before(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getElementsElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Enumeration__ElementsAssignment_3"


    // $ANTLR start "rule__Chaine__NomTypeAssignment"
    // InternalSmallUML.g:1965:1: rule__Chaine__NomTypeAssignment : ( ( 'Chaine' ) ) ;
    public final void rule__Chaine__NomTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1969:1: ( ( ( 'Chaine' ) ) )
            // InternalSmallUML.g:1970:2: ( ( 'Chaine' ) )
            {
            // InternalSmallUML.g:1970:2: ( ( 'Chaine' ) )
            // InternalSmallUML.g:1971:3: ( 'Chaine' )
            {
             before(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); 
            // InternalSmallUML.g:1972:3: ( 'Chaine' )
            // InternalSmallUML.g:1973:4: 'Chaine'
            {
             before(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); 

            }

             after(grammarAccess.getChaineAccess().getNomTypeChaineKeyword_0()); 

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
    // $ANTLR end "rule__Chaine__NomTypeAssignment"


    // $ANTLR start "rule__Entier__NomTypeAssignment"
    // InternalSmallUML.g:1984:1: rule__Entier__NomTypeAssignment : ( ( 'Entier' ) ) ;
    public final void rule__Entier__NomTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1988:1: ( ( ( 'Entier' ) ) )
            // InternalSmallUML.g:1989:2: ( ( 'Entier' ) )
            {
            // InternalSmallUML.g:1989:2: ( ( 'Entier' ) )
            // InternalSmallUML.g:1990:3: ( 'Entier' )
            {
             before(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); 
            // InternalSmallUML.g:1991:3: ( 'Entier' )
            // InternalSmallUML.g:1992:4: 'Entier'
            {
             before(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); 

            }

             after(grammarAccess.getEntierAccess().getNomTypeEntierKeyword_0()); 

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
    // $ANTLR end "rule__Entier__NomTypeAssignment"


    // $ANTLR start "rule__Booleen__NomTypeAssignment"
    // InternalSmallUML.g:2003:1: rule__Booleen__NomTypeAssignment : ( ( 'Booleen' ) ) ;
    public final void rule__Booleen__NomTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2007:1: ( ( ( 'Booleen' ) ) )
            // InternalSmallUML.g:2008:2: ( ( 'Booleen' ) )
            {
            // InternalSmallUML.g:2008:2: ( ( 'Booleen' ) )
            // InternalSmallUML.g:2009:3: ( 'Booleen' )
            {
             before(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); 
            // InternalSmallUML.g:2010:3: ( 'Booleen' )
            // InternalSmallUML.g:2011:4: 'Booleen'
            {
             before(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); 

            }

             after(grammarAccess.getBooleenAccess().getNomTypeBooleenKeyword_0()); 

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
    // $ANTLR end "rule__Booleen__NomTypeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000032L});

}