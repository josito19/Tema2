package parte6;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int primo;
		int i;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		for (i = 2; i <= num - 1; i++) {
			primo = num % i;
			if (primo == 0) {
				System.out.println("Si es primo");
			} else {
				System.out.println("No es primo");
			}
		}

		sc.close();
	}

}
