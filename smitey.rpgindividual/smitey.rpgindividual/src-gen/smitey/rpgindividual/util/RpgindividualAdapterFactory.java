/**
 * generated by Xtext 2.21.0
 */
package smitey.rpgindividual.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import smitey.rpgindividual.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see smitey.rpgindividual.RpgindividualPackage
 * @generated
 */
public class RpgindividualAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RpgindividualPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RpgindividualAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RpgindividualPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RpgindividualSwitch<Adapter> modelSwitch =
    new RpgindividualSwitch<Adapter>()
    {
      @Override
      public Adapter caseSystemRPG(SystemRPG object)
      {
        return createSystemRPGAdapter();
      }
      @Override
      public Adapter caseDeclaration(Declaration object)
      {
        return createDeclarationAdapter();
      }
      @Override
      public Adapter caseEffects(Effects object)
      {
        return createEffectsAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseMoveE(MoveE object)
      {
        return createMoveEAdapter();
      }
      @Override
      public Adapter caseAttributes(Attributes object)
      {
        return createAttributesAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseLocations(Locations object)
      {
        return createLocationsAdapter();
      }
      @Override
      public Adapter caseLoc(Loc object)
      {
        return createLocAdapter();
      }
      @Override
      public Adapter caseRelations(Relations object)
      {
        return createRelationsAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypeExpression(TypeExpression object)
      {
        return createTypeExpressionAdapter();
      }
      @Override
      public Adapter caseMoves(Moves object)
      {
        return createMovesAdapter();
      }
      @Override
      public Adapter caseMove(Move object)
      {
        return createMoveAdapter();
      }
      @Override
      public Adapter caseMEffect(MEffect object)
      {
        return createMEffectAdapter();
      }
      @Override
      public Adapter caseEType(EType object)
      {
        return createETypeAdapter();
      }
      @Override
      public Adapter caseAttributeValues(AttributeValues object)
      {
        return createAttributeValuesAdapter();
      }
      @Override
      public Adapter caseAltAttribute(AltAttribute object)
      {
        return createAltAttributeAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseEntities(Entities object)
      {
        return createEntitiesAdapter();
      }
      @Override
      public Adapter caseDeath(Death object)
      {
        return createDeathAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseEntityMoves(EntityMoves object)
      {
        return createEntityMovesAdapter();
      }
      @Override
      public Adapter caseEntityMoveModifier(EntityMoveModifier object)
      {
        return createEntityMoveModifierAdapter();
      }
      @Override
      public Adapter caseEntityMoveMultiplier(EntityMoveMultiplier object)
      {
        return createEntityMoveMultiplierAdapter();
      }
      @Override
      public Adapter caseTeams(Teams object)
      {
        return createTeamsAdapter();
      }
      @Override
      public Adapter caseTeam(Team object)
      {
        return createTeamAdapter();
      }
      @Override
      public Adapter caseMembers(Members object)
      {
        return createMembersAdapter();
      }
      @Override
      public Adapter caseRequire(Require object)
      {
        return createRequireAdapter();
      }
      @Override
      public Adapter caseProposition(Proposition object)
      {
        return createPropositionAdapter();
      }
      @Override
      public Adapter caseNumberComparing(NumberComparing object)
      {
        return createNumberComparingAdapter();
      }
      @Override
      public Adapter caseComparator(Comparator object)
      {
        return createComparatorAdapter();
      }
      @Override
      public Adapter caseSum(Sum object)
      {
        return createSumAdapter();
      }
      @Override
      public Adapter caseMultiply(Multiply object)
      {
        return createMultiplyAdapter();
      }
      @Override
      public Adapter caseAtomicNumber(AtomicNumber object)
      {
        return createAtomicNumberAdapter();
      }
      @Override
      public Adapter caseActualNumbers(ActualNumbers object)
      {
        return createActualNumbersAdapter();
      }
      @Override
      public Adapter caseNameAttribute(NameAttribute object)
      {
        return createNameAttributeAdapter();
      }
      @Override
      public Adapter caseIntNum(IntNum object)
      {
        return createIntNumAdapter();
      }
      @Override
      public Adapter caseFloatNum(FloatNum object)
      {
        return createFloatNumAdapter();
      }
      @Override
      public Adapter caseOr(Or object)
      {
        return createOrAdapter();
      }
      @Override
      public Adapter caseAnd(And object)
      {
        return createAndAdapter();
      }
      @Override
      public Adapter caseSmaller(Smaller object)
      {
        return createSmallerAdapter();
      }
      @Override
      public Adapter caseSmallerEq(SmallerEq object)
      {
        return createSmallerEqAdapter();
      }
      @Override
      public Adapter caseEq(Eq object)
      {
        return createEqAdapter();
      }
      @Override
      public Adapter caseBiggerEq(BiggerEq object)
      {
        return createBiggerEqAdapter();
      }
      @Override
      public Adapter caseBigger(Bigger object)
      {
        return createBiggerAdapter();
      }
      @Override
      public Adapter caseNEq(NEq object)
      {
        return createNEqAdapter();
      }
      @Override
      public Adapter caseAdd(Add object)
      {
        return createAddAdapter();
      }
      @Override
      public Adapter caseSub(Sub object)
      {
        return createSubAdapter();
      }
      @Override
      public Adapter caseMult(Mult object)
      {
        return createMultAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.SystemRPG <em>System RPG</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.SystemRPG
   * @generated
   */
  public Adapter createSystemRPGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Declaration
   * @generated
   */
  public Adapter createDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Effects <em>Effects</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Effects
   * @generated
   */
  public Adapter createEffectsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.MoveE <em>Move E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.MoveE
   * @generated
   */
  public Adapter createMoveEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Attributes
   * @generated
   */
  public Adapter createAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Locations <em>Locations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Locations
   * @generated
   */
  public Adapter createLocationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Loc <em>Loc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Loc
   * @generated
   */
  public Adapter createLocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Relations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Relations
   * @generated
   */
  public Adapter createRelationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.TypeExpression <em>Type Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.TypeExpression
   * @generated
   */
  public Adapter createTypeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Moves <em>Moves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Moves
   * @generated
   */
  public Adapter createMovesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Move <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Move
   * @generated
   */
  public Adapter createMoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.MEffect <em>MEffect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.MEffect
   * @generated
   */
  public Adapter createMEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.EType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.EType
   * @generated
   */
  public Adapter createETypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.AttributeValues <em>Attribute Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.AttributeValues
   * @generated
   */
  public Adapter createAttributeValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.AltAttribute <em>Alt Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.AltAttribute
   * @generated
   */
  public Adapter createAltAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Entities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Entities
   * @generated
   */
  public Adapter createEntitiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Death <em>Death</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Death
   * @generated
   */
  public Adapter createDeathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.EntityMoves <em>Entity Moves</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.EntityMoves
   * @generated
   */
  public Adapter createEntityMovesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.EntityMoveModifier <em>Entity Move Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.EntityMoveModifier
   * @generated
   */
  public Adapter createEntityMoveModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.EntityMoveMultiplier <em>Entity Move Multiplier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.EntityMoveMultiplier
   * @generated
   */
  public Adapter createEntityMoveMultiplierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Teams <em>Teams</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Teams
   * @generated
   */
  public Adapter createTeamsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Team <em>Team</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Team
   * @generated
   */
  public Adapter createTeamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Members <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Members
   * @generated
   */
  public Adapter createMembersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Require <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Require
   * @generated
   */
  public Adapter createRequireAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Proposition
   * @generated
   */
  public Adapter createPropositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.NumberComparing <em>Number Comparing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.NumberComparing
   * @generated
   */
  public Adapter createNumberComparingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Comparator <em>Comparator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Comparator
   * @generated
   */
  public Adapter createComparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Sum <em>Sum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Sum
   * @generated
   */
  public Adapter createSumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Multiply
   * @generated
   */
  public Adapter createMultiplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.AtomicNumber <em>Atomic Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.AtomicNumber
   * @generated
   */
  public Adapter createAtomicNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.ActualNumbers <em>Actual Numbers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.ActualNumbers
   * @generated
   */
  public Adapter createActualNumbersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.NameAttribute <em>Name Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.NameAttribute
   * @generated
   */
  public Adapter createNameAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.IntNum <em>Int Num</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.IntNum
   * @generated
   */
  public Adapter createIntNumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.FloatNum <em>Float Num</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.FloatNum
   * @generated
   */
  public Adapter createFloatNumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Or
   * @generated
   */
  public Adapter createOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.And
   * @generated
   */
  public Adapter createAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Smaller <em>Smaller</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Smaller
   * @generated
   */
  public Adapter createSmallerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.SmallerEq <em>Smaller Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.SmallerEq
   * @generated
   */
  public Adapter createSmallerEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Eq <em>Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Eq
   * @generated
   */
  public Adapter createEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.BiggerEq <em>Bigger Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.BiggerEq
   * @generated
   */
  public Adapter createBiggerEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Bigger <em>Bigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Bigger
   * @generated
   */
  public Adapter createBiggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.NEq <em>NEq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.NEq
   * @generated
   */
  public Adapter createNEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Add <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Add
   * @generated
   */
  public Adapter createAddAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Sub <em>Sub</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Sub
   * @generated
   */
  public Adapter createSubAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Mult <em>Mult</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Mult
   * @generated
   */
  public Adapter createMultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link smitey.rpgindividual.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see smitey.rpgindividual.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RpgindividualAdapterFactory
