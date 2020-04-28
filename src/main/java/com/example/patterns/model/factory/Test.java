package com.example.patterns.model.factory;

/**
 * @author dong jing xi
 * @date 2020/3/5 21:14
 **/
public class Test {

    public static void main(String[] args) {
        ReaderFactory readerFactory = new GifReaderFactory();
        Reader reader = readerFactory.getReader();
        reader.reader();
    }
}
