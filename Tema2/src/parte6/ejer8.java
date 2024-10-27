package parte6;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		// Creamos el escáner y las dos variables
		Scanner sc = new Scanner(System.in);
		// a será el primer número
		int a;
		// b será el segundo
		int b;
		// Solicitamos los números y los asignamos con el escáner
		System.out.println("Introduce dos números:");
		a = sc.nextInt();
		b = sc.nextInt();

		// Si A es menor que B se mostrará i desde a hasta b
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		// Si B es menor que A se mostrará i desde b hasta a
		else if (b < a) {
			for (int i = b; i <= a; i++) {
				System.out.println(i);
			}
			sc.close();
		}
	}
}