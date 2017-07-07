import java.util.Scanner;

public class SkunkUI 
{


	
	public int getNumPlayersFromUser()
	{
		int numPlayers = 0;
		
		//Make sure that there are at least 2 players.
		while (numPlayers < 2)
		{
	
			System.out.print("Welcome to Skunk" + "\n Please enter the # of Players >>");
			
			//Get input from user.
			
			Scanner in = new Scanner(System.in);
			numPlayers = in.nextInt();
			
			//display error message
			if (numPlayers < 2)
			{
				System.out.print("\n You MUST have, at least, 2 players in order to play Skunk!");
			}
		}
		
	return numPlayers;
	}
	
	public  String getPlayerNamesFromUser(int num_Players, int count)
	{
		String player_name = "";
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n Please enter the name of Player #" + count + "   >>");
		//Get input from user.
		player_name = in.nextLine();
	
		return player_name;
	}
	
	public String promptAndReturn(String question)
	{
		String result = "";
		Scanner in = new Scanner(System.in);
	//	result = in.nextLine();
		
		System.out.println(question + " >>");
		result =  in.nextLine();
		
		return result;
	}
	
	public void print(String output)
	{
		System.out.println(output);
	}

}
