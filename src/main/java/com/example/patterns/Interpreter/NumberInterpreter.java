package com.example.patterns.Interpreter;

/**
 * @author dong jing xi
 * @date 2020/3/24 20:10
 **/
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return 0;
    }
}
