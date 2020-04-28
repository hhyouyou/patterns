package com.example.patterns.model;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:20
 **/
public class Honey extends AbstractStuff {

    public Honey(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "蜂蜜";
    }
}
