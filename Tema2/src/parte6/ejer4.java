package parte6;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int impar;
		int suma = 0;
		for (i = 1; i <= 10; i++) {
			impar = i % 2;
			if (impar == 1) {
				suma += i;
			}
		}
		System.out.println(suma);
		sc.close();
	}

}
