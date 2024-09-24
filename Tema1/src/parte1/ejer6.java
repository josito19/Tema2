package parte1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		double n1;
		double n2;
		Scanner sc = new Scanner (System.in);
//pedimos al ususario dos numeros y los nombramos como variables
		System.out.println("Escriba dos números");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		System.out.println("Suma: " + (n1+n2));
		System.out.println("Resta: " + (n1-n2));
		System.out.println("Multiplicacion: " + (n1*n2));
		System.out.printf("Division: %.2f", (n1/n2));
		
//imprimimos en pantalla cada operacion
		sc.close();
	}

}
