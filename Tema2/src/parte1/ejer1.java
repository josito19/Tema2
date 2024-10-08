package parte1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int n1;
//Pedimos el número y asignamos a la variable con el escáner
		System.out.println("Introduzca un número: ");
		n = sc.nextInt();
//Calculamos el resto de dividir n entre 2
		n1 = n % 2;
//Si el resto es 0 será par, sino será impar, mostramos y cerramos escáner
		if (n1 == 0) {
			System.out.println("Es par.");
		} else {
			System.out.println("Es impar.");
		}
		sc.close();
	}

}
