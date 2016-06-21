/*
 * 
 */
package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.util.Observable;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.ILorannWorldEntity;
import contract.IModel;
// TODO: Auto-generated Javadoc
//import contract.IView;

/**
 * The Class ViewTest.
 */
public class ViewTest {
	
	/** The test view. */
	private static View testView;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	//private static IModel testModel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testView = new View(new IModel(){

			public ILorannWorldEntity getLorannWorldEntity() {
				// TODO Auto-generated method stub
				return null;
			}

			public Observable getObservable() {
				// TODO Auto-generated method stub	
				return null;
			}
			
		});
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
	 * Test key code to controller order.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testKeyCodeToControllerOrder() {
		int key = KeyEvent.VK_NUMPAD4;
		assertEquals(ControllerOrder.Left,this.testView.keyCodeToControllerOrder(key));
	
	}

	/*@Test
	public void testRun() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetController() {
		fail("Not yet implemented");
	}*/

}
