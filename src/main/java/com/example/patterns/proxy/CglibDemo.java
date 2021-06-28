package com.example.patterns.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @author dong jing xi
 * @date 2021/6/6 17:48
 **/
public class CglibDemo {


    static class Database {
        public void update() {
            System.out.println(" update ");
        }
    }


    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(Database.class);

        MethodInterceptor methodInterceptor = (o, method, objects, methodProxy) -> {
            System.out.println("begin");

            System.out.println("原方法名是 ： " + method.getName());
            System.out.println("原方法声明的类为 " + method.getDeclaringClass());
            Object o1 = methodProxy.invokeSuper(o, objects);
            System.out.println("commit");
            return o1;
        };

        enhancer.setCallback(methodInterceptor);
        Database database = (Database) enhancer.create();
        database.update();


    }


}
