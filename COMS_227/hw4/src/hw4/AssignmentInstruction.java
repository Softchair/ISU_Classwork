package hw4;

import api.DefaultNode;
import api.Expression;
import api.Instruction;
import api.Scope;
import parser.ProgramNode;

/**
 * Implementation of Instruction that represents an assignment to a 
 * variable in the current scope.  Execution of an assignment instruction
 * causes the scope to be updated with the new value of the variable.
 * If the variable name is not already in the scope, it is added.
 * <ul>
 *   <li>There are two children; the first is the identifier, and the second 
 *   is the expression.
 *   <li>The getLabel() method returns the string "Assign".
 *   <li>The getText() method returns the getText() string of the identifier
 * </ul>
 */
public class AssignmentInstruction extends Expressions implements Instruction
{
  private Identifier variable;
  
  /**
   * Constructs an assignment instruction representing v = e.
   * @param v
   *   the identifier
   * @param e
   *   the expression to be assigned
   */
  public AssignmentInstruction(Identifier v, Expression e) {
	  super(e);
	  variable = v;
  }

  @Override
  public String getLabel() {
	  return "Assign";
  }

  @Override
  public String getText()
  {
    return variable.getText();
  }

  @Override
  public ProgramNode getChild(int i) {
    if (i == 0) {
      return variable;
    } else if (i == 1) {
      return getExpr();
    } else {
      return new DefaultNode("Invalid index " + i + " for type " + this.getClass().getName());      
    }
  }

  @Override
  public void execute(Scope env)
  {
    String name = variable.getText();
    int value = getExpr().eval(env);
    
    // update the scope with the new value
    env.put(name, value);
  }
}
