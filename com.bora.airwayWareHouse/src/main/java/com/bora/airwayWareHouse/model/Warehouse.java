package com.bora.airwayWareHouse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "warehouses")
public class Warehouse {
	// Remember to add an empty constructor after created another constructor which
	// disables the hidden empty constructor.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", nullable = false, unique = true)
	private String name;

	@Column(name = "location", nullable = false)
	private String location;

	@OneToMany(mappedBy = "warehouse")
	private List<Airplane> airplanes;

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(List<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	// This is the first method that is written by me. Others were created by
	// eclipse.
	public void addAirplane(Airplane airplane) {
		this.airplanes.add(airplane);
	}

	// This is the second method that is written by me. Others were created by
	// eclipse.
	public void removeAirplane(Airplane airplanetoremove) {
		this.airplanes.removeIf(airplane -> airplane.getId() == airplanetoremove.getId());

	}

}