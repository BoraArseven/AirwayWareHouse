package com.bora.airwayWareHouse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bora.airwayWareHouse.model.Airplane;
import com.bora.airwayWareHouse.model.Warehouse;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//testing the ability to remove and add airplanes to its Airplane list. 
//So that after successful modification we can save our new object to the database.
public class WarehouseTest {




	// This test class is not necessary, I created it to experiment and have an understanding of this pattern.
	// As you can see, I even tested getters and setters which is simply waste of time.
	private Warehouse warehouse;

	@Before
	public void setUp() {
	  MockitoAnnotations.initMocks(this);
	  warehouse = new Warehouse(); // create a new Warehouse object
	 
	}


	@Test
	public void addAirplane_ShouldAddAirplaneToList() {
		 List<Airplane> airplanesList = new ArrayList<Airplane>();
		 warehouse.setAirplanes(airplanesList);
		Airplane airplane = new Airplane();
		
		warehouse.addAirplane(airplane);
		airplanesList.add(airplane);
	
		assertThat(warehouse.getAirplanes()).containsExactlyElementsOf(airplanesList);
	}

	@Test
	public void removeAirplane_ShouldRemoveAirplaneFromList() {
		 List<Airplane> airplanesMock = new ArrayList<Airplane>();
		Airplane airplane = new Airplane();
		airplane.setId(1);
		ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
		airplanes.add(airplane);
		warehouse.setAirplanes(airplanes);

		warehouse.removeAirplane(airplane);

		assertThat(warehouse.getAirplanes()).isEmpty();
	}

	@Test
	public void setAirplanes_ShouldSetAirplanesList() {
		List<Airplane> airplanes = new ArrayList<>();
		airplanes.add(new Airplane());
		airplanes.add(new Airplane());

		warehouse.setAirplanes(airplanes);

		assertThat(warehouse.getAirplanes()).containsExactlyElementsOf(airplanes);
	}
}
