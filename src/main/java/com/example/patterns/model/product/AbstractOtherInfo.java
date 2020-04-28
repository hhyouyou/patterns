package com.example.patterns.model.product;

import java.math.BigDecimal;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:36
 **/
public abstract class AbstractOtherInfo {

    /**
     * 其他信息
     *
     * @return
     */
    abstract String otherInfo();


    private ProductInfo originalProduct;

    String productInfo() {
        return originalProduct.productInfo() + " //  " + otherInfo();
    }


    public AbstractOtherInfo(ProductInfo originalProduct) {
        this.originalProduct = originalProduct;
    }
}
