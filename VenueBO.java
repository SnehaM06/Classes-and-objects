
public class VenueBO {
public Venue createVenue(String data,City[] cityList)
{
	Venue v=new Venue();
	String []s=data.split(",");
	v.setName(s[0]);
	for(City c:cityList)
	{
		if(s[1].equals(c.getName()))
		{
			v.setName(s[1]);
		}
	}
	return v;
}
}
