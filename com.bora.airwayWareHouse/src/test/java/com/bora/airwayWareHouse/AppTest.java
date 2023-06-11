package com.bora.airwayWareHouse;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.bora.airwayWareHouse.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App app = new App();
    /**
     * Rigorous Test :-)
     */
	@Before
	public void setup() {
		app = new App();
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
