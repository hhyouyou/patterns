package com.example.patterns.model;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:10
 **/
public abstract class AbstractStuff implements Drink {


    /**
     * 配料
     *
     * @return
     */
    abstract String stuffName();

    private Drink originalDrink;

    public AbstractStuff(Drink originalDrink) {
        this.originalDrink = originalDrink;
    }

    @Override
    public String make() {
        return originalDrink.make() + ", 加一份" + stuffName();
    }
}
