package parte6;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int contador = 1;

		System.out.println("Introduzca n:");
		n = sc.nextInt();
		for (contador = 1; contador <= n; contador++) {
			System.out.println(contador);
		}
		sc.close();
	}

}
