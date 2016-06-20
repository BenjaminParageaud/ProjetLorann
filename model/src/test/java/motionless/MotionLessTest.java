package motionless;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionLessTest.
 */
public class MotionLessTest {
	
	/** The test motion less. */
	private static MotionLess testMotionLess;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testMotionLess = new Rock();
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
	 * Test get bdd id.
	 */
	@Test
	public void testGetBddId() {
		assertEquals(2,testMotionLess.getBddId());
	}

}
