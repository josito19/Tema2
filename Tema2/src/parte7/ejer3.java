package parte7;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int menor = 0;
		// Solicitamos y asignamos las variables
		System.out.println("Introduzca el primer número:");
		a = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		b = sc.nextInt();
		// Asignamos el menor número de los dos a menor
		menor = (a < b) ? a : b;
		// Se irán dividiendo los números desde el menor hasta 1
		for (int i = menor; i > 0; i--) {
			// Si ambas divisiones dejan resto 0, ese será el mcd
			if (a % i == 0 && b % i == 0) {
				// Lo mostramos en pantalla y cerramos el bucle
				System.out.println("El Mcd es: " + i);
				break;
			}
		}

		sc.close();
	}

}
