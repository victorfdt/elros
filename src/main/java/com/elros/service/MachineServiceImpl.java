package com.elros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elros.dao.MachineRepository;
import com.elros.entity.Machine;

@Service
public class MachineServiceImpl implements MachineService {

	@Autowired
	private MachineRepository machineRepository;

	@Override
	public List<Machine> findAll() {
		return machineRepository.findAll();
	}

	@Override
	public Machine findOne(Long id) {
		return machineRepository.getOne(id);
	}

	@Override
	public Machine saveMachine(Machine machine) {
		return machineRepository.save(machine);
	}

	@Override
	public void deleteMachine(Long id) {
		machineRepository.deleteById(id);
	}

}
