package com.example.patterns.strategy;

/**
 * 退货入库
 *
 * @author dong jing xi
 * @date 2021/5/25 20:13
 **/
public class ReturnInStock implements InStockStrategy {

    @Override
    public void inStock(String inStockNumber, Integer quantity) {
        System.out.println(this.getClass().getName());
    }
}
