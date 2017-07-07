
public class Player 
{
	String player_name = "";
	int points_this_round = 0;
	int rolls_this_round = 1;
	
	Player(String name)
	{
		this.player_name = name;
	}
	public String get_player_name()
	{
		return this.player_name;
	}
	
	public void set_points_this_round(int points)
	{
		this.points_this_round = this.points_this_round + points;
	}
	
	public int get_points_this_round()
	{
		return this.points_this_round;
	}
	

}
