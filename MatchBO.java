
public class MatchBO
{
	public void printAllMatchDetails(Match[] MatchList)
	{
		System.out.println("Match Details");
		 System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %s","Date","Team1","Team2","Venue","Status","Winner"));
		 for(int i=0;i<MatchList.length;i++)
			{
				System.out.println(MatchList[i]);
			}
	}
	
	public void printMatchDetailsWithOutcomeStatus(Match[] MatchList,String outcomeStatus)
	{
		System.out.println("Match Details");
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %s","Date","Team1","Team2","Venue","Status","Winner"));
		  boolean stat = false;
		 for(int i=0;i<MatchList.length;i++)
		{
			 
			if(MatchList[i].getOutcome().getStatus().equals(outcomeStatus))
					{
	
				 		System.out.println(MatchList[i]);
				 		stat = true;
				 		
					}
		}
		 if(stat==false)
		 {
			 System.out.println("Status not found");
		 }
	}
	
	public void printMatchDetailsWithOutcomeWinnerTeam(Match[] MatchList,String outcomeWinnerTeam)
	{
		System.out.println("Match Details");
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %s","Date","Team1","Team2","Venue","Status","Winner"));
		  boolean stat = false;
		 for(int i=0;i<MatchList.length;i++)
		{
			 
			if(MatchList[i].getOutcome().getWinnerTeam().equals(outcomeWinnerTeam))
					{
				 			//System.out.println("Wicket "+(i+1));
				 		System.out.println(MatchList[i]);
				 		stat = true;
				 		
					}
		}
		 if(stat==false)
		 {
			 System.out.println("Winner Team not found");
		 }
	}
}
