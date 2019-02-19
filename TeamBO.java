
public class TeamBO
{
	public Team createTeam(String data)
	{
		String []str=data.split(",");
		Team t = new Team(str[0], str[1]);
		return t;
	}
}
