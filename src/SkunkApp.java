import java.util.ArrayList;

public class SkunkApp 
{
             
	int NumberofPlayer;
	
	//See min 51:27
	private int numPlayers;
	private Player active_player;
	private int player_number = 0;
              

     public int getNumberofPlayer()
     {
    	 return NumberofPlayer; 
     }
     
     public void setNumberOfPlayers(int num)
     {
    	 
    	this.NumberofPlayer = num;
     }

	public void playGame()
	{
		
		SkunkUI UI = new SkunkUI();

		SkunkController controller = new SkunkController();
		
		//Must enter number of PLAYERS < 2.
		int number = UI.getNumPlayersFromUser();
		
		setNumberOfPlayers(number);

		ArrayList<Player> players = new ArrayList<Player>();
		
		 
		
		players = controller.createPlayers(getNumberofPlayer());
		
		//Now, we have all the players stored in the ArrayList of Players called 'players.'
		
		//Next, we start the first round. 
		
//Player #1 takes a turn.
		
//player_number == 0
		
		Player p = players.get(player_number); // player_number = 0
		
		//set active player and player_number
		this.active_player = p;
		this.player_number = player_number + 1; // this.player_number = 1 for output
		
		//error here in displaying the player name ??????
		System.out.println("");
		UI.print("---------Player #" + (player_number) + " " + p.get_player_name() + ", turn #1----------------");
		
		int roll_of_dice = 0;
		
		Dice myDice = new Dice();
		
		//Write some checks here for if the player rolls a '1' (put inside the Die class).
		
		roll_of_dice = myDice.roll_dice();
		
		//set total points
		p.set_points_this_round(roll_of_dice);
		
		System.out.println("Roll #" + p.rolls_this_round + ", points = " + roll_of_dice );
	

		String again = "";
		
		while (!again.equals("N") && !again.equals("n"))
		{
			//Does the player want to roll again???
			
			again = UI.promptAndReturn("Want to roll again? 'Y' = Yes 'N' = No");
			
			if (again.equals("Y") || again.equals("y"))
			{
				
				// Roll again
				
				//increase the number of rolls inside patron
				p.rolls_this_round++;

				roll_of_dice = myDice.roll_dice();
				
				System.out.println("Roll #" + p.rolls_this_round + ", points = " + roll_of_dice);
				
				// Add the points to the previous point total.
				
				p.set_points_this_round(roll_of_dice);
				
				UI.print("Total points = " + p.get_points_this_round());
				
			}//end if
		
		}//end while
		
		
		
	}
	//This method isn't written yet
    public Boolean rollAgain()
    {
   	 	Boolean b = true;
   	 	
   	 	return b;
    }
}
