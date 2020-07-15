package com.example.patterns.single;

/**
 * @author dong jing xi
 * @date 2020/3/22 22:56
 **/
public class SingletonFour {

    private static class SingletonHolder {
        private static final SingletonFour INSTANCE = new SingletonFour();
    }

    private SingletonFour() {
    }

    public static final SingletonFour getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
