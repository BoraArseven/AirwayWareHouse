package com.bora.airwayWareHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Warehouse warehouse ;
    /**
     * Rigorous Test :-)
     */
	@Before
	public void setup() {
		warehouse = new Warehouse();
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	Assert.assertEquals(true,warehouse.ShouldGiveTrue());
    }
}
