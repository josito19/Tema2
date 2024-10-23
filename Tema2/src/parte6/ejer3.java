package parte6;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double media = 0.0;
		int i;

		System.out.println("Introduzca diez números:");

		for (i = 1; i <= 10; i++) {
			num = sc.nextInt();
			media += num;
		}

		System.out.println(media / 10);
		sc.close();
	}

}
