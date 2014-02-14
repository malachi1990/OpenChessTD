package org.openchess.beans;

import java.math.BigDecimal;


/**
 * Player object used for containing basic player data that will be used for computations.
 * @author jordan
 *
 */
public class Player implements Comparable<Player>{
	private int rating = 0;
	private String fName = "";
	private String lName = "";
	private String id;
	private String expDate;
	private String State;
	private String prizeGroup;
	private BigDecimal pointTotal;
	private String initialRanking;
	
	public String getInitialRanking() {
		return initialRanking;
	}
	public void setInitialRanking(String initialRanking) {
		this.initialRanking = initialRanking;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPrizeGroup() {
		return prizeGroup;
	}
	public void setPrizeGroup(String prizeGroup) {
		this.prizeGroup = prizeGroup;
	}
	public BigDecimal getPointTotal() {
		return pointTotal;
	}
	public void setPointTotal(BigDecimal pointTotal) {
		this.pointTotal = pointTotal;
	}
	public int getRating() {return rating;}
	public void setRating(int rating) {this.rating = rating;}
	public String getfName() {	return fName;}
	public void setfName(String fName) {this.fName = fName; }
	public String getlName() { return lName; }
	public void setlName(String lName) { this.lName = lName; }
	

	@Override
	public int compareTo(Player arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("player: ").append(fName).append(" ").append(lName);
		
		return sb.toString();
	}
	
}
