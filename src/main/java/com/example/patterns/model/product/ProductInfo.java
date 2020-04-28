package com.example.patterns.model.product;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:45
 **/
public abstract class ProductInfo {

    Long prodId;

    /**
     * 商品信息
     *
     * @return
     */
    abstract String productInfo();

    public ProductInfo(Long prodId) {
        this.prodId = prodId;
    }
}
