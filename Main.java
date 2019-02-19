import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String in this format(yyyy-MM-DD HH:mm:ss)");
		String in=sc.nextLine();
		UserMainCode.displayDateTime(in);
		/*Scanner sc=new Scanner(System.in);
		String in=new String();
		in=sc.nextLine();
		int l=in.length();
		int div = 0;
		String s=new String();
		if(l<3)
		{
			System.out.println(0);
			System.exit(0);
		}
		for(int i=0;i<l-2;i++)
		{
			
				s=in.substring(i,i+3);
				//System.out.println(s);
				if(Integer.parseInt(s)%4 == 0)
				{
					div++;
				}
				
		}
		System.out.println(div);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		UserMainCode us=new UserMainCode();
		boolean flag=UserMainCode.validatePlayer(date);
		if(flag)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		*/
		
		
		
		//String session 1.1
		
		/*Scanner sc = new Scanner(System.in);
		String team1=" ",team2=" ";
		char ch;
		System.out.println("Enter team1");
		team1=sc.nextLine();
		System.out.println("Enter team2");
		team2=sc.nextLine();
		System.out.println("Enter third character");
		ch=sc.next().charAt(0);
		if(ch==team1.charAt(2))
		{
			System.out.println("Winner Team: "+team1);
		}
		else if(ch==team2.charAt(2))
		{
			System.out.println("Winner Team : "+team2);
		}*/
	
		
		//String session 1.2
		
		/*Scanner sc = new Scanner(System.in);
		String venue1=" ",venue2=" ";
		System.out.println("Enter venue1");
		venue1=sc.nextLine();
		System.out.println("Enter venue2");
		venue2=sc.nextLine();
		if(venue1.equalsIgnoreCase(venue2))
		{
			System.out.println("Both the venues are same.");
		}
		else
		{
			System.out.println("Both the venues are different.");
		}*/
		
		
		//String session 1.3
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		String cnt=sc.nextLine();
		int c=Integer.parseInt(cnt);
		String player[]=new String[c];
		for(int i=0;i<player.length;i++)
		{
			player[i]=sc.nextLine();
		}
		for(int i=0;i<player.length;i++)
		{
			if((player[i].indexOf('a'))==(player[i].lastIndexOf('a')))
			{
				System.out.println("Player of the Match:");
				System.out.println(player[i]);
			}
		}*/
		
		
		
		//String session 1.4
		
		/*	Scanner sc = new Scanner(System.in);
		String team=" ",s,e;
		String sub=" ";
		int st=0,end=0;
		System.out.println("Enter team name");
		team=sc.nextLine();
		
		System.out.println("Enter starting index of the sequence");
		s=sc.nextLine();
		st=Integer.parseInt(s);
		
		System.out.println("Enter ending index of the sequence");
		e=sc.nextLine();
		end=Integer.parseInt(e);
		
		sub=team.substring(st,end);
		System.out.println(sub);*/
		
		
		
		
		////String session 1.5
		
		/*Scanner sc = new Scanner(System.in);
		String team=" ",s;
		String sub=" ";
		int st=0;
		System.out.println("Enter Player name");
		team=sc.nextLine();
		
		System.out.println("Enter starting index");
		s=sc.nextLine();
		st=Integer.parseInt(s);
		
		sub=team.substring(st);
		
		System.out.println("Short name of "+team+ ": "+sub);*/
		
		
		
		
		//String session 1.6
	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		String cnt=sc.nextLine();
		int c=Integer.parseInt(cnt);
		String player[]=new String[c];
		System.out.println("Enter the player name");
		for(int i=0;i<player.length;i++)
		{
			player[i]=sc.nextLine();
		}
		System.out.println("Player name starting with 'M' or Ending with 'a'");
		for(int i=0;i<player.length;i++)
		{
			if((player[i].startsWith("M"))||(player[i].endsWith("a")))
			{
				System.out.println(player[i]);
			}
		}*/
		
		
		//String session 1.7
		
		/*Scanner sc = new Scanner(System.in);
		String p1=" ",p2=" ";
		System.out.println("Enter player names");
		p1=sc.nextLine();
		p2=sc.nextLine();
		if(p1.regionMatches(0,p2,0,7))
		{
			System.out.println("Both the players names starts with Michael");
		}
		else
		{
			System.out.println("Both the players names does not starts with Michael");
		}*/
		

		
		/*Scanner sc = new Scanner(System.in);
		String org=" ", rep=" ";
		System.out.println("Enter team details");
		org=sc.nextLine();
		
		rep=org.replaceAll("Captain","Skipper");
		
		System.out.println("After replacement");
		System.out.println(rep);*/
		
		
		
		
		
		
		
		
		
		
		
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city count");
		String str=sc.nextLine();
		int n=Integer.parseInt(str);
		
		City []t=new City[n];
		CityBO tb=new CityBO();
		String ct;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter city "+(i+1)+" details");
			ct=sc.nextLine();
			t[i]=tb.createCity(ct);
		}
		
		System.out.println("Enter the venue count");
		String venuecnt=sc.nextLine();
		int c=Integer.parseInt(venuecnt);
		Venue []v=new Venue[c];
		VenueBO vb=new VenueBO();
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter venue "+(i+1)+" details");
			String match=sc.nextLine();
			v[i]=vb.createVenue(match, t);
		}
		
		System.out.println("Enter the match count");
		String matchcnt=sc.nextLine();
		int k=Integer.parseInt(matchcnt);
		Match []p=new Match[k];
		MatchBO pb=new MatchBO();
		for(int i=0;i<p.length;i++)
		{
			System.out.println("Enter match "+(i+1)+" details");
			String match=sc.nextLine();
			p[i]=pb.createMatch(match, v);
		}
		//boolean flag=true;
		String jam;
		System.out.println("Menu :");
		System.out.println("1)Find Venue\n2)Find All Matches In A Specific Venue\nType 1 or 2");
		do
		{
		System.out.println("Enter your choice");
		String choice=sc.nextLine();
		int ch=Integer.parseInt(choice);
		switch(ch)
		{
		case 1: System.out.println("Enter Match Date");
				String date=sc.nextLine();
				pb.findVenue(date, p);
				break;
				
		case 2: System.out.println("Enter Venue Name");
				String venue=sc.nextLine();
				pb.findAllMatchesInGivenVenue(venue,p);
				break;
		}
		System.out.println("Do you want to continue? Type Yes or No");
		jam=sc.nextLine();
		if(jam.equals("No"))
		{
			System.exit(0);
		}
		}
		while(true);*/
		
		
		
