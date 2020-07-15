package com.example.patterns.Interpreter;

/**
 * @author dong jing xi
 * @date 2020/3/24 22:51
 **/
public class MultiInterpreter implements Interpreter {
    private Interpreter firstInterpreter;
    private Interpreter secondInterpreter;

    public MultiInterpreter(Interpreter firstInterpreter, Interpreter secondInterpreter) {
        this.firstInterpreter = firstInterpreter;
        this.secondInterpreter = secondInterpreter;
    }

    @Override
    public String toString() {
        return "*";
    }

    @Override
    public int interpreter() {
        return this.firstInterpreter.interpreter() * secondInterpreter.interpreter();
    }
}
