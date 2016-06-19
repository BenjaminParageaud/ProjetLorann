package motionless;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotionLessTest {
	private static MotionLess testMotionLess;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testMotionLess = new Rock();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetBddId() {
		assertEquals(2,testMotionLess.getBddId());
	}

}
