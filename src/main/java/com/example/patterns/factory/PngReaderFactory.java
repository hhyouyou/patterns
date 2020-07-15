package com.example.patterns.factory;

/**
 * @author dong jing xi
 * @date 2020/3/5 21:13
 **/
public class PngReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
