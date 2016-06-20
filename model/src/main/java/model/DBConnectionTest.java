package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DBConnectionTest.
 */
public class DBConnectionTest {
	
	/** The test DB connection. */
	private static DBConnection testDBConnection;
	
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
	}

	/**
	 * Test get instance.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetInstance() {
		assertNotNull(testDBConnection.getInstance());
	}

}
