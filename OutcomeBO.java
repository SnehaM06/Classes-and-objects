
public class OutcomeBO
{
	public void displayAllOutcomeDetails(Outcome[] outcomeList)
	 {
		 System.out.println("Outcome Details");
		 System.out.println(String.format("%-20s %-20s %-20s %s","Status","Winning Team","Player Of The Match","Date"));
		 for(int i=0;i<outcomeList.length;i++)
			{
			
				//System.out.println("Wicket "+(i+1));
				System.out.println(outcomeList[i]);
			}
	}
	
	public void displaySpecificOutcomeDetails(Outcome[] outcomeList,String date)
	{
		 System.out.println("Outcome Details");
		 System.out.println(String.format("%-20s %-20s %-20s %s","Status","Winning Team","Player Of The Match","Date"));
		for(int i=0;i<outcomeList.length;i++)
		{
			if(outcomeList[i].getDate().equals(date))
					{
				 			//System.out.println("Wicket "+(i+1));
				 		System.out.println(outcomeList[i]);
				 		
					}
		}
	}
}
