
public class Innings
{
	private String battingTeam;
	private Long runs;
	
	public Innings() {
		
	}
	public Innings(String battingTeam, Long runs) {
		this.battingTeam = battingTeam;
		this.runs = runs;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	@Override
	public String toString() {
		return battingTeam+" -- "+runs;	
}
}
