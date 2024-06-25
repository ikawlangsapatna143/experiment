package com.pioneers.co.experiment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.co.experiment.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
