/*
 * 
 */
package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import contract.IController;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewFrameTest.
 */
public class ViewFrameTest {
	
	/** The test frame. */
	//private View testView;
	private static ViewFrame testFrame;
	
	/** The e. */
	private static KeyEvent e;
	
	/** The key. */
	private static int key;
	
	/** The model. */
	private static IModel model;
	//private IController testController;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	testFrame = new ViewFrame(model);
	e = new KeyEvent(testFrame,KeyEvent.KEY_PRESSED,System.currentTimeMillis(),0,KeyEvent.VK_E,'e');
	key = KeyEvent.VK_E;
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
	 * Test get model.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetModel() {
		assertNotNull(this.testFrame.getModel());
}

	/**
	 * Test key typed.
	 */
	@Test
	public void testKeyTyped() {
		testFrame.keyTyped(e);
		assertEquals(key, e.getKeyCode());
	}

	/**
	 * Test key pressed.
	 */
	@Test
	public void testKeyPressed() {
		//testFrame.keyPressed(e);
		assertEquals(key, e.getKeyCode());	
	}

	/**
	 * Test key released.
	 */
	@Test
	public void testKeyReleased() {
		testFrame.keyReleased(e);
		assertEquals(key, e.getKeyCode());
	}

}
