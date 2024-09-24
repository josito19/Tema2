package parte1;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
		System.out.println("Introduzca un número");
// Creamos nuestras variables y pedimos un numero
		n = sc.nextInt();
		n1 = n % 2;
// El escaner le da valor a la variable n, la cual modula entre dos
		if (n1 == 0) {
			System.out.println("Es un numero par");
		} else {
			System.out.println("Es un numero impar");
		}
//Creamos un if else en el cual si la operacion da 0 es par y sino es impar y lo muestra		
		sc.close();
	}

}
