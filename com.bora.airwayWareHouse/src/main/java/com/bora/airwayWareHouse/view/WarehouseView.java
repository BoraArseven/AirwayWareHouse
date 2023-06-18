package com.bora.airwayWareHouse.view;

import java.util.List;

import com.bora.airwayWareHouse.model.Airplane;
import com.bora.airwayWareHouse.model.Warehouse;

public interface WarehouseView {
	void showAllStudents(List<Warehouse> warehouses);

	void showError(String message, Warehouse warehouse);

	void warehouseAdded(Warehouse warehouse);

	void warehouseRemoved(Warehouse warehouse);

	void airplaneRemovedFromWarehouse(Warehouse warehouse, Airplane airplane);

	void airplaneAddedToWarehouse(Warehouse warehouse, Airplane airplane);
}
