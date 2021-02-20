package com.app.model;

import com.app.entity.User;
import com.app.model.response.OperationResponse;
import lombok.Data;

@Data
public class UserResponse extends OperationResponse {
    private User data = new User();
}
