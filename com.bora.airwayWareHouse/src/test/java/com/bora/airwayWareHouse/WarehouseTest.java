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

	@Mock
	private List<Airplane> airplanesMock;

	@InjectMocks
	private Warehouse warehouse;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void addAirplane_ShouldAddAirplaneToList() {
		Airplane airplane = new Airplane();
		warehouse.addAirplane(airplane);

		verify(airplanesMock).add(airplane);
		assertThat(warehouse.getAirplanes()).contains(airplane);
	}

	@Test
	public void removeAirplane_ShouldRemoveAirplaneFromList() {
		Airplane airplane = new Airplane();
		airplane.setId(1);
		ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
		airplanes.add(airplane);
		warehouse.setAirplanes(airplanes);

		warehouse.removeAirplane(airplane);

		verify(airplanesMock).removeIf(any());
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
