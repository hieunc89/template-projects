package com.app.model.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SingleSeries {
    private String name;
    private BigDecimal value;

    public SingleSeries( String name, BigDecimal value){
        this.name  = name;
        this.value = value;
    }
}
