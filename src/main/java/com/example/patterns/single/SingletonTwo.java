package com.example.patterns.single;

/**
 * @author dong jing xi
 * @date 2020/3/22 22:56
 **/
public class SingletonTwo {
    private static SingletonTwo instance;

    private String name;

    private SingletonTwo(String name) {
        this.name = name;
    }


    public  synchronized static SingletonTwo getInstance(String name) throws InterruptedException {
        if (instance == null) {
            Thread.sleep(1);
            instance = new SingletonTwo(name);
        }
        return instance;
    }

    public String show() {
        return name + ",hashcode: " + instance.hashCode();
    }

}
