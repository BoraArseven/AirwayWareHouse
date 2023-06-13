package com.bora.airwayWareHouse.view;

import java.util.List;

import com.bora.airwayWareHouse.model.Airplane;

public interface AirplaneView {
	void showAllAirplanes(List<Airplane> airplanes);

	void showError(String message, Airplane airplane);

	void airplaneAdded(Airplane airplane);

	void airplaneRemoved(Airplane student);
}
