package com.app.repo;

import com.app.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface ProductRepo extends JpaRepository<Product, Integer> {
    public Page<Product> findAll(Pageable p);
    Optional<Product> findOneById(Integer id);
}

