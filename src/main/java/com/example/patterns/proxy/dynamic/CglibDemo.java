package com.example.patterns.proxy.dynamic;

import com.example.patterns.proxy.TransactionalImpl;
import com.example.patterns.proxy.staticproxy.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

import java.lang.annotation.Annotation;

/**
 * @author dong jing xi
 * @date 2021/6/6 17:48
 **/
public class CglibDemo {


    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        TransactionalImpl transactional = new TransactionalImpl();

        enhancer.setSuperclass(UserServiceImpl.class);

        MethodInterceptor methodInterceptor = (o, method, objects, methodProxy) -> {

            System.out.println("原方法名是 ： " + method.getName());
            System.out.println("原方法声明的类为 " + method.getDeclaringClass());

            // TODO如果注解中有 @Transactional 的就进行，干嘛干嘛。。。。。
            Annotation[] annotations = method.getAnnotations();

            transactional.open();

            Object o1 = methodProxy.invokeSuper(o, objects);

            transactional.commit();
            return o1;
        };

        enhancer.setCallback(methodInterceptor);
        UserServiceImpl userService = (UserServiceImpl) enhancer.create();
        userService.addUser();
        userService.updateUser("user1");
        userService.deleteUser("user1");
    }


}
