package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DBPropertiesTest.
 */
public class DBPropertiesTest {
	
	/** The test DB properties. */
	private static DBProperties testDBProperties;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testDBProperties = new DBProperties();
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
	 * Test get url.
	 */
	@Test
	public void testGetUrl() {
		String expected = "jdbc:mysql://localhost/lorannproject?autoReconnect=true&useSSL=false";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getUrl());
	}

	/**
	 * Test get login.
	 */
	@Test
	public void testGetLogin() {
		String expected = "root";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getLogin());
	}

	/**
	 * Test get password.
	 */
	@Test
	public void testGetPassword() {
		String expected = "1234";
		assertEquals(expected, DBPropertiesTest.testDBProperties.getPassword());
	}

}
