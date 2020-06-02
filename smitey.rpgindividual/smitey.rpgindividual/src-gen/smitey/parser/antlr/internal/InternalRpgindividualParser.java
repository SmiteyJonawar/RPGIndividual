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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'effects'", "'effect'", "'move'", "'attributes'", "'attribute'", "'location'", "'opponents'", "'relations'", "'type'", "','", "'<'", "'moves'", "'is'", "'if'", "'then'", "'entities'", "'death'", "'entity'", "'teams'", "'team'", "'members'", "'require'", "'OR'", "'AND'", "'('", "')'", "'<='", "'=='", "'>='", "'>'", "'!='", "'+'", "'-'", "'*'", "'/'", "'.'", "'User'", "'Enemy'", "'Float'", "'Integer'"
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

                if ( (LA1_0==12||LA1_0==15||LA1_0==17||LA1_0==19||LA1_0==23||(LA1_0>=27 && LA1_0<=28)||LA1_0==30) ) {
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
            case 17:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            case 15:
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
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

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
    // InternalRpgindividual.g:294:1: ruleMoveE returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) ;
    public final EObject ruleMoveE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:300:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) ) )
            // InternalRpgindividual.g:301:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            {
            // InternalRpgindividual.g:301:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) ) )
            // InternalRpgindividual.g:302:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_rule_2_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveEAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:306:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:307:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:307:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:308:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMoveEAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveERule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRpgindividual.g:324:3: ( (lv_rule_2_0= ruleRule ) )
            // InternalRpgindividual.g:325:4: (lv_rule_2_0= ruleRule )
            {
            // InternalRpgindividual.g:325:4: (lv_rule_2_0= ruleRule )
            // InternalRpgindividual.g:326:5: lv_rule_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getMoveEAccess().getRuleRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rule_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveERule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_2_0,
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
    // InternalRpgindividual.g:347:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // InternalRpgindividual.g:347:51: (iv_ruleAttributes= ruleAttributes EOF )
            // InternalRpgindividual.g:348:2: iv_ruleAttributes= ruleAttributes EOF
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
    // InternalRpgindividual.g:354:1: ruleAttributes returns [EObject current=null] : (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:360:2: ( (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ ) )
            // InternalRpgindividual.g:361:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            {
            // InternalRpgindividual.g:361:2: (otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+ )
            // InternalRpgindividual.g:362:3: otherlv_0= 'attributes' ( (lv_attribute_1_0= ruleAttribute ) )+
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributesAccess().getAttributesKeyword_0());
            		
            // InternalRpgindividual.g:366:3: ( (lv_attribute_1_0= ruleAttribute ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRpgindividual.g:367:4: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // InternalRpgindividual.g:367:4: (lv_attribute_1_0= ruleAttribute )
            	    // InternalRpgindividual.g:368:5: lv_attribute_1_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
    // InternalRpgindividual.g:389:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalRpgindividual.g:389:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalRpgindividual.g:390:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalRpgindividual.g:396:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_aVal_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:402:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) ) )
            // InternalRpgindividual.g:403:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            {
            // InternalRpgindividual.g:403:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) ) )
            // InternalRpgindividual.g:404:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) ( (lv_aVal_2_0= ruleAttributeValues ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:409:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:410:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalRpgindividual.g:426:3: ( (lv_aVal_2_0= ruleAttributeValues ) )
            // InternalRpgindividual.g:427:4: (lv_aVal_2_0= ruleAttributeValues )
            {
            // InternalRpgindividual.g:427:4: (lv_aVal_2_0= ruleAttributeValues )
            // InternalRpgindividual.g:428:5: lv_aVal_2_0= ruleAttributeValues
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
    // InternalRpgindividual.g:449:1: entryRuleLocations returns [EObject current=null] : iv_ruleLocations= ruleLocations EOF ;
    public final EObject entryRuleLocations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocations = null;


        try {
            // InternalRpgindividual.g:449:50: (iv_ruleLocations= ruleLocations EOF )
            // InternalRpgindividual.g:450:2: iv_ruleLocations= ruleLocations EOF
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
    // InternalRpgindividual.g:456:1: ruleLocations returns [EObject current=null] : (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) ;
    public final EObject ruleLocations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loc_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:462:2: ( (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ ) )
            // InternalRpgindividual.g:463:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            {
            // InternalRpgindividual.g:463:2: (otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+ )
            // InternalRpgindividual.g:464:3: otherlv_0= 'location' ( (lv_loc_1_0= ruleLoc ) )+
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationsAccess().getLocationKeyword_0());
            		
            // InternalRpgindividual.g:468:3: ( (lv_loc_1_0= ruleLoc ) )+
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
            	    // InternalRpgindividual.g:469:4: (lv_loc_1_0= ruleLoc )
            	    {
            	    // InternalRpgindividual.g:469:4: (lv_loc_1_0= ruleLoc )
            	    // InternalRpgindividual.g:470:5: lv_loc_1_0= ruleLoc
            	    {

            	    					newCompositeNode(grammarAccess.getLocationsAccess().getLocLocParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
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
    // InternalRpgindividual.g:491:1: entryRuleLoc returns [EObject current=null] : iv_ruleLoc= ruleLoc EOF ;
    public final EObject entryRuleLoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoc = null;


        try {
            // InternalRpgindividual.g:491:44: (iv_ruleLoc= ruleLoc EOF )
            // InternalRpgindividual.g:492:2: iv_ruleLoc= ruleLoc EOF
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
    // InternalRpgindividual.g:498:1: ruleLoc returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLoc() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:504:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRpgindividual.g:505:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:505:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) ) )
            // InternalRpgindividual.g:506:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'opponents' ( (otherlv_2= RULE_ID ) )
            {
            // InternalRpgindividual.g:506:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRpgindividual.g:507:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRpgindividual.g:507:4: (lv_name_0_0= RULE_ID )
            // InternalRpgindividual.g:508:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocAccess().getOpponentsKeyword_1());
            		
            // InternalRpgindividual.g:528:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgindividual.g:529:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgindividual.g:529:4: (otherlv_2= RULE_ID )
            // InternalRpgindividual.g:530:5: otherlv_2= RULE_ID
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
    // InternalRpgindividual.g:545:1: entryRuleRelations returns [EObject current=null] : iv_ruleRelations= ruleRelations EOF ;
    public final EObject entryRuleRelations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelations = null;


        try {
            // InternalRpgindividual.g:545:50: (iv_ruleRelations= ruleRelations EOF )
            // InternalRpgindividual.g:546:2: iv_ruleRelations= ruleRelations EOF
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
    // InternalRpgindividual.g:552:1: ruleRelations returns [EObject current=null] : (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) ;
    public final EObject ruleRelations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:558:2: ( (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ ) )
            // InternalRpgindividual.g:559:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            {
            // InternalRpgindividual.g:559:2: (otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+ )
            // InternalRpgindividual.g:560:3: otherlv_0= 'relations' ( (lv_type_1_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationsAccess().getRelationsKeyword_0());
            		
            // InternalRpgindividual.g:564:3: ( (lv_type_1_0= ruleType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRpgindividual.g:565:4: (lv_type_1_0= ruleType )
            	    {
            	    // InternalRpgindividual.g:565:4: (lv_type_1_0= ruleType )
            	    // InternalRpgindividual.g:566:5: lv_type_1_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getRelationsAccess().getTypeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
    // InternalRpgindividual.g:587:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalRpgindividual.g:587:45: (iv_ruleType= ruleType EOF )
            // InternalRpgindividual.g:588:2: iv_ruleType= ruleType EOF
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
    // InternalRpgindividual.g:594:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_tExpression_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:600:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? ) )
            // InternalRpgindividual.g:601:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            {
            // InternalRpgindividual.g:601:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )? )
            // InternalRpgindividual.g:602:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:606:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:607:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:607:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:608:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            // InternalRpgindividual.g:624:3: ( (lv_tExpression_2_0= ruleTypeExpression ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRpgindividual.g:625:4: (lv_tExpression_2_0= ruleTypeExpression )
                    {
                    // InternalRpgindividual.g:625:4: (lv_tExpression_2_0= ruleTypeExpression )
                    // InternalRpgindividual.g:626:5: lv_tExpression_2_0= ruleTypeExpression
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
    // InternalRpgindividual.g:647:1: entryRuleTypeExpression returns [EObject current=null] : iv_ruleTypeExpression= ruleTypeExpression EOF ;
    public final EObject entryRuleTypeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpression = null;


        try {
            // InternalRpgindividual.g:647:55: (iv_ruleTypeExpression= ruleTypeExpression EOF )
            // InternalRpgindividual.g:648:2: iv_ruleTypeExpression= ruleTypeExpression EOF
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
    // InternalRpgindividual.g:654:1: ruleTypeExpression returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) ;
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
            // InternalRpgindividual.g:660:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* ) )
            // InternalRpgindividual.g:661:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            {
            // InternalRpgindividual.g:661:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )
            // InternalRpgindividual.g:662:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* otherlv_3= '<' ( (otherlv_4= RULE_ID ) ) otherlv_5= '<' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            {
            // InternalRpgindividual.g:662:3: ( (otherlv_0= RULE_ID ) )
            // InternalRpgindividual.g:663:4: (otherlv_0= RULE_ID )
            {
            // InternalRpgindividual.g:663:4: (otherlv_0= RULE_ID )
            // InternalRpgindividual.g:664:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getTypeExpressionAccess().getStrongTypeCrossReference_0_0());
            				

            }


            }

            // InternalRpgindividual.g:675:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRpgindividual.g:676:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTypeExpressionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:680:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalRpgindividual.g:681:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:681:5: (otherlv_2= RULE_ID )
            	    // InternalRpgindividual.g:682:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_2, grammarAccess.getTypeExpressionAccess().getStrong2TypeCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_2());
            		
            // InternalRpgindividual.g:698:3: ( (otherlv_4= RULE_ID ) )
            // InternalRpgindividual.g:699:4: (otherlv_4= RULE_ID )
            {
            // InternalRpgindividual.g:699:4: (otherlv_4= RULE_ID )
            // InternalRpgindividual.g:700:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_4, grammarAccess.getTypeExpressionAccess().getCurrentTTypeCrossReference_3_0());
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeExpressionAccess().getLessThanSignKeyword_4());
            		
            // InternalRpgindividual.g:715:3: ( (otherlv_6= RULE_ID ) )
            // InternalRpgindividual.g:716:4: (otherlv_6= RULE_ID )
            {
            // InternalRpgindividual.g:716:4: (otherlv_6= RULE_ID )
            // InternalRpgindividual.g:717:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeExpressionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_6, grammarAccess.getTypeExpressionAccess().getWeakTypeCrossReference_5_0());
            				

            }


            }

            // InternalRpgindividual.g:728:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRpgindividual.g:729:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getTypeExpressionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalRpgindividual.g:733:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalRpgindividual.g:734:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:734:5: (otherlv_8= RULE_ID )
            	    // InternalRpgindividual.g:735:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTypeExpressionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

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
    // InternalRpgindividual.g:751:1: entryRuleMoves returns [EObject current=null] : iv_ruleMoves= ruleMoves EOF ;
    public final EObject entryRuleMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoves = null;


        try {
            // InternalRpgindividual.g:751:46: (iv_ruleMoves= ruleMoves EOF )
            // InternalRpgindividual.g:752:2: iv_ruleMoves= ruleMoves EOF
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
    // InternalRpgindividual.g:758:1: ruleMoves returns [EObject current=null] : (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) ;
    public final EObject ruleMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_move_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:764:2: ( (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ ) )
            // InternalRpgindividual.g:765:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            {
            // InternalRpgindividual.g:765:2: (otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+ )
            // InternalRpgindividual.g:766:3: otherlv_0= 'moves' ( (lv_move_1_0= ruleMove ) )+
            {
            otherlv_0=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMovesAccess().getMovesKeyword_0());
            		
            // InternalRpgindividual.g:770:3: ( (lv_move_1_0= ruleMove ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRpgindividual.g:771:4: (lv_move_1_0= ruleMove )
            	    {
            	    // InternalRpgindividual.g:771:4: (lv_move_1_0= ruleMove )
            	    // InternalRpgindividual.g:772:5: lv_move_1_0= ruleMove
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
    // InternalRpgindividual.g:793:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalRpgindividual.g:793:45: (iv_ruleMove= ruleMove EOF )
            // InternalRpgindividual.g:794:2: iv_ruleMove= ruleMove EOF
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
    // InternalRpgindividual.g:800:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_mEffect_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:806:2: ( (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ ) )
            // InternalRpgindividual.g:807:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            {
            // InternalRpgindividual.g:807:2: (otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+ )
            // InternalRpgindividual.g:808:3: otherlv_0= 'move' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_mEffect_4_0= ruleMEffect ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:812:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:813:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:813:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:814:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalRpgindividual.g:830:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:831:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:831:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:832:5: lv_eType_2_0= ruleEType
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

            // InternalRpgindividual.g:849:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRpgindividual.g:850:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:850:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:851:5: lv_att_3_0= ruleAltAttribute
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

            // InternalRpgindividual.g:868:3: ( (lv_mEffect_4_0= ruleMEffect ) )+
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
            	    // InternalRpgindividual.g:869:4: (lv_mEffect_4_0= ruleMEffect )
            	    {
            	    // InternalRpgindividual.g:869:4: (lv_mEffect_4_0= ruleMEffect )
            	    // InternalRpgindividual.g:870:5: lv_mEffect_4_0= ruleMEffect
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
    // InternalRpgindividual.g:891:1: entryRuleMEffect returns [EObject current=null] : iv_ruleMEffect= ruleMEffect EOF ;
    public final EObject entryRuleMEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMEffect = null;


        try {
            // InternalRpgindividual.g:891:48: (iv_ruleMEffect= ruleMEffect EOF )
            // InternalRpgindividual.g:892:2: iv_ruleMEffect= ruleMEffect EOF
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
    // InternalRpgindividual.g:898:1: ruleMEffect returns [EObject current=null] : (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleMEffect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:904:2: ( (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalRpgindividual.g:905:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:905:2: (otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) ) )
            // InternalRpgindividual.g:906:3: otherlv_0= 'effect' otherlv_1= 'move' ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMEffectAccess().getEffectKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMEffectAccess().getMoveKeyword_1());
            		
            // InternalRpgindividual.g:914:3: ( (otherlv_2= RULE_ID ) )
            // InternalRpgindividual.g:915:4: (otherlv_2= RULE_ID )
            {
            // InternalRpgindividual.g:915:4: (otherlv_2= RULE_ID )
            // InternalRpgindividual.g:916:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMEffectRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getMEffectAccess().getMoveENameMoveECrossReference_2_0());
            				

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
    // InternalRpgindividual.g:931:1: entryRuleEType returns [EObject current=null] : iv_ruleEType= ruleEType EOF ;
    public final EObject entryRuleEType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEType = null;


        try {
            // InternalRpgindividual.g:931:46: (iv_ruleEType= ruleEType EOF )
            // InternalRpgindividual.g:932:2: iv_ruleEType= ruleEType EOF
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
    // InternalRpgindividual.g:938:1: ruleEType returns [EObject current=null] : (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:944:2: ( (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:945:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:945:2: (otherlv_0= 'type' ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:946:3: otherlv_0= 'type' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETypeAccess().getTypeKeyword_0());
            		
            // InternalRpgindividual.g:950:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:951:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:951:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:952:5: otherlv_1= RULE_ID
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
    // InternalRpgindividual.g:967:1: entryRuleAttributeValues returns [EObject current=null] : iv_ruleAttributeValues= ruleAttributeValues EOF ;
    public final EObject entryRuleAttributeValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValues = null;


        try {
            // InternalRpgindividual.g:967:56: (iv_ruleAttributeValues= ruleAttributeValues EOF )
            // InternalRpgindividual.g:968:2: iv_ruleAttributeValues= ruleAttributeValues EOF
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
    // InternalRpgindividual.g:974:1: ruleAttributeValues returns [EObject current=null] : (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) ;
    public final EObject ruleAttributeValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_lTypes_1_0 = null;

        EObject lv_an_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:980:2: ( (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) ) )
            // InternalRpgindividual.g:981:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            {
            // InternalRpgindividual.g:981:2: (otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) ) )
            // InternalRpgindividual.g:982:3: otherlv_0= 'is' ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeValuesAccess().getIsKeyword_0());
            		
            // InternalRpgindividual.g:986:3: ( ( (lv_lTypes_1_0= ruleLegalType ) ) | ( (lv_an_2_0= ruleActualNumbers ) ) )
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
                    // InternalRpgindividual.g:987:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    {
                    // InternalRpgindividual.g:987:4: ( (lv_lTypes_1_0= ruleLegalType ) )
                    // InternalRpgindividual.g:988:5: (lv_lTypes_1_0= ruleLegalType )
                    {
                    // InternalRpgindividual.g:988:5: (lv_lTypes_1_0= ruleLegalType )
                    // InternalRpgindividual.g:989:6: lv_lTypes_1_0= ruleLegalType
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
                    // InternalRpgindividual.g:1007:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    {
                    // InternalRpgindividual.g:1007:4: ( (lv_an_2_0= ruleActualNumbers ) )
                    // InternalRpgindividual.g:1008:5: (lv_an_2_0= ruleActualNumbers )
                    {
                    // InternalRpgindividual.g:1008:5: (lv_an_2_0= ruleActualNumbers )
                    // InternalRpgindividual.g:1009:6: lv_an_2_0= ruleActualNumbers
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
    // InternalRpgindividual.g:1031:1: entryRuleAltAttribute returns [EObject current=null] : iv_ruleAltAttribute= ruleAltAttribute EOF ;
    public final EObject entryRuleAltAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAltAttribute = null;


        try {
            // InternalRpgindividual.g:1031:53: (iv_ruleAltAttribute= ruleAltAttribute EOF )
            // InternalRpgindividual.g:1032:2: iv_ruleAltAttribute= ruleAltAttribute EOF
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
    // InternalRpgindividual.g:1038:1: ruleAltAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) ;
    public final EObject ruleAltAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_av_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1044:2: ( (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? ) )
            // InternalRpgindividual.g:1045:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            {
            // InternalRpgindividual.g:1045:2: (otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )? )
            // InternalRpgindividual.g:1046:3: otherlv_0= 'attribute' ( (otherlv_1= RULE_ID ) ) ( (lv_av_2_0= ruleAttributeValues ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAltAttributeAccess().getAttributeKeyword_0());
            		
            // InternalRpgindividual.g:1050:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:1051:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:1051:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:1052:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAltAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getAltAttributeAccess().getAttributeAttributeCrossReference_1_0());
            				

            }


            }

            // InternalRpgindividual.g:1063:3: ( (lv_av_2_0= ruleAttributeValues ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRpgindividual.g:1064:4: (lv_av_2_0= ruleAttributeValues )
                    {
                    // InternalRpgindividual.g:1064:4: (lv_av_2_0= ruleAttributeValues )
                    // InternalRpgindividual.g:1065:5: lv_av_2_0= ruleAttributeValues
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
    // InternalRpgindividual.g:1086:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRpgindividual.g:1086:45: (iv_ruleRule= ruleRule EOF )
            // InternalRpgindividual.g:1087:2: iv_ruleRule= ruleRule EOF
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
    // InternalRpgindividual.g:1093:1: ruleRule returns [EObject current=null] : ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) ) ;
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
            // InternalRpgindividual.g:1099:2: ( ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1100:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1100:2: ( (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) ) )
            // InternalRpgindividual.g:1101:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )? ( (lv_targetThen_3_0= ruleTarget ) ) ( (otherlv_4= RULE_ID ) ) otherlv_5= 'is' ( (lv_sum_6_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1101:3: (otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRpgindividual.g:1102:4: otherlv_0= 'if' ( (lv_or_1_0= ruleORcondition ) ) otherlv_2= 'then'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getIfKeyword_0_0());
                    			
                    // InternalRpgindividual.g:1106:4: ( (lv_or_1_0= ruleORcondition ) )
                    // InternalRpgindividual.g:1107:5: (lv_or_1_0= ruleORcondition )
                    {
                    // InternalRpgindividual.g:1107:5: (lv_or_1_0= ruleORcondition )
                    // InternalRpgindividual.g:1108:6: lv_or_1_0= ruleORcondition
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

                    otherlv_2=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getThenKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRpgindividual.g:1130:3: ( (lv_targetThen_3_0= ruleTarget ) )
            // InternalRpgindividual.g:1131:4: (lv_targetThen_3_0= ruleTarget )
            {
            // InternalRpgindividual.g:1131:4: (lv_targetThen_3_0= ruleTarget )
            // InternalRpgindividual.g:1132:5: lv_targetThen_3_0= ruleTarget
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

            // InternalRpgindividual.g:1149:3: ( (otherlv_4= RULE_ID ) )
            // InternalRpgindividual.g:1150:4: (otherlv_4= RULE_ID )
            {
            // InternalRpgindividual.g:1150:4: (otherlv_4= RULE_ID )
            // InternalRpgindividual.g:1151:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getTargetAttAttributeCrossReference_2_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getIsKeyword_3());
            		
            // InternalRpgindividual.g:1166:3: ( (lv_sum_6_0= ruleSum ) )
            // InternalRpgindividual.g:1167:4: (lv_sum_6_0= ruleSum )
            {
            // InternalRpgindividual.g:1167:4: (lv_sum_6_0= ruleSum )
            // InternalRpgindividual.g:1168:5: lv_sum_6_0= ruleSum
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
    // InternalRpgindividual.g:1189:1: entryRuleEntities returns [EObject current=null] : iv_ruleEntities= ruleEntities EOF ;
    public final EObject entryRuleEntities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntities = null;


        try {
            // InternalRpgindividual.g:1189:49: (iv_ruleEntities= ruleEntities EOF )
            // InternalRpgindividual.g:1190:2: iv_ruleEntities= ruleEntities EOF
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
    // InternalRpgindividual.g:1196:1: ruleEntities returns [EObject current=null] : (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) ;
    public final EObject ruleEntities() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_entity_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1202:2: ( (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ ) )
            // InternalRpgindividual.g:1203:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            {
            // InternalRpgindividual.g:1203:2: (otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+ )
            // InternalRpgindividual.g:1204:3: otherlv_0= 'entities' ( (lv_entity_1_0= ruleEntity ) )+
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitiesAccess().getEntitiesKeyword_0());
            		
            // InternalRpgindividual.g:1208:3: ( (lv_entity_1_0= ruleEntity ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRpgindividual.g:1209:4: (lv_entity_1_0= ruleEntity )
            	    {
            	    // InternalRpgindividual.g:1209:4: (lv_entity_1_0= ruleEntity )
            	    // InternalRpgindividual.g:1210:5: lv_entity_1_0= ruleEntity
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
    // InternalRpgindividual.g:1231:1: entryRuleDeath returns [EObject current=null] : iv_ruleDeath= ruleDeath EOF ;
    public final EObject entryRuleDeath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeath = null;


        try {
            // InternalRpgindividual.g:1231:46: (iv_ruleDeath= ruleDeath EOF )
            // InternalRpgindividual.g:1232:2: iv_ruleDeath= ruleDeath EOF
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
    // InternalRpgindividual.g:1238:1: ruleDeath returns [EObject current=null] : (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) ;
    public final EObject ruleDeath() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_req_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1244:2: ( (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) ) )
            // InternalRpgindividual.g:1245:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            {
            // InternalRpgindividual.g:1245:2: (otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) ) )
            // InternalRpgindividual.g:1246:3: otherlv_0= 'death' ( (lv_req_1_0= ruleRequire ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDeathAccess().getDeathKeyword_0());
            		
            // InternalRpgindividual.g:1250:3: ( (lv_req_1_0= ruleRequire ) )
            // InternalRpgindividual.g:1251:4: (lv_req_1_0= ruleRequire )
            {
            // InternalRpgindividual.g:1251:4: (lv_req_1_0= ruleRequire )
            // InternalRpgindividual.g:1252:5: lv_req_1_0= ruleRequire
            {

            					newCompositeNode(grammarAccess.getDeathAccess().getReqRequireParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_req_1_0=ruleRequire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeathRule());
            					}
            					set(
            						current,
            						"req",
            						lv_req_1_0,
            						"smitey.Rpgindividual.Require");
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
    // InternalRpgindividual.g:1273:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalRpgindividual.g:1273:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalRpgindividual.g:1274:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalRpgindividual.g:1280:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_eType_2_0 = null;

        EObject lv_att_3_0 = null;

        EObject lv_eMoves_4_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1286:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) ) )
            // InternalRpgindividual.g:1287:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            {
            // InternalRpgindividual.g:1287:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) ) )
            // InternalRpgindividual.g:1288:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_eType_2_0= ruleEType ) ) ( (lv_att_3_0= ruleAltAttribute ) )* ( (lv_eMoves_4_0= ruleEntityMoves ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalRpgindividual.g:1292:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1293:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1293:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1294:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalRpgindividual.g:1310:3: ( (lv_eType_2_0= ruleEType ) )
            // InternalRpgindividual.g:1311:4: (lv_eType_2_0= ruleEType )
            {
            // InternalRpgindividual.g:1311:4: (lv_eType_2_0= ruleEType )
            // InternalRpgindividual.g:1312:5: lv_eType_2_0= ruleEType
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

            // InternalRpgindividual.g:1329:3: ( (lv_att_3_0= ruleAltAttribute ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRpgindividual.g:1330:4: (lv_att_3_0= ruleAltAttribute )
            	    {
            	    // InternalRpgindividual.g:1330:4: (lv_att_3_0= ruleAltAttribute )
            	    // InternalRpgindividual.g:1331:5: lv_att_3_0= ruleAltAttribute
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

            // InternalRpgindividual.g:1348:3: ( (lv_eMoves_4_0= ruleEntityMoves ) )
            // InternalRpgindividual.g:1349:4: (lv_eMoves_4_0= ruleEntityMoves )
            {
            // InternalRpgindividual.g:1349:4: (lv_eMoves_4_0= ruleEntityMoves )
            // InternalRpgindividual.g:1350:5: lv_eMoves_4_0= ruleEntityMoves
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
    // InternalRpgindividual.g:1371:1: entryRuleEntityMoves returns [EObject current=null] : iv_ruleEntityMoves= ruleEntityMoves EOF ;
    public final EObject entryRuleEntityMoves() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityMoves = null;


        try {
            // InternalRpgindividual.g:1371:52: (iv_ruleEntityMoves= ruleEntityMoves EOF )
            // InternalRpgindividual.g:1372:2: iv_ruleEntityMoves= ruleEntityMoves EOF
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
    // InternalRpgindividual.g:1378:1: ruleEntityMoves returns [EObject current=null] : (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleEntityMoves() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1384:2: ( (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRpgindividual.g:1385:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRpgindividual.g:1385:2: (otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRpgindividual.g:1386:3: otherlv_0= 'move' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityMovesAccess().getMoveKeyword_0());
            		
            // InternalRpgindividual.g:1390:3: ( (otherlv_1= RULE_ID ) )+
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
            	    // InternalRpgindividual.g:1391:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:1391:4: (otherlv_1= RULE_ID )
            	    // InternalRpgindividual.g:1392:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getEntityMovesRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getEntityMovesAccess().getMoveMoveCrossReference_1_0());
            	    				

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


    // $ANTLR start "entryRuleTeams"
    // InternalRpgindividual.g:1407:1: entryRuleTeams returns [EObject current=null] : iv_ruleTeams= ruleTeams EOF ;
    public final EObject entryRuleTeams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeams = null;


        try {
            // InternalRpgindividual.g:1407:46: (iv_ruleTeams= ruleTeams EOF )
            // InternalRpgindividual.g:1408:2: iv_ruleTeams= ruleTeams EOF
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
    // InternalRpgindividual.g:1414:1: ruleTeams returns [EObject current=null] : (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) ;
    public final EObject ruleTeams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_team_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1420:2: ( (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ ) )
            // InternalRpgindividual.g:1421:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            {
            // InternalRpgindividual.g:1421:2: (otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+ )
            // InternalRpgindividual.g:1422:3: otherlv_0= 'teams' ( (lv_team_1_0= ruleTeam ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamsAccess().getTeamsKeyword_0());
            		
            // InternalRpgindividual.g:1426:3: ( (lv_team_1_0= ruleTeam ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRpgindividual.g:1427:4: (lv_team_1_0= ruleTeam )
            	    {
            	    // InternalRpgindividual.g:1427:4: (lv_team_1_0= ruleTeam )
            	    // InternalRpgindividual.g:1428:5: lv_team_1_0= ruleTeam
            	    {

            	    					newCompositeNode(grammarAccess.getTeamsAccess().getTeamTeamParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalRpgindividual.g:1449:1: entryRuleTeam returns [EObject current=null] : iv_ruleTeam= ruleTeam EOF ;
    public final EObject entryRuleTeam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam = null;


        try {
            // InternalRpgindividual.g:1449:45: (iv_ruleTeam= ruleTeam EOF )
            // InternalRpgindividual.g:1450:2: iv_ruleTeam= ruleTeam EOF
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
    // InternalRpgindividual.g:1456:1: ruleTeam returns [EObject current=null] : (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) ;
    public final EObject ruleTeam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_members_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1462:2: ( (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) ) )
            // InternalRpgindividual.g:1463:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            {
            // InternalRpgindividual.g:1463:2: (otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) ) )
            // InternalRpgindividual.g:1464:3: otherlv_0= 'team' ( (lv_name_1_0= RULE_ID ) ) ( (lv_members_2_0= ruleMembers ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamAccess().getTeamKeyword_0());
            		
            // InternalRpgindividual.g:1468:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRpgindividual.g:1469:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRpgindividual.g:1469:4: (lv_name_1_0= RULE_ID )
            // InternalRpgindividual.g:1470:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

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

            // InternalRpgindividual.g:1486:3: ( (lv_members_2_0= ruleMembers ) )
            // InternalRpgindividual.g:1487:4: (lv_members_2_0= ruleMembers )
            {
            // InternalRpgindividual.g:1487:4: (lv_members_2_0= ruleMembers )
            // InternalRpgindividual.g:1488:5: lv_members_2_0= ruleMembers
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
    // InternalRpgindividual.g:1509:1: entryRuleMembers returns [EObject current=null] : iv_ruleMembers= ruleMembers EOF ;
    public final EObject entryRuleMembers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMembers = null;


        try {
            // InternalRpgindividual.g:1509:48: (iv_ruleMembers= ruleMembers EOF )
            // InternalRpgindividual.g:1510:2: iv_ruleMembers= ruleMembers EOF
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
    // InternalRpgindividual.g:1516:1: ruleMembers returns [EObject current=null] : (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) ;
    public final EObject ruleMembers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:1522:2: ( (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ ) )
            // InternalRpgindividual.g:1523:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            {
            // InternalRpgindividual.g:1523:2: (otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+ )
            // InternalRpgindividual.g:1524:3: otherlv_0= 'members' ( (otherlv_1= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMembersAccess().getMembersKeyword_0());
            		
            // InternalRpgindividual.g:1528:3: ( (otherlv_1= RULE_ID ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRpgindividual.g:1529:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalRpgindividual.g:1529:4: (otherlv_1= RULE_ID )
            	    // InternalRpgindividual.g:1530:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMembersRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    					newLeafNode(otherlv_1, grammarAccess.getMembersAccess().getEntityEntityCrossReference_1_0());
            	    				

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
    // $ANTLR end "ruleMembers"


    // $ANTLR start "entryRuleRequire"
    // InternalRpgindividual.g:1545:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalRpgindividual.g:1545:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalRpgindividual.g:1546:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalRpgindividual.g:1552:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_log_1_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1558:2: ( (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) ) )
            // InternalRpgindividual.g:1559:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            {
            // InternalRpgindividual.g:1559:2: (otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) ) )
            // InternalRpgindividual.g:1560:3: otherlv_0= 'require' ( (lv_log_1_0= ruleORcondition ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalRpgindividual.g:1564:3: ( (lv_log_1_0= ruleORcondition ) )
            // InternalRpgindividual.g:1565:4: (lv_log_1_0= ruleORcondition )
            {
            // InternalRpgindividual.g:1565:4: (lv_log_1_0= ruleORcondition )
            // InternalRpgindividual.g:1566:5: lv_log_1_0= ruleORcondition
            {

            					newCompositeNode(grammarAccess.getRequireAccess().getLogORconditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_log_1_0=ruleORcondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequireRule());
            					}
            					set(
            						current,
            						"log",
            						lv_log_1_0,
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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleORcondition"
    // InternalRpgindividual.g:1587:1: entryRuleORcondition returns [EObject current=null] : iv_ruleORcondition= ruleORcondition EOF ;
    public final EObject entryRuleORcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORcondition = null;


        try {
            // InternalRpgindividual.g:1587:52: (iv_ruleORcondition= ruleORcondition EOF )
            // InternalRpgindividual.g:1588:2: iv_ruleORcondition= ruleORcondition EOF
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
    // InternalRpgindividual.g:1594:1: ruleORcondition returns [EObject current=null] : (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) ;
    public final EObject ruleORcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_ANDcondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1600:2: ( (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* ) )
            // InternalRpgindividual.g:1601:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            {
            // InternalRpgindividual.g:1601:2: (this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )* )
            // InternalRpgindividual.g:1602:3: this_ANDcondition_0= ruleANDcondition (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getORconditionAccess().getANDconditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_ANDcondition_0=ruleANDcondition();

            state._fsp--;


            			current = this_ANDcondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1610:3: (otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRpgindividual.g:1611:4: otherlv_1= 'OR' () ( (lv_right_3_0= ruleANDcondition ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getORconditionAccess().getORKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1615:4: ()
            	    // InternalRpgindividual.g:1616:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getORconditionAccess().getOrLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1622:4: ( (lv_right_3_0= ruleANDcondition ) )
            	    // InternalRpgindividual.g:1623:5: (lv_right_3_0= ruleANDcondition )
            	    {
            	    // InternalRpgindividual.g:1623:5: (lv_right_3_0= ruleANDcondition )
            	    // InternalRpgindividual.g:1624:6: lv_right_3_0= ruleANDcondition
            	    {

            	    						newCompositeNode(grammarAccess.getORconditionAccess().getRightANDconditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_34);
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
            	    break loop21;
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
    // InternalRpgindividual.g:1646:1: entryRuleANDcondition returns [EObject current=null] : iv_ruleANDcondition= ruleANDcondition EOF ;
    public final EObject entryRuleANDcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDcondition = null;


        try {
            // InternalRpgindividual.g:1646:53: (iv_ruleANDcondition= ruleANDcondition EOF )
            // InternalRpgindividual.g:1647:2: iv_ruleANDcondition= ruleANDcondition EOF
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
    // InternalRpgindividual.g:1653:1: ruleANDcondition returns [EObject current=null] : (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) ;
    public final EObject ruleANDcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Statement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1659:2: ( (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* ) )
            // InternalRpgindividual.g:1660:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            {
            // InternalRpgindividual.g:1660:2: (this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )* )
            // InternalRpgindividual.g:1661:3: this_Statement_0= ruleStatement (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            {

            			newCompositeNode(grammarAccess.getANDconditionAccess().getStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Statement_0=ruleStatement();

            state._fsp--;


            			current = this_Statement_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1669:3: (otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRpgindividual.g:1670:4: otherlv_1= 'AND' () ( (lv_right_3_0= ruleStatement ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_24); 

            	    				newLeafNode(otherlv_1, grammarAccess.getANDconditionAccess().getANDKeyword_1_0());
            	    			
            	    // InternalRpgindividual.g:1674:4: ()
            	    // InternalRpgindividual.g:1675:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getANDconditionAccess().getAndLeftAction_1_1(),
            	    						current);
            	    				

            	    }

            	    // InternalRpgindividual.g:1681:4: ( (lv_right_3_0= ruleStatement ) )
            	    // InternalRpgindividual.g:1682:5: (lv_right_3_0= ruleStatement )
            	    {
            	    // InternalRpgindividual.g:1682:5: (lv_right_3_0= ruleStatement )
            	    // InternalRpgindividual.g:1683:6: lv_right_3_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getANDconditionAccess().getRightStatementParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_35);
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
    // $ANTLR end "ruleANDcondition"


    // $ANTLR start "entryRuleStatement"
    // InternalRpgindividual.g:1705:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalRpgindividual.g:1705:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalRpgindividual.g:1706:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalRpgindividual.g:1712:1: ruleStatement returns [EObject current=null] : (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_NumberComparing_0 = null;

        EObject this_ORcondition_2 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1718:2: ( (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) ) )
            // InternalRpgindividual.g:1719:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            {
            // InternalRpgindividual.g:1719:2: (this_NumberComparing_0= ruleNumberComparing | (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||(LA23_0>=48 && LA23_0<=49)) ) {
                alt23=1;
            }
            else if ( (LA23_0==36) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalRpgindividual.g:1720:3: this_NumberComparing_0= ruleNumberComparing
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
                    // InternalRpgindividual.g:1729:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    {
                    // InternalRpgindividual.g:1729:3: (otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')' )
                    // InternalRpgindividual.g:1730:4: otherlv_1= '(' this_ORcondition_2= ruleORcondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getStatementAccess().getORconditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_36);
                    this_ORcondition_2=ruleORcondition();

                    state._fsp--;


                    				current = this_ORcondition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,37,FOLLOW_2); 

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
    // InternalRpgindividual.g:1751:1: entryRuleNumberComparing returns [EObject current=null] : iv_ruleNumberComparing= ruleNumberComparing EOF ;
    public final EObject entryRuleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberComparing = null;


        try {
            // InternalRpgindividual.g:1751:56: (iv_ruleNumberComparing= ruleNumberComparing EOF )
            // InternalRpgindividual.g:1752:2: iv_ruleNumberComparing= ruleNumberComparing EOF
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
    // InternalRpgindividual.g:1758:1: ruleNumberComparing returns [EObject current=null] : ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) ;
    public final EObject ruleNumberComparing() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1764:2: ( ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) ) )
            // InternalRpgindividual.g:1765:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            {
            // InternalRpgindividual.g:1765:2: ( ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) ) )
            // InternalRpgindividual.g:1766:3: ( (lv_left_0_0= ruleSum ) ) ( (lv_comp_1_0= ruleComparator ) ) ( (lv_right_2_0= ruleSum ) )
            {
            // InternalRpgindividual.g:1766:3: ( (lv_left_0_0= ruleSum ) )
            // InternalRpgindividual.g:1767:4: (lv_left_0_0= ruleSum )
            {
            // InternalRpgindividual.g:1767:4: (lv_left_0_0= ruleSum )
            // InternalRpgindividual.g:1768:5: lv_left_0_0= ruleSum
            {

            					newCompositeNode(grammarAccess.getNumberComparingAccess().getLeftSumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            // InternalRpgindividual.g:1785:3: ( (lv_comp_1_0= ruleComparator ) )
            // InternalRpgindividual.g:1786:4: (lv_comp_1_0= ruleComparator )
            {
            // InternalRpgindividual.g:1786:4: (lv_comp_1_0= ruleComparator )
            // InternalRpgindividual.g:1787:5: lv_comp_1_0= ruleComparator
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

            // InternalRpgindividual.g:1804:3: ( (lv_right_2_0= ruleSum ) )
            // InternalRpgindividual.g:1805:4: (lv_right_2_0= ruleSum )
            {
            // InternalRpgindividual.g:1805:4: (lv_right_2_0= ruleSum )
            // InternalRpgindividual.g:1806:5: lv_right_2_0= ruleSum
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
    // InternalRpgindividual.g:1827:1: entryRuleComparator returns [EObject current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final EObject entryRuleComparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparator = null;


        try {
            // InternalRpgindividual.g:1827:51: (iv_ruleComparator= ruleComparator EOF )
            // InternalRpgindividual.g:1828:2: iv_ruleComparator= ruleComparator EOF
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
    // InternalRpgindividual.g:1834:1: ruleComparator returns [EObject current=null] : ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) ;
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
            // InternalRpgindividual.g:1840:2: ( ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) ) )
            // InternalRpgindividual.g:1841:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            {
            // InternalRpgindividual.g:1841:2: ( ( () otherlv_1= '<' ) | ( () otherlv_3= '<=' ) | ( () otherlv_5= '==' ) | ( () otherlv_7= '>=' ) | ( () otherlv_9= '>' ) | ( () otherlv_11= '!=' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt24=1;
                }
                break;
            case 38:
                {
                alt24=2;
                }
                break;
            case 39:
                {
                alt24=3;
                }
                break;
            case 40:
                {
                alt24=4;
                }
                break;
            case 41:
                {
                alt24=5;
                }
                break;
            case 42:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalRpgindividual.g:1842:3: ( () otherlv_1= '<' )
                    {
                    // InternalRpgindividual.g:1842:3: ( () otherlv_1= '<' )
                    // InternalRpgindividual.g:1843:4: () otherlv_1= '<'
                    {
                    // InternalRpgindividual.g:1843:4: ()
                    // InternalRpgindividual.g:1844:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparatorAccess().getLessThanSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:1856:3: ( () otherlv_3= '<=' )
                    {
                    // InternalRpgindividual.g:1856:3: ( () otherlv_3= '<=' )
                    // InternalRpgindividual.g:1857:4: () otherlv_3= '<='
                    {
                    // InternalRpgindividual.g:1857:4: ()
                    // InternalRpgindividual.g:1858:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getSmallerEqAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComparatorAccess().getLessThanSignEqualsSignKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRpgindividual.g:1870:3: ( () otherlv_5= '==' )
                    {
                    // InternalRpgindividual.g:1870:3: ( () otherlv_5= '==' )
                    // InternalRpgindividual.g:1871:4: () otherlv_5= '=='
                    {
                    // InternalRpgindividual.g:1871:4: ()
                    // InternalRpgindividual.g:1872:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getEqAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getComparatorAccess().getEqualsSignEqualsSignKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRpgindividual.g:1884:3: ( () otherlv_7= '>=' )
                    {
                    // InternalRpgindividual.g:1884:3: ( () otherlv_7= '>=' )
                    // InternalRpgindividual.g:1885:4: () otherlv_7= '>='
                    {
                    // InternalRpgindividual.g:1885:4: ()
                    // InternalRpgindividual.g:1886:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerEqAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getComparatorAccess().getGreaterThanSignEqualsSignKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRpgindividual.g:1898:3: ( () otherlv_9= '>' )
                    {
                    // InternalRpgindividual.g:1898:3: ( () otherlv_9= '>' )
                    // InternalRpgindividual.g:1899:4: () otherlv_9= '>'
                    {
                    // InternalRpgindividual.g:1899:4: ()
                    // InternalRpgindividual.g:1900:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getBiggerAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getComparatorAccess().getGreaterThanSignKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRpgindividual.g:1912:3: ( () otherlv_11= '!=' )
                    {
                    // InternalRpgindividual.g:1912:3: ( () otherlv_11= '!=' )
                    // InternalRpgindividual.g:1913:4: () otherlv_11= '!='
                    {
                    // InternalRpgindividual.g:1913:4: ()
                    // InternalRpgindividual.g:1914:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComparatorAccess().getNEqAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,42,FOLLOW_2); 

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
    // InternalRpgindividual.g:1929:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalRpgindividual.g:1929:44: (iv_ruleSum= ruleSum EOF )
            // InternalRpgindividual.g:1930:2: iv_ruleSum= ruleSum EOF
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
    // InternalRpgindividual.g:1936:1: ruleSum returns [EObject current=null] : (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Multiply_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:1942:2: ( (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* ) )
            // InternalRpgindividual.g:1943:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            {
            // InternalRpgindividual.g:1943:2: (this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )* )
            // InternalRpgindividual.g:1944:3: this_Multiply_0= ruleMultiply ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getMultiplyParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_Multiply_0=ruleMultiply();

            state._fsp--;


            			current = this_Multiply_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:1952:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=43 && LA26_0<=44)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRpgindividual.g:1953:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMultiply ) )
            	    {
            	    // InternalRpgindividual.g:1953:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==43) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==44) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalRpgindividual.g:1954:5: (otherlv_1= '+' () )
            	            {
            	            // InternalRpgindividual.g:1954:5: (otherlv_1= '+' () )
            	            // InternalRpgindividual.g:1955:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,43,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:1959:6: ()
            	            // InternalRpgindividual.g:1960:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getAddLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:1968:5: (otherlv_3= '-' () )
            	            {
            	            // InternalRpgindividual.g:1968:5: (otherlv_3= '-' () )
            	            // InternalRpgindividual.g:1969:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:1973:6: ()
            	            // InternalRpgindividual.g:1974:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getSubLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:1982:4: ( (lv_right_5_0= ruleMultiply ) )
            	    // InternalRpgindividual.g:1983:5: (lv_right_5_0= ruleMultiply )
            	    {
            	    // InternalRpgindividual.g:1983:5: (lv_right_5_0= ruleMultiply )
            	    // InternalRpgindividual.g:1984:6: lv_right_5_0= ruleMultiply
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightMultiplyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
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
            	    break loop26;
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
    // InternalRpgindividual.g:2006:1: entryRuleMultiply returns [EObject current=null] : iv_ruleMultiply= ruleMultiply EOF ;
    public final EObject entryRuleMultiply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiply = null;


        try {
            // InternalRpgindividual.g:2006:49: (iv_ruleMultiply= ruleMultiply EOF )
            // InternalRpgindividual.g:2007:2: iv_ruleMultiply= ruleMultiply EOF
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
    // InternalRpgindividual.g:2013:1: ruleMultiply returns [EObject current=null] : (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) ;
    public final EObject ruleMultiply() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_AtomicNumber_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2019:2: ( (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* ) )
            // InternalRpgindividual.g:2020:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            {
            // InternalRpgindividual.g:2020:2: (this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )* )
            // InternalRpgindividual.g:2021:3: this_AtomicNumber_0= ruleAtomicNumber ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyAccess().getAtomicNumberParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_AtomicNumber_0=ruleAtomicNumber();

            state._fsp--;


            			current = this_AtomicNumber_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalRpgindividual.g:2029:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=45 && LA28_0<=46)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRpgindividual.g:2030:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= ruleAtomicNumber ) )
            	    {
            	    // InternalRpgindividual.g:2030:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==45) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==46) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalRpgindividual.g:2031:5: (otherlv_1= '*' () )
            	            {
            	            // InternalRpgindividual.g:2031:5: (otherlv_1= '*' () )
            	            // InternalRpgindividual.g:2032:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,45,FOLLOW_26); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMultiplyAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalRpgindividual.g:2036:6: ()
            	            // InternalRpgindividual.g:2037:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalRpgindividual.g:2045:5: (otherlv_3= '/' () )
            	            {
            	            // InternalRpgindividual.g:2045:5: (otherlv_3= '/' () )
            	            // InternalRpgindividual.g:2046:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,46,FOLLOW_26); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMultiplyAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalRpgindividual.g:2050:6: ()
            	            // InternalRpgindividual.g:2051:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplyAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalRpgindividual.g:2059:4: ( (lv_right_5_0= ruleAtomicNumber ) )
            	    // InternalRpgindividual.g:2060:5: (lv_right_5_0= ruleAtomicNumber )
            	    {
            	    // InternalRpgindividual.g:2060:5: (lv_right_5_0= ruleAtomicNumber )
            	    // InternalRpgindividual.g:2061:6: lv_right_5_0= ruleAtomicNumber
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyAccess().getRightAtomicNumberParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
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
            	    break loop28;
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
    // InternalRpgindividual.g:2083:1: entryRuleAtomicNumber returns [EObject current=null] : iv_ruleAtomicNumber= ruleAtomicNumber EOF ;
    public final EObject entryRuleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicNumber = null;


        try {
            // InternalRpgindividual.g:2083:53: (iv_ruleAtomicNumber= ruleAtomicNumber EOF )
            // InternalRpgindividual.g:2084:2: iv_ruleAtomicNumber= ruleAtomicNumber EOF
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
    // InternalRpgindividual.g:2090:1: ruleAtomicNumber returns [EObject current=null] : (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) ;
    public final EObject ruleAtomicNumber() throws RecognitionException {
        EObject current = null;

        EObject this_ActualNumbers_0 = null;

        EObject this_NameAttribute_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2096:2: ( (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute ) )
            // InternalRpgindividual.g:2097:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            {
            // InternalRpgindividual.g:2097:2: (this_ActualNumbers_0= ruleActualNumbers | this_NameAttribute_1= ruleNameAttribute )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=48 && LA29_0<=49)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRpgindividual.g:2098:3: this_ActualNumbers_0= ruleActualNumbers
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
                    // InternalRpgindividual.g:2107:3: this_NameAttribute_1= ruleNameAttribute
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
    // InternalRpgindividual.g:2119:1: entryRuleActualNumbers returns [EObject current=null] : iv_ruleActualNumbers= ruleActualNumbers EOF ;
    public final EObject entryRuleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualNumbers = null;


        try {
            // InternalRpgindividual.g:2119:54: (iv_ruleActualNumbers= ruleActualNumbers EOF )
            // InternalRpgindividual.g:2120:2: iv_ruleActualNumbers= ruleActualNumbers EOF
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
    // InternalRpgindividual.g:2126:1: ruleActualNumbers returns [EObject current=null] : (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) ;
    public final EObject ruleActualNumbers() throws RecognitionException {
        EObject current = null;

        EObject this_FloatNum_0 = null;

        EObject this_IntNum_1 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2132:2: ( (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum ) )
            // InternalRpgindividual.g:2133:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            {
            // InternalRpgindividual.g:2133:2: (this_FloatNum_0= ruleFloatNum | this_IntNum_1= ruleIntNum )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==EOF||(LA30_1>=12 && LA30_1<=17)||LA30_1==19||(LA30_1>=22 && LA30_1<=23)||(LA30_1>=26 && LA30_1<=28)||LA30_1==30||(LA30_1>=34 && LA30_1<=35)||(LA30_1>=37 && LA30_1<=46)) ) {
                    alt30=2;
                }
                else if ( (LA30_1==47) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalRpgindividual.g:2134:3: this_FloatNum_0= ruleFloatNum
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
                    // InternalRpgindividual.g:2143:3: this_IntNum_1= ruleIntNum
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
    // InternalRpgindividual.g:2155:1: entryRuleNameAttribute returns [EObject current=null] : iv_ruleNameAttribute= ruleNameAttribute EOF ;
    public final EObject entryRuleNameAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttribute = null;


        try {
            // InternalRpgindividual.g:2155:54: (iv_ruleNameAttribute= ruleNameAttribute EOF )
            // InternalRpgindividual.g:2156:2: iv_ruleNameAttribute= ruleNameAttribute EOF
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
    // InternalRpgindividual.g:2162:1: ruleNameAttribute returns [EObject current=null] : ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleNameAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_target_0_0 = null;



        	enterRule();

        try {
            // InternalRpgindividual.g:2168:2: ( ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRpgindividual.g:2169:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRpgindividual.g:2169:2: ( ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalRpgindividual.g:2170:3: ( (lv_target_0_0= ruleTarget ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalRpgindividual.g:2170:3: ( (lv_target_0_0= ruleTarget ) )
            // InternalRpgindividual.g:2171:4: (lv_target_0_0= ruleTarget )
            {
            // InternalRpgindividual.g:2171:4: (lv_target_0_0= ruleTarget )
            // InternalRpgindividual.g:2172:5: lv_target_0_0= ruleTarget
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

            // InternalRpgindividual.g:2189:3: ( (otherlv_1= RULE_ID ) )
            // InternalRpgindividual.g:2190:4: (otherlv_1= RULE_ID )
            {
            // InternalRpgindividual.g:2190:4: (otherlv_1= RULE_ID )
            // InternalRpgindividual.g:2191:5: otherlv_1= RULE_ID
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
    // InternalRpgindividual.g:2206:1: entryRuleIntNum returns [EObject current=null] : iv_ruleIntNum= ruleIntNum EOF ;
    public final EObject entryRuleIntNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntNum = null;


        try {
            // InternalRpgindividual.g:2206:47: (iv_ruleIntNum= ruleIntNum EOF )
            // InternalRpgindividual.g:2207:2: iv_ruleIntNum= ruleIntNum EOF
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
    // InternalRpgindividual.g:2213:1: ruleIntNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2219:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2220:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2220:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2221:3: (lv_value_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2221:3: (lv_value_0_0= RULE_INT )
            // InternalRpgindividual.g:2222:4: lv_value_0_0= RULE_INT
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
    // InternalRpgindividual.g:2241:1: entryRuleFloatNum returns [EObject current=null] : iv_ruleFloatNum= ruleFloatNum EOF ;
    public final EObject entryRuleFloatNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatNum = null;


        try {
            // InternalRpgindividual.g:2241:49: (iv_ruleFloatNum= ruleFloatNum EOF )
            // InternalRpgindividual.g:2242:2: iv_ruleFloatNum= ruleFloatNum EOF
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
    // InternalRpgindividual.g:2248:1: ruleFloatNum returns [EObject current=null] : ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFloatNum() throws RecognitionException {
        EObject current = null;

        Token lv_i_0_0=null;
        Token otherlv_1=null;
        Token lv_decimal_2_0=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2254:2: ( ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) ) )
            // InternalRpgindividual.g:2255:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            {
            // InternalRpgindividual.g:2255:2: ( ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) ) )
            // InternalRpgindividual.g:2256:3: ( (lv_i_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_decimal_2_0= RULE_INT ) )
            {
            // InternalRpgindividual.g:2256:3: ( (lv_i_0_0= RULE_INT ) )
            // InternalRpgindividual.g:2257:4: (lv_i_0_0= RULE_INT )
            {
            // InternalRpgindividual.g:2257:4: (lv_i_0_0= RULE_INT )
            // InternalRpgindividual.g:2258:5: lv_i_0_0= RULE_INT
            {
            lv_i_0_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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

            otherlv_1=(Token)match(input,47,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getFloatNumAccess().getFullStopKeyword_1());
            		
            // InternalRpgindividual.g:2278:3: ( (lv_decimal_2_0= RULE_INT ) )
            // InternalRpgindividual.g:2279:4: (lv_decimal_2_0= RULE_INT )
            {
            // InternalRpgindividual.g:2279:4: (lv_decimal_2_0= RULE_INT )
            // InternalRpgindividual.g:2280:5: lv_decimal_2_0= RULE_INT
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
    // InternalRpgindividual.g:2300:1: entryRuleTarget returns [String current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final String entryRuleTarget() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTarget = null;


        try {
            // InternalRpgindividual.g:2300:46: (iv_ruleTarget= ruleTarget EOF )
            // InternalRpgindividual.g:2301:2: iv_ruleTarget= ruleTarget EOF
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
    // InternalRpgindividual.g:2307:1: ruleTarget returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'User' | kw= 'Enemy' ) ;
    public final AntlrDatatypeRuleToken ruleTarget() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2313:2: ( (kw= 'User' | kw= 'Enemy' ) )
            // InternalRpgindividual.g:2314:2: (kw= 'User' | kw= 'Enemy' )
            {
            // InternalRpgindividual.g:2314:2: (kw= 'User' | kw= 'Enemy' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            else if ( (LA31_0==49) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRpgindividual.g:2315:3: kw= 'User'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTargetAccess().getUserKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2321:3: kw= 'Enemy'
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
    // InternalRpgindividual.g:2330:1: entryRuleLegalType returns [String current=null] : iv_ruleLegalType= ruleLegalType EOF ;
    public final String entryRuleLegalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLegalType = null;


        try {
            // InternalRpgindividual.g:2330:49: (iv_ruleLegalType= ruleLegalType EOF )
            // InternalRpgindividual.g:2331:2: iv_ruleLegalType= ruleLegalType EOF
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
    // InternalRpgindividual.g:2337:1: ruleLegalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Float' | kw= 'Integer' ) ;
    public final AntlrDatatypeRuleToken ruleLegalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRpgindividual.g:2343:2: ( (kw= 'Float' | kw= 'Integer' ) )
            // InternalRpgindividual.g:2344:2: (kw= 'Float' | kw= 'Integer' )
            {
            // InternalRpgindividual.g:2344:2: (kw= 'Float' | kw= 'Integer' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            else if ( (LA32_0==51) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalRpgindividual.g:2345:3: kw= 'Float'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLegalTypeAccess().getFloatKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRpgindividual.g:2351:3: kw= 'Integer'
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000588A9002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000C000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000F001002000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000F000002000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000007C000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});

}