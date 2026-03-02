package com.example.orderservice.infrastructure.order.entity;


import com.example.orderservice.infrastructure.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "orders")
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderJpaEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Integer quantity;

    private Long productId;

    public OrderJpaEntity(Integer quantity ,Long productId){
        this.quantity = quantity;
        this.productId = productId;
    }
}
