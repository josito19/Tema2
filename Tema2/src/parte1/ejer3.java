package parte1;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		double n;
//Pedimos el numero y lo asignamos		
		System.out.println("Introduzca el número con decimales:");
		n = sc.nextDouble();
//Si el numero es menor o igual que -1, es cero o es mayor o igual que 1, no será casi-cero
		if (n <= -1) {
			System.out.println("No es casi-cero");
		} else {
			if (n == 0) {
				System.out.println("No es casi-cero");
			} else {
				if (n >= 1) {
					System.out.println("No es casi-cero");
				} else {
					System.out.println("Es un numero casi-cero");
				}

			}

		}

		sc.close();
	}

}
