package com.app.model;

import com.app.model.response.OperationResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SessionResponse extends OperationResponse {
    @ApiModelProperty(required = true, value = "")
    private SessionItem item;
}
