package mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class MobileTest.
 */
public class MobileTest {
	
	/** The lorann test. */
	private static Hero lorannTest;
	
	/** The bdd id of lorann test. */
	private static int bddIdOfLorannTest = 1;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lorannTest = new Hero(null);
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
		assertEquals(bddIdOfLorannTest, MobileTest.lorannTest.getBddId());
	}

}
