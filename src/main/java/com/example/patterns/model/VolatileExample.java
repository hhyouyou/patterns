package com.example.patterns.model;


import java.util.concurrent.TimeUnit;

/**
 * @author dong jing xi
 * @date 2020/3/24 10:09
 **/
public class VolatileExample {

    private static boolean flag = false;
    private static int i = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                flag = true;
                System.out.println("flag 被修改成 true");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        while (!flag) {
            i++;
            // System.out.println("i:"+i);
            //System.out.println("flag 标识"+ flag);
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序结束,i=" + i);
    }


}
