package kalkulator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		while(true) {
			String a;
			a = s1.nextLine();
			if(a.equals("exit") || a.equals("kraj")) {
				break;
			}
		}
	}

}