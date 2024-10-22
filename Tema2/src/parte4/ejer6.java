package parte4;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		// alturas almacenará las alturas introducidas
		int alturas = 0;
		// max irá almacenando la altura más alta
		int max = 0;
		// Solicitamos las alturas y las asignamos a la variable alturas
		System.out.println("Introduzca las alturas en cm, introduzca un negativo para detener:");
		alturas = sc.nextInt();
		// Creamos un bucle que funcione mientras se introduzcan positivos o cero
		while (alturas >= 0) {
			// Si la altura introducida es más alta se almacena en max
			if (alturas > max) {
				max = alturas;
			}
			alturas = sc.nextInt();
		}
		// Mostramos en pantalla la altura más alta, la variable max
		System.out.println("La altura más alta son " + max + " centímetros.");
		// Cerramos el escáner
		sc.close();
	}

}
