package mobile;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileTest {
	private static Hero lorannTest;
	private static int bddIdOfLorannTest = 1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		lorannTest = new Hero(null);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetBddId() {
		assertEquals(bddIdOfLorannTest, MobileTest.lorannTest.getBddId());
	}

}
