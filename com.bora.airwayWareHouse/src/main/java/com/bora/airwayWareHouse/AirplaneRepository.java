package com.bora.airwayWareHouse;

import java.util.List;

public interface AirplaneRepository {
public List<Airplane> findAll();
public Airplane findbyId(String id);
public void save(Airplane airplane);
public void delete(String id);
}
