package com.example.patterns.model.product;

/**
 * @author dong jing xi
 * @date 2020/3/1 21:44
 **/
public class SupplierInfo extends AbstractOtherInfo {

    private Long supplierId;
    private String supplierName;
    private String supplierPhone;


    public SupplierInfo(ProductInfo originalProduct) {
        super(originalProduct);
    }

    @Override
    String otherInfo() {
        return "supplierId :" + supplierId + "; supplierName :" +  supplierName + "; supplierPhone :" +  supplierPhone;
    }
}
