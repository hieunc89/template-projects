package com.app.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class SingleDataSeriesResponse extends OperationResponse{
    private List<SingleSeries> items;
}
