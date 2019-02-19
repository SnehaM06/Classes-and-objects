import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UserMainCode {


	public static void displayDateTime(String date) throws ParseException 
	{
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=sdf1.parse(date);
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy, H:mm:ss");
		System.out.println(sdf2.format(d));
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static boolean validatePlayer(String play)
	{
	//	int len=play.length();
		boolean flag=true;
		for(int i=0;i<play.length();i++)
		{
			if((i+1)%2==0 && ((play.charAt(i)=='a') || (play.charAt(i)=='A')))

				flag=false;

			//return true;
		}
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	public static boolean validateCity(String city)
	{
		boolean flag=false;
		int len=city.length();
		if(Character.isLetter(city.charAt(0)))
		{
			if(Character.isLetter(city.charAt(1)))
			{
				if(Character.isLetter(city.charAt(len-2)))
				{
					if(Character.isLetter(city.charAt(len-1)))
					{
						for(int i=2;i<=(len-3);i++)
						{
							if(city.charAt(i)=='*')
							{
								flag=true;
								break;
							}
						}
						//return false;
					}
					//return false;
				}
				//return false;
			}
			//return false;
			}
		return flag;
		}
	*/
	
	
	
	
	
	/*public static boolean validateDate(String date)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		try{
			Date d=sdf.parse(date);
		}
		catch(ParseException e)
		{
			return false;
		}
		return true;
	}*/
}
