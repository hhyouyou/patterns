package com.example.patterns.factory;

/**
 * 工厂方法模式
 * 定义一个创建对象的接口,让子类来决定实例化哪个类,
 * 工厂方法是一个类的实例化延迟到其子类
 *
 * @author dong jing xi
 * @date 2020/3/5 21:14
 **/
public class Test {

    public static void main(String[] args) throws Exception {
        ReaderFactory readerFactory = new GifReaderFactory();
        Reader reader = readerFactory.getReader();
        reader.reader();

        AllReaderFactory allReaderFactory = new AllReaderFactory();
        Reader reader1 = allReaderFactory.getReader(GifReader.class);
        reader1.reader();

        Reader reader2 = allReaderFactory.getReader(JpgReader.class);
        reader2.reader();

    }
}
