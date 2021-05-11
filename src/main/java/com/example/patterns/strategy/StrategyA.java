package com.example.patterns.strategy;

/**
 * @author djx
 * @date 2021/5/11 下午2:51
 */
public class StrategyA implements Strategy{
    @Override
    public void strategy(Object obj) {
        System.out.println(this.getClass().getName());
    }
}
