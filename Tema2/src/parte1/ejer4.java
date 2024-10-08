package parte1;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
//Creamos las variables y el escáner
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
//Solicitamos dos números y los asignamos a las variables		
		System.out.println("Escriba el primer número:");
		n = sc.nextInt();
		System.out.println("Escriba el segundo número:");
		n1 = sc.nextInt();
//Los ordenamos, mostramos en pantalla y cerramos el escáner		
		if (n < n1) {
			System.out.println("De menor a mayor:\n" + n + "\n" + n1);
		} else {
			System.out.println("De menor a mayor:\n" + n1 + "\n" + n);
		}
		sc.close();
	}

}
