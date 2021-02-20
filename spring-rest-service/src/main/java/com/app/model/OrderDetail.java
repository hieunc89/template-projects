package com.app.model;

import com.app.entity.Order;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderDetail extends Order {
    private String customerName;
    private String customerEmail;
    private String customerCompany;
    private List<OrderLine> orderLine;

    public OrderDetail(){}

    public OrderDetail(
            Integer orderId,
            Date orderDate,
            String orderStatus,
            Date   shippedDate,
            String shipName,
            String shipAddress1,
            String shipAddress2 ,
            String shipCity,
            String shipState,
            String shipPostalCode,
            String shipCountry,
            BigDecimal shippingFee,
            Integer customerId,
            String customerName,
            String customerEmail,
            String customerCompany,
            String paymentType,
            Date paidDate,
            Integer employeeId
    ){
        super(orderId, employeeId, customerId, orderDate, orderStatus, shippedDate ,shipName, shipAddress1,shipAddress2, shipCity, shipState, shipPostalCode, shipCountry, shippingFee, paymentType, paidDate);
        this.customerName = customerName;
        this.customerEmail     = customerEmail;
        this.customerCompany   = customerCompany;
        this.orderLine         = new ArrayList<OrderLine>();
    }

    public void addOrderLine(int productId, String productCode, String productName, String category, BigDecimal quantity, BigDecimal unitPrice, BigDecimal discount, Date dateAllocated, String orderItemStatus){
        OrderLine line = new OrderLine(productId, productCode, productName, category, quantity, unitPrice, discount, dateAllocated, orderItemStatus);
        this.orderLine.add(line);
    }
}
