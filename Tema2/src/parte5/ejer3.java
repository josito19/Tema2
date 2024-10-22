package parte5;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		// numero serán los números
		int numero = 0;
		// n será el número de veces que se sumarán
		int n;
		// suma será la suma de numero y el siguiente número
		int suma = 0;
		// Pedimos al usuario introducir n y lo asignamos a la variable
		System.out.println("¿Hasta que número se han de sumar?");
		n = sc.nextInt();
		do {
			// numero aumentará en uno cada vez
			numero++;
			// suma se sumará a número y se asignará el resultado
			suma += numero;
			// Hasta que numero sea menor que n, el número ingresado por el usuario
		} while (numero < n);
		// Mostramos el resultado de la suma y cerramos el escáner
		System.out.println(suma);
		sc.close();
	}

}
