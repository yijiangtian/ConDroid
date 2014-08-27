package acteve.symbolic.string;

import acteve.symbolic.integer.BinaryOperator;
import acteve.symbolic.integer.Expression;

public class BinaryStringExpression extends StringExpression implements String
{
    Expression left;
    BinaryOperator   op;
    Expression right;
    
    public BinaryStringExpression (BinaryOperator o, Expression l, Expression r) 
    {
		this.left = l;
		this.op = o;
		this.right = r;
    }
    
    public java.lang.String toString () 
    {
		return "(" + left.toString() + " " + op.toString() + right.toString() + ")"; // + "[" + seed + "]";
    }
    
    public java.lang.String toYicesString()
    {
    	System.err.println("toYicesString in BinaryStringExpr " + op.toYicesString() + " " + left.toString() + " " + right.toString());
    	return "!!";
//		return super.toYicesString(op.toYicesString(left.exprString(), right.exprString())); // +"[" + seed + "]";
    }

	@Override
	public Expression _contains(Expression e) {

		return this;
	}

	@Override
	public Expression _ne(Expression other) {
		// TODO Auto-generated method stub
		return this;
	}
    
}