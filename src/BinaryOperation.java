import Expression.*;

public abstract class BinaryOperation implements Expression
{
    private Expression leftExp;
    private Expression rightExp;
    private char operator;

    public BinaryOperation(Expression l, Expression r, char op)
    {
        leftExp = l;
        rightExp = r;

        operator = op;
    }

    public double calculate()
    {
        switch(operator)
        {
            case '+':
                return leftExp.calculate() + rightExp.calculate();
            case '-':
                return leftExp.calculate() - rightExp.calculate();
            case '*':
                return leftExp.calculate() * rightExp.calculate();
            case '/':
                return leftExp.calculate() / rightExp.calculate();
        }
        //TODO: provide actual error handling
        return -2;
    }

    public boolean isTree()
    {
        return true;
    }
}
