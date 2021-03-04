package Assignement;

import java.util.Scanner;

public class Espncricinfo {

	int index = 0;
	private int id = 0;
	private static final int SIZE = 50;
	private Batsman2[] batsmans = new Batsman2[SIZE];
	private int noOfBatsmen;

	public Batsman2[] getBatsmans() {
		return batsmans;
	}

	int getNoOfBatsmen() {
		return noOfBatsmen;
	}

	int addBatsman(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		if (noOfBatsmen < SIZE - 1) {
			Batsman2 ob = new Batsman2(name, runsScored, centuries, halfCenturies, ballsFaced, fours, sixes);

			noOfBatsmen++;
			batsmans[index] = ob;
			batsmans[index].setId(id++);
			return batsmans[index++].getId();
		} else {
			return 0;
		}
	}

	Batsman2 updateBatsmanStats(int id, int runsScored, int fours, int sixes, int ballsFaced) {
		Batsman2 obj = new Batsman2();
		boolean status = false;
		for (int i = 0; i < index; i++) {

			if (id == batsmans[i].getId()) {

				status = true;
				batsmans[i].setBallsFaced(ballsFaced);
				batsmans[i].setRunsScored(runsScored);
				batsmans[i].setFours(fours);
				batsmans[i].setSixes(sixes);
				obj = batsmans[i];
				break;
			}
		}
		if (status) {

			return obj;
		} else {

			return null;
		}
	}

	public Batsman2 getBatsman(int batsmanId) {

		for (int i = 0; i < index; i++) {

			if (batsmanId == batsmans[i].getId()) {
				return batsmans[i];
			}
		}
		return null;
	}

}
