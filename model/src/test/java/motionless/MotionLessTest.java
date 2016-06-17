package motionless;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MotionLessTest {
	private static BonesH boneHTest;
	private static int bddIdOfBoneHTest = 3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		boneHTest = new BonesH();
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetBddId() {
		assertEquals(bddIdOfBoneHTest, MotionLessTest.boneHTest.getBddId());
	}

}
