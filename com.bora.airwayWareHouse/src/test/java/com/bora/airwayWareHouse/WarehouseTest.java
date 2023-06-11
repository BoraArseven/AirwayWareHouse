package com.bora.airwayWareHouse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.hibernate.Session;
import org.hibernate.Transaction;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
/**
 * Unit test for simple App.
 */
public class WarehouseTest 
{
	Warehouse warehouse ;
    /**
     * Rigorous Test :-)
     */
	@Before
	public void setup() {
		warehouse = new Warehouse();
	}
	
  
}
