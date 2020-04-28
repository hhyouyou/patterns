package com.example.patterns.model.Interpreter;

/**
 * @author dong jing xi
 * @date 2020/3/24 20:11
 **/
public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression;
    private Interpreter secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter() + this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
