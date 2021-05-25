package com.example.patterns.proxy;

/**
 * @author dong jing xi
 * @date 2020/7/15 17:37
 **/
public interface Transactional {

    void open();

    void commit();

    void rollback();

}
