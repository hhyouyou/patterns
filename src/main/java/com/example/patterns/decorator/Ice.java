package com.example.patterns.decorator;

/**
 * ice V2.0版本
 *
 * @author dong jing xi
 * @date 2020/3/1 21:14
 **/
public class Ice extends AbstractStuff {


    public Ice(Drink originalDrink) {
        super(originalDrink);
    }

    @Override
    String stuffName() {
        return "冰块";
    }


}
