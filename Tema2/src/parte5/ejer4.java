package parte5;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		// n será el número por el que se multiplica num
		int n = 1;
		// num será el número escrito por el usuario
		int num;
		// res será el resultado de la multiplicación
		int res;
		// Solicitamos el número y lo asignamos a num
		System.out.println("Introduzca el número:");
		num = sc.nextInt();
		do {
			// Calculamos el resultado de num por n
			res = num * n;
			// Mostramos la operación completa en pantalla
			System.out.println(num + " x " + n + " = " + res);
			// Incrementamos n en uno
			n++;
			// Esto se realizará hasta que n sea 10
		} while (n <= 10);
		// Cerramos el escáner
		sc.close();
	}

}
