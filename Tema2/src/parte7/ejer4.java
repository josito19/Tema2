package parte7;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		// mayor será el número más grande de los dos
		int mayor;
		int menor;
		int mcd = 0;
		int mcm;
		// Pedimos los números y los asignamos a las variables
		System.out.println("Introduzca el primer número:");
		a = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		b = sc.nextInt();
		// Asignamos a mayor el número más grande, a o b
		mayor = (a > b) ? a : b;
		menor = (a<b)? a:b;
		
		for (int i = menor; i > 0; i--) {
			// Si ambas divisiones dejan resto 0, ese será el mcd
			if (a % i == 0 && b % i == 0) {
				mcd = i;
				break;
			}
		}
		
		mcm = (a / mcd) * b;
		System.out.println(mcm);
		sc.close();
	}
}	
	


