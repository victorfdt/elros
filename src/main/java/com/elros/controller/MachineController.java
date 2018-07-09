package com.elros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elros.entity.Machine;
import com.elros.service.MachineService;

@Controller
public class MachineController {

	@Autowired
	private MachineService machineService;

	/**
	 * Index page
	 * 
	 * @return
	 */
	@RequestMapping(value = "/machine")
	public String index(Model model) {
		model.addAttribute("machineList", machineService.findAll());
		return "machine/index";
	}

	/**
	 * Create and Update form
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@GetMapping(value = { "/machineForm", "/machineForm/{id}" })
	public String machineForm(Model model, @PathVariable(required = false, name = "id") Long id) {
		if (null != id) {
			model.addAttribute("machine", machineService.findOne(id));
		} else {
			model.addAttribute("machine", new Machine());
		}
		return "machine/form";
	}

	/**
	 * Creating a new Machine
	 * @param model
	 * @param machine
	 * @return
	 */
	@PostMapping(value = "/machineForm")
	public String notesEdit(Model model, Machine machine) {
		machineService.saveMachine(machine);
		model.addAttribute("machineList", machineService.findAll());
		return "machine/index";
	}
	
	@GetMapping(value="/machineDelete/{id}")
    public String machineDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
		machineService.deleteMachine(id);
		model.addAttribute("machineList", machineService.findAll());
		return "machine/index";
    }

}
