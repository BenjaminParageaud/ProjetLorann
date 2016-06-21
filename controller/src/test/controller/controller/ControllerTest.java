/*
 * 
 */
package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class ControllerTest.
 */
public class ControllerTest {
	
	/** The test model. */
	private static IModel 	testModel;
	
	/** The test view. */
	private static IView	testView;
	
	/** The test controller. */
	private static Controller testController;
		
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	testController = new Controller(testView, testModel);
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test control.
	 */
	@Test
	public void testControl() {
		assertNotNull(testController);
	}

	/**
	 * Test set model.
	 */
	@Test
	public void testSetModel() {
		testController.setModel(testModel);
		assertTrue(testController.getModel() == testModel);
	}
	
	/**
	 * Test get model.
	 */
	@Test
	public void testGetModel(){
		testController.setModel(testModel);
		assertTrue(testController.getModel() == testModel);
	}

	/*@Test
	public void testOrderPerform() {
			
	}*/

}