package Assignement;

public class Batsman {

	String name;
	int runsScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;
	int id;

	public void setData(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int fours,
			int sixes) {
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.sixes = sixes;
	}

	public float getStrikeRate() {
		float strikeRate = (runsScored * 100) / ballsFaced;
		return strikeRate;
	}

	public int getRunsScoredInBoundaries() {
		return (4 * fours + 6 * sixes);
	}

}
