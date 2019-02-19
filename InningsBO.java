
public class InningsBO 
{
	
 public void DisplayAllInningsDetails(Innings[] inningsList)
 {
	 System.out.println("Innings Details");
	 for(int i=0;i<inningsList.length;i++)
		{
		
			//System.out.println("Delivery--"+(i+1));
			System.out.println(inningsList[i]);
		}
}
}