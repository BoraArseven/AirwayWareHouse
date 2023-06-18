package com.bora.airwayWareHouse.repository;

import java.util.List;

import com.bora.airwayWareHouse.model.Airplane;

public interface AirplaneRepository {
	public List<Airplane> findAll();

	public Airplane findbyId(String id);

	public void save(Airplane airplane);

	public void delete(Airplane airplane);
}
