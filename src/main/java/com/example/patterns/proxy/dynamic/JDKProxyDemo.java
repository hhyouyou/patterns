package com.example.patterns.proxy.dynamic;


import com.example.patterns.proxy.TransactionalImpl;
import com.example.patterns.proxy.staticproxy.UserService;
import com.example.patterns.proxy.staticproxy.UserServiceImpl;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;

/**
 * @author dong jing xi
 * @date 2020/7/15 17:39
 **/
public class JDKProxyDemo {

    public static void main(String[] args) {

        TransactionalImpl transactional = new TransactionalImpl();

        UserServiceImpl userService = new UserServiceImpl();

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, (proxy, method, args1) -> {

            // 注解中有 @Transactional 的进行开启啥
            Annotation[] annotations = method.getAnnotations();

            transactional.open();
            Object result = method.invoke(userService, args1);
            transactional.commit();
            return result;
        });

        userServiceProxy.addUser();
        userServiceProxy.updateUser("user1");
        userServiceProxy.deleteUser("user1");
    }
}
