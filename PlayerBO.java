
public class PlayerBO {
	
public PlayerBO() {
}
 
public Player createPlayer(String data,Team[] teamList)
{
	Player p=new Player();
	String []s=data.split(",");
	p.setName(s[0]);
	for(Team t: teamList)
	{
		if(s[1].equals(t.getName()))
		{
			p.setTeam(t);
			
		}	
	}
	return p;
}

public String findTeamName(Player[] playerList,String playername)
{
	String t=null;
	for(Player p:playerList)
	{
		if(p.getName().equals(playername))
		{
			t=p.team.getName();
			return t;
		}
	}
	return t;
}

public boolean findWeatherPlayersAreInSameTeam(Player[] playerList,String playername1,String playername2)
{
	String t1="",t2="";
	for(Player p:playerList)
	{
		if(p.getName().equals(playername1))
		{
			t1=p.team.getName();
			break;
		}
	}
	for(Player p:playerList)
	{
		if(p.getName().equals(playername2))
		{
			t2=p.team.getName();
			break;
		}
	}
	if(t1.equals(t2))
	{
		return true;
	}
	return false;
	}
}	
	

	

