import static org.junit.Assert.*;

import org.junit.Test;

public class SkunkAppTest {

	@Test
	public void testGetNumberofPlayer() {
		SkunkApp sk = new SkunkApp();
		sk.getNumberofPlayer();
		assertEquals(0, sk.getNumberofPlayer());
	}

	@Test
	public void testSetNumberOfPlayers() {
		SkunkApp sk = new SkunkApp();
		sk.setNumberOfPlayers(2);
		assertEquals(2, sk.getNumberofPlayer());
	}

	@Test
	public void testPlayGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testRollAgain() {
		SkunkApp sk = new SkunkApp();
		sk.rollAgain();
		assertEquals(true, sk.rollAgain());
	}

}
