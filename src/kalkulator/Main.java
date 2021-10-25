package kalkulator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		while(true) {
			String a;
			a = s1.nextLine();
			if(a.equals("")) {
				continue;
			}
			if(a.equals("exit") || a.equals("kraj")) {
				break;
			}
			String[] b = a.split(" ");
			if(b.length != 3) {
				System.out.println("Ulaz nema 3 parametra!");
				continue;
			}
			int x = Integer.parseInt(b[0]);
			int y = Integer.parseInt(b[2]);
			if(b[1].equals("+")) {
				addition(x, y);
			}
			else if(b[1].equals("-")) {
				substraction(x, y);
			}
			else if(b[1].equals("*")) {
				multiplication(x, y);
			}
			else if(b[1].equals("/") || b[1].equals(":")){
				division(x, y);
			}
			else{
				System.out.println("Nije podržana operacija!");
			}
		}
	}
	
	public static void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void substraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiplication(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void division(int a, int b) {
		System.out.println(a / b);
	}

}