package com.example.patterns.single;

/**
 * @author dong jing xi
 * @date 2020/3/22 22:56
 **/
public class SingletonThree {

    // 使用volatile修饰变量，禁止读指令重排序到写指令之前
    // 1、分配内存 2、在内存中创建实例 3、把引用指向实例，即存放内存地址
    // 先执行1，3时，导致外边的instance判断不为空，但是实际还未创建实例，这时候会报错
    private static volatile SingletonThree instance;

    private SingletonThree() {
    }

    // synchronized 可以实现原子性、可见性、有序性。
    // 其中，实现原子性：一次只有一个线程执行同步块的代码。
    // 但计算机为了提升效率，会指令重排
    public static SingletonThree getInstance() {
        if (instance == null) {
            synchronized (SingletonThree.class) {
                if (instance == null) {
                    instance = new SingletonThree();
                }
            }
        }
        return instance;
    }

}
