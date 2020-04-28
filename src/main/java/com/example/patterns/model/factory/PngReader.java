package com.example.patterns.model.factory;

/**
 * @author dong jing xi
 * @date 2020/3/5 21:08
 **/
public class PngReader implements Reader {
    @Override
    public void reader() {
        System.out.println(this.getClass().getName());
    }
}
