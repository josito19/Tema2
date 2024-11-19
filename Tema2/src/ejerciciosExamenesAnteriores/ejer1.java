package ejerciciosExamenesAnteriores;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lado;

		System.out.println("Introduzca el lado:");
		lado = sc.nextInt();

		for (int i = 1; i <= lado; i++) {
			if (i == lado || i == 1) {
				for (int j = lado; j >= 1; j--) {

					System.out.print("*");
				}
			}

			System.out.println("");
		}

		sc.close();
	}

}
