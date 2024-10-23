package parte6;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int multiplo;
		int i;
		System.out.println("Introduzca un número:");

		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			multiplo = i % 3;
			if (multiplo == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
