
public class Player
{
	String name;
	String country;
	String skill;
	public Player()
	{
		
	}
	
	public Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() 
	{
		return String.format("%-15s %-15s %-15s",name,country,skill);
	}
	
	
		
}
