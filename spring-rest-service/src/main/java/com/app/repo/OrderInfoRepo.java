package com.app.repo;

import com.app.entity.OrderInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderInfoRepo extends JpaRepository<OrderInfo, Long> {
    public Page<OrderInfo> findAll(Pageable p);

}

