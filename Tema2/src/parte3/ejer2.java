package parte3;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		double n;
		boolean neg;
	
		System.out.println("Introduzca el número");
		n = sc.nextDouble();
		neg = n < 0;
		n = neg ? (int) Math.sqrt(n * n) : n;
		
		System.out.println("El valor absoluto de " + (int) n + " es: " + (int) n);

		
sc.close();		
	}

}
