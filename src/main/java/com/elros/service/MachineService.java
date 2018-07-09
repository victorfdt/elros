package com.elros.service;

import java.util.List;

import com.elros.entity.Machine;

public interface MachineService {

	List<Machine> findAll();

	Machine findOne(Long id);

	Machine saveMachine(Machine Machine);

	void deleteMachine(Long id);

}
