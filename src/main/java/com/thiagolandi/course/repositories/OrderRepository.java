package com.thiagolandi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagolandi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
