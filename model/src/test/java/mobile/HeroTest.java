package mobile;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Observable;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IHero;
import contract.ILorannWorldEntity;
import contract.IMobile;
import contract.IMotionLess;
import contract.Permeability;

// TODO: Auto-generated Javadoc
/**
 * The Class HeroTest.
 */
public class HeroTest {
	
	/** The test lorann. */
	private static Hero testLorann; 
	
	/** The test lorann world entity. */
	private static ILorannWorldEntity testLorannWorldEntity;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testLorannWorldEntity = new ILorannWorldEntity(){

			public void addElement(IMotionLess element, int x, int y) {
				// TODO Auto-generated method stub
				
			}

			public void addMobile(IMobile mobile, int x, int y) {
				// TODO Auto-generated method stub
				
			}

			public void addHero(IHero hero, int x, int y) {
				// TODO Auto-generated method stub
				
			}

			public IHero getHero() {
				// TODO Auto-generated method stub
				return null;
			}

			public void setHero(IHero hero) {
				// TODO Auto-generated method stub
				
			}

			public void setElements(IMotionLess[][] elements) {
				// TODO Auto-generated method stub
				
			}

			public IMotionLess[][] getElements() {
				// TODO Auto-generated method stub
				return null;
			}

			public IMotionLess getElement(int x, int y) {
				// TODO Auto-generated method stub
				return null;
			}

			public ArrayList<IMobile> getMobiles() {
				// TODO Auto-generated method stub
				return null;
			}

			public void setMobilehasChanged() {
				// TODO Auto-generated method stub
				
			}

			public void notifyObservers() {
				// TODO Auto-generated method stub
				
			}

			public Observable getObservable() {
				// TODO Auto-generated method stub
				return null;
			}

			public void play() {
				// TODO Auto-generated method stub
				
			}

			public boolean setElement(IMotionLess element, int x, int y) {
				// TODO Auto-generated method stub
				return false;
			}

			public int getXdoor() {
				// TODO Auto-generated method stub
				return 0;
			}

			public void setXdoor(int xdoor) {
				// TODO Auto-generated method stub
				
			}

			public int getYdoor() {
				// TODO Auto-generated method stub
				return 0;
			}

			public void setYdoor(int ydoor) {
				// TODO Auto-generated method stub
				
			}
			
		};
		testLorann = new Hero(testLorannWorldEntity);
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
	 * Test get sprite.
	 */
	@Test
	public void testGetSprite() {
		assertNotNull(testLorann.getSprite());
	}

	/**
	 * Test get permeability.
	 */
	@Test
	public void testGetPermeability() {
		assertEquals(testLorann.getPermeability(), Permeability.HEROABLE);
	}


	/**
	 * Test get lorann world entity.
	 */
	@Test
	public void testGetLorannWorldEntity() {
		assertNotNull(testLorann.getLorannWorldEntity());
	}


	/**
	 * Test get X.
	 */
	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	/**
	 * Test set X.
	 */
	@Test
	public void testSetX() {
		fail("Not yet implemented");
	}

	/**
	 * Test get Y.
	 */
	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	/**
	 * Test set Y.
	 */
	@Test
	public void testSetY() {
		fail("Not yet implemented");
	}

	/**
	 * Test is move possible.
	 */
	@Test
	public void testIsMovePossible() {
	}

	/**
	 * Test move up.
	 */
	@Test
	public void testMoveUp() {
		fail("Not yet implemented");
	}

	/**
	 * Test move down.
	 */
	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}

	/**
	 * Test move right.
	 */
	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}

	/**
	 * Test move left.
	 */
	@Test
	public void testMoveLeft() {
		fail("Not yet implemented");
	}

	/**
	 * Test move up right.
	 */
	@Test
	public void testMoveUpRight() {
		fail("Not yet implemented");
	}

	/**
	 * Test move up left.
	 */
	@Test
	public void testMoveUpLeft() {
		fail("Not yet implemented");
	}

	/**
	 * Test move down right.
	 */
	@Test
	public void testMoveDownRight() {
		fail("Not yet implemented");
	}

	/**
	 * Test move down left.
	 */
	@Test
	public void testMoveDownLeft() {
		fail("Not yet implemented");
	}

}