/*		for(int i=0;i<d.length;i++)
		{
			System.out.println("Enter match "+(i+1)+" details:");
			
			System.out.println("Enter match date");
			String date=sc.nextLine();
			
			System.out.println("Enter team one");
			String team1=sc.nextLine();
			
			System.out.println("Enter team two");
			String team2=sc.nextLine();
			
			System.out.println("Enter venue");
			String venue=sc.nextLine();
			
			System.out.println("Enter status");
			String status=sc.nextLine();
			
			System.out.println("Enter winner Team");
			String winnerTeam=sc.nextLine();
			o[i]=new Outcome(status,winnerTeam);
			d[i]=new Match(date,team1,team2,venue,o[i]);
			
		}	
		MatchBO dp=new MatchBO();
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.View match details\n2.Filter match details with outcome status\n3.Filter match details with outcome winner team\n4.Exit");
			System.out.println("Enter your choice");
			String k=sc.nextLine();
			int ch=Integer.parseInt(k);
			switch(ch)
			{
			case 1:dp.printAllMatchDetails(d);
					break;
					
			case 2:System.out.println("Enter outcome status");
					String dat=sc.nextLine();
					dp.printMatchDetailsWithOutcomeStatus(d,dat);
					break;
					
			case 3:System.out.println("Enter outcome winner team");
					String dt=sc.nextLine();
					dp.printMatchDetailsWithOutcomeWinnerTeam(d,dt);
					break;
					
			case 4:System.exit(0);
					break;
			}
			
		}*/
			
	}
}
