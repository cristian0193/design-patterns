package patternsjava.behavioral.interpreter.expressions;

import patternsjava.behavioral.interpreter.Expression;

public class And implements Expression {

    private Expression expression1;
    private Expression expression2;

    public And(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String text) {
        return expression1.interpret(text) && expression2.interpret(text);
    }
}
