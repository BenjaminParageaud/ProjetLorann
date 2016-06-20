package controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
import contract.IView;

public class ControllerTest {
	private static IModel 	testModel;
	private static IView	testView;
	private static Controller testController;
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	testController = new Controller(testView, testModel);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testControl() {
		assertNotNull(testController);
	}

	@Test
	public void testSetModel() {
		testController.setModel(testModel);
		assertTrue(testController.getModel() == testModel);
	}
	
	@Test
	public void testGetModel(){
		testController.setModel(testModel);
		assertTrue(testController.getModel() == testModel);
	}

	/*@Test
	public void testOrderPerform() {
			
	}*/

}
