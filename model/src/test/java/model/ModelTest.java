package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelTest.
 */
public class ModelTest {
	
	/** The test model. */
	private Model testModel;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		this.testModel = new Model();
	}

	/*@Test
	public void testGetLorannWorldEntity() {
		fail("Not yet implemented");
	}*/

	/**
	 * Test get observable.
	 */
	@Test
	public void testGetObservable() {
		assertNotNull(this.testModel.getObservable());
	}

}
