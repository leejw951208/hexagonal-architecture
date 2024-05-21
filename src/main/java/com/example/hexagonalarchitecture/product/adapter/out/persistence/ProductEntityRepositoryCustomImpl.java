package com.example.hexagonalarchitecture.product.adapter.out.persistence;

import com.example.hexagonalarchitecture.order.adapter.out.persistence.orderProduct.QOrderProductEntity;
import com.example.hexagonalarchitecture.product.domain.Product;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.example.hexagonalarchitecture.order.adapter.out.persistence.orderProduct.QOrderProductEntity.orderProductEntity;
import static com.example.hexagonalarchitecture.product.adapter.out.persistence.QProductEntity.productEntity;

@Repository
@RequiredArgsConstructor
public class ProductEntityRepositoryCustomImpl implements ProductEntityRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return Optional.ofNullable(
                queryFactory
                        .selectFrom(productEntity)
                        .where(productEntity.id.eq(id))
                        .fetchOne()
        );
    }
}
