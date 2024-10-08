package parte1;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
		int n2;
		String orden = "";
//Solicitamos los números y los asignamos a las variables		
		System.out.println("Escriba el primer número:");
		n = sc.nextInt();
		System.out.println("Escriba el segundo número:");
		n1 = sc.nextInt();
		System.out.println("Escriba el tercer número:");
		n2 = sc.nextInt();
//Los ordenamos, mostramos en pantalla y cerramos el escáner
		if (n >= n1 && n1 >= n2) {
			orden = "De mayor a menor:\n" + n + "\n" + n1 + "\n" + n2;
		} else {
			if (n >= n2 && n2 >= n1) {
				orden = "De mayor a menor:\n" + n + "\n" + n2 + "\n" + n1;
			} else {
				if (n1 >= n && n >= n2) {
					orden = "De mayor a menor:\n" + n1 + "\n" + n + "\n" + n2;
				} else {
					if (n1 >= n2 && n2 >= n) {
						orden = "De mayor a menor:\n" + n1 + "\n" + n2 + "\n" + n;
					} else {
						if (n2 >= n && n >= n1) {
							orden = "De mayor a menor:\n" + n2 + "\n" + n + "\n" + n1;
						} else {
							if (n2 >= n1 && n1 >= n) {
								orden = "De mayor a menor:\n" + n2 + "\n" + n1 + "\n" + n;
							} else {
								orden = "Los números son iguales.";
							}
						}
					}
				}
			}
		}

		System.out.println(orden);
		sc.close();
	}
}
