package com.elros.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elros.entity.Machine;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Long>{

}
