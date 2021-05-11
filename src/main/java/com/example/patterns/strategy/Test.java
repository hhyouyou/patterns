package com.example.patterns.strategy;

/**
 * @author djx
 * @date 2021/5/11 下午2:51
 */
public class Test {

    public static void main(String[] args) {

        Context context = new Context();
        context.setStrategy(new StrategyA());
        context.doStrategy(1);

    }


}
