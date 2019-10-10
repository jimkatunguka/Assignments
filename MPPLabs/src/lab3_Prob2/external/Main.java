package lab3_Prob2.external;

import lab3_Prob2.LandLord;
import lab3_Prob2.Building;

public class Main {

	public static void main(String[] args) {
		LandLord l = new LandLord("Jim Katunguka");
		Building blg = l.addBuilding("John", 2500);

		blg.setAparment("BLOCK-A", 1500);
		blg.setAparment("BLOCK-B", 1300);
		blg.setAparment("BLOCK-C", 1500);
		
		Building blg2 = l.addBuilding("Parker", 1500);
		blg2.setAparment("WING-A", 800);
		blg2.setAparment("WING-B", 750);
		blg2.setAparment("WING-C", 1100);
		
		System.out.println(l);
		
	}

}