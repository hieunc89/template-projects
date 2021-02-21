package com.app.repo;

import com.app.entity.OrderItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderItemRepo extends JpaRepository<OrderItem, Long> {
    public Page<OrderItem> findAll(Pageable p);
}

