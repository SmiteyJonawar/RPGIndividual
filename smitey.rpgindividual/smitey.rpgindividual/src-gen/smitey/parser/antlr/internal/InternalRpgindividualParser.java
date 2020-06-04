package smitey.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import smitey.services.RpgindividualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRpgindividualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'effects'", "'effect'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "','", "'<'", "'moves'", "'move'", "'is'", "'if'", "'then'", "'entities'", "'death'", "'when'", "'entity'", "'('", "')'", "'*'", "'teams'", "'team'", "'members'", "'OR'", "'AND'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'/'", "'.'", "'User'", "'Enemy'", "'Float'", "'Integer'"
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

        public InternalRpgindividualParser(TokenStream input, RpgindividualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SystemRPG";
       	}

       	@Override
       	protected RpgindividualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystemRPG"
    // InternalRpgindividual.g:64:1: entryRuleSystemRPG returns [EObject current=null] : iv_ruleSystemRPG= ruleSystemRPG EOF ;
    public final EObject entryRuleSystemRPG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemRPG = null;


        try {
            // InternalRpgindividual.g:64:50: (iv_ruleSystemRPG= ruleSystemRPG EOF )
            // InternalRpgindividual.g:65:2: iv_ruleSystemRPG= ruleSystemRPG EOF
            {
             newCompositeNode(grammarAccess.getSystemRPGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemRPG=ruleSystemRPG();

            state._fsp--;

             current =iv_ruleSystemRPG; 
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
    // $ANTLR end "entryRuleSystemRPG"


    // $ANTLR start "ruleSystemRPG"
    // InternalRpgindividual.g:71:1: ruleSystemRPG returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleSystemRPG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:77:2: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalRpgindividual.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalRpgindividual.g:78:2: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalRpgindividual.g:79:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemRPGAccess().getGameKeyword_0());
            		
            // InternalRpgindividual.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemRPGAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRPGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14||LA1_0==16||LA1_0==18||LA1_0==22||(LA1_0>=27 && LA1_0<=28)||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRpgindividual.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalRpgindividual.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalRpgindividual.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getSystemRPGAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRPGRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"smitey.Rpgindividual.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleSystemRPG"


    // $ANTLR start "entryRuleDeclaration"
    // InternalRpgindividual.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalRpgindividual.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalRpgindividual.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalRpgindividual.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Locations_0 = null;

        EObject this_Relations_1 = null;

        EObject this_Moves_2 = null;

        EObject this_Entities_3 = null;

        EObject this_Teams_4 = null;

        EObject this_Death_5 = null;

        EObject this_Attributes_6 = null;

        EObject this_Effects_7 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:137:2: ( (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects ) )
            // InternalRpgindividual.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            {
            // InternalRpgindividual.g:138:2: (this_Locations_0= ruleLocations | this_Relations_1= ruleRelations | this_Moves_2= ruleMoves | this_Entities_3= ruleEntities | this_Teams_4= ruleTeams | this_Death_5= ruleDeath | this_Attributes_6= ruleAttributes | this_Effects_7= ruleEffects )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            case 14:
                {
                alt2=7;
                }
                break;
            case 12:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRpgindividual.g:139:3: this_Locations_0= ruleLocations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getLocationsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Locations_0=ruleLocations();

                    state._fsp--;


                    			current = this_Locations_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:148:3: this_Relations_1= ruleRelations
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRelationsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relations_1=ruleRelations();

                    state._fsp--;


                    			current = this_Relations_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:157:3: this_Moves_2= ruleMoves
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getMovesParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Moves_2=ruleMoves();

                    state._fsp--;


                    			current = this_Moves_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:166:3: this_Entities_3= ruleEntities
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntitiesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entities_3=ruleEntities();

                    state._fsp--;


                    			current = this_Entities_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:175:3: this_Teams_4= ruleTeams
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getTeamsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Teams_4=ruleTeams();

                    state._fsp--;


                    			current = this_Teams_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:184:3: this_Death_5= ruleDeath
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getDeathParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Death_5=ruleDeath();

                    state._fsp--;


                    			current = this_Death_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRpgindividual.g:193:3: this_Attributes_6= ruleAttributes
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getAttributesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attributes_6=ruleAttributes();

                    state._fsp--;


                    			current = this_Attributes_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRpgindividual.g:202:3: this_Effects_7= ruleEffects
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEffectsParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Effects_7=ruleEffects();

                    state._fsp--;


                    			current = this_Effects_7;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEffects"
    // InternalRpgindividual.g:214:1: entryRuleEffects returns [EObject current=null] : iv_ruleEffects= ruleEffects EOF ;
    public final EObject entryRuleEffects() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffects = null;


        try {
            // InternalRpgindividual.g:214:48: (iv_ruleEffects= ruleEffects EOF )
            // InternalRpgindividual.g:215:2: iv_ruleEffects= ruleEffects EOF
            {
             newCompositeNode(grammarAccess.getEffectsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffects=ruleEffects();

            state._fsp--;

             current =iv_ruleEffects; 
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
    // $ANTLR end "entryRuleEffects"


    // $ANTLR start "ruleEffects"
    // InternalRpgindividual.g:221:1: ruleEffects returns [EObject current=null] : (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) ;
    public final EObject ruleEffects() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_effect_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:227:2: ( (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ ) )
            // InternalRpgindividual.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            {
            // InternalRpgindividual.g:228:2: (otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+ )
            // InternalRpgindividual.g:229:3: otherlv_0= 'effects' ( (lv_effect_1_0= ruleEffect ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectsAccess().getEffectsKeyword_0());
            		
            // InternalRpgindividual.g:233:3: ( (lv_effect_1_0= ruleEffect ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRpgindividual.g:234:4: (lv_effect_1_0= ruleEffect )
            	    {
            	    // InternalRpgindividual.g:234:4: (lv_effect_1_0= ruleEffect )
            	    // InternalRpgindividual.g:235:5: lv_effect_1_0= ruleEffect
            	    {

            	    					newCompositeNode(grammarAccess.getEffectsAccess().getEffectEffectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_effect_1_0=ruleEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEffectsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"effect",
            	    						lv_effect_1_0,
            	    						"smitey.Rpgindividual.Effect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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
    // $ANTLR end "ruleEffects"


    // $ANTLR start "entryRuleEffect"
    // InternalRpgindividual.g:256:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // InternalRpgindividual.g:256:47: (iv_ruleEffect= ruleEffect EOF )
            // InternalRpgindividual.g:257:2: iv_ruleEffect= ruleEffect EOF
            {
             newCompositeNode(grammarAccess.getEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEffect=ruleEffect();

            state._fsp--;

             current =iv_ruleEffect; 
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
    // $ANTLR end "entryRuleEffect"


    // $ANTLR start "ruleEffect"
    // InternalRpgindividual.g:263:1: ruleEffect returns [EObject current=null] : (otherlv_0= 'effect' this_MoveE_1= ruleMoveE ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MoveE_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:269:2: ( (otherlv_0= 'effect' this_MoveE_1= ruleMoveE ) )
            // InternalRpgindividual.g:270:2: (otherlv_0= 'effect' this_MoveE_1= ruleMoveE )
            {
            // InternalRpgindividual.g:270:2: (otherlv_0= 'effect' this_MoveE_1= ruleMoveE )
            // InternalRpgindividual.g:271:3: otherlv_0= 'effect' this_MoveE_1= ruleMoveE
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEffectAccess().getEffectKeyword_0());
            		

            			newCompositeNode(grammarAccess.getEffectAccess().getMoveEParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_MoveE_1=ruleMoveE();

            state._fsp--;


            			current = this_MoveE_1;
            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleEffect"


    // $ANTLR start "entryRuleMoveE"
    // InternalRpgindividual.g:287:1: entryRuleMoveE returns [EObject current=null] : iv_ruleMoveE= ruleMoveE EOF ;
    public final EObject entryRuleMoveE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveE = null;


        try {
            // InternalRpgindividual.g:287:46: (iv_ruleMoveE= ruleMoveE EOF )
            // InternalRpgindividual.g:288:2: iv_ruleMoveE= ruleMoveE EOF
            {
             newCompositeNode(grammarAccess.getMoveERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveE=ruleMoveE();

            state._fsp--;

             current =iv_ruleMoveE; 
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
    // $ANTLR end "entryRuleMoveE"


    // $ANTLR start "ruleMoveE"
    // InternalRpgindividual.g:294:1: ruleMoveE returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= ruleRule ) ) ) ;
    public final EObject ruleMoveE() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_rule_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:300:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= ruleRule ) ) ) )
            // InternalRpgindividual.g:301:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= ruleRule ) ) )
            {
            // InternalRpgindividual.g:301:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= ruleRule ) ) )
            // InternalRpgindividual.g:302:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_rule_1_0= ruleRule ) )
            {
            // InternalRpgindividual.g:302:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpgindividual.g:303:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpgindividual.g:303:4: (lv_name_0_0= RULE_ID )
            // InternalRpgindividual.g:304:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:320:3: ( (lv_rule_1_0= ruleRule ) )
            // InternalRpgindividual.g:321:4: (lv_rule_1_0= ruleRule )
            {
            // InternalRpgindividual.g:321:4: (lv_rule_1_0= ruleRule )
            // InternalRpgindividual.g:322:5: lv_rule_1_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_1_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveERule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_1_0,
            						"smitey.Rpgindividual.Rule");
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
    // $ANTLR end "ruleMoveE"


    // $ANTLR start "entryRuleAttributes"
    // InternalRpgindividual.g:343:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRpgindividual.g:343:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRpgindividual.g:344:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
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
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // InternalRpgindividual.g:350:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:356:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRpgindividual.g:357:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRpgindividual.g:357:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRpgindividual.g:358:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRpgindividual.g:362:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRpgindividual.g:363:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRpgindividual.g:363:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRpgindividual.g:364:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attribute",
            	    						lv_attribute_1_0,
            	    						"smitey.Rpgindividual.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // InternalRpgindividual.g:385:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRpgindividual.g:385:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRpgindividual.g:386:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalRpgindividual.g:392:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:398:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalRpgindividual.g:399:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalRpgindividual.g:399:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalRpgindividual.g:400:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:404:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:405:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:405:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:406:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:422:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalRpgindividual.g:423:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalRpgindividual.g:423:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalRpgindividual.g:424:5: lv_aVal_2_0= ruleAttributeValues
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAValAttributeValuesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_aVal_2_0=ruleAttributeValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"aVal",
            						lv_aVal_2_0,
            						"smitey.Rpgindividual.AttributeValues");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLocations"
    // InternalRpgindividual.g:445:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRpgindividual.g:445:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRpgindividual.g:446:2: iv_ruleLocations= ruleLocations EOF
            {
             newCompositeNode(grammarAccess.getLocationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocations=ruleLocations();

            state._fsp--;

             current =iv_ruleLocations; 
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
    // $ANTLR end "entryRuleLocations"


    // $ANTLR start "ruleLocations"
    // InternalRpgindividual.g:452:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:458:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRpgindividual.g:459:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRpgindividual.g:459:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRpgindividual.g:460:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRpgindividual.g:464:3: ( (lv_loc_1_0= ruleLoc ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRpgindividual.g:465:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRpgindividual.g:465:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRpgindividual.g:466:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_loc_1_0=ruleLoc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loc",
            	    						lv_loc_1_0,
            	    						"smitey.Rpgindividual.Loc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


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
    // $ANTLR end "ruleLocations"


    // $ANTLR start "entryRuleLoc"
    // InternalRpgindividual.g:487:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRpgindividual.g:487:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRpgindividual.g:488:2: iv_ruleLoc= ruleLoc EOF
            {
             newCompositeNode(grammarAccess.getLocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoc=ruleLoc();

            state._fsp--;

             current =iv_ruleLoc; 
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
    // $ANTLR end "entryRuleLoc"


    // $ANTLR start "ruleLoc"
    // InternalRpgindividual.g:494:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:500:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRpgindividual.g:501:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:501:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            // InternalRpgindividual.g:502:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRpgindividual.g:502:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpgindividual.g:503:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpgindividual.g:503:4: (lv_name_0_0= RULE_ID )
            // InternalRpgindividual.g:504:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocAccess().getOpponentsKeyword_1());
            		
            // InternalRpgindividual.g:524:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgindividual.g:525:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgindividual.g:525:4: (otherlv_2= RULE_ID )
            // InternalRpgindividual.g:526:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLocAccess().getTeamTeamCrossReference_2_0());
            				

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
    // $ANTLR end "ruleLoc"


    // $ANTLR start "entryRuleRelations"
    // InternalRpgindividual.g:541:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRpgindividual.g:541:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRpgindividual.g:542:2: iv_ruleRelations= ruleRelations EOF
            {
             newCompositeNode(grammarAccess.getRelationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelations=ruleRelations();

            state._fsp--;

             current =iv_ruleRelations; 
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
    // $ANTLR end "entryRuleRelations"


    // $ANTLR start "ruleRelations"
    // InternalRpgindividual.g:548:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:554:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalRpgindividual.g:555:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalRpgindividual.g:555:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalRpgindividual.g:556:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRpgindividual.g:560:3: ( (lv_type_1_0= ruleType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRpgindividual.g:561:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalRpgindividual.g:561:4: (lv_type_1_0= ruleType )
            	    // InternalRpgindividual.g:562:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_type_1_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRelationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_1_0,
            	    						"smitey.Rpgindividual.Type");
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
    // $ANTLR end "ruleRelations"


    // $ANTLR start "entryRuleType"
    // InternalRpgindividual.g:583:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRpgindividual.g:583:45: (iv_ruleType= ruleType EOF )
            // InternalRpgindividual.g:584:2: iv_ruleType= ruleType EOF
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
    // InternalRpgindividual.g:590:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:596:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRpgindividual.g:597:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRpgindividual.g:597:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRpgindividual.g:598:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:602:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:603:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:603:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:604:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:620:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:621:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRpgindividual.g:621:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRpgindividual.g:622:5: lv_tExpression_2_0= ruleTypeExpression
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getTExpressionTypeExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tExpression_2_0=ruleTypeExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"tExpression",
                    						lv_tExpression_2_0,
                    						"smitey.Rpgindividual.TypeExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeExpression"
    // InternalRpgindividual.g:643:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRpgindividual.g:643:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRpgindividual.g:644:2: iv_ruleTypeExpression= ruleTypeExpression EOF
            {
             newCompositeNode(grammarAccess.getTypeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpression=ruleTypeExpression();

            state._fsp--;

             current =iv_ruleTypeExpression; 
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
    // $ANTLR end "entryRuleTypeExpression"


    // $ANTLR start "ruleTypeExpression"
    // InternalRpgindividual.g:650:1: ruleTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) ;
    public final EObject ruleTypeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:656:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalRpgindividual.g:657:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalRpgindividual.g:657:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            // InternalRpgindividual.g:658:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalRpgindividual.g:658:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:659:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:659:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:660:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0());
            				

            }


            }

            // InternalRpgindividual.g:671:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpgindividual.g:672:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:676:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalRpgindividual.g:677:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:677:5: (otherlv_2= RULE_ID )
            	    // InternalRpgindividual.g:678:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    						newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalRpgindividual.g:694:3: ( (otherlv_4= RULE_ID ) )
            // InternalRpgindividual.g:695:4: (otherlv_4= RULE_ID )
            {
            // InternalRpgindividual.g:695:4: (otherlv_4= RULE_ID )
            // InternalRpgindividual.g:696:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4());
            		
            // InternalRpgindividual.g:711:3: ( (otherlv_6= RULE_ID ) )
            // InternalRpgindividual.g:712:4: (otherlv_6= RULE_ID )
            {
            // InternalRpgindividual.g:712:4: (otherlv_6= RULE_ID )
            // InternalRpgindividual.g:713:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0());
            				

            }


            }

            // InternalRpgindividual.g:724:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRpgindividual.g:725:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRpgindividual.g:729:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalRpgindividual.g:730:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:730:5: (otherlv_8= RULE_ID )
            	    // InternalRpgindividual.g:731:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    						newLeafNode(otherlv_8, grammarAccess.getTypeExpressionAccess().getWeak2TypeCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleTypeExpression"


    // $ANTLR start "entryRuleMoves"
    // InternalRpgindividual.g:747:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRpgindividual.g:747:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRpgindividual.g:748:2: iv_ruleMoves= ruleMoves EOF
            {
             newCompositeNode(grammarAccess.getMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoves=ruleMoves();

            state._fsp--;

             current =iv_ruleMoves; 
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
    // $ANTLR end "entryRuleMoves"


    // $ANTLR start "ruleMoves"
    // InternalRpgindividual.g:754:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:760:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRpgindividual.g:761:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRpgindividual.g:761:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRpgindividual.g:762:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRpgindividual.g:766:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRpgindividual.g:767:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRpgindividual.g:767:4: (lv_move_1_0= ruleMove )
            	    // InternalRpgindividual.g:768:5: lv_move_1_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getMovesAccess().getMoveMoveParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_move_1_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"smitey.Rpgindividual.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


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
    // $ANTLR end "ruleMoves"


    // $ANTLR start "entryRuleMove"
    // InternalRpgindividual.g:789:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRpgindividual.g:789:45: (iv_ruleMove= ruleMove EOF )
            // InternalRpgindividual.g:790:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalRpgindividual.g:796:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_mEffect_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:802:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) )
            // InternalRpgindividual.g:803:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            {
            // InternalRpgindividual.g:803:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            // InternalRpgindividual.g:804:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:808:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:809:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:809:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:810:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:826:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:827:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:827:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:828:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"smitey.Rpgindividual.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:845:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRpgindividual.g:846:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:846:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:847:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"smitey.Rpgindividual.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalRpgindividual.g:864:3: ( (lv_mEffect_4_0= ruleMEffect ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRpgindividual.g:865:4: (lv_mEffect_4_0= ruleMEffect )
            	    {
            	    // InternalRpgindividual.g:865:4: (lv_mEffect_4_0= ruleMEffect )
            	    // InternalRpgindividual.g:866:5: lv_mEffect_4_0= ruleMEffect
            	    {

            	    					newCompositeNode(grammarAccess.getMoveAccess().getMEffectMEffectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_mEffect_4_0=ruleMEffect();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mEffect",
            	    						lv_mEffect_4_0,
            	    						"smitey.Rpgindividual.MEffect");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleMEffect"
    // InternalRpgindividual.g:887:1: entryRuleMEffect returns [EObject current=null] : iv_ruleMEffect= ruleMEffect EOF ;
    public final EObject entryRuleMEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEffect = null;


        try {
            // InternalRpgindividual.g:887:48: (iv_ruleMEffect= ruleMEffect EOF )
            // InternalRpgindividual.g:888:2: iv_ruleMEffect= ruleMEffect EOF
            {
             newCompositeNode(grammarAccess.getMEffectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMEffect=ruleMEffect();

            state._fsp--;

             current =iv_ruleMEffect; 
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
    // $ANTLR end "entryRuleMEffect"


    // $ANTLR start "ruleMEffect"
    // InternalRpgindividual.g:894:1: ruleMEffect returns [EObject current=null] : (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:900:2: ( (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:901:2: (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:901:2: (otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:902:3: otherlv_0= 'effect' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMEffectAccess().getEffectKeyword_0());
            		
            // InternalRpgindividual.g:906:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:907:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:907:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:908:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMEffectRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_1_0());
            				

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
    // $ANTLR end "ruleMEffect"


    // $ANTLR start "entryRuleEType"
    // InternalRpgindividual.g:923:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRpgindividual.g:923:46: (iv_ruleEType= ruleEType EOF )
            // InternalRpgindividual.g:924:2: iv_ruleEType= ruleEType EOF
            {
             newCompositeNode(grammarAccess.getETypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEType=ruleEType();

            state._fsp--;

             current =iv_ruleEType; 
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
    // $ANTLR end "entryRuleEType"


    // $ANTLR start "ruleEType"
    // InternalRpgindividual.g:930:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:936:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:937:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:937:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:938:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:942:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:943:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:943:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:944:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETypeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getETypeAccess().getTypeTypeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEType"


    // $ANTLR start "entryRuleAttributeValues"
    // InternalRpgindividual.g:959:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRpgindividual.g:959:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRpgindividual.g:960:2: iv_ruleAttributeValues= ruleAttributeValues EOF
            {
             newCompositeNode(grammarAccess.getAttributeValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValues=ruleAttributeValues();

            state._fsp--;

             current =iv_ruleAttributeValues; 
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
    // $ANTLR end "entryRuleAttributeValues"


    // $ANTLR start "ruleAttributeValues"
    // InternalRpgindividual.g:966:1: ruleAttributeValues returns [EObject current=null] : (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:972:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) )
            // InternalRpgindividual.g:973:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            {
            // InternalRpgindividual.g:973:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            // InternalRpgindividual.g:974:3: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0());
            		
            // InternalRpgindividual.g:978:3: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=50 && LA13_0<=51)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRpgindividual.g:979:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    {
                    // InternalRpgindividual.g:979:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    // InternalRpgindividual.g:980:5: (lv_lTypes_1_0= ruleLegalType )
                    {
                    // InternalRpgindividual.g:980:5: (lv_lTypes_1_0= ruleLegalType )
                    // InternalRpgindividual.g:981:6: lv_lTypes_1_0= ruleLegalType
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getLTypesLegalTypeParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lTypes_1_0=ruleLegalType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"lTypes",
                    							lv_lTypes_1_0,
                    							"smitey.Rpgindividual.LegalType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:999:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    {
                    // InternalRpgindividual.g:999:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    // InternalRpgindividual.g:1000:5: (lv_an_2_0= ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1000:5: (lv_an_2_0= ruleActualNumbers )
                    // InternalRpgindividual.g:1001:6: lv_an_2_0= ruleActualNumbers
                    {

                    						newCompositeNode(grammarAccess.getAttributeValuesAccess().getAnActualNumbersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_an_2_0=ruleActualNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeValuesRule());
                    						}
                    						set(
                    							current,
                    							"an",
                    							lv_an_2_0,
                    							"smitey.Rpgindividual.ActualNumbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttributeValues"


    // $ANTLR start "entryRuleAltAttribute"
    // InternalRpgindividual.g:1023:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRpgindividual.g:1023:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRpgindividual.g:1024:2: iv_ruleAltAttribute= ruleAltAttribute EOF
            {
             newCompositeNode(grammarAccess.getAltAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAltAttribute=ruleAltAttribute();

            state._fsp--;

             current =iv_ruleAltAttribute; 
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
    // $ANTLR end "entryRuleAltAttribute"


    // $ANTLR start "ruleAltAttribute"
    // InternalRpgindividual.g:1030:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1036:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRpgindividual.g:1037:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRpgindividual.g:1037:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRpgindividual.g:1038:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:1042:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:1043:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:1043:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:1044:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRpgindividual.g:1055:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRpgindividual.g:1056:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRpgindividual.g:1056:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRpgindividual.g:1057:5: lv_av_2_0= ruleAttributeValues
                    {

                    					newCompositeNode(grammarAccess.getAltAttributeAccess().getAvAttributeValuesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_av_2_0=ruleAttributeValues();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAltAttributeRule());
                    					}
                    					set(
                    						current,
                    						"av",
                    						lv_av_2_0,
                    						"smitey.Rpgindividual.AttributeValues");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAltAttribute"


    // $ANTLR start "entryRuleRule"
    // InternalRpgindividual.g:1078:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRpgindividual.g:1078:45: (iv_ruleRule= ruleRule EOF )
            // InternalRpgindividual.g:1079:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRpgindividual.g:1085:1: ruleRule returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_or_1_0 = null;

        AntlrDatatypeRuleToken lv_targetThen_3_0 = null;

        EObject lv_sum_6_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1091:2: ( ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1092:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1092:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) )
            // InternalRpgindividual.g:1093:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1093:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRpgindividual.g:1094:4: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0_0());
                    			
                    // InternalRpgindividual.g:1098:4: ( (lv_or_1_0= ruleORcondition ) )
                    // InternalRpgindividual.g:1099:5: (lv_or_1_0= ruleORcondition )
                    {
                    // InternalRpgindividual.g:1099:5: (lv_or_1_0= ruleORcondition )
                    // InternalRpgindividual.g:1100:6: lv_or_1_0= ruleORcondition
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getOrORconditionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_or_1_0=ruleORcondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"or",
                    							lv_or_1_0,
                    							"smitey.Rpgindividual.ORcondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRpgindividual.g:1122:3: ( (lv_targetThen_3_0= ruleTarget ) )
            // InternalRpgindividual.g:1123:4: (lv_targetThen_3_0= ruleTarget )
            {
            // InternalRpgindividual.g:1123:4: (lv_targetThen_3_0= ruleTarget )
            // InternalRpgindividual.g:1124:5: lv_targetThen_3_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTargetThenTargetParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_targetThen_3_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"targetThen",
            						lv_targetThen_3_0,
            						"smitey.Rpgindividual.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1141:3: ( (otherlv_4= RULE_ID ) )
            // InternalRpgindividual.g:1142:4: (otherlv_4= RULE_ID )
            {
            // InternalRpgindividual.g:1142:4: (otherlv_4= RULE_ID )
            // InternalRpgindividual.g:1143:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getIsKeyword_3());
            		
            // InternalRpgindividual.g:1158:3: ( (lv_sum_6_0= ruleSum ) )
            // InternalRpgindividual.g:1159:4: (lv_sum_6_0= ruleSum )
            {
            // InternalRpgindividual.g:1159:4: (lv_sum_6_0= ruleSum )
            // InternalRpgindividual.g:1160:5: lv_sum_6_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSumSumParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_sum_6_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"sum",
            						lv_sum_6_0,
            						"smitey.Rpgindividual.Sum");
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleEntities"
    // InternalRpgindividual.g:1181:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRpgindividual.g:1181:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRpgindividual.g:1182:2: iv_ruleEntities= ruleEntities EOF
            {
             newCompositeNode(grammarAccess.getEntitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntities=ruleEntities();

            state._fsp--;

             current =iv_ruleEntities; 
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
    // $ANTLR end "entryRuleEntities"


    // $ANTLR start "ruleEntities"
    // InternalRpgindividual.g:1188:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1194:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRpgindividual.g:1195:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRpgindividual.g:1195:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRpgindividual.g:1196:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRpgindividual.g:1200:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRpgindividual.g:1201:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRpgindividual.g:1201:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRpgindividual.g:1202:5: lv_entity_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getEntitiesAccess().getEntityEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_entity_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entity",
            	    						lv_entity_1_0,
            	    						"smitey.Rpgindividual.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


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
    // $ANTLR end "ruleEntities"


    // $ANTLR start "entryRuleDeath"
    // InternalRpgindividual.g:1223:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRpgindividual.g:1223:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRpgindividual.g:1224:2: iv_ruleDeath= ruleDeath EOF
            {
             newCompositeNode(grammarAccess.getDeathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeath=ruleDeath();

            state._fsp--;

             current =iv_ruleDeath; 
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
    // $ANTLR end "entryRuleDeath"


    // $ANTLR start "ruleDeath"
    // InternalRpgindividual.g:1230:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_log_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1236:2: ( (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) ) )
            // InternalRpgindividual.g:1237:2: (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) )
            {
            // InternalRpgindividual.g:1237:2: (otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) ) )
            // InternalRpgindividual.g:1238:3: otherlv_0= 'death' otherlv_1= 'when' ( (lv_log_2_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getDeathAccess().getWhenKeyword_1());
            		
            // InternalRpgindividual.g:1246:3: ( (lv_log_2_0= ruleORcondition ) )
            // InternalRpgindividual.g:1247:4: (lv_log_2_0= ruleORcondition )
            {
            // InternalRpgindividual.g:1247:4: (lv_log_2_0= ruleORcondition )
            // InternalRpgindividual.g:1248:5: lv_log_2_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getDeathAccess().getLogORconditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_log_2_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeathRule());
            					}
            					set(
            						current,
            						"log",
            						lv_log_2_0,
            						"smitey.Rpgindividual.ORcondition");
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
    // $ANTLR end "ruleDeath"


    // $ANTLR start "entryRuleEntity"
    // InternalRpgindividual.g:1269:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRpgindividual.g:1269:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRpgindividual.g:1270:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalRpgindividual.g:1276:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1282:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) )
            // InternalRpgindividual.g:1283:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            {
            // InternalRpgindividual.g:1283:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            // InternalRpgindividual.g:1284:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRpgindividual.g:1288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1289:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1290:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:1306:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:1307:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:1307:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:1308:5: lv_eType_2_0= ruleEType
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getETypeETypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_eType_2_0=ruleEType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eType",
            						lv_eType_2_0,
            						"smitey.Rpgindividual.EType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1325:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRpgindividual.g:1326:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:1326:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:1327:5: lv_att_3_0= ruleAltAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttAltAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_att_3_0=ruleAltAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"att",
            	    						lv_att_3_0,
            	    						"smitey.Rpgindividual.AltAttribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalRpgindividual.g:1344:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )
            // InternalRpgindividual.g:1345:4: (lv_eMoves_4_0= ruleEntityMoves )
            {
            // InternalRpgindividual.g:1345:4: (lv_eMoves_4_0= ruleEntityMoves )
            // InternalRpgindividual.g:1346:5: lv_eMoves_4_0= ruleEntityMoves
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getEMovesEntityMovesParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_eMoves_4_0=ruleEntityMoves();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"eMoves",
            						lv_eMoves_4_0,
            						"smitey.Rpgindividual.EntityMoves");
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleEntityMoves"
    // InternalRpgindividual.g:1367:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRpgindividual.g:1367:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRpgindividual.g:1368:2: iv_ruleEntityMoves= ruleEntityMoves EOF
            {
             newCompositeNode(grammarAccess.getEntityMovesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoves=ruleEntityMoves();

            state._fsp--;

             current =iv_ruleEntityMoves; 
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
    // $ANTLR end "entryRuleEntityMoves"


    // $ANTLR start "ruleEntityMoves"
    // InternalRpgindividual.g:1374:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1380:2: ( (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ ) )
            // InternalRpgindividual.g:1381:2: (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ )
            {
            // InternalRpgindividual.g:1381:2: (otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+ )
            // InternalRpgindividual.g:1382:3: otherlv_0= 'move' ( (lv_move_1_0= ruleEntityMoveModifier ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:1386:3: ( (lv_move_1_0= ruleEntityMoveModifier ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRpgindividual.g:1387:4: (lv_move_1_0= ruleEntityMoveModifier )
            	    {
            	    // InternalRpgindividual.g:1387:4: (lv_move_1_0= ruleEntityMoveModifier )
            	    // InternalRpgindividual.g:1388:5: lv_move_1_0= ruleEntityMoveModifier
            	    {

            	    					newCompositeNode(grammarAccess.getEntityMovesAccess().getMoveEntityMoveModifierParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_move_1_0=ruleEntityMoveModifier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityMovesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"move",
            	    						lv_move_1_0,
            	    						"smitey.Rpgindividual.EntityMoveModifier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


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
    // $ANTLR end "ruleEntityMoves"


    // $ANTLR start "entryRuleEntityMoveModifier"
    // InternalRpgindividual.g:1409:1: entryRuleEntityMoveModifier returns [EObject current=null] : iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF ;
    public final EObject entryRuleEntityMoveModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoveModifier = null;


        try {
            // InternalRpgindividual.g:1409:59: (iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF )
            // InternalRpgindividual.g:1410:2: iv_ruleEntityMoveModifier= ruleEntityMoveModifier EOF
            {
             newCompositeNode(grammarAccess.getEntityMoveModifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoveModifier=ruleEntityMoveModifier();

            state._fsp--;

             current =iv_ruleEntityMoveModifier; 
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
    // $ANTLR end "entryRuleEntityMoveModifier"


    // $ANTLR start "ruleEntityMoveModifier"
    // InternalRpgindividual.g:1416:1: ruleEntityMoveModifier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' ) ;
    public final EObject ruleEntityMoveModifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_moveModification_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1422:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' ) )
            // InternalRpgindividual.g:1423:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' )
            {
            // InternalRpgindividual.g:1423:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')' )
            // InternalRpgindividual.g:1424:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )* otherlv_3= ')'
            {
            // InternalRpgindividual.g:1424:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:1425:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:1425:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:1426:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityMoveModifierRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getEntityMoveModifierAccess().getMoveNameMoveCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityMoveModifierAccess().getLeftParenthesisKeyword_1());
            		
            // InternalRpgindividual.g:1441:3: ( (lv_moveModification_2_0= ruleEntityMoveMultiplier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:1442:4: (lv_moveModification_2_0= ruleEntityMoveMultiplier )
            	    {
            	    // InternalRpgindividual.g:1442:4: (lv_moveModification_2_0= ruleEntityMoveMultiplier )
            	    // InternalRpgindividual.g:1443:5: lv_moveModification_2_0= ruleEntityMoveMultiplier
            	    {

            	    					newCompositeNode(grammarAccess.getEntityMoveModifierAccess().getMoveModificationEntityMoveMultiplierParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_moveModification_2_0=ruleEntityMoveMultiplier();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityMoveModifierRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moveModification",
            	    						lv_moveModification_2_0,
            	    						"smitey.Rpgindividual.EntityMoveMultiplier");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityMoveModifierAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleEntityMoveModifier"


    // $ANTLR start "entryRuleEntityMoveMultiplier"
    // InternalRpgindividual.g:1468:1: entryRuleEntityMoveMultiplier returns [EObject current=null] : iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF ;
    public final EObject entryRuleEntityMoveMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoveMultiplier = null;


        try {
            // InternalRpgindividual.g:1468:61: (iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF )
            // InternalRpgindividual.g:1469:2: iv_ruleEntityMoveMultiplier= ruleEntityMoveMultiplier EOF
            {
             newCompositeNode(grammarAccess.getEntityMoveMultiplierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityMoveMultiplier=ruleEntityMoveMultiplier();

            state._fsp--;

             current =iv_ruleEntityMoveMultiplier; 
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
    // $ANTLR end "entryRuleEntityMoveMultiplier"


    // $ANTLR start "ruleEntityMoveMultiplier"
    // InternalRpgindividual.g:1475:1: ruleEntityMoveMultiplier returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) ) ;
    public final EObject ruleEntityMoveMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_multiplier_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1481:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1482:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1482:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) ) )
            // InternalRpgindividual.g:1483:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '*' ( (lv_multiplier_2_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1483:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:1484:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:1484:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:1485:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityMoveMultiplierRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_0, grammarAccess.getEntityMoveMultiplierAccess().getAttributeAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityMoveMultiplierAccess().getAsteriskKeyword_1());
            		
            // InternalRpgindividual.g:1500:3: ( (lv_multiplier_2_0= ruleSum ) )
            // InternalRpgindividual.g:1501:4: (lv_multiplier_2_0= ruleSum )
            {
            // InternalRpgindividual.g:1501:4: (lv_multiplier_2_0= ruleSum )
            // InternalRpgindividual.g:1502:5: lv_multiplier_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getEntityMoveMultiplierAccess().getMultiplierSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_multiplier_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityMoveMultiplierRule());
            					}
            					set(
            						current,
            						"multiplier",
            						lv_multiplier_2_0,
            						"smitey.Rpgindividual.Sum");
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
    // $ANTLR end "ruleEntityMoveMultiplier"


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:1523:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRpgindividual.g:1523:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRpgindividual.g:1524:2: iv_ruleTeams= ruleTeams EOF
            {
             newCompositeNode(grammarAccess.getTeamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeams=ruleTeams();

            state._fsp--;

             current =iv_ruleTeams; 
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
    // $ANTLR end "entryRuleTeams"


    // $ANTLR start "ruleTeams"
    // InternalRpgindividual.g:1530:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_team_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1536:2: ( (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) )
            // InternalRpgindividual.g:1537:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            {
            // InternalRpgindividual.g:1537:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            // InternalRpgindividual.g:1538:3: otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRpgindividual.g:1542:3: ( (lv_team_1_0= ruleTeam ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:1543:4: (lv_team_1_0= ruleTeam )
            	    {
            	    // InternalRpgindividual.g:1543:4: (lv_team_1_0= ruleTeam )
            	    // InternalRpgindividual.g:1544:5: lv_team_1_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_team_1_0=ruleTeam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"team",
            	    						lv_team_1_0,
            	    						"smitey.Rpgindividual.Team");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


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
    // $ANTLR end "ruleTeams"


    // $ANTLR start "entryRuleTeam"
    // InternalRpgindividual.g:1565:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRpgindividual.g:1565:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRpgindividual.g:1566:2: iv_ruleTeam= ruleTeam EOF
            {
             newCompositeNode(grammarAccess.getTeamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam=ruleTeam();

            state._fsp--;

             current =iv_ruleTeam; 
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
    // $ANTLR end "entryRuleTeam"


    // $ANTLR start "ruleTeam"
    // InternalRpgindividual.g:1572:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1578:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRpgindividual.g:1579:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRpgindividual.g:1579:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRpgindividual.g:1580:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRpgindividual.g:1584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1585:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1586:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:1602:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRpgindividual.g:1603:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRpgindividual.g:1603:4: (lv_members_2_0= ruleMembers )
            // InternalRpgindividual.g:1604:5: lv_members_2_0= ruleMembers
            {

            					newCompositeNode(grammarAccess.getTeamAccess().getMembersMembersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_members_2_0=ruleMembers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTeamRule());
            					}
            					set(
            						current,
            						"members",
            						lv_members_2_0,
            						"smitey.Rpgindividual.Members");
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
    // $ANTLR end "ruleTeam"


    // $ANTLR start "entryRuleMembers"
    // InternalRpgindividual.g:1625:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRpgindividual.g:1625:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRpgindividual.g:1626:2: iv_ruleMembers= ruleMembers EOF
            {
             newCompositeNode(grammarAccess.getMembersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMembers=ruleMembers();

            state._fsp--;

             current =iv_ruleMembers; 
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
    // $ANTLR end "entryRuleMembers"


    // $ANTLR start "ruleMembers"
    // InternalRpgindividual.g:1632:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1638:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRpgindividual.g:1639:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRpgindividual.g:1639:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRpgindividual.g:1640:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRpgindividual.g:1644:3: ( (otherlv_1= RULE_ID ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:1645:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:1645:4: (otherlv_1= RULE_ID )
            	    // InternalRpgindividual.g:1646:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


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
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:1661:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRpgindividual.g:1661:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRpgindividual.g:1662:2: iv_ruleORcondition= ruleORcondition EOF
            {
             newCompositeNode(grammarAccess.getORconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORcondition=ruleORcondition();

            state._fsp--;

             current =iv_ruleORcondition; 
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
    // $ANTLR end "entryRuleORcondition"


    // $ANTLR start "ruleORcondition"
    // InternalRpgindividual.g:1668:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1674:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRpgindividual.g:1675:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRpgindividual.g:1675:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRpgindividual.g:1676:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1684:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgindividual.g:1685:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1689:4: ()
            	    // InternalRpgindividual.g:1690:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1696:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRpgindividual.g:1697:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRpgindividual.g:1697:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRpgindividual.g:1698:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleANDcondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"smitey.Rpgindividual.ANDcondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleORcondition"


    // $ANTLR start "entryRuleANDcondition"
    // InternalRpgindividual.g:1720:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRpgindividual.g:1720:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRpgindividual.g:1721:2: iv_ruleANDcondition= ruleANDcondition EOF
            {
             newCompositeNode(grammarAccess.getANDconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDcondition=ruleANDcondition();

            state._fsp--;

             current =iv_ruleANDcondition; 
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
    // $ANTLR end "entryRuleANDcondition"


    // $ANTLR start "ruleANDcondition"
    // InternalRpgindividual.g:1727:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1733:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRpgindividual.g:1734:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRpgindividual.g:1734:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRpgindividual.g:1735:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1743:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRpgindividual.g:1744:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1748:4: ()
            	    // InternalRpgindividual.g:1749:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1755:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRpgindividual.g:1756:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRpgindividual.g:1756:5: (lv_right_3_0= ruleStatement )
            	    // InternalRpgindividual.g:1757:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDconditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"smitey.Rpgindividual.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRpgindividual.g:1779:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRpgindividual.g:1779:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRpgindividual.g:1780:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalRpgindividual.g:1786:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1792:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalRpgindividual.g:1793:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalRpgindividual.g:1793:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||(LA24_0>=48 && LA24_0<=49)) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRpgindividual.g:1794:3: this_NumberComparing_0= ruleNumberComparing
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getNumberComparingParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberComparing_0=ruleNumberComparing();

                    state._fsp--;


                    			current = this_NumberComparing_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1803:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRpgindividual.g:1803:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRpgindividual.g:1804:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_39);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStatementAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleNumberComparing"
    // InternalRpgindividual.g:1825:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRpgindividual.g:1825:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRpgindividual.g:1826:2: iv_ruleNumberComparing= ruleNumberComparing EOF
            {
             newCompositeNode(grammarAccess.getNumberComparingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberComparing=ruleNumberComparing();

            state._fsp--;

             current =iv_ruleNumberComparing; 
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
    // $ANTLR end "entryRuleNumberComparing"


    // $ANTLR start "ruleNumberComparing"
    // InternalRpgindividual.g:1832:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1838:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1839:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1839:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRpgindividual.g:1840:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1840:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRpgindividual.g:1841:4: (lv_left_0_0= ruleSum )
            {
            // InternalRpgindividual.g:1841:4: (lv_left_0_0= ruleSum )
            // InternalRpgindividual.g:1842:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_left_0_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"smitey.Rpgindividual.Sum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1859:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRpgindividual.g:1860:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRpgindividual.g:1860:4: (lv_comp_1_0= ruleComparator )
            // InternalRpgindividual.g:1861:5: lv_comp_1_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getCompComparatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_comp_1_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"comp",
            						lv_comp_1_0,
            						"smitey.Rpgindividual.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:1878:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRpgindividual.g:1879:4: (lv_right_2_0= ruleSum )
            {
            // InternalRpgindividual.g:1879:4: (lv_right_2_0= ruleSum )
            // InternalRpgindividual.g:1880:5: lv_right_2_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getRightSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberComparingRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"smitey.Rpgindividual.Sum");
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
    // $ANTLR end "ruleNumberComparing"


    // $ANTLR start "entryRuleComparator"
    // InternalRpgindividual.g:1901:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRpgindividual.g:1901:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRpgindividual.g:1902:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator; 
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
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalRpgindividual.g:1908:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
    public final EObject ruleComparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1914:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRpgindividual.g:1915:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRpgindividual.g:1915:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt25=1;
                }
                break;
            case 39:
                {
                alt25=2;
                }
                break;
            case 40:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            case 42:
                {
                alt25=5;
                }
                break;
            case 43:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalRpgindividual.g:1916:3: ( () otherlv_1= '<' )
                    {
                    // InternalRpgindividual.g:1916:3: ( () otherlv_1= '<' )
                    // InternalRpgindividual.g:1917:4: () otherlv_1= '<'
                    {
                    // InternalRpgindividual.g:1917:4: ()
                    // InternalRpgindividual.g:1918:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1930:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRpgindividual.g:1930:3: ( () otherlv_3= '<=' )
                    // InternalRpgindividual.g:1931:4: () otherlv_3= '<='
                    {
                    // InternalRpgindividual.g:1931:4: ()
                    // InternalRpgindividual.g:1932:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1944:3: ( () otherlv_5= '==' )
                    {
                    // InternalRpgindividual.g:1944:3: ( () otherlv_5= '==' )
                    // InternalRpgindividual.g:1945:4: () otherlv_5= '=='
                    {
                    // InternalRpgindividual.g:1945:4: ()
                    // InternalRpgindividual.g:1946:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1958:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRpgindividual.g:1958:3: ( () otherlv_7= '>=' )
                    // InternalRpgindividual.g:1959:4: () otherlv_7= '>='
                    {
                    // InternalRpgindividual.g:1959:4: ()
                    // InternalRpgindividual.g:1960:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1972:3: ( () otherlv_9= '>' )
                    {
                    // InternalRpgindividual.g:1972:3: ( () otherlv_9= '>' )
                    // InternalRpgindividual.g:1973:4: () otherlv_9= '>'
                    {
                    // InternalRpgindividual.g:1973:4: ()
                    // InternalRpgindividual.g:1974:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1986:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRpgindividual.g:1986:3: ( () otherlv_11= '!=' )
                    // InternalRpgindividual.g:1987:4: () otherlv_11= '!='
                    {
                    // InternalRpgindividual.g:1987:4: ()
                    // InternalRpgindividual.g:1988:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getComparatorAccess().getExclamationMarkEqualsSignKeyword_5_1());
                    			

                    }


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
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleSum"
    // InternalRpgindividual.g:2003:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRpgindividual.g:2003:44: (iv_ruleSum= ruleSum EOF )
            // InternalRpgindividual.g:2004:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalRpgindividual.g:2010:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2016:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRpgindividual.g:2017:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRpgindividual.g:2017:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRpgindividual.g:2018:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_41);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:2026:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=44 && LA27_0<=45)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRpgindividual.g:2027:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRpgindividual.g:2027:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==44) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==45) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalRpgindividual.g:2028:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRpgindividual.g:2028:5: (otherlv_1= '+' () )
            	            // InternalRpgindividual.g:2029:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,44,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:2033:6: ()
            	            // InternalRpgindividual.g:2034:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:2042:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRpgindividual.g:2042:5: (otherlv_3= '-' () )
            	            // InternalRpgindividual.g:2043:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,45,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:2047:6: ()
            	            // InternalRpgindividual.g:2048:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:2056:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRpgindividual.g:2057:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRpgindividual.g:2057:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRpgindividual.g:2058:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_right_5_0=ruleMultiply();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"smitey.Rpgindividual.Multiply");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMultiply"
    // InternalRpgindividual.g:2080:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRpgindividual.g:2080:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRpgindividual.g:2081:2: iv_ruleMultiply= ruleMultiply EOF
            {
             newCompositeNode(grammarAccess.getMultiplyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiply=ruleMultiply();

            state._fsp--;

             current =iv_ruleMultiply; 
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
    // $ANTLR end "entryRuleMultiply"


    // $ANTLR start "ruleMultiply"
    // InternalRpgindividual.g:2087:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2093:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRpgindividual.g:2094:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRpgindividual.g:2094:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRpgindividual.g:2095:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_42);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:2103:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33||LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalRpgindividual.g:2104:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRpgindividual.g:2104:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==33) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==46) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalRpgindividual.g:2105:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRpgindividual.g:2105:5: (otherlv_1= '*' () )
            	            // InternalRpgindividual.g:2106:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,33,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:2110:6: ()
            	            // InternalRpgindividual.g:2111:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:2119:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRpgindividual.g:2119:5: (otherlv_3= '/' () )
            	            // InternalRpgindividual.g:2120:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:2124:6: ()
            	            // InternalRpgindividual.g:2125:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:2133:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRpgindividual.g:2134:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRpgindividual.g:2134:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRpgindividual.g:2135:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_right_5_0=ruleAtomicNumber();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"smitey.Rpgindividual.AtomicNumber");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiply"


    // $ANTLR start "entryRuleAtomicNumber"
    // InternalRpgindividual.g:2157:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRpgindividual.g:2157:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRpgindividual.g:2158:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
            {
             newCompositeNode(grammarAccess.getAtomicNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicNumber=ruleAtomicNumber();

            state._fsp--;

             current =iv_ruleAtomicNumber; 
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
    // $ANTLR end "entryRuleAtomicNumber"


    // $ANTLR start "ruleAtomicNumber"
    // InternalRpgindividual.g:2164:1: ruleAtomicNumber returns [EObject current=null] : (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_ActualNumbers_0 = null;

        EObject this_NameAttribute_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2170:2: ( (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) )
            // InternalRpgindividual.g:2171:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            {
            // InternalRpgindividual.g:2171:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=48 && LA30_0<=49)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRpgindividual.g:2172:3: this_ActualNumbers_0= ruleActualNumbers
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getActualNumbersParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActualNumbers_0=ruleActualNumbers();

                    state._fsp--;


                    			current = this_ActualNumbers_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2181:3: this_NameAttribute_1= ruleNameAttribute
                    {

                    			newCompositeNode(grammarAccess.getAtomicNumberAccess().getNameAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameAttribute_1=ruleNameAttribute();

                    state._fsp--;


                    			current = this_NameAttribute_1;
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
    // $ANTLR end "ruleAtomicNumber"


    // $ANTLR start "entryRuleActualNumbers"
    // InternalRpgindividual.g:2193:1: entryRuleActualNumbers returns [EObject current=null] : iv_ruleActualNumbers= ruleActualNumbers EOF ;
    public final EObject entryRuleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualNumbers = null;


        try {
            // InternalRpgindividual.g:2193:54: (iv_ruleActualNumbers= ruleActualNumbers EOF )
            // InternalRpgindividual.g:2194:2: iv_ruleActualNumbers= ruleActualNumbers EOF
            {
             newCompositeNode(grammarAccess.getActualNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActualNumbers=ruleActualNumbers();

            state._fsp--;

             current =iv_ruleActualNumbers; 
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
    // $ANTLR end "entryRuleActualNumbers"


    // $ANTLR start "ruleActualNumbers"
    // InternalRpgindividual.g:2200:1: ruleActualNumbers returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) ;
    public final EObject ruleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2206:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) )
            // InternalRpgindividual.g:2207:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            {
            // InternalRpgindividual.g:2207:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==EOF||LA31_1==RULE_ID||(LA31_1>=12 && LA31_1<=16)||LA31_1==18||(LA31_1>=21 && LA31_1<=23)||(LA31_1>=26 && LA31_1<=28)||(LA31_1>=32 && LA31_1<=34)||(LA31_1>=37 && LA31_1<=46)) ) {
                    alt31=2;
                }
                else if ( (LA31_1==47) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRpgindividual.g:2208:3: this_FloatNum_0= ruleFloatNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getFloatNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatNum_0=ruleFloatNum();

                    state._fsp--;


                    			current = this_FloatNum_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2217:3: this_IntNum_1= ruleIntNum
                    {

                    			newCompositeNode(grammarAccess.getActualNumbersAccess().getIntNumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntNum_1=ruleIntNum();

                    state._fsp--;


                    			current = this_IntNum_1;
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
    // $ANTLR end "ruleActualNumbers"


    // $ANTLR start "entryRuleNameAttribute"
    // InternalRpgindividual.g:2229:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRpgindividual.g:2229:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRpgindividual.g:2230:2: iv_ruleNameAttribute= ruleNameAttribute EOF
            {
             newCompositeNode(grammarAccess.getNameAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAttribute=ruleNameAttribute();

            state._fsp--;

             current =iv_ruleNameAttribute; 
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
    // $ANTLR end "entryRuleNameAttribute"


    // $ANTLR start "ruleNameAttribute"
    // InternalRpgindividual.g:2236:1: ruleNameAttribute returns [EObject current=null] : ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_target_0_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2242:2: ( ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:2243:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:2243:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:2244:3: ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalRpgindividual.g:2244:3: ( (lv_target_0_0= ruleTarget ) )
            // InternalRpgindividual.g:2245:4: (lv_target_0_0= ruleTarget )
            {
            // InternalRpgindividual.g:2245:4: (lv_target_0_0= ruleTarget )
            // InternalRpgindividual.g:2246:5: lv_target_0_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getNameAttributeAccess().getTargetTargetParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_target_0_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameAttributeRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"smitey.Rpgindividual.Target");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRpgindividual.g:2263:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:2264:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:2264:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:2265:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNameAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getNameAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

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
    // $ANTLR end "ruleNameAttribute"


    // $ANTLR start "entryRuleIntNum"
    // InternalRpgindividual.g:2280:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRpgindividual.g:2280:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRpgindividual.g:2281:2: iv_ruleIntNum= ruleIntNum EOF
            {
             newCompositeNode(grammarAccess.getIntNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntNum=ruleIntNum();

            state._fsp--;

             current =iv_ruleIntNum; 
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
    // $ANTLR end "entryRuleIntNum"


    // $ANTLR start "ruleIntNum"
    // InternalRpgindividual.g:2287:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2293:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2294:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2294:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2295:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2295:3: (lv_value_0_0= RULE_INT )
            // InternalRpgindividual.g:2296:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntNumAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntNum"


    // $ANTLR start "entryRuleFloatNum"
    // InternalRpgindividual.g:2315:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRpgindividual.g:2315:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRpgindividual.g:2316:2: iv_ruleFloatNum= ruleFloatNum EOF
            {
             newCompositeNode(grammarAccess.getFloatNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatNum=ruleFloatNum();

            state._fsp--;

             current =iv_ruleFloatNum; 
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
    // $ANTLR end "entryRuleFloatNum"


    // $ANTLR start "ruleFloatNum"
    // InternalRpgindividual.g:2322:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2328:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRpgindividual.g:2329:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRpgindividual.g:2329:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2330:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2330:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2331:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2331:4: (lv_i_0_0= RULE_INT )
            // InternalRpgindividual.g:2332:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_43); 

            					newLeafNode(lv_i_0_0, grammarAccess.getFloatNumAccess().getIINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"i",
            						lv_i_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRpgindividual.g:2352:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRpgindividual.g:2353:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRpgindividual.g:2353:4: (lv_decimal_2_0= RULE_INT )
            // InternalRpgindividual.g:2354:5: lv_decimal_2_0= RULE_INT
            {
            lv_decimal_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_decimal_2_0, grammarAccess.getFloatNumAccess().getDecimalINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFloatNumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"decimal",
            						lv_decimal_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleFloatNum"


    // $ANTLR start "entryRuleTarget"
    // InternalRpgindividual.g:2374:1: entryRuleTarget returns [String current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final String entryRuleTarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTarget = null;


        try {
            // InternalRpgindividual.g:2374:46: (iv_ruleTarget= ruleTarget EOF )
            // InternalRpgindividual.g:2375:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget.getText(); 
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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalRpgindividual.g:2381:1: ruleTarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'User' | kw= 'Enemy' ) ;
    public final AntlrDatatypeRuleToken ruleTarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2387:2: ( (kw= 'User' | kw= 'Enemy' ) )
            // InternalRpgindividual.g:2388:2: (kw= 'User' | kw= 'Enemy' )
            {
            // InternalRpgindividual.g:2388:2: (kw= 'User' | kw= 'Enemy' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            else if ( (LA32_0==49) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRpgindividual.g:2389:3: kw= 'User'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTargetAccess().getUserKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2395:3: kw= 'Enemy'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTargetAccess().getEnemyKeyword_1());
                    		

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleLegalType"
    // InternalRpgindividual.g:2404:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRpgindividual.g:2404:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRpgindividual.g:2405:2: iv_ruleLegalType= ruleLegalType EOF
            {
             newCompositeNode(grammarAccess.getLegalTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLegalType=ruleLegalType();

            state._fsp--;

             current =iv_ruleLegalType.getText(); 
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
    // $ANTLR end "entryRuleLegalType"


    // $ANTLR start "ruleLegalType"
    // InternalRpgindividual.g:2411:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2417:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRpgindividual.g:2418:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRpgindividual.g:2418:2: (kw= 'Float' | kw= 'Integer' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            else if ( (LA33_0==51) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRpgindividual.g:2419:3: kw= 'Float'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2425:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getIntegerKeyword_1());
                    		

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
    // $ANTLR end "ruleLegalType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000418455002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000F000082000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000F000002000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000F8000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000020L});

}