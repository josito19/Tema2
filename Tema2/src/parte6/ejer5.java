package parte6;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		long factor = 0;
		System.out.println("Escriba un número:");
		num = sc.nextInt();
		for (i = num - 1; i > 1; i--) {
			factor = num *= i;
		}
		System.out.println("La factorización es: " + factor);

		sc.close();
	}

}
