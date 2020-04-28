package com.example.patterns.model.Interpreter;

/**
 * @author dong jing xi
 * @date 2020/3/24 22:54
 **/
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return ("*".equals(symbol) || "+".equals(symbol));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if ("+".equals(symbol)) {  // 加法
            return new AddInterpreter(firstExpression, secondExpression);
        } else if ("*".equals(symbol)) {    // 乘法
            return new MultiInterpreter(firstExpression, secondExpression);
        } else {
            throw new RuntimeException("不支持的操作符：" + symbol);
        }
    }
}
