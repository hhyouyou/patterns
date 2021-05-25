package com.example.patterns.proxy;

/**
 * @author dong jing xi
 * @date 2020/7/15 17:38
 **/
public class UserRepository implements Transactional {


    @Override
    public void open() {
        System.out.println("UserRepository.open");
    }

    @Override
    public void commit() {
        System.out.println("UserRepository.commit");

    }

    @Override
    public void rollback() {
        System.out.println("UserRepository.rollback");

    }
}
