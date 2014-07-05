package org.openchess.test;

import org.junit.Test;
import org.openchess.beans.CrossTable;
import org.openchess.beans.Result;

public class CrossTableTest {
	
	
	@Test
	public void buildCrossTable(){
		String [][] results = new String [5][5];
		results[0][0] = "00001";
		results[0][1] = Result.WIN + "5";
		results[0][2] = Result.DRAW + "2";
		results[0][3] = Result.LOSE + "3";
		results[0][4] = Result.WIN + "4";
		
		results[1][0] = "00002";
		results[1][1] = Result.WIN + "3";
		results[1][2] = Result.DRAW + "1";
		results[1][3] = Result.WIN + "4";
		results[1][4] = Result.WIN + "5";
		
		results[2][0] = "00003";
		results[2][1] = Result.LOSE + "2";
		results[2][2] = Result.WIN + "5";
		results[2][3] = Result.WIN + "1";
		results[2][4] = Result.FULL_POINT_BYE + "";
		
		results[3][0] = "00004";
		results[3][1] = Result.DRAW + "5";
		results[3][2] = Result.WIN + "5";
		results[3][3] = Result.WIN + "5";
		results[3][4] = Result.WIN + "5";
		
		results[4][0] = "00005";
		results[4][1] = Result.WIN + "5";
		results[4][2] = Result.LOSE + "4";
		results[4][3] = Result.UNPLAYED_OR_NOT_PAIRED + "";
		results[4][4] = Result.WIN + "5";
		
		CrossTable event = new CrossTable(results);
		event.printResults();
		
	}
	
	
	@Test
	public void testRoundBuild(){
		
		CrossTable event = new CrossTable(5, 4);
		
		event.addPlayer("00006");
		event.addPlayer("00007");
		event.addPlayer("00008");
		event.addPlayer("00009");
		event.addPlayer("00010");
		
		event.addResult("00006", 1, Result.WIN+"2");
		event.addResult("00006", 2, Result.WIN+"3");
		event.addResult("00006", 3, Result.WIN+"4");
		event.addResult("00006", 4, Result.WIN+"5");
		
		event.addResult("00007", 1, Result.LOSE+"2");
		event.addResult("00007", 2, Result.LOSE+"3");
		event.addResult("00007", 3, Result.LOSE+"4");
		event.addResult("00007", 4, Result.LOSE+"5");
		
		event.addResult("00008", 1, Result.LOSE+"2");
		event.addResult("00008", 2, Result.DRAW+"3");
		event.addResult("00008", 3, Result.LOSE+"4");
		event.addResult("00008", 4, Result.LOSE+"5");
		
		event.addResult("00009", 1, Result.LOSE+"2");
		event.addResult("00009", 2, Result.LOSE+"3");
		event.addResult("00009", 3, Result.UNPLAYED_OR_NOT_PAIRED+"");
		event.addResult("00009", 4, Result.LOSE+"5");
		
		event.addResult("00010", 1, Result.DRAW+"1");
		event.addResult("00010", 2, Result.FORFEIT_WIN+"2");
		event.addResult("00010", 3, Result.FORFEIT_LOSS+"3");
		event.addResult("00010", 4, Result.WIN+"4");
		
		
		event.printResults();
		
		
	}
	
	
	
}
