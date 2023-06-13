package com.bora.airwayWareHouse.repository;

import java.util.List;

import com.bora.airwayWareHouse.model.Airplane;
import com.bora.airwayWareHouse.model.Warehouse;

public interface WarehouseRepository {
	public List<Warehouse> findAll();

	public Warehouse findbyId(String id);

	public void save(Warehouse warehouse);

	public void delete(int id);

	public void removeairplane(Airplane airplane);

	public void addairplane(Airplane airplane);
}
