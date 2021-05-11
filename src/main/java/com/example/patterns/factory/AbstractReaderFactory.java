package com.example.patterns.factory;

/**
 * @author djx
 * @date 2021/5/11 上午11:30
 */
public abstract class AbstractReaderFactory<T> {

    abstract Reader getReader(Class<T> c) throws Exception;

}
