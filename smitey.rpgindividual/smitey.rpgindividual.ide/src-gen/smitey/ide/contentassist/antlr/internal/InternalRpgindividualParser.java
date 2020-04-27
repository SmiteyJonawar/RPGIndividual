package smitey.ide.contentassist.antlr.internal;

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
import smitey.services.RpgindividualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgindividualParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Float'", "'Integer'", "'game'", "'effects'", "'effect'", "'buff'", "'move'", "'after'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "'<'", "','", "'moves'", "'is'", "'if'", "'then'", "'entities'", "'death'", "'entity'", "'teams'", "'team'", "'members'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRpgindividualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRpgindividualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRpgindividualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRpgindividual.g"; }


    	private RpgindividualGrammarAccess grammarAccess;

    	public void setGrammarAccess(RpgindividualGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemRPG"
    // InternalRpgindividual.g:53:1: entryRuleSystemRPG : ruleSystemRPG EOF ;
    public final void entryRuleSystemRPG() throws RecognitionException {
        try {
            // InternalRpgindividual.g:54:1: ( ruleSystemRPG EOF )
            // InternalRpgindividual.g:55:1: ruleSystemRPG EOF
            {
             before(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemRPG();

            state._fsp--;

             after(grammarAccess.getSystemRPGRule()); 
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
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRpgindividual.g:62:1: ruleSystemRPG : ( ( rule__SystemRPG__Group__0 ) ) ;
    public final void ruleSystemRPG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:66:2: ( ( ( rule__SystemRPG__Group__0 ) ) )
            // InternalRpgindividual.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            {
            // InternalRpgindividual.g:67:2: ( ( rule__SystemRPG__Group__0 ) )
            // InternalRpgindividual.g:68:3: ( rule__SystemRPG__Group__0 )
            {
             before(grammarAccess.getSystemRPGAccess().getGroup()); 
            // InternalRpgindividual.g:69:3: ( rule__SystemRPG__Group__0 )
            // InternalRpgindividual.g:69:4: rule__SystemRPG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRpgindividual.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalRpgindividual.g:79:1: ( ruleDeclaration EOF )
            // InternalRpgindividual.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRpgindividual.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalRpgindividual.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalRpgindividual.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalRpgindividual.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalRpgindividual.g:94:3: ( rule__Declaration__Alternatives )
            // InternalRpgindividual.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRpgindividual.g:103:1: entryRuleEffects : ruleEffects EOF ;
    public final void entryRuleEffects() throws RecognitionException {
        try {
            // InternalRpgindividual.g:104:1: ( ruleEffects EOF )
            // InternalRpgindividual.g:105:1: ruleEffects EOF
            {
             before(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            ruleEffects();

            state._fsp--;

             after(grammarAccess.getEffectsRule()); 
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
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRpgindividual.g:112:1: ruleEffects : ( ( rule__Effects__Group__0 ) ) ;
    public final void ruleEffects() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:116:2: ( ( ( rule__Effects__Group__0 ) ) )
            // InternalRpgindividual.g:117:2: ( ( rule__Effects__Group__0 ) )
            {
            // InternalRpgindividual.g:117:2: ( ( rule__Effects__Group__0 ) )
            // InternalRpgindividual.g:118:3: ( rule__Effects__Group__0 )
            {
             before(grammarAccess.getEffectsAccess().getGroup()); 
            // InternalRpgindividual.g:119:3: ( rule__Effects__Group__0 )
            // InternalRpgindividual.g:119:4: rule__Effects__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getGroup()); 

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
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRpgindividual.g:128:1: entryRuleEffect : ruleEffect EOF ;
    public final void entryRuleEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:129:1: ( ruleEffect EOF )
            // InternalRpgindividual.g:130:1: ruleEffect EOF
            {
             before(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectRule()); 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRpgindividual.g:137:1: ruleEffect : ( ( rule__Effect__Group__0 ) ) ;
    public final void ruleEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:141:2: ( ( ( rule__Effect__Group__0 ) ) )
            // InternalRpgindividual.g:142:2: ( ( rule__Effect__Group__0 ) )
            {
            // InternalRpgindividual.g:142:2: ( ( rule__Effect__Group__0 ) )
            // InternalRpgindividual.g:143:3: ( rule__Effect__Group__0 )
            {
             before(grammarAccess.getEffectAccess().getGroup()); 
            // InternalRpgindividual.g:144:3: ( rule__Effect__Group__0 )
            // InternalRpgindividual.g:144:4: rule__Effect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getGroup()); 

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleBuff"
    // InternalRpgindividual.g:153:1: entryRuleBuff : ruleBuff EOF ;
    public final void entryRuleBuff() throws RecognitionException {
        try {
            // InternalRpgindividual.g:154:1: ( ruleBuff EOF )
            // InternalRpgindividual.g:155:1: ruleBuff EOF
            {
             before(grammarAccess.getBuffRule()); 
            pushFollow(FOLLOW_1);
            ruleBuff();

            state._fsp--;

             after(grammarAccess.getBuffRule()); 
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
    // $ANTLR end "entryRuleBuff"


    // $ANTLR start "ruleBuff"
    // InternalRpgindividual.g:162:1: ruleBuff : ( ( rule__Buff__Group__0 ) ) ;
    public final void ruleBuff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:166:2: ( ( ( rule__Buff__Group__0 ) ) )
            // InternalRpgindividual.g:167:2: ( ( rule__Buff__Group__0 ) )
            {
            // InternalRpgindividual.g:167:2: ( ( rule__Buff__Group__0 ) )
            // InternalRpgindividual.g:168:3: ( rule__Buff__Group__0 )
            {
             before(grammarAccess.getBuffAccess().getGroup()); 
            // InternalRpgindividual.g:169:3: ( rule__Buff__Group__0 )
            // InternalRpgindividual.g:169:4: rule__Buff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Buff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getGroup()); 

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
    // $ANTLR end "ruleBuff"


    // $ANTLR start "entryRuleMoveE"
    // InternalRpgindividual.g:178:1: entryRuleMoveE : ruleMoveE EOF ;
    public final void entryRuleMoveE() throws RecognitionException {
        try {
            // InternalRpgindividual.g:179:1: ( ruleMoveE EOF )
            // InternalRpgindividual.g:180:1: ruleMoveE EOF
            {
             before(grammarAccess.getMoveERule()); 
            pushFollow(FOLLOW_1);
            ruleMoveE();

            state._fsp--;

             after(grammarAccess.getMoveERule()); 
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
    // $ANTLR end "entryRuleMoveE"


    // $ANTLR start "ruleMoveE"
    // InternalRpgindividual.g:187:1: ruleMoveE : ( ( rule__MoveE__Group__0 ) ) ;
    public final void ruleMoveE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:191:2: ( ( ( rule__MoveE__Group__0 ) ) )
            // InternalRpgindividual.g:192:2: ( ( rule__MoveE__Group__0 ) )
            {
            // InternalRpgindividual.g:192:2: ( ( rule__MoveE__Group__0 ) )
            // InternalRpgindividual.g:193:3: ( rule__MoveE__Group__0 )
            {
             before(grammarAccess.getMoveEAccess().getGroup()); 
            // InternalRpgindividual.g:194:3: ( rule__MoveE__Group__0 )
            // InternalRpgindividual.g:194:4: rule__MoveE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveE"


    // $ANTLR start "entryRuleAfterE"
    // InternalRpgindividual.g:203:1: entryRuleAfterE : ruleAfterE EOF ;
    public final void entryRuleAfterE() throws RecognitionException {
        try {
            // InternalRpgindividual.g:204:1: ( ruleAfterE EOF )
            // InternalRpgindividual.g:205:1: ruleAfterE EOF
            {
             before(grammarAccess.getAfterERule()); 
            pushFollow(FOLLOW_1);
            ruleAfterE();

            state._fsp--;

             after(grammarAccess.getAfterERule()); 
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
    // $ANTLR end "entryRuleAfterE"


    // $ANTLR start "ruleAfterE"
    // InternalRpgindividual.g:212:1: ruleAfterE : ( ( rule__AfterE__Group__0 ) ) ;
    public final void ruleAfterE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:216:2: ( ( ( rule__AfterE__Group__0 ) ) )
            // InternalRpgindividual.g:217:2: ( ( rule__AfterE__Group__0 ) )
            {
            // InternalRpgindividual.g:217:2: ( ( rule__AfterE__Group__0 ) )
            // InternalRpgindividual.g:218:3: ( rule__AfterE__Group__0 )
            {
             before(grammarAccess.getAfterEAccess().getGroup()); 
            // InternalRpgindividual.g:219:3: ( rule__AfterE__Group__0 )
            // InternalRpgindividual.g:219:4: rule__AfterE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getGroup()); 

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
    // $ANTLR end "ruleAfterE"


    // $ANTLR start "entryRuleAttributes"
    // InternalRpgindividual.g:228:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalRpgindividual.g:229:1: ( ruleAttributes EOF )
            // InternalRpgindividual.g:230:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRpgindividual.g:237:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:241:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalRpgindividual.g:242:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalRpgindividual.g:242:2: ( ( rule__Attributes__Group__0 ) )
            // InternalRpgindividual.g:243:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalRpgindividual.g:244:3: ( rule__Attributes__Group__0 )
            // InternalRpgindividual.g:244:4: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRpgindividual.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:254:1: ( ruleAttribute EOF )
            // InternalRpgindividual.g:255:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRpgindividual.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRpgindividual.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRpgindividual.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRpgindividual.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:269:3: ( rule__Attribute__Group__0 )
            // InternalRpgindividual.g:269:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRpgindividual.g:278:1: entryRuleLocations : ruleLocations EOF ;
    public final void entryRuleLocations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:279:1: ( ruleLocations EOF )
            // InternalRpgindividual.g:280:1: ruleLocations EOF
            {
             before(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            ruleLocations();

            state._fsp--;

             after(grammarAccess.getLocationsRule()); 
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
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRpgindividual.g:287:1: ruleLocations : ( ( rule__Locations__Group__0 ) ) ;
    public final void ruleLocations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:291:2: ( ( ( rule__Locations__Group__0 ) ) )
            // InternalRpgindividual.g:292:2: ( ( rule__Locations__Group__0 ) )
            {
            // InternalRpgindividual.g:292:2: ( ( rule__Locations__Group__0 ) )
            // InternalRpgindividual.g:293:3: ( rule__Locations__Group__0 )
            {
             before(grammarAccess.getLocationsAccess().getGroup()); 
            // InternalRpgindividual.g:294:3: ( rule__Locations__Group__0 )
            // InternalRpgindividual.g:294:4: rule__Locations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getGroup()); 

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
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRpgindividual.g:303:1: entryRuleLoc : ruleLoc EOF ;
    public final void entryRuleLoc() throws RecognitionException {
        try {
            // InternalRpgindividual.g:304:1: ( ruleLoc EOF )
            // InternalRpgindividual.g:305:1: ruleLoc EOF
            {
             before(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocRule()); 
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
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRpgindividual.g:312:1: ruleLoc : ( ( rule__Loc__Group__0 ) ) ;
    public final void ruleLoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:316:2: ( ( ( rule__Loc__Group__0 ) ) )
            // InternalRpgindividual.g:317:2: ( ( rule__Loc__Group__0 ) )
            {
            // InternalRpgindividual.g:317:2: ( ( rule__Loc__Group__0 ) )
            // InternalRpgindividual.g:318:3: ( rule__Loc__Group__0 )
            {
             before(grammarAccess.getLocAccess().getGroup()); 
            // InternalRpgindividual.g:319:3: ( rule__Loc__Group__0 )
            // InternalRpgindividual.g:319:4: rule__Loc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getGroup()); 

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
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRpgindividual.g:328:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:329:1: ( ruleRelations EOF )
            // InternalRpgindividual.g:330:1: ruleRelations EOF
            {
             before(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            ruleRelations();

            state._fsp--;

             after(grammarAccess.getRelationsRule()); 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRpgindividual.g:337:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:341:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalRpgindividual.g:342:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalRpgindividual.g:342:2: ( ( rule__Relations__Group__0 ) )
            // InternalRpgindividual.g:343:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalRpgindividual.g:344:3: ( rule__Relations__Group__0 )
            // InternalRpgindividual.g:344:4: rule__Relations__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getGroup()); 

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
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleType"
    // InternalRpgindividual.g:353:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:354:1: ( ruleType EOF )
            // InternalRpgindividual.g:355:1: ruleType EOF
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
    // InternalRpgindividual.g:362:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:366:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalRpgindividual.g:367:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalRpgindividual.g:367:2: ( ( rule__Type__Group__0 ) )
            // InternalRpgindividual.g:368:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalRpgindividual.g:369:3: ( rule__Type__Group__0 )
            // InternalRpgindividual.g:369:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRpgindividual.g:378:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // InternalRpgindividual.g:379:1: ( ruleTypeExpression EOF )
            // InternalRpgindividual.g:380:1: ruleTypeExpression EOF
            {
             before(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeExpressionRule()); 
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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRpgindividual.g:387:1: ruleTypeExpression : ( ( rule__TypeExpression__Group__0 ) ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:391:2: ( ( ( rule__TypeExpression__Group__0 ) ) )
            // InternalRpgindividual.g:392:2: ( ( rule__TypeExpression__Group__0 ) )
            {
            // InternalRpgindividual.g:392:2: ( ( rule__TypeExpression__Group__0 ) )
            // InternalRpgindividual.g:393:3: ( rule__TypeExpression__Group__0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup()); 
            // InternalRpgindividual.g:394:3: ( rule__TypeExpression__Group__0 )
            // InternalRpgindividual.g:394:4: rule__TypeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRpgindividual.g:403:1: entryRuleMoves : ruleMoves EOF ;
    public final void entryRuleMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:404:1: ( ruleMoves EOF )
            // InternalRpgindividual.g:405:1: ruleMoves EOF
            {
             before(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleMoves();

            state._fsp--;

             after(grammarAccess.getMovesRule()); 
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
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRpgindividual.g:412:1: ruleMoves : ( ( rule__Moves__Group__0 ) ) ;
    public final void ruleMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:416:2: ( ( ( rule__Moves__Group__0 ) ) )
            // InternalRpgindividual.g:417:2: ( ( rule__Moves__Group__0 ) )
            {
            // InternalRpgindividual.g:417:2: ( ( rule__Moves__Group__0 ) )
            // InternalRpgindividual.g:418:3: ( rule__Moves__Group__0 )
            {
             before(grammarAccess.getMovesAccess().getGroup()); 
            // InternalRpgindividual.g:419:3: ( rule__Moves__Group__0 )
            // InternalRpgindividual.g:419:4: rule__Moves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getGroup()); 

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
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRpgindividual.g:428:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalRpgindividual.g:429:1: ( ruleMove EOF )
            // InternalRpgindividual.g:430:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRpgindividual.g:437:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:441:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalRpgindividual.g:442:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalRpgindividual.g:442:2: ( ( rule__Move__Group__0 ) )
            // InternalRpgindividual.g:443:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalRpgindividual.g:444:3: ( rule__Move__Group__0 )
            // InternalRpgindividual.g:444:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRpgindividual.g:453:1: entryRuleMEffect : ruleMEffect EOF ;
    public final void entryRuleMEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:454:1: ( ruleMEffect EOF )
            // InternalRpgindividual.g:455:1: ruleMEffect EOF
            {
             before(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMEffectRule()); 
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
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRpgindividual.g:462:1: ruleMEffect : ( ( rule__MEffect__Group__0 ) ) ;
    public final void ruleMEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:466:2: ( ( ( rule__MEffect__Group__0 ) ) )
            // InternalRpgindividual.g:467:2: ( ( rule__MEffect__Group__0 ) )
            {
            // InternalRpgindividual.g:467:2: ( ( rule__MEffect__Group__0 ) )
            // InternalRpgindividual.g:468:3: ( rule__MEffect__Group__0 )
            {
             before(grammarAccess.getMEffectAccess().getGroup()); 
            // InternalRpgindividual.g:469:3: ( rule__MEffect__Group__0 )
            // InternalRpgindividual.g:469:4: rule__MEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getGroup()); 

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
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleBEffect"
    // InternalRpgindividual.g:478:1: entryRuleBEffect : ruleBEffect EOF ;
    public final void entryRuleBEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:479:1: ( ruleBEffect EOF )
            // InternalRpgindividual.g:480:1: ruleBEffect EOF
            {
             before(grammarAccess.getBEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleBEffect();

            state._fsp--;

             after(grammarAccess.getBEffectRule()); 
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
    // $ANTLR end "entryRuleBEffect"


    // $ANTLR start "ruleBEffect"
    // InternalRpgindividual.g:487:1: ruleBEffect : ( ( rule__BEffect__Group__0 ) ) ;
    public final void ruleBEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:491:2: ( ( ( rule__BEffect__Group__0 ) ) )
            // InternalRpgindividual.g:492:2: ( ( rule__BEffect__Group__0 ) )
            {
            // InternalRpgindividual.g:492:2: ( ( rule__BEffect__Group__0 ) )
            // InternalRpgindividual.g:493:3: ( rule__BEffect__Group__0 )
            {
             before(grammarAccess.getBEffectAccess().getGroup()); 
            // InternalRpgindividual.g:494:3: ( rule__BEffect__Group__0 )
            // InternalRpgindividual.g:494:4: rule__BEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBEffectAccess().getGroup()); 

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
    // $ANTLR end "ruleBEffect"


    // $ANTLR start "entryRuleAEffect"
    // InternalRpgindividual.g:503:1: entryRuleAEffect : ruleAEffect EOF ;
    public final void entryRuleAEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:504:1: ( ruleAEffect EOF )
            // InternalRpgindividual.g:505:1: ruleAEffect EOF
            {
             before(grammarAccess.getAEffectRule()); 
            pushFollow(FOLLOW_1);
            ruleAEffect();

            state._fsp--;

             after(grammarAccess.getAEffectRule()); 
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
    // $ANTLR end "entryRuleAEffect"


    // $ANTLR start "ruleAEffect"
    // InternalRpgindividual.g:512:1: ruleAEffect : ( ( rule__AEffect__Group__0 ) ) ;
    public final void ruleAEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:516:2: ( ( ( rule__AEffect__Group__0 ) ) )
            // InternalRpgindividual.g:517:2: ( ( rule__AEffect__Group__0 ) )
            {
            // InternalRpgindividual.g:517:2: ( ( rule__AEffect__Group__0 ) )
            // InternalRpgindividual.g:518:3: ( rule__AEffect__Group__0 )
            {
             before(grammarAccess.getAEffectAccess().getGroup()); 
            // InternalRpgindividual.g:519:3: ( rule__AEffect__Group__0 )
            // InternalRpgindividual.g:519:4: rule__AEffect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAEffectAccess().getGroup()); 

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
    // $ANTLR end "ruleAEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRpgindividual.g:528:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:529:1: ( ruleEType EOF )
            // InternalRpgindividual.g:530:1: ruleEType EOF
            {
             before(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getETypeRule()); 
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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRpgindividual.g:537:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:541:2: ( ( ( rule__EType__Group__0 ) ) )
            // InternalRpgindividual.g:542:2: ( ( rule__EType__Group__0 ) )
            {
            // InternalRpgindividual.g:542:2: ( ( rule__EType__Group__0 ) )
            // InternalRpgindividual.g:543:3: ( rule__EType__Group__0 )
            {
             before(grammarAccess.getETypeAccess().getGroup()); 
            // InternalRpgindividual.g:544:3: ( rule__EType__Group__0 )
            // InternalRpgindividual.g:544:4: rule__EType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getGroup()); 

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
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRpgindividual.g:553:1: entryRuleAttributeValues : ruleAttributeValues EOF ;
    public final void entryRuleAttributeValues() throws RecognitionException {
        try {
            // InternalRpgindividual.g:554:1: ( ruleAttributeValues EOF )
            // InternalRpgindividual.g:555:1: ruleAttributeValues EOF
            {
             before(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeValuesRule()); 
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
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRpgindividual.g:562:1: ruleAttributeValues : ( ( rule__AttributeValues__Group__0 ) ) ;
    public final void ruleAttributeValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:566:2: ( ( ( rule__AttributeValues__Group__0 ) ) )
            // InternalRpgindividual.g:567:2: ( ( rule__AttributeValues__Group__0 ) )
            {
            // InternalRpgindividual.g:567:2: ( ( rule__AttributeValues__Group__0 ) )
            // InternalRpgindividual.g:568:3: ( rule__AttributeValues__Group__0 )
            {
             before(grammarAccess.getAttributeValuesAccess().getGroup()); 
            // InternalRpgindividual.g:569:3: ( rule__AttributeValues__Group__0 )
            // InternalRpgindividual.g:569:4: rule__AttributeValues__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRpgindividual.g:578:1: entryRuleAltAttribute : ruleAltAttribute EOF ;
    public final void entryRuleAltAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:579:1: ( ruleAltAttribute EOF )
            // InternalRpgindividual.g:580:1: ruleAltAttribute EOF
            {
             before(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getAltAttributeRule()); 
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
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRpgindividual.g:587:1: ruleAltAttribute : ( ( rule__AltAttribute__Group__0 ) ) ;
    public final void ruleAltAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:591:2: ( ( ( rule__AltAttribute__Group__0 ) ) )
            // InternalRpgindividual.g:592:2: ( ( rule__AltAttribute__Group__0 ) )
            {
            // InternalRpgindividual.g:592:2: ( ( rule__AltAttribute__Group__0 ) )
            // InternalRpgindividual.g:593:3: ( rule__AltAttribute__Group__0 )
            {
             before(grammarAccess.getAltAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:594:3: ( rule__AltAttribute__Group__0 )
            // InternalRpgindividual.g:594:4: rule__AltAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRpgindividual.g:603:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRpgindividual.g:604:1: ( ruleRule EOF )
            // InternalRpgindividual.g:605:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRpgindividual.g:612:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:616:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRpgindividual.g:617:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRpgindividual.g:617:2: ( ( rule__Rule__Group__0 ) )
            // InternalRpgindividual.g:618:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRpgindividual.g:619:3: ( rule__Rule__Group__0 )
            // InternalRpgindividual.g:619:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRpgindividual.g:628:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalRpgindividual.g:629:1: ( ruleEntities EOF )
            // InternalRpgindividual.g:630:1: ruleEntities EOF
            {
             before(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntities();

            state._fsp--;

             after(grammarAccess.getEntitiesRule()); 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRpgindividual.g:637:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:641:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalRpgindividual.g:642:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalRpgindividual.g:642:2: ( ( rule__Entities__Group__0 ) )
            // InternalRpgindividual.g:643:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalRpgindividual.g:644:3: ( rule__Entities__Group__0 )
            // InternalRpgindividual.g:644:4: rule__Entities__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getGroup()); 

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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRpgindividual.g:653:1: entryRuleDeath : ruleDeath EOF ;
    public final void entryRuleDeath() throws RecognitionException {
        try {
            // InternalRpgindividual.g:654:1: ( ruleDeath EOF )
            // InternalRpgindividual.g:655:1: ruleDeath EOF
            {
             before(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            ruleDeath();

            state._fsp--;

             after(grammarAccess.getDeathRule()); 
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
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRpgindividual.g:662:1: ruleDeath : ( ( rule__Death__Group__0 ) ) ;
    public final void ruleDeath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:666:2: ( ( ( rule__Death__Group__0 ) ) )
            // InternalRpgindividual.g:667:2: ( ( rule__Death__Group__0 ) )
            {
            // InternalRpgindividual.g:667:2: ( ( rule__Death__Group__0 ) )
            // InternalRpgindividual.g:668:3: ( rule__Death__Group__0 )
            {
             before(grammarAccess.getDeathAccess().getGroup()); 
            // InternalRpgindividual.g:669:3: ( rule__Death__Group__0 )
            // InternalRpgindividual.g:669:4: rule__Death__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getGroup()); 

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
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRpgindividual.g:678:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRpgindividual.g:679:1: ( ruleEntity EOF )
            // InternalRpgindividual.g:680:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRpgindividual.g:687:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:691:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRpgindividual.g:692:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRpgindividual.g:692:2: ( ( rule__Entity__Group__0 ) )
            // InternalRpgindividual.g:693:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRpgindividual.g:694:3: ( rule__Entity__Group__0 )
            // InternalRpgindividual.g:694:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRpgindividual.g:703:1: entryRuleEntityMoves : ruleEntityMoves EOF ;
    public final void entryRuleEntityMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:704:1: ( ruleEntityMoves EOF )
            // InternalRpgindividual.g:705:1: ruleEntityMoves EOF
            {
             before(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityMovesRule()); 
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
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRpgindividual.g:712:1: ruleEntityMoves : ( ( rule__EntityMoves__Group__0 ) ) ;
    public final void ruleEntityMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:716:2: ( ( ( rule__EntityMoves__Group__0 ) ) )
            // InternalRpgindividual.g:717:2: ( ( rule__EntityMoves__Group__0 ) )
            {
            // InternalRpgindividual.g:717:2: ( ( rule__EntityMoves__Group__0 ) )
            // InternalRpgindividual.g:718:3: ( rule__EntityMoves__Group__0 )
            {
             before(grammarAccess.getEntityMovesAccess().getGroup()); 
            // InternalRpgindividual.g:719:3: ( rule__EntityMoves__Group__0 )
            // InternalRpgindividual.g:719:4: rule__EntityMoves__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getGroup()); 

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
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:728:1: entryRuleTeams : ruleTeams EOF ;
    public final void entryRuleTeams() throws RecognitionException {
        try {
            // InternalRpgindividual.g:729:1: ( ruleTeams EOF )
            // InternalRpgindividual.g:730:1: ruleTeams EOF
            {
             before(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            ruleTeams();

            state._fsp--;

             after(grammarAccess.getTeamsRule()); 
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
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRpgindividual.g:737:1: ruleTeams : ( ( rule__Teams__Group__0 ) ) ;
    public final void ruleTeams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:741:2: ( ( ( rule__Teams__Group__0 ) ) )
            // InternalRpgindividual.g:742:2: ( ( rule__Teams__Group__0 ) )
            {
            // InternalRpgindividual.g:742:2: ( ( rule__Teams__Group__0 ) )
            // InternalRpgindividual.g:743:3: ( rule__Teams__Group__0 )
            {
             before(grammarAccess.getTeamsAccess().getGroup()); 
            // InternalRpgindividual.g:744:3: ( rule__Teams__Group__0 )
            // InternalRpgindividual.g:744:4: rule__Teams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getGroup()); 

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
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRpgindividual.g:753:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalRpgindividual.g:754:1: ( ruleTeam EOF )
            // InternalRpgindividual.g:755:1: ruleTeam EOF
            {
             before(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamRule()); 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRpgindividual.g:762:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:766:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalRpgindividual.g:767:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalRpgindividual.g:767:2: ( ( rule__Team__Group__0 ) )
            // InternalRpgindividual.g:768:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalRpgindividual.g:769:3: ( rule__Team__Group__0 )
            // InternalRpgindividual.g:769:4: rule__Team__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getGroup()); 

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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRpgindividual.g:778:1: entryRuleMembers : ruleMembers EOF ;
    public final void entryRuleMembers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:779:1: ( ruleMembers EOF )
            // InternalRpgindividual.g:780:1: ruleMembers EOF
            {
             before(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getMembersRule()); 
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
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRpgindividual.g:787:1: ruleMembers : ( ( rule__Members__Group__0 ) ) ;
    public final void ruleMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:791:2: ( ( ( rule__Members__Group__0 ) ) )
            // InternalRpgindividual.g:792:2: ( ( rule__Members__Group__0 ) )
            {
            // InternalRpgindividual.g:792:2: ( ( rule__Members__Group__0 ) )
            // InternalRpgindividual.g:793:3: ( rule__Members__Group__0 )
            {
             before(grammarAccess.getMembersAccess().getGroup()); 
            // InternalRpgindividual.g:794:3: ( rule__Members__Group__0 )
            // InternalRpgindividual.g:794:4: rule__Members__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getGroup()); 

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
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleRequire"
    // InternalRpgindividual.g:803:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalRpgindividual.g:804:1: ( ruleRequire EOF )
            // InternalRpgindividual.g:805:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRpgindividual.g:812:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:816:2: ( ( ( rule__Require__Group__0 ) ) )
            // InternalRpgindividual.g:817:2: ( ( rule__Require__Group__0 ) )
            {
            // InternalRpgindividual.g:817:2: ( ( rule__Require__Group__0 ) )
            // InternalRpgindividual.g:818:3: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // InternalRpgindividual.g:819:3: ( rule__Require__Group__0 )
            // InternalRpgindividual.g:819:4: rule__Require__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:828:1: entryRuleORcondition : ruleORcondition EOF ;
    public final void entryRuleORcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:829:1: ( ruleORcondition EOF )
            // InternalRpgindividual.g:830:1: ruleORcondition EOF
            {
             before(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getORconditionRule()); 
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
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRpgindividual.g:837:1: ruleORcondition : ( ( rule__ORcondition__Group__0 ) ) ;
    public final void ruleORcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:841:2: ( ( ( rule__ORcondition__Group__0 ) ) )
            // InternalRpgindividual.g:842:2: ( ( rule__ORcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:842:2: ( ( rule__ORcondition__Group__0 ) )
            // InternalRpgindividual.g:843:3: ( rule__ORcondition__Group__0 )
            {
             before(grammarAccess.getORconditionAccess().getGroup()); 
            // InternalRpgindividual.g:844:3: ( rule__ORcondition__Group__0 )
            // InternalRpgindividual.g:844:4: rule__ORcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRpgindividual.g:853:1: entryRuleANDcondition : ruleANDcondition EOF ;
    public final void entryRuleANDcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:854:1: ( ruleANDcondition EOF )
            // InternalRpgindividual.g:855:1: ruleANDcondition EOF
            {
             before(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getANDconditionRule()); 
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
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRpgindividual.g:862:1: ruleANDcondition : ( ( rule__ANDcondition__Group__0 ) ) ;
    public final void ruleANDcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:866:2: ( ( ( rule__ANDcondition__Group__0 ) ) )
            // InternalRpgindividual.g:867:2: ( ( rule__ANDcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:867:2: ( ( rule__ANDcondition__Group__0 ) )
            // InternalRpgindividual.g:868:3: ( rule__ANDcondition__Group__0 )
            {
             before(grammarAccess.getANDconditionAccess().getGroup()); 
            // InternalRpgindividual.g:869:3: ( rule__ANDcondition__Group__0 )
            // InternalRpgindividual.g:869:4: rule__ANDcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getGroup()); 

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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRpgindividual.g:878:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRpgindividual.g:879:1: ( ruleStatement EOF )
            // InternalRpgindividual.g:880:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRpgindividual.g:887:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:891:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRpgindividual.g:892:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRpgindividual.g:892:2: ( ( rule__Statement__Alternatives ) )
            // InternalRpgindividual.g:893:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRpgindividual.g:894:3: ( rule__Statement__Alternatives )
            // InternalRpgindividual.g:894:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRpgindividual.g:903:1: entryRuleNumberComparing : ruleNumberComparing EOF ;
    public final void entryRuleNumberComparing() throws RecognitionException {
        try {
            // InternalRpgindividual.g:904:1: ( ruleNumberComparing EOF )
            // InternalRpgindividual.g:905:1: ruleNumberComparing EOF
            {
             before(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberComparing();

            state._fsp--;

             after(grammarAccess.getNumberComparingRule()); 
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
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRpgindividual.g:912:1: ruleNumberComparing : ( ( rule__NumberComparing__Group__0 ) ) ;
    public final void ruleNumberComparing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:916:2: ( ( ( rule__NumberComparing__Group__0 ) ) )
            // InternalRpgindividual.g:917:2: ( ( rule__NumberComparing__Group__0 ) )
            {
            // InternalRpgindividual.g:917:2: ( ( rule__NumberComparing__Group__0 ) )
            // InternalRpgindividual.g:918:3: ( rule__NumberComparing__Group__0 )
            {
             before(grammarAccess.getNumberComparingAccess().getGroup()); 
            // InternalRpgindividual.g:919:3: ( rule__NumberComparing__Group__0 )
            // InternalRpgindividual.g:919:4: rule__NumberComparing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getGroup()); 

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
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRpgindividual.g:928:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalRpgindividual.g:929:1: ( ruleComparator EOF )
            // InternalRpgindividual.g:930:1: ruleComparator EOF
            {
             before(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getComparatorRule()); 
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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRpgindividual.g:937:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:941:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // InternalRpgindividual.g:942:2: ( ( rule__Comparator__Alternatives ) )
            {
            // InternalRpgindividual.g:942:2: ( ( rule__Comparator__Alternatives ) )
            // InternalRpgindividual.g:943:3: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // InternalRpgindividual.g:944:3: ( rule__Comparator__Alternatives )
            // InternalRpgindividual.g:944:4: rule__Comparator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRpgindividual.g:953:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:954:1: ( ruleSum EOF )
            // InternalRpgindividual.g:955:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRpgindividual.g:962:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:966:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalRpgindividual.g:967:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalRpgindividual.g:967:2: ( ( rule__Sum__Group__0 ) )
            // InternalRpgindividual.g:968:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalRpgindividual.g:969:3: ( rule__Sum__Group__0 )
            // InternalRpgindividual.g:969:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRpgindividual.g:978:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalRpgindividual.g:979:1: ( ruleMultiply EOF )
            // InternalRpgindividual.g:980:1: ruleMultiply EOF
            {
             before(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getMultiplyRule()); 
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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRpgindividual.g:987:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:991:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalRpgindividual.g:992:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalRpgindividual.g:992:2: ( ( rule__Multiply__Group__0 ) )
            // InternalRpgindividual.g:993:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalRpgindividual.g:994:3: ( rule__Multiply__Group__0 )
            // InternalRpgindividual.g:994:4: rule__Multiply__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRpgindividual.g:1003:1: entryRuleAtomicNumber : ruleAtomicNumber EOF ;
    public final void entryRuleAtomicNumber() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1004:1: ( ruleAtomicNumber EOF )
            // InternalRpgindividual.g:1005:1: ruleAtomicNumber EOF
            {
             before(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getAtomicNumberRule()); 
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
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRpgindividual.g:1012:1: ruleAtomicNumber : ( ( rule__AtomicNumber__Alternatives ) ) ;
    public final void ruleAtomicNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1016:2: ( ( ( rule__AtomicNumber__Alternatives ) ) )
            // InternalRpgindividual.g:1017:2: ( ( rule__AtomicNumber__Alternatives ) )
            {
            // InternalRpgindividual.g:1017:2: ( ( rule__AtomicNumber__Alternatives ) )
            // InternalRpgindividual.g:1018:3: ( rule__AtomicNumber__Alternatives )
            {
             before(grammarAccess.getAtomicNumberAccess().getAlternatives()); 
            // InternalRpgindividual.g:1019:3: ( rule__AtomicNumber__Alternatives )
            // InternalRpgindividual.g:1019:4: rule__AtomicNumber__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicNumber__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicNumberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRpgindividual.g:1028:1: entryRuleActualNumbers : ruleActualNumbers EOF ;
    public final void entryRuleActualNumbers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1029:1: ( ruleActualNumbers EOF )
            // InternalRpgindividual.g:1030:1: ruleActualNumbers EOF
            {
             before(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getActualNumbersRule()); 
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
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRpgindividual.g:1037:1: ruleActualNumbers : ( ( rule__ActualNumbers__Alternatives ) ) ;
    public final void ruleActualNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1041:2: ( ( ( rule__ActualNumbers__Alternatives ) ) )
            // InternalRpgindividual.g:1042:2: ( ( rule__ActualNumbers__Alternatives ) )
            {
            // InternalRpgindividual.g:1042:2: ( ( rule__ActualNumbers__Alternatives ) )
            // InternalRpgindividual.g:1043:3: ( rule__ActualNumbers__Alternatives )
            {
             before(grammarAccess.getActualNumbersAccess().getAlternatives()); 
            // InternalRpgindividual.g:1044:3: ( rule__ActualNumbers__Alternatives )
            // InternalRpgindividual.g:1044:4: rule__ActualNumbers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActualNumbers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActualNumbersAccess().getAlternatives()); 

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
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRpgindividual.g:1053:1: entryRuleNameAttribute : ruleNameAttribute EOF ;
    public final void entryRuleNameAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1054:1: ( ruleNameAttribute EOF )
            // InternalRpgindividual.g:1055:1: ruleNameAttribute EOF
            {
             before(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleNameAttribute();

            state._fsp--;

             after(grammarAccess.getNameAttributeRule()); 
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
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRpgindividual.g:1062:1: ruleNameAttribute : ( ( rule__NameAttribute__AttributeAssignment ) ) ;
    public final void ruleNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1066:2: ( ( ( rule__NameAttribute__AttributeAssignment ) ) )
            // InternalRpgindividual.g:1067:2: ( ( rule__NameAttribute__AttributeAssignment ) )
            {
            // InternalRpgindividual.g:1067:2: ( ( rule__NameAttribute__AttributeAssignment ) )
            // InternalRpgindividual.g:1068:3: ( rule__NameAttribute__AttributeAssignment )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAssignment()); 
            // InternalRpgindividual.g:1069:3: ( rule__NameAttribute__AttributeAssignment )
            // InternalRpgindividual.g:1069:4: rule__NameAttribute__AttributeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__AttributeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAssignment()); 

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
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRpgindividual.g:1078:1: entryRuleIntNum : ruleIntNum EOF ;
    public final void entryRuleIntNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1079:1: ( ruleIntNum EOF )
            // InternalRpgindividual.g:1080:1: ruleIntNum EOF
            {
             before(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            ruleIntNum();

            state._fsp--;

             after(grammarAccess.getIntNumRule()); 
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
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRpgindividual.g:1087:1: ruleIntNum : ( ( rule__IntNum__ValueAssignment ) ) ;
    public final void ruleIntNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1091:2: ( ( ( rule__IntNum__ValueAssignment ) ) )
            // InternalRpgindividual.g:1092:2: ( ( rule__IntNum__ValueAssignment ) )
            {
            // InternalRpgindividual.g:1092:2: ( ( rule__IntNum__ValueAssignment ) )
            // InternalRpgindividual.g:1093:3: ( rule__IntNum__ValueAssignment )
            {
             before(grammarAccess.getIntNumAccess().getValueAssignment()); 
            // InternalRpgindividual.g:1094:3: ( rule__IntNum__ValueAssignment )
            // InternalRpgindividual.g:1094:4: rule__IntNum__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntNum__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntNumAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRpgindividual.g:1103:1: entryRuleFloatNum : ruleFloatNum EOF ;
    public final void entryRuleFloatNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1104:1: ( ruleFloatNum EOF )
            // InternalRpgindividual.g:1105:1: ruleFloatNum EOF
            {
             before(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatNum();

            state._fsp--;

             after(grammarAccess.getFloatNumRule()); 
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
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRpgindividual.g:1112:1: ruleFloatNum : ( ( rule__FloatNum__Group__0 ) ) ;
    public final void ruleFloatNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1116:2: ( ( ( rule__FloatNum__Group__0 ) ) )
            // InternalRpgindividual.g:1117:2: ( ( rule__FloatNum__Group__0 ) )
            {
            // InternalRpgindividual.g:1117:2: ( ( rule__FloatNum__Group__0 ) )
            // InternalRpgindividual.g:1118:3: ( rule__FloatNum__Group__0 )
            {
             before(grammarAccess.getFloatNumAccess().getGroup()); 
            // InternalRpgindividual.g:1119:3: ( rule__FloatNum__Group__0 )
            // InternalRpgindividual.g:1119:4: rule__FloatNum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getGroup()); 

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
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleLegalType"
    // InternalRpgindividual.g:1128:1: entryRuleLegalType : ruleLegalType EOF ;
    public final void entryRuleLegalType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1129:1: ( ruleLegalType EOF )
            // InternalRpgindividual.g:1130:1: ruleLegalType EOF
            {
             before(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getLegalTypeRule()); 
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
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRpgindividual.g:1137:1: ruleLegalType : ( ( rule__LegalType__Alternatives ) ) ;
    public final void ruleLegalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1141:2: ( ( ( rule__LegalType__Alternatives ) ) )
            // InternalRpgindividual.g:1142:2: ( ( rule__LegalType__Alternatives ) )
            {
            // InternalRpgindividual.g:1142:2: ( ( rule__LegalType__Alternatives ) )
            // InternalRpgindividual.g:1143:3: ( rule__LegalType__Alternatives )
            {
             before(grammarAccess.getLegalTypeAccess().getAlternatives()); 
            // InternalRpgindividual.g:1144:3: ( rule__LegalType__Alternatives )
            // InternalRpgindividual.g:1144:4: rule__LegalType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LegalType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLegalTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLegalType"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalRpgindividual.g:1152:1: rule__Declaration__Alternatives : ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1156:1: ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 34:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            case 19:
                {
                alt1=7;
                }
                break;
            case 14:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRpgindividual.g:1157:2: ( ruleLocations )
                    {
                    // InternalRpgindividual.g:1157:2: ( ruleLocations )
                    // InternalRpgindividual.g:1158:3: ruleLocations
                    {
                     before(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1163:2: ( ruleRelations )
                    {
                    // InternalRpgindividual.g:1163:2: ( ruleRelations )
                    // InternalRpgindividual.g:1164:3: ruleRelations
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelations();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1169:2: ( ruleMoves )
                    {
                    // InternalRpgindividual.g:1169:2: ( ruleMoves )
                    // InternalRpgindividual.g:1170:3: ruleMoves
                    {
                     before(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoves();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1175:2: ( ruleEntities )
                    {
                    // InternalRpgindividual.g:1175:2: ( ruleEntities )
                    // InternalRpgindividual.g:1176:3: ruleEntities
                    {
                     before(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEntities();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1181:2: ( ruleTeams )
                    {
                    // InternalRpgindividual.g:1181:2: ( ruleTeams )
                    // InternalRpgindividual.g:1182:3: ruleTeams
                    {
                     before(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTeams();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1187:2: ( ruleDeath )
                    {
                    // InternalRpgindividual.g:1187:2: ( ruleDeath )
                    // InternalRpgindividual.g:1188:3: ruleDeath
                    {
                     before(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDeath();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRpgindividual.g:1193:2: ( ruleAttributes )
                    {
                    // InternalRpgindividual.g:1193:2: ( ruleAttributes )
                    // InternalRpgindividual.g:1194:3: ruleAttributes
                    {
                     before(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributes();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRpgindividual.g:1199:2: ( ruleEffects )
                    {
                    // InternalRpgindividual.g:1199:2: ( ruleEffects )
                    // InternalRpgindividual.g:1200:3: ruleEffects
                    {
                     before(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleEffects();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Effect__Alternatives_1"
    // InternalRpgindividual.g:1209:1: rule__Effect__Alternatives_1 : ( ( ruleBuff ) | ( ruleMoveE ) | ( ruleAfterE ) );
    public final void rule__Effect__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1213:1: ( ( ruleBuff ) | ( ruleMoveE ) | ( ruleAfterE ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRpgindividual.g:1214:2: ( ruleBuff )
                    {
                    // InternalRpgindividual.g:1214:2: ( ruleBuff )
                    // InternalRpgindividual.g:1215:3: ruleBuff
                    {
                     before(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuff();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getBuffParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1220:2: ( ruleMoveE )
                    {
                    // InternalRpgindividual.g:1220:2: ( ruleMoveE )
                    // InternalRpgindividual.g:1221:3: ruleMoveE
                    {
                     before(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveE();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1226:2: ( ruleAfterE )
                    {
                    // InternalRpgindividual.g:1226:2: ( ruleAfterE )
                    // InternalRpgindividual.g:1227:3: ruleAfterE
                    {
                     before(grammarAccess.getEffectAccess().getAfterEParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAfterE();

                    state._fsp--;

                     after(grammarAccess.getEffectAccess().getAfterEParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__Effect__Alternatives_1"


    // $ANTLR start "rule__Move__Alternatives_4"
    // InternalRpgindividual.g:1236:1: rule__Move__Alternatives_4 : ( ( ( rule__Move__MEffectAssignment_4_0 ) ) | ( ( rule__Move__BEffectAssignment_4_1 ) ) | ( ( rule__Move__AEffectAssignment_4_2 ) ) );
    public final void rule__Move__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1240:1: ( ( ( rule__Move__MEffectAssignment_4_0 ) ) | ( ( rule__Move__BEffectAssignment_4_1 ) ) | ( ( rule__Move__AEffectAssignment_4_2 ) ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                switch ( input.LA(2) ) {
                case 17:
                    {
                    alt3=1;
                    }
                    break;
                case 16:
                    {
                    alt3=2;
                    }
                    break;
                case 18:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRpgindividual.g:1241:2: ( ( rule__Move__MEffectAssignment_4_0 ) )
                    {
                    // InternalRpgindividual.g:1241:2: ( ( rule__Move__MEffectAssignment_4_0 ) )
                    // InternalRpgindividual.g:1242:3: ( rule__Move__MEffectAssignment_4_0 )
                    {
                     before(grammarAccess.getMoveAccess().getMEffectAssignment_4_0()); 
                    // InternalRpgindividual.g:1243:3: ( rule__Move__MEffectAssignment_4_0 )
                    // InternalRpgindividual.g:1243:4: rule__Move__MEffectAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__MEffectAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getMEffectAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1247:2: ( ( rule__Move__BEffectAssignment_4_1 ) )
                    {
                    // InternalRpgindividual.g:1247:2: ( ( rule__Move__BEffectAssignment_4_1 ) )
                    // InternalRpgindividual.g:1248:3: ( rule__Move__BEffectAssignment_4_1 )
                    {
                     before(grammarAccess.getMoveAccess().getBEffectAssignment_4_1()); 
                    // InternalRpgindividual.g:1249:3: ( rule__Move__BEffectAssignment_4_1 )
                    // InternalRpgindividual.g:1249:4: rule__Move__BEffectAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__BEffectAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getBEffectAssignment_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1253:2: ( ( rule__Move__AEffectAssignment_4_2 ) )
                    {
                    // InternalRpgindividual.g:1253:2: ( ( rule__Move__AEffectAssignment_4_2 ) )
                    // InternalRpgindividual.g:1254:3: ( rule__Move__AEffectAssignment_4_2 )
                    {
                     before(grammarAccess.getMoveAccess().getAEffectAssignment_4_2()); 
                    // InternalRpgindividual.g:1255:3: ( rule__Move__AEffectAssignment_4_2 )
                    // InternalRpgindividual.g:1255:4: rule__Move__AEffectAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__AEffectAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMoveAccess().getAEffectAssignment_4_2()); 

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
    // $ANTLR end "rule__Move__Alternatives_4"


    // $ANTLR start "rule__AttributeValues__Alternatives_1"
    // InternalRpgindividual.g:1263:1: rule__AttributeValues__Alternatives_1 : ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) );
    public final void rule__AttributeValues__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1267:1: ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRpgindividual.g:1268:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    {
                    // InternalRpgindividual.g:1268:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    // InternalRpgindividual.g:1269:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 
                    // InternalRpgindividual.g:1270:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    // InternalRpgindividual.g:1270:4: rule__AttributeValues__LTypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__LTypesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1274:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    {
                    // InternalRpgindividual.g:1274:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    // InternalRpgindividual.g:1275:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 
                    // InternalRpgindividual.g:1276:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    // InternalRpgindividual.g:1276:4: rule__AttributeValues__AnAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeValues__AnAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 

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
    // $ANTLR end "rule__AttributeValues__Alternatives_1"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalRpgindividual.g:1284:1: rule__Statement__Alternatives : ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1288:1: ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_INT)) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRpgindividual.g:1289:2: ( ruleNumberComparing )
                    {
                    // InternalRpgindividual.g:1289:2: ( ruleNumberComparing )
                    // InternalRpgindividual.g:1290:3: ruleNumberComparing
                    {
                     before(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberComparing();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1295:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1295:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalRpgindividual.g:1296:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1297:3: ( rule__Statement__Group_1__0 )
                    // InternalRpgindividual.g:1297:4: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Comparator__Alternatives"
    // InternalRpgindividual.g:1305:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1309:1: ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 43:
                {
                alt6=3;
                }
                break;
            case 44:
                {
                alt6=4;
                }
                break;
            case 45:
                {
                alt6=5;
                }
                break;
            case 46:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRpgindividual.g:1310:2: ( ( rule__Comparator__Group_0__0 ) )
                    {
                    // InternalRpgindividual.g:1310:2: ( ( rule__Comparator__Group_0__0 ) )
                    // InternalRpgindividual.g:1311:3: ( rule__Comparator__Group_0__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_0()); 
                    // InternalRpgindividual.g:1312:3: ( rule__Comparator__Group_0__0 )
                    // InternalRpgindividual.g:1312:4: rule__Comparator__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1316:2: ( ( rule__Comparator__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1316:2: ( ( rule__Comparator__Group_1__0 ) )
                    // InternalRpgindividual.g:1317:3: ( rule__Comparator__Group_1__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1318:3: ( rule__Comparator__Group_1__0 )
                    // InternalRpgindividual.g:1318:4: rule__Comparator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1322:2: ( ( rule__Comparator__Group_2__0 ) )
                    {
                    // InternalRpgindividual.g:1322:2: ( ( rule__Comparator__Group_2__0 ) )
                    // InternalRpgindividual.g:1323:3: ( rule__Comparator__Group_2__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_2()); 
                    // InternalRpgindividual.g:1324:3: ( rule__Comparator__Group_2__0 )
                    // InternalRpgindividual.g:1324:4: rule__Comparator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1328:2: ( ( rule__Comparator__Group_3__0 ) )
                    {
                    // InternalRpgindividual.g:1328:2: ( ( rule__Comparator__Group_3__0 ) )
                    // InternalRpgindividual.g:1329:3: ( rule__Comparator__Group_3__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_3()); 
                    // InternalRpgindividual.g:1330:3: ( rule__Comparator__Group_3__0 )
                    // InternalRpgindividual.g:1330:4: rule__Comparator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1334:2: ( ( rule__Comparator__Group_4__0 ) )
                    {
                    // InternalRpgindividual.g:1334:2: ( ( rule__Comparator__Group_4__0 ) )
                    // InternalRpgindividual.g:1335:3: ( rule__Comparator__Group_4__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_4()); 
                    // InternalRpgindividual.g:1336:3: ( rule__Comparator__Group_4__0 )
                    // InternalRpgindividual.g:1336:4: rule__Comparator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1340:2: ( ( rule__Comparator__Group_5__0 ) )
                    {
                    // InternalRpgindividual.g:1340:2: ( ( rule__Comparator__Group_5__0 ) )
                    // InternalRpgindividual.g:1341:3: ( rule__Comparator__Group_5__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_5()); 
                    // InternalRpgindividual.g:1342:3: ( rule__Comparator__Group_5__0 )
                    // InternalRpgindividual.g:1342:4: rule__Comparator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparator__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparatorAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Comparator__Alternatives"


    // $ANTLR start "rule__Sum__Alternatives_1_0"
    // InternalRpgindividual.g:1350:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1354:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            else if ( (LA7_0==48) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:1355:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1355:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1356:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1357:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1357:4: rule__Sum__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1361:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1361:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1362:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1363:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1363:4: rule__Sum__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Sum__Alternatives_1_0"


    // $ANTLR start "rule__Multiply__Alternatives_1_0"
    // InternalRpgindividual.g:1371:1: rule__Multiply__Alternatives_1_0 : ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) );
    public final void rule__Multiply__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1375:1: ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRpgindividual.g:1376:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1376:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1377:3: ( rule__Multiply__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1378:3: ( rule__Multiply__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1378:4: rule__Multiply__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1382:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1382:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1383:3: ( rule__Multiply__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1384:3: ( rule__Multiply__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1384:4: rule__Multiply__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiply__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Multiply__Alternatives_1_0"


    // $ANTLR start "rule__AtomicNumber__Alternatives"
    // InternalRpgindividual.g:1392:1: rule__AtomicNumber__Alternatives : ( ( ruleActualNumbers ) | ( ruleNameAttribute ) );
    public final void rule__AtomicNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1396:1: ( ( ruleActualNumbers ) | ( ruleNameAttribute ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRpgindividual.g:1397:2: ( ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1397:2: ( ruleActualNumbers )
                    // InternalRpgindividual.g:1398:3: ruleActualNumbers
                    {
                     before(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActualNumbers();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1403:2: ( ruleNameAttribute )
                    {
                    // InternalRpgindividual.g:1403:2: ( ruleNameAttribute )
                    // InternalRpgindividual.g:1404:3: ruleNameAttribute
                    {
                     before(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNameAttribute();

                    state._fsp--;

                     after(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AtomicNumber__Alternatives"


    // $ANTLR start "rule__ActualNumbers__Alternatives"
    // InternalRpgindividual.g:1413:1: rule__ActualNumbers__Alternatives : ( ( ruleFloatNum ) | ( ruleIntNum ) );
    public final void rule__ActualNumbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1417:1: ( ( ruleFloatNum ) | ( ruleIntNum ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==51) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1>=14 && LA10_1<=15)||LA10_1==17||(LA10_1>=19 && LA10_1<=21)||LA10_1==23||LA10_1==25||LA10_1==27||(LA10_1>=30 && LA10_1<=32)||LA10_1==34||(LA10_1>=38 && LA10_1<=39)||(LA10_1>=41 && LA10_1<=50)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRpgindividual.g:1418:2: ( ruleFloatNum )
                    {
                    // InternalRpgindividual.g:1418:2: ( ruleFloatNum )
                    // InternalRpgindividual.g:1419:3: ruleFloatNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1424:2: ( ruleIntNum )
                    {
                    // InternalRpgindividual.g:1424:2: ( ruleIntNum )
                    // InternalRpgindividual.g:1425:3: ruleIntNum
                    {
                     before(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntNum();

                    state._fsp--;

                     after(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActualNumbers__Alternatives"


    // $ANTLR start "rule__LegalType__Alternatives"
    // InternalRpgindividual.g:1434:1: rule__LegalType__Alternatives : ( ( 'Float' ) | ( 'Integer' ) );
    public final void rule__LegalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1438:1: ( ( 'Float' ) | ( 'Integer' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRpgindividual.g:1439:2: ( 'Float' )
                    {
                    // InternalRpgindividual.g:1439:2: ( 'Float' )
                    // InternalRpgindividual.g:1440:3: 'Float'
                    {
                     before(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1445:2: ( 'Integer' )
                    {
                    // InternalRpgindividual.g:1445:2: ( 'Integer' )
                    // InternalRpgindividual.g:1446:3: 'Integer'
                    {
                     before(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 

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
    // $ANTLR end "rule__LegalType__Alternatives"


    // $ANTLR start "rule__SystemRPG__Group__0"
    // InternalRpgindividual.g:1455:1: rule__SystemRPG__Group__0 : rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 ;
    public final void rule__SystemRPG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1459:1: ( rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 )
            // InternalRpgindividual.g:1460:2: rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemRPG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__1();

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
    // $ANTLR end "rule__SystemRPG__Group__0"


    // $ANTLR start "rule__SystemRPG__Group__0__Impl"
    // InternalRpgindividual.g:1467:1: rule__SystemRPG__Group__0__Impl : ( 'game' ) ;
    public final void rule__SystemRPG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1471:1: ( ( 'game' ) )
            // InternalRpgindividual.g:1472:1: ( 'game' )
            {
            // InternalRpgindividual.g:1472:1: ( 'game' )
            // InternalRpgindividual.g:1473:2: 'game'
            {
             before(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 

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
    // $ANTLR end "rule__SystemRPG__Group__0__Impl"


    // $ANTLR start "rule__SystemRPG__Group__1"
    // InternalRpgindividual.g:1482:1: rule__SystemRPG__Group__1 : rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 ;
    public final void rule__SystemRPG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1486:1: ( rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 )
            // InternalRpgindividual.g:1487:2: rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemRPG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2();

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
    // $ANTLR end "rule__SystemRPG__Group__1"


    // $ANTLR start "rule__SystemRPG__Group__1__Impl"
    // InternalRpgindividual.g:1494:1: rule__SystemRPG__Group__1__Impl : ( ( rule__SystemRPG__NameAssignment_1 ) ) ;
    public final void rule__SystemRPG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1498:1: ( ( ( rule__SystemRPG__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1499:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1499:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            // InternalRpgindividual.g:1500:2: ( rule__SystemRPG__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1501:2: ( rule__SystemRPG__NameAssignment_1 )
            // InternalRpgindividual.g:1501:3: rule__SystemRPG__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SystemRPG__Group__1__Impl"


    // $ANTLR start "rule__SystemRPG__Group__2"
    // InternalRpgindividual.g:1509:1: rule__SystemRPG__Group__2 : rule__SystemRPG__Group__2__Impl ;
    public final void rule__SystemRPG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1513:1: ( rule__SystemRPG__Group__2__Impl )
            // InternalRpgindividual.g:1514:2: rule__SystemRPG__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemRPG__Group__2__Impl();

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
    // $ANTLR end "rule__SystemRPG__Group__2"


    // $ANTLR start "rule__SystemRPG__Group__2__Impl"
    // InternalRpgindividual.g:1520:1: rule__SystemRPG__Group__2__Impl : ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) ;
    public final void rule__SystemRPG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1524:1: ( ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) )
            // InternalRpgindividual.g:1525:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            {
            // InternalRpgindividual.g:1525:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            // InternalRpgindividual.g:1526:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 
            // InternalRpgindividual.g:1527:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14||LA12_0==19||LA12_0==21||LA12_0==23||LA12_0==27||(LA12_0>=31 && LA12_0<=32)||LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpgindividual.g:1527:3: rule__SystemRPG__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRPG__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 

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
    // $ANTLR end "rule__SystemRPG__Group__2__Impl"


    // $ANTLR start "rule__Effects__Group__0"
    // InternalRpgindividual.g:1536:1: rule__Effects__Group__0 : rule__Effects__Group__0__Impl rule__Effects__Group__1 ;
    public final void rule__Effects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1540:1: ( rule__Effects__Group__0__Impl rule__Effects__Group__1 )
            // InternalRpgindividual.g:1541:2: rule__Effects__Group__0__Impl rule__Effects__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Effects__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effects__Group__1();

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
    // $ANTLR end "rule__Effects__Group__0"


    // $ANTLR start "rule__Effects__Group__0__Impl"
    // InternalRpgindividual.g:1548:1: rule__Effects__Group__0__Impl : ( 'effects' ) ;
    public final void rule__Effects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1552:1: ( ( 'effects' ) )
            // InternalRpgindividual.g:1553:1: ( 'effects' )
            {
            // InternalRpgindividual.g:1553:1: ( 'effects' )
            // InternalRpgindividual.g:1554:2: 'effects'
            {
             before(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 

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
    // $ANTLR end "rule__Effects__Group__0__Impl"


    // $ANTLR start "rule__Effects__Group__1"
    // InternalRpgindividual.g:1563:1: rule__Effects__Group__1 : rule__Effects__Group__1__Impl ;
    public final void rule__Effects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1567:1: ( rule__Effects__Group__1__Impl )
            // InternalRpgindividual.g:1568:2: rule__Effects__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effects__Group__1__Impl();

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
    // $ANTLR end "rule__Effects__Group__1"


    // $ANTLR start "rule__Effects__Group__1__Impl"
    // InternalRpgindividual.g:1574:1: rule__Effects__Group__1__Impl : ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) ;
    public final void rule__Effects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1578:1: ( ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1579:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1579:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            // InternalRpgindividual.g:1580:2: ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* )
            {
            // InternalRpgindividual.g:1580:2: ( ( rule__Effects__EffectAssignment_1 ) )
            // InternalRpgindividual.g:1581:3: ( rule__Effects__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1582:3: ( rule__Effects__EffectAssignment_1 )
            // InternalRpgindividual.g:1582:4: rule__Effects__EffectAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__Effects__EffectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

            }

            // InternalRpgindividual.g:1585:2: ( ( rule__Effects__EffectAssignment_1 )* )
            // InternalRpgindividual.g:1586:3: ( rule__Effects__EffectAssignment_1 )*
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1587:3: ( rule__Effects__EffectAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRpgindividual.g:1587:4: rule__Effects__EffectAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Effects__EffectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

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
    // $ANTLR end "rule__Effects__Group__1__Impl"


    // $ANTLR start "rule__Effect__Group__0"
    // InternalRpgindividual.g:1597:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1601:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // InternalRpgindividual.g:1602:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Effect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__1();

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
    // $ANTLR end "rule__Effect__Group__0"


    // $ANTLR start "rule__Effect__Group__0__Impl"
    // InternalRpgindividual.g:1609:1: rule__Effect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1613:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:1614:1: ( 'effect' )
            {
            // InternalRpgindividual.g:1614:1: ( 'effect' )
            // InternalRpgindividual.g:1615:2: 'effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getEffectKeyword_0()); 

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
    // $ANTLR end "rule__Effect__Group__0__Impl"


    // $ANTLR start "rule__Effect__Group__1"
    // InternalRpgindividual.g:1624:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1628:1: ( rule__Effect__Group__1__Impl )
            // InternalRpgindividual.g:1629:2: rule__Effect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__1__Impl();

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
    // $ANTLR end "rule__Effect__Group__1"


    // $ANTLR start "rule__Effect__Group__1__Impl"
    // InternalRpgindividual.g:1635:1: rule__Effect__Group__1__Impl : ( ( rule__Effect__Alternatives_1 ) ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1639:1: ( ( ( rule__Effect__Alternatives_1 ) ) )
            // InternalRpgindividual.g:1640:1: ( ( rule__Effect__Alternatives_1 ) )
            {
            // InternalRpgindividual.g:1640:1: ( ( rule__Effect__Alternatives_1 ) )
            // InternalRpgindividual.g:1641:2: ( rule__Effect__Alternatives_1 )
            {
             before(grammarAccess.getEffectAccess().getAlternatives_1()); 
            // InternalRpgindividual.g:1642:2: ( rule__Effect__Alternatives_1 )
            // InternalRpgindividual.g:1642:3: rule__Effect__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Effect__Group__1__Impl"


    // $ANTLR start "rule__Buff__Group__0"
    // InternalRpgindividual.g:1651:1: rule__Buff__Group__0 : rule__Buff__Group__0__Impl rule__Buff__Group__1 ;
    public final void rule__Buff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1655:1: ( rule__Buff__Group__0__Impl rule__Buff__Group__1 )
            // InternalRpgindividual.g:1656:2: rule__Buff__Group__0__Impl rule__Buff__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Buff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group__1();

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
    // $ANTLR end "rule__Buff__Group__0"


    // $ANTLR start "rule__Buff__Group__0__Impl"
    // InternalRpgindividual.g:1663:1: rule__Buff__Group__0__Impl : ( 'buff' ) ;
    public final void rule__Buff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1667:1: ( ( 'buff' ) )
            // InternalRpgindividual.g:1668:1: ( 'buff' )
            {
            // InternalRpgindividual.g:1668:1: ( 'buff' )
            // InternalRpgindividual.g:1669:2: 'buff'
            {
             before(grammarAccess.getBuffAccess().getBuffKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBuffAccess().getBuffKeyword_0()); 

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
    // $ANTLR end "rule__Buff__Group__0__Impl"


    // $ANTLR start "rule__Buff__Group__1"
    // InternalRpgindividual.g:1678:1: rule__Buff__Group__1 : rule__Buff__Group__1__Impl rule__Buff__Group__2 ;
    public final void rule__Buff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1682:1: ( rule__Buff__Group__1__Impl rule__Buff__Group__2 )
            // InternalRpgindividual.g:1683:2: rule__Buff__Group__1__Impl rule__Buff__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Buff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Buff__Group__2();

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
    // $ANTLR end "rule__Buff__Group__1"


    // $ANTLR start "rule__Buff__Group__1__Impl"
    // InternalRpgindividual.g:1690:1: rule__Buff__Group__1__Impl : ( ( rule__Buff__NameAssignment_1 ) ) ;
    public final void rule__Buff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1694:1: ( ( ( rule__Buff__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1695:1: ( ( rule__Buff__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1695:1: ( ( rule__Buff__NameAssignment_1 ) )
            // InternalRpgindividual.g:1696:2: ( rule__Buff__NameAssignment_1 )
            {
             before(grammarAccess.getBuffAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1697:2: ( rule__Buff__NameAssignment_1 )
            // InternalRpgindividual.g:1697:3: rule__Buff__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Buff__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Buff__Group__1__Impl"


    // $ANTLR start "rule__Buff__Group__2"
    // InternalRpgindividual.g:1705:1: rule__Buff__Group__2 : rule__Buff__Group__2__Impl ;
    public final void rule__Buff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1709:1: ( rule__Buff__Group__2__Impl )
            // InternalRpgindividual.g:1710:2: rule__Buff__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Buff__Group__2__Impl();

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
    // $ANTLR end "rule__Buff__Group__2"


    // $ANTLR start "rule__Buff__Group__2__Impl"
    // InternalRpgindividual.g:1716:1: rule__Buff__Group__2__Impl : ( ( rule__Buff__RuleAssignment_2 ) ) ;
    public final void rule__Buff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1720:1: ( ( ( rule__Buff__RuleAssignment_2 ) ) )
            // InternalRpgindividual.g:1721:1: ( ( rule__Buff__RuleAssignment_2 ) )
            {
            // InternalRpgindividual.g:1721:1: ( ( rule__Buff__RuleAssignment_2 ) )
            // InternalRpgindividual.g:1722:2: ( rule__Buff__RuleAssignment_2 )
            {
             before(grammarAccess.getBuffAccess().getRuleAssignment_2()); 
            // InternalRpgindividual.g:1723:2: ( rule__Buff__RuleAssignment_2 )
            // InternalRpgindividual.g:1723:3: rule__Buff__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Buff__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBuffAccess().getRuleAssignment_2()); 

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
    // $ANTLR end "rule__Buff__Group__2__Impl"


    // $ANTLR start "rule__MoveE__Group__0"
    // InternalRpgindividual.g:1732:1: rule__MoveE__Group__0 : rule__MoveE__Group__0__Impl rule__MoveE__Group__1 ;
    public final void rule__MoveE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1736:1: ( rule__MoveE__Group__0__Impl rule__MoveE__Group__1 )
            // InternalRpgindividual.g:1737:2: rule__MoveE__Group__0__Impl rule__MoveE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MoveE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group__1();

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
    // $ANTLR end "rule__MoveE__Group__0"


    // $ANTLR start "rule__MoveE__Group__0__Impl"
    // InternalRpgindividual.g:1744:1: rule__MoveE__Group__0__Impl : ( 'move' ) ;
    public final void rule__MoveE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1748:1: ( ( 'move' ) )
            // InternalRpgindividual.g:1749:1: ( 'move' )
            {
            // InternalRpgindividual.g:1749:1: ( 'move' )
            // InternalRpgindividual.g:1750:2: 'move'
            {
             before(grammarAccess.getMoveEAccess().getMoveKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveEAccess().getMoveKeyword_0()); 

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
    // $ANTLR end "rule__MoveE__Group__0__Impl"


    // $ANTLR start "rule__MoveE__Group__1"
    // InternalRpgindividual.g:1759:1: rule__MoveE__Group__1 : rule__MoveE__Group__1__Impl rule__MoveE__Group__2 ;
    public final void rule__MoveE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1763:1: ( rule__MoveE__Group__1__Impl rule__MoveE__Group__2 )
            // InternalRpgindividual.g:1764:2: rule__MoveE__Group__1__Impl rule__MoveE__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MoveE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveE__Group__2();

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
    // $ANTLR end "rule__MoveE__Group__1"


    // $ANTLR start "rule__MoveE__Group__1__Impl"
    // InternalRpgindividual.g:1771:1: rule__MoveE__Group__1__Impl : ( ( rule__MoveE__NameAssignment_1 ) ) ;
    public final void rule__MoveE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1775:1: ( ( ( rule__MoveE__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1776:1: ( ( rule__MoveE__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1776:1: ( ( rule__MoveE__NameAssignment_1 ) )
            // InternalRpgindividual.g:1777:2: ( rule__MoveE__NameAssignment_1 )
            {
             before(grammarAccess.getMoveEAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1778:2: ( rule__MoveE__NameAssignment_1 )
            // InternalRpgindividual.g:1778:3: rule__MoveE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MoveE__Group__1__Impl"


    // $ANTLR start "rule__MoveE__Group__2"
    // InternalRpgindividual.g:1786:1: rule__MoveE__Group__2 : rule__MoveE__Group__2__Impl ;
    public final void rule__MoveE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1790:1: ( rule__MoveE__Group__2__Impl )
            // InternalRpgindividual.g:1791:2: rule__MoveE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__Group__2__Impl();

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
    // $ANTLR end "rule__MoveE__Group__2"


    // $ANTLR start "rule__MoveE__Group__2__Impl"
    // InternalRpgindividual.g:1797:1: rule__MoveE__Group__2__Impl : ( ( rule__MoveE__RuleAssignment_2 ) ) ;
    public final void rule__MoveE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1801:1: ( ( ( rule__MoveE__RuleAssignment_2 ) ) )
            // InternalRpgindividual.g:1802:1: ( ( rule__MoveE__RuleAssignment_2 ) )
            {
            // InternalRpgindividual.g:1802:1: ( ( rule__MoveE__RuleAssignment_2 ) )
            // InternalRpgindividual.g:1803:2: ( rule__MoveE__RuleAssignment_2 )
            {
             before(grammarAccess.getMoveEAccess().getRuleAssignment_2()); 
            // InternalRpgindividual.g:1804:2: ( rule__MoveE__RuleAssignment_2 )
            // InternalRpgindividual.g:1804:3: rule__MoveE__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoveE__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveEAccess().getRuleAssignment_2()); 

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
    // $ANTLR end "rule__MoveE__Group__2__Impl"


    // $ANTLR start "rule__AfterE__Group__0"
    // InternalRpgindividual.g:1813:1: rule__AfterE__Group__0 : rule__AfterE__Group__0__Impl rule__AfterE__Group__1 ;
    public final void rule__AfterE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1817:1: ( rule__AfterE__Group__0__Impl rule__AfterE__Group__1 )
            // InternalRpgindividual.g:1818:2: rule__AfterE__Group__0__Impl rule__AfterE__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AfterE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterE__Group__1();

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
    // $ANTLR end "rule__AfterE__Group__0"


    // $ANTLR start "rule__AfterE__Group__0__Impl"
    // InternalRpgindividual.g:1825:1: rule__AfterE__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1829:1: ( ( 'after' ) )
            // InternalRpgindividual.g:1830:1: ( 'after' )
            {
            // InternalRpgindividual.g:1830:1: ( 'after' )
            // InternalRpgindividual.g:1831:2: 'after'
            {
             before(grammarAccess.getAfterEAccess().getAfterKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAfterEAccess().getAfterKeyword_0()); 

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
    // $ANTLR end "rule__AfterE__Group__0__Impl"


    // $ANTLR start "rule__AfterE__Group__1"
    // InternalRpgindividual.g:1840:1: rule__AfterE__Group__1 : rule__AfterE__Group__1__Impl rule__AfterE__Group__2 ;
    public final void rule__AfterE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1844:1: ( rule__AfterE__Group__1__Impl rule__AfterE__Group__2 )
            // InternalRpgindividual.g:1845:2: rule__AfterE__Group__1__Impl rule__AfterE__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__AfterE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterE__Group__2();

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
    // $ANTLR end "rule__AfterE__Group__1"


    // $ANTLR start "rule__AfterE__Group__1__Impl"
    // InternalRpgindividual.g:1852:1: rule__AfterE__Group__1__Impl : ( ( rule__AfterE__NameAssignment_1 ) ) ;
    public final void rule__AfterE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1856:1: ( ( ( rule__AfterE__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1857:1: ( ( rule__AfterE__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1857:1: ( ( rule__AfterE__NameAssignment_1 ) )
            // InternalRpgindividual.g:1858:2: ( rule__AfterE__NameAssignment_1 )
            {
             before(grammarAccess.getAfterEAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1859:2: ( rule__AfterE__NameAssignment_1 )
            // InternalRpgindividual.g:1859:3: rule__AfterE__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AfterE__Group__1__Impl"


    // $ANTLR start "rule__AfterE__Group__2"
    // InternalRpgindividual.g:1867:1: rule__AfterE__Group__2 : rule__AfterE__Group__2__Impl ;
    public final void rule__AfterE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1871:1: ( rule__AfterE__Group__2__Impl )
            // InternalRpgindividual.g:1872:2: rule__AfterE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__Group__2__Impl();

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
    // $ANTLR end "rule__AfterE__Group__2"


    // $ANTLR start "rule__AfterE__Group__2__Impl"
    // InternalRpgindividual.g:1878:1: rule__AfterE__Group__2__Impl : ( ( rule__AfterE__RuleAssignment_2 ) ) ;
    public final void rule__AfterE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1882:1: ( ( ( rule__AfterE__RuleAssignment_2 ) ) )
            // InternalRpgindividual.g:1883:1: ( ( rule__AfterE__RuleAssignment_2 ) )
            {
            // InternalRpgindividual.g:1883:1: ( ( rule__AfterE__RuleAssignment_2 ) )
            // InternalRpgindividual.g:1884:2: ( rule__AfterE__RuleAssignment_2 )
            {
             before(grammarAccess.getAfterEAccess().getRuleAssignment_2()); 
            // InternalRpgindividual.g:1885:2: ( rule__AfterE__RuleAssignment_2 )
            // InternalRpgindividual.g:1885:3: rule__AfterE__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AfterE__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAfterEAccess().getRuleAssignment_2()); 

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
    // $ANTLR end "rule__AfterE__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalRpgindividual.g:1894:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1898:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalRpgindividual.g:1899:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1();

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
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // InternalRpgindividual.g:1906:1: rule__Attributes__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1910:1: ( ( 'attributes' ) )
            // InternalRpgindividual.g:1911:1: ( 'attributes' )
            {
            // InternalRpgindividual.g:1911:1: ( 'attributes' )
            // InternalRpgindividual.g:1912:2: 'attributes'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 

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
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // InternalRpgindividual.g:1921:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1925:1: ( rule__Attributes__Group__1__Impl )
            // InternalRpgindividual.g:1926:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attributes__Group__1__Impl();

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
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // InternalRpgindividual.g:1932:1: rule__Attributes__Group__1__Impl : ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1936:1: ( ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1937:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1937:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // InternalRpgindividual.g:1938:2: ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // InternalRpgindividual.g:1938:2: ( ( rule__Attributes__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:1939:3: ( rule__Attributes__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1940:3: ( rule__Attributes__AttributeAssignment_1 )
            // InternalRpgindividual.g:1940:4: rule__Attributes__AttributeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__Attributes__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }

            // InternalRpgindividual.g:1943:2: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // InternalRpgindividual.g:1944:3: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1945:3: ( rule__Attributes__AttributeAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRpgindividual.g:1945:4: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalRpgindividual.g:1955:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1959:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRpgindividual.g:1960:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalRpgindividual.g:1967:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1971:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:1972:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:1972:1: ( 'attribute' )
            // InternalRpgindividual.g:1973:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalRpgindividual.g:1982:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1986:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRpgindividual.g:1987:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalRpgindividual.g:1994:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1998:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1999:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1999:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRpgindividual.g:2000:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:2001:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRpgindividual.g:2001:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalRpgindividual.g:2009:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2013:1: ( rule__Attribute__Group__2__Impl )
            // InternalRpgindividual.g:2014:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalRpgindividual.g:2020:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AValAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2024:1: ( ( ( rule__Attribute__AValAssignment_2 ) ) )
            // InternalRpgindividual.g:2025:1: ( ( rule__Attribute__AValAssignment_2 ) )
            {
            // InternalRpgindividual.g:2025:1: ( ( rule__Attribute__AValAssignment_2 ) )
            // InternalRpgindividual.g:2026:2: ( rule__Attribute__AValAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAValAssignment_2()); 
            // InternalRpgindividual.g:2027:2: ( rule__Attribute__AValAssignment_2 )
            // InternalRpgindividual.g:2027:3: rule__Attribute__AValAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AValAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAValAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Locations__Group__0"
    // InternalRpgindividual.g:2036:1: rule__Locations__Group__0 : rule__Locations__Group__0__Impl rule__Locations__Group__1 ;
    public final void rule__Locations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2040:1: ( rule__Locations__Group__0__Impl rule__Locations__Group__1 )
            // InternalRpgindividual.g:2041:2: rule__Locations__Group__0__Impl rule__Locations__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Locations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Locations__Group__1();

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
    // $ANTLR end "rule__Locations__Group__0"


    // $ANTLR start "rule__Locations__Group__0__Impl"
    // InternalRpgindividual.g:2048:1: rule__Locations__Group__0__Impl : ( 'location' ) ;
    public final void rule__Locations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2052:1: ( ( 'location' ) )
            // InternalRpgindividual.g:2053:1: ( 'location' )
            {
            // InternalRpgindividual.g:2053:1: ( 'location' )
            // InternalRpgindividual.g:2054:2: 'location'
            {
             before(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 

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
    // $ANTLR end "rule__Locations__Group__0__Impl"


    // $ANTLR start "rule__Locations__Group__1"
    // InternalRpgindividual.g:2063:1: rule__Locations__Group__1 : rule__Locations__Group__1__Impl ;
    public final void rule__Locations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2067:1: ( rule__Locations__Group__1__Impl )
            // InternalRpgindividual.g:2068:2: rule__Locations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Locations__Group__1__Impl();

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
    // $ANTLR end "rule__Locations__Group__1"


    // $ANTLR start "rule__Locations__Group__1__Impl"
    // InternalRpgindividual.g:2074:1: rule__Locations__Group__1__Impl : ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) ;
    public final void rule__Locations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2078:1: ( ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2079:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2079:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            // InternalRpgindividual.g:2080:2: ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* )
            {
            // InternalRpgindividual.g:2080:2: ( ( rule__Locations__LocAssignment_1 ) )
            // InternalRpgindividual.g:2081:3: ( rule__Locations__LocAssignment_1 )
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:2082:3: ( rule__Locations__LocAssignment_1 )
            // InternalRpgindividual.g:2082:4: rule__Locations__LocAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__Locations__LocAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

            }

            // InternalRpgindividual.g:2085:2: ( ( rule__Locations__LocAssignment_1 )* )
            // InternalRpgindividual.g:2086:3: ( rule__Locations__LocAssignment_1 )*
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:2087:3: ( rule__Locations__LocAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRpgindividual.g:2087:4: rule__Locations__LocAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Locations__LocAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

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
    // $ANTLR end "rule__Locations__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__0"
    // InternalRpgindividual.g:2097:1: rule__Loc__Group__0 : rule__Loc__Group__0__Impl rule__Loc__Group__1 ;
    public final void rule__Loc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2101:1: ( rule__Loc__Group__0__Impl rule__Loc__Group__1 )
            // InternalRpgindividual.g:2102:2: rule__Loc__Group__0__Impl rule__Loc__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Loc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__1();

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
    // $ANTLR end "rule__Loc__Group__0"


    // $ANTLR start "rule__Loc__Group__0__Impl"
    // InternalRpgindividual.g:2109:1: rule__Loc__Group__0__Impl : ( ( rule__Loc__NameAssignment_0 ) ) ;
    public final void rule__Loc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2113:1: ( ( ( rule__Loc__NameAssignment_0 ) ) )
            // InternalRpgindividual.g:2114:1: ( ( rule__Loc__NameAssignment_0 ) )
            {
            // InternalRpgindividual.g:2114:1: ( ( rule__Loc__NameAssignment_0 ) )
            // InternalRpgindividual.g:2115:2: ( rule__Loc__NameAssignment_0 )
            {
             before(grammarAccess.getLocAccess().getNameAssignment_0()); 
            // InternalRpgindividual.g:2116:2: ( rule__Loc__NameAssignment_0 )
            // InternalRpgindividual.g:2116:3: rule__Loc__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Loc__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Loc__Group__0__Impl"


    // $ANTLR start "rule__Loc__Group__1"
    // InternalRpgindividual.g:2124:1: rule__Loc__Group__1 : rule__Loc__Group__1__Impl rule__Loc__Group__2 ;
    public final void rule__Loc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2128:1: ( rule__Loc__Group__1__Impl rule__Loc__Group__2 )
            // InternalRpgindividual.g:2129:2: rule__Loc__Group__1__Impl rule__Loc__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Loc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loc__Group__2();

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
    // $ANTLR end "rule__Loc__Group__1"


    // $ANTLR start "rule__Loc__Group__1__Impl"
    // InternalRpgindividual.g:2136:1: rule__Loc__Group__1__Impl : ( 'opponents' ) ;
    public final void rule__Loc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2140:1: ( ( 'opponents' ) )
            // InternalRpgindividual.g:2141:1: ( 'opponents' )
            {
            // InternalRpgindividual.g:2141:1: ( 'opponents' )
            // InternalRpgindividual.g:2142:2: 'opponents'
            {
             before(grammarAccess.getLocAccess().getOpponentsKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getOpponentsKeyword_1()); 

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
    // $ANTLR end "rule__Loc__Group__1__Impl"


    // $ANTLR start "rule__Loc__Group__2"
    // InternalRpgindividual.g:2151:1: rule__Loc__Group__2 : rule__Loc__Group__2__Impl ;
    public final void rule__Loc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2155:1: ( rule__Loc__Group__2__Impl )
            // InternalRpgindividual.g:2156:2: rule__Loc__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loc__Group__2__Impl();

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
    // $ANTLR end "rule__Loc__Group__2"


    // $ANTLR start "rule__Loc__Group__2__Impl"
    // InternalRpgindividual.g:2162:1: rule__Loc__Group__2__Impl : ( ( rule__Loc__TeamAssignment_2 ) ) ;
    public final void rule__Loc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2166:1: ( ( ( rule__Loc__TeamAssignment_2 ) ) )
            // InternalRpgindividual.g:2167:1: ( ( rule__Loc__TeamAssignment_2 ) )
            {
            // InternalRpgindividual.g:2167:1: ( ( rule__Loc__TeamAssignment_2 ) )
            // InternalRpgindividual.g:2168:2: ( rule__Loc__TeamAssignment_2 )
            {
             before(grammarAccess.getLocAccess().getTeamAssignment_2()); 
            // InternalRpgindividual.g:2169:2: ( rule__Loc__TeamAssignment_2 )
            // InternalRpgindividual.g:2169:3: rule__Loc__TeamAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Loc__TeamAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocAccess().getTeamAssignment_2()); 

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
    // $ANTLR end "rule__Loc__Group__2__Impl"


    // $ANTLR start "rule__Relations__Group__0"
    // InternalRpgindividual.g:2178:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2182:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalRpgindividual.g:2183:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Relations__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relations__Group__1();

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
    // $ANTLR end "rule__Relations__Group__0"


    // $ANTLR start "rule__Relations__Group__0__Impl"
    // InternalRpgindividual.g:2190:1: rule__Relations__Group__0__Impl : ( 'relations' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2194:1: ( ( 'relations' ) )
            // InternalRpgindividual.g:2195:1: ( 'relations' )
            {
            // InternalRpgindividual.g:2195:1: ( 'relations' )
            // InternalRpgindividual.g:2196:2: 'relations'
            {
             before(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 

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
    // $ANTLR end "rule__Relations__Group__0__Impl"


    // $ANTLR start "rule__Relations__Group__1"
    // InternalRpgindividual.g:2205:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2209:1: ( rule__Relations__Group__1__Impl )
            // InternalRpgindividual.g:2210:2: rule__Relations__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relations__Group__1__Impl();

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
    // $ANTLR end "rule__Relations__Group__1"


    // $ANTLR start "rule__Relations__Group__1__Impl"
    // InternalRpgindividual.g:2216:1: rule__Relations__Group__1__Impl : ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2220:1: ( ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2221:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2221:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            // InternalRpgindividual.g:2222:2: ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* )
            {
            // InternalRpgindividual.g:2222:2: ( ( rule__Relations__TypeAssignment_1 ) )
            // InternalRpgindividual.g:2223:3: ( rule__Relations__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:2224:3: ( rule__Relations__TypeAssignment_1 )
            // InternalRpgindividual.g:2224:4: rule__Relations__TypeAssignment_1
            {
            pushFollow(FOLLOW_16);
            rule__Relations__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 

            }

            // InternalRpgindividual.g:2227:2: ( ( rule__Relations__TypeAssignment_1 )* )
            // InternalRpgindividual.g:2228:3: ( rule__Relations__TypeAssignment_1 )*
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:2229:3: ( rule__Relations__TypeAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRpgindividual.g:2229:4: rule__Relations__TypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Relations__TypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Relations__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalRpgindividual.g:2239:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2243:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalRpgindividual.g:2244:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalRpgindividual.g:2251:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2255:1: ( ( 'type' ) )
            // InternalRpgindividual.g:2256:1: ( 'type' )
            {
            // InternalRpgindividual.g:2256:1: ( 'type' )
            // InternalRpgindividual.g:2257:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalRpgindividual.g:2266:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2270:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalRpgindividual.g:2271:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalRpgindividual.g:2278:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2282:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:2283:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2283:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalRpgindividual.g:2284:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:2285:2: ( rule__Type__NameAssignment_1 )
            // InternalRpgindividual.g:2285:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalRpgindividual.g:2293:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2297:1: ( rule__Type__Group__2__Impl )
            // InternalRpgindividual.g:2298:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalRpgindividual.g:2304:1: rule__Type__Group__2__Impl : ( ( rule__Type__TExpressionAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2308:1: ( ( ( rule__Type__TExpressionAssignment_2 )? ) )
            // InternalRpgindividual.g:2309:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            {
            // InternalRpgindividual.g:2309:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            // InternalRpgindividual.g:2310:2: ( rule__Type__TExpressionAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 
            // InternalRpgindividual.g:2311:2: ( rule__Type__TExpressionAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRpgindividual.g:2311:3: rule__Type__TExpressionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TExpressionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__0"
    // InternalRpgindividual.g:2320:1: rule__TypeExpression__Group__0 : rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 ;
    public final void rule__TypeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2324:1: ( rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 )
            // InternalRpgindividual.g:2325:2: rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TypeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__1();

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
    // $ANTLR end "rule__TypeExpression__Group__0"


    // $ANTLR start "rule__TypeExpression__Group__0__Impl"
    // InternalRpgindividual.g:2332:1: rule__TypeExpression__Group__0__Impl : ( ( rule__TypeExpression__StrongAssignment_0 ) ) ;
    public final void rule__TypeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2336:1: ( ( ( rule__TypeExpression__StrongAssignment_0 ) ) )
            // InternalRpgindividual.g:2337:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            {
            // InternalRpgindividual.g:2337:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            // InternalRpgindividual.g:2338:2: ( rule__TypeExpression__StrongAssignment_0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongAssignment_0()); 
            // InternalRpgindividual.g:2339:2: ( rule__TypeExpression__StrongAssignment_0 )
            // InternalRpgindividual.g:2339:3: rule__TypeExpression__StrongAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__StrongAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrongAssignment_0()); 

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
    // $ANTLR end "rule__TypeExpression__Group__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group__1"
    // InternalRpgindividual.g:2347:1: rule__TypeExpression__Group__1 : rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 ;
    public final void rule__TypeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2351:1: ( rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 )
            // InternalRpgindividual.g:2352:2: rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__TypeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__2();

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
    // $ANTLR end "rule__TypeExpression__Group__1"


    // $ANTLR start "rule__TypeExpression__Group__1__Impl"
    // InternalRpgindividual.g:2359:1: rule__TypeExpression__Group__1__Impl : ( ( rule__TypeExpression__Group_1__0 )* ) ;
    public final void rule__TypeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2363:1: ( ( ( rule__TypeExpression__Group_1__0 )* ) )
            // InternalRpgindividual.g:2364:1: ( ( rule__TypeExpression__Group_1__0 )* )
            {
            // InternalRpgindividual.g:2364:1: ( ( rule__TypeExpression__Group_1__0 )* )
            // InternalRpgindividual.g:2365:2: ( rule__TypeExpression__Group_1__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_1()); 
            // InternalRpgindividual.g:2366:2: ( rule__TypeExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgindividual.g:2366:3: rule__TypeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeExpression__Group__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group__2"
    // InternalRpgindividual.g:2374:1: rule__TypeExpression__Group__2 : rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 ;
    public final void rule__TypeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2378:1: ( rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 )
            // InternalRpgindividual.g:2379:2: rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__3();

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
    // $ANTLR end "rule__TypeExpression__Group__2"


    // $ANTLR start "rule__TypeExpression__Group__2__Impl"
    // InternalRpgindividual.g:2386:1: rule__TypeExpression__Group__2__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2390:1: ( ( '<' ) )
            // InternalRpgindividual.g:2391:1: ( '<' )
            {
            // InternalRpgindividual.g:2391:1: ( '<' )
            // InternalRpgindividual.g:2392:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2()); 

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
    // $ANTLR end "rule__TypeExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeExpression__Group__3"
    // InternalRpgindividual.g:2401:1: rule__TypeExpression__Group__3 : rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 ;
    public final void rule__TypeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2405:1: ( rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 )
            // InternalRpgindividual.g:2406:2: rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__TypeExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__4();

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
    // $ANTLR end "rule__TypeExpression__Group__3"


    // $ANTLR start "rule__TypeExpression__Group__3__Impl"
    // InternalRpgindividual.g:2413:1: rule__TypeExpression__Group__3__Impl : ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) ;
    public final void rule__TypeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2417:1: ( ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) )
            // InternalRpgindividual.g:2418:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            {
            // InternalRpgindividual.g:2418:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            // InternalRpgindividual.g:2419:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTAssignment_3()); 
            // InternalRpgindividual.g:2420:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            // InternalRpgindividual.g:2420:3: rule__TypeExpression__CurrentTAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__CurrentTAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getCurrentTAssignment_3()); 

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
    // $ANTLR end "rule__TypeExpression__Group__3__Impl"


    // $ANTLR start "rule__TypeExpression__Group__4"
    // InternalRpgindividual.g:2428:1: rule__TypeExpression__Group__4 : rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 ;
    public final void rule__TypeExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2432:1: ( rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 )
            // InternalRpgindividual.g:2433:2: rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__5();

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
    // $ANTLR end "rule__TypeExpression__Group__4"


    // $ANTLR start "rule__TypeExpression__Group__4__Impl"
    // InternalRpgindividual.g:2440:1: rule__TypeExpression__Group__4__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2444:1: ( ( '<' ) )
            // InternalRpgindividual.g:2445:1: ( '<' )
            {
            // InternalRpgindividual.g:2445:1: ( '<' )
            // InternalRpgindividual.g:2446:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4()); 

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
    // $ANTLR end "rule__TypeExpression__Group__4__Impl"


    // $ANTLR start "rule__TypeExpression__Group__5"
    // InternalRpgindividual.g:2455:1: rule__TypeExpression__Group__5 : rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 ;
    public final void rule__TypeExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2459:1: ( rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 )
            // InternalRpgindividual.g:2460:2: rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__TypeExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__6();

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
    // $ANTLR end "rule__TypeExpression__Group__5"


    // $ANTLR start "rule__TypeExpression__Group__5__Impl"
    // InternalRpgindividual.g:2467:1: rule__TypeExpression__Group__5__Impl : ( ( rule__TypeExpression__WeakAssignment_5 ) ) ;
    public final void rule__TypeExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2471:1: ( ( ( rule__TypeExpression__WeakAssignment_5 ) ) )
            // InternalRpgindividual.g:2472:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            {
            // InternalRpgindividual.g:2472:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            // InternalRpgindividual.g:2473:2: ( rule__TypeExpression__WeakAssignment_5 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakAssignment_5()); 
            // InternalRpgindividual.g:2474:2: ( rule__TypeExpression__WeakAssignment_5 )
            // InternalRpgindividual.g:2474:3: rule__TypeExpression__WeakAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__WeakAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeakAssignment_5()); 

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
    // $ANTLR end "rule__TypeExpression__Group__5__Impl"


    // $ANTLR start "rule__TypeExpression__Group__6"
    // InternalRpgindividual.g:2482:1: rule__TypeExpression__Group__6 : rule__TypeExpression__Group__6__Impl ;
    public final void rule__TypeExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2486:1: ( rule__TypeExpression__Group__6__Impl )
            // InternalRpgindividual.g:2487:2: rule__TypeExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group__6__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group__6"


    // $ANTLR start "rule__TypeExpression__Group__6__Impl"
    // InternalRpgindividual.g:2493:1: rule__TypeExpression__Group__6__Impl : ( ( rule__TypeExpression__Group_6__0 )* ) ;
    public final void rule__TypeExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2497:1: ( ( ( rule__TypeExpression__Group_6__0 )* ) )
            // InternalRpgindividual.g:2498:1: ( ( rule__TypeExpression__Group_6__0 )* )
            {
            // InternalRpgindividual.g:2498:1: ( ( rule__TypeExpression__Group_6__0 )* )
            // InternalRpgindividual.g:2499:2: ( rule__TypeExpression__Group_6__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_6()); 
            // InternalRpgindividual.g:2500:2: ( rule__TypeExpression__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:2500:3: rule__TypeExpression__Group_6__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__TypeExpression__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTypeExpressionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__TypeExpression__Group__6__Impl"


    // $ANTLR start "rule__TypeExpression__Group_1__0"
    // InternalRpgindividual.g:2509:1: rule__TypeExpression__Group_1__0 : rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 ;
    public final void rule__TypeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2513:1: ( rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 )
            // InternalRpgindividual.g:2514:2: rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_1__1();

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
    // $ANTLR end "rule__TypeExpression__Group_1__0"


    // $ANTLR start "rule__TypeExpression__Group_1__0__Impl"
    // InternalRpgindividual.g:2521:1: rule__TypeExpression__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2525:1: ( ( ',' ) )
            // InternalRpgindividual.g:2526:1: ( ',' )
            {
            // InternalRpgindividual.g:2526:1: ( ',' )
            // InternalRpgindividual.g:2527:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__TypeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_1__1"
    // InternalRpgindividual.g:2536:1: rule__TypeExpression__Group_1__1 : rule__TypeExpression__Group_1__1__Impl ;
    public final void rule__TypeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2540:1: ( rule__TypeExpression__Group_1__1__Impl )
            // InternalRpgindividual.g:2541:2: rule__TypeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group_1__1"


    // $ANTLR start "rule__TypeExpression__Group_1__1__Impl"
    // InternalRpgindividual.g:2547:1: rule__TypeExpression__Group_1__1__Impl : ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) ;
    public final void rule__TypeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2551:1: ( ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) )
            // InternalRpgindividual.g:2552:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            {
            // InternalRpgindividual.g:2552:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            // InternalRpgindividual.g:2553:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_1_1()); 
            // InternalRpgindividual.g:2554:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            // InternalRpgindividual.g:2554:3: rule__TypeExpression__Strong2Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Strong2Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_1_1()); 

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
    // $ANTLR end "rule__TypeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TypeExpression__Group_6__0"
    // InternalRpgindividual.g:2563:1: rule__TypeExpression__Group_6__0 : rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 ;
    public final void rule__TypeExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2567:1: ( rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 )
            // InternalRpgindividual.g:2568:2: rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeExpression__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_6__1();

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
    // $ANTLR end "rule__TypeExpression__Group_6__0"


    // $ANTLR start "rule__TypeExpression__Group_6__0__Impl"
    // InternalRpgindividual.g:2575:1: rule__TypeExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2579:1: ( ( ',' ) )
            // InternalRpgindividual.g:2580:1: ( ',' )
            {
            // InternalRpgindividual.g:2580:1: ( ',' )
            // InternalRpgindividual.g:2581:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__TypeExpression__Group_6__0__Impl"


    // $ANTLR start "rule__TypeExpression__Group_6__1"
    // InternalRpgindividual.g:2590:1: rule__TypeExpression__Group_6__1 : rule__TypeExpression__Group_6__1__Impl ;
    public final void rule__TypeExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2594:1: ( rule__TypeExpression__Group_6__1__Impl )
            // InternalRpgindividual.g:2595:2: rule__TypeExpression__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Group_6__1__Impl();

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
    // $ANTLR end "rule__TypeExpression__Group_6__1"


    // $ANTLR start "rule__TypeExpression__Group_6__1__Impl"
    // InternalRpgindividual.g:2601:1: rule__TypeExpression__Group_6__1__Impl : ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) ;
    public final void rule__TypeExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2605:1: ( ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) )
            // InternalRpgindividual.g:2606:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            {
            // InternalRpgindividual.g:2606:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            // InternalRpgindividual.g:2607:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_6_1()); 
            // InternalRpgindividual.g:2608:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            // InternalRpgindividual.g:2608:3: rule__TypeExpression__Weak2Assignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeExpression__Weak2Assignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_6_1()); 

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
    // $ANTLR end "rule__TypeExpression__Group_6__1__Impl"


    // $ANTLR start "rule__Moves__Group__0"
    // InternalRpgindividual.g:2617:1: rule__Moves__Group__0 : rule__Moves__Group__0__Impl rule__Moves__Group__1 ;
    public final void rule__Moves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2621:1: ( rule__Moves__Group__0__Impl rule__Moves__Group__1 )
            // InternalRpgindividual.g:2622:2: rule__Moves__Group__0__Impl rule__Moves__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Moves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Moves__Group__1();

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
    // $ANTLR end "rule__Moves__Group__0"


    // $ANTLR start "rule__Moves__Group__0__Impl"
    // InternalRpgindividual.g:2629:1: rule__Moves__Group__0__Impl : ( 'moves' ) ;
    public final void rule__Moves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2633:1: ( ( 'moves' ) )
            // InternalRpgindividual.g:2634:1: ( 'moves' )
            {
            // InternalRpgindividual.g:2634:1: ( 'moves' )
            // InternalRpgindividual.g:2635:2: 'moves'
            {
             before(grammarAccess.getMovesAccess().getMovesKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMovesAccess().getMovesKeyword_0()); 

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
    // $ANTLR end "rule__Moves__Group__0__Impl"


    // $ANTLR start "rule__Moves__Group__1"
    // InternalRpgindividual.g:2644:1: rule__Moves__Group__1 : rule__Moves__Group__1__Impl ;
    public final void rule__Moves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2648:1: ( rule__Moves__Group__1__Impl )
            // InternalRpgindividual.g:2649:2: rule__Moves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Moves__Group__1__Impl();

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
    // $ANTLR end "rule__Moves__Group__1"


    // $ANTLR start "rule__Moves__Group__1__Impl"
    // InternalRpgindividual.g:2655:1: rule__Moves__Group__1__Impl : ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) ;
    public final void rule__Moves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2659:1: ( ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2660:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2660:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:2661:2: ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:2661:2: ( ( rule__Moves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:2662:3: ( rule__Moves__MoveAssignment_1 )
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2663:3: ( rule__Moves__MoveAssignment_1 )
            // InternalRpgindividual.g:2663:4: rule__Moves__MoveAssignment_1
            {
            pushFollow(FOLLOW_22);
            rule__Moves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:2666:2: ( ( rule__Moves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:2667:3: ( rule__Moves__MoveAssignment_1 )*
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2668:3: ( rule__Moves__MoveAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:2668:4: rule__Moves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Moves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

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
    // $ANTLR end "rule__Moves__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalRpgindividual.g:2678:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2682:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRpgindividual.g:2683:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalRpgindividual.g:2690:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2694:1: ( ( 'move' ) )
            // InternalRpgindividual.g:2695:1: ( 'move' )
            {
            // InternalRpgindividual.g:2695:1: ( 'move' )
            // InternalRpgindividual.g:2696:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

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
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalRpgindividual.g:2705:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2709:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRpgindividual.g:2710:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalRpgindividual.g:2717:1: rule__Move__Group__1__Impl : ( ( rule__Move__NameAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2721:1: ( ( ( rule__Move__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:2722:1: ( ( rule__Move__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2722:1: ( ( rule__Move__NameAssignment_1 ) )
            // InternalRpgindividual.g:2723:2: ( rule__Move__NameAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:2724:2: ( rule__Move__NameAssignment_1 )
            // InternalRpgindividual.g:2724:3: rule__Move__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalRpgindividual.g:2732:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2736:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRpgindividual.g:2737:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

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
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalRpgindividual.g:2744:1: rule__Move__Group__2__Impl : ( ( rule__Move__ETypeAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2748:1: ( ( ( rule__Move__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:2749:1: ( ( rule__Move__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:2749:1: ( ( rule__Move__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:2750:2: ( rule__Move__ETypeAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:2751:2: ( rule__Move__ETypeAssignment_2 )
            // InternalRpgindividual.g:2751:3: rule__Move__ETypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__ETypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getETypeAssignment_2()); 

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
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalRpgindividual.g:2759:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2763:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalRpgindividual.g:2764:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

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
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalRpgindividual.g:2771:1: rule__Move__Group__3__Impl : ( ( rule__Move__AttAssignment_3 )* ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2775:1: ( ( ( rule__Move__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:2776:1: ( ( rule__Move__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:2776:1: ( ( rule__Move__AttAssignment_3 )* )
            // InternalRpgindividual.g:2777:2: ( rule__Move__AttAssignment_3 )*
            {
             before(grammarAccess.getMoveAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:2778:2: ( rule__Move__AttAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:2778:3: rule__Move__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Move__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAttAssignment_3()); 

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
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalRpgindividual.g:2786:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2790:1: ( rule__Move__Group__4__Impl )
            // InternalRpgindividual.g:2791:2: rule__Move__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__4__Impl();

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
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalRpgindividual.g:2797:1: rule__Move__Group__4__Impl : ( ( rule__Move__Alternatives_4 )* ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2801:1: ( ( ( rule__Move__Alternatives_4 )* ) )
            // InternalRpgindividual.g:2802:1: ( ( rule__Move__Alternatives_4 )* )
            {
            // InternalRpgindividual.g:2802:1: ( ( rule__Move__Alternatives_4 )* )
            // InternalRpgindividual.g:2803:2: ( rule__Move__Alternatives_4 )*
            {
             before(grammarAccess.getMoveAccess().getAlternatives_4()); 
            // InternalRpgindividual.g:2804:2: ( rule__Move__Alternatives_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==15) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgindividual.g:2804:3: rule__Move__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Move__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__MEffect__Group__0"
    // InternalRpgindividual.g:2813:1: rule__MEffect__Group__0 : rule__MEffect__Group__0__Impl rule__MEffect__Group__1 ;
    public final void rule__MEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2817:1: ( rule__MEffect__Group__0__Impl rule__MEffect__Group__1 )
            // InternalRpgindividual.g:2818:2: rule__MEffect__Group__0__Impl rule__MEffect__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MEffect__Group__1();

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
    // $ANTLR end "rule__MEffect__Group__0"


    // $ANTLR start "rule__MEffect__Group__0__Impl"
    // InternalRpgindividual.g:2825:1: rule__MEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__MEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2829:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:2830:1: ( 'effect' )
            {
            // InternalRpgindividual.g:2830:1: ( 'effect' )
            // InternalRpgindividual.g:2831:2: 'effect'
            {
             before(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 

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
    // $ANTLR end "rule__MEffect__Group__0__Impl"


    // $ANTLR start "rule__MEffect__Group__1"
    // InternalRpgindividual.g:2840:1: rule__MEffect__Group__1 : rule__MEffect__Group__1__Impl rule__MEffect__Group__2 ;
    public final void rule__MEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2844:1: ( rule__MEffect__Group__1__Impl rule__MEffect__Group__2 )
            // InternalRpgindividual.g:2845:2: rule__MEffect__Group__1__Impl rule__MEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MEffect__Group__2();

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
    // $ANTLR end "rule__MEffect__Group__1"


    // $ANTLR start "rule__MEffect__Group__1__Impl"
    // InternalRpgindividual.g:2852:1: rule__MEffect__Group__1__Impl : ( 'move' ) ;
    public final void rule__MEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2856:1: ( ( 'move' ) )
            // InternalRpgindividual.g:2857:1: ( 'move' )
            {
            // InternalRpgindividual.g:2857:1: ( 'move' )
            // InternalRpgindividual.g:2858:2: 'move'
            {
             before(grammarAccess.getMEffectAccess().getMoveKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveKeyword_1()); 

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
    // $ANTLR end "rule__MEffect__Group__1__Impl"


    // $ANTLR start "rule__MEffect__Group__2"
    // InternalRpgindividual.g:2867:1: rule__MEffect__Group__2 : rule__MEffect__Group__2__Impl ;
    public final void rule__MEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2871:1: ( rule__MEffect__Group__2__Impl )
            // InternalRpgindividual.g:2872:2: rule__MEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__2__Impl();

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
    // $ANTLR end "rule__MEffect__Group__2"


    // $ANTLR start "rule__MEffect__Group__2__Impl"
    // InternalRpgindividual.g:2878:1: rule__MEffect__Group__2__Impl : ( ( rule__MEffect__MoveENameAssignment_2 ) ) ;
    public final void rule__MEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2882:1: ( ( ( rule__MEffect__MoveENameAssignment_2 ) ) )
            // InternalRpgindividual.g:2883:1: ( ( rule__MEffect__MoveENameAssignment_2 ) )
            {
            // InternalRpgindividual.g:2883:1: ( ( rule__MEffect__MoveENameAssignment_2 ) )
            // InternalRpgindividual.g:2884:2: ( rule__MEffect__MoveENameAssignment_2 )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameAssignment_2()); 
            // InternalRpgindividual.g:2885:2: ( rule__MEffect__MoveENameAssignment_2 )
            // InternalRpgindividual.g:2885:3: rule__MEffect__MoveENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__MoveENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getMoveENameAssignment_2()); 

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
    // $ANTLR end "rule__MEffect__Group__2__Impl"


    // $ANTLR start "rule__BEffect__Group__0"
    // InternalRpgindividual.g:2894:1: rule__BEffect__Group__0 : rule__BEffect__Group__0__Impl rule__BEffect__Group__1 ;
    public final void rule__BEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2898:1: ( rule__BEffect__Group__0__Impl rule__BEffect__Group__1 )
            // InternalRpgindividual.g:2899:2: rule__BEffect__Group__0__Impl rule__BEffect__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__BEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BEffect__Group__1();

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
    // $ANTLR end "rule__BEffect__Group__0"


    // $ANTLR start "rule__BEffect__Group__0__Impl"
    // InternalRpgindividual.g:2906:1: rule__BEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__BEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2910:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:2911:1: ( 'effect' )
            {
            // InternalRpgindividual.g:2911:1: ( 'effect' )
            // InternalRpgindividual.g:2912:2: 'effect'
            {
             before(grammarAccess.getBEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getEffectKeyword_0()); 

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
    // $ANTLR end "rule__BEffect__Group__0__Impl"


    // $ANTLR start "rule__BEffect__Group__1"
    // InternalRpgindividual.g:2921:1: rule__BEffect__Group__1 : rule__BEffect__Group__1__Impl rule__BEffect__Group__2 ;
    public final void rule__BEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2925:1: ( rule__BEffect__Group__1__Impl rule__BEffect__Group__2 )
            // InternalRpgindividual.g:2926:2: rule__BEffect__Group__1__Impl rule__BEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BEffect__Group__2();

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
    // $ANTLR end "rule__BEffect__Group__1"


    // $ANTLR start "rule__BEffect__Group__1__Impl"
    // InternalRpgindividual.g:2933:1: rule__BEffect__Group__1__Impl : ( 'buff' ) ;
    public final void rule__BEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2937:1: ( ( 'buff' ) )
            // InternalRpgindividual.g:2938:1: ( 'buff' )
            {
            // InternalRpgindividual.g:2938:1: ( 'buff' )
            // InternalRpgindividual.g:2939:2: 'buff'
            {
             before(grammarAccess.getBEffectAccess().getBuffKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getBuffKeyword_1()); 

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
    // $ANTLR end "rule__BEffect__Group__1__Impl"


    // $ANTLR start "rule__BEffect__Group__2"
    // InternalRpgindividual.g:2948:1: rule__BEffect__Group__2 : rule__BEffect__Group__2__Impl ;
    public final void rule__BEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2952:1: ( rule__BEffect__Group__2__Impl )
            // InternalRpgindividual.g:2953:2: rule__BEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__Group__2__Impl();

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
    // $ANTLR end "rule__BEffect__Group__2"


    // $ANTLR start "rule__BEffect__Group__2__Impl"
    // InternalRpgindividual.g:2959:1: rule__BEffect__Group__2__Impl : ( ( rule__BEffect__BuffENameAssignment_2 ) ) ;
    public final void rule__BEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2963:1: ( ( ( rule__BEffect__BuffENameAssignment_2 ) ) )
            // InternalRpgindividual.g:2964:1: ( ( rule__BEffect__BuffENameAssignment_2 ) )
            {
            // InternalRpgindividual.g:2964:1: ( ( rule__BEffect__BuffENameAssignment_2 ) )
            // InternalRpgindividual.g:2965:2: ( rule__BEffect__BuffENameAssignment_2 )
            {
             before(grammarAccess.getBEffectAccess().getBuffENameAssignment_2()); 
            // InternalRpgindividual.g:2966:2: ( rule__BEffect__BuffENameAssignment_2 )
            // InternalRpgindividual.g:2966:3: rule__BEffect__BuffENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BEffect__BuffENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBEffectAccess().getBuffENameAssignment_2()); 

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
    // $ANTLR end "rule__BEffect__Group__2__Impl"


    // $ANTLR start "rule__AEffect__Group__0"
    // InternalRpgindividual.g:2975:1: rule__AEffect__Group__0 : rule__AEffect__Group__0__Impl rule__AEffect__Group__1 ;
    public final void rule__AEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2979:1: ( rule__AEffect__Group__0__Impl rule__AEffect__Group__1 )
            // InternalRpgindividual.g:2980:2: rule__AEffect__Group__0__Impl rule__AEffect__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__AEffect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AEffect__Group__1();

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
    // $ANTLR end "rule__AEffect__Group__0"


    // $ANTLR start "rule__AEffect__Group__0__Impl"
    // InternalRpgindividual.g:2987:1: rule__AEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__AEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2991:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:2992:1: ( 'effect' )
            {
            // InternalRpgindividual.g:2992:1: ( 'effect' )
            // InternalRpgindividual.g:2993:2: 'effect'
            {
             before(grammarAccess.getAEffectAccess().getEffectKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getEffectKeyword_0()); 

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
    // $ANTLR end "rule__AEffect__Group__0__Impl"


    // $ANTLR start "rule__AEffect__Group__1"
    // InternalRpgindividual.g:3002:1: rule__AEffect__Group__1 : rule__AEffect__Group__1__Impl rule__AEffect__Group__2 ;
    public final void rule__AEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3006:1: ( rule__AEffect__Group__1__Impl rule__AEffect__Group__2 )
            // InternalRpgindividual.g:3007:2: rule__AEffect__Group__1__Impl rule__AEffect__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AEffect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AEffect__Group__2();

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
    // $ANTLR end "rule__AEffect__Group__1"


    // $ANTLR start "rule__AEffect__Group__1__Impl"
    // InternalRpgindividual.g:3014:1: rule__AEffect__Group__1__Impl : ( 'after' ) ;
    public final void rule__AEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3018:1: ( ( 'after' ) )
            // InternalRpgindividual.g:3019:1: ( 'after' )
            {
            // InternalRpgindividual.g:3019:1: ( 'after' )
            // InternalRpgindividual.g:3020:2: 'after'
            {
             before(grammarAccess.getAEffectAccess().getAfterKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getAfterKeyword_1()); 

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
    // $ANTLR end "rule__AEffect__Group__1__Impl"


    // $ANTLR start "rule__AEffect__Group__2"
    // InternalRpgindividual.g:3029:1: rule__AEffect__Group__2 : rule__AEffect__Group__2__Impl ;
    public final void rule__AEffect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3033:1: ( rule__AEffect__Group__2__Impl )
            // InternalRpgindividual.g:3034:2: rule__AEffect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__Group__2__Impl();

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
    // $ANTLR end "rule__AEffect__Group__2"


    // $ANTLR start "rule__AEffect__Group__2__Impl"
    // InternalRpgindividual.g:3040:1: rule__AEffect__Group__2__Impl : ( ( rule__AEffect__AfterENameAssignment_2 ) ) ;
    public final void rule__AEffect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3044:1: ( ( ( rule__AEffect__AfterENameAssignment_2 ) ) )
            // InternalRpgindividual.g:3045:1: ( ( rule__AEffect__AfterENameAssignment_2 ) )
            {
            // InternalRpgindividual.g:3045:1: ( ( rule__AEffect__AfterENameAssignment_2 ) )
            // InternalRpgindividual.g:3046:2: ( rule__AEffect__AfterENameAssignment_2 )
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAssignment_2()); 
            // InternalRpgindividual.g:3047:2: ( rule__AEffect__AfterENameAssignment_2 )
            // InternalRpgindividual.g:3047:3: rule__AEffect__AfterENameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AEffect__AfterENameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAEffectAccess().getAfterENameAssignment_2()); 

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
    // $ANTLR end "rule__AEffect__Group__2__Impl"


    // $ANTLR start "rule__EType__Group__0"
    // InternalRpgindividual.g:3056:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3060:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // InternalRpgindividual.g:3061:2: rule__EType__Group__0__Impl rule__EType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EType__Group__1();

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
    // $ANTLR end "rule__EType__Group__0"


    // $ANTLR start "rule__EType__Group__0__Impl"
    // InternalRpgindividual.g:3068:1: rule__EType__Group__0__Impl : ( 'type' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3072:1: ( ( 'type' ) )
            // InternalRpgindividual.g:3073:1: ( 'type' )
            {
            // InternalRpgindividual.g:3073:1: ( 'type' )
            // InternalRpgindividual.g:3074:2: 'type'
            {
             before(grammarAccess.getETypeAccess().getTypeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__EType__Group__0__Impl"


    // $ANTLR start "rule__EType__Group__1"
    // InternalRpgindividual.g:3083:1: rule__EType__Group__1 : rule__EType__Group__1__Impl ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3087:1: ( rule__EType__Group__1__Impl )
            // InternalRpgindividual.g:3088:2: rule__EType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EType__Group__1__Impl();

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
    // $ANTLR end "rule__EType__Group__1"


    // $ANTLR start "rule__EType__Group__1__Impl"
    // InternalRpgindividual.g:3094:1: rule__EType__Group__1__Impl : ( ( rule__EType__TypeAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3098:1: ( ( ( rule__EType__TypeAssignment_1 ) ) )
            // InternalRpgindividual.g:3099:1: ( ( rule__EType__TypeAssignment_1 ) )
            {
            // InternalRpgindividual.g:3099:1: ( ( rule__EType__TypeAssignment_1 ) )
            // InternalRpgindividual.g:3100:2: ( rule__EType__TypeAssignment_1 )
            {
             before(grammarAccess.getETypeAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:3101:2: ( rule__EType__TypeAssignment_1 )
            // InternalRpgindividual.g:3101:3: rule__EType__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EType__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETypeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__EType__Group__1__Impl"


    // $ANTLR start "rule__AttributeValues__Group__0"
    // InternalRpgindividual.g:3110:1: rule__AttributeValues__Group__0 : rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 ;
    public final void rule__AttributeValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3114:1: ( rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 )
            // InternalRpgindividual.g:3115:2: rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__AttributeValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1();

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
    // $ANTLR end "rule__AttributeValues__Group__0"


    // $ANTLR start "rule__AttributeValues__Group__0__Impl"
    // InternalRpgindividual.g:3122:1: rule__AttributeValues__Group__0__Impl : ( 'is' ) ;
    public final void rule__AttributeValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3126:1: ( ( 'is' ) )
            // InternalRpgindividual.g:3127:1: ( 'is' )
            {
            // InternalRpgindividual.g:3127:1: ( 'is' )
            // InternalRpgindividual.g:3128:2: 'is'
            {
             before(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeValuesAccess().getIsKeyword_0()); 

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
    // $ANTLR end "rule__AttributeValues__Group__0__Impl"


    // $ANTLR start "rule__AttributeValues__Group__1"
    // InternalRpgindividual.g:3137:1: rule__AttributeValues__Group__1 : rule__AttributeValues__Group__1__Impl ;
    public final void rule__AttributeValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3141:1: ( rule__AttributeValues__Group__1__Impl )
            // InternalRpgindividual.g:3142:2: rule__AttributeValues__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeValues__Group__1"


    // $ANTLR start "rule__AttributeValues__Group__1__Impl"
    // InternalRpgindividual.g:3148:1: rule__AttributeValues__Group__1__Impl : ( ( rule__AttributeValues__Alternatives_1 ) ) ;
    public final void rule__AttributeValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3152:1: ( ( ( rule__AttributeValues__Alternatives_1 ) ) )
            // InternalRpgindividual.g:3153:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            {
            // InternalRpgindividual.g:3153:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            // InternalRpgindividual.g:3154:2: ( rule__AttributeValues__Alternatives_1 )
            {
             before(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 
            // InternalRpgindividual.g:3155:2: ( rule__AttributeValues__Alternatives_1 )
            // InternalRpgindividual.g:3155:3: rule__AttributeValues__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeValues__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__AttributeValues__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__0"
    // InternalRpgindividual.g:3164:1: rule__AltAttribute__Group__0 : rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 ;
    public final void rule__AltAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3168:1: ( rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 )
            // InternalRpgindividual.g:3169:2: rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AltAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__1();

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
    // $ANTLR end "rule__AltAttribute__Group__0"


    // $ANTLR start "rule__AltAttribute__Group__0__Impl"
    // InternalRpgindividual.g:3176:1: rule__AltAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AltAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3180:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:3181:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:3181:1: ( 'attribute' )
            // InternalRpgindividual.g:3182:2: 'attribute'
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__AltAttribute__Group__0__Impl"


    // $ANTLR start "rule__AltAttribute__Group__1"
    // InternalRpgindividual.g:3191:1: rule__AltAttribute__Group__1 : rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 ;
    public final void rule__AltAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3195:1: ( rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 )
            // InternalRpgindividual.g:3196:2: rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AltAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2();

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
    // $ANTLR end "rule__AltAttribute__Group__1"


    // $ANTLR start "rule__AltAttribute__Group__1__Impl"
    // InternalRpgindividual.g:3203:1: rule__AltAttribute__Group__1__Impl : ( ( rule__AltAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__AltAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3207:1: ( ( ( rule__AltAttribute__AttributeAssignment_1 ) ) )
            // InternalRpgindividual.g:3208:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            {
            // InternalRpgindividual.g:3208:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:3209:2: ( rule__AltAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:3210:2: ( rule__AltAttribute__AttributeAssignment_1 )
            // InternalRpgindividual.g:3210:3: rule__AltAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 

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
    // $ANTLR end "rule__AltAttribute__Group__1__Impl"


    // $ANTLR start "rule__AltAttribute__Group__2"
    // InternalRpgindividual.g:3218:1: rule__AltAttribute__Group__2 : rule__AltAttribute__Group__2__Impl ;
    public final void rule__AltAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3222:1: ( rule__AltAttribute__Group__2__Impl )
            // InternalRpgindividual.g:3223:2: rule__AltAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AltAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__AltAttribute__Group__2"


    // $ANTLR start "rule__AltAttribute__Group__2__Impl"
    // InternalRpgindividual.g:3229:1: rule__AltAttribute__Group__2__Impl : ( ( rule__AltAttribute__AvAssignment_2 )? ) ;
    public final void rule__AltAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3233:1: ( ( ( rule__AltAttribute__AvAssignment_2 )? ) )
            // InternalRpgindividual.g:3234:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            {
            // InternalRpgindividual.g:3234:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            // InternalRpgindividual.g:3235:2: ( rule__AltAttribute__AvAssignment_2 )?
            {
             before(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 
            // InternalRpgindividual.g:3236:2: ( rule__AltAttribute__AvAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRpgindividual.g:3236:3: rule__AltAttribute__AvAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AltAttribute__AvAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 

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
    // $ANTLR end "rule__AltAttribute__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRpgindividual.g:3245:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3249:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRpgindividual.g:3250:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRpgindividual.g:3257:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Group_0__0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3261:1: ( ( ( rule__Rule__Group_0__0 )? ) )
            // InternalRpgindividual.g:3262:1: ( ( rule__Rule__Group_0__0 )? )
            {
            // InternalRpgindividual.g:3262:1: ( ( rule__Rule__Group_0__0 )? )
            // InternalRpgindividual.g:3263:2: ( rule__Rule__Group_0__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_0()); 
            // InternalRpgindividual.g:3264:2: ( rule__Rule__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRpgindividual.g:3264:3: rule__Rule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRpgindividual.g:3272:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3276:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRpgindividual.g:3277:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRpgindividual.g:3284:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__TargetAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3288:1: ( ( ( rule__Rule__TargetAssignment_1 ) ) )
            // InternalRpgindividual.g:3289:1: ( ( rule__Rule__TargetAssignment_1 ) )
            {
            // InternalRpgindividual.g:3289:1: ( ( rule__Rule__TargetAssignment_1 ) )
            // InternalRpgindividual.g:3290:2: ( rule__Rule__TargetAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getTargetAssignment_1()); 
            // InternalRpgindividual.g:3291:2: ( rule__Rule__TargetAssignment_1 )
            // InternalRpgindividual.g:3291:3: rule__Rule__TargetAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRpgindividual.g:3299:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3303:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRpgindividual.g:3304:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRpgindividual.g:3311:1: rule__Rule__Group__2__Impl : ( 'is' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3315:1: ( ( 'is' ) )
            // InternalRpgindividual.g:3316:1: ( 'is' )
            {
            // InternalRpgindividual.g:3316:1: ( 'is' )
            // InternalRpgindividual.g:3317:2: 'is'
            {
             before(grammarAccess.getRuleAccess().getIsKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIsKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRpgindividual.g:3326:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3330:1: ( rule__Rule__Group__3__Impl )
            // InternalRpgindividual.g:3331:2: rule__Rule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__3__Impl();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRpgindividual.g:3337:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__SumAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3341:1: ( ( ( rule__Rule__SumAssignment_3 ) ) )
            // InternalRpgindividual.g:3342:1: ( ( rule__Rule__SumAssignment_3 ) )
            {
            // InternalRpgindividual.g:3342:1: ( ( rule__Rule__SumAssignment_3 ) )
            // InternalRpgindividual.g:3343:2: ( rule__Rule__SumAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getSumAssignment_3()); 
            // InternalRpgindividual.g:3344:2: ( rule__Rule__SumAssignment_3 )
            // InternalRpgindividual.g:3344:3: rule__Rule__SumAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SumAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSumAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalRpgindividual.g:3353:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3357:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRpgindividual.g:3358:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_28);
            rule__Rule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1();

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
    // $ANTLR end "rule__Rule__Group_0__0"


    // $ANTLR start "rule__Rule__Group_0__0__Impl"
    // InternalRpgindividual.g:3365:1: rule__Rule__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3369:1: ( ( 'if' ) )
            // InternalRpgindividual.g:3370:1: ( 'if' )
            {
            // InternalRpgindividual.g:3370:1: ( 'if' )
            // InternalRpgindividual.g:3371:2: 'if'
            {
             before(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIfKeyword_0_0()); 

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
    // $ANTLR end "rule__Rule__Group_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_0__1"
    // InternalRpgindividual.g:3380:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3384:1: ( rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 )
            // InternalRpgindividual.g:3385:2: rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2
            {
            pushFollow(FOLLOW_29);
            rule__Rule__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2();

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
    // $ANTLR end "rule__Rule__Group_0__1"


    // $ANTLR start "rule__Rule__Group_0__1__Impl"
    // InternalRpgindividual.g:3392:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__OrAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3396:1: ( ( ( rule__Rule__OrAssignment_0_1 ) ) )
            // InternalRpgindividual.g:3397:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            {
            // InternalRpgindividual.g:3397:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            // InternalRpgindividual.g:3398:2: ( rule__Rule__OrAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 
            // InternalRpgindividual.g:3399:2: ( rule__Rule__OrAssignment_0_1 )
            // InternalRpgindividual.g:3399:3: rule__Rule__OrAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__OrAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 

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
    // $ANTLR end "rule__Rule__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_0__2"
    // InternalRpgindividual.g:3407:1: rule__Rule__Group_0__2 : rule__Rule__Group_0__2__Impl ;
    public final void rule__Rule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3411:1: ( rule__Rule__Group_0__2__Impl )
            // InternalRpgindividual.g:3412:2: rule__Rule__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_0__2"


    // $ANTLR start "rule__Rule__Group_0__2__Impl"
    // InternalRpgindividual.g:3418:1: rule__Rule__Group_0__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3422:1: ( ( 'then' ) )
            // InternalRpgindividual.g:3423:1: ( 'then' )
            {
            // InternalRpgindividual.g:3423:1: ( 'then' )
            // InternalRpgindividual.g:3424:2: 'then'
            {
             before(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getThenKeyword_0_2()); 

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
    // $ANTLR end "rule__Rule__Group_0__2__Impl"


    // $ANTLR start "rule__Entities__Group__0"
    // InternalRpgindividual.g:3434:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3438:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalRpgindividual.g:3439:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Entities__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entities__Group__1();

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
    // $ANTLR end "rule__Entities__Group__0"


    // $ANTLR start "rule__Entities__Group__0__Impl"
    // InternalRpgindividual.g:3446:1: rule__Entities__Group__0__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3450:1: ( ( 'entities' ) )
            // InternalRpgindividual.g:3451:1: ( 'entities' )
            {
            // InternalRpgindividual.g:3451:1: ( 'entities' )
            // InternalRpgindividual.g:3452:2: 'entities'
            {
             before(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntitiesAccess().getEntitiesKeyword_0()); 

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
    // $ANTLR end "rule__Entities__Group__0__Impl"


    // $ANTLR start "rule__Entities__Group__1"
    // InternalRpgindividual.g:3461:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3465:1: ( rule__Entities__Group__1__Impl )
            // InternalRpgindividual.g:3466:2: rule__Entities__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entities__Group__1__Impl();

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
    // $ANTLR end "rule__Entities__Group__1"


    // $ANTLR start "rule__Entities__Group__1__Impl"
    // InternalRpgindividual.g:3472:1: rule__Entities__Group__1__Impl : ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3476:1: ( ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3477:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3477:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:3478:2: ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:3478:2: ( ( rule__Entities__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3479:3: ( rule__Entities__EntityAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3480:3: ( rule__Entities__EntityAssignment_1 )
            // InternalRpgindividual.g:3480:4: rule__Entities__EntityAssignment_1
            {
            pushFollow(FOLLOW_31);
            rule__Entities__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3483:2: ( ( rule__Entities__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3484:3: ( rule__Entities__EntityAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3485:3: ( rule__Entities__EntityAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRpgindividual.g:3485:4: rule__Entities__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Entities__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Entities__Group__1__Impl"


    // $ANTLR start "rule__Death__Group__0"
    // InternalRpgindividual.g:3495:1: rule__Death__Group__0 : rule__Death__Group__0__Impl rule__Death__Group__1 ;
    public final void rule__Death__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3499:1: ( rule__Death__Group__0__Impl rule__Death__Group__1 )
            // InternalRpgindividual.g:3500:2: rule__Death__Group__0__Impl rule__Death__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Death__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Death__Group__1();

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
    // $ANTLR end "rule__Death__Group__0"


    // $ANTLR start "rule__Death__Group__0__Impl"
    // InternalRpgindividual.g:3507:1: rule__Death__Group__0__Impl : ( 'death' ) ;
    public final void rule__Death__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3511:1: ( ( 'death' ) )
            // InternalRpgindividual.g:3512:1: ( 'death' )
            {
            // InternalRpgindividual.g:3512:1: ( 'death' )
            // InternalRpgindividual.g:3513:2: 'death'
            {
             before(grammarAccess.getDeathAccess().getDeathKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDeathAccess().getDeathKeyword_0()); 

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
    // $ANTLR end "rule__Death__Group__0__Impl"


    // $ANTLR start "rule__Death__Group__1"
    // InternalRpgindividual.g:3522:1: rule__Death__Group__1 : rule__Death__Group__1__Impl ;
    public final void rule__Death__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3526:1: ( rule__Death__Group__1__Impl )
            // InternalRpgindividual.g:3527:2: rule__Death__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__1__Impl();

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
    // $ANTLR end "rule__Death__Group__1"


    // $ANTLR start "rule__Death__Group__1__Impl"
    // InternalRpgindividual.g:3533:1: rule__Death__Group__1__Impl : ( ( rule__Death__ReqAssignment_1 ) ) ;
    public final void rule__Death__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3537:1: ( ( ( rule__Death__ReqAssignment_1 ) ) )
            // InternalRpgindividual.g:3538:1: ( ( rule__Death__ReqAssignment_1 ) )
            {
            // InternalRpgindividual.g:3538:1: ( ( rule__Death__ReqAssignment_1 ) )
            // InternalRpgindividual.g:3539:2: ( rule__Death__ReqAssignment_1 )
            {
             before(grammarAccess.getDeathAccess().getReqAssignment_1()); 
            // InternalRpgindividual.g:3540:2: ( rule__Death__ReqAssignment_1 )
            // InternalRpgindividual.g:3540:3: rule__Death__ReqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Death__ReqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getReqAssignment_1()); 

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
    // $ANTLR end "rule__Death__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRpgindividual.g:3549:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3553:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRpgindividual.g:3554:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalRpgindividual.g:3561:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3565:1: ( ( 'entity' ) )
            // InternalRpgindividual.g:3566:1: ( 'entity' )
            {
            // InternalRpgindividual.g:3566:1: ( 'entity' )
            // InternalRpgindividual.g:3567:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalRpgindividual.g:3576:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3580:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRpgindividual.g:3581:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalRpgindividual.g:3588:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3592:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3593:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3593:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRpgindividual.g:3594:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3595:2: ( rule__Entity__NameAssignment_1 )
            // InternalRpgindividual.g:3595:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalRpgindividual.g:3603:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3607:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRpgindividual.g:3608:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalRpgindividual.g:3615:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__ETypeAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3619:1: ( ( ( rule__Entity__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:3620:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:3620:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:3621:2: ( rule__Entity__ETypeAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:3622:2: ( rule__Entity__ETypeAssignment_2 )
            // InternalRpgindividual.g:3622:3: rule__Entity__ETypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ETypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getETypeAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalRpgindividual.g:3630:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3634:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRpgindividual.g:3635:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalRpgindividual.g:3642:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3646:1: ( ( ( rule__Entity__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:3647:1: ( ( rule__Entity__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:3647:1: ( ( rule__Entity__AttAssignment_3 )* )
            // InternalRpgindividual.g:3648:2: ( rule__Entity__AttAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:3649:2: ( rule__Entity__AttAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRpgindividual.g:3649:3: rule__Entity__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Entity__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalRpgindividual.g:3657:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3661:1: ( rule__Entity__Group__4__Impl )
            // InternalRpgindividual.g:3662:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalRpgindividual.g:3668:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EMovesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3672:1: ( ( ( rule__Entity__EMovesAssignment_4 ) ) )
            // InternalRpgindividual.g:3673:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            {
            // InternalRpgindividual.g:3673:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            // InternalRpgindividual.g:3674:2: ( rule__Entity__EMovesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEMovesAssignment_4()); 
            // InternalRpgindividual.g:3675:2: ( rule__Entity__EMovesAssignment_4 )
            // InternalRpgindividual.g:3675:3: rule__Entity__EMovesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__EMovesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getEMovesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__EntityMoves__Group__0"
    // InternalRpgindividual.g:3684:1: rule__EntityMoves__Group__0 : rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 ;
    public final void rule__EntityMoves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3688:1: ( rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 )
            // InternalRpgindividual.g:3689:2: rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntityMoves__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1();

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
    // $ANTLR end "rule__EntityMoves__Group__0"


    // $ANTLR start "rule__EntityMoves__Group__0__Impl"
    // InternalRpgindividual.g:3696:1: rule__EntityMoves__Group__0__Impl : ( 'move' ) ;
    public final void rule__EntityMoves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3700:1: ( ( 'move' ) )
            // InternalRpgindividual.g:3701:1: ( 'move' )
            {
            // InternalRpgindividual.g:3701:1: ( 'move' )
            // InternalRpgindividual.g:3702:2: 'move'
            {
             before(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 

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
    // $ANTLR end "rule__EntityMoves__Group__0__Impl"


    // $ANTLR start "rule__EntityMoves__Group__1"
    // InternalRpgindividual.g:3711:1: rule__EntityMoves__Group__1 : rule__EntityMoves__Group__1__Impl ;
    public final void rule__EntityMoves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3715:1: ( rule__EntityMoves__Group__1__Impl )
            // InternalRpgindividual.g:3716:2: rule__EntityMoves__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoves__Group__1__Impl();

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
    // $ANTLR end "rule__EntityMoves__Group__1"


    // $ANTLR start "rule__EntityMoves__Group__1__Impl"
    // InternalRpgindividual.g:3722:1: rule__EntityMoves__Group__1__Impl : ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) ;
    public final void rule__EntityMoves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3726:1: ( ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3727:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3727:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:3728:2: ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:3728:2: ( ( rule__EntityMoves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:3729:3: ( rule__EntityMoves__MoveAssignment_1 )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3730:3: ( rule__EntityMoves__MoveAssignment_1 )
            // InternalRpgindividual.g:3730:4: rule__EntityMoves__MoveAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__EntityMoves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:3733:2: ( ( rule__EntityMoves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:3734:3: ( rule__EntityMoves__MoveAssignment_1 )*
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3735:3: ( rule__EntityMoves__MoveAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRpgindividual.g:3735:4: rule__EntityMoves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EntityMoves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

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
    // $ANTLR end "rule__EntityMoves__Group__1__Impl"


    // $ANTLR start "rule__Teams__Group__0"
    // InternalRpgindividual.g:3745:1: rule__Teams__Group__0 : rule__Teams__Group__0__Impl rule__Teams__Group__1 ;
    public final void rule__Teams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3749:1: ( rule__Teams__Group__0__Impl rule__Teams__Group__1 )
            // InternalRpgindividual.g:3750:2: rule__Teams__Group__0__Impl rule__Teams__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Teams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Teams__Group__1();

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
    // $ANTLR end "rule__Teams__Group__0"


    // $ANTLR start "rule__Teams__Group__0__Impl"
    // InternalRpgindividual.g:3757:1: rule__Teams__Group__0__Impl : ( 'teams' ) ;
    public final void rule__Teams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3761:1: ( ( 'teams' ) )
            // InternalRpgindividual.g:3762:1: ( 'teams' )
            {
            // InternalRpgindividual.g:3762:1: ( 'teams' )
            // InternalRpgindividual.g:3763:2: 'teams'
            {
             before(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 

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
    // $ANTLR end "rule__Teams__Group__0__Impl"


    // $ANTLR start "rule__Teams__Group__1"
    // InternalRpgindividual.g:3772:1: rule__Teams__Group__1 : rule__Teams__Group__1__Impl ;
    public final void rule__Teams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3776:1: ( rule__Teams__Group__1__Impl )
            // InternalRpgindividual.g:3777:2: rule__Teams__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Teams__Group__1__Impl();

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
    // $ANTLR end "rule__Teams__Group__1"


    // $ANTLR start "rule__Teams__Group__1__Impl"
    // InternalRpgindividual.g:3783:1: rule__Teams__Group__1__Impl : ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) ;
    public final void rule__Teams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3787:1: ( ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3788:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3788:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            // InternalRpgindividual.g:3789:2: ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* )
            {
            // InternalRpgindividual.g:3789:2: ( ( rule__Teams__TeamAssignment_1 ) )
            // InternalRpgindividual.g:3790:3: ( rule__Teams__TeamAssignment_1 )
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3791:3: ( rule__Teams__TeamAssignment_1 )
            // InternalRpgindividual.g:3791:4: rule__Teams__TeamAssignment_1
            {
            pushFollow(FOLLOW_35);
            rule__Teams__TeamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

            }

            // InternalRpgindividual.g:3794:2: ( ( rule__Teams__TeamAssignment_1 )* )
            // InternalRpgindividual.g:3795:3: ( rule__Teams__TeamAssignment_1 )*
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3796:3: ( rule__Teams__TeamAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgindividual.g:3796:4: rule__Teams__TeamAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Teams__TeamAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

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
    // $ANTLR end "rule__Teams__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__0"
    // InternalRpgindividual.g:3806:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3810:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalRpgindividual.g:3811:2: rule__Team__Group__0__Impl rule__Team__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Team__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__1();

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
    // $ANTLR end "rule__Team__Group__0"


    // $ANTLR start "rule__Team__Group__0__Impl"
    // InternalRpgindividual.g:3818:1: rule__Team__Group__0__Impl : ( 'team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3822:1: ( ( 'team' ) )
            // InternalRpgindividual.g:3823:1: ( 'team' )
            {
            // InternalRpgindividual.g:3823:1: ( 'team' )
            // InternalRpgindividual.g:3824:2: 'team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getTeamKeyword_0()); 

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
    // $ANTLR end "rule__Team__Group__0__Impl"


    // $ANTLR start "rule__Team__Group__1"
    // InternalRpgindividual.g:3833:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3837:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalRpgindividual.g:3838:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Team__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Team__Group__2();

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
    // $ANTLR end "rule__Team__Group__1"


    // $ANTLR start "rule__Team__Group__1__Impl"
    // InternalRpgindividual.g:3845:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3849:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3850:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3850:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalRpgindividual.g:3851:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3852:2: ( rule__Team__NameAssignment_1 )
            // InternalRpgindividual.g:3852:3: rule__Team__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Team__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Team__Group__1__Impl"


    // $ANTLR start "rule__Team__Group__2"
    // InternalRpgindividual.g:3860:1: rule__Team__Group__2 : rule__Team__Group__2__Impl ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3864:1: ( rule__Team__Group__2__Impl )
            // InternalRpgindividual.g:3865:2: rule__Team__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Team__Group__2__Impl();

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
    // $ANTLR end "rule__Team__Group__2"


    // $ANTLR start "rule__Team__Group__2__Impl"
    // InternalRpgindividual.g:3871:1: rule__Team__Group__2__Impl : ( ( rule__Team__MembersAssignment_2 ) ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3875:1: ( ( ( rule__Team__MembersAssignment_2 ) ) )
            // InternalRpgindividual.g:3876:1: ( ( rule__Team__MembersAssignment_2 ) )
            {
            // InternalRpgindividual.g:3876:1: ( ( rule__Team__MembersAssignment_2 ) )
            // InternalRpgindividual.g:3877:2: ( rule__Team__MembersAssignment_2 )
            {
             before(grammarAccess.getTeamAccess().getMembersAssignment_2()); 
            // InternalRpgindividual.g:3878:2: ( rule__Team__MembersAssignment_2 )
            // InternalRpgindividual.g:3878:3: rule__Team__MembersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Team__MembersAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTeamAccess().getMembersAssignment_2()); 

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
    // $ANTLR end "rule__Team__Group__2__Impl"


    // $ANTLR start "rule__Members__Group__0"
    // InternalRpgindividual.g:3887:1: rule__Members__Group__0 : rule__Members__Group__0__Impl rule__Members__Group__1 ;
    public final void rule__Members__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3891:1: ( rule__Members__Group__0__Impl rule__Members__Group__1 )
            // InternalRpgindividual.g:3892:2: rule__Members__Group__0__Impl rule__Members__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Members__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Members__Group__1();

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
    // $ANTLR end "rule__Members__Group__0"


    // $ANTLR start "rule__Members__Group__0__Impl"
    // InternalRpgindividual.g:3899:1: rule__Members__Group__0__Impl : ( 'members' ) ;
    public final void rule__Members__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3903:1: ( ( 'members' ) )
            // InternalRpgindividual.g:3904:1: ( 'members' )
            {
            // InternalRpgindividual.g:3904:1: ( 'members' )
            // InternalRpgindividual.g:3905:2: 'members'
            {
             before(grammarAccess.getMembersAccess().getMembersKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getMembersKeyword_0()); 

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
    // $ANTLR end "rule__Members__Group__0__Impl"


    // $ANTLR start "rule__Members__Group__1"
    // InternalRpgindividual.g:3914:1: rule__Members__Group__1 : rule__Members__Group__1__Impl ;
    public final void rule__Members__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3918:1: ( rule__Members__Group__1__Impl )
            // InternalRpgindividual.g:3919:2: rule__Members__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Members__Group__1__Impl();

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
    // $ANTLR end "rule__Members__Group__1"


    // $ANTLR start "rule__Members__Group__1__Impl"
    // InternalRpgindividual.g:3925:1: rule__Members__Group__1__Impl : ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) ;
    public final void rule__Members__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3929:1: ( ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3930:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3930:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:3931:2: ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:3931:2: ( ( rule__Members__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3932:3: ( rule__Members__EntityAssignment_1 )
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3933:3: ( rule__Members__EntityAssignment_1 )
            // InternalRpgindividual.g:3933:4: rule__Members__EntityAssignment_1
            {
            pushFollow(FOLLOW_13);
            rule__Members__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3936:2: ( ( rule__Members__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3937:3: ( rule__Members__EntityAssignment_1 )*
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3938:3: ( rule__Members__EntityAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRpgindividual.g:3938:4: rule__Members__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Members__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Members__Group__1__Impl"


    // $ANTLR start "rule__Require__Group__0"
    // InternalRpgindividual.g:3948:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3952:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // InternalRpgindividual.g:3953:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__1();

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
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // InternalRpgindividual.g:3960:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3964:1: ( ( 'require' ) )
            // InternalRpgindividual.g:3965:1: ( 'require' )
            {
            // InternalRpgindividual.g:3965:1: ( 'require' )
            // InternalRpgindividual.g:3966:2: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

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
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // InternalRpgindividual.g:3975:1: rule__Require__Group__1 : rule__Require__Group__1__Impl ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3979:1: ( rule__Require__Group__1__Impl )
            // InternalRpgindividual.g:3980:2: rule__Require__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__1__Impl();

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
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // InternalRpgindividual.g:3986:1: rule__Require__Group__1__Impl : ( ( rule__Require__LogAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3990:1: ( ( ( rule__Require__LogAssignment_1 ) ) )
            // InternalRpgindividual.g:3991:1: ( ( rule__Require__LogAssignment_1 ) )
            {
            // InternalRpgindividual.g:3991:1: ( ( rule__Require__LogAssignment_1 ) )
            // InternalRpgindividual.g:3992:2: ( rule__Require__LogAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getLogAssignment_1()); 
            // InternalRpgindividual.g:3993:2: ( rule__Require__LogAssignment_1 )
            // InternalRpgindividual.g:3993:3: rule__Require__LogAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Require__LogAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getLogAssignment_1()); 

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
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group__0"
    // InternalRpgindividual.g:4002:1: rule__ORcondition__Group__0 : rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 ;
    public final void rule__ORcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4006:1: ( rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 )
            // InternalRpgindividual.g:4007:2: rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ORcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1();

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
    // $ANTLR end "rule__ORcondition__Group__0"


    // $ANTLR start "rule__ORcondition__Group__0__Impl"
    // InternalRpgindividual.g:4014:1: rule__ORcondition__Group__0__Impl : ( ruleANDcondition ) ;
    public final void rule__ORcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4018:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:4019:1: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:4019:1: ( ruleANDcondition )
            // InternalRpgindividual.g:4020:2: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0()); 

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
    // $ANTLR end "rule__ORcondition__Group__0__Impl"


    // $ANTLR start "rule__ORcondition__Group__1"
    // InternalRpgindividual.g:4029:1: rule__ORcondition__Group__1 : rule__ORcondition__Group__1__Impl ;
    public final void rule__ORcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4033:1: ( rule__ORcondition__Group__1__Impl )
            // InternalRpgindividual.g:4034:2: rule__ORcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group__1__Impl();

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
    // $ANTLR end "rule__ORcondition__Group__1"


    // $ANTLR start "rule__ORcondition__Group__1__Impl"
    // InternalRpgindividual.g:4040:1: rule__ORcondition__Group__1__Impl : ( ( rule__ORcondition__Group_1__0 )* ) ;
    public final void rule__ORcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4044:1: ( ( ( rule__ORcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:4045:1: ( ( rule__ORcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4045:1: ( ( rule__ORcondition__Group_1__0 )* )
            // InternalRpgindividual.g:4046:2: ( rule__ORcondition__Group_1__0 )*
            {
             before(grammarAccess.getORconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:4047:2: ( rule__ORcondition__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==38) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRpgindividual.g:4047:3: rule__ORcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ORcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getORconditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ORcondition__Group__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__0"
    // InternalRpgindividual.g:4056:1: rule__ORcondition__Group_1__0 : rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 ;
    public final void rule__ORcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4060:1: ( rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 )
            // InternalRpgindividual.g:4061:2: rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ORcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__1();

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
    // $ANTLR end "rule__ORcondition__Group_1__0"


    // $ANTLR start "rule__ORcondition__Group_1__0__Impl"
    // InternalRpgindividual.g:4068:1: rule__ORcondition__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__ORcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4072:1: ( ( 'OR' ) )
            // InternalRpgindividual.g:4073:1: ( 'OR' )
            {
            // InternalRpgindividual.g:4073:1: ( 'OR' )
            // InternalRpgindividual.g:4074:2: 'OR'
            {
             before(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 

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
    // $ANTLR end "rule__ORcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__1"
    // InternalRpgindividual.g:4083:1: rule__ORcondition__Group_1__1 : rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 ;
    public final void rule__ORcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4087:1: ( rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 )
            // InternalRpgindividual.g:4088:2: rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__ORcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2();

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
    // $ANTLR end "rule__ORcondition__Group_1__1"


    // $ANTLR start "rule__ORcondition__Group_1__1__Impl"
    // InternalRpgindividual.g:4095:1: rule__ORcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ORcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4099:1: ( ( () ) )
            // InternalRpgindividual.g:4100:1: ( () )
            {
            // InternalRpgindividual.g:4100:1: ( () )
            // InternalRpgindividual.g:4101:2: ()
            {
             before(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 
            // InternalRpgindividual.g:4102:2: ()
            // InternalRpgindividual.g:4102:3: 
            {
            }

             after(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ORcondition__Group_1__2"
    // InternalRpgindividual.g:4110:1: rule__ORcondition__Group_1__2 : rule__ORcondition__Group_1__2__Impl ;
    public final void rule__ORcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4114:1: ( rule__ORcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:4115:2: rule__ORcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__ORcondition__Group_1__2"


    // $ANTLR start "rule__ORcondition__Group_1__2__Impl"
    // InternalRpgindividual.g:4121:1: rule__ORcondition__Group_1__2__Impl : ( ( rule__ORcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ORcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4125:1: ( ( ( rule__ORcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:4126:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:4126:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:4127:2: ( rule__ORcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:4128:2: ( rule__ORcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:4128:3: rule__ORcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ORcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ORcondition__Group_1__2__Impl"


    // $ANTLR start "rule__ANDcondition__Group__0"
    // InternalRpgindividual.g:4137:1: rule__ANDcondition__Group__0 : rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 ;
    public final void rule__ANDcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4141:1: ( rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 )
            // InternalRpgindividual.g:4142:2: rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ANDcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1();

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
    // $ANTLR end "rule__ANDcondition__Group__0"


    // $ANTLR start "rule__ANDcondition__Group__0__Impl"
    // InternalRpgindividual.g:4149:1: rule__ANDcondition__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__ANDcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4153:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:4154:1: ( ruleStatement )
            {
            // InternalRpgindividual.g:4154:1: ( ruleStatement )
            // InternalRpgindividual.g:4155:2: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__ANDcondition__Group__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group__1"
    // InternalRpgindividual.g:4164:1: rule__ANDcondition__Group__1 : rule__ANDcondition__Group__1__Impl ;
    public final void rule__ANDcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4168:1: ( rule__ANDcondition__Group__1__Impl )
            // InternalRpgindividual.g:4169:2: rule__ANDcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group__1__Impl();

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
    // $ANTLR end "rule__ANDcondition__Group__1"


    // $ANTLR start "rule__ANDcondition__Group__1__Impl"
    // InternalRpgindividual.g:4175:1: rule__ANDcondition__Group__1__Impl : ( ( rule__ANDcondition__Group_1__0 )* ) ;
    public final void rule__ANDcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4179:1: ( ( ( rule__ANDcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:4180:1: ( ( rule__ANDcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4180:1: ( ( rule__ANDcondition__Group_1__0 )* )
            // InternalRpgindividual.g:4181:2: ( rule__ANDcondition__Group_1__0 )*
            {
             before(grammarAccess.getANDconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:4182:2: ( rule__ANDcondition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==39) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRpgindividual.g:4182:3: rule__ANDcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__ANDcondition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getANDconditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ANDcondition__Group__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__0"
    // InternalRpgindividual.g:4191:1: rule__ANDcondition__Group_1__0 : rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 ;
    public final void rule__ANDcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4195:1: ( rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 )
            // InternalRpgindividual.g:4196:2: rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ANDcondition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__1();

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
    // $ANTLR end "rule__ANDcondition__Group_1__0"


    // $ANTLR start "rule__ANDcondition__Group_1__0__Impl"
    // InternalRpgindividual.g:4203:1: rule__ANDcondition__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__ANDcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4207:1: ( ( 'AND' ) )
            // InternalRpgindividual.g:4208:1: ( 'AND' )
            {
            // InternalRpgindividual.g:4208:1: ( 'AND' )
            // InternalRpgindividual.g:4209:2: 'AND'
            {
             before(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 

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
    // $ANTLR end "rule__ANDcondition__Group_1__0__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__1"
    // InternalRpgindividual.g:4218:1: rule__ANDcondition__Group_1__1 : rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 ;
    public final void rule__ANDcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4222:1: ( rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 )
            // InternalRpgindividual.g:4223:2: rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__ANDcondition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2();

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
    // $ANTLR end "rule__ANDcondition__Group_1__1"


    // $ANTLR start "rule__ANDcondition__Group_1__1__Impl"
    // InternalRpgindividual.g:4230:1: rule__ANDcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ANDcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4234:1: ( ( () ) )
            // InternalRpgindividual.g:4235:1: ( () )
            {
            // InternalRpgindividual.g:4235:1: ( () )
            // InternalRpgindividual.g:4236:2: ()
            {
             before(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 
            // InternalRpgindividual.g:4237:2: ()
            // InternalRpgindividual.g:4237:3: 
            {
            }

             after(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ANDcondition__Group_1__1__Impl"


    // $ANTLR start "rule__ANDcondition__Group_1__2"
    // InternalRpgindividual.g:4245:1: rule__ANDcondition__Group_1__2 : rule__ANDcondition__Group_1__2__Impl ;
    public final void rule__ANDcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4249:1: ( rule__ANDcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:4250:2: rule__ANDcondition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__Group_1__2__Impl();

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
    // $ANTLR end "rule__ANDcondition__Group_1__2"


    // $ANTLR start "rule__ANDcondition__Group_1__2__Impl"
    // InternalRpgindividual.g:4256:1: rule__ANDcondition__Group_1__2__Impl : ( ( rule__ANDcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ANDcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4260:1: ( ( ( rule__ANDcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:4261:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:4261:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:4262:2: ( rule__ANDcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:4263:2: ( rule__ANDcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:4263:3: rule__ANDcondition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ANDcondition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__ANDcondition__Group_1__2__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // InternalRpgindividual.g:4272:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4276:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalRpgindividual.g:4277:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__1();

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
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // InternalRpgindividual.g:4284:1: rule__Statement__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4288:1: ( ( '(' ) )
            // InternalRpgindividual.g:4289:1: ( '(' )
            {
            // InternalRpgindividual.g:4289:1: ( '(' )
            // InternalRpgindividual.g:4290:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // InternalRpgindividual.g:4299:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4303:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalRpgindividual.g:4304:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_41);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2();

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
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // InternalRpgindividual.g:4311:1: rule__Statement__Group_1__1__Impl : ( ruleORcondition ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4315:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:4316:1: ( ruleORcondition )
            {
            // InternalRpgindividual.g:4316:1: ( ruleORcondition )
            // InternalRpgindividual.g:4317:2: ruleORcondition
            {
             before(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__2"
    // InternalRpgindividual.g:4326:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4330:1: ( rule__Statement__Group_1__2__Impl )
            // InternalRpgindividual.g:4331:2: rule__Statement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group_1__2__Impl();

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
    // $ANTLR end "rule__Statement__Group_1__2"


    // $ANTLR start "rule__Statement__Group_1__2__Impl"
    // InternalRpgindividual.g:4337:1: rule__Statement__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4341:1: ( ( ')' ) )
            // InternalRpgindividual.g:4342:1: ( ')' )
            {
            // InternalRpgindividual.g:4342:1: ( ')' )
            // InternalRpgindividual.g:4343:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Statement__Group_1__2__Impl"


    // $ANTLR start "rule__NumberComparing__Group__0"
    // InternalRpgindividual.g:4353:1: rule__NumberComparing__Group__0 : rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 ;
    public final void rule__NumberComparing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4357:1: ( rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 )
            // InternalRpgindividual.g:4358:2: rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__NumberComparing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__1();

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
    // $ANTLR end "rule__NumberComparing__Group__0"


    // $ANTLR start "rule__NumberComparing__Group__0__Impl"
    // InternalRpgindividual.g:4365:1: rule__NumberComparing__Group__0__Impl : ( ( rule__NumberComparing__LeftAssignment_0 ) ) ;
    public final void rule__NumberComparing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4369:1: ( ( ( rule__NumberComparing__LeftAssignment_0 ) ) )
            // InternalRpgindividual.g:4370:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            {
            // InternalRpgindividual.g:4370:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            // InternalRpgindividual.g:4371:2: ( rule__NumberComparing__LeftAssignment_0 )
            {
             before(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 
            // InternalRpgindividual.g:4372:2: ( rule__NumberComparing__LeftAssignment_0 )
            // InternalRpgindividual.g:4372:3: rule__NumberComparing__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__NumberComparing__Group__0__Impl"


    // $ANTLR start "rule__NumberComparing__Group__1"
    // InternalRpgindividual.g:4380:1: rule__NumberComparing__Group__1 : rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 ;
    public final void rule__NumberComparing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4384:1: ( rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 )
            // InternalRpgindividual.g:4385:2: rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__NumberComparing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2();

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
    // $ANTLR end "rule__NumberComparing__Group__1"


    // $ANTLR start "rule__NumberComparing__Group__1__Impl"
    // InternalRpgindividual.g:4392:1: rule__NumberComparing__Group__1__Impl : ( ( rule__NumberComparing__CompAssignment_1 ) ) ;
    public final void rule__NumberComparing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4396:1: ( ( ( rule__NumberComparing__CompAssignment_1 ) ) )
            // InternalRpgindividual.g:4397:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            {
            // InternalRpgindividual.g:4397:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            // InternalRpgindividual.g:4398:2: ( rule__NumberComparing__CompAssignment_1 )
            {
             before(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 
            // InternalRpgindividual.g:4399:2: ( rule__NumberComparing__CompAssignment_1 )
            // InternalRpgindividual.g:4399:3: rule__NumberComparing__CompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 

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
    // $ANTLR end "rule__NumberComparing__Group__1__Impl"


    // $ANTLR start "rule__NumberComparing__Group__2"
    // InternalRpgindividual.g:4407:1: rule__NumberComparing__Group__2 : rule__NumberComparing__Group__2__Impl ;
    public final void rule__NumberComparing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4411:1: ( rule__NumberComparing__Group__2__Impl )
            // InternalRpgindividual.g:4412:2: rule__NumberComparing__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__Group__2__Impl();

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
    // $ANTLR end "rule__NumberComparing__Group__2"


    // $ANTLR start "rule__NumberComparing__Group__2__Impl"
    // InternalRpgindividual.g:4418:1: rule__NumberComparing__Group__2__Impl : ( ( rule__NumberComparing__RightAssignment_2 ) ) ;
    public final void rule__NumberComparing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4422:1: ( ( ( rule__NumberComparing__RightAssignment_2 ) ) )
            // InternalRpgindividual.g:4423:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            {
            // InternalRpgindividual.g:4423:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            // InternalRpgindividual.g:4424:2: ( rule__NumberComparing__RightAssignment_2 )
            {
             before(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 
            // InternalRpgindividual.g:4425:2: ( rule__NumberComparing__RightAssignment_2 )
            // InternalRpgindividual.g:4425:3: rule__NumberComparing__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NumberComparing__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__NumberComparing__Group__2__Impl"


    // $ANTLR start "rule__Comparator__Group_0__0"
    // InternalRpgindividual.g:4434:1: rule__Comparator__Group_0__0 : rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 ;
    public final void rule__Comparator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4438:1: ( rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 )
            // InternalRpgindividual.g:4439:2: rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Comparator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1();

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
    // $ANTLR end "rule__Comparator__Group_0__0"


    // $ANTLR start "rule__Comparator__Group_0__0__Impl"
    // InternalRpgindividual.g:4446:1: rule__Comparator__Group_0__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4450:1: ( ( () ) )
            // InternalRpgindividual.g:4451:1: ( () )
            {
            // InternalRpgindividual.g:4451:1: ( () )
            // InternalRpgindividual.g:4452:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 
            // InternalRpgindividual.g:4453:2: ()
            // InternalRpgindividual.g:4453:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_0__0__Impl"


    // $ANTLR start "rule__Comparator__Group_0__1"
    // InternalRpgindividual.g:4461:1: rule__Comparator__Group_0__1 : rule__Comparator__Group_0__1__Impl ;
    public final void rule__Comparator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4465:1: ( rule__Comparator__Group_0__1__Impl )
            // InternalRpgindividual.g:4466:2: rule__Comparator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_0__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_0__1"


    // $ANTLR start "rule__Comparator__Group_0__1__Impl"
    // InternalRpgindividual.g:4472:1: rule__Comparator__Group_0__1__Impl : ( '<' ) ;
    public final void rule__Comparator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4476:1: ( ( '<' ) )
            // InternalRpgindividual.g:4477:1: ( '<' )
            {
            // InternalRpgindividual.g:4477:1: ( '<' )
            // InternalRpgindividual.g:4478:2: '<'
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Comparator__Group_0__1__Impl"


    // $ANTLR start "rule__Comparator__Group_1__0"
    // InternalRpgindividual.g:4488:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4492:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalRpgindividual.g:4493:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_43);
            rule__Comparator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1();

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
    // $ANTLR end "rule__Comparator__Group_1__0"


    // $ANTLR start "rule__Comparator__Group_1__0__Impl"
    // InternalRpgindividual.g:4500:1: rule__Comparator__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4504:1: ( ( () ) )
            // InternalRpgindividual.g:4505:1: ( () )
            {
            // InternalRpgindividual.g:4505:1: ( () )
            // InternalRpgindividual.g:4506:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 
            // InternalRpgindividual.g:4507:2: ()
            // InternalRpgindividual.g:4507:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_1__0__Impl"


    // $ANTLR start "rule__Comparator__Group_1__1"
    // InternalRpgindividual.g:4515:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4519:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalRpgindividual.g:4520:2: rule__Comparator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_1__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_1__1"


    // $ANTLR start "rule__Comparator__Group_1__1__Impl"
    // InternalRpgindividual.g:4526:1: rule__Comparator__Group_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4530:1: ( ( '<=' ) )
            // InternalRpgindividual.g:4531:1: ( '<=' )
            {
            // InternalRpgindividual.g:4531:1: ( '<=' )
            // InternalRpgindividual.g:4532:2: '<='
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__Comparator__Group_1__1__Impl"


    // $ANTLR start "rule__Comparator__Group_2__0"
    // InternalRpgindividual.g:4542:1: rule__Comparator__Group_2__0 : rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 ;
    public final void rule__Comparator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4546:1: ( rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 )
            // InternalRpgindividual.g:4547:2: rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__Comparator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1();

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
    // $ANTLR end "rule__Comparator__Group_2__0"


    // $ANTLR start "rule__Comparator__Group_2__0__Impl"
    // InternalRpgindividual.g:4554:1: rule__Comparator__Group_2__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4558:1: ( ( () ) )
            // InternalRpgindividual.g:4559:1: ( () )
            {
            // InternalRpgindividual.g:4559:1: ( () )
            // InternalRpgindividual.g:4560:2: ()
            {
             before(grammarAccess.getComparatorAccess().getEqAction_2_0()); 
            // InternalRpgindividual.g:4561:2: ()
            // InternalRpgindividual.g:4561:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getEqAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_2__0__Impl"


    // $ANTLR start "rule__Comparator__Group_2__1"
    // InternalRpgindividual.g:4569:1: rule__Comparator__Group_2__1 : rule__Comparator__Group_2__1__Impl ;
    public final void rule__Comparator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4573:1: ( rule__Comparator__Group_2__1__Impl )
            // InternalRpgindividual.g:4574:2: rule__Comparator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_2__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_2__1"


    // $ANTLR start "rule__Comparator__Group_2__1__Impl"
    // InternalRpgindividual.g:4580:1: rule__Comparator__Group_2__1__Impl : ( '==' ) ;
    public final void rule__Comparator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4584:1: ( ( '==' ) )
            // InternalRpgindividual.g:4585:1: ( '==' )
            {
            // InternalRpgindividual.g:4585:1: ( '==' )
            // InternalRpgindividual.g:4586:2: '=='
            {
             before(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__Comparator__Group_2__1__Impl"


    // $ANTLR start "rule__Comparator__Group_3__0"
    // InternalRpgindividual.g:4596:1: rule__Comparator__Group_3__0 : rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 ;
    public final void rule__Comparator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4600:1: ( rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 )
            // InternalRpgindividual.g:4601:2: rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1
            {
            pushFollow(FOLLOW_45);
            rule__Comparator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1();

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
    // $ANTLR end "rule__Comparator__Group_3__0"


    // $ANTLR start "rule__Comparator__Group_3__0__Impl"
    // InternalRpgindividual.g:4608:1: rule__Comparator__Group_3__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4612:1: ( ( () ) )
            // InternalRpgindividual.g:4613:1: ( () )
            {
            // InternalRpgindividual.g:4613:1: ( () )
            // InternalRpgindividual.g:4614:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 
            // InternalRpgindividual.g:4615:2: ()
            // InternalRpgindividual.g:4615:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_3__0__Impl"


    // $ANTLR start "rule__Comparator__Group_3__1"
    // InternalRpgindividual.g:4623:1: rule__Comparator__Group_3__1 : rule__Comparator__Group_3__1__Impl ;
    public final void rule__Comparator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4627:1: ( rule__Comparator__Group_3__1__Impl )
            // InternalRpgindividual.g:4628:2: rule__Comparator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_3__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_3__1"


    // $ANTLR start "rule__Comparator__Group_3__1__Impl"
    // InternalRpgindividual.g:4634:1: rule__Comparator__Group_3__1__Impl : ( '>=' ) ;
    public final void rule__Comparator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4638:1: ( ( '>=' ) )
            // InternalRpgindividual.g:4639:1: ( '>=' )
            {
            // InternalRpgindividual.g:4639:1: ( '>=' )
            // InternalRpgindividual.g:4640:2: '>='
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Comparator__Group_3__1__Impl"


    // $ANTLR start "rule__Comparator__Group_4__0"
    // InternalRpgindividual.g:4650:1: rule__Comparator__Group_4__0 : rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 ;
    public final void rule__Comparator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4654:1: ( rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 )
            // InternalRpgindividual.g:4655:2: rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1
            {
            pushFollow(FOLLOW_46);
            rule__Comparator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1();

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
    // $ANTLR end "rule__Comparator__Group_4__0"


    // $ANTLR start "rule__Comparator__Group_4__0__Impl"
    // InternalRpgindividual.g:4662:1: rule__Comparator__Group_4__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4666:1: ( ( () ) )
            // InternalRpgindividual.g:4667:1: ( () )
            {
            // InternalRpgindividual.g:4667:1: ( () )
            // InternalRpgindividual.g:4668:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 
            // InternalRpgindividual.g:4669:2: ()
            // InternalRpgindividual.g:4669:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_4__0__Impl"


    // $ANTLR start "rule__Comparator__Group_4__1"
    // InternalRpgindividual.g:4677:1: rule__Comparator__Group_4__1 : rule__Comparator__Group_4__1__Impl ;
    public final void rule__Comparator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4681:1: ( rule__Comparator__Group_4__1__Impl )
            // InternalRpgindividual.g:4682:2: rule__Comparator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_4__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_4__1"


    // $ANTLR start "rule__Comparator__Group_4__1__Impl"
    // InternalRpgindividual.g:4688:1: rule__Comparator__Group_4__1__Impl : ( '>' ) ;
    public final void rule__Comparator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4692:1: ( ( '>' ) )
            // InternalRpgindividual.g:4693:1: ( '>' )
            {
            // InternalRpgindividual.g:4693:1: ( '>' )
            // InternalRpgindividual.g:4694:2: '>'
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 

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
    // $ANTLR end "rule__Comparator__Group_4__1__Impl"


    // $ANTLR start "rule__Comparator__Group_5__0"
    // InternalRpgindividual.g:4704:1: rule__Comparator__Group_5__0 : rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 ;
    public final void rule__Comparator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4708:1: ( rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 )
            // InternalRpgindividual.g:4709:2: rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1
            {
            pushFollow(FOLLOW_42);
            rule__Comparator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1();

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
    // $ANTLR end "rule__Comparator__Group_5__0"


    // $ANTLR start "rule__Comparator__Group_5__0__Impl"
    // InternalRpgindividual.g:4716:1: rule__Comparator__Group_5__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4720:1: ( ( () ) )
            // InternalRpgindividual.g:4721:1: ( () )
            {
            // InternalRpgindividual.g:4721:1: ( () )
            // InternalRpgindividual.g:4722:2: ()
            {
             before(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 
            // InternalRpgindividual.g:4723:2: ()
            // InternalRpgindividual.g:4723:3: 
            {
            }

             after(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparator__Group_5__0__Impl"


    // $ANTLR start "rule__Comparator__Group_5__1"
    // InternalRpgindividual.g:4731:1: rule__Comparator__Group_5__1 : rule__Comparator__Group_5__1__Impl ;
    public final void rule__Comparator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4735:1: ( rule__Comparator__Group_5__1__Impl )
            // InternalRpgindividual.g:4736:2: rule__Comparator__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparator__Group_5__1__Impl();

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
    // $ANTLR end "rule__Comparator__Group_5__1"


    // $ANTLR start "rule__Comparator__Group_5__1__Impl"
    // InternalRpgindividual.g:4742:1: rule__Comparator__Group_5__1__Impl : ( '!=' ) ;
    public final void rule__Comparator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4746:1: ( ( '!=' ) )
            // InternalRpgindividual.g:4747:1: ( '!=' )
            {
            // InternalRpgindividual.g:4747:1: ( '!=' )
            // InternalRpgindividual.g:4748:2: '!='
            {
             before(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__Comparator__Group_5__1__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalRpgindividual.g:4758:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4762:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalRpgindividual.g:4763:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

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
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalRpgindividual.g:4770:1: rule__Sum__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4774:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:4775:1: ( ruleMultiply )
            {
            // InternalRpgindividual.g:4775:1: ( ruleMultiply )
            // InternalRpgindividual.g:4776:2: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0()); 

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
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalRpgindividual.g:4785:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4789:1: ( rule__Sum__Group__1__Impl )
            // InternalRpgindividual.g:4790:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

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
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalRpgindividual.g:4796:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4800:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalRpgindividual.g:4801:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4801:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalRpgindividual.g:4802:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalRpgindividual.g:4803:2: ( rule__Sum__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=47 && LA32_0<=48)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRpgindividual.g:4803:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSumAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalRpgindividual.g:4812:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4816:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalRpgindividual.g:4817:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

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
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalRpgindividual.g:4824:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4828:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:4829:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:4829:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalRpgindividual.g:4830:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:4831:2: ( rule__Sum__Alternatives_1_0 )
            // InternalRpgindividual.g:4831:3: rule__Sum__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalRpgindividual.g:4839:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4843:1: ( rule__Sum__Group_1__1__Impl )
            // InternalRpgindividual.g:4844:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalRpgindividual.g:4850:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4854:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:4855:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:4855:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:4856:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:4857:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalRpgindividual.g:4857:3: rule__Sum__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__0"
    // InternalRpgindividual.g:4866:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4870:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalRpgindividual.g:4871:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1();

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
    // $ANTLR end "rule__Sum__Group_1_0_0__0"


    // $ANTLR start "rule__Sum__Group_1_0_0__0__Impl"
    // InternalRpgindividual.g:4878:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4882:1: ( ( '+' ) )
            // InternalRpgindividual.g:4883:1: ( '+' )
            {
            // InternalRpgindividual.g:4883:1: ( '+' )
            // InternalRpgindividual.g:4884:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 

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
    // $ANTLR end "rule__Sum__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__1"
    // InternalRpgindividual.g:4893:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4897:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:4898:2: rule__Sum__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1_0_0__1"


    // $ANTLR start "rule__Sum__Group_1_0_0__1__Impl"
    // InternalRpgindividual.g:4904:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4908:1: ( ( () ) )
            // InternalRpgindividual.g:4909:1: ( () )
            {
            // InternalRpgindividual.g:4909:1: ( () )
            // InternalRpgindividual.g:4910:2: ()
            {
             before(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:4911:2: ()
            // InternalRpgindividual.g:4911:3: 
            {
            }

             after(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__0"
    // InternalRpgindividual.g:4920:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4924:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalRpgindividual.g:4925:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1();

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
    // $ANTLR end "rule__Sum__Group_1_0_1__0"


    // $ANTLR start "rule__Sum__Group_1_0_1__0__Impl"
    // InternalRpgindividual.g:4932:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4936:1: ( ( '-' ) )
            // InternalRpgindividual.g:4937:1: ( '-' )
            {
            // InternalRpgindividual.g:4937:1: ( '-' )
            // InternalRpgindividual.g:4938:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__Sum__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__1"
    // InternalRpgindividual.g:4947:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4951:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:4952:2: rule__Sum__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Sum__Group_1_0_1__1"


    // $ANTLR start "rule__Sum__Group_1_0_1__1__Impl"
    // InternalRpgindividual.g:4958:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4962:1: ( ( () ) )
            // InternalRpgindividual.g:4963:1: ( () )
            {
            // InternalRpgindividual.g:4963:1: ( () )
            // InternalRpgindividual.g:4964:2: ()
            {
             before(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:4965:2: ()
            // InternalRpgindividual.g:4965:3: 
            {
            }

             after(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group__0"
    // InternalRpgindividual.g:4974:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4978:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalRpgindividual.g:4979:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Multiply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1();

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
    // $ANTLR end "rule__Multiply__Group__0"


    // $ANTLR start "rule__Multiply__Group__0__Impl"
    // InternalRpgindividual.g:4986:1: rule__Multiply__Group__0__Impl : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4990:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:4991:1: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:4991:1: ( ruleAtomicNumber )
            // InternalRpgindividual.g:4992:2: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiply__Group__0__Impl"


    // $ANTLR start "rule__Multiply__Group__1"
    // InternalRpgindividual.g:5001:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5005:1: ( rule__Multiply__Group__1__Impl )
            // InternalRpgindividual.g:5006:2: rule__Multiply__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group__1"


    // $ANTLR start "rule__Multiply__Group__1__Impl"
    // InternalRpgindividual.g:5012:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5016:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalRpgindividual.g:5017:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalRpgindividual.g:5017:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalRpgindividual.g:5018:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalRpgindividual.g:5019:2: ( rule__Multiply__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=49 && LA33_0<=50)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRpgindividual.g:5019:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Multiply__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMultiplyAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiply__Group__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1__0"
    // InternalRpgindividual.g:5028:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5032:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalRpgindividual.g:5033:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Multiply__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1();

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
    // $ANTLR end "rule__Multiply__Group_1__0"


    // $ANTLR start "rule__Multiply__Group_1__0__Impl"
    // InternalRpgindividual.g:5040:1: rule__Multiply__Group_1__0__Impl : ( ( rule__Multiply__Alternatives_1_0 ) ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5044:1: ( ( ( rule__Multiply__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:5045:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:5045:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            // InternalRpgindividual.g:5046:2: ( rule__Multiply__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:5047:2: ( rule__Multiply__Alternatives_1_0 )
            // InternalRpgindividual.g:5047:3: rule__Multiply__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Multiply__Group_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1__1"
    // InternalRpgindividual.g:5055:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5059:1: ( rule__Multiply__Group_1__1__Impl )
            // InternalRpgindividual.g:5060:2: rule__Multiply__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1__1"


    // $ANTLR start "rule__Multiply__Group_1__1__Impl"
    // InternalRpgindividual.g:5066:1: rule__Multiply__Group_1__1__Impl : ( ( rule__Multiply__RightAssignment_1_1 ) ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5070:1: ( ( ( rule__Multiply__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:5071:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:5071:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:5072:2: ( rule__Multiply__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:5073:2: ( rule__Multiply__RightAssignment_1_1 )
            // InternalRpgindividual.g:5073:3: rule__Multiply__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiply__Group_1__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0"
    // InternalRpgindividual.g:5082:1: rule__Multiply__Group_1_0_0__0 : rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 ;
    public final void rule__Multiply__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5086:1: ( rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 )
            // InternalRpgindividual.g:5087:2: rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiply__Group_1_0_0__0"


    // $ANTLR start "rule__Multiply__Group_1_0_0__0__Impl"
    // InternalRpgindividual.g:5094:1: rule__Multiply__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Multiply__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5098:1: ( ( '*' ) )
            // InternalRpgindividual.g:5099:1: ( '*' )
            {
            // InternalRpgindividual.g:5099:1: ( '*' )
            // InternalRpgindividual.g:5100:2: '*'
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 

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
    // $ANTLR end "rule__Multiply__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1"
    // InternalRpgindividual.g:5109:1: rule__Multiply__Group_1_0_0__1 : rule__Multiply__Group_1_0_0__1__Impl ;
    public final void rule__Multiply__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5113:1: ( rule__Multiply__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:5114:2: rule__Multiply__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1_0_0__1"


    // $ANTLR start "rule__Multiply__Group_1_0_0__1__Impl"
    // InternalRpgindividual.g:5120:1: rule__Multiply__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5124:1: ( ( () ) )
            // InternalRpgindividual.g:5125:1: ( () )
            {
            // InternalRpgindividual.g:5125:1: ( () )
            // InternalRpgindividual.g:5126:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:5127:2: ()
            // InternalRpgindividual.g:5127:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0"
    // InternalRpgindividual.g:5136:1: rule__Multiply__Group_1_0_1__0 : rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 ;
    public final void rule__Multiply__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5140:1: ( rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 )
            // InternalRpgindividual.g:5141:2: rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Multiply__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiply__Group_1_0_1__0"


    // $ANTLR start "rule__Multiply__Group_1_0_1__0__Impl"
    // InternalRpgindividual.g:5148:1: rule__Multiply__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Multiply__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5152:1: ( ( '/' ) )
            // InternalRpgindividual.g:5153:1: ( '/' )
            {
            // InternalRpgindividual.g:5153:1: ( '/' )
            // InternalRpgindividual.g:5154:2: '/'
            {
             before(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0()); 

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
    // $ANTLR end "rule__Multiply__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1"
    // InternalRpgindividual.g:5163:1: rule__Multiply__Group_1_0_1__1 : rule__Multiply__Group_1_0_1__1__Impl ;
    public final void rule__Multiply__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5167:1: ( rule__Multiply__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:5168:2: rule__Multiply__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiply__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiply__Group_1_0_1__1"


    // $ANTLR start "rule__Multiply__Group_1_0_1__1__Impl"
    // InternalRpgindividual.g:5174:1: rule__Multiply__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5178:1: ( ( () ) )
            // InternalRpgindividual.g:5179:1: ( () )
            {
            // InternalRpgindividual.g:5179:1: ( () )
            // InternalRpgindividual.g:5180:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:5181:2: ()
            // InternalRpgindividual.g:5181:3: 
            {
            }

             after(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiply__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__0"
    // InternalRpgindividual.g:5190:1: rule__FloatNum__Group__0 : rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 ;
    public final void rule__FloatNum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5194:1: ( rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 )
            // InternalRpgindividual.g:5195:2: rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__FloatNum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__1();

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
    // $ANTLR end "rule__FloatNum__Group__0"


    // $ANTLR start "rule__FloatNum__Group__0__Impl"
    // InternalRpgindividual.g:5202:1: rule__FloatNum__Group__0__Impl : ( ( rule__FloatNum__IAssignment_0 ) ) ;
    public final void rule__FloatNum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5206:1: ( ( ( rule__FloatNum__IAssignment_0 ) ) )
            // InternalRpgindividual.g:5207:1: ( ( rule__FloatNum__IAssignment_0 ) )
            {
            // InternalRpgindividual.g:5207:1: ( ( rule__FloatNum__IAssignment_0 ) )
            // InternalRpgindividual.g:5208:2: ( rule__FloatNum__IAssignment_0 )
            {
             before(grammarAccess.getFloatNumAccess().getIAssignment_0()); 
            // InternalRpgindividual.g:5209:2: ( rule__FloatNum__IAssignment_0 )
            // InternalRpgindividual.g:5209:3: rule__FloatNum__IAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__IAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getIAssignment_0()); 

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
    // $ANTLR end "rule__FloatNum__Group__0__Impl"


    // $ANTLR start "rule__FloatNum__Group__1"
    // InternalRpgindividual.g:5217:1: rule__FloatNum__Group__1 : rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 ;
    public final void rule__FloatNum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5221:1: ( rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 )
            // InternalRpgindividual.g:5222:2: rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__FloatNum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2();

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
    // $ANTLR end "rule__FloatNum__Group__1"


    // $ANTLR start "rule__FloatNum__Group__1__Impl"
    // InternalRpgindividual.g:5229:1: rule__FloatNum__Group__1__Impl : ( '.' ) ;
    public final void rule__FloatNum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5233:1: ( ( '.' ) )
            // InternalRpgindividual.g:5234:1: ( '.' )
            {
            // InternalRpgindividual.g:5234:1: ( '.' )
            // InternalRpgindividual.g:5235:2: '.'
            {
             before(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__FloatNum__Group__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__2"
    // InternalRpgindividual.g:5244:1: rule__FloatNum__Group__2 : rule__FloatNum__Group__2__Impl ;
    public final void rule__FloatNum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5248:1: ( rule__FloatNum__Group__2__Impl )
            // InternalRpgindividual.g:5249:2: rule__FloatNum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__Group__2__Impl();

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
    // $ANTLR end "rule__FloatNum__Group__2"


    // $ANTLR start "rule__FloatNum__Group__2__Impl"
    // InternalRpgindividual.g:5255:1: rule__FloatNum__Group__2__Impl : ( ( rule__FloatNum__DecimalAssignment_2 ) ) ;
    public final void rule__FloatNum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5259:1: ( ( ( rule__FloatNum__DecimalAssignment_2 ) ) )
            // InternalRpgindividual.g:5260:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            {
            // InternalRpgindividual.g:5260:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            // InternalRpgindividual.g:5261:2: ( rule__FloatNum__DecimalAssignment_2 )
            {
             before(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 
            // InternalRpgindividual.g:5262:2: ( rule__FloatNum__DecimalAssignment_2 )
            // InternalRpgindividual.g:5262:3: rule__FloatNum__DecimalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FloatNum__DecimalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 

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
    // $ANTLR end "rule__FloatNum__Group__2__Impl"


    // $ANTLR start "rule__SystemRPG__NameAssignment_1"
    // InternalRpgindividual.g:5271:1: rule__SystemRPG__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRPG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5275:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5276:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5276:2: ( RULE_ID )
            // InternalRpgindividual.g:5277:3: RULE_ID
            {
             before(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SystemRPG__NameAssignment_1"


    // $ANTLR start "rule__SystemRPG__DeclarationsAssignment_2"
    // InternalRpgindividual.g:5286:1: rule__SystemRPG__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__SystemRPG__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5290:1: ( ( ruleDeclaration ) )
            // InternalRpgindividual.g:5291:2: ( ruleDeclaration )
            {
            // InternalRpgindividual.g:5291:2: ( ruleDeclaration )
            // InternalRpgindividual.g:5292:3: ruleDeclaration
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SystemRPG__DeclarationsAssignment_2"


    // $ANTLR start "rule__Effects__EffectAssignment_1"
    // InternalRpgindividual.g:5301:1: rule__Effects__EffectAssignment_1 : ( ruleEffect ) ;
    public final void rule__Effects__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5305:1: ( ( ruleEffect ) )
            // InternalRpgindividual.g:5306:2: ( ruleEffect )
            {
            // InternalRpgindividual.g:5306:2: ( ruleEffect )
            // InternalRpgindividual.g:5307:3: ruleEffect
            {
             before(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEffect();

            state._fsp--;

             after(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Effects__EffectAssignment_1"


    // $ANTLR start "rule__Buff__NameAssignment_1"
    // InternalRpgindividual.g:5316:1: rule__Buff__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Buff__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5320:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5321:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5321:2: ( RULE_ID )
            // InternalRpgindividual.g:5322:3: RULE_ID
            {
             before(grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBuffAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Buff__NameAssignment_1"


    // $ANTLR start "rule__Buff__RuleAssignment_2"
    // InternalRpgindividual.g:5331:1: rule__Buff__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Buff__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5335:1: ( ( ruleRule ) )
            // InternalRpgindividual.g:5336:2: ( ruleRule )
            {
            // InternalRpgindividual.g:5336:2: ( ruleRule )
            // InternalRpgindividual.g:5337:3: ruleRule
            {
             before(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getBuffAccess().getRuleRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Buff__RuleAssignment_2"


    // $ANTLR start "rule__MoveE__NameAssignment_1"
    // InternalRpgindividual.g:5346:1: rule__MoveE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MoveE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5350:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5351:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5351:2: ( RULE_ID )
            // InternalRpgindividual.g:5352:3: RULE_ID
            {
             before(grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MoveE__NameAssignment_1"


    // $ANTLR start "rule__MoveE__RuleAssignment_2"
    // InternalRpgindividual.g:5361:1: rule__MoveE__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__MoveE__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5365:1: ( ( ruleRule ) )
            // InternalRpgindividual.g:5366:2: ( ruleRule )
            {
            // InternalRpgindividual.g:5366:2: ( ruleRule )
            // InternalRpgindividual.g:5367:3: ruleRule
            {
             before(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MoveE__RuleAssignment_2"


    // $ANTLR start "rule__AfterE__NameAssignment_1"
    // InternalRpgindividual.g:5376:1: rule__AfterE__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AfterE__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5380:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5381:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5381:2: ( RULE_ID )
            // InternalRpgindividual.g:5382:3: RULE_ID
            {
             before(grammarAccess.getAfterEAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAfterEAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AfterE__NameAssignment_1"


    // $ANTLR start "rule__AfterE__RuleAssignment_2"
    // InternalRpgindividual.g:5391:1: rule__AfterE__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__AfterE__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5395:1: ( ( ruleRule ) )
            // InternalRpgindividual.g:5396:2: ( ruleRule )
            {
            // InternalRpgindividual.g:5396:2: ( ruleRule )
            // InternalRpgindividual.g:5397:3: ruleRule
            {
             before(grammarAccess.getAfterEAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getAfterEAccess().getRuleRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AfterE__RuleAssignment_2"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // InternalRpgindividual.g:5406:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5410:1: ( ( ruleAttribute ) )
            // InternalRpgindividual.g:5411:2: ( ruleAttribute )
            {
            // InternalRpgindividual.g:5411:2: ( ruleAttribute )
            // InternalRpgindividual.g:5412:3: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attributes__AttributeAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalRpgindividual.g:5421:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5425:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5426:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5426:2: ( RULE_ID )
            // InternalRpgindividual.g:5427:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__AValAssignment_2"
    // InternalRpgindividual.g:5436:1: rule__Attribute__AValAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__Attribute__AValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5440:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5441:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5441:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5442:3: ruleAttributeValues
            {
             before(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__AValAssignment_2"


    // $ANTLR start "rule__Locations__LocAssignment_1"
    // InternalRpgindividual.g:5451:1: rule__Locations__LocAssignment_1 : ( ruleLoc ) ;
    public final void rule__Locations__LocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5455:1: ( ( ruleLoc ) )
            // InternalRpgindividual.g:5456:2: ( ruleLoc )
            {
            // InternalRpgindividual.g:5456:2: ( ruleLoc )
            // InternalRpgindividual.g:5457:3: ruleLoc
            {
             before(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoc();

            state._fsp--;

             after(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Locations__LocAssignment_1"


    // $ANTLR start "rule__Loc__NameAssignment_0"
    // InternalRpgindividual.g:5466:1: rule__Loc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Loc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5470:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5471:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5471:2: ( RULE_ID )
            // InternalRpgindividual.g:5472:3: RULE_ID
            {
             before(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Loc__NameAssignment_0"


    // $ANTLR start "rule__Loc__TeamAssignment_2"
    // InternalRpgindividual.g:5481:1: rule__Loc__TeamAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Loc__TeamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5485:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5486:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5486:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5487:3: ( RULE_ID )
            {
             before(grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0()); 
            // InternalRpgindividual.g:5488:3: ( RULE_ID )
            // InternalRpgindividual.g:5489:4: RULE_ID
            {
             before(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocAccess().getTeamTeamIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0()); 

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
    // $ANTLR end "rule__Loc__TeamAssignment_2"


    // $ANTLR start "rule__Relations__TypeAssignment_1"
    // InternalRpgindividual.g:5500:1: rule__Relations__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Relations__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5504:1: ( ( ruleType ) )
            // InternalRpgindividual.g:5505:2: ( ruleType )
            {
            // InternalRpgindividual.g:5505:2: ( ruleType )
            // InternalRpgindividual.g:5506:3: ruleType
            {
             before(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Relations__TypeAssignment_1"


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalRpgindividual.g:5515:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5519:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5520:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5520:2: ( RULE_ID )
            // InternalRpgindividual.g:5521:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__Type__TExpressionAssignment_2"
    // InternalRpgindividual.g:5530:1: rule__Type__TExpressionAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__Type__TExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5534:1: ( ( ruleTypeExpression ) )
            // InternalRpgindividual.g:5535:2: ( ruleTypeExpression )
            {
            // InternalRpgindividual.g:5535:2: ( ruleTypeExpression )
            // InternalRpgindividual.g:5536:3: ruleTypeExpression
            {
             before(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeExpression();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type__TExpressionAssignment_2"


    // $ANTLR start "rule__TypeExpression__StrongAssignment_0"
    // InternalRpgindividual.g:5545:1: rule__TypeExpression__StrongAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__StrongAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5549:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5550:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5550:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5551:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0()); 
            // InternalRpgindividual.g:5552:3: ( RULE_ID )
            // InternalRpgindividual.g:5553:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrongTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0()); 

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
    // $ANTLR end "rule__TypeExpression__StrongAssignment_0"


    // $ANTLR start "rule__TypeExpression__Strong2Assignment_1_1"
    // InternalRpgindividual.g:5564:1: rule__TypeExpression__Strong2Assignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Strong2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5568:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5569:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5569:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5570:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0()); 
            // InternalRpgindividual.g:5571:3: ( RULE_ID )
            // InternalRpgindividual.g:5572:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__TypeExpression__Strong2Assignment_1_1"


    // $ANTLR start "rule__TypeExpression__CurrentTAssignment_3"
    // InternalRpgindividual.g:5583:1: rule__TypeExpression__CurrentTAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__CurrentTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5587:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5588:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5588:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5589:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0()); 
            // InternalRpgindividual.g:5590:3: ( RULE_ID )
            // InternalRpgindividual.g:5591:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getCurrentTTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__TypeExpression__CurrentTAssignment_3"


    // $ANTLR start "rule__TypeExpression__WeakAssignment_5"
    // InternalRpgindividual.g:5602:1: rule__TypeExpression__WeakAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__WeakAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5606:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5607:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5607:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5608:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0()); 
            // InternalRpgindividual.g:5609:3: ( RULE_ID )
            // InternalRpgindividual.g:5610:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeakTypeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0()); 

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
    // $ANTLR end "rule__TypeExpression__WeakAssignment_5"


    // $ANTLR start "rule__TypeExpression__Weak2Assignment_6_1"
    // InternalRpgindividual.g:5621:1: rule__TypeExpression__Weak2Assignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Weak2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5625:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5626:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5626:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5627:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0()); 
            // InternalRpgindividual.g:5628:3: ( RULE_ID )
            // InternalRpgindividual.g:5629:4: RULE_ID
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__TypeExpression__Weak2Assignment_6_1"


    // $ANTLR start "rule__Moves__MoveAssignment_1"
    // InternalRpgindividual.g:5640:1: rule__Moves__MoveAssignment_1 : ( ruleMove ) ;
    public final void rule__Moves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5644:1: ( ( ruleMove ) )
            // InternalRpgindividual.g:5645:2: ( ruleMove )
            {
            // InternalRpgindividual.g:5645:2: ( ruleMove )
            // InternalRpgindividual.g:5646:3: ruleMove
            {
             before(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Moves__MoveAssignment_1"


    // $ANTLR start "rule__Move__NameAssignment_1"
    // InternalRpgindividual.g:5655:1: rule__Move__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Move__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5659:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5660:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5660:2: ( RULE_ID )
            // InternalRpgindividual.g:5661:3: RULE_ID
            {
             before(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Move__NameAssignment_1"


    // $ANTLR start "rule__Move__ETypeAssignment_2"
    // InternalRpgindividual.g:5670:1: rule__Move__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Move__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5674:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5675:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5675:2: ( ruleEType )
            // InternalRpgindividual.g:5676:3: ruleEType
            {
             before(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Move__ETypeAssignment_2"


    // $ANTLR start "rule__Move__AttAssignment_3"
    // InternalRpgindividual.g:5685:1: rule__Move__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Move__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5689:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5690:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5690:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:5691:3: ruleAltAttribute
            {
             before(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Move__AttAssignment_3"


    // $ANTLR start "rule__Move__MEffectAssignment_4_0"
    // InternalRpgindividual.g:5700:1: rule__Move__MEffectAssignment_4_0 : ( ruleMEffect ) ;
    public final void rule__Move__MEffectAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5704:1: ( ( ruleMEffect ) )
            // InternalRpgindividual.g:5705:2: ( ruleMEffect )
            {
            // InternalRpgindividual.g:5705:2: ( ruleMEffect )
            // InternalRpgindividual.g:5706:3: ruleMEffect
            {
             before(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Move__MEffectAssignment_4_0"


    // $ANTLR start "rule__Move__BEffectAssignment_4_1"
    // InternalRpgindividual.g:5715:1: rule__Move__BEffectAssignment_4_1 : ( ruleBEffect ) ;
    public final void rule__Move__BEffectAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5719:1: ( ( ruleBEffect ) )
            // InternalRpgindividual.g:5720:2: ( ruleBEffect )
            {
            // InternalRpgindividual.g:5720:2: ( ruleBEffect )
            // InternalRpgindividual.g:5721:3: ruleBEffect
            {
             before(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getBEffectBEffectParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Move__BEffectAssignment_4_1"


    // $ANTLR start "rule__Move__AEffectAssignment_4_2"
    // InternalRpgindividual.g:5730:1: rule__Move__AEffectAssignment_4_2 : ( ruleAEffect ) ;
    public final void rule__Move__AEffectAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5734:1: ( ( ruleAEffect ) )
            // InternalRpgindividual.g:5735:2: ( ruleAEffect )
            {
            // InternalRpgindividual.g:5735:2: ( ruleAEffect )
            // InternalRpgindividual.g:5736:3: ruleAEffect
            {
             before(grammarAccess.getMoveAccess().getAEffectAEffectParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getAEffectAEffectParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Move__AEffectAssignment_4_2"


    // $ANTLR start "rule__MEffect__MoveENameAssignment_2"
    // InternalRpgindividual.g:5745:1: rule__MEffect__MoveENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MEffect__MoveENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5749:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5750:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5750:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5751:3: ( RULE_ID )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0()); 
            // InternalRpgindividual.g:5752:3: ( RULE_ID )
            // InternalRpgindividual.g:5753:4: RULE_ID
            {
             before(grammarAccess.getMEffectAccess().getMoveENameMoveEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveENameMoveEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0()); 

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
    // $ANTLR end "rule__MEffect__MoveENameAssignment_2"


    // $ANTLR start "rule__BEffect__BuffENameAssignment_2"
    // InternalRpgindividual.g:5764:1: rule__BEffect__BuffENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BEffect__BuffENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5768:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5769:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5769:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5770:3: ( RULE_ID )
            {
             before(grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0()); 
            // InternalRpgindividual.g:5771:3: ( RULE_ID )
            // InternalRpgindividual.g:5772:4: RULE_ID
            {
             before(grammarAccess.getBEffectAccess().getBuffENameBuffIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBEffectAccess().getBuffENameBuffIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBEffectAccess().getBuffENameBuffCrossReference_2_0()); 

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
    // $ANTLR end "rule__BEffect__BuffENameAssignment_2"


    // $ANTLR start "rule__AEffect__AfterENameAssignment_2"
    // InternalRpgindividual.g:5783:1: rule__AEffect__AfterENameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AEffect__AfterENameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5787:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5788:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5788:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5789:3: ( RULE_ID )
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAfterECrossReference_2_0()); 
            // InternalRpgindividual.g:5790:3: ( RULE_ID )
            // InternalRpgindividual.g:5791:4: RULE_ID
            {
             before(grammarAccess.getAEffectAccess().getAfterENameAfterEIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAEffectAccess().getAfterENameAfterEIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAEffectAccess().getAfterENameAfterECrossReference_2_0()); 

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
    // $ANTLR end "rule__AEffect__AfterENameAssignment_2"


    // $ANTLR start "rule__EType__TypeAssignment_1"
    // InternalRpgindividual.g:5802:1: rule__EType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5806:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5807:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5807:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5808:3: ( RULE_ID )
            {
             before(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 
            // InternalRpgindividual.g:5809:3: ( RULE_ID )
            // InternalRpgindividual.g:5810:4: RULE_ID
            {
             before(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getETypeAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 

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
    // $ANTLR end "rule__EType__TypeAssignment_1"


    // $ANTLR start "rule__AttributeValues__LTypesAssignment_1_0"
    // InternalRpgindividual.g:5821:1: rule__AttributeValues__LTypesAssignment_1_0 : ( ruleLegalType ) ;
    public final void rule__AttributeValues__LTypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5825:1: ( ( ruleLegalType ) )
            // InternalRpgindividual.g:5826:2: ( ruleLegalType )
            {
            // InternalRpgindividual.g:5826:2: ( ruleLegalType )
            // InternalRpgindividual.g:5827:3: ruleLegalType
            {
             before(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLegalType();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__AttributeValues__LTypesAssignment_1_0"


    // $ANTLR start "rule__AttributeValues__AnAssignment_1_1"
    // InternalRpgindividual.g:5836:1: rule__AttributeValues__AnAssignment_1_1 : ( ruleActualNumbers ) ;
    public final void rule__AttributeValues__AnAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5840:1: ( ( ruleActualNumbers ) )
            // InternalRpgindividual.g:5841:2: ( ruleActualNumbers )
            {
            // InternalRpgindividual.g:5841:2: ( ruleActualNumbers )
            // InternalRpgindividual.g:5842:3: ruleActualNumbers
            {
             before(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActualNumbers();

            state._fsp--;

             after(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AttributeValues__AnAssignment_1_1"


    // $ANTLR start "rule__AltAttribute__AttributeAssignment_1"
    // InternalRpgindividual.g:5851:1: rule__AltAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AltAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5855:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5856:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5856:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5857:3: ( RULE_ID )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:5858:3: ( RULE_ID )
            // InternalRpgindividual.g:5859:4: RULE_ID
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 

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
    // $ANTLR end "rule__AltAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__AltAttribute__AvAssignment_2"
    // InternalRpgindividual.g:5870:1: rule__AltAttribute__AvAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__AltAttribute__AvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5874:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5875:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5875:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5876:3: ruleAttributeValues
            {
             before(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeValues();

            state._fsp--;

             after(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AltAttribute__AvAssignment_2"


    // $ANTLR start "rule__Rule__OrAssignment_0_1"
    // InternalRpgindividual.g:5885:1: rule__Rule__OrAssignment_0_1 : ( ruleORcondition ) ;
    public final void rule__Rule__OrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5889:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:5890:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:5890:2: ( ruleORcondition )
            // InternalRpgindividual.g:5891:3: ruleORcondition
            {
             before(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Rule__OrAssignment_0_1"


    // $ANTLR start "rule__Rule__TargetAssignment_1"
    // InternalRpgindividual.g:5900:1: rule__Rule__TargetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5904:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5905:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5905:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5906:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:5907:3: ( RULE_ID )
            // InternalRpgindividual.g:5908:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetAttributeCrossReference_1_0()); 

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
    // $ANTLR end "rule__Rule__TargetAssignment_1"


    // $ANTLR start "rule__Rule__SumAssignment_3"
    // InternalRpgindividual.g:5919:1: rule__Rule__SumAssignment_3 : ( ruleSum ) ;
    public final void rule__Rule__SumAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5923:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5924:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5924:2: ( ruleSum )
            // InternalRpgindividual.g:5925:3: ruleSum
            {
             before(grammarAccess.getRuleAccess().getSumSumParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSumSumParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__SumAssignment_3"


    // $ANTLR start "rule__Entities__EntityAssignment_1"
    // InternalRpgindividual.g:5934:1: rule__Entities__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Entities__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5938:1: ( ( ruleEntity ) )
            // InternalRpgindividual.g:5939:2: ( ruleEntity )
            {
            // InternalRpgindividual.g:5939:2: ( ruleEntity )
            // InternalRpgindividual.g:5940:3: ruleEntity
            {
             before(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entities__EntityAssignment_1"


    // $ANTLR start "rule__Death__ReqAssignment_1"
    // InternalRpgindividual.g:5949:1: rule__Death__ReqAssignment_1 : ( ruleRequire ) ;
    public final void rule__Death__ReqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5953:1: ( ( ruleRequire ) )
            // InternalRpgindividual.g:5954:2: ( ruleRequire )
            {
            // InternalRpgindividual.g:5954:2: ( ruleRequire )
            // InternalRpgindividual.g:5955:3: ruleRequire
            {
             before(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Death__ReqAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRpgindividual.g:5964:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5968:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5969:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5969:2: ( RULE_ID )
            // InternalRpgindividual.g:5970:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ETypeAssignment_2"
    // InternalRpgindividual.g:5979:1: rule__Entity__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Entity__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5983:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5984:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5984:2: ( ruleEType )
            // InternalRpgindividual.g:5985:3: ruleEType
            {
             before(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEType();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__ETypeAssignment_2"


    // $ANTLR start "rule__Entity__AttAssignment_3"
    // InternalRpgindividual.g:5994:1: rule__Entity__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Entity__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5998:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5999:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5999:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:6000:3: ruleAltAttribute
            {
             before(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAltAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__AttAssignment_3"


    // $ANTLR start "rule__Entity__EMovesAssignment_4"
    // InternalRpgindividual.g:6009:1: rule__Entity__EMovesAssignment_4 : ( ruleEntityMoves ) ;
    public final void rule__Entity__EMovesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6013:1: ( ( ruleEntityMoves ) )
            // InternalRpgindividual.g:6014:2: ( ruleEntityMoves )
            {
            // InternalRpgindividual.g:6014:2: ( ruleEntityMoves )
            // InternalRpgindividual.g:6015:3: ruleEntityMoves
            {
             before(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoves();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__EMovesAssignment_4"


    // $ANTLR start "rule__EntityMoves__MoveAssignment_1"
    // InternalRpgindividual.g:6024:1: rule__EntityMoves__MoveAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6028:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:6029:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:6029:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:6030:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0()); 
            // InternalRpgindividual.g:6031:3: ( RULE_ID )
            // InternalRpgindividual.g:6032:4: RULE_ID
            {
             before(grammarAccess.getEntityMovesAccess().getMoveMoveIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMovesAccess().getMoveMoveIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0()); 

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
    // $ANTLR end "rule__EntityMoves__MoveAssignment_1"


    // $ANTLR start "rule__Teams__TeamAssignment_1"
    // InternalRpgindividual.g:6043:1: rule__Teams__TeamAssignment_1 : ( ruleTeam ) ;
    public final void rule__Teams__TeamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6047:1: ( ( ruleTeam ) )
            // InternalRpgindividual.g:6048:2: ( ruleTeam )
            {
            // InternalRpgindividual.g:6048:2: ( ruleTeam )
            // InternalRpgindividual.g:6049:3: ruleTeam
            {
             before(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTeam();

            state._fsp--;

             after(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Teams__TeamAssignment_1"


    // $ANTLR start "rule__Team__NameAssignment_1"
    // InternalRpgindividual.g:6058:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6062:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:6063:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:6063:2: ( RULE_ID )
            // InternalRpgindividual.g:6064:3: RULE_ID
            {
             before(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Team__NameAssignment_1"


    // $ANTLR start "rule__Team__MembersAssignment_2"
    // InternalRpgindividual.g:6073:1: rule__Team__MembersAssignment_2 : ( ruleMembers ) ;
    public final void rule__Team__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6077:1: ( ( ruleMembers ) )
            // InternalRpgindividual.g:6078:2: ( ruleMembers )
            {
            // InternalRpgindividual.g:6078:2: ( ruleMembers )
            // InternalRpgindividual.g:6079:3: ruleMembers
            {
             before(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMembers();

            state._fsp--;

             after(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Team__MembersAssignment_2"


    // $ANTLR start "rule__Members__EntityAssignment_1"
    // InternalRpgindividual.g:6088:1: rule__Members__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Members__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6092:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:6093:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:6093:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:6094:3: ( RULE_ID )
            {
             before(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 
            // InternalRpgindividual.g:6095:3: ( RULE_ID )
            // InternalRpgindividual.g:6096:4: RULE_ID
            {
             before(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMembersAccess().getEntityEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Members__EntityAssignment_1"


    // $ANTLR start "rule__Require__LogAssignment_1"
    // InternalRpgindividual.g:6107:1: rule__Require__LogAssignment_1 : ( ruleORcondition ) ;
    public final void rule__Require__LogAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6111:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:6112:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:6112:2: ( ruleORcondition )
            // InternalRpgindividual.g:6113:3: ruleORcondition
            {
             before(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Require__LogAssignment_1"


    // $ANTLR start "rule__ORcondition__RightAssignment_1_2"
    // InternalRpgindividual.g:6122:1: rule__ORcondition__RightAssignment_1_2 : ( ruleANDcondition ) ;
    public final void rule__ORcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6126:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:6127:2: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:6127:2: ( ruleANDcondition )
            // InternalRpgindividual.g:6128:3: ruleANDcondition
            {
             before(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleANDcondition();

            state._fsp--;

             after(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ORcondition__RightAssignment_1_2"


    // $ANTLR start "rule__ANDcondition__RightAssignment_1_2"
    // InternalRpgindividual.g:6137:1: rule__ANDcondition__RightAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__ANDcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6141:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:6142:2: ( ruleStatement )
            {
            // InternalRpgindividual.g:6142:2: ( ruleStatement )
            // InternalRpgindividual.g:6143:3: ruleStatement
            {
             before(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__ANDcondition__RightAssignment_1_2"


    // $ANTLR start "rule__NumberComparing__LeftAssignment_0"
    // InternalRpgindividual.g:6152:1: rule__NumberComparing__LeftAssignment_0 : ( ruleSum ) ;
    public final void rule__NumberComparing__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6156:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:6157:2: ( ruleSum )
            {
            // InternalRpgindividual.g:6157:2: ( ruleSum )
            // InternalRpgindividual.g:6158:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberComparing__LeftAssignment_0"


    // $ANTLR start "rule__NumberComparing__CompAssignment_1"
    // InternalRpgindividual.g:6167:1: rule__NumberComparing__CompAssignment_1 : ( ruleComparator ) ;
    public final void rule__NumberComparing__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6171:1: ( ( ruleComparator ) )
            // InternalRpgindividual.g:6172:2: ( ruleComparator )
            {
            // InternalRpgindividual.g:6172:2: ( ruleComparator )
            // InternalRpgindividual.g:6173:3: ruleComparator
            {
             before(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparator();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberComparing__CompAssignment_1"


    // $ANTLR start "rule__NumberComparing__RightAssignment_2"
    // InternalRpgindividual.g:6182:1: rule__NumberComparing__RightAssignment_2 : ( ruleSum ) ;
    public final void rule__NumberComparing__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6186:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:6187:2: ( ruleSum )
            {
            // InternalRpgindividual.g:6187:2: ( ruleSum )
            // InternalRpgindividual.g:6188:3: ruleSum
            {
             before(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NumberComparing__RightAssignment_2"


    // $ANTLR start "rule__Sum__RightAssignment_1_1"
    // InternalRpgindividual.g:6197:1: rule__Sum__RightAssignment_1_1 : ( ruleMultiply ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6201:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:6202:2: ( ruleMultiply )
            {
            // InternalRpgindividual.g:6202:2: ( ruleMultiply )
            // InternalRpgindividual.g:6203:3: ruleMultiply
            {
             before(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiply();

            state._fsp--;

             after(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Sum__RightAssignment_1_1"


    // $ANTLR start "rule__Multiply__RightAssignment_1_1"
    // InternalRpgindividual.g:6212:1: rule__Multiply__RightAssignment_1_1 : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6216:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:6217:2: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:6217:2: ( ruleAtomicNumber )
            // InternalRpgindividual.g:6218:3: ruleAtomicNumber
            {
             before(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicNumber();

            state._fsp--;

             after(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Multiply__RightAssignment_1_1"


    // $ANTLR start "rule__NameAttribute__AttributeAssignment"
    // InternalRpgindividual.g:6227:1: rule__NameAttribute__AttributeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NameAttribute__AttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6231:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:6232:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:6232:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:6233:3: ( RULE_ID )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0()); 
            // InternalRpgindividual.g:6234:3: ( RULE_ID )
            // InternalRpgindividual.g:6235:4: RULE_ID
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_0()); 

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
    // $ANTLR end "rule__NameAttribute__AttributeAssignment"


    // $ANTLR start "rule__IntNum__ValueAssignment"
    // InternalRpgindividual.g:6246:1: rule__IntNum__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntNum__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6250:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6251:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6251:2: ( RULE_INT )
            // InternalRpgindividual.g:6252:3: RULE_INT
            {
             before(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__IntNum__ValueAssignment"


    // $ANTLR start "rule__FloatNum__IAssignment_0"
    // InternalRpgindividual.g:6261:1: rule__FloatNum__IAssignment_0 : ( RULE_INT ) ;
    public final void rule__FloatNum__IAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6265:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6266:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6266:2: ( RULE_INT )
            // InternalRpgindividual.g:6267:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FloatNum__IAssignment_0"


    // $ANTLR start "rule__FloatNum__DecimalAssignment_2"
    // InternalRpgindividual.g:6276:1: rule__FloatNum__DecimalAssignment_2 : ( RULE_INT ) ;
    public final void rule__FloatNum__DecimalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:6280:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:6281:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:6281:2: ( RULE_INT )
            // InternalRpgindividual.g:6282:3: RULE_INT
            {
             before(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FloatNum__DecimalAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000588A84000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000588A84002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001820L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000001830L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00007C0002000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000020L});

}