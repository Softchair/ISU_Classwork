package hw4;

import api.Expression;
import api.Scope;

/**
 * Node type representing an arithmetic expression 
 * with a subtraction operator.
 * <ul>
 *   <li>There are two children; the first is the left operand, and the second 
 *   is the right operand.
 *   <li>The getLabel() method returns the string "-".
 *   <li>The getText() method returns an empty string.
 * </ul>
 */
public class AopSubtract extends Equations implements Expression 
{
  /**
   * Constructs an expression with the given left and right sides.
   * @param lhs
   *   expression for the left-hand-side operand
   * @param rhs
   *   expression for the left-hand-side operand
   */
  public AopSubtract(Expression lhs, Expression rhs) {
	  super(lhs, rhs);
  }
  
  @Override
  public String getLabel() {
	  return "-";
  }

  @Override
  public int eval(Scope env) {
	  return super.getLhs(env) - super.getRhs(env);
  }
  
}
