package com.example.patterns.factory;

/**
 * @author djx
 * @date 2021/5/11 上午11:31
 */
public class AllReaderFactory extends AbstractReaderFactory {

    @Override
    Reader getReader(Class c) throws Exception {
        return (Reader) Class.forName(c.getName()).newInstance();
    }
}
