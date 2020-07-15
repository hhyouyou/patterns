package com.example.patterns.factory;

/**
 * @author dong jing xi
 * @date 2020/3/5 21:08
 **/
public class GifReader implements Reader {
    @Override
    public void reader() {
        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
    }
}
