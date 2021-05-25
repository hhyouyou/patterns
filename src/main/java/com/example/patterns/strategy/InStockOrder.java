package com.example.patterns.strategy;

import java.util.Objects;

/**
 * @author dong jing xi
 * @date 2021/5/25 20:08
 **/
public class InStockOrder {

    private String stockNumber;
    private Integer number;

    private InStockStrategy inStockStrategy;

    public void inStock() {
        if (Objects.nonNull(inStockStrategy)) {
            inStockStrategy.inStock(stockNumber, number);
        }
    }


    public void setInStockStrategy(InStockStrategy inStockStrategy) {
        this.inStockStrategy = inStockStrategy;
    }
}
