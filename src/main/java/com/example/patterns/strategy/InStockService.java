package com.example.patterns.strategy;

/**
 * @author dong jing xi
 * @date 2021/5/25 20:11
 **/
public class InStockService {


    public static void main(String[] args) {
        // 选取策略
        PurchaseInStock purchaseInStock = new PurchaseInStock();

        InStockOrder inStockOrder = new InStockOrder();
        inStockOrder.setInStockStrategy(purchaseInStock);

        // 入库
        inStockOrder.inStock();
    }

}
