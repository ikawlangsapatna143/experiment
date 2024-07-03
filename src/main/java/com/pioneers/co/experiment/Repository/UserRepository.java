package com.pioneers.co.experiment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.co.experiment.Model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
