package parte6;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;

		System.out.println("Introduce dos números:");
		a = sc.nextInt();
		b = sc.nextInt();

		// Si A es menor que B
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
		// Si B es menor que A
		else if (b < a) {
			for (int i = b; i <= a; i++) {
				System.out.println(i);
			}
		}
		// Si A y B son iguales, mostrar uno de los dos
		else {
			System.out.println("Los números son iguales: " + a);
		}

		sc.close();
	}
}