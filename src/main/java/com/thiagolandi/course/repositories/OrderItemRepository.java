package com.thiagolandi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagolandi.course.entities.OrderItem;
import com.thiagolandi.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
