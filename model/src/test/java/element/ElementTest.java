package element;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import motionless.Rock;

public class ElementTest {
	private static Rock testRock;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testRock = new Rock();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetSprite() {
		
	}

	@Test
	public void testSetSprite() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPermeability() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPermeability() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetLorannWorldEntity() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLorannWorldEntity() {
		fail("Not yet implemented");
	}

}
