package parte1;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
//Pedimos los enteros y asignamos		
		System.out.println("Introduzca dos números enteros:");
		n = sc.nextInt();
		n1 = sc.nextInt();
//Decimos si son iguales o no y cerramos escáner
		if (n == n1) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		sc.close();
	}

}
