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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'User'", "'Enemy'", "'Float'", "'Integer'", "'game'", "'effects'", "'effect'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "'<'", "','", "'moves'", "'move'", "'is'", "'if'", "'then'", "'entities'", "'death'", "'when'", "'entity'", "'('", "')'", "'*'", "'teams'", "'team'", "'members'", "'OR'", "'AND'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'/'", "'.'"
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


    // $ANTLR start "entryRuleAttributes"
    // InternalRpgindividual.g:153:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // InternalRpgindividual.g:154:1: ( ruleAttributes EOF )
            // InternalRpgindividual.g:155:1: ruleAttributes EOF
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
    // InternalRpgindividual.g:162:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:166:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // InternalRpgindividual.g:167:2: ( ( rule__Attributes__Group__0 ) )
            {
            // InternalRpgindividual.g:167:2: ( ( rule__Attributes__Group__0 ) )
            // InternalRpgindividual.g:168:3: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // InternalRpgindividual.g:169:3: ( rule__Attributes__Group__0 )
            // InternalRpgindividual.g:169:4: rule__Attributes__Group__0
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
    // InternalRpgindividual.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:179:1: ( ruleAttribute EOF )
            // InternalRpgindividual.g:180:1: ruleAttribute EOF
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
    // InternalRpgindividual.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalRpgindividual.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalRpgindividual.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalRpgindividual.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:194:3: ( rule__Attribute__Group__0 )
            // InternalRpgindividual.g:194:4: rule__Attribute__Group__0
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
    // InternalRpgindividual.g:203:1: entryRuleLocations : ruleLocations EOF ;
    public final void entryRuleLocations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:204:1: ( ruleLocations EOF )
            // InternalRpgindividual.g:205:1: ruleLocations EOF
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
    // InternalRpgindividual.g:212:1: ruleLocations : ( ( rule__Locations__Group__0 ) ) ;
    public final void ruleLocations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:216:2: ( ( ( rule__Locations__Group__0 ) ) )
            // InternalRpgindividual.g:217:2: ( ( rule__Locations__Group__0 ) )
            {
            // InternalRpgindividual.g:217:2: ( ( rule__Locations__Group__0 ) )
            // InternalRpgindividual.g:218:3: ( rule__Locations__Group__0 )
            {
             before(grammarAccess.getLocationsAccess().getGroup()); 
            // InternalRpgindividual.g:219:3: ( rule__Locations__Group__0 )
            // InternalRpgindividual.g:219:4: rule__Locations__Group__0
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
    // InternalRpgindividual.g:228:1: entryRuleLoc : ruleLoc EOF ;
    public final void entryRuleLoc() throws RecognitionException {
        try {
            // InternalRpgindividual.g:229:1: ( ruleLoc EOF )
            // InternalRpgindividual.g:230:1: ruleLoc EOF
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
    // InternalRpgindividual.g:237:1: ruleLoc : ( ( rule__Loc__Group__0 ) ) ;
    public final void ruleLoc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:241:2: ( ( ( rule__Loc__Group__0 ) ) )
            // InternalRpgindividual.g:242:2: ( ( rule__Loc__Group__0 ) )
            {
            // InternalRpgindividual.g:242:2: ( ( rule__Loc__Group__0 ) )
            // InternalRpgindividual.g:243:3: ( rule__Loc__Group__0 )
            {
             before(grammarAccess.getLocAccess().getGroup()); 
            // InternalRpgindividual.g:244:3: ( rule__Loc__Group__0 )
            // InternalRpgindividual.g:244:4: rule__Loc__Group__0
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
    // InternalRpgindividual.g:253:1: entryRuleRelations : ruleRelations EOF ;
    public final void entryRuleRelations() throws RecognitionException {
        try {
            // InternalRpgindividual.g:254:1: ( ruleRelations EOF )
            // InternalRpgindividual.g:255:1: ruleRelations EOF
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
    // InternalRpgindividual.g:262:1: ruleRelations : ( ( rule__Relations__Group__0 ) ) ;
    public final void ruleRelations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:266:2: ( ( ( rule__Relations__Group__0 ) ) )
            // InternalRpgindividual.g:267:2: ( ( rule__Relations__Group__0 ) )
            {
            // InternalRpgindividual.g:267:2: ( ( rule__Relations__Group__0 ) )
            // InternalRpgindividual.g:268:3: ( rule__Relations__Group__0 )
            {
             before(grammarAccess.getRelationsAccess().getGroup()); 
            // InternalRpgindividual.g:269:3: ( rule__Relations__Group__0 )
            // InternalRpgindividual.g:269:4: rule__Relations__Group__0
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
    // InternalRpgindividual.g:278:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:279:1: ( ruleType EOF )
            // InternalRpgindividual.g:280:1: ruleType EOF
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
    // InternalRpgindividual.g:287:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:291:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalRpgindividual.g:292:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalRpgindividual.g:292:2: ( ( rule__Type__Group__0 ) )
            // InternalRpgindividual.g:293:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalRpgindividual.g:294:3: ( rule__Type__Group__0 )
            // InternalRpgindividual.g:294:4: rule__Type__Group__0
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
    // InternalRpgindividual.g:303:1: entryRuleTypeExpression : ruleTypeExpression EOF ;
    public final void entryRuleTypeExpression() throws RecognitionException {
        try {
            // InternalRpgindividual.g:304:1: ( ruleTypeExpression EOF )
            // InternalRpgindividual.g:305:1: ruleTypeExpression EOF
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
    // InternalRpgindividual.g:312:1: ruleTypeExpression : ( ( rule__TypeExpression__Group__0 ) ) ;
    public final void ruleTypeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:316:2: ( ( ( rule__TypeExpression__Group__0 ) ) )
            // InternalRpgindividual.g:317:2: ( ( rule__TypeExpression__Group__0 ) )
            {
            // InternalRpgindividual.g:317:2: ( ( rule__TypeExpression__Group__0 ) )
            // InternalRpgindividual.g:318:3: ( rule__TypeExpression__Group__0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup()); 
            // InternalRpgindividual.g:319:3: ( rule__TypeExpression__Group__0 )
            // InternalRpgindividual.g:319:4: rule__TypeExpression__Group__0
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
    // InternalRpgindividual.g:328:1: entryRuleMoves : ruleMoves EOF ;
    public final void entryRuleMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:329:1: ( ruleMoves EOF )
            // InternalRpgindividual.g:330:1: ruleMoves EOF
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
    // InternalRpgindividual.g:337:1: ruleMoves : ( ( rule__Moves__Group__0 ) ) ;
    public final void ruleMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:341:2: ( ( ( rule__Moves__Group__0 ) ) )
            // InternalRpgindividual.g:342:2: ( ( rule__Moves__Group__0 ) )
            {
            // InternalRpgindividual.g:342:2: ( ( rule__Moves__Group__0 ) )
            // InternalRpgindividual.g:343:3: ( rule__Moves__Group__0 )
            {
             before(grammarAccess.getMovesAccess().getGroup()); 
            // InternalRpgindividual.g:344:3: ( rule__Moves__Group__0 )
            // InternalRpgindividual.g:344:4: rule__Moves__Group__0
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
    // InternalRpgindividual.g:353:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalRpgindividual.g:354:1: ( ruleMove EOF )
            // InternalRpgindividual.g:355:1: ruleMove EOF
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
    // InternalRpgindividual.g:362:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:366:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalRpgindividual.g:367:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalRpgindividual.g:367:2: ( ( rule__Move__Group__0 ) )
            // InternalRpgindividual.g:368:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalRpgindividual.g:369:3: ( rule__Move__Group__0 )
            // InternalRpgindividual.g:369:4: rule__Move__Group__0
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
    // InternalRpgindividual.g:378:1: entryRuleMEffect : ruleMEffect EOF ;
    public final void entryRuleMEffect() throws RecognitionException {
        try {
            // InternalRpgindividual.g:379:1: ( ruleMEffect EOF )
            // InternalRpgindividual.g:380:1: ruleMEffect EOF
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
    // InternalRpgindividual.g:387:1: ruleMEffect : ( ( rule__MEffect__Group__0 ) ) ;
    public final void ruleMEffect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:391:2: ( ( ( rule__MEffect__Group__0 ) ) )
            // InternalRpgindividual.g:392:2: ( ( rule__MEffect__Group__0 ) )
            {
            // InternalRpgindividual.g:392:2: ( ( rule__MEffect__Group__0 ) )
            // InternalRpgindividual.g:393:3: ( rule__MEffect__Group__0 )
            {
             before(grammarAccess.getMEffectAccess().getGroup()); 
            // InternalRpgindividual.g:394:3: ( rule__MEffect__Group__0 )
            // InternalRpgindividual.g:394:4: rule__MEffect__Group__0
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


    // $ANTLR start "entryRuleEType"
    // InternalRpgindividual.g:403:1: entryRuleEType : ruleEType EOF ;
    public final void entryRuleEType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:404:1: ( ruleEType EOF )
            // InternalRpgindividual.g:405:1: ruleEType EOF
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
    // InternalRpgindividual.g:412:1: ruleEType : ( ( rule__EType__Group__0 ) ) ;
    public final void ruleEType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:416:2: ( ( ( rule__EType__Group__0 ) ) )
            // InternalRpgindividual.g:417:2: ( ( rule__EType__Group__0 ) )
            {
            // InternalRpgindividual.g:417:2: ( ( rule__EType__Group__0 ) )
            // InternalRpgindividual.g:418:3: ( rule__EType__Group__0 )
            {
             before(grammarAccess.getETypeAccess().getGroup()); 
            // InternalRpgindividual.g:419:3: ( rule__EType__Group__0 )
            // InternalRpgindividual.g:419:4: rule__EType__Group__0
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
    // InternalRpgindividual.g:428:1: entryRuleAttributeValues : ruleAttributeValues EOF ;
    public final void entryRuleAttributeValues() throws RecognitionException {
        try {
            // InternalRpgindividual.g:429:1: ( ruleAttributeValues EOF )
            // InternalRpgindividual.g:430:1: ruleAttributeValues EOF
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
    // InternalRpgindividual.g:437:1: ruleAttributeValues : ( ( rule__AttributeValues__Group__0 ) ) ;
    public final void ruleAttributeValues() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:441:2: ( ( ( rule__AttributeValues__Group__0 ) ) )
            // InternalRpgindividual.g:442:2: ( ( rule__AttributeValues__Group__0 ) )
            {
            // InternalRpgindividual.g:442:2: ( ( rule__AttributeValues__Group__0 ) )
            // InternalRpgindividual.g:443:3: ( rule__AttributeValues__Group__0 )
            {
             before(grammarAccess.getAttributeValuesAccess().getGroup()); 
            // InternalRpgindividual.g:444:3: ( rule__AttributeValues__Group__0 )
            // InternalRpgindividual.g:444:4: rule__AttributeValues__Group__0
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
    // InternalRpgindividual.g:453:1: entryRuleAltAttribute : ruleAltAttribute EOF ;
    public final void entryRuleAltAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:454:1: ( ruleAltAttribute EOF )
            // InternalRpgindividual.g:455:1: ruleAltAttribute EOF
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
    // InternalRpgindividual.g:462:1: ruleAltAttribute : ( ( rule__AltAttribute__Group__0 ) ) ;
    public final void ruleAltAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:466:2: ( ( ( rule__AltAttribute__Group__0 ) ) )
            // InternalRpgindividual.g:467:2: ( ( rule__AltAttribute__Group__0 ) )
            {
            // InternalRpgindividual.g:467:2: ( ( rule__AltAttribute__Group__0 ) )
            // InternalRpgindividual.g:468:3: ( rule__AltAttribute__Group__0 )
            {
             before(grammarAccess.getAltAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:469:3: ( rule__AltAttribute__Group__0 )
            // InternalRpgindividual.g:469:4: rule__AltAttribute__Group__0
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
    // InternalRpgindividual.g:478:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRpgindividual.g:479:1: ( ruleRule EOF )
            // InternalRpgindividual.g:480:1: ruleRule EOF
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
    // InternalRpgindividual.g:487:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:491:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRpgindividual.g:492:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRpgindividual.g:492:2: ( ( rule__Rule__Group__0 ) )
            // InternalRpgindividual.g:493:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRpgindividual.g:494:3: ( rule__Rule__Group__0 )
            // InternalRpgindividual.g:494:4: rule__Rule__Group__0
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
    // InternalRpgindividual.g:503:1: entryRuleEntities : ruleEntities EOF ;
    public final void entryRuleEntities() throws RecognitionException {
        try {
            // InternalRpgindividual.g:504:1: ( ruleEntities EOF )
            // InternalRpgindividual.g:505:1: ruleEntities EOF
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
    // InternalRpgindividual.g:512:1: ruleEntities : ( ( rule__Entities__Group__0 ) ) ;
    public final void ruleEntities() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:516:2: ( ( ( rule__Entities__Group__0 ) ) )
            // InternalRpgindividual.g:517:2: ( ( rule__Entities__Group__0 ) )
            {
            // InternalRpgindividual.g:517:2: ( ( rule__Entities__Group__0 ) )
            // InternalRpgindividual.g:518:3: ( rule__Entities__Group__0 )
            {
             before(grammarAccess.getEntitiesAccess().getGroup()); 
            // InternalRpgindividual.g:519:3: ( rule__Entities__Group__0 )
            // InternalRpgindividual.g:519:4: rule__Entities__Group__0
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
    // InternalRpgindividual.g:528:1: entryRuleDeath : ruleDeath EOF ;
    public final void entryRuleDeath() throws RecognitionException {
        try {
            // InternalRpgindividual.g:529:1: ( ruleDeath EOF )
            // InternalRpgindividual.g:530:1: ruleDeath EOF
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
    // InternalRpgindividual.g:537:1: ruleDeath : ( ( rule__Death__Group__0 ) ) ;
    public final void ruleDeath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:541:2: ( ( ( rule__Death__Group__0 ) ) )
            // InternalRpgindividual.g:542:2: ( ( rule__Death__Group__0 ) )
            {
            // InternalRpgindividual.g:542:2: ( ( rule__Death__Group__0 ) )
            // InternalRpgindividual.g:543:3: ( rule__Death__Group__0 )
            {
             before(grammarAccess.getDeathAccess().getGroup()); 
            // InternalRpgindividual.g:544:3: ( rule__Death__Group__0 )
            // InternalRpgindividual.g:544:4: rule__Death__Group__0
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
    // InternalRpgindividual.g:553:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalRpgindividual.g:554:1: ( ruleEntity EOF )
            // InternalRpgindividual.g:555:1: ruleEntity EOF
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
    // InternalRpgindividual.g:562:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:566:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalRpgindividual.g:567:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalRpgindividual.g:567:2: ( ( rule__Entity__Group__0 ) )
            // InternalRpgindividual.g:568:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalRpgindividual.g:569:3: ( rule__Entity__Group__0 )
            // InternalRpgindividual.g:569:4: rule__Entity__Group__0
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
    // InternalRpgindividual.g:578:1: entryRuleEntityMoves : ruleEntityMoves EOF ;
    public final void entryRuleEntityMoves() throws RecognitionException {
        try {
            // InternalRpgindividual.g:579:1: ( ruleEntityMoves EOF )
            // InternalRpgindividual.g:580:1: ruleEntityMoves EOF
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
    // InternalRpgindividual.g:587:1: ruleEntityMoves : ( ( rule__EntityMoves__Group__0 ) ) ;
    public final void ruleEntityMoves() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:591:2: ( ( ( rule__EntityMoves__Group__0 ) ) )
            // InternalRpgindividual.g:592:2: ( ( rule__EntityMoves__Group__0 ) )
            {
            // InternalRpgindividual.g:592:2: ( ( rule__EntityMoves__Group__0 ) )
            // InternalRpgindividual.g:593:3: ( rule__EntityMoves__Group__0 )
            {
             before(grammarAccess.getEntityMovesAccess().getGroup()); 
            // InternalRpgindividual.g:594:3: ( rule__EntityMoves__Group__0 )
            // InternalRpgindividual.g:594:4: rule__EntityMoves__Group__0
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


    // $ANTLR start "entryRuleEntityMoveModifier"
    // InternalRpgindividual.g:603:1: entryRuleEntityMoveModifier : ruleEntityMoveModifier EOF ;
    public final void entryRuleEntityMoveModifier() throws RecognitionException {
        try {
            // InternalRpgindividual.g:604:1: ( ruleEntityMoveModifier EOF )
            // InternalRpgindividual.g:605:1: ruleEntityMoveModifier EOF
            {
             before(grammarAccess.getEntityMoveModifierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoveModifier();

            state._fsp--;

             after(grammarAccess.getEntityMoveModifierRule()); 
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
    // $ANTLR end "entryRuleEntityMoveModifier"


    // $ANTLR start "ruleEntityMoveModifier"
    // InternalRpgindividual.g:612:1: ruleEntityMoveModifier : ( ( rule__EntityMoveModifier__Group__0 ) ) ;
    public final void ruleEntityMoveModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:616:2: ( ( ( rule__EntityMoveModifier__Group__0 ) ) )
            // InternalRpgindividual.g:617:2: ( ( rule__EntityMoveModifier__Group__0 ) )
            {
            // InternalRpgindividual.g:617:2: ( ( rule__EntityMoveModifier__Group__0 ) )
            // InternalRpgindividual.g:618:3: ( rule__EntityMoveModifier__Group__0 )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getGroup()); 
            // InternalRpgindividual.g:619:3: ( rule__EntityMoveModifier__Group__0 )
            // InternalRpgindividual.g:619:4: rule__EntityMoveModifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveModifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoveModifier"


    // $ANTLR start "entryRuleEntityMoveMultiplier"
    // InternalRpgindividual.g:628:1: entryRuleEntityMoveMultiplier : ruleEntityMoveMultiplier EOF ;
    public final void entryRuleEntityMoveMultiplier() throws RecognitionException {
        try {
            // InternalRpgindividual.g:629:1: ( ruleEntityMoveMultiplier EOF )
            // InternalRpgindividual.g:630:1: ruleEntityMoveMultiplier EOF
            {
             before(grammarAccess.getEntityMoveMultiplierRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityMoveMultiplier();

            state._fsp--;

             after(grammarAccess.getEntityMoveMultiplierRule()); 
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
    // $ANTLR end "entryRuleEntityMoveMultiplier"


    // $ANTLR start "ruleEntityMoveMultiplier"
    // InternalRpgindividual.g:637:1: ruleEntityMoveMultiplier : ( ( rule__EntityMoveMultiplier__Group__0 ) ) ;
    public final void ruleEntityMoveMultiplier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:641:2: ( ( ( rule__EntityMoveMultiplier__Group__0 ) ) )
            // InternalRpgindividual.g:642:2: ( ( rule__EntityMoveMultiplier__Group__0 ) )
            {
            // InternalRpgindividual.g:642:2: ( ( rule__EntityMoveMultiplier__Group__0 ) )
            // InternalRpgindividual.g:643:3: ( rule__EntityMoveMultiplier__Group__0 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getGroup()); 
            // InternalRpgindividual.g:644:3: ( rule__EntityMoveMultiplier__Group__0 )
            // InternalRpgindividual.g:644:4: rule__EntityMoveMultiplier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityMoveMultiplier"


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:653:1: entryRuleTeams : ruleTeams EOF ;
    public final void entryRuleTeams() throws RecognitionException {
        try {
            // InternalRpgindividual.g:654:1: ( ruleTeams EOF )
            // InternalRpgindividual.g:655:1: ruleTeams EOF
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
    // InternalRpgindividual.g:662:1: ruleTeams : ( ( rule__Teams__Group__0 ) ) ;
    public final void ruleTeams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:666:2: ( ( ( rule__Teams__Group__0 ) ) )
            // InternalRpgindividual.g:667:2: ( ( rule__Teams__Group__0 ) )
            {
            // InternalRpgindividual.g:667:2: ( ( rule__Teams__Group__0 ) )
            // InternalRpgindividual.g:668:3: ( rule__Teams__Group__0 )
            {
             before(grammarAccess.getTeamsAccess().getGroup()); 
            // InternalRpgindividual.g:669:3: ( rule__Teams__Group__0 )
            // InternalRpgindividual.g:669:4: rule__Teams__Group__0
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
    // InternalRpgindividual.g:678:1: entryRuleTeam : ruleTeam EOF ;
    public final void entryRuleTeam() throws RecognitionException {
        try {
            // InternalRpgindividual.g:679:1: ( ruleTeam EOF )
            // InternalRpgindividual.g:680:1: ruleTeam EOF
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
    // InternalRpgindividual.g:687:1: ruleTeam : ( ( rule__Team__Group__0 ) ) ;
    public final void ruleTeam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:691:2: ( ( ( rule__Team__Group__0 ) ) )
            // InternalRpgindividual.g:692:2: ( ( rule__Team__Group__0 ) )
            {
            // InternalRpgindividual.g:692:2: ( ( rule__Team__Group__0 ) )
            // InternalRpgindividual.g:693:3: ( rule__Team__Group__0 )
            {
             before(grammarAccess.getTeamAccess().getGroup()); 
            // InternalRpgindividual.g:694:3: ( rule__Team__Group__0 )
            // InternalRpgindividual.g:694:4: rule__Team__Group__0
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
    // InternalRpgindividual.g:703:1: entryRuleMembers : ruleMembers EOF ;
    public final void entryRuleMembers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:704:1: ( ruleMembers EOF )
            // InternalRpgindividual.g:705:1: ruleMembers EOF
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
    // InternalRpgindividual.g:712:1: ruleMembers : ( ( rule__Members__Group__0 ) ) ;
    public final void ruleMembers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:716:2: ( ( ( rule__Members__Group__0 ) ) )
            // InternalRpgindividual.g:717:2: ( ( rule__Members__Group__0 ) )
            {
            // InternalRpgindividual.g:717:2: ( ( rule__Members__Group__0 ) )
            // InternalRpgindividual.g:718:3: ( rule__Members__Group__0 )
            {
             before(grammarAccess.getMembersAccess().getGroup()); 
            // InternalRpgindividual.g:719:3: ( rule__Members__Group__0 )
            // InternalRpgindividual.g:719:4: rule__Members__Group__0
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


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:728:1: entryRuleORcondition : ruleORcondition EOF ;
    public final void entryRuleORcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:729:1: ( ruleORcondition EOF )
            // InternalRpgindividual.g:730:1: ruleORcondition EOF
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
    // InternalRpgindividual.g:737:1: ruleORcondition : ( ( rule__ORcondition__Group__0 ) ) ;
    public final void ruleORcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:741:2: ( ( ( rule__ORcondition__Group__0 ) ) )
            // InternalRpgindividual.g:742:2: ( ( rule__ORcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:742:2: ( ( rule__ORcondition__Group__0 ) )
            // InternalRpgindividual.g:743:3: ( rule__ORcondition__Group__0 )
            {
             before(grammarAccess.getORconditionAccess().getGroup()); 
            // InternalRpgindividual.g:744:3: ( rule__ORcondition__Group__0 )
            // InternalRpgindividual.g:744:4: rule__ORcondition__Group__0
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
    // InternalRpgindividual.g:753:1: entryRuleANDcondition : ruleANDcondition EOF ;
    public final void entryRuleANDcondition() throws RecognitionException {
        try {
            // InternalRpgindividual.g:754:1: ( ruleANDcondition EOF )
            // InternalRpgindividual.g:755:1: ruleANDcondition EOF
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
    // InternalRpgindividual.g:762:1: ruleANDcondition : ( ( rule__ANDcondition__Group__0 ) ) ;
    public final void ruleANDcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:766:2: ( ( ( rule__ANDcondition__Group__0 ) ) )
            // InternalRpgindividual.g:767:2: ( ( rule__ANDcondition__Group__0 ) )
            {
            // InternalRpgindividual.g:767:2: ( ( rule__ANDcondition__Group__0 ) )
            // InternalRpgindividual.g:768:3: ( rule__ANDcondition__Group__0 )
            {
             before(grammarAccess.getANDconditionAccess().getGroup()); 
            // InternalRpgindividual.g:769:3: ( rule__ANDcondition__Group__0 )
            // InternalRpgindividual.g:769:4: rule__ANDcondition__Group__0
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
    // InternalRpgindividual.g:778:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalRpgindividual.g:779:1: ( ruleStatement EOF )
            // InternalRpgindividual.g:780:1: ruleStatement EOF
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
    // InternalRpgindividual.g:787:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:791:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalRpgindividual.g:792:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalRpgindividual.g:792:2: ( ( rule__Statement__Alternatives ) )
            // InternalRpgindividual.g:793:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalRpgindividual.g:794:3: ( rule__Statement__Alternatives )
            // InternalRpgindividual.g:794:4: rule__Statement__Alternatives
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
    // InternalRpgindividual.g:803:1: entryRuleNumberComparing : ruleNumberComparing EOF ;
    public final void entryRuleNumberComparing() throws RecognitionException {
        try {
            // InternalRpgindividual.g:804:1: ( ruleNumberComparing EOF )
            // InternalRpgindividual.g:805:1: ruleNumberComparing EOF
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
    // InternalRpgindividual.g:812:1: ruleNumberComparing : ( ( rule__NumberComparing__Group__0 ) ) ;
    public final void ruleNumberComparing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:816:2: ( ( ( rule__NumberComparing__Group__0 ) ) )
            // InternalRpgindividual.g:817:2: ( ( rule__NumberComparing__Group__0 ) )
            {
            // InternalRpgindividual.g:817:2: ( ( rule__NumberComparing__Group__0 ) )
            // InternalRpgindividual.g:818:3: ( rule__NumberComparing__Group__0 )
            {
             before(grammarAccess.getNumberComparingAccess().getGroup()); 
            // InternalRpgindividual.g:819:3: ( rule__NumberComparing__Group__0 )
            // InternalRpgindividual.g:819:4: rule__NumberComparing__Group__0
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
    // InternalRpgindividual.g:828:1: entryRuleComparator : ruleComparator EOF ;
    public final void entryRuleComparator() throws RecognitionException {
        try {
            // InternalRpgindividual.g:829:1: ( ruleComparator EOF )
            // InternalRpgindividual.g:830:1: ruleComparator EOF
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
    // InternalRpgindividual.g:837:1: ruleComparator : ( ( rule__Comparator__Alternatives ) ) ;
    public final void ruleComparator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:841:2: ( ( ( rule__Comparator__Alternatives ) ) )
            // InternalRpgindividual.g:842:2: ( ( rule__Comparator__Alternatives ) )
            {
            // InternalRpgindividual.g:842:2: ( ( rule__Comparator__Alternatives ) )
            // InternalRpgindividual.g:843:3: ( rule__Comparator__Alternatives )
            {
             before(grammarAccess.getComparatorAccess().getAlternatives()); 
            // InternalRpgindividual.g:844:3: ( rule__Comparator__Alternatives )
            // InternalRpgindividual.g:844:4: rule__Comparator__Alternatives
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
    // InternalRpgindividual.g:853:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:854:1: ( ruleSum EOF )
            // InternalRpgindividual.g:855:1: ruleSum EOF
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
    // InternalRpgindividual.g:862:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:866:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalRpgindividual.g:867:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalRpgindividual.g:867:2: ( ( rule__Sum__Group__0 ) )
            // InternalRpgindividual.g:868:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalRpgindividual.g:869:3: ( rule__Sum__Group__0 )
            // InternalRpgindividual.g:869:4: rule__Sum__Group__0
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
    // InternalRpgindividual.g:878:1: entryRuleMultiply : ruleMultiply EOF ;
    public final void entryRuleMultiply() throws RecognitionException {
        try {
            // InternalRpgindividual.g:879:1: ( ruleMultiply EOF )
            // InternalRpgindividual.g:880:1: ruleMultiply EOF
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
    // InternalRpgindividual.g:887:1: ruleMultiply : ( ( rule__Multiply__Group__0 ) ) ;
    public final void ruleMultiply() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:891:2: ( ( ( rule__Multiply__Group__0 ) ) )
            // InternalRpgindividual.g:892:2: ( ( rule__Multiply__Group__0 ) )
            {
            // InternalRpgindividual.g:892:2: ( ( rule__Multiply__Group__0 ) )
            // InternalRpgindividual.g:893:3: ( rule__Multiply__Group__0 )
            {
             before(grammarAccess.getMultiplyAccess().getGroup()); 
            // InternalRpgindividual.g:894:3: ( rule__Multiply__Group__0 )
            // InternalRpgindividual.g:894:4: rule__Multiply__Group__0
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
    // InternalRpgindividual.g:903:1: entryRuleAtomicNumber : ruleAtomicNumber EOF ;
    public final void entryRuleAtomicNumber() throws RecognitionException {
        try {
            // InternalRpgindividual.g:904:1: ( ruleAtomicNumber EOF )
            // InternalRpgindividual.g:905:1: ruleAtomicNumber EOF
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
    // InternalRpgindividual.g:912:1: ruleAtomicNumber : ( ( rule__AtomicNumber__Alternatives ) ) ;
    public final void ruleAtomicNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:916:2: ( ( ( rule__AtomicNumber__Alternatives ) ) )
            // InternalRpgindividual.g:917:2: ( ( rule__AtomicNumber__Alternatives ) )
            {
            // InternalRpgindividual.g:917:2: ( ( rule__AtomicNumber__Alternatives ) )
            // InternalRpgindividual.g:918:3: ( rule__AtomicNumber__Alternatives )
            {
             before(grammarAccess.getAtomicNumberAccess().getAlternatives()); 
            // InternalRpgindividual.g:919:3: ( rule__AtomicNumber__Alternatives )
            // InternalRpgindividual.g:919:4: rule__AtomicNumber__Alternatives
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
    // InternalRpgindividual.g:928:1: entryRuleActualNumbers : ruleActualNumbers EOF ;
    public final void entryRuleActualNumbers() throws RecognitionException {
        try {
            // InternalRpgindividual.g:929:1: ( ruleActualNumbers EOF )
            // InternalRpgindividual.g:930:1: ruleActualNumbers EOF
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
    // InternalRpgindividual.g:937:1: ruleActualNumbers : ( ( rule__ActualNumbers__Alternatives ) ) ;
    public final void ruleActualNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:941:2: ( ( ( rule__ActualNumbers__Alternatives ) ) )
            // InternalRpgindividual.g:942:2: ( ( rule__ActualNumbers__Alternatives ) )
            {
            // InternalRpgindividual.g:942:2: ( ( rule__ActualNumbers__Alternatives ) )
            // InternalRpgindividual.g:943:3: ( rule__ActualNumbers__Alternatives )
            {
             before(grammarAccess.getActualNumbersAccess().getAlternatives()); 
            // InternalRpgindividual.g:944:3: ( rule__ActualNumbers__Alternatives )
            // InternalRpgindividual.g:944:4: rule__ActualNumbers__Alternatives
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
    // InternalRpgindividual.g:953:1: entryRuleNameAttribute : ruleNameAttribute EOF ;
    public final void entryRuleNameAttribute() throws RecognitionException {
        try {
            // InternalRpgindividual.g:954:1: ( ruleNameAttribute EOF )
            // InternalRpgindividual.g:955:1: ruleNameAttribute EOF
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
    // InternalRpgindividual.g:962:1: ruleNameAttribute : ( ( rule__NameAttribute__Group__0 ) ) ;
    public final void ruleNameAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:966:2: ( ( ( rule__NameAttribute__Group__0 ) ) )
            // InternalRpgindividual.g:967:2: ( ( rule__NameAttribute__Group__0 ) )
            {
            // InternalRpgindividual.g:967:2: ( ( rule__NameAttribute__Group__0 ) )
            // InternalRpgindividual.g:968:3: ( rule__NameAttribute__Group__0 )
            {
             before(grammarAccess.getNameAttributeAccess().getGroup()); 
            // InternalRpgindividual.g:969:3: ( rule__NameAttribute__Group__0 )
            // InternalRpgindividual.g:969:4: rule__NameAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getGroup()); 

            }


            }

        }
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
    // InternalRpgindividual.g:978:1: entryRuleIntNum : ruleIntNum EOF ;
    public final void entryRuleIntNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:979:1: ( ruleIntNum EOF )
            // InternalRpgindividual.g:980:1: ruleIntNum EOF
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
    // InternalRpgindividual.g:987:1: ruleIntNum : ( ( rule__IntNum__ValueAssignment ) ) ;
    public final void ruleIntNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:991:2: ( ( ( rule__IntNum__ValueAssignment ) ) )
            // InternalRpgindividual.g:992:2: ( ( rule__IntNum__ValueAssignment ) )
            {
            // InternalRpgindividual.g:992:2: ( ( rule__IntNum__ValueAssignment ) )
            // InternalRpgindividual.g:993:3: ( rule__IntNum__ValueAssignment )
            {
             before(grammarAccess.getIntNumAccess().getValueAssignment()); 
            // InternalRpgindividual.g:994:3: ( rule__IntNum__ValueAssignment )
            // InternalRpgindividual.g:994:4: rule__IntNum__ValueAssignment
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
    // InternalRpgindividual.g:1003:1: entryRuleFloatNum : ruleFloatNum EOF ;
    public final void entryRuleFloatNum() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1004:1: ( ruleFloatNum EOF )
            // InternalRpgindividual.g:1005:1: ruleFloatNum EOF
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
    // InternalRpgindividual.g:1012:1: ruleFloatNum : ( ( rule__FloatNum__Group__0 ) ) ;
    public final void ruleFloatNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1016:2: ( ( ( rule__FloatNum__Group__0 ) ) )
            // InternalRpgindividual.g:1017:2: ( ( rule__FloatNum__Group__0 ) )
            {
            // InternalRpgindividual.g:1017:2: ( ( rule__FloatNum__Group__0 ) )
            // InternalRpgindividual.g:1018:3: ( rule__FloatNum__Group__0 )
            {
             before(grammarAccess.getFloatNumAccess().getGroup()); 
            // InternalRpgindividual.g:1019:3: ( rule__FloatNum__Group__0 )
            // InternalRpgindividual.g:1019:4: rule__FloatNum__Group__0
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


    // $ANTLR start "entryRuleTarget"
    // InternalRpgindividual.g:1028:1: entryRuleTarget : ruleTarget EOF ;
    public final void entryRuleTarget() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1029:1: ( ruleTarget EOF )
            // InternalRpgindividual.g:1030:1: ruleTarget EOF
            {
             before(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getTargetRule()); 
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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalRpgindividual.g:1037:1: ruleTarget : ( ( rule__Target__Alternatives ) ) ;
    public final void ruleTarget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1041:2: ( ( ( rule__Target__Alternatives ) ) )
            // InternalRpgindividual.g:1042:2: ( ( rule__Target__Alternatives ) )
            {
            // InternalRpgindividual.g:1042:2: ( ( rule__Target__Alternatives ) )
            // InternalRpgindividual.g:1043:3: ( rule__Target__Alternatives )
            {
             before(grammarAccess.getTargetAccess().getAlternatives()); 
            // InternalRpgindividual.g:1044:3: ( rule__Target__Alternatives )
            // InternalRpgindividual.g:1044:4: rule__Target__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Target__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTargetAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLegalType"
    // InternalRpgindividual.g:1053:1: entryRuleLegalType : ruleLegalType EOF ;
    public final void entryRuleLegalType() throws RecognitionException {
        try {
            // InternalRpgindividual.g:1054:1: ( ruleLegalType EOF )
            // InternalRpgindividual.g:1055:1: ruleLegalType EOF
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
    // InternalRpgindividual.g:1062:1: ruleLegalType : ( ( rule__LegalType__Alternatives ) ) ;
    public final void ruleLegalType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1066:2: ( ( ( rule__LegalType__Alternatives ) ) )
            // InternalRpgindividual.g:1067:2: ( ( rule__LegalType__Alternatives ) )
            {
            // InternalRpgindividual.g:1067:2: ( ( rule__LegalType__Alternatives ) )
            // InternalRpgindividual.g:1068:3: ( rule__LegalType__Alternatives )
            {
             before(grammarAccess.getLegalTypeAccess().getAlternatives()); 
            // InternalRpgindividual.g:1069:3: ( rule__LegalType__Alternatives )
            // InternalRpgindividual.g:1069:4: rule__LegalType__Alternatives
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
    // InternalRpgindividual.g:1077:1: rule__Declaration__Alternatives : ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1081:1: ( ( ruleLocations ) | ( ruleRelations ) | ( ruleMoves ) | ( ruleEntities ) | ( ruleTeams ) | ( ruleDeath ) | ( ruleAttributes ) | ( ruleEffects ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            case 31:
                {
                alt1=4;
                }
                break;
            case 38:
                {
                alt1=5;
                }
                break;
            case 32:
                {
                alt1=6;
                }
                break;
            case 18:
                {
                alt1=7;
                }
                break;
            case 16:
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
                    // InternalRpgindividual.g:1082:2: ( ruleLocations )
                    {
                    // InternalRpgindividual.g:1082:2: ( ruleLocations )
                    // InternalRpgindividual.g:1083:3: ruleLocations
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
                    // InternalRpgindividual.g:1088:2: ( ruleRelations )
                    {
                    // InternalRpgindividual.g:1088:2: ( ruleRelations )
                    // InternalRpgindividual.g:1089:3: ruleRelations
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
                    // InternalRpgindividual.g:1094:2: ( ruleMoves )
                    {
                    // InternalRpgindividual.g:1094:2: ( ruleMoves )
                    // InternalRpgindividual.g:1095:3: ruleMoves
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
                    // InternalRpgindividual.g:1100:2: ( ruleEntities )
                    {
                    // InternalRpgindividual.g:1100:2: ( ruleEntities )
                    // InternalRpgindividual.g:1101:3: ruleEntities
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
                    // InternalRpgindividual.g:1106:2: ( ruleTeams )
                    {
                    // InternalRpgindividual.g:1106:2: ( ruleTeams )
                    // InternalRpgindividual.g:1107:3: ruleTeams
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
                    // InternalRpgindividual.g:1112:2: ( ruleDeath )
                    {
                    // InternalRpgindividual.g:1112:2: ( ruleDeath )
                    // InternalRpgindividual.g:1113:3: ruleDeath
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
                    // InternalRpgindividual.g:1118:2: ( ruleAttributes )
                    {
                    // InternalRpgindividual.g:1118:2: ( ruleAttributes )
                    // InternalRpgindividual.g:1119:3: ruleAttributes
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
                    // InternalRpgindividual.g:1124:2: ( ruleEffects )
                    {
                    // InternalRpgindividual.g:1124:2: ( ruleEffects )
                    // InternalRpgindividual.g:1125:3: ruleEffects
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


    // $ANTLR start "rule__AttributeValues__Alternatives_1"
    // InternalRpgindividual.g:1134:1: rule__AttributeValues__Alternatives_1 : ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) );
    public final void rule__AttributeValues__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1138:1: ( ( ( rule__AttributeValues__LTypesAssignment_1_0 ) ) | ( ( rule__AttributeValues__AnAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRpgindividual.g:1139:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    {
                    // InternalRpgindividual.g:1139:2: ( ( rule__AttributeValues__LTypesAssignment_1_0 ) )
                    // InternalRpgindividual.g:1140:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getLTypesAssignment_1_0()); 
                    // InternalRpgindividual.g:1141:3: ( rule__AttributeValues__LTypesAssignment_1_0 )
                    // InternalRpgindividual.g:1141:4: rule__AttributeValues__LTypesAssignment_1_0
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
                    // InternalRpgindividual.g:1145:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    {
                    // InternalRpgindividual.g:1145:2: ( ( rule__AttributeValues__AnAssignment_1_1 ) )
                    // InternalRpgindividual.g:1146:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    {
                     before(grammarAccess.getAttributeValuesAccess().getAnAssignment_1_1()); 
                    // InternalRpgindividual.g:1147:3: ( rule__AttributeValues__AnAssignment_1_1 )
                    // InternalRpgindividual.g:1147:4: rule__AttributeValues__AnAssignment_1_1
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
    // InternalRpgindividual.g:1155:1: rule__Statement__Alternatives : ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1159:1: ( ( ruleNumberComparing ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||(LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRpgindividual.g:1160:2: ( ruleNumberComparing )
                    {
                    // InternalRpgindividual.g:1160:2: ( ruleNumberComparing )
                    // InternalRpgindividual.g:1161:3: ruleNumberComparing
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
                    // InternalRpgindividual.g:1166:2: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1166:2: ( ( rule__Statement__Group_1__0 ) )
                    // InternalRpgindividual.g:1167:3: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1168:3: ( rule__Statement__Group_1__0 )
                    // InternalRpgindividual.g:1168:4: rule__Statement__Group_1__0
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
    // InternalRpgindividual.g:1176:1: rule__Comparator__Alternatives : ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) );
    public final void rule__Comparator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1180:1: ( ( ( rule__Comparator__Group_0__0 ) ) | ( ( rule__Comparator__Group_1__0 ) ) | ( ( rule__Comparator__Group_2__0 ) ) | ( ( rule__Comparator__Group_3__0 ) ) | ( ( rule__Comparator__Group_4__0 ) ) | ( ( rule__Comparator__Group_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 45:
                {
                alt4=4;
                }
                break;
            case 46:
                {
                alt4=5;
                }
                break;
            case 47:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRpgindividual.g:1181:2: ( ( rule__Comparator__Group_0__0 ) )
                    {
                    // InternalRpgindividual.g:1181:2: ( ( rule__Comparator__Group_0__0 ) )
                    // InternalRpgindividual.g:1182:3: ( rule__Comparator__Group_0__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_0()); 
                    // InternalRpgindividual.g:1183:3: ( rule__Comparator__Group_0__0 )
                    // InternalRpgindividual.g:1183:4: rule__Comparator__Group_0__0
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
                    // InternalRpgindividual.g:1187:2: ( ( rule__Comparator__Group_1__0 ) )
                    {
                    // InternalRpgindividual.g:1187:2: ( ( rule__Comparator__Group_1__0 ) )
                    // InternalRpgindividual.g:1188:3: ( rule__Comparator__Group_1__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_1()); 
                    // InternalRpgindividual.g:1189:3: ( rule__Comparator__Group_1__0 )
                    // InternalRpgindividual.g:1189:4: rule__Comparator__Group_1__0
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
                    // InternalRpgindividual.g:1193:2: ( ( rule__Comparator__Group_2__0 ) )
                    {
                    // InternalRpgindividual.g:1193:2: ( ( rule__Comparator__Group_2__0 ) )
                    // InternalRpgindividual.g:1194:3: ( rule__Comparator__Group_2__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_2()); 
                    // InternalRpgindividual.g:1195:3: ( rule__Comparator__Group_2__0 )
                    // InternalRpgindividual.g:1195:4: rule__Comparator__Group_2__0
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
                    // InternalRpgindividual.g:1199:2: ( ( rule__Comparator__Group_3__0 ) )
                    {
                    // InternalRpgindividual.g:1199:2: ( ( rule__Comparator__Group_3__0 ) )
                    // InternalRpgindividual.g:1200:3: ( rule__Comparator__Group_3__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_3()); 
                    // InternalRpgindividual.g:1201:3: ( rule__Comparator__Group_3__0 )
                    // InternalRpgindividual.g:1201:4: rule__Comparator__Group_3__0
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
                    // InternalRpgindividual.g:1205:2: ( ( rule__Comparator__Group_4__0 ) )
                    {
                    // InternalRpgindividual.g:1205:2: ( ( rule__Comparator__Group_4__0 ) )
                    // InternalRpgindividual.g:1206:3: ( rule__Comparator__Group_4__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_4()); 
                    // InternalRpgindividual.g:1207:3: ( rule__Comparator__Group_4__0 )
                    // InternalRpgindividual.g:1207:4: rule__Comparator__Group_4__0
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
                    // InternalRpgindividual.g:1211:2: ( ( rule__Comparator__Group_5__0 ) )
                    {
                    // InternalRpgindividual.g:1211:2: ( ( rule__Comparator__Group_5__0 ) )
                    // InternalRpgindividual.g:1212:3: ( rule__Comparator__Group_5__0 )
                    {
                     before(grammarAccess.getComparatorAccess().getGroup_5()); 
                    // InternalRpgindividual.g:1213:3: ( rule__Comparator__Group_5__0 )
                    // InternalRpgindividual.g:1213:4: rule__Comparator__Group_5__0
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
    // InternalRpgindividual.g:1221:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1225:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRpgindividual.g:1226:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1226:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1227:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1228:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1228:4: rule__Sum__Group_1_0_0__0
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
                    // InternalRpgindividual.g:1232:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1232:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1233:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1234:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1234:4: rule__Sum__Group_1_0_1__0
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
    // InternalRpgindividual.g:1242:1: rule__Multiply__Alternatives_1_0 : ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) );
    public final void rule__Multiply__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1246:1: ( ( ( rule__Multiply__Group_1_0_0__0 ) ) | ( ( rule__Multiply__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( (LA6_0==50) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRpgindividual.g:1247:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    {
                    // InternalRpgindividual.g:1247:2: ( ( rule__Multiply__Group_1_0_0__0 ) )
                    // InternalRpgindividual.g:1248:3: ( rule__Multiply__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_0()); 
                    // InternalRpgindividual.g:1249:3: ( rule__Multiply__Group_1_0_0__0 )
                    // InternalRpgindividual.g:1249:4: rule__Multiply__Group_1_0_0__0
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
                    // InternalRpgindividual.g:1253:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    {
                    // InternalRpgindividual.g:1253:2: ( ( rule__Multiply__Group_1_0_1__0 ) )
                    // InternalRpgindividual.g:1254:3: ( rule__Multiply__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplyAccess().getGroup_1_0_1()); 
                    // InternalRpgindividual.g:1255:3: ( rule__Multiply__Group_1_0_1__0 )
                    // InternalRpgindividual.g:1255:4: rule__Multiply__Group_1_0_1__0
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
    // InternalRpgindividual.g:1263:1: rule__AtomicNumber__Alternatives : ( ( ruleActualNumbers ) | ( ruleNameAttribute ) );
    public final void rule__AtomicNumber__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1267:1: ( ( ruleActualNumbers ) | ( ruleNameAttribute ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:1268:2: ( ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1268:2: ( ruleActualNumbers )
                    // InternalRpgindividual.g:1269:3: ruleActualNumbers
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
                    // InternalRpgindividual.g:1274:2: ( ruleNameAttribute )
                    {
                    // InternalRpgindividual.g:1274:2: ( ruleNameAttribute )
                    // InternalRpgindividual.g:1275:3: ruleNameAttribute
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
    // InternalRpgindividual.g:1284:1: rule__ActualNumbers__Alternatives : ( ( ruleFloatNum ) | ( ruleIntNum ) );
    public final void rule__ActualNumbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1288:1: ( ( ruleFloatNum ) | ( ruleIntNum ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==51) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_ID||(LA8_1>=16 && LA8_1<=20)||LA8_1==22||LA8_1==24||(LA8_1>=26 && LA8_1<=27)||(LA8_1>=30 && LA8_1<=32)||(LA8_1>=36 && LA8_1<=38)||(LA8_1>=41 && LA8_1<=50)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRpgindividual.g:1289:2: ( ruleFloatNum )
                    {
                    // InternalRpgindividual.g:1289:2: ( ruleFloatNum )
                    // InternalRpgindividual.g:1290:3: ruleFloatNum
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
                    // InternalRpgindividual.g:1295:2: ( ruleIntNum )
                    {
                    // InternalRpgindividual.g:1295:2: ( ruleIntNum )
                    // InternalRpgindividual.g:1296:3: ruleIntNum
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


    // $ANTLR start "rule__Target__Alternatives"
    // InternalRpgindividual.g:1305:1: rule__Target__Alternatives : ( ( 'User' ) | ( 'Enemy' ) );
    public final void rule__Target__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1309:1: ( ( 'User' ) | ( 'Enemy' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRpgindividual.g:1310:2: ( 'User' )
                    {
                    // InternalRpgindividual.g:1310:2: ( 'User' )
                    // InternalRpgindividual.g:1311:3: 'User'
                    {
                     before(grammarAccess.getTargetAccess().getUserKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getUserKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1316:2: ( 'Enemy' )
                    {
                    // InternalRpgindividual.g:1316:2: ( 'Enemy' )
                    // InternalRpgindividual.g:1317:3: 'Enemy'
                    {
                     before(grammarAccess.getTargetAccess().getEnemyKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTargetAccess().getEnemyKeyword_1()); 

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
    // $ANTLR end "rule__Target__Alternatives"


    // $ANTLR start "rule__LegalType__Alternatives"
    // InternalRpgindividual.g:1326:1: rule__LegalType__Alternatives : ( ( 'Float' ) | ( 'Integer' ) );
    public final void rule__LegalType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1330:1: ( ( 'Float' ) | ( 'Integer' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRpgindividual.g:1331:2: ( 'Float' )
                    {
                    // InternalRpgindividual.g:1331:2: ( 'Float' )
                    // InternalRpgindividual.g:1332:3: 'Float'
                    {
                     before(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLegalTypeAccess().getFloatKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1337:2: ( 'Integer' )
                    {
                    // InternalRpgindividual.g:1337:2: ( 'Integer' )
                    // InternalRpgindividual.g:1338:3: 'Integer'
                    {
                     before(grammarAccess.getLegalTypeAccess().getIntegerKeyword_1()); 
                    match(input,14,FOLLOW_2); 
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
    // InternalRpgindividual.g:1347:1: rule__SystemRPG__Group__0 : rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 ;
    public final void rule__SystemRPG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1351:1: ( rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1 )
            // InternalRpgindividual.g:1352:2: rule__SystemRPG__Group__0__Impl rule__SystemRPG__Group__1
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
    // InternalRpgindividual.g:1359:1: rule__SystemRPG__Group__0__Impl : ( 'game' ) ;
    public final void rule__SystemRPG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1363:1: ( ( 'game' ) )
            // InternalRpgindividual.g:1364:1: ( 'game' )
            {
            // InternalRpgindividual.g:1364:1: ( 'game' )
            // InternalRpgindividual.g:1365:2: 'game'
            {
             before(grammarAccess.getSystemRPGAccess().getGameKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalRpgindividual.g:1374:1: rule__SystemRPG__Group__1 : rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 ;
    public final void rule__SystemRPG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1378:1: ( rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2 )
            // InternalRpgindividual.g:1379:2: rule__SystemRPG__Group__1__Impl rule__SystemRPG__Group__2
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
    // InternalRpgindividual.g:1386:1: rule__SystemRPG__Group__1__Impl : ( ( rule__SystemRPG__NameAssignment_1 ) ) ;
    public final void rule__SystemRPG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1390:1: ( ( ( rule__SystemRPG__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1391:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1391:1: ( ( rule__SystemRPG__NameAssignment_1 ) )
            // InternalRpgindividual.g:1392:2: ( rule__SystemRPG__NameAssignment_1 )
            {
             before(grammarAccess.getSystemRPGAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1393:2: ( rule__SystemRPG__NameAssignment_1 )
            // InternalRpgindividual.g:1393:3: rule__SystemRPG__NameAssignment_1
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
    // InternalRpgindividual.g:1401:1: rule__SystemRPG__Group__2 : rule__SystemRPG__Group__2__Impl ;
    public final void rule__SystemRPG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1405:1: ( rule__SystemRPG__Group__2__Impl )
            // InternalRpgindividual.g:1406:2: rule__SystemRPG__Group__2__Impl
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
    // InternalRpgindividual.g:1412:1: rule__SystemRPG__Group__2__Impl : ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) ;
    public final void rule__SystemRPG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1416:1: ( ( ( rule__SystemRPG__DeclarationsAssignment_2 )* ) )
            // InternalRpgindividual.g:1417:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            {
            // InternalRpgindividual.g:1417:1: ( ( rule__SystemRPG__DeclarationsAssignment_2 )* )
            // InternalRpgindividual.g:1418:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getSystemRPGAccess().getDeclarationsAssignment_2()); 
            // InternalRpgindividual.g:1419:2: ( rule__SystemRPG__DeclarationsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16||LA11_0==18||LA11_0==20||LA11_0==22||LA11_0==26||(LA11_0>=31 && LA11_0<=32)||LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRpgindividual.g:1419:3: rule__SystemRPG__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__SystemRPG__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRpgindividual.g:1428:1: rule__Effects__Group__0 : rule__Effects__Group__0__Impl rule__Effects__Group__1 ;
    public final void rule__Effects__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1432:1: ( rule__Effects__Group__0__Impl rule__Effects__Group__1 )
            // InternalRpgindividual.g:1433:2: rule__Effects__Group__0__Impl rule__Effects__Group__1
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
    // InternalRpgindividual.g:1440:1: rule__Effects__Group__0__Impl : ( 'effects' ) ;
    public final void rule__Effects__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1444:1: ( ( 'effects' ) )
            // InternalRpgindividual.g:1445:1: ( 'effects' )
            {
            // InternalRpgindividual.g:1445:1: ( 'effects' )
            // InternalRpgindividual.g:1446:2: 'effects'
            {
             before(grammarAccess.getEffectsAccess().getEffectsKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRpgindividual.g:1455:1: rule__Effects__Group__1 : rule__Effects__Group__1__Impl ;
    public final void rule__Effects__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1459:1: ( rule__Effects__Group__1__Impl )
            // InternalRpgindividual.g:1460:2: rule__Effects__Group__1__Impl
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
    // InternalRpgindividual.g:1466:1: rule__Effects__Group__1__Impl : ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) ;
    public final void rule__Effects__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1470:1: ( ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1471:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1471:1: ( ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* ) )
            // InternalRpgindividual.g:1472:2: ( ( rule__Effects__EffectAssignment_1 ) ) ( ( rule__Effects__EffectAssignment_1 )* )
            {
            // InternalRpgindividual.g:1472:2: ( ( rule__Effects__EffectAssignment_1 ) )
            // InternalRpgindividual.g:1473:3: ( rule__Effects__EffectAssignment_1 )
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1474:3: ( rule__Effects__EffectAssignment_1 )
            // InternalRpgindividual.g:1474:4: rule__Effects__EffectAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__Effects__EffectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 

            }

            // InternalRpgindividual.g:1477:2: ( ( rule__Effects__EffectAssignment_1 )* )
            // InternalRpgindividual.g:1478:3: ( rule__Effects__EffectAssignment_1 )*
            {
             before(grammarAccess.getEffectsAccess().getEffectAssignment_1()); 
            // InternalRpgindividual.g:1479:3: ( rule__Effects__EffectAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpgindividual.g:1479:4: rule__Effects__EffectAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Effects__EffectAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalRpgindividual.g:1489:1: rule__Effect__Group__0 : rule__Effect__Group__0__Impl rule__Effect__Group__1 ;
    public final void rule__Effect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1493:1: ( rule__Effect__Group__0__Impl rule__Effect__Group__1 )
            // InternalRpgindividual.g:1494:2: rule__Effect__Group__0__Impl rule__Effect__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRpgindividual.g:1501:1: rule__Effect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__Effect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1505:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:1506:1: ( 'effect' )
            {
            // InternalRpgindividual.g:1506:1: ( 'effect' )
            // InternalRpgindividual.g:1507:2: 'effect'
            {
             before(grammarAccess.getEffectAccess().getEffectKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRpgindividual.g:1516:1: rule__Effect__Group__1 : rule__Effect__Group__1__Impl rule__Effect__Group__2 ;
    public final void rule__Effect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1520:1: ( rule__Effect__Group__1__Impl rule__Effect__Group__2 )
            // InternalRpgindividual.g:1521:2: rule__Effect__Group__1__Impl rule__Effect__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Effect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Effect__Group__2();

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
    // InternalRpgindividual.g:1528:1: rule__Effect__Group__1__Impl : ( ( rule__Effect__NameAssignment_1 ) ) ;
    public final void rule__Effect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1532:1: ( ( ( rule__Effect__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1533:1: ( ( rule__Effect__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1533:1: ( ( rule__Effect__NameAssignment_1 ) )
            // InternalRpgindividual.g:1534:2: ( rule__Effect__NameAssignment_1 )
            {
             before(grammarAccess.getEffectAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1535:2: ( rule__Effect__NameAssignment_1 )
            // InternalRpgindividual.g:1535:3: rule__Effect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Effect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Effect__Group__2"
    // InternalRpgindividual.g:1543:1: rule__Effect__Group__2 : rule__Effect__Group__2__Impl ;
    public final void rule__Effect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1547:1: ( rule__Effect__Group__2__Impl )
            // InternalRpgindividual.g:1548:2: rule__Effect__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Effect__Group__2__Impl();

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
    // $ANTLR end "rule__Effect__Group__2"


    // $ANTLR start "rule__Effect__Group__2__Impl"
    // InternalRpgindividual.g:1554:1: rule__Effect__Group__2__Impl : ( ( rule__Effect__RuleAssignment_2 ) ) ;
    public final void rule__Effect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1558:1: ( ( ( rule__Effect__RuleAssignment_2 ) ) )
            // InternalRpgindividual.g:1559:1: ( ( rule__Effect__RuleAssignment_2 ) )
            {
            // InternalRpgindividual.g:1559:1: ( ( rule__Effect__RuleAssignment_2 ) )
            // InternalRpgindividual.g:1560:2: ( rule__Effect__RuleAssignment_2 )
            {
             before(grammarAccess.getEffectAccess().getRuleAssignment_2()); 
            // InternalRpgindividual.g:1561:2: ( rule__Effect__RuleAssignment_2 )
            // InternalRpgindividual.g:1561:3: rule__Effect__RuleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Effect__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectAccess().getRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__Group__2__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // InternalRpgindividual.g:1570:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1574:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // InternalRpgindividual.g:1575:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRpgindividual.g:1582:1: rule__Attributes__Group__0__Impl : ( 'attributes' ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1586:1: ( ( 'attributes' ) )
            // InternalRpgindividual.g:1587:1: ( 'attributes' )
            {
            // InternalRpgindividual.g:1587:1: ( 'attributes' )
            // InternalRpgindividual.g:1588:2: 'attributes'
            {
             before(grammarAccess.getAttributesAccess().getAttributesKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRpgindividual.g:1597:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1601:1: ( rule__Attributes__Group__1__Impl )
            // InternalRpgindividual.g:1602:2: rule__Attributes__Group__1__Impl
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
    // InternalRpgindividual.g:1608:1: rule__Attributes__Group__1__Impl : ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1612:1: ( ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1613:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1613:1: ( ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // InternalRpgindividual.g:1614:2: ( ( rule__Attributes__AttributeAssignment_1 ) ) ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // InternalRpgindividual.g:1614:2: ( ( rule__Attributes__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:1615:3: ( rule__Attributes__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1616:3: ( rule__Attributes__AttributeAssignment_1 )
            // InternalRpgindividual.g:1616:4: rule__Attributes__AttributeAssignment_1
            {
            pushFollow(FOLLOW_10);
            rule__Attributes__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }

            // InternalRpgindividual.g:1619:2: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // InternalRpgindividual.g:1620:3: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:1621:3: ( rule__Attributes__AttributeAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRpgindividual.g:1621:4: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRpgindividual.g:1631:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1635:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalRpgindividual.g:1636:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalRpgindividual.g:1643:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1647:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:1648:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:1648:1: ( 'attribute' )
            // InternalRpgindividual.g:1649:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRpgindividual.g:1658:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1662:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalRpgindividual.g:1663:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRpgindividual.g:1670:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1674:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1675:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalRpgindividual.g:1676:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1677:2: ( rule__Attribute__NameAssignment_1 )
            // InternalRpgindividual.g:1677:3: rule__Attribute__NameAssignment_1
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
    // InternalRpgindividual.g:1685:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1689:1: ( rule__Attribute__Group__2__Impl )
            // InternalRpgindividual.g:1690:2: rule__Attribute__Group__2__Impl
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
    // InternalRpgindividual.g:1696:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__AValAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1700:1: ( ( ( rule__Attribute__AValAssignment_2 ) ) )
            // InternalRpgindividual.g:1701:1: ( ( rule__Attribute__AValAssignment_2 ) )
            {
            // InternalRpgindividual.g:1701:1: ( ( rule__Attribute__AValAssignment_2 ) )
            // InternalRpgindividual.g:1702:2: ( rule__Attribute__AValAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getAValAssignment_2()); 
            // InternalRpgindividual.g:1703:2: ( rule__Attribute__AValAssignment_2 )
            // InternalRpgindividual.g:1703:3: rule__Attribute__AValAssignment_2
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
    // InternalRpgindividual.g:1712:1: rule__Locations__Group__0 : rule__Locations__Group__0__Impl rule__Locations__Group__1 ;
    public final void rule__Locations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1716:1: ( rule__Locations__Group__0__Impl rule__Locations__Group__1 )
            // InternalRpgindividual.g:1717:2: rule__Locations__Group__0__Impl rule__Locations__Group__1
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
    // InternalRpgindividual.g:1724:1: rule__Locations__Group__0__Impl : ( 'location' ) ;
    public final void rule__Locations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1728:1: ( ( 'location' ) )
            // InternalRpgindividual.g:1729:1: ( 'location' )
            {
            // InternalRpgindividual.g:1729:1: ( 'location' )
            // InternalRpgindividual.g:1730:2: 'location'
            {
             before(grammarAccess.getLocationsAccess().getLocationKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRpgindividual.g:1739:1: rule__Locations__Group__1 : rule__Locations__Group__1__Impl ;
    public final void rule__Locations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1743:1: ( rule__Locations__Group__1__Impl )
            // InternalRpgindividual.g:1744:2: rule__Locations__Group__1__Impl
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
    // InternalRpgindividual.g:1750:1: rule__Locations__Group__1__Impl : ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) ;
    public final void rule__Locations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1754:1: ( ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1755:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1755:1: ( ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* ) )
            // InternalRpgindividual.g:1756:2: ( ( rule__Locations__LocAssignment_1 ) ) ( ( rule__Locations__LocAssignment_1 )* )
            {
            // InternalRpgindividual.g:1756:2: ( ( rule__Locations__LocAssignment_1 ) )
            // InternalRpgindividual.g:1757:3: ( rule__Locations__LocAssignment_1 )
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:1758:3: ( rule__Locations__LocAssignment_1 )
            // InternalRpgindividual.g:1758:4: rule__Locations__LocAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Locations__LocAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationsAccess().getLocAssignment_1()); 

            }

            // InternalRpgindividual.g:1761:2: ( ( rule__Locations__LocAssignment_1 )* )
            // InternalRpgindividual.g:1762:3: ( rule__Locations__LocAssignment_1 )*
            {
             before(grammarAccess.getLocationsAccess().getLocAssignment_1()); 
            // InternalRpgindividual.g:1763:3: ( rule__Locations__LocAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRpgindividual.g:1763:4: rule__Locations__LocAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Locations__LocAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRpgindividual.g:1773:1: rule__Loc__Group__0 : rule__Loc__Group__0__Impl rule__Loc__Group__1 ;
    public final void rule__Loc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1777:1: ( rule__Loc__Group__0__Impl rule__Loc__Group__1 )
            // InternalRpgindividual.g:1778:2: rule__Loc__Group__0__Impl rule__Loc__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRpgindividual.g:1785:1: rule__Loc__Group__0__Impl : ( ( rule__Loc__NameAssignment_0 ) ) ;
    public final void rule__Loc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1789:1: ( ( ( rule__Loc__NameAssignment_0 ) ) )
            // InternalRpgindividual.g:1790:1: ( ( rule__Loc__NameAssignment_0 ) )
            {
            // InternalRpgindividual.g:1790:1: ( ( rule__Loc__NameAssignment_0 ) )
            // InternalRpgindividual.g:1791:2: ( rule__Loc__NameAssignment_0 )
            {
             before(grammarAccess.getLocAccess().getNameAssignment_0()); 
            // InternalRpgindividual.g:1792:2: ( rule__Loc__NameAssignment_0 )
            // InternalRpgindividual.g:1792:3: rule__Loc__NameAssignment_0
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
    // InternalRpgindividual.g:1800:1: rule__Loc__Group__1 : rule__Loc__Group__1__Impl rule__Loc__Group__2 ;
    public final void rule__Loc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1804:1: ( rule__Loc__Group__1__Impl rule__Loc__Group__2 )
            // InternalRpgindividual.g:1805:2: rule__Loc__Group__1__Impl rule__Loc__Group__2
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
    // InternalRpgindividual.g:1812:1: rule__Loc__Group__1__Impl : ( 'opponents' ) ;
    public final void rule__Loc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1816:1: ( ( 'opponents' ) )
            // InternalRpgindividual.g:1817:1: ( 'opponents' )
            {
            // InternalRpgindividual.g:1817:1: ( 'opponents' )
            // InternalRpgindividual.g:1818:2: 'opponents'
            {
             before(grammarAccess.getLocAccess().getOpponentsKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRpgindividual.g:1827:1: rule__Loc__Group__2 : rule__Loc__Group__2__Impl ;
    public final void rule__Loc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1831:1: ( rule__Loc__Group__2__Impl )
            // InternalRpgindividual.g:1832:2: rule__Loc__Group__2__Impl
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
    // InternalRpgindividual.g:1838:1: rule__Loc__Group__2__Impl : ( ( rule__Loc__TeamAssignment_2 ) ) ;
    public final void rule__Loc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1842:1: ( ( ( rule__Loc__TeamAssignment_2 ) ) )
            // InternalRpgindividual.g:1843:1: ( ( rule__Loc__TeamAssignment_2 ) )
            {
            // InternalRpgindividual.g:1843:1: ( ( rule__Loc__TeamAssignment_2 ) )
            // InternalRpgindividual.g:1844:2: ( rule__Loc__TeamAssignment_2 )
            {
             before(grammarAccess.getLocAccess().getTeamAssignment_2()); 
            // InternalRpgindividual.g:1845:2: ( rule__Loc__TeamAssignment_2 )
            // InternalRpgindividual.g:1845:3: rule__Loc__TeamAssignment_2
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
    // InternalRpgindividual.g:1854:1: rule__Relations__Group__0 : rule__Relations__Group__0__Impl rule__Relations__Group__1 ;
    public final void rule__Relations__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1858:1: ( rule__Relations__Group__0__Impl rule__Relations__Group__1 )
            // InternalRpgindividual.g:1859:2: rule__Relations__Group__0__Impl rule__Relations__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRpgindividual.g:1866:1: rule__Relations__Group__0__Impl : ( 'relations' ) ;
    public final void rule__Relations__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1870:1: ( ( 'relations' ) )
            // InternalRpgindividual.g:1871:1: ( 'relations' )
            {
            // InternalRpgindividual.g:1871:1: ( 'relations' )
            // InternalRpgindividual.g:1872:2: 'relations'
            {
             before(grammarAccess.getRelationsAccess().getRelationsKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalRpgindividual.g:1881:1: rule__Relations__Group__1 : rule__Relations__Group__1__Impl ;
    public final void rule__Relations__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1885:1: ( rule__Relations__Group__1__Impl )
            // InternalRpgindividual.g:1886:2: rule__Relations__Group__1__Impl
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
    // InternalRpgindividual.g:1892:1: rule__Relations__Group__1__Impl : ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) ;
    public final void rule__Relations__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1896:1: ( ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) ) )
            // InternalRpgindividual.g:1897:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:1897:1: ( ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* ) )
            // InternalRpgindividual.g:1898:2: ( ( rule__Relations__TypeAssignment_1 ) ) ( ( rule__Relations__TypeAssignment_1 )* )
            {
            // InternalRpgindividual.g:1898:2: ( ( rule__Relations__TypeAssignment_1 ) )
            // InternalRpgindividual.g:1899:3: ( rule__Relations__TypeAssignment_1 )
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:1900:3: ( rule__Relations__TypeAssignment_1 )
            // InternalRpgindividual.g:1900:4: rule__Relations__TypeAssignment_1
            {
            pushFollow(FOLLOW_15);
            rule__Relations__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 

            }

            // InternalRpgindividual.g:1903:2: ( ( rule__Relations__TypeAssignment_1 )* )
            // InternalRpgindividual.g:1904:3: ( rule__Relations__TypeAssignment_1 )*
            {
             before(grammarAccess.getRelationsAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:1905:3: ( rule__Relations__TypeAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRpgindividual.g:1905:4: rule__Relations__TypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Relations__TypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRpgindividual.g:1915:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1919:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalRpgindividual.g:1920:2: rule__Type__Group__0__Impl rule__Type__Group__1
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
    // InternalRpgindividual.g:1927:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1931:1: ( ( 'type' ) )
            // InternalRpgindividual.g:1932:1: ( 'type' )
            {
            // InternalRpgindividual.g:1932:1: ( 'type' )
            // InternalRpgindividual.g:1933:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRpgindividual.g:1942:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1946:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalRpgindividual.g:1947:2: rule__Type__Group__1__Impl rule__Type__Group__2
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
    // InternalRpgindividual.g:1954:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1958:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:1959:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:1959:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalRpgindividual.g:1960:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:1961:2: ( rule__Type__NameAssignment_1 )
            // InternalRpgindividual.g:1961:3: rule__Type__NameAssignment_1
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
    // InternalRpgindividual.g:1969:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1973:1: ( rule__Type__Group__2__Impl )
            // InternalRpgindividual.g:1974:2: rule__Type__Group__2__Impl
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
    // InternalRpgindividual.g:1980:1: rule__Type__Group__2__Impl : ( ( rule__Type__TExpressionAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:1984:1: ( ( ( rule__Type__TExpressionAssignment_2 )? ) )
            // InternalRpgindividual.g:1985:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            {
            // InternalRpgindividual.g:1985:1: ( ( rule__Type__TExpressionAssignment_2 )? )
            // InternalRpgindividual.g:1986:2: ( rule__Type__TExpressionAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getTExpressionAssignment_2()); 
            // InternalRpgindividual.g:1987:2: ( rule__Type__TExpressionAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRpgindividual.g:1987:3: rule__Type__TExpressionAssignment_2
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
    // InternalRpgindividual.g:1996:1: rule__TypeExpression__Group__0 : rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 ;
    public final void rule__TypeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2000:1: ( rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1 )
            // InternalRpgindividual.g:2001:2: rule__TypeExpression__Group__0__Impl rule__TypeExpression__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalRpgindividual.g:2008:1: rule__TypeExpression__Group__0__Impl : ( ( rule__TypeExpression__StrongAssignment_0 ) ) ;
    public final void rule__TypeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2012:1: ( ( ( rule__TypeExpression__StrongAssignment_0 ) ) )
            // InternalRpgindividual.g:2013:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            {
            // InternalRpgindividual.g:2013:1: ( ( rule__TypeExpression__StrongAssignment_0 ) )
            // InternalRpgindividual.g:2014:2: ( rule__TypeExpression__StrongAssignment_0 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongAssignment_0()); 
            // InternalRpgindividual.g:2015:2: ( rule__TypeExpression__StrongAssignment_0 )
            // InternalRpgindividual.g:2015:3: rule__TypeExpression__StrongAssignment_0
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
    // InternalRpgindividual.g:2023:1: rule__TypeExpression__Group__1 : rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 ;
    public final void rule__TypeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2027:1: ( rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2 )
            // InternalRpgindividual.g:2028:2: rule__TypeExpression__Group__1__Impl rule__TypeExpression__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalRpgindividual.g:2035:1: rule__TypeExpression__Group__1__Impl : ( ( rule__TypeExpression__Group_1__0 )* ) ;
    public final void rule__TypeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2039:1: ( ( ( rule__TypeExpression__Group_1__0 )* ) )
            // InternalRpgindividual.g:2040:1: ( ( rule__TypeExpression__Group_1__0 )* )
            {
            // InternalRpgindividual.g:2040:1: ( ( rule__TypeExpression__Group_1__0 )* )
            // InternalRpgindividual.g:2041:2: ( rule__TypeExpression__Group_1__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_1()); 
            // InternalRpgindividual.g:2042:2: ( rule__TypeExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRpgindividual.g:2042:3: rule__TypeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TypeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalRpgindividual.g:2050:1: rule__TypeExpression__Group__2 : rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 ;
    public final void rule__TypeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2054:1: ( rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3 )
            // InternalRpgindividual.g:2055:2: rule__TypeExpression__Group__2__Impl rule__TypeExpression__Group__3
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
    // InternalRpgindividual.g:2062:1: rule__TypeExpression__Group__2__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2066:1: ( ( '<' ) )
            // InternalRpgindividual.g:2067:1: ( '<' )
            {
            // InternalRpgindividual.g:2067:1: ( '<' )
            // InternalRpgindividual.g:2068:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRpgindividual.g:2077:1: rule__TypeExpression__Group__3 : rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 ;
    public final void rule__TypeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2081:1: ( rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4 )
            // InternalRpgindividual.g:2082:2: rule__TypeExpression__Group__3__Impl rule__TypeExpression__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRpgindividual.g:2089:1: rule__TypeExpression__Group__3__Impl : ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) ;
    public final void rule__TypeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2093:1: ( ( ( rule__TypeExpression__CurrentTAssignment_3 ) ) )
            // InternalRpgindividual.g:2094:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            {
            // InternalRpgindividual.g:2094:1: ( ( rule__TypeExpression__CurrentTAssignment_3 ) )
            // InternalRpgindividual.g:2095:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTAssignment_3()); 
            // InternalRpgindividual.g:2096:2: ( rule__TypeExpression__CurrentTAssignment_3 )
            // InternalRpgindividual.g:2096:3: rule__TypeExpression__CurrentTAssignment_3
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
    // InternalRpgindividual.g:2104:1: rule__TypeExpression__Group__4 : rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 ;
    public final void rule__TypeExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2108:1: ( rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5 )
            // InternalRpgindividual.g:2109:2: rule__TypeExpression__Group__4__Impl rule__TypeExpression__Group__5
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
    // InternalRpgindividual.g:2116:1: rule__TypeExpression__Group__4__Impl : ( '<' ) ;
    public final void rule__TypeExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2120:1: ( ( '<' ) )
            // InternalRpgindividual.g:2121:1: ( '<' )
            {
            // InternalRpgindividual.g:2121:1: ( '<' )
            // InternalRpgindividual.g:2122:2: '<'
            {
             before(grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRpgindividual.g:2131:1: rule__TypeExpression__Group__5 : rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 ;
    public final void rule__TypeExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2135:1: ( rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6 )
            // InternalRpgindividual.g:2136:2: rule__TypeExpression__Group__5__Impl rule__TypeExpression__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalRpgindividual.g:2143:1: rule__TypeExpression__Group__5__Impl : ( ( rule__TypeExpression__WeakAssignment_5 ) ) ;
    public final void rule__TypeExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2147:1: ( ( ( rule__TypeExpression__WeakAssignment_5 ) ) )
            // InternalRpgindividual.g:2148:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            {
            // InternalRpgindividual.g:2148:1: ( ( rule__TypeExpression__WeakAssignment_5 ) )
            // InternalRpgindividual.g:2149:2: ( rule__TypeExpression__WeakAssignment_5 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakAssignment_5()); 
            // InternalRpgindividual.g:2150:2: ( rule__TypeExpression__WeakAssignment_5 )
            // InternalRpgindividual.g:2150:3: rule__TypeExpression__WeakAssignment_5
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
    // InternalRpgindividual.g:2158:1: rule__TypeExpression__Group__6 : rule__TypeExpression__Group__6__Impl ;
    public final void rule__TypeExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2162:1: ( rule__TypeExpression__Group__6__Impl )
            // InternalRpgindividual.g:2163:2: rule__TypeExpression__Group__6__Impl
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
    // InternalRpgindividual.g:2169:1: rule__TypeExpression__Group__6__Impl : ( ( rule__TypeExpression__Group_6__0 )* ) ;
    public final void rule__TypeExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2173:1: ( ( ( rule__TypeExpression__Group_6__0 )* ) )
            // InternalRpgindividual.g:2174:1: ( ( rule__TypeExpression__Group_6__0 )* )
            {
            // InternalRpgindividual.g:2174:1: ( ( rule__TypeExpression__Group_6__0 )* )
            // InternalRpgindividual.g:2175:2: ( rule__TypeExpression__Group_6__0 )*
            {
             before(grammarAccess.getTypeExpressionAccess().getGroup_6()); 
            // InternalRpgindividual.g:2176:2: ( rule__TypeExpression__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgindividual.g:2176:3: rule__TypeExpression__Group_6__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TypeExpression__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalRpgindividual.g:2185:1: rule__TypeExpression__Group_1__0 : rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 ;
    public final void rule__TypeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2189:1: ( rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1 )
            // InternalRpgindividual.g:2190:2: rule__TypeExpression__Group_1__0__Impl rule__TypeExpression__Group_1__1
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
    // InternalRpgindividual.g:2197:1: rule__TypeExpression__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2201:1: ( ( ',' ) )
            // InternalRpgindividual.g:2202:1: ( ',' )
            {
            // InternalRpgindividual.g:2202:1: ( ',' )
            // InternalRpgindividual.g:2203:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRpgindividual.g:2212:1: rule__TypeExpression__Group_1__1 : rule__TypeExpression__Group_1__1__Impl ;
    public final void rule__TypeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2216:1: ( rule__TypeExpression__Group_1__1__Impl )
            // InternalRpgindividual.g:2217:2: rule__TypeExpression__Group_1__1__Impl
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
    // InternalRpgindividual.g:2223:1: rule__TypeExpression__Group_1__1__Impl : ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) ;
    public final void rule__TypeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2227:1: ( ( ( rule__TypeExpression__Strong2Assignment_1_1 ) ) )
            // InternalRpgindividual.g:2228:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            {
            // InternalRpgindividual.g:2228:1: ( ( rule__TypeExpression__Strong2Assignment_1_1 ) )
            // InternalRpgindividual.g:2229:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2Assignment_1_1()); 
            // InternalRpgindividual.g:2230:2: ( rule__TypeExpression__Strong2Assignment_1_1 )
            // InternalRpgindividual.g:2230:3: rule__TypeExpression__Strong2Assignment_1_1
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
    // InternalRpgindividual.g:2239:1: rule__TypeExpression__Group_6__0 : rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 ;
    public final void rule__TypeExpression__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2243:1: ( rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1 )
            // InternalRpgindividual.g:2244:2: rule__TypeExpression__Group_6__0__Impl rule__TypeExpression__Group_6__1
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
    // InternalRpgindividual.g:2251:1: rule__TypeExpression__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TypeExpression__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2255:1: ( ( ',' ) )
            // InternalRpgindividual.g:2256:1: ( ',' )
            {
            // InternalRpgindividual.g:2256:1: ( ',' )
            // InternalRpgindividual.g:2257:2: ','
            {
             before(grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalRpgindividual.g:2266:1: rule__TypeExpression__Group_6__1 : rule__TypeExpression__Group_6__1__Impl ;
    public final void rule__TypeExpression__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2270:1: ( rule__TypeExpression__Group_6__1__Impl )
            // InternalRpgindividual.g:2271:2: rule__TypeExpression__Group_6__1__Impl
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
    // InternalRpgindividual.g:2277:1: rule__TypeExpression__Group_6__1__Impl : ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) ;
    public final void rule__TypeExpression__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2281:1: ( ( ( rule__TypeExpression__Weak2Assignment_6_1 ) ) )
            // InternalRpgindividual.g:2282:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            {
            // InternalRpgindividual.g:2282:1: ( ( rule__TypeExpression__Weak2Assignment_6_1 ) )
            // InternalRpgindividual.g:2283:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2Assignment_6_1()); 
            // InternalRpgindividual.g:2284:2: ( rule__TypeExpression__Weak2Assignment_6_1 )
            // InternalRpgindividual.g:2284:3: rule__TypeExpression__Weak2Assignment_6_1
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
    // InternalRpgindividual.g:2293:1: rule__Moves__Group__0 : rule__Moves__Group__0__Impl rule__Moves__Group__1 ;
    public final void rule__Moves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2297:1: ( rule__Moves__Group__0__Impl rule__Moves__Group__1 )
            // InternalRpgindividual.g:2298:2: rule__Moves__Group__0__Impl rule__Moves__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRpgindividual.g:2305:1: rule__Moves__Group__0__Impl : ( 'moves' ) ;
    public final void rule__Moves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2309:1: ( ( 'moves' ) )
            // InternalRpgindividual.g:2310:1: ( 'moves' )
            {
            // InternalRpgindividual.g:2310:1: ( 'moves' )
            // InternalRpgindividual.g:2311:2: 'moves'
            {
             before(grammarAccess.getMovesAccess().getMovesKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRpgindividual.g:2320:1: rule__Moves__Group__1 : rule__Moves__Group__1__Impl ;
    public final void rule__Moves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2324:1: ( rule__Moves__Group__1__Impl )
            // InternalRpgindividual.g:2325:2: rule__Moves__Group__1__Impl
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
    // InternalRpgindividual.g:2331:1: rule__Moves__Group__1__Impl : ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) ;
    public final void rule__Moves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2335:1: ( ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2336:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2336:1: ( ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:2337:2: ( ( rule__Moves__MoveAssignment_1 ) ) ( ( rule__Moves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:2337:2: ( ( rule__Moves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:2338:3: ( rule__Moves__MoveAssignment_1 )
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2339:3: ( rule__Moves__MoveAssignment_1 )
            // InternalRpgindividual.g:2339:4: rule__Moves__MoveAssignment_1
            {
            pushFollow(FOLLOW_21);
            rule__Moves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:2342:2: ( ( rule__Moves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:2343:3: ( rule__Moves__MoveAssignment_1 )*
            {
             before(grammarAccess.getMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:2344:3: ( rule__Moves__MoveAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:2344:4: rule__Moves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Moves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRpgindividual.g:2354:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2358:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalRpgindividual.g:2359:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalRpgindividual.g:2366:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2370:1: ( ( 'move' ) )
            // InternalRpgindividual.g:2371:1: ( 'move' )
            {
            // InternalRpgindividual.g:2371:1: ( 'move' )
            // InternalRpgindividual.g:2372:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRpgindividual.g:2381:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2385:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalRpgindividual.g:2386:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRpgindividual.g:2393:1: rule__Move__Group__1__Impl : ( ( rule__Move__NameAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2397:1: ( ( ( rule__Move__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:2398:1: ( ( rule__Move__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2398:1: ( ( rule__Move__NameAssignment_1 ) )
            // InternalRpgindividual.g:2399:2: ( rule__Move__NameAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:2400:2: ( rule__Move__NameAssignment_1 )
            // InternalRpgindividual.g:2400:3: rule__Move__NameAssignment_1
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
    // InternalRpgindividual.g:2408:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2412:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalRpgindividual.g:2413:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRpgindividual.g:2420:1: rule__Move__Group__2__Impl : ( ( rule__Move__ETypeAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2424:1: ( ( ( rule__Move__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:2425:1: ( ( rule__Move__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:2425:1: ( ( rule__Move__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:2426:2: ( rule__Move__ETypeAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:2427:2: ( rule__Move__ETypeAssignment_2 )
            // InternalRpgindividual.g:2427:3: rule__Move__ETypeAssignment_2
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
    // InternalRpgindividual.g:2435:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2439:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalRpgindividual.g:2440:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalRpgindividual.g:2447:1: rule__Move__Group__3__Impl : ( ( rule__Move__AttAssignment_3 )* ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2451:1: ( ( ( rule__Move__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:2452:1: ( ( rule__Move__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:2452:1: ( ( rule__Move__AttAssignment_3 )* )
            // InternalRpgindividual.g:2453:2: ( rule__Move__AttAssignment_3 )*
            {
             before(grammarAccess.getMoveAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:2454:2: ( rule__Move__AttAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:2454:3: rule__Move__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Move__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalRpgindividual.g:2462:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2466:1: ( rule__Move__Group__4__Impl )
            // InternalRpgindividual.g:2467:2: rule__Move__Group__4__Impl
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
    // InternalRpgindividual.g:2473:1: rule__Move__Group__4__Impl : ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2477:1: ( ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) ) )
            // InternalRpgindividual.g:2478:1: ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) )
            {
            // InternalRpgindividual.g:2478:1: ( ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* ) )
            // InternalRpgindividual.g:2479:2: ( ( rule__Move__MEffectAssignment_4 ) ) ( ( rule__Move__MEffectAssignment_4 )* )
            {
            // InternalRpgindividual.g:2479:2: ( ( rule__Move__MEffectAssignment_4 ) )
            // InternalRpgindividual.g:2480:3: ( rule__Move__MEffectAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 
            // InternalRpgindividual.g:2481:3: ( rule__Move__MEffectAssignment_4 )
            // InternalRpgindividual.g:2481:4: rule__Move__MEffectAssignment_4
            {
            pushFollow(FOLLOW_23);
            rule__Move__MEffectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 

            }

            // InternalRpgindividual.g:2484:2: ( ( rule__Move__MEffectAssignment_4 )* )
            // InternalRpgindividual.g:2485:3: ( rule__Move__MEffectAssignment_4 )*
            {
             before(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 
            // InternalRpgindividual.g:2486:3: ( rule__Move__MEffectAssignment_4 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:2486:4: rule__Move__MEffectAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Move__MEffectAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMoveAccess().getMEffectAssignment_4()); 

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
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__MEffect__Group__0"
    // InternalRpgindividual.g:2496:1: rule__MEffect__Group__0 : rule__MEffect__Group__0__Impl rule__MEffect__Group__1 ;
    public final void rule__MEffect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2500:1: ( rule__MEffect__Group__0__Impl rule__MEffect__Group__1 )
            // InternalRpgindividual.g:2501:2: rule__MEffect__Group__0__Impl rule__MEffect__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRpgindividual.g:2508:1: rule__MEffect__Group__0__Impl : ( 'effect' ) ;
    public final void rule__MEffect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2512:1: ( ( 'effect' ) )
            // InternalRpgindividual.g:2513:1: ( 'effect' )
            {
            // InternalRpgindividual.g:2513:1: ( 'effect' )
            // InternalRpgindividual.g:2514:2: 'effect'
            {
             before(grammarAccess.getMEffectAccess().getEffectKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRpgindividual.g:2523:1: rule__MEffect__Group__1 : rule__MEffect__Group__1__Impl ;
    public final void rule__MEffect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2527:1: ( rule__MEffect__Group__1__Impl )
            // InternalRpgindividual.g:2528:2: rule__MEffect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__Group__1__Impl();

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
    // InternalRpgindividual.g:2534:1: rule__MEffect__Group__1__Impl : ( ( rule__MEffect__MoveENameAssignment_1 ) ) ;
    public final void rule__MEffect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2538:1: ( ( ( rule__MEffect__MoveENameAssignment_1 ) ) )
            // InternalRpgindividual.g:2539:1: ( ( rule__MEffect__MoveENameAssignment_1 ) )
            {
            // InternalRpgindividual.g:2539:1: ( ( rule__MEffect__MoveENameAssignment_1 ) )
            // InternalRpgindividual.g:2540:2: ( rule__MEffect__MoveENameAssignment_1 )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameAssignment_1()); 
            // InternalRpgindividual.g:2541:2: ( rule__MEffect__MoveENameAssignment_1 )
            // InternalRpgindividual.g:2541:3: rule__MEffect__MoveENameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MEffect__MoveENameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMEffectAccess().getMoveENameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EType__Group__0"
    // InternalRpgindividual.g:2550:1: rule__EType__Group__0 : rule__EType__Group__0__Impl rule__EType__Group__1 ;
    public final void rule__EType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2554:1: ( rule__EType__Group__0__Impl rule__EType__Group__1 )
            // InternalRpgindividual.g:2555:2: rule__EType__Group__0__Impl rule__EType__Group__1
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
    // InternalRpgindividual.g:2562:1: rule__EType__Group__0__Impl : ( 'type' ) ;
    public final void rule__EType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2566:1: ( ( 'type' ) )
            // InternalRpgindividual.g:2567:1: ( 'type' )
            {
            // InternalRpgindividual.g:2567:1: ( 'type' )
            // InternalRpgindividual.g:2568:2: 'type'
            {
             before(grammarAccess.getETypeAccess().getTypeKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRpgindividual.g:2577:1: rule__EType__Group__1 : rule__EType__Group__1__Impl ;
    public final void rule__EType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2581:1: ( rule__EType__Group__1__Impl )
            // InternalRpgindividual.g:2582:2: rule__EType__Group__1__Impl
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
    // InternalRpgindividual.g:2588:1: rule__EType__Group__1__Impl : ( ( rule__EType__TypeAssignment_1 ) ) ;
    public final void rule__EType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2592:1: ( ( ( rule__EType__TypeAssignment_1 ) ) )
            // InternalRpgindividual.g:2593:1: ( ( rule__EType__TypeAssignment_1 ) )
            {
            // InternalRpgindividual.g:2593:1: ( ( rule__EType__TypeAssignment_1 ) )
            // InternalRpgindividual.g:2594:2: ( rule__EType__TypeAssignment_1 )
            {
             before(grammarAccess.getETypeAccess().getTypeAssignment_1()); 
            // InternalRpgindividual.g:2595:2: ( rule__EType__TypeAssignment_1 )
            // InternalRpgindividual.g:2595:3: rule__EType__TypeAssignment_1
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
    // InternalRpgindividual.g:2604:1: rule__AttributeValues__Group__0 : rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 ;
    public final void rule__AttributeValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2608:1: ( rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1 )
            // InternalRpgindividual.g:2609:2: rule__AttributeValues__Group__0__Impl rule__AttributeValues__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRpgindividual.g:2616:1: rule__AttributeValues__Group__0__Impl : ( 'is' ) ;
    public final void rule__AttributeValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2620:1: ( ( 'is' ) )
            // InternalRpgindividual.g:2621:1: ( 'is' )
            {
            // InternalRpgindividual.g:2621:1: ( 'is' )
            // InternalRpgindividual.g:2622:2: 'is'
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
    // InternalRpgindividual.g:2631:1: rule__AttributeValues__Group__1 : rule__AttributeValues__Group__1__Impl ;
    public final void rule__AttributeValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2635:1: ( rule__AttributeValues__Group__1__Impl )
            // InternalRpgindividual.g:2636:2: rule__AttributeValues__Group__1__Impl
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
    // InternalRpgindividual.g:2642:1: rule__AttributeValues__Group__1__Impl : ( ( rule__AttributeValues__Alternatives_1 ) ) ;
    public final void rule__AttributeValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2646:1: ( ( ( rule__AttributeValues__Alternatives_1 ) ) )
            // InternalRpgindividual.g:2647:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            {
            // InternalRpgindividual.g:2647:1: ( ( rule__AttributeValues__Alternatives_1 ) )
            // InternalRpgindividual.g:2648:2: ( rule__AttributeValues__Alternatives_1 )
            {
             before(grammarAccess.getAttributeValuesAccess().getAlternatives_1()); 
            // InternalRpgindividual.g:2649:2: ( rule__AttributeValues__Alternatives_1 )
            // InternalRpgindividual.g:2649:3: rule__AttributeValues__Alternatives_1
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
    // InternalRpgindividual.g:2658:1: rule__AltAttribute__Group__0 : rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 ;
    public final void rule__AltAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2662:1: ( rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1 )
            // InternalRpgindividual.g:2663:2: rule__AltAttribute__Group__0__Impl rule__AltAttribute__Group__1
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
    // InternalRpgindividual.g:2670:1: rule__AltAttribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__AltAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2674:1: ( ( 'attribute' ) )
            // InternalRpgindividual.g:2675:1: ( 'attribute' )
            {
            // InternalRpgindividual.g:2675:1: ( 'attribute' )
            // InternalRpgindividual.g:2676:2: 'attribute'
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRpgindividual.g:2685:1: rule__AltAttribute__Group__1 : rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 ;
    public final void rule__AltAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2689:1: ( rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2 )
            // InternalRpgindividual.g:2690:2: rule__AltAttribute__Group__1__Impl rule__AltAttribute__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRpgindividual.g:2697:1: rule__AltAttribute__Group__1__Impl : ( ( rule__AltAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__AltAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2701:1: ( ( ( rule__AltAttribute__AttributeAssignment_1 ) ) )
            // InternalRpgindividual.g:2702:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            {
            // InternalRpgindividual.g:2702:1: ( ( rule__AltAttribute__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:2703:2: ( rule__AltAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:2704:2: ( rule__AltAttribute__AttributeAssignment_1 )
            // InternalRpgindividual.g:2704:3: rule__AltAttribute__AttributeAssignment_1
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
    // InternalRpgindividual.g:2712:1: rule__AltAttribute__Group__2 : rule__AltAttribute__Group__2__Impl ;
    public final void rule__AltAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2716:1: ( rule__AltAttribute__Group__2__Impl )
            // InternalRpgindividual.g:2717:2: rule__AltAttribute__Group__2__Impl
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
    // InternalRpgindividual.g:2723:1: rule__AltAttribute__Group__2__Impl : ( ( rule__AltAttribute__AvAssignment_2 )? ) ;
    public final void rule__AltAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2727:1: ( ( ( rule__AltAttribute__AvAssignment_2 )? ) )
            // InternalRpgindividual.g:2728:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            {
            // InternalRpgindividual.g:2728:1: ( ( rule__AltAttribute__AvAssignment_2 )? )
            // InternalRpgindividual.g:2729:2: ( rule__AltAttribute__AvAssignment_2 )?
            {
             before(grammarAccess.getAltAttributeAccess().getAvAssignment_2()); 
            // InternalRpgindividual.g:2730:2: ( rule__AltAttribute__AvAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRpgindividual.g:2730:3: rule__AltAttribute__AvAssignment_2
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
    // InternalRpgindividual.g:2739:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2743:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRpgindividual.g:2744:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRpgindividual.g:2751:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__Group_0__0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2755:1: ( ( ( rule__Rule__Group_0__0 )? ) )
            // InternalRpgindividual.g:2756:1: ( ( rule__Rule__Group_0__0 )? )
            {
            // InternalRpgindividual.g:2756:1: ( ( rule__Rule__Group_0__0 )? )
            // InternalRpgindividual.g:2757:2: ( rule__Rule__Group_0__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_0()); 
            // InternalRpgindividual.g:2758:2: ( rule__Rule__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRpgindividual.g:2758:3: rule__Rule__Group_0__0
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
    // InternalRpgindividual.g:2766:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2770:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRpgindividual.g:2771:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRpgindividual.g:2778:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__TargetThenAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2782:1: ( ( ( rule__Rule__TargetThenAssignment_1 ) ) )
            // InternalRpgindividual.g:2783:1: ( ( rule__Rule__TargetThenAssignment_1 ) )
            {
            // InternalRpgindividual.g:2783:1: ( ( rule__Rule__TargetThenAssignment_1 ) )
            // InternalRpgindividual.g:2784:2: ( rule__Rule__TargetThenAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getTargetThenAssignment_1()); 
            // InternalRpgindividual.g:2785:2: ( rule__Rule__TargetThenAssignment_1 )
            // InternalRpgindividual.g:2785:3: rule__Rule__TargetThenAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetThenAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetThenAssignment_1()); 

            }


            }

        }
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
    // InternalRpgindividual.g:2793:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2797:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRpgindividual.g:2798:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRpgindividual.g:2805:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TargetAttAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2809:1: ( ( ( rule__Rule__TargetAttAssignment_2 ) ) )
            // InternalRpgindividual.g:2810:1: ( ( rule__Rule__TargetAttAssignment_2 ) )
            {
            // InternalRpgindividual.g:2810:1: ( ( rule__Rule__TargetAttAssignment_2 ) )
            // InternalRpgindividual.g:2811:2: ( rule__Rule__TargetAttAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTargetAttAssignment_2()); 
            // InternalRpgindividual.g:2812:2: ( rule__Rule__TargetAttAssignment_2 )
            // InternalRpgindividual.g:2812:3: rule__Rule__TargetAttAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TargetAttAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTargetAttAssignment_2()); 

            }


            }

        }
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
    // InternalRpgindividual.g:2820:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2824:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRpgindividual.g:2825:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // InternalRpgindividual.g:2832:1: rule__Rule__Group__3__Impl : ( 'is' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2836:1: ( ( 'is' ) )
            // InternalRpgindividual.g:2837:1: ( 'is' )
            {
            // InternalRpgindividual.g:2837:1: ( 'is' )
            // InternalRpgindividual.g:2838:2: 'is'
            {
             before(grammarAccess.getRuleAccess().getIsKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getIsKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group__4"
    // InternalRpgindividual.g:2847:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2851:1: ( rule__Rule__Group__4__Impl )
            // InternalRpgindividual.g:2852:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalRpgindividual.g:2858:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__SumAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2862:1: ( ( ( rule__Rule__SumAssignment_4 ) ) )
            // InternalRpgindividual.g:2863:1: ( ( rule__Rule__SumAssignment_4 ) )
            {
            // InternalRpgindividual.g:2863:1: ( ( rule__Rule__SumAssignment_4 ) )
            // InternalRpgindividual.g:2864:2: ( rule__Rule__SumAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getSumAssignment_4()); 
            // InternalRpgindividual.g:2865:2: ( rule__Rule__SumAssignment_4 )
            // InternalRpgindividual.g:2865:3: rule__Rule__SumAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSumAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalRpgindividual.g:2874:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2878:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalRpgindividual.g:2879:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:2886:1: rule__Rule__Group_0__0__Impl : ( 'if' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2890:1: ( ( 'if' ) )
            // InternalRpgindividual.g:2891:1: ( 'if' )
            {
            // InternalRpgindividual.g:2891:1: ( 'if' )
            // InternalRpgindividual.g:2892:2: 'if'
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
    // InternalRpgindividual.g:2901:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2905:1: ( rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2 )
            // InternalRpgindividual.g:2906:2: rule__Rule__Group_0__1__Impl rule__Rule__Group_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalRpgindividual.g:2913:1: rule__Rule__Group_0__1__Impl : ( ( rule__Rule__OrAssignment_0_1 ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2917:1: ( ( ( rule__Rule__OrAssignment_0_1 ) ) )
            // InternalRpgindividual.g:2918:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            {
            // InternalRpgindividual.g:2918:1: ( ( rule__Rule__OrAssignment_0_1 ) )
            // InternalRpgindividual.g:2919:2: ( rule__Rule__OrAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getOrAssignment_0_1()); 
            // InternalRpgindividual.g:2920:2: ( rule__Rule__OrAssignment_0_1 )
            // InternalRpgindividual.g:2920:3: rule__Rule__OrAssignment_0_1
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
    // InternalRpgindividual.g:2928:1: rule__Rule__Group_0__2 : rule__Rule__Group_0__2__Impl ;
    public final void rule__Rule__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2932:1: ( rule__Rule__Group_0__2__Impl )
            // InternalRpgindividual.g:2933:2: rule__Rule__Group_0__2__Impl
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
    // InternalRpgindividual.g:2939:1: rule__Rule__Group_0__2__Impl : ( 'then' ) ;
    public final void rule__Rule__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2943:1: ( ( 'then' ) )
            // InternalRpgindividual.g:2944:1: ( 'then' )
            {
            // InternalRpgindividual.g:2944:1: ( 'then' )
            // InternalRpgindividual.g:2945:2: 'then'
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
    // InternalRpgindividual.g:2955:1: rule__Entities__Group__0 : rule__Entities__Group__0__Impl rule__Entities__Group__1 ;
    public final void rule__Entities__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2959:1: ( rule__Entities__Group__0__Impl rule__Entities__Group__1 )
            // InternalRpgindividual.g:2960:2: rule__Entities__Group__0__Impl rule__Entities__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRpgindividual.g:2967:1: rule__Entities__Group__0__Impl : ( 'entities' ) ;
    public final void rule__Entities__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2971:1: ( ( 'entities' ) )
            // InternalRpgindividual.g:2972:1: ( 'entities' )
            {
            // InternalRpgindividual.g:2972:1: ( 'entities' )
            // InternalRpgindividual.g:2973:2: 'entities'
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
    // InternalRpgindividual.g:2982:1: rule__Entities__Group__1 : rule__Entities__Group__1__Impl ;
    public final void rule__Entities__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2986:1: ( rule__Entities__Group__1__Impl )
            // InternalRpgindividual.g:2987:2: rule__Entities__Group__1__Impl
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
    // InternalRpgindividual.g:2993:1: rule__Entities__Group__1__Impl : ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) ;
    public final void rule__Entities__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:2997:1: ( ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:2998:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:2998:1: ( ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:2999:2: ( ( rule__Entities__EntityAssignment_1 ) ) ( ( rule__Entities__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:2999:2: ( ( rule__Entities__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3000:3: ( rule__Entities__EntityAssignment_1 )
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3001:3: ( rule__Entities__EntityAssignment_1 )
            // InternalRpgindividual.g:3001:4: rule__Entities__EntityAssignment_1
            {
            pushFollow(FOLLOW_29);
            rule__Entities__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3004:2: ( ( rule__Entities__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3005:3: ( rule__Entities__EntityAssignment_1 )*
            {
             before(grammarAccess.getEntitiesAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3006:3: ( rule__Entities__EntityAssignment_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRpgindividual.g:3006:4: rule__Entities__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Entities__EntityAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalRpgindividual.g:3016:1: rule__Death__Group__0 : rule__Death__Group__0__Impl rule__Death__Group__1 ;
    public final void rule__Death__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3020:1: ( rule__Death__Group__0__Impl rule__Death__Group__1 )
            // InternalRpgindividual.g:3021:2: rule__Death__Group__0__Impl rule__Death__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRpgindividual.g:3028:1: rule__Death__Group__0__Impl : ( 'death' ) ;
    public final void rule__Death__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3032:1: ( ( 'death' ) )
            // InternalRpgindividual.g:3033:1: ( 'death' )
            {
            // InternalRpgindividual.g:3033:1: ( 'death' )
            // InternalRpgindividual.g:3034:2: 'death'
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
    // InternalRpgindividual.g:3043:1: rule__Death__Group__1 : rule__Death__Group__1__Impl rule__Death__Group__2 ;
    public final void rule__Death__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3047:1: ( rule__Death__Group__1__Impl rule__Death__Group__2 )
            // InternalRpgindividual.g:3048:2: rule__Death__Group__1__Impl rule__Death__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Death__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Death__Group__2();

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
    // InternalRpgindividual.g:3055:1: rule__Death__Group__1__Impl : ( 'when' ) ;
    public final void rule__Death__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3059:1: ( ( 'when' ) )
            // InternalRpgindividual.g:3060:1: ( 'when' )
            {
            // InternalRpgindividual.g:3060:1: ( 'when' )
            // InternalRpgindividual.g:3061:2: 'when'
            {
             before(grammarAccess.getDeathAccess().getWhenKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeathAccess().getWhenKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Death__Group__2"
    // InternalRpgindividual.g:3070:1: rule__Death__Group__2 : rule__Death__Group__2__Impl ;
    public final void rule__Death__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3074:1: ( rule__Death__Group__2__Impl )
            // InternalRpgindividual.g:3075:2: rule__Death__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Death__Group__2__Impl();

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
    // $ANTLR end "rule__Death__Group__2"


    // $ANTLR start "rule__Death__Group__2__Impl"
    // InternalRpgindividual.g:3081:1: rule__Death__Group__2__Impl : ( ( rule__Death__LogAssignment_2 ) ) ;
    public final void rule__Death__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3085:1: ( ( ( rule__Death__LogAssignment_2 ) ) )
            // InternalRpgindividual.g:3086:1: ( ( rule__Death__LogAssignment_2 ) )
            {
            // InternalRpgindividual.g:3086:1: ( ( rule__Death__LogAssignment_2 ) )
            // InternalRpgindividual.g:3087:2: ( rule__Death__LogAssignment_2 )
            {
             before(grammarAccess.getDeathAccess().getLogAssignment_2()); 
            // InternalRpgindividual.g:3088:2: ( rule__Death__LogAssignment_2 )
            // InternalRpgindividual.g:3088:3: rule__Death__LogAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Death__LogAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeathAccess().getLogAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalRpgindividual.g:3097:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3101:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalRpgindividual.g:3102:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalRpgindividual.g:3109:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3113:1: ( ( 'entity' ) )
            // InternalRpgindividual.g:3114:1: ( 'entity' )
            {
            // InternalRpgindividual.g:3114:1: ( 'entity' )
            // InternalRpgindividual.g:3115:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRpgindividual.g:3124:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3128:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalRpgindividual.g:3129:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRpgindividual.g:3136:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3140:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3141:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3141:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalRpgindividual.g:3142:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3143:2: ( rule__Entity__NameAssignment_1 )
            // InternalRpgindividual.g:3143:3: rule__Entity__NameAssignment_1
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
    // InternalRpgindividual.g:3151:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3155:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalRpgindividual.g:3156:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalRpgindividual.g:3163:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__ETypeAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3167:1: ( ( ( rule__Entity__ETypeAssignment_2 ) ) )
            // InternalRpgindividual.g:3168:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            {
            // InternalRpgindividual.g:3168:1: ( ( rule__Entity__ETypeAssignment_2 ) )
            // InternalRpgindividual.g:3169:2: ( rule__Entity__ETypeAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getETypeAssignment_2()); 
            // InternalRpgindividual.g:3170:2: ( rule__Entity__ETypeAssignment_2 )
            // InternalRpgindividual.g:3170:3: rule__Entity__ETypeAssignment_2
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
    // InternalRpgindividual.g:3178:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3182:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalRpgindividual.g:3183:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalRpgindividual.g:3190:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3194:1: ( ( ( rule__Entity__AttAssignment_3 )* ) )
            // InternalRpgindividual.g:3195:1: ( ( rule__Entity__AttAssignment_3 )* )
            {
            // InternalRpgindividual.g:3195:1: ( ( rule__Entity__AttAssignment_3 )* )
            // InternalRpgindividual.g:3196:2: ( rule__Entity__AttAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttAssignment_3()); 
            // InternalRpgindividual.g:3197:2: ( rule__Entity__AttAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRpgindividual.g:3197:3: rule__Entity__AttAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__AttAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalRpgindividual.g:3205:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3209:1: ( rule__Entity__Group__4__Impl )
            // InternalRpgindividual.g:3210:2: rule__Entity__Group__4__Impl
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
    // InternalRpgindividual.g:3216:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__EMovesAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3220:1: ( ( ( rule__Entity__EMovesAssignment_4 ) ) )
            // InternalRpgindividual.g:3221:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            {
            // InternalRpgindividual.g:3221:1: ( ( rule__Entity__EMovesAssignment_4 ) )
            // InternalRpgindividual.g:3222:2: ( rule__Entity__EMovesAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getEMovesAssignment_4()); 
            // InternalRpgindividual.g:3223:2: ( rule__Entity__EMovesAssignment_4 )
            // InternalRpgindividual.g:3223:3: rule__Entity__EMovesAssignment_4
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
    // InternalRpgindividual.g:3232:1: rule__EntityMoves__Group__0 : rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 ;
    public final void rule__EntityMoves__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3236:1: ( rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1 )
            // InternalRpgindividual.g:3237:2: rule__EntityMoves__Group__0__Impl rule__EntityMoves__Group__1
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
    // InternalRpgindividual.g:3244:1: rule__EntityMoves__Group__0__Impl : ( 'move' ) ;
    public final void rule__EntityMoves__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3248:1: ( ( 'move' ) )
            // InternalRpgindividual.g:3249:1: ( 'move' )
            {
            // InternalRpgindividual.g:3249:1: ( 'move' )
            // InternalRpgindividual.g:3250:2: 'move'
            {
             before(grammarAccess.getEntityMovesAccess().getMoveKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRpgindividual.g:3259:1: rule__EntityMoves__Group__1 : rule__EntityMoves__Group__1__Impl ;
    public final void rule__EntityMoves__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3263:1: ( rule__EntityMoves__Group__1__Impl )
            // InternalRpgindividual.g:3264:2: rule__EntityMoves__Group__1__Impl
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
    // InternalRpgindividual.g:3270:1: rule__EntityMoves__Group__1__Impl : ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) ;
    public final void rule__EntityMoves__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3274:1: ( ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3275:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3275:1: ( ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* ) )
            // InternalRpgindividual.g:3276:2: ( ( rule__EntityMoves__MoveAssignment_1 ) ) ( ( rule__EntityMoves__MoveAssignment_1 )* )
            {
            // InternalRpgindividual.g:3276:2: ( ( rule__EntityMoves__MoveAssignment_1 ) )
            // InternalRpgindividual.g:3277:3: ( rule__EntityMoves__MoveAssignment_1 )
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3278:3: ( rule__EntityMoves__MoveAssignment_1 )
            // InternalRpgindividual.g:3278:4: rule__EntityMoves__MoveAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__EntityMoves__MoveAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 

            }

            // InternalRpgindividual.g:3281:2: ( ( rule__EntityMoves__MoveAssignment_1 )* )
            // InternalRpgindividual.g:3282:3: ( rule__EntityMoves__MoveAssignment_1 )*
            {
             before(grammarAccess.getEntityMovesAccess().getMoveAssignment_1()); 
            // InternalRpgindividual.g:3283:3: ( rule__EntityMoves__MoveAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRpgindividual.g:3283:4: rule__EntityMoves__MoveAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntityMoves__MoveAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__EntityMoveModifier__Group__0"
    // InternalRpgindividual.g:3293:1: rule__EntityMoveModifier__Group__0 : rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1 ;
    public final void rule__EntityMoveModifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3297:1: ( rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1 )
            // InternalRpgindividual.g:3298:2: rule__EntityMoveModifier__Group__0__Impl rule__EntityMoveModifier__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EntityMoveModifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__1();

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
    // $ANTLR end "rule__EntityMoveModifier__Group__0"


    // $ANTLR start "rule__EntityMoveModifier__Group__0__Impl"
    // InternalRpgindividual.g:3305:1: rule__EntityMoveModifier__Group__0__Impl : ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) ) ;
    public final void rule__EntityMoveModifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3309:1: ( ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) ) )
            // InternalRpgindividual.g:3310:1: ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) )
            {
            // InternalRpgindividual.g:3310:1: ( ( rule__EntityMoveModifier__MoveNameAssignment_0 ) )
            // InternalRpgindividual.g:3311:2: ( rule__EntityMoveModifier__MoveNameAssignment_0 )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameAssignment_0()); 
            // InternalRpgindividual.g:3312:2: ( rule__EntityMoveModifier__MoveNameAssignment_0 )
            // InternalRpgindividual.g:3312:3: rule__EntityMoveModifier__MoveNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__MoveNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__0__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__1"
    // InternalRpgindividual.g:3320:1: rule__EntityMoveModifier__Group__1 : rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2 ;
    public final void rule__EntityMoveModifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3324:1: ( rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2 )
            // InternalRpgindividual.g:3325:2: rule__EntityMoveModifier__Group__1__Impl rule__EntityMoveModifier__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__EntityMoveModifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__2();

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
    // $ANTLR end "rule__EntityMoveModifier__Group__1"


    // $ANTLR start "rule__EntityMoveModifier__Group__1__Impl"
    // InternalRpgindividual.g:3332:1: rule__EntityMoveModifier__Group__1__Impl : ( '(' ) ;
    public final void rule__EntityMoveModifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3336:1: ( ( '(' ) )
            // InternalRpgindividual.g:3337:1: ( '(' )
            {
            // InternalRpgindividual.g:3337:1: ( '(' )
            // InternalRpgindividual.g:3338:2: '('
            {
             before(grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__1__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__2"
    // InternalRpgindividual.g:3347:1: rule__EntityMoveModifier__Group__2 : rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3 ;
    public final void rule__EntityMoveModifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3351:1: ( rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3 )
            // InternalRpgindividual.g:3352:2: rule__EntityMoveModifier__Group__2__Impl rule__EntityMoveModifier__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__EntityMoveModifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__3();

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
    // $ANTLR end "rule__EntityMoveModifier__Group__2"


    // $ANTLR start "rule__EntityMoveModifier__Group__2__Impl"
    // InternalRpgindividual.g:3359:1: rule__EntityMoveModifier__Group__2__Impl : ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* ) ;
    public final void rule__EntityMoveModifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3363:1: ( ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* ) )
            // InternalRpgindividual.g:3364:1: ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* )
            {
            // InternalRpgindividual.g:3364:1: ( ( rule__EntityMoveModifier__MoveModificationAssignment_2 )* )
            // InternalRpgindividual.g:3365:2: ( rule__EntityMoveModifier__MoveModificationAssignment_2 )*
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveModificationAssignment_2()); 
            // InternalRpgindividual.g:3366:2: ( rule__EntityMoveModifier__MoveModificationAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRpgindividual.g:3366:3: rule__EntityMoveModifier__MoveModificationAssignment_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EntityMoveModifier__MoveModificationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getEntityMoveModifierAccess().getMoveModificationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__2__Impl"


    // $ANTLR start "rule__EntityMoveModifier__Group__3"
    // InternalRpgindividual.g:3374:1: rule__EntityMoveModifier__Group__3 : rule__EntityMoveModifier__Group__3__Impl ;
    public final void rule__EntityMoveModifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3378:1: ( rule__EntityMoveModifier__Group__3__Impl )
            // InternalRpgindividual.g:3379:2: rule__EntityMoveModifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveModifier__Group__3__Impl();

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
    // $ANTLR end "rule__EntityMoveModifier__Group__3"


    // $ANTLR start "rule__EntityMoveModifier__Group__3__Impl"
    // InternalRpgindividual.g:3385:1: rule__EntityMoveModifier__Group__3__Impl : ( ')' ) ;
    public final void rule__EntityMoveModifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3389:1: ( ( ')' ) )
            // InternalRpgindividual.g:3390:1: ( ')' )
            {
            // InternalRpgindividual.g:3390:1: ( ')' )
            // InternalRpgindividual.g:3391:2: ')'
            {
             before(grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__Group__3__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__0"
    // InternalRpgindividual.g:3401:1: rule__EntityMoveMultiplier__Group__0 : rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1 ;
    public final void rule__EntityMoveMultiplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3405:1: ( rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1 )
            // InternalRpgindividual.g:3406:2: rule__EntityMoveMultiplier__Group__0__Impl rule__EntityMoveMultiplier__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__EntityMoveMultiplier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__1();

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
    // $ANTLR end "rule__EntityMoveMultiplier__Group__0"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__0__Impl"
    // InternalRpgindividual.g:3413:1: rule__EntityMoveMultiplier__Group__0__Impl : ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) ) ;
    public final void rule__EntityMoveMultiplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3417:1: ( ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) ) )
            // InternalRpgindividual.g:3418:1: ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) )
            {
            // InternalRpgindividual.g:3418:1: ( ( rule__EntityMoveMultiplier__AttributeAssignment_0 ) )
            // InternalRpgindividual.g:3419:2: ( rule__EntityMoveMultiplier__AttributeAssignment_0 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAssignment_0()); 
            // InternalRpgindividual.g:3420:2: ( rule__EntityMoveMultiplier__AttributeAssignment_0 )
            // InternalRpgindividual.g:3420:3: rule__EntityMoveMultiplier__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__0__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__1"
    // InternalRpgindividual.g:3428:1: rule__EntityMoveMultiplier__Group__1 : rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2 ;
    public final void rule__EntityMoveMultiplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3432:1: ( rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2 )
            // InternalRpgindividual.g:3433:2: rule__EntityMoveMultiplier__Group__1__Impl rule__EntityMoveMultiplier__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EntityMoveMultiplier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__2();

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
    // $ANTLR end "rule__EntityMoveMultiplier__Group__1"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__1__Impl"
    // InternalRpgindividual.g:3440:1: rule__EntityMoveMultiplier__Group__1__Impl : ( '*' ) ;
    public final void rule__EntityMoveMultiplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3444:1: ( ( '*' ) )
            // InternalRpgindividual.g:3445:1: ( '*' )
            {
            // InternalRpgindividual.g:3445:1: ( '*' )
            // InternalRpgindividual.g:3446:2: '*'
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__1__Impl"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__2"
    // InternalRpgindividual.g:3455:1: rule__EntityMoveMultiplier__Group__2 : rule__EntityMoveMultiplier__Group__2__Impl ;
    public final void rule__EntityMoveMultiplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3459:1: ( rule__EntityMoveMultiplier__Group__2__Impl )
            // InternalRpgindividual.g:3460:2: rule__EntityMoveMultiplier__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__Group__2__Impl();

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
    // $ANTLR end "rule__EntityMoveMultiplier__Group__2"


    // $ANTLR start "rule__EntityMoveMultiplier__Group__2__Impl"
    // InternalRpgindividual.g:3466:1: rule__EntityMoveMultiplier__Group__2__Impl : ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) ) ;
    public final void rule__EntityMoveMultiplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3470:1: ( ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) ) )
            // InternalRpgindividual.g:3471:1: ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) )
            {
            // InternalRpgindividual.g:3471:1: ( ( rule__EntityMoveMultiplier__MultiplierAssignment_2 ) )
            // InternalRpgindividual.g:3472:2: ( rule__EntityMoveMultiplier__MultiplierAssignment_2 )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierAssignment_2()); 
            // InternalRpgindividual.g:3473:2: ( rule__EntityMoveMultiplier__MultiplierAssignment_2 )
            // InternalRpgindividual.g:3473:3: rule__EntityMoveMultiplier__MultiplierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EntityMoveMultiplier__MultiplierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__Group__2__Impl"


    // $ANTLR start "rule__Teams__Group__0"
    // InternalRpgindividual.g:3482:1: rule__Teams__Group__0 : rule__Teams__Group__0__Impl rule__Teams__Group__1 ;
    public final void rule__Teams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3486:1: ( rule__Teams__Group__0__Impl rule__Teams__Group__1 )
            // InternalRpgindividual.g:3487:2: rule__Teams__Group__0__Impl rule__Teams__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalRpgindividual.g:3494:1: rule__Teams__Group__0__Impl : ( 'teams' ) ;
    public final void rule__Teams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3498:1: ( ( 'teams' ) )
            // InternalRpgindividual.g:3499:1: ( 'teams' )
            {
            // InternalRpgindividual.g:3499:1: ( 'teams' )
            // InternalRpgindividual.g:3500:2: 'teams'
            {
             before(grammarAccess.getTeamsAccess().getTeamsKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRpgindividual.g:3509:1: rule__Teams__Group__1 : rule__Teams__Group__1__Impl ;
    public final void rule__Teams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3513:1: ( rule__Teams__Group__1__Impl )
            // InternalRpgindividual.g:3514:2: rule__Teams__Group__1__Impl
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
    // InternalRpgindividual.g:3520:1: rule__Teams__Group__1__Impl : ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) ;
    public final void rule__Teams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3524:1: ( ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3525:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3525:1: ( ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* ) )
            // InternalRpgindividual.g:3526:2: ( ( rule__Teams__TeamAssignment_1 ) ) ( ( rule__Teams__TeamAssignment_1 )* )
            {
            // InternalRpgindividual.g:3526:2: ( ( rule__Teams__TeamAssignment_1 ) )
            // InternalRpgindividual.g:3527:3: ( rule__Teams__TeamAssignment_1 )
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3528:3: ( rule__Teams__TeamAssignment_1 )
            // InternalRpgindividual.g:3528:4: rule__Teams__TeamAssignment_1
            {
            pushFollow(FOLLOW_36);
            rule__Teams__TeamAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 

            }

            // InternalRpgindividual.g:3531:2: ( ( rule__Teams__TeamAssignment_1 )* )
            // InternalRpgindividual.g:3532:3: ( rule__Teams__TeamAssignment_1 )*
            {
             before(grammarAccess.getTeamsAccess().getTeamAssignment_1()); 
            // InternalRpgindividual.g:3533:3: ( rule__Teams__TeamAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgindividual.g:3533:4: rule__Teams__TeamAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
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
    // InternalRpgindividual.g:3543:1: rule__Team__Group__0 : rule__Team__Group__0__Impl rule__Team__Group__1 ;
    public final void rule__Team__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3547:1: ( rule__Team__Group__0__Impl rule__Team__Group__1 )
            // InternalRpgindividual.g:3548:2: rule__Team__Group__0__Impl rule__Team__Group__1
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
    // InternalRpgindividual.g:3555:1: rule__Team__Group__0__Impl : ( 'team' ) ;
    public final void rule__Team__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3559:1: ( ( 'team' ) )
            // InternalRpgindividual.g:3560:1: ( 'team' )
            {
            // InternalRpgindividual.g:3560:1: ( 'team' )
            // InternalRpgindividual.g:3561:2: 'team'
            {
             before(grammarAccess.getTeamAccess().getTeamKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalRpgindividual.g:3570:1: rule__Team__Group__1 : rule__Team__Group__1__Impl rule__Team__Group__2 ;
    public final void rule__Team__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3574:1: ( rule__Team__Group__1__Impl rule__Team__Group__2 )
            // InternalRpgindividual.g:3575:2: rule__Team__Group__1__Impl rule__Team__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalRpgindividual.g:3582:1: rule__Team__Group__1__Impl : ( ( rule__Team__NameAssignment_1 ) ) ;
    public final void rule__Team__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3586:1: ( ( ( rule__Team__NameAssignment_1 ) ) )
            // InternalRpgindividual.g:3587:1: ( ( rule__Team__NameAssignment_1 ) )
            {
            // InternalRpgindividual.g:3587:1: ( ( rule__Team__NameAssignment_1 ) )
            // InternalRpgindividual.g:3588:2: ( rule__Team__NameAssignment_1 )
            {
             before(grammarAccess.getTeamAccess().getNameAssignment_1()); 
            // InternalRpgindividual.g:3589:2: ( rule__Team__NameAssignment_1 )
            // InternalRpgindividual.g:3589:3: rule__Team__NameAssignment_1
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
    // InternalRpgindividual.g:3597:1: rule__Team__Group__2 : rule__Team__Group__2__Impl ;
    public final void rule__Team__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3601:1: ( rule__Team__Group__2__Impl )
            // InternalRpgindividual.g:3602:2: rule__Team__Group__2__Impl
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
    // InternalRpgindividual.g:3608:1: rule__Team__Group__2__Impl : ( ( rule__Team__MembersAssignment_2 ) ) ;
    public final void rule__Team__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3612:1: ( ( ( rule__Team__MembersAssignment_2 ) ) )
            // InternalRpgindividual.g:3613:1: ( ( rule__Team__MembersAssignment_2 ) )
            {
            // InternalRpgindividual.g:3613:1: ( ( rule__Team__MembersAssignment_2 ) )
            // InternalRpgindividual.g:3614:2: ( rule__Team__MembersAssignment_2 )
            {
             before(grammarAccess.getTeamAccess().getMembersAssignment_2()); 
            // InternalRpgindividual.g:3615:2: ( rule__Team__MembersAssignment_2 )
            // InternalRpgindividual.g:3615:3: rule__Team__MembersAssignment_2
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
    // InternalRpgindividual.g:3624:1: rule__Members__Group__0 : rule__Members__Group__0__Impl rule__Members__Group__1 ;
    public final void rule__Members__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3628:1: ( rule__Members__Group__0__Impl rule__Members__Group__1 )
            // InternalRpgindividual.g:3629:2: rule__Members__Group__0__Impl rule__Members__Group__1
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
    // InternalRpgindividual.g:3636:1: rule__Members__Group__0__Impl : ( 'members' ) ;
    public final void rule__Members__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3640:1: ( ( 'members' ) )
            // InternalRpgindividual.g:3641:1: ( 'members' )
            {
            // InternalRpgindividual.g:3641:1: ( 'members' )
            // InternalRpgindividual.g:3642:2: 'members'
            {
             before(grammarAccess.getMembersAccess().getMembersKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalRpgindividual.g:3651:1: rule__Members__Group__1 : rule__Members__Group__1__Impl ;
    public final void rule__Members__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3655:1: ( rule__Members__Group__1__Impl )
            // InternalRpgindividual.g:3656:2: rule__Members__Group__1__Impl
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
    // InternalRpgindividual.g:3662:1: rule__Members__Group__1__Impl : ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) ;
    public final void rule__Members__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3666:1: ( ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) ) )
            // InternalRpgindividual.g:3667:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            {
            // InternalRpgindividual.g:3667:1: ( ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* ) )
            // InternalRpgindividual.g:3668:2: ( ( rule__Members__EntityAssignment_1 ) ) ( ( rule__Members__EntityAssignment_1 )* )
            {
            // InternalRpgindividual.g:3668:2: ( ( rule__Members__EntityAssignment_1 ) )
            // InternalRpgindividual.g:3669:3: ( rule__Members__EntityAssignment_1 )
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3670:3: ( rule__Members__EntityAssignment_1 )
            // InternalRpgindividual.g:3670:4: rule__Members__EntityAssignment_1
            {
            pushFollow(FOLLOW_12);
            rule__Members__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMembersAccess().getEntityAssignment_1()); 

            }

            // InternalRpgindividual.g:3673:2: ( ( rule__Members__EntityAssignment_1 )* )
            // InternalRpgindividual.g:3674:3: ( rule__Members__EntityAssignment_1 )*
            {
             before(grammarAccess.getMembersAccess().getEntityAssignment_1()); 
            // InternalRpgindividual.g:3675:3: ( rule__Members__EntityAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRpgindividual.g:3675:4: rule__Members__EntityAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
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


    // $ANTLR start "rule__ORcondition__Group__0"
    // InternalRpgindividual.g:3685:1: rule__ORcondition__Group__0 : rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 ;
    public final void rule__ORcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3689:1: ( rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1 )
            // InternalRpgindividual.g:3690:2: rule__ORcondition__Group__0__Impl rule__ORcondition__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalRpgindividual.g:3697:1: rule__ORcondition__Group__0__Impl : ( ruleANDcondition ) ;
    public final void rule__ORcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3701:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:3702:1: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:3702:1: ( ruleANDcondition )
            // InternalRpgindividual.g:3703:2: ruleANDcondition
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
    // InternalRpgindividual.g:3712:1: rule__ORcondition__Group__1 : rule__ORcondition__Group__1__Impl ;
    public final void rule__ORcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3716:1: ( rule__ORcondition__Group__1__Impl )
            // InternalRpgindividual.g:3717:2: rule__ORcondition__Group__1__Impl
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
    // InternalRpgindividual.g:3723:1: rule__ORcondition__Group__1__Impl : ( ( rule__ORcondition__Group_1__0 )* ) ;
    public final void rule__ORcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3727:1: ( ( ( rule__ORcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:3728:1: ( ( rule__ORcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:3728:1: ( ( rule__ORcondition__Group_1__0 )* )
            // InternalRpgindividual.g:3729:2: ( rule__ORcondition__Group_1__0 )*
            {
             before(grammarAccess.getORconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:3730:2: ( rule__ORcondition__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRpgindividual.g:3730:3: rule__ORcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
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
    // InternalRpgindividual.g:3739:1: rule__ORcondition__Group_1__0 : rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 ;
    public final void rule__ORcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3743:1: ( rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1 )
            // InternalRpgindividual.g:3744:2: rule__ORcondition__Group_1__0__Impl rule__ORcondition__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:3751:1: rule__ORcondition__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__ORcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3755:1: ( ( 'OR' ) )
            // InternalRpgindividual.g:3756:1: ( 'OR' )
            {
            // InternalRpgindividual.g:3756:1: ( 'OR' )
            // InternalRpgindividual.g:3757:2: 'OR'
            {
             before(grammarAccess.getORconditionAccess().getORKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalRpgindividual.g:3766:1: rule__ORcondition__Group_1__1 : rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 ;
    public final void rule__ORcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3770:1: ( rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2 )
            // InternalRpgindividual.g:3771:2: rule__ORcondition__Group_1__1__Impl rule__ORcondition__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:3778:1: rule__ORcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ORcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3782:1: ( ( () ) )
            // InternalRpgindividual.g:3783:1: ( () )
            {
            // InternalRpgindividual.g:3783:1: ( () )
            // InternalRpgindividual.g:3784:2: ()
            {
             before(grammarAccess.getORconditionAccess().getOrLeftAction_1_1()); 
            // InternalRpgindividual.g:3785:2: ()
            // InternalRpgindividual.g:3785:3: 
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
    // InternalRpgindividual.g:3793:1: rule__ORcondition__Group_1__2 : rule__ORcondition__Group_1__2__Impl ;
    public final void rule__ORcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3797:1: ( rule__ORcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:3798:2: rule__ORcondition__Group_1__2__Impl
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
    // InternalRpgindividual.g:3804:1: rule__ORcondition__Group_1__2__Impl : ( ( rule__ORcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ORcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3808:1: ( ( ( rule__ORcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:3809:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:3809:1: ( ( rule__ORcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:3810:2: ( rule__ORcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getORconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:3811:2: ( rule__ORcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:3811:3: rule__ORcondition__RightAssignment_1_2
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
    // InternalRpgindividual.g:3820:1: rule__ANDcondition__Group__0 : rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 ;
    public final void rule__ANDcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3824:1: ( rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1 )
            // InternalRpgindividual.g:3825:2: rule__ANDcondition__Group__0__Impl rule__ANDcondition__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalRpgindividual.g:3832:1: rule__ANDcondition__Group__0__Impl : ( ruleStatement ) ;
    public final void rule__ANDcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3836:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:3837:1: ( ruleStatement )
            {
            // InternalRpgindividual.g:3837:1: ( ruleStatement )
            // InternalRpgindividual.g:3838:2: ruleStatement
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
    // InternalRpgindividual.g:3847:1: rule__ANDcondition__Group__1 : rule__ANDcondition__Group__1__Impl ;
    public final void rule__ANDcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3851:1: ( rule__ANDcondition__Group__1__Impl )
            // InternalRpgindividual.g:3852:2: rule__ANDcondition__Group__1__Impl
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
    // InternalRpgindividual.g:3858:1: rule__ANDcondition__Group__1__Impl : ( ( rule__ANDcondition__Group_1__0 )* ) ;
    public final void rule__ANDcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3862:1: ( ( ( rule__ANDcondition__Group_1__0 )* ) )
            // InternalRpgindividual.g:3863:1: ( ( rule__ANDcondition__Group_1__0 )* )
            {
            // InternalRpgindividual.g:3863:1: ( ( rule__ANDcondition__Group_1__0 )* )
            // InternalRpgindividual.g:3864:2: ( rule__ANDcondition__Group_1__0 )*
            {
             before(grammarAccess.getANDconditionAccess().getGroup_1()); 
            // InternalRpgindividual.g:3865:2: ( rule__ANDcondition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRpgindividual.g:3865:3: rule__ANDcondition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_41);
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
    // InternalRpgindividual.g:3874:1: rule__ANDcondition__Group_1__0 : rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 ;
    public final void rule__ANDcondition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3878:1: ( rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1 )
            // InternalRpgindividual.g:3879:2: rule__ANDcondition__Group_1__0__Impl rule__ANDcondition__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:3886:1: rule__ANDcondition__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__ANDcondition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3890:1: ( ( 'AND' ) )
            // InternalRpgindividual.g:3891:1: ( 'AND' )
            {
            // InternalRpgindividual.g:3891:1: ( 'AND' )
            // InternalRpgindividual.g:3892:2: 'AND'
            {
             before(grammarAccess.getANDconditionAccess().getANDKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalRpgindividual.g:3901:1: rule__ANDcondition__Group_1__1 : rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 ;
    public final void rule__ANDcondition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3905:1: ( rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2 )
            // InternalRpgindividual.g:3906:2: rule__ANDcondition__Group_1__1__Impl rule__ANDcondition__Group_1__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:3913:1: rule__ANDcondition__Group_1__1__Impl : ( () ) ;
    public final void rule__ANDcondition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3917:1: ( ( () ) )
            // InternalRpgindividual.g:3918:1: ( () )
            {
            // InternalRpgindividual.g:3918:1: ( () )
            // InternalRpgindividual.g:3919:2: ()
            {
             before(grammarAccess.getANDconditionAccess().getAndLeftAction_1_1()); 
            // InternalRpgindividual.g:3920:2: ()
            // InternalRpgindividual.g:3920:3: 
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
    // InternalRpgindividual.g:3928:1: rule__ANDcondition__Group_1__2 : rule__ANDcondition__Group_1__2__Impl ;
    public final void rule__ANDcondition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3932:1: ( rule__ANDcondition__Group_1__2__Impl )
            // InternalRpgindividual.g:3933:2: rule__ANDcondition__Group_1__2__Impl
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
    // InternalRpgindividual.g:3939:1: rule__ANDcondition__Group_1__2__Impl : ( ( rule__ANDcondition__RightAssignment_1_2 ) ) ;
    public final void rule__ANDcondition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3943:1: ( ( ( rule__ANDcondition__RightAssignment_1_2 ) ) )
            // InternalRpgindividual.g:3944:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            {
            // InternalRpgindividual.g:3944:1: ( ( rule__ANDcondition__RightAssignment_1_2 ) )
            // InternalRpgindividual.g:3945:2: ( rule__ANDcondition__RightAssignment_1_2 )
            {
             before(grammarAccess.getANDconditionAccess().getRightAssignment_1_2()); 
            // InternalRpgindividual.g:3946:2: ( rule__ANDcondition__RightAssignment_1_2 )
            // InternalRpgindividual.g:3946:3: rule__ANDcondition__RightAssignment_1_2
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
    // InternalRpgindividual.g:3955:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3959:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // InternalRpgindividual.g:3960:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRpgindividual.g:3967:1: rule__Statement__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3971:1: ( ( '(' ) )
            // InternalRpgindividual.g:3972:1: ( '(' )
            {
            // InternalRpgindividual.g:3972:1: ( '(' )
            // InternalRpgindividual.g:3973:2: '('
            {
             before(grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRpgindividual.g:3982:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3986:1: ( rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2 )
            // InternalRpgindividual.g:3987:2: rule__Statement__Group_1__1__Impl rule__Statement__Group_1__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalRpgindividual.g:3994:1: rule__Statement__Group_1__1__Impl : ( ruleORcondition ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:3998:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:3999:1: ( ruleORcondition )
            {
            // InternalRpgindividual.g:3999:1: ( ruleORcondition )
            // InternalRpgindividual.g:4000:2: ruleORcondition
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
    // InternalRpgindividual.g:4009:1: rule__Statement__Group_1__2 : rule__Statement__Group_1__2__Impl ;
    public final void rule__Statement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4013:1: ( rule__Statement__Group_1__2__Impl )
            // InternalRpgindividual.g:4014:2: rule__Statement__Group_1__2__Impl
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
    // InternalRpgindividual.g:4020:1: rule__Statement__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Statement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4024:1: ( ( ')' ) )
            // InternalRpgindividual.g:4025:1: ( ')' )
            {
            // InternalRpgindividual.g:4025:1: ( ')' )
            // InternalRpgindividual.g:4026:2: ')'
            {
             before(grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRpgindividual.g:4036:1: rule__NumberComparing__Group__0 : rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 ;
    public final void rule__NumberComparing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4040:1: ( rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1 )
            // InternalRpgindividual.g:4041:2: rule__NumberComparing__Group__0__Impl rule__NumberComparing__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalRpgindividual.g:4048:1: rule__NumberComparing__Group__0__Impl : ( ( rule__NumberComparing__LeftAssignment_0 ) ) ;
    public final void rule__NumberComparing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4052:1: ( ( ( rule__NumberComparing__LeftAssignment_0 ) ) )
            // InternalRpgindividual.g:4053:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            {
            // InternalRpgindividual.g:4053:1: ( ( rule__NumberComparing__LeftAssignment_0 ) )
            // InternalRpgindividual.g:4054:2: ( rule__NumberComparing__LeftAssignment_0 )
            {
             before(grammarAccess.getNumberComparingAccess().getLeftAssignment_0()); 
            // InternalRpgindividual.g:4055:2: ( rule__NumberComparing__LeftAssignment_0 )
            // InternalRpgindividual.g:4055:3: rule__NumberComparing__LeftAssignment_0
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
    // InternalRpgindividual.g:4063:1: rule__NumberComparing__Group__1 : rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 ;
    public final void rule__NumberComparing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4067:1: ( rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2 )
            // InternalRpgindividual.g:4068:2: rule__NumberComparing__Group__1__Impl rule__NumberComparing__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRpgindividual.g:4075:1: rule__NumberComparing__Group__1__Impl : ( ( rule__NumberComparing__CompAssignment_1 ) ) ;
    public final void rule__NumberComparing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4079:1: ( ( ( rule__NumberComparing__CompAssignment_1 ) ) )
            // InternalRpgindividual.g:4080:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            {
            // InternalRpgindividual.g:4080:1: ( ( rule__NumberComparing__CompAssignment_1 ) )
            // InternalRpgindividual.g:4081:2: ( rule__NumberComparing__CompAssignment_1 )
            {
             before(grammarAccess.getNumberComparingAccess().getCompAssignment_1()); 
            // InternalRpgindividual.g:4082:2: ( rule__NumberComparing__CompAssignment_1 )
            // InternalRpgindividual.g:4082:3: rule__NumberComparing__CompAssignment_1
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
    // InternalRpgindividual.g:4090:1: rule__NumberComparing__Group__2 : rule__NumberComparing__Group__2__Impl ;
    public final void rule__NumberComparing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4094:1: ( rule__NumberComparing__Group__2__Impl )
            // InternalRpgindividual.g:4095:2: rule__NumberComparing__Group__2__Impl
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
    // InternalRpgindividual.g:4101:1: rule__NumberComparing__Group__2__Impl : ( ( rule__NumberComparing__RightAssignment_2 ) ) ;
    public final void rule__NumberComparing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4105:1: ( ( ( rule__NumberComparing__RightAssignment_2 ) ) )
            // InternalRpgindividual.g:4106:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            {
            // InternalRpgindividual.g:4106:1: ( ( rule__NumberComparing__RightAssignment_2 ) )
            // InternalRpgindividual.g:4107:2: ( rule__NumberComparing__RightAssignment_2 )
            {
             before(grammarAccess.getNumberComparingAccess().getRightAssignment_2()); 
            // InternalRpgindividual.g:4108:2: ( rule__NumberComparing__RightAssignment_2 )
            // InternalRpgindividual.g:4108:3: rule__NumberComparing__RightAssignment_2
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
    // InternalRpgindividual.g:4117:1: rule__Comparator__Group_0__0 : rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 ;
    public final void rule__Comparator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4121:1: ( rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1 )
            // InternalRpgindividual.g:4122:2: rule__Comparator__Group_0__0__Impl rule__Comparator__Group_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRpgindividual.g:4129:1: rule__Comparator__Group_0__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4133:1: ( ( () ) )
            // InternalRpgindividual.g:4134:1: ( () )
            {
            // InternalRpgindividual.g:4134:1: ( () )
            // InternalRpgindividual.g:4135:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerAction_0_0()); 
            // InternalRpgindividual.g:4136:2: ()
            // InternalRpgindividual.g:4136:3: 
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
    // InternalRpgindividual.g:4144:1: rule__Comparator__Group_0__1 : rule__Comparator__Group_0__1__Impl ;
    public final void rule__Comparator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4148:1: ( rule__Comparator__Group_0__1__Impl )
            // InternalRpgindividual.g:4149:2: rule__Comparator__Group_0__1__Impl
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
    // InternalRpgindividual.g:4155:1: rule__Comparator__Group_0__1__Impl : ( '<' ) ;
    public final void rule__Comparator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4159:1: ( ( '<' ) )
            // InternalRpgindividual.g:4160:1: ( '<' )
            {
            // InternalRpgindividual.g:4160:1: ( '<' )
            // InternalRpgindividual.g:4161:2: '<'
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRpgindividual.g:4171:1: rule__Comparator__Group_1__0 : rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 ;
    public final void rule__Comparator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4175:1: ( rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1 )
            // InternalRpgindividual.g:4176:2: rule__Comparator__Group_1__0__Impl rule__Comparator__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalRpgindividual.g:4183:1: rule__Comparator__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4187:1: ( ( () ) )
            // InternalRpgindividual.g:4188:1: ( () )
            {
            // InternalRpgindividual.g:4188:1: ( () )
            // InternalRpgindividual.g:4189:2: ()
            {
             before(grammarAccess.getComparatorAccess().getSmallerEqAction_1_0()); 
            // InternalRpgindividual.g:4190:2: ()
            // InternalRpgindividual.g:4190:3: 
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
    // InternalRpgindividual.g:4198:1: rule__Comparator__Group_1__1 : rule__Comparator__Group_1__1__Impl ;
    public final void rule__Comparator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4202:1: ( rule__Comparator__Group_1__1__Impl )
            // InternalRpgindividual.g:4203:2: rule__Comparator__Group_1__1__Impl
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
    // InternalRpgindividual.g:4209:1: rule__Comparator__Group_1__1__Impl : ( '<=' ) ;
    public final void rule__Comparator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4213:1: ( ( '<=' ) )
            // InternalRpgindividual.g:4214:1: ( '<=' )
            {
            // InternalRpgindividual.g:4214:1: ( '<=' )
            // InternalRpgindividual.g:4215:2: '<='
            {
             before(grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalRpgindividual.g:4225:1: rule__Comparator__Group_2__0 : rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 ;
    public final void rule__Comparator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4229:1: ( rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1 )
            // InternalRpgindividual.g:4230:2: rule__Comparator__Group_2__0__Impl rule__Comparator__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalRpgindividual.g:4237:1: rule__Comparator__Group_2__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4241:1: ( ( () ) )
            // InternalRpgindividual.g:4242:1: ( () )
            {
            // InternalRpgindividual.g:4242:1: ( () )
            // InternalRpgindividual.g:4243:2: ()
            {
             before(grammarAccess.getComparatorAccess().getEqAction_2_0()); 
            // InternalRpgindividual.g:4244:2: ()
            // InternalRpgindividual.g:4244:3: 
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
    // InternalRpgindividual.g:4252:1: rule__Comparator__Group_2__1 : rule__Comparator__Group_2__1__Impl ;
    public final void rule__Comparator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4256:1: ( rule__Comparator__Group_2__1__Impl )
            // InternalRpgindividual.g:4257:2: rule__Comparator__Group_2__1__Impl
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
    // InternalRpgindividual.g:4263:1: rule__Comparator__Group_2__1__Impl : ( '==' ) ;
    public final void rule__Comparator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4267:1: ( ( '==' ) )
            // InternalRpgindividual.g:4268:1: ( '==' )
            {
            // InternalRpgindividual.g:4268:1: ( '==' )
            // InternalRpgindividual.g:4269:2: '=='
            {
             before(grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalRpgindividual.g:4279:1: rule__Comparator__Group_3__0 : rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 ;
    public final void rule__Comparator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4283:1: ( rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1 )
            // InternalRpgindividual.g:4284:2: rule__Comparator__Group_3__0__Impl rule__Comparator__Group_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalRpgindividual.g:4291:1: rule__Comparator__Group_3__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4295:1: ( ( () ) )
            // InternalRpgindividual.g:4296:1: ( () )
            {
            // InternalRpgindividual.g:4296:1: ( () )
            // InternalRpgindividual.g:4297:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerEqAction_3_0()); 
            // InternalRpgindividual.g:4298:2: ()
            // InternalRpgindividual.g:4298:3: 
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
    // InternalRpgindividual.g:4306:1: rule__Comparator__Group_3__1 : rule__Comparator__Group_3__1__Impl ;
    public final void rule__Comparator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4310:1: ( rule__Comparator__Group_3__1__Impl )
            // InternalRpgindividual.g:4311:2: rule__Comparator__Group_3__1__Impl
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
    // InternalRpgindividual.g:4317:1: rule__Comparator__Group_3__1__Impl : ( '>=' ) ;
    public final void rule__Comparator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4321:1: ( ( '>=' ) )
            // InternalRpgindividual.g:4322:1: ( '>=' )
            {
            // InternalRpgindividual.g:4322:1: ( '>=' )
            // InternalRpgindividual.g:4323:2: '>='
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalRpgindividual.g:4333:1: rule__Comparator__Group_4__0 : rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 ;
    public final void rule__Comparator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4337:1: ( rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1 )
            // InternalRpgindividual.g:4338:2: rule__Comparator__Group_4__0__Impl rule__Comparator__Group_4__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalRpgindividual.g:4345:1: rule__Comparator__Group_4__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4349:1: ( ( () ) )
            // InternalRpgindividual.g:4350:1: ( () )
            {
            // InternalRpgindividual.g:4350:1: ( () )
            // InternalRpgindividual.g:4351:2: ()
            {
             before(grammarAccess.getComparatorAccess().getBiggerAction_4_0()); 
            // InternalRpgindividual.g:4352:2: ()
            // InternalRpgindividual.g:4352:3: 
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
    // InternalRpgindividual.g:4360:1: rule__Comparator__Group_4__1 : rule__Comparator__Group_4__1__Impl ;
    public final void rule__Comparator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4364:1: ( rule__Comparator__Group_4__1__Impl )
            // InternalRpgindividual.g:4365:2: rule__Comparator__Group_4__1__Impl
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
    // InternalRpgindividual.g:4371:1: rule__Comparator__Group_4__1__Impl : ( '>' ) ;
    public final void rule__Comparator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4375:1: ( ( '>' ) )
            // InternalRpgindividual.g:4376:1: ( '>' )
            {
            // InternalRpgindividual.g:4376:1: ( '>' )
            // InternalRpgindividual.g:4377:2: '>'
            {
             before(grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalRpgindividual.g:4387:1: rule__Comparator__Group_5__0 : rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 ;
    public final void rule__Comparator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4391:1: ( rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1 )
            // InternalRpgindividual.g:4392:2: rule__Comparator__Group_5__0__Impl rule__Comparator__Group_5__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalRpgindividual.g:4399:1: rule__Comparator__Group_5__0__Impl : ( () ) ;
    public final void rule__Comparator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4403:1: ( ( () ) )
            // InternalRpgindividual.g:4404:1: ( () )
            {
            // InternalRpgindividual.g:4404:1: ( () )
            // InternalRpgindividual.g:4405:2: ()
            {
             before(grammarAccess.getComparatorAccess().getNEqAction_5_0()); 
            // InternalRpgindividual.g:4406:2: ()
            // InternalRpgindividual.g:4406:3: 
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
    // InternalRpgindividual.g:4414:1: rule__Comparator__Group_5__1 : rule__Comparator__Group_5__1__Impl ;
    public final void rule__Comparator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4418:1: ( rule__Comparator__Group_5__1__Impl )
            // InternalRpgindividual.g:4419:2: rule__Comparator__Group_5__1__Impl
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
    // InternalRpgindividual.g:4425:1: rule__Comparator__Group_5__1__Impl : ( '!=' ) ;
    public final void rule__Comparator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4429:1: ( ( '!=' ) )
            // InternalRpgindividual.g:4430:1: ( '!=' )
            {
            // InternalRpgindividual.g:4430:1: ( '!=' )
            // InternalRpgindividual.g:4431:2: '!='
            {
             before(grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalRpgindividual.g:4441:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4445:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalRpgindividual.g:4446:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalRpgindividual.g:4453:1: rule__Sum__Group__0__Impl : ( ruleMultiply ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4457:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:4458:1: ( ruleMultiply )
            {
            // InternalRpgindividual.g:4458:1: ( ruleMultiply )
            // InternalRpgindividual.g:4459:2: ruleMultiply
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
    // InternalRpgindividual.g:4468:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4472:1: ( rule__Sum__Group__1__Impl )
            // InternalRpgindividual.g:4473:2: rule__Sum__Group__1__Impl
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
    // InternalRpgindividual.g:4479:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4483:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalRpgindividual.g:4484:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4484:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalRpgindividual.g:4485:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalRpgindividual.g:4486:2: ( rule__Sum__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=48 && LA32_0<=49)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRpgindividual.g:4486:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
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
    // InternalRpgindividual.g:4495:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4499:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalRpgindividual.g:4500:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRpgindividual.g:4507:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4511:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:4512:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:4512:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalRpgindividual.g:4513:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:4514:2: ( rule__Sum__Alternatives_1_0 )
            // InternalRpgindividual.g:4514:3: rule__Sum__Alternatives_1_0
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
    // InternalRpgindividual.g:4522:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4526:1: ( rule__Sum__Group_1__1__Impl )
            // InternalRpgindividual.g:4527:2: rule__Sum__Group_1__1__Impl
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
    // InternalRpgindividual.g:4533:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4537:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:4538:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:4538:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:4539:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:4540:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalRpgindividual.g:4540:3: rule__Sum__RightAssignment_1_1
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
    // InternalRpgindividual.g:4549:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4553:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalRpgindividual.g:4554:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
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
    // InternalRpgindividual.g:4561:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4565:1: ( ( '+' ) )
            // InternalRpgindividual.g:4566:1: ( '+' )
            {
            // InternalRpgindividual.g:4566:1: ( '+' )
            // InternalRpgindividual.g:4567:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalRpgindividual.g:4576:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4580:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:4581:2: rule__Sum__Group_1_0_0__1__Impl
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
    // InternalRpgindividual.g:4587:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4591:1: ( ( () ) )
            // InternalRpgindividual.g:4592:1: ( () )
            {
            // InternalRpgindividual.g:4592:1: ( () )
            // InternalRpgindividual.g:4593:2: ()
            {
             before(grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:4594:2: ()
            // InternalRpgindividual.g:4594:3: 
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
    // InternalRpgindividual.g:4603:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4607:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalRpgindividual.g:4608:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
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
    // InternalRpgindividual.g:4615:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4619:1: ( ( '-' ) )
            // InternalRpgindividual.g:4620:1: ( '-' )
            {
            // InternalRpgindividual.g:4620:1: ( '-' )
            // InternalRpgindividual.g:4621:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalRpgindividual.g:4630:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4634:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:4635:2: rule__Sum__Group_1_0_1__1__Impl
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
    // InternalRpgindividual.g:4641:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4645:1: ( ( () ) )
            // InternalRpgindividual.g:4646:1: ( () )
            {
            // InternalRpgindividual.g:4646:1: ( () )
            // InternalRpgindividual.g:4647:2: ()
            {
             before(grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:4648:2: ()
            // InternalRpgindividual.g:4648:3: 
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
    // InternalRpgindividual.g:4657:1: rule__Multiply__Group__0 : rule__Multiply__Group__0__Impl rule__Multiply__Group__1 ;
    public final void rule__Multiply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4661:1: ( rule__Multiply__Group__0__Impl rule__Multiply__Group__1 )
            // InternalRpgindividual.g:4662:2: rule__Multiply__Group__0__Impl rule__Multiply__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalRpgindividual.g:4669:1: rule__Multiply__Group__0__Impl : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4673:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:4674:1: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:4674:1: ( ruleAtomicNumber )
            // InternalRpgindividual.g:4675:2: ruleAtomicNumber
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
    // InternalRpgindividual.g:4684:1: rule__Multiply__Group__1 : rule__Multiply__Group__1__Impl ;
    public final void rule__Multiply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4688:1: ( rule__Multiply__Group__1__Impl )
            // InternalRpgindividual.g:4689:2: rule__Multiply__Group__1__Impl
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
    // InternalRpgindividual.g:4695:1: rule__Multiply__Group__1__Impl : ( ( rule__Multiply__Group_1__0 )* ) ;
    public final void rule__Multiply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4699:1: ( ( ( rule__Multiply__Group_1__0 )* ) )
            // InternalRpgindividual.g:4700:1: ( ( rule__Multiply__Group_1__0 )* )
            {
            // InternalRpgindividual.g:4700:1: ( ( rule__Multiply__Group_1__0 )* )
            // InternalRpgindividual.g:4701:2: ( rule__Multiply__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyAccess().getGroup_1()); 
            // InternalRpgindividual.g:4702:2: ( rule__Multiply__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37||LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRpgindividual.g:4702:3: rule__Multiply__Group_1__0
            	    {
            	    pushFollow(FOLLOW_51);
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
    // InternalRpgindividual.g:4711:1: rule__Multiply__Group_1__0 : rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 ;
    public final void rule__Multiply__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4715:1: ( rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1 )
            // InternalRpgindividual.g:4716:2: rule__Multiply__Group_1__0__Impl rule__Multiply__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRpgindividual.g:4723:1: rule__Multiply__Group_1__0__Impl : ( ( rule__Multiply__Alternatives_1_0 ) ) ;
    public final void rule__Multiply__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4727:1: ( ( ( rule__Multiply__Alternatives_1_0 ) ) )
            // InternalRpgindividual.g:4728:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            {
            // InternalRpgindividual.g:4728:1: ( ( rule__Multiply__Alternatives_1_0 ) )
            // InternalRpgindividual.g:4729:2: ( rule__Multiply__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplyAccess().getAlternatives_1_0()); 
            // InternalRpgindividual.g:4730:2: ( rule__Multiply__Alternatives_1_0 )
            // InternalRpgindividual.g:4730:3: rule__Multiply__Alternatives_1_0
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
    // InternalRpgindividual.g:4738:1: rule__Multiply__Group_1__1 : rule__Multiply__Group_1__1__Impl ;
    public final void rule__Multiply__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4742:1: ( rule__Multiply__Group_1__1__Impl )
            // InternalRpgindividual.g:4743:2: rule__Multiply__Group_1__1__Impl
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
    // InternalRpgindividual.g:4749:1: rule__Multiply__Group_1__1__Impl : ( ( rule__Multiply__RightAssignment_1_1 ) ) ;
    public final void rule__Multiply__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4753:1: ( ( ( rule__Multiply__RightAssignment_1_1 ) ) )
            // InternalRpgindividual.g:4754:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            {
            // InternalRpgindividual.g:4754:1: ( ( rule__Multiply__RightAssignment_1_1 ) )
            // InternalRpgindividual.g:4755:2: ( rule__Multiply__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyAccess().getRightAssignment_1_1()); 
            // InternalRpgindividual.g:4756:2: ( rule__Multiply__RightAssignment_1_1 )
            // InternalRpgindividual.g:4756:3: rule__Multiply__RightAssignment_1_1
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
    // InternalRpgindividual.g:4765:1: rule__Multiply__Group_1_0_0__0 : rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 ;
    public final void rule__Multiply__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4769:1: ( rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1 )
            // InternalRpgindividual.g:4770:2: rule__Multiply__Group_1_0_0__0__Impl rule__Multiply__Group_1_0_0__1
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
    // InternalRpgindividual.g:4777:1: rule__Multiply__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Multiply__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4781:1: ( ( '*' ) )
            // InternalRpgindividual.g:4782:1: ( '*' )
            {
            // InternalRpgindividual.g:4782:1: ( '*' )
            // InternalRpgindividual.g:4783:2: '*'
            {
             before(grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRpgindividual.g:4792:1: rule__Multiply__Group_1_0_0__1 : rule__Multiply__Group_1_0_0__1__Impl ;
    public final void rule__Multiply__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4796:1: ( rule__Multiply__Group_1_0_0__1__Impl )
            // InternalRpgindividual.g:4797:2: rule__Multiply__Group_1_0_0__1__Impl
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
    // InternalRpgindividual.g:4803:1: rule__Multiply__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4807:1: ( ( () ) )
            // InternalRpgindividual.g:4808:1: ( () )
            {
            // InternalRpgindividual.g:4808:1: ( () )
            // InternalRpgindividual.g:4809:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1()); 
            // InternalRpgindividual.g:4810:2: ()
            // InternalRpgindividual.g:4810:3: 
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
    // InternalRpgindividual.g:4819:1: rule__Multiply__Group_1_0_1__0 : rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 ;
    public final void rule__Multiply__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4823:1: ( rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1 )
            // InternalRpgindividual.g:4824:2: rule__Multiply__Group_1_0_1__0__Impl rule__Multiply__Group_1_0_1__1
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
    // InternalRpgindividual.g:4831:1: rule__Multiply__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Multiply__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4835:1: ( ( '/' ) )
            // InternalRpgindividual.g:4836:1: ( '/' )
            {
            // InternalRpgindividual.g:4836:1: ( '/' )
            // InternalRpgindividual.g:4837:2: '/'
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
    // InternalRpgindividual.g:4846:1: rule__Multiply__Group_1_0_1__1 : rule__Multiply__Group_1_0_1__1__Impl ;
    public final void rule__Multiply__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4850:1: ( rule__Multiply__Group_1_0_1__1__Impl )
            // InternalRpgindividual.g:4851:2: rule__Multiply__Group_1_0_1__1__Impl
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
    // InternalRpgindividual.g:4857:1: rule__Multiply__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Multiply__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4861:1: ( ( () ) )
            // InternalRpgindividual.g:4862:1: ( () )
            {
            // InternalRpgindividual.g:4862:1: ( () )
            // InternalRpgindividual.g:4863:2: ()
            {
             before(grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1()); 
            // InternalRpgindividual.g:4864:2: ()
            // InternalRpgindividual.g:4864:3: 
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


    // $ANTLR start "rule__NameAttribute__Group__0"
    // InternalRpgindividual.g:4873:1: rule__NameAttribute__Group__0 : rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1 ;
    public final void rule__NameAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4877:1: ( rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1 )
            // InternalRpgindividual.g:4878:2: rule__NameAttribute__Group__0__Impl rule__NameAttribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NameAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__1();

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
    // $ANTLR end "rule__NameAttribute__Group__0"


    // $ANTLR start "rule__NameAttribute__Group__0__Impl"
    // InternalRpgindividual.g:4885:1: rule__NameAttribute__Group__0__Impl : ( ( rule__NameAttribute__TargetAssignment_0 ) ) ;
    public final void rule__NameAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4889:1: ( ( ( rule__NameAttribute__TargetAssignment_0 ) ) )
            // InternalRpgindividual.g:4890:1: ( ( rule__NameAttribute__TargetAssignment_0 ) )
            {
            // InternalRpgindividual.g:4890:1: ( ( rule__NameAttribute__TargetAssignment_0 ) )
            // InternalRpgindividual.g:4891:2: ( rule__NameAttribute__TargetAssignment_0 )
            {
             before(grammarAccess.getNameAttributeAccess().getTargetAssignment_0()); 
            // InternalRpgindividual.g:4892:2: ( rule__NameAttribute__TargetAssignment_0 )
            // InternalRpgindividual.g:4892:3: rule__NameAttribute__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__0__Impl"


    // $ANTLR start "rule__NameAttribute__Group__1"
    // InternalRpgindividual.g:4900:1: rule__NameAttribute__Group__1 : rule__NameAttribute__Group__1__Impl ;
    public final void rule__NameAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4904:1: ( rule__NameAttribute__Group__1__Impl )
            // InternalRpgindividual.g:4905:2: rule__NameAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__Group__1__Impl();

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
    // $ANTLR end "rule__NameAttribute__Group__1"


    // $ANTLR start "rule__NameAttribute__Group__1__Impl"
    // InternalRpgindividual.g:4911:1: rule__NameAttribute__Group__1__Impl : ( ( rule__NameAttribute__AttributeAssignment_1 ) ) ;
    public final void rule__NameAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4915:1: ( ( ( rule__NameAttribute__AttributeAssignment_1 ) ) )
            // InternalRpgindividual.g:4916:1: ( ( rule__NameAttribute__AttributeAssignment_1 ) )
            {
            // InternalRpgindividual.g:4916:1: ( ( rule__NameAttribute__AttributeAssignment_1 ) )
            // InternalRpgindividual.g:4917:2: ( rule__NameAttribute__AttributeAssignment_1 )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAssignment_1()); 
            // InternalRpgindividual.g:4918:2: ( rule__NameAttribute__AttributeAssignment_1 )
            // InternalRpgindividual.g:4918:3: rule__NameAttribute__AttributeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NameAttribute__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__Group__1__Impl"


    // $ANTLR start "rule__FloatNum__Group__0"
    // InternalRpgindividual.g:4927:1: rule__FloatNum__Group__0 : rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 ;
    public final void rule__FloatNum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4931:1: ( rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1 )
            // InternalRpgindividual.g:4932:2: rule__FloatNum__Group__0__Impl rule__FloatNum__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalRpgindividual.g:4939:1: rule__FloatNum__Group__0__Impl : ( ( rule__FloatNum__IAssignment_0 ) ) ;
    public final void rule__FloatNum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4943:1: ( ( ( rule__FloatNum__IAssignment_0 ) ) )
            // InternalRpgindividual.g:4944:1: ( ( rule__FloatNum__IAssignment_0 ) )
            {
            // InternalRpgindividual.g:4944:1: ( ( rule__FloatNum__IAssignment_0 ) )
            // InternalRpgindividual.g:4945:2: ( rule__FloatNum__IAssignment_0 )
            {
             before(grammarAccess.getFloatNumAccess().getIAssignment_0()); 
            // InternalRpgindividual.g:4946:2: ( rule__FloatNum__IAssignment_0 )
            // InternalRpgindividual.g:4946:3: rule__FloatNum__IAssignment_0
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
    // InternalRpgindividual.g:4954:1: rule__FloatNum__Group__1 : rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 ;
    public final void rule__FloatNum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4958:1: ( rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2 )
            // InternalRpgindividual.g:4959:2: rule__FloatNum__Group__1__Impl rule__FloatNum__Group__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalRpgindividual.g:4966:1: rule__FloatNum__Group__1__Impl : ( '.' ) ;
    public final void rule__FloatNum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4970:1: ( ( '.' ) )
            // InternalRpgindividual.g:4971:1: ( '.' )
            {
            // InternalRpgindividual.g:4971:1: ( '.' )
            // InternalRpgindividual.g:4972:2: '.'
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
    // InternalRpgindividual.g:4981:1: rule__FloatNum__Group__2 : rule__FloatNum__Group__2__Impl ;
    public final void rule__FloatNum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4985:1: ( rule__FloatNum__Group__2__Impl )
            // InternalRpgindividual.g:4986:2: rule__FloatNum__Group__2__Impl
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
    // InternalRpgindividual.g:4992:1: rule__FloatNum__Group__2__Impl : ( ( rule__FloatNum__DecimalAssignment_2 ) ) ;
    public final void rule__FloatNum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:4996:1: ( ( ( rule__FloatNum__DecimalAssignment_2 ) ) )
            // InternalRpgindividual.g:4997:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            {
            // InternalRpgindividual.g:4997:1: ( ( rule__FloatNum__DecimalAssignment_2 ) )
            // InternalRpgindividual.g:4998:2: ( rule__FloatNum__DecimalAssignment_2 )
            {
             before(grammarAccess.getFloatNumAccess().getDecimalAssignment_2()); 
            // InternalRpgindividual.g:4999:2: ( rule__FloatNum__DecimalAssignment_2 )
            // InternalRpgindividual.g:4999:3: rule__FloatNum__DecimalAssignment_2
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
    // InternalRpgindividual.g:5008:1: rule__SystemRPG__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemRPG__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5012:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5013:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5013:2: ( RULE_ID )
            // InternalRpgindividual.g:5014:3: RULE_ID
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
    // InternalRpgindividual.g:5023:1: rule__SystemRPG__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__SystemRPG__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5027:1: ( ( ruleDeclaration ) )
            // InternalRpgindividual.g:5028:2: ( ruleDeclaration )
            {
            // InternalRpgindividual.g:5028:2: ( ruleDeclaration )
            // InternalRpgindividual.g:5029:3: ruleDeclaration
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
    // InternalRpgindividual.g:5038:1: rule__Effects__EffectAssignment_1 : ( ruleEffect ) ;
    public final void rule__Effects__EffectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5042:1: ( ( ruleEffect ) )
            // InternalRpgindividual.g:5043:2: ( ruleEffect )
            {
            // InternalRpgindividual.g:5043:2: ( ruleEffect )
            // InternalRpgindividual.g:5044:3: ruleEffect
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


    // $ANTLR start "rule__Effect__NameAssignment_1"
    // InternalRpgindividual.g:5053:1: rule__Effect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Effect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5057:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5058:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5058:2: ( RULE_ID )
            // InternalRpgindividual.g:5059:3: RULE_ID
            {
             before(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEffectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__NameAssignment_1"


    // $ANTLR start "rule__Effect__RuleAssignment_2"
    // InternalRpgindividual.g:5068:1: rule__Effect__RuleAssignment_2 : ( ruleRule ) ;
    public final void rule__Effect__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5072:1: ( ( ruleRule ) )
            // InternalRpgindividual.g:5073:2: ( ruleRule )
            {
            // InternalRpgindividual.g:5073:2: ( ruleRule )
            // InternalRpgindividual.g:5074:3: ruleRule
            {
             before(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getEffectAccess().getRuleRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Effect__RuleAssignment_2"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // InternalRpgindividual.g:5083:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5087:1: ( ( ruleAttribute ) )
            // InternalRpgindividual.g:5088:2: ( ruleAttribute )
            {
            // InternalRpgindividual.g:5088:2: ( ruleAttribute )
            // InternalRpgindividual.g:5089:3: ruleAttribute
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
    // InternalRpgindividual.g:5098:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5102:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5103:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5103:2: ( RULE_ID )
            // InternalRpgindividual.g:5104:3: RULE_ID
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
    // InternalRpgindividual.g:5113:1: rule__Attribute__AValAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__Attribute__AValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5117:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5118:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5118:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5119:3: ruleAttributeValues
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
    // InternalRpgindividual.g:5128:1: rule__Locations__LocAssignment_1 : ( ruleLoc ) ;
    public final void rule__Locations__LocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5132:1: ( ( ruleLoc ) )
            // InternalRpgindividual.g:5133:2: ( ruleLoc )
            {
            // InternalRpgindividual.g:5133:2: ( ruleLoc )
            // InternalRpgindividual.g:5134:3: ruleLoc
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
    // InternalRpgindividual.g:5143:1: rule__Loc__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Loc__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5147:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5148:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5148:2: ( RULE_ID )
            // InternalRpgindividual.g:5149:3: RULE_ID
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
    // InternalRpgindividual.g:5158:1: rule__Loc__TeamAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Loc__TeamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5162:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5163:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5163:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5164:3: ( RULE_ID )
            {
             before(grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0()); 
            // InternalRpgindividual.g:5165:3: ( RULE_ID )
            // InternalRpgindividual.g:5166:4: RULE_ID
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
    // InternalRpgindividual.g:5177:1: rule__Relations__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Relations__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5181:1: ( ( ruleType ) )
            // InternalRpgindividual.g:5182:2: ( ruleType )
            {
            // InternalRpgindividual.g:5182:2: ( ruleType )
            // InternalRpgindividual.g:5183:3: ruleType
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
    // InternalRpgindividual.g:5192:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5196:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5197:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5197:2: ( RULE_ID )
            // InternalRpgindividual.g:5198:3: RULE_ID
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
    // InternalRpgindividual.g:5207:1: rule__Type__TExpressionAssignment_2 : ( ruleTypeExpression ) ;
    public final void rule__Type__TExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5211:1: ( ( ruleTypeExpression ) )
            // InternalRpgindividual.g:5212:2: ( ruleTypeExpression )
            {
            // InternalRpgindividual.g:5212:2: ( ruleTypeExpression )
            // InternalRpgindividual.g:5213:3: ruleTypeExpression
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
    // InternalRpgindividual.g:5222:1: rule__TypeExpression__StrongAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__StrongAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5226:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5227:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5227:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5228:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0()); 
            // InternalRpgindividual.g:5229:3: ( RULE_ID )
            // InternalRpgindividual.g:5230:4: RULE_ID
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
    // InternalRpgindividual.g:5241:1: rule__TypeExpression__Strong2Assignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Strong2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5245:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5246:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5246:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5247:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0()); 
            // InternalRpgindividual.g:5248:3: ( RULE_ID )
            // InternalRpgindividual.g:5249:4: RULE_ID
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
    // InternalRpgindividual.g:5260:1: rule__TypeExpression__CurrentTAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__CurrentTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5264:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5265:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5265:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5266:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0()); 
            // InternalRpgindividual.g:5267:3: ( RULE_ID )
            // InternalRpgindividual.g:5268:4: RULE_ID
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
    // InternalRpgindividual.g:5279:1: rule__TypeExpression__WeakAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__WeakAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5283:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5284:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5284:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5285:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0()); 
            // InternalRpgindividual.g:5286:3: ( RULE_ID )
            // InternalRpgindividual.g:5287:4: RULE_ID
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
    // InternalRpgindividual.g:5298:1: rule__TypeExpression__Weak2Assignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__TypeExpression__Weak2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5302:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5303:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5303:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5304:3: ( RULE_ID )
            {
             before(grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0()); 
            // InternalRpgindividual.g:5305:3: ( RULE_ID )
            // InternalRpgindividual.g:5306:4: RULE_ID
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
    // InternalRpgindividual.g:5317:1: rule__Moves__MoveAssignment_1 : ( ruleMove ) ;
    public final void rule__Moves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5321:1: ( ( ruleMove ) )
            // InternalRpgindividual.g:5322:2: ( ruleMove )
            {
            // InternalRpgindividual.g:5322:2: ( ruleMove )
            // InternalRpgindividual.g:5323:3: ruleMove
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
    // InternalRpgindividual.g:5332:1: rule__Move__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Move__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5336:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5337:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5337:2: ( RULE_ID )
            // InternalRpgindividual.g:5338:3: RULE_ID
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
    // InternalRpgindividual.g:5347:1: rule__Move__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Move__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5351:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5352:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5352:2: ( ruleEType )
            // InternalRpgindividual.g:5353:3: ruleEType
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
    // InternalRpgindividual.g:5362:1: rule__Move__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Move__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5366:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5367:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5367:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:5368:3: ruleAltAttribute
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


    // $ANTLR start "rule__Move__MEffectAssignment_4"
    // InternalRpgindividual.g:5377:1: rule__Move__MEffectAssignment_4 : ( ruleMEffect ) ;
    public final void rule__Move__MEffectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5381:1: ( ( ruleMEffect ) )
            // InternalRpgindividual.g:5382:2: ( ruleMEffect )
            {
            // InternalRpgindividual.g:5382:2: ( ruleMEffect )
            // InternalRpgindividual.g:5383:3: ruleMEffect
            {
             before(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMEffect();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__MEffectAssignment_4"


    // $ANTLR start "rule__MEffect__MoveENameAssignment_1"
    // InternalRpgindividual.g:5392:1: rule__MEffect__MoveENameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MEffect__MoveENameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5396:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5397:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5397:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5398:3: ( RULE_ID )
            {
             before(grammarAccess.getMEffectAccess().getMoveENameEffectCrossReference_1_0()); 
            // InternalRpgindividual.g:5399:3: ( RULE_ID )
            // InternalRpgindividual.g:5400:4: RULE_ID
            {
             before(grammarAccess.getMEffectAccess().getMoveENameEffectIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMEffectAccess().getMoveENameEffectIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMEffectAccess().getMoveENameEffectCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEffect__MoveENameAssignment_1"


    // $ANTLR start "rule__EType__TypeAssignment_1"
    // InternalRpgindividual.g:5411:1: rule__EType__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5415:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5416:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5416:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5417:3: ( RULE_ID )
            {
             before(grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0()); 
            // InternalRpgindividual.g:5418:3: ( RULE_ID )
            // InternalRpgindividual.g:5419:4: RULE_ID
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
    // InternalRpgindividual.g:5430:1: rule__AttributeValues__LTypesAssignment_1_0 : ( ruleLegalType ) ;
    public final void rule__AttributeValues__LTypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5434:1: ( ( ruleLegalType ) )
            // InternalRpgindividual.g:5435:2: ( ruleLegalType )
            {
            // InternalRpgindividual.g:5435:2: ( ruleLegalType )
            // InternalRpgindividual.g:5436:3: ruleLegalType
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
    // InternalRpgindividual.g:5445:1: rule__AttributeValues__AnAssignment_1_1 : ( ruleActualNumbers ) ;
    public final void rule__AttributeValues__AnAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5449:1: ( ( ruleActualNumbers ) )
            // InternalRpgindividual.g:5450:2: ( ruleActualNumbers )
            {
            // InternalRpgindividual.g:5450:2: ( ruleActualNumbers )
            // InternalRpgindividual.g:5451:3: ruleActualNumbers
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
    // InternalRpgindividual.g:5460:1: rule__AltAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AltAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5464:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5465:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5465:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5466:3: ( RULE_ID )
            {
             before(grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:5467:3: ( RULE_ID )
            // InternalRpgindividual.g:5468:4: RULE_ID
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
    // InternalRpgindividual.g:5479:1: rule__AltAttribute__AvAssignment_2 : ( ruleAttributeValues ) ;
    public final void rule__AltAttribute__AvAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5483:1: ( ( ruleAttributeValues ) )
            // InternalRpgindividual.g:5484:2: ( ruleAttributeValues )
            {
            // InternalRpgindividual.g:5484:2: ( ruleAttributeValues )
            // InternalRpgindividual.g:5485:3: ruleAttributeValues
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
    // InternalRpgindividual.g:5494:1: rule__Rule__OrAssignment_0_1 : ( ruleORcondition ) ;
    public final void rule__Rule__OrAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5498:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:5499:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:5499:2: ( ruleORcondition )
            // InternalRpgindividual.g:5500:3: ruleORcondition
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


    // $ANTLR start "rule__Rule__TargetThenAssignment_1"
    // InternalRpgindividual.g:5509:1: rule__Rule__TargetThenAssignment_1 : ( ruleTarget ) ;
    public final void rule__Rule__TargetThenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5513:1: ( ( ruleTarget ) )
            // InternalRpgindividual.g:5514:2: ( ruleTarget )
            {
            // InternalRpgindividual.g:5514:2: ( ruleTarget )
            // InternalRpgindividual.g:5515:3: ruleTarget
            {
             before(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetThenAssignment_1"


    // $ANTLR start "rule__Rule__TargetAttAssignment_2"
    // InternalRpgindividual.g:5524:1: rule__Rule__TargetAttAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__TargetAttAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5528:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5529:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5529:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5530:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0()); 
            // InternalRpgindividual.g:5531:3: ( RULE_ID )
            // InternalRpgindividual.g:5532:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getTargetAttAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetAttAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TargetAttAssignment_2"


    // $ANTLR start "rule__Rule__SumAssignment_4"
    // InternalRpgindividual.g:5543:1: rule__Rule__SumAssignment_4 : ( ruleSum ) ;
    public final void rule__Rule__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5547:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5548:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5548:2: ( ruleSum )
            // InternalRpgindividual.g:5549:3: ruleSum
            {
             before(grammarAccess.getRuleAccess().getSumSumParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSumSumParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__SumAssignment_4"


    // $ANTLR start "rule__Entities__EntityAssignment_1"
    // InternalRpgindividual.g:5558:1: rule__Entities__EntityAssignment_1 : ( ruleEntity ) ;
    public final void rule__Entities__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5562:1: ( ( ruleEntity ) )
            // InternalRpgindividual.g:5563:2: ( ruleEntity )
            {
            // InternalRpgindividual.g:5563:2: ( ruleEntity )
            // InternalRpgindividual.g:5564:3: ruleEntity
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


    // $ANTLR start "rule__Death__LogAssignment_2"
    // InternalRpgindividual.g:5573:1: rule__Death__LogAssignment_2 : ( ruleORcondition ) ;
    public final void rule__Death__LogAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5577:1: ( ( ruleORcondition ) )
            // InternalRpgindividual.g:5578:2: ( ruleORcondition )
            {
            // InternalRpgindividual.g:5578:2: ( ruleORcondition )
            // InternalRpgindividual.g:5579:3: ruleORcondition
            {
             before(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleORcondition();

            state._fsp--;

             after(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Death__LogAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalRpgindividual.g:5588:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5592:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5593:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5593:2: ( RULE_ID )
            // InternalRpgindividual.g:5594:3: RULE_ID
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
    // InternalRpgindividual.g:5603:1: rule__Entity__ETypeAssignment_2 : ( ruleEType ) ;
    public final void rule__Entity__ETypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5607:1: ( ( ruleEType ) )
            // InternalRpgindividual.g:5608:2: ( ruleEType )
            {
            // InternalRpgindividual.g:5608:2: ( ruleEType )
            // InternalRpgindividual.g:5609:3: ruleEType
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
    // InternalRpgindividual.g:5618:1: rule__Entity__AttAssignment_3 : ( ruleAltAttribute ) ;
    public final void rule__Entity__AttAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5622:1: ( ( ruleAltAttribute ) )
            // InternalRpgindividual.g:5623:2: ( ruleAltAttribute )
            {
            // InternalRpgindividual.g:5623:2: ( ruleAltAttribute )
            // InternalRpgindividual.g:5624:3: ruleAltAttribute
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
    // InternalRpgindividual.g:5633:1: rule__Entity__EMovesAssignment_4 : ( ruleEntityMoves ) ;
    public final void rule__Entity__EMovesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5637:1: ( ( ruleEntityMoves ) )
            // InternalRpgindividual.g:5638:2: ( ruleEntityMoves )
            {
            // InternalRpgindividual.g:5638:2: ( ruleEntityMoves )
            // InternalRpgindividual.g:5639:3: ruleEntityMoves
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
    // InternalRpgindividual.g:5648:1: rule__EntityMoves__MoveAssignment_1 : ( ruleEntityMoveModifier ) ;
    public final void rule__EntityMoves__MoveAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5652:1: ( ( ruleEntityMoveModifier ) )
            // InternalRpgindividual.g:5653:2: ( ruleEntityMoveModifier )
            {
            // InternalRpgindividual.g:5653:2: ( ruleEntityMoveModifier )
            // InternalRpgindividual.g:5654:3: ruleEntityMoveModifier
            {
             before(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoveModifier();

            state._fsp--;

             after(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__EntityMoveModifier__MoveNameAssignment_0"
    // InternalRpgindividual.g:5663:1: rule__EntityMoveModifier__MoveNameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoveModifier__MoveNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5667:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5668:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5668:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5669:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0()); 
            // InternalRpgindividual.g:5670:3: ( RULE_ID )
            // InternalRpgindividual.g:5671:4: RULE_ID
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__MoveNameAssignment_0"


    // $ANTLR start "rule__EntityMoveModifier__MoveModificationAssignment_2"
    // InternalRpgindividual.g:5682:1: rule__EntityMoveModifier__MoveModificationAssignment_2 : ( ruleEntityMoveMultiplier ) ;
    public final void rule__EntityMoveModifier__MoveModificationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5686:1: ( ( ruleEntityMoveMultiplier ) )
            // InternalRpgindividual.g:5687:2: ( ruleEntityMoveMultiplier )
            {
            // InternalRpgindividual.g:5687:2: ( ruleEntityMoveMultiplier )
            // InternalRpgindividual.g:5688:3: ruleEntityMoveMultiplier
            {
             before(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityMoveMultiplier();

            state._fsp--;

             after(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveModifier__MoveModificationAssignment_2"


    // $ANTLR start "rule__EntityMoveMultiplier__AttributeAssignment_0"
    // InternalRpgindividual.g:5697:1: rule__EntityMoveMultiplier__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EntityMoveMultiplier__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5701:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5702:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5702:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5703:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0()); 
            // InternalRpgindividual.g:5704:3: ( RULE_ID )
            // InternalRpgindividual.g:5705:4: RULE_ID
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__AttributeAssignment_0"


    // $ANTLR start "rule__EntityMoveMultiplier__MultiplierAssignment_2"
    // InternalRpgindividual.g:5716:1: rule__EntityMoveMultiplier__MultiplierAssignment_2 : ( ruleSum ) ;
    public final void rule__EntityMoveMultiplier__MultiplierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5720:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5721:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5721:2: ( ruleSum )
            // InternalRpgindividual.g:5722:3: ruleSum
            {
             before(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityMoveMultiplier__MultiplierAssignment_2"


    // $ANTLR start "rule__Teams__TeamAssignment_1"
    // InternalRpgindividual.g:5731:1: rule__Teams__TeamAssignment_1 : ( ruleTeam ) ;
    public final void rule__Teams__TeamAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5735:1: ( ( ruleTeam ) )
            // InternalRpgindividual.g:5736:2: ( ruleTeam )
            {
            // InternalRpgindividual.g:5736:2: ( ruleTeam )
            // InternalRpgindividual.g:5737:3: ruleTeam
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
    // InternalRpgindividual.g:5746:1: rule__Team__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Team__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5750:1: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5751:2: ( RULE_ID )
            {
            // InternalRpgindividual.g:5751:2: ( RULE_ID )
            // InternalRpgindividual.g:5752:3: RULE_ID
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
    // InternalRpgindividual.g:5761:1: rule__Team__MembersAssignment_2 : ( ruleMembers ) ;
    public final void rule__Team__MembersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5765:1: ( ( ruleMembers ) )
            // InternalRpgindividual.g:5766:2: ( ruleMembers )
            {
            // InternalRpgindividual.g:5766:2: ( ruleMembers )
            // InternalRpgindividual.g:5767:3: ruleMembers
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
    // InternalRpgindividual.g:5776:1: rule__Members__EntityAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Members__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5780:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5781:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5781:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5782:3: ( RULE_ID )
            {
             before(grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0()); 
            // InternalRpgindividual.g:5783:3: ( RULE_ID )
            // InternalRpgindividual.g:5784:4: RULE_ID
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


    // $ANTLR start "rule__ORcondition__RightAssignment_1_2"
    // InternalRpgindividual.g:5795:1: rule__ORcondition__RightAssignment_1_2 : ( ruleANDcondition ) ;
    public final void rule__ORcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5799:1: ( ( ruleANDcondition ) )
            // InternalRpgindividual.g:5800:2: ( ruleANDcondition )
            {
            // InternalRpgindividual.g:5800:2: ( ruleANDcondition )
            // InternalRpgindividual.g:5801:3: ruleANDcondition
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
    // InternalRpgindividual.g:5810:1: rule__ANDcondition__RightAssignment_1_2 : ( ruleStatement ) ;
    public final void rule__ANDcondition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5814:1: ( ( ruleStatement ) )
            // InternalRpgindividual.g:5815:2: ( ruleStatement )
            {
            // InternalRpgindividual.g:5815:2: ( ruleStatement )
            // InternalRpgindividual.g:5816:3: ruleStatement
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
    // InternalRpgindividual.g:5825:1: rule__NumberComparing__LeftAssignment_0 : ( ruleSum ) ;
    public final void rule__NumberComparing__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5829:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5830:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5830:2: ( ruleSum )
            // InternalRpgindividual.g:5831:3: ruleSum
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
    // InternalRpgindividual.g:5840:1: rule__NumberComparing__CompAssignment_1 : ( ruleComparator ) ;
    public final void rule__NumberComparing__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5844:1: ( ( ruleComparator ) )
            // InternalRpgindividual.g:5845:2: ( ruleComparator )
            {
            // InternalRpgindividual.g:5845:2: ( ruleComparator )
            // InternalRpgindividual.g:5846:3: ruleComparator
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
    // InternalRpgindividual.g:5855:1: rule__NumberComparing__RightAssignment_2 : ( ruleSum ) ;
    public final void rule__NumberComparing__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5859:1: ( ( ruleSum ) )
            // InternalRpgindividual.g:5860:2: ( ruleSum )
            {
            // InternalRpgindividual.g:5860:2: ( ruleSum )
            // InternalRpgindividual.g:5861:3: ruleSum
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
    // InternalRpgindividual.g:5870:1: rule__Sum__RightAssignment_1_1 : ( ruleMultiply ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5874:1: ( ( ruleMultiply ) )
            // InternalRpgindividual.g:5875:2: ( ruleMultiply )
            {
            // InternalRpgindividual.g:5875:2: ( ruleMultiply )
            // InternalRpgindividual.g:5876:3: ruleMultiply
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
    // InternalRpgindividual.g:5885:1: rule__Multiply__RightAssignment_1_1 : ( ruleAtomicNumber ) ;
    public final void rule__Multiply__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5889:1: ( ( ruleAtomicNumber ) )
            // InternalRpgindividual.g:5890:2: ( ruleAtomicNumber )
            {
            // InternalRpgindividual.g:5890:2: ( ruleAtomicNumber )
            // InternalRpgindividual.g:5891:3: ruleAtomicNumber
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


    // $ANTLR start "rule__NameAttribute__TargetAssignment_0"
    // InternalRpgindividual.g:5900:1: rule__NameAttribute__TargetAssignment_0 : ( ruleTarget ) ;
    public final void rule__NameAttribute__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5904:1: ( ( ruleTarget ) )
            // InternalRpgindividual.g:5905:2: ( ruleTarget )
            {
            // InternalRpgindividual.g:5905:2: ( ruleTarget )
            // InternalRpgindividual.g:5906:3: ruleTarget
            {
             before(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTarget();

            state._fsp--;

             after(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__TargetAssignment_0"


    // $ANTLR start "rule__NameAttribute__AttributeAssignment_1"
    // InternalRpgindividual.g:5915:1: rule__NameAttribute__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__NameAttribute__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5919:1: ( ( ( RULE_ID ) ) )
            // InternalRpgindividual.g:5920:2: ( ( RULE_ID ) )
            {
            // InternalRpgindividual.g:5920:2: ( ( RULE_ID ) )
            // InternalRpgindividual.g:5921:3: ( RULE_ID )
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalRpgindividual.g:5922:3: ( RULE_ID )
            // InternalRpgindividual.g:5923:4: RULE_ID
            {
             before(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameAttribute__AttributeAssignment_1"


    // $ANTLR start "rule__IntNum__ValueAssignment"
    // InternalRpgindividual.g:5934:1: rule__IntNum__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntNum__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5938:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:5939:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:5939:2: ( RULE_INT )
            // InternalRpgindividual.g:5940:3: RULE_INT
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
    // InternalRpgindividual.g:5949:1: rule__FloatNum__IAssignment_0 : ( RULE_INT ) ;
    public final void rule__FloatNum__IAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5953:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:5954:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:5954:2: ( RULE_INT )
            // InternalRpgindividual.g:5955:3: RULE_INT
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
    // InternalRpgindividual.g:5964:1: rule__FloatNum__DecimalAssignment_2 : ( RULE_INT ) ;
    public final void rule__FloatNum__DecimalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRpgindividual.g:5968:1: ( ( RULE_INT ) )
            // InternalRpgindividual.g:5969:2: ( RULE_INT )
            {
            // InternalRpgindividual.g:5969:2: ( RULE_INT )
            // InternalRpgindividual.g:5970:3: RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004184550000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004184550002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020007820L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000820007820L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000F80001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004002000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004002000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000020L});

}