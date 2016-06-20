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
//import contract.IView;

public class ViewTest {
	private static View testView;
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

	@Before
	public void setUp() throws Exception {
	}

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
