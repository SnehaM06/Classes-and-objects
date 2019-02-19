
public class Delivery
{
long over;
long ball;
String batsman;
String bowler;
String nonStriker;

public Delivery() {
}

public Delivery(Long over, Long ball, String batsman, String bowler, String nonStriker) {
	this.over = over;
	this.ball = ball;
	this.batsman = batsman;
	this.bowler = bowler;
	this.nonStriker = nonStriker;
}
public Long getOver() {
	return over;
}
public void setOver(Long over) {
	this.over = over;
}
public Long getBall() {
	return ball;
}
public void setBall(Long ball) {
	this.ball = ball;
}
public String getBatsman() {
	return batsman;
}
public void setBatsman(String batsman) {
	this.batsman = batsman;
}
public String getBowler() {
	return bowler;
}
public void setBowler(String bowler) {
	this.bowler = bowler;
}
public String getNonStriker() {
	return nonStriker;
}
public void setNonStriker(String nonStriker) {
	this.nonStriker = nonStriker;
} 

@Override
public String toString() {
	return "Over :"+over+"\nBall :"+ball+"\nBatsman :"+batsman+"\nBowler :"+bowler+"\nNonStriker :"+nonStriker;

}


}
