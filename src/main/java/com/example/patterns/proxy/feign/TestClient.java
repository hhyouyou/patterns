package com.example.patterns.proxy.feign;

import java.io.IOException;

/**
 * @author djx
 * @date 2021/8/11 下午5:05
 */
public class TestClient {

    public static void main(String[] args) {
        Client.Default aDefault = new Client.Default();
        try {
            Object hhhh = aDefault.execute("hhhh", "");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
