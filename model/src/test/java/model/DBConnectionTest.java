package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DBConnectionTest {
	private static DBConnection testDBConnection;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	/*@Test
	public void testGetInstance() {
	}*/

	@SuppressWarnings("static-access")
	@Test
	public void testGetConnection() {
		assertNotNull(testDBConnection.getInstance());
	}

}
