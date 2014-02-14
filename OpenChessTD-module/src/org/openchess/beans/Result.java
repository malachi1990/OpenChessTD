package org.openchess.beans;

public enum Result {
	WIN("W"), 
	LOSE("L"),
	DRAW("D"),
	FULL_POINT_BYE("B"),
	HALF_POINT_BYE("H"),
	FORFEIT_LOSS("F"),
	FORFEIT_WIN("X"),
	FORFEIT_DRAW("Z"),
	UNPLAYED_OR_NOT_PAIRED("U");
	
	private String uscfValue;
	
	private Result(String uscfvalue){
		uscfValue = uscfvalue;
	}
	
	public String getResult(){
		return uscfValue;
	}
	
}
