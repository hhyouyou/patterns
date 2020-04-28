package com.example.patterns.service;

import com.example.patterns.model.*;
import org.apache.commons.collections.ListUtils;

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
