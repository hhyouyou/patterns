package com.example.patterns.model;

/**
 * ice V1.0 版本
 *
 * @author dong jing xi
 * @date 2020/3/1 21:04
 **/
public class Ice1 implements Drink {

    private Drink originalDrink;

    @Override
    public String make() {
        return originalDrink.make() + ", 加一块冰";
    }

    public Ice1(Drink originalDrink) {
        this.originalDrink = originalDrink;
    }
}
