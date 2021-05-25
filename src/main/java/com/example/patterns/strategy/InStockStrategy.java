package com.example.patterns.strategy;

/**
 * @author dong jing xi
 * @date 2021/5/25 20:05
 **/
public interface InStockStrategy {

    /**
     *  入库
     * @param inStockNumber 入库单号
     * @param quantity 数量
     */
    void inStock(String inStockNumber, Integer quantity);

}
