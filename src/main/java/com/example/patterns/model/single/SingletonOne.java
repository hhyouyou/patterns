package com.example.patterns.model.single;

/**
 * @author dong jing xi
 * @date 2020/3/22 22:56
 **/
public class SingletonOne {

    private static SingletonOne instance = new SingletonOne();

    private SingletonOne() {
    }

    public static SingletonOne getInstance(String name) {
        return instance;
    }

    public String show() {
        return "hashcode: " + instance.hashCode();
    }

}
