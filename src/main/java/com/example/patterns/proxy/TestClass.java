package com.example.patterns.proxy;


import java.lang.reflect.Proxy;

/**
 * @author dong jing xi
 * @date 2020/7/15 17:39
 **/
public class TestClass {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        userRepository.open();
        userRepository.commit();

        Class<? extends Transactional> aClass = userRepository.getClass();
        Transactional transactional = (Transactional) Proxy.newProxyInstance(aClass.getClassLoader(), new Class[]{Transactional.class}, (proxy, method, args1) -> {
            System.out.println("1");
            Object result = method.invoke(userRepository, args1);
            System.out.println("2");
            return result;
        });

        transactional.open();
        transactional.commit();
    }
}
