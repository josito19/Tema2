package parte1;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
//Hago este ejercicio suponiendo que con "la suma de esos números" se refiere a dos números distintos		
//Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
		int n2;
//Pedimos los tres numeros y los asignamos
		System.out.println("Introduzca el primer número:");
		n = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		n1 = sc.nextInt();
		System.out.println("Introduzca el tercer número:");
		n2 = sc.nextInt();
		sc.close();
//Si n + n1 = n2, diremos que sí
		if (n + n1 == n2) {
			System.out.println("Sí");
//Si n + n2 = n1, diremos que sí
		} else {
			if (n + n2 == n1) {
				System.out.println("Sí");
//Si n1 + n = n2, diremos que sí	
			} else {
				if (n1 + n == n2) {
					System.out.println("Sí");
//Si n1 + n2 = n, diremos que sí	
				} else {
					if (n1 + n2 == n) {
						System.out.println("Sí");
//Si n2 + n1 = n, diremos que sí	
					} else {
						if (n2 + n1 == n) {
							System.out.println("Sí");
//Si n2 + n = n1, diremos que sí	
						} else {
							if (n2 + n == n1) {
								System.out.println("Sí");
//Sino diremos que no	
							} else {
								System.out.println("No");
							}

						}

					}

				}

			}

		}

	}

}
