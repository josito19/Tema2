package parte7;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int num1;
		int cont = 1;
		int error = 0;
		System.out.println("Dime un número inicial:");
		num = sc.nextInt();
		do {
			System.out.println("Dime un número:");
			num1 = sc.nextInt();
			if (num1 < num) {
				if (num1 == 0) {
					break;

				}
				System.out.println("Fallo es menor.");
				error++;
			}
			num = num1;

			cont++;
		} while (num > 0);

		System.out.println("Total de números introducidos: " + cont);
		System.out.println("Números fallados: " + error);

		sc.close();
	}

}
