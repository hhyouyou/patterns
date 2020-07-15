package com.example.patterns.decorator;

import com.example.patterns.decorator.*;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:08
 **/
public class Making {

    public static void main(String[] args) {
//        coke();
//        ice1Coke();
        iceCoke();
        iceSugarXDrink();
    }


    public static void coke() {

        Drink coke = new Coke();
        System.out.println(coke.make());
    }

    public static void ice1Coke() {

        Drink iceCoke = new Ice1(new Coke());
        System.out.println(iceCoke.make());
    }

    public static void iceCoke() {

        Drink iceCoke = new Ice(new Coke());
        System.out.println(iceCoke.make());
    }

    public static void iceSugarXDrink() {

        Drink iceSugarXDrink = new Ice(new Sugar(new XDrink()));
        System.out.println(iceSugarXDrink.make());

    }


}
