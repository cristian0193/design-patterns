package patternsjava.behavioral.interpreter;

import patternsjava.behavioral.interpreter.expressions.And;
import patternsjava.behavioral.interpreter.expressions.Or;

public class RunMethod {

    public static void runExpressions(){
        Expression zero = new Terminal("0");
        Expression one = new Terminal("1");

        Expression orBoolean = new Or(zero, one);
        Expression andBoolean = new And(zero, one);

        System.out.println(orBoolean.interpret("zero"));
        System.out.println(orBoolean.interpret("0"));

        System.out.println(andBoolean.interpret("0"));
        System.out.println(andBoolean.interpret("0, 1"));
    }

}
