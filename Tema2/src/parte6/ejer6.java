package parte6;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		int i;
		int suspenso = 0;
		System.out.println("Introduzca sus 5 notas:");
		for (i = 1; i < 6; i++) {
			nota = sc.nextInt();
			if (nota < 5) {
				suspenso++;
			}
		}
		System.out.println("Hay " + suspenso + " suspensos.");
		sc.close();
	}

}
