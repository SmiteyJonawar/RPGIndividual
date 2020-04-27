/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smitey.rpgindividual.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RpgindividualFactoryImpl extends EFactoryImpl implements RpgindividualFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RpgindividualFactory init()
  {
    try
    {
      RpgindividualFactory theRpgindividualFactory = (RpgindividualFactory)EPackage.Registry.INSTANCE.getEFactory(RpgindividualPackage.eNS_URI);
      if (theRpgindividualFactory != null)
      {
        return theRpgindividualFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RpgindividualFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RpgindividualFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RpgindividualPackage.SYSTEM_RPG: return createSystemRPG();
      case RpgindividualPackage.DECLARATION: return createDeclaration();
      case RpgindividualPackage.EFFECTS: return createEffects();
      case RpgindividualPackage.EFFECT: return createEffect();
      case RpgindividualPackage.BUFF: return createBuff();
      case RpgindividualPackage.MOVE_E: return createMoveE();
      case RpgindividualPackage.AFTER_E: return createAfterE();
      case RpgindividualPackage.ATTRIBUTES: return createAttributes();
      case RpgindividualPackage.ATTRIBUTE: return createAttribute();
      case RpgindividualPackage.LOCATIONS: return createLocations();
      case RpgindividualPackage.LOC: return createLoc();
      case RpgindividualPackage.RELATIONS: return createRelations();
      case RpgindividualPackage.TYPE: return createType();
      case RpgindividualPackage.TYPE_EXPRESSION: return createTypeExpression();
      case RpgindividualPackage.MOVES: return createMoves();
      case RpgindividualPackage.MOVE: return createMove();
      case RpgindividualPackage.MEFFECT: return createMEffect();
      case RpgindividualPackage.BEFFECT: return createBEffect();
      case RpgindividualPackage.AEFFECT: return createAEffect();
      case RpgindividualPackage.ETYPE: return createEType();
      case RpgindividualPackage.ATTRIBUTE_VALUES: return createAttributeValues();
      case RpgindividualPackage.ALT_ATTRIBUTE: return createAltAttribute();
      case RpgindividualPackage.RULE: return createRule();
      case RpgindividualPackage.ENTITIES: return createEntities();
      case RpgindividualPackage.DEATH: return createDeath();
      case RpgindividualPackage.ENTITY: return createEntity();
      case RpgindividualPackage.ENTITY_MOVES: return createEntityMoves();
      case RpgindividualPackage.TEAMS: return createTeams();
      case RpgindividualPackage.TEAM: return createTeam();
      case RpgindividualPackage.MEMBERS: return createMembers();
      case RpgindividualPackage.REQUIRE: return createRequire();
      case RpgindividualPackage.PROPOSITION: return createProposition();
      case RpgindividualPackage.NUMBER_COMPARING: return createNumberComparing();
      case RpgindividualPackage.COMPARATOR: return createComparator();
      case RpgindividualPackage.SUM: return createSum();
      case RpgindividualPackage.MULTIPLY: return createMultiply();
      case RpgindividualPackage.ATOMIC_NUMBER: return createAtomicNumber();
      case RpgindividualPackage.ACTUAL_NUMBERS: return createActualNumbers();
      case RpgindividualPackage.NAME_ATTRIBUTE: return createNameAttribute();
      case RpgindividualPackage.INT_NUM: return createIntNum();
      case RpgindividualPackage.FLOAT_NUM: return createFloatNum();
      case RpgindividualPackage.OR: return createOr();
      case RpgindividualPackage.AND: return createAnd();
      case RpgindividualPackage.SMALLER: return createSmaller();
      case RpgindividualPackage.SMALLER_EQ: return createSmallerEq();
      case RpgindividualPackage.EQ: return createEq();
      case RpgindividualPackage.BIGGER_EQ: return createBiggerEq();
      case RpgindividualPackage.BIGGER: return createBigger();
      case RpgindividualPackage.NEQ: return createNEq();
      case RpgindividualPackage.ADD: return createAdd();
      case RpgindividualPackage.SUB: return createSub();
      case RpgindividualPackage.MULT: return createMult();
      case RpgindividualPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SystemRPG createSystemRPG()
  {
    SystemRPGImpl systemRPG = new SystemRPGImpl();
    return systemRPG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Effects createEffects()
  {
    EffectsImpl effects = new EffectsImpl();
    return effects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Buff createBuff()
  {
    BuffImpl buff = new BuffImpl();
    return buff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoveE createMoveE()
  {
    MoveEImpl moveE = new MoveEImpl();
    return moveE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AfterE createAfterE()
  {
    AfterEImpl afterE = new AfterEImpl();
    return afterE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attributes createAttributes()
  {
    AttributesImpl attributes = new AttributesImpl();
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Locations createLocations()
  {
    LocationsImpl locations = new LocationsImpl();
    return locations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loc createLoc()
  {
    LocImpl loc = new LocImpl();
    return loc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Relations createRelations()
  {
    RelationsImpl relations = new RelationsImpl();
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeExpression createTypeExpression()
  {
    TypeExpressionImpl typeExpression = new TypeExpressionImpl();
    return typeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Moves createMoves()
  {
    MovesImpl moves = new MovesImpl();
    return moves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Move createMove()
  {
    MoveImpl move = new MoveImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MEffect createMEffect()
  {
    MEffectImpl mEffect = new MEffectImpl();
    return mEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BEffect createBEffect()
  {
    BEffectImpl bEffect = new BEffectImpl();
    return bEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AEffect createAEffect()
  {
    AEffectImpl aEffect = new AEffectImpl();
    return aEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EType createEType()
  {
    ETypeImpl eType = new ETypeImpl();
    return eType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeValues createAttributeValues()
  {
    AttributeValuesImpl attributeValues = new AttributeValuesImpl();
    return attributeValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AltAttribute createAltAttribute()
  {
    AltAttributeImpl altAttribute = new AltAttributeImpl();
    return altAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entities createEntities()
  {
    EntitiesImpl entities = new EntitiesImpl();
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Death createDeath()
  {
    DeathImpl death = new DeathImpl();
    return death;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityMoves createEntityMoves()
  {
    EntityMovesImpl entityMoves = new EntityMovesImpl();
    return entityMoves;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Teams createTeams()
  {
    TeamsImpl teams = new TeamsImpl();
    return teams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Team createTeam()
  {
    TeamImpl team = new TeamImpl();
    return team;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Members createMembers()
  {
    MembersImpl members = new MembersImpl();
    return members;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Require createRequire()
  {
    RequireImpl require = new RequireImpl();
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition createProposition()
  {
    PropositionImpl proposition = new PropositionImpl();
    return proposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberComparing createNumberComparing()
  {
    NumberComparingImpl numberComparing = new NumberComparingImpl();
    return numberComparing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparator createComparator()
  {
    ComparatorImpl comparator = new ComparatorImpl();
    return comparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sum createSum()
  {
    SumImpl sum = new SumImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Multiply createMultiply()
  {
    MultiplyImpl multiply = new MultiplyImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtomicNumber createAtomicNumber()
  {
    AtomicNumberImpl atomicNumber = new AtomicNumberImpl();
    return atomicNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActualNumbers createActualNumbers()
  {
    ActualNumbersImpl actualNumbers = new ActualNumbersImpl();
    return actualNumbers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NameAttribute createNameAttribute()
  {
    NameAttributeImpl nameAttribute = new NameAttributeImpl();
    return nameAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntNum createIntNum()
  {
    IntNumImpl intNum = new IntNumImpl();
    return intNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FloatNum createFloatNum()
  {
    FloatNumImpl floatNum = new FloatNumImpl();
    return floatNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Smaller createSmaller()
  {
    SmallerImpl smaller = new SmallerImpl();
    return smaller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SmallerEq createSmallerEq()
  {
    SmallerEqImpl smallerEq = new SmallerEqImpl();
    return smallerEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Eq createEq()
  {
    EqImpl eq = new EqImpl();
    return eq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BiggerEq createBiggerEq()
  {
    BiggerEqImpl biggerEq = new BiggerEqImpl();
    return biggerEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bigger createBigger()
  {
    BiggerImpl bigger = new BiggerImpl();
    return bigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NEq createNEq()
  {
    NEqImpl nEq = new NEqImpl();
    return nEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RpgindividualPackage getRpgindividualPackage()
  {
    return (RpgindividualPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RpgindividualPackage getPackage()
  {
    return RpgindividualPackage.eINSTANCE;
  }

} //RpgindividualFactoryImpl
