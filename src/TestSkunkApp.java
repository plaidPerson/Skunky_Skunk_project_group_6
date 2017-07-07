import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSkunkApp {
		private SkunkApp game;
		
	@Before
      public void setup(){
    	  game=new SkunkApp();
      }

	@Test
	public void CanGetPlayerName(){
		game.getPlayerName();
		
	}
	
	@Test
	public void CanCreateRoll(){
		Roll roll=new Roll();
		assertEquals(12,roll.getLastTotal()<=12);
		assertEquals(2,roll.getLastTotal()>=2);
	}
	
}
