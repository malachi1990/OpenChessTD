package org.openchess.beans;

public enum TimeControl {
	PRIMARYTIMECONTROL("G/"),
	DELAY(";d"),
	INCREMENT(";+");
	
	private String timeControlChar;
	
	private TimeControl(String timeControlChar){
		this.timeControlChar = timeControlChar;
	}
	
	
}
