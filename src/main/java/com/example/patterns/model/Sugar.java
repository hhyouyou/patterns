package com.example.patterns.model;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:16
 **/
public class Sugar extends AbstractStuff {

    public Sugar(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "糖";
    }
}
