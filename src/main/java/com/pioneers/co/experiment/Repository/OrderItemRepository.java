package com.pioneers.co.experiment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.co.experiment.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
