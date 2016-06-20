package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
	private Model testModel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		this.testModel = new Model();
	}

	/*@Test
	public void testGetLorannWorldEntity() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGetObservable() {
		assertNotNull(this.testModel.getObservable());
	}

}
