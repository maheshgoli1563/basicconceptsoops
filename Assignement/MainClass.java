package Assignement;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Espncricinfo es = new Espncricinfo();
		System.out.println("no of batsman " + es.getNoOfBatsmen());
		int s1 = es.addBatsman("mahesh", 250, 2, 4, 100, 6, 4);
		int w1 = es.addBatsman("rajesj", 100, 0, 2, 70, 4, 2);
		int e1 = es.addBatsman("suresh", 120, 0, 2, 90, 7, 3);
		
		System.out.println(s1);
		System.out.println(w1);
		System.out.println(e1);
		System.out.println("no of batsman " + es.getNoOfBatsmen());
		Batsman2 ws[] = es.getBatsmans();
		for (int i = 0; i < es.index; i++) {
			System.out.println(ws[i] + " ");
		}
		System.out.println("enter id to update it");
		int scid = scanner.nextInt();
		Batsman2 ob = es.updateBatsmanStats(scid, 200, 5, 4, 70);
		System.out.println("updated of  id:" + scid + " =" + ob);
		Batsman2 we = es.getBatsman(4);
		System.out.println(we);
		Batsman2 ws1[] = es.getBatsmans();
		for (int i = 0; i < es.index; i++) {
			System.out.println(ws1[i] + " ");
		}
		scanner.close();
	}
}
