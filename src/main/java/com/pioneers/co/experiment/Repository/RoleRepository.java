package com.pioneers.co.experiment.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pioneers.co.experiment.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);

}
