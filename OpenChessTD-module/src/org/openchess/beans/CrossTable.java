package org.openchess.beans;

import java.util.Arrays;

public class CrossTable {

	private String [] [] results;
	private String timeControl;
	
	public CrossTable(String [] [] results){
		this.results = results;
	}
	
	
	public CrossTable(int numPlayers, int rounds){
		results = new String[numPlayers][rounds+1];
	}
	
	
	public void addPlayer(String id){
		for(int i = 0; i < results.length; i++){
			System.out.println("checking for empty player slot");
			if(results[i][0] == null || results[i][0] == ""){
				System.out.println("Adding player: " + id);
				results[i][0] = id;
				break;
			}
		}
	}
	
	/**
	 * Adds result based on input id and round info
	 * @param id
	 * @param round
	 * @param result
	 */
	public void addResult(String id, int round, String result){
		for(int i = 0; i < results.length; i++){
			if(results[i][0].equals(id)){
				results[i][round] = result;
			}
		}
	}
	
	/**
	 * to be used only for command line testing purposes
	 */
	public void printResults(){
		for(String [] row : results ){
			System.out.println(Arrays.toString(row));
		}
	}


	public String[][] getResults() {
		return results;
	}


	public void setResults(String[][] results) {
		this.results = results;
	}


	public String getTimeControl() {
		return timeControl;
	}


	/**
	 * Throws an Exception because any time that is entered needs to be parsed correctly.
	 * @param timeControl
	 * @throws Exception
	 */
	public void setTimeControl(String timeControl) throws Exception{
		
		this.timeControl = timeControl;
	}
	
	
	
	
}
