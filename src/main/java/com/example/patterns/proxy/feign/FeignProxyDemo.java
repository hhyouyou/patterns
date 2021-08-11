package com.example.patterns.proxy.feign;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

interface ProductClient {

    void getProductList();

    void getProductInfo();

    void addProduct();

}


/**
 * @author djx
 * @date 2021/8/11 上午10:11
 */
public class FeignProxyDemo {

    public static void main(String[] args) {
        FeignClient<ProductClient> feignClient = new FeignClient<>();
        feignClient.setType(ProductClient.class);
        feignClient.setUrl("http://123.123.123.123");
        feignClient.setName("product-server");


    }


    public static <T> T newInstance(FeignClient<T> feignClient) {

        Map<Method, FeignMethodHandler> dispatch;


        InvocationHandler invocationHandler = getInvocationHandler();


        return (T) Proxy.newProxyInstance(ProductClient.class.getClassLoader(),
                new Class[]{ProductClient.class}, invocationHandler);

    }

    public static InvocationHandler getInvocationHandler() {
        FeignInvocationHandler feignInvocationHandler = new FeignInvocationHandler();

        return null;
    }

    interface FeignMethodHandler {
        Object invoke(Object[] args);
    }

    static class SynchronousMethodHandler implements FeignMethodHandler {




        @Override
        public Object invoke(Object[] args) {

            // 请求

            return null;
        }
    }

    @Data
    static class FeignInvocationHandler implements InvocationHandler {

        Map<Method, FeignMethodHandler> dispatch;


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 对equals hashcode toString等特殊处理

            FeignMethodHandler methodHandler = dispatch.get(method);

            return methodHandler.invoke(args);
        }
    }

    @Data
    static class FeignClient<T> {

        private Class<T> type;
        private String url;
        private String name;

        public FeignClient(Class<T> type, String url, String name) {
            this.type = type;
            this.url = url;
            this.name = name;
        }

        public FeignClient() {
        }
    }

}