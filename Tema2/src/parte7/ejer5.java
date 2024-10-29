package parte7;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		// Creamos el escáner y la variable
		Scanner sc = new Scanner(System.in);
		int num;
		// Pedimos el número y lo asignamos a num
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		// Comprobamos que el número está en el rango deseado
		if (num >= 0 && num <= 20) {
			// El primer bucle irá incrementando desde el 1 hasta num
			for (int i = 1; i <= num; i++) {
				// En este bucle mostraremos i en pantalla tantas veces como sea i
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
				// Añadimos un salto de línea por cada número
				System.out.println();
			}
		} else {
			// Si el número no está en el rango deseado lo notificamos
			System.out.println("Número incorrecto");
		}
		sc.close();
	}

}
