package parte5;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d1;
		String d2;
		int n1 = 0;
		int n2 = 0;
		int res;
		boolean op1 = false;
		boolean op2 = false;
		do {
			System.out.println("¿Cuánto ha salido en la primera tirada?");
			d1 = sc.next();

			switch (d1) {
			case "UNO" -> {
				n1 = 1;
				op1 = true;
			}
			case "DOS" -> {
				n1 = 2;
				op1 = true;
			}
			case "TRES" -> {
				n1 = 3;
				op1 = true;
			}
			case "CUATRO" -> {
				n1 = 4;
				op1 = true;
			}
			case "CINCO" -> {
				n1 = 5;
				op1 = true;
			}
			case "SEIS" -> {
				n1 = 6;
				op1 = true;
			}
			default -> System.out.println("Formato incorrecto");
			}
		} while (!op1);
		do {
			System.out.println("¿Cuánto ha salido en la segunda tirada?");
			d2 = sc.next();
			switch (d2) {
			case "UNO" -> {
				n2 = 1;
				op2 = true;
			}
			case "DOS" -> {
				n2 = 2;
				op2 = true;
			}
			case "TRES" -> {
				n2 = 3;
				op2 = true;
			}
			case "CUATRO" -> {
				n2 = 4;
				op2 = true;
			}
			case "CINCO" -> {
				n2 = 5;
				op2 = true;
			}
			case "SEIS" -> {
				n2 = 6;
				op2 = true;
			}
			default -> System.out.println("Formato incorrecto");
			}
		} while (!op2);
		res = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + res);
		sc.close();

	}

}
