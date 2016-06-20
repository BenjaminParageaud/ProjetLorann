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

public class HeroTest {
	private static Hero testLorann; 
	private static ILorannWorldEntity testLorannWorldEntity;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	/*	testLorannWorldEntity = new ILorannWorldEntity(){

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
			
		};*/
		testLorann = new Hero(testLorannWorldEntity);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetSprite() {
		assertNotNull(testLorann.getSprite());
	}

	@Test
	public void testGetPermeability() {
		assertEquals(testLorann.getPermeability(), Permeability.HEROABLE);
	}


	@Test
	public void testGetLorannWorldEntity() {
		assertNotNull(testLorann.getLorannWorldEntity());
	}


	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsMovePossible() {
	}

	@Test
	public void testMoveUp() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDown() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveUpRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveUpLeft() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDownRight() {
		fail("Not yet implemented");
	}

	@Test
	public void testMoveDownLeft() {
		fail("Not yet implemented");
	}

}
