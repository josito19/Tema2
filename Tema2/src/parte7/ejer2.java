package parte7;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int primo = 0;

		System.out.println("Introduzca un número:");
		numero = sc.nextInt();

		// Recorre cada número de 2 a numero
		for (int i = 2; i <= numero; i++) {
			boolean esPrimo = true;

			// Comprueba si i tiene divisores
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}

			// Si es primo, incrementa el contador
			if (esPrimo) {
				primo++;
			}
		}

		System.out.println("Entre 1 y " + numero + " hay " + primo + " números primos.");
		sc.close();
	}
}