package com.pioneers.co.experiment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.co.experiment.Model.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
