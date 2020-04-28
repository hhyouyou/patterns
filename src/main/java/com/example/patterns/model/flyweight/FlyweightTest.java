package com.example.patterns.model.flyweight;

/**
 * @author dong jing xi
 * @date 2020/3/24 19:33
 **/
public class FlyweightTest {


    /**
     * string中的享元模式
     *
     * @param args
     */

    public static void main(String[] args) {
        // testString();

        testInteger();

    }


    public static void testString() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//true
        System.out.println(s1 == s4);//false
        System.out.println(s1 == s9);//false
        System.out.println(s4 == s5);//false
        System.out.println(s1 == s6);//true
    }


    /**
     * 为什么第一个是true，第二个是false？
     * 反编译后可以发现 Integer b1 = 128; 实际变成了 Integer b1 = Integer.valueOf(128);，所以我们来看 Integer 中的 valueOf 方法的实现
     */

    /**
     * Integer中的享元模式 IntegerCache
     */
    public static void testInteger() {
        Integer i1 = 12;
        Integer i2 = 12;
        System.out.println(i1 == i2);

        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(b1 == b2);
    }

    /**
     * Long中的享元模式 LongCache
     */
    public static void testLong() {


    }


}
