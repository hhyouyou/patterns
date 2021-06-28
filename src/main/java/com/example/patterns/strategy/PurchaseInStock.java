package com.example.patterns.strategy;

import org.springframework.stereotype.Component;

/**
 * 采购入库
 *
 * @author dong jing xi
 * @date 2021/5/25 20:05
 **/
@Component
public class PurchaseInStock implements InStockStrategy {

    @Override
    public void inStock(String inStockNumber, Integer quantity) {
        System.out.println(this.getClass().getName());
    }
}
