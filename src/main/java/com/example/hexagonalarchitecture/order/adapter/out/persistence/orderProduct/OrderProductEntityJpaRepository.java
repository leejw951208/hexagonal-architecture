package com.example.hexagonalarchitecture.order.adapter.out.persistence.orderProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductEntityJpaRepository extends JpaRepository<OrderProductEntity, Long> {
}
