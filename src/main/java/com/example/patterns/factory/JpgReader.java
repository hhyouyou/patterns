package com.example.patterns.factory;

/**
 * @author dong jing xi
 * @date 2020/3/5 21:01
 **/
public class JpgReader implements Reader {

    @Override
    public void reader() {
        System.out.println(this.getClass().getName());
    }

}
