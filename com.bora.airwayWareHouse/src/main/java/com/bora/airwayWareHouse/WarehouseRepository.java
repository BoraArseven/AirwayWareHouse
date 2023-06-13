package com.bora.airwayWareHouse;

import java.util.List;

public interface WarehouseRepository {
	public List<Warehouse> findAll();
	public Warehouse findbyId(String id);
	public void save(Warehouse warehouse);
	public void delete(String id);
	public void removeairplane(Airplane airplane);
	public void addairplane(Airplane airplane);
}
