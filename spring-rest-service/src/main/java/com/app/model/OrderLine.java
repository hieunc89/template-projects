package com.app.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderLine {
    private int        productId;
    private String     productCode;
    private String     productName;
    private String     category;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    private BigDecimal discount;
    private Date dateAllocated;
    @ApiModelProperty(allowableValues = "On Order, Allocated, No Stock")
    private String orderItemStatus;


    public OrderLine(int productId, String productCode, String productName, String category, BigDecimal quantity, BigDecimal unitPrice, BigDecimal discount, Date dateAllocated, String orderItemStatus){
        this.productId    = productId;
        this.productCode  = productCode;
        this.productName  = productName;
        this.category     = category;
        this.quantity     = quantity;
        this.unitPrice    = unitPrice;
        this.discount     = discount;
        this.dateAllocated= dateAllocated;
        this.orderItemStatus=orderItemStatus;
    }
}
