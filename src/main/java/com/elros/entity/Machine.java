package com.elros.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String code;

	private String model;

	private String cell;

	private String manufacturer;

	private double costCenter;

	public Machine() {

	}

	public Machine(Long id, String code, String model, String cell, String manufacturer, double costCenter) {
		super();
		this.id = id;
		this.code = code;
		this.model = model;
		this.cell = cell;
		this.manufacturer = manufacturer;
		this.costCenter = costCenter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(double costCenter) {
		this.costCenter = costCenter;
	}

}
