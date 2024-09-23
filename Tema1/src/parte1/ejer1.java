package parte1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creacion del escaner
		int numero = sc.nextInt();
		// creamos la variable numero y metemos la entrada del teclado
		System.out.println("Su numero es " + numero);
		// muestra en pantalla el numero escrito
		sc.close();
	}

}
