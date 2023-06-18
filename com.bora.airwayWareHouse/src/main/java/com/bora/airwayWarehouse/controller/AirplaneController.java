package com.bora.airwayWarehouse.controller;

import com.bora.airwayWareHouse.model.Airplane;
import com.bora.airwayWareHouse.repository.AirplaneRepository;
import com.bora.airwayWareHouse.view.AirplaneView;

public class AirplaneController {

	private AirplaneView airplaneView;
	private AirplaneRepository airplaneRepository;

	public AirplaneController(AirplaneView airplaneView, AirplaneRepository airplaneRepository) {
		this.airplaneView = airplaneView;
		this.airplaneRepository = airplaneRepository;
	}

	public void allAirplanes() {

		// we send airplaneview to all airplanes, which is found by
		// airplaneRepository.findAll()

		airplaneView.showAllAirplanes(airplaneRepository.findAll());
	}

	public void newAirplane(Airplane airplane) {
		// this is different from the book, we won't check manually since hibernate
		// maintains the adding.
		// normally I would like to prefer test with mockings, but testing original
		// hibernate functions are meaningless as I understood.
		airplaneRepository.save(airplane);
		airplaneView.airplaneAdded(airplane);
	}

	public void deleteAirplane(Airplane airplane) {

		airplaneRepository.delete(airplane);
		// I am not sure if we are going to have a problem if we call this function even
		// though delete is not correct. In worst case, this will mean that we refresh
		// our UI
		airplaneView.airplaneRemoved(airplane);
	}

}
