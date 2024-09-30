package parte2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
// Creamos las variables
		System.out.println("Introduzca el valor de a:");
		a = sc.nextInt();
		System.out.println("Introduzca el valor de b:");
		b = sc.nextInt();
		System.out.println("Introduzca el valor de c:");
		c = sc.nextInt();
		System.out.println("Introduzca el valor de x:");
		x = sc.nextInt();
//Pedimos y asignamos los valores a las variables
		y = (a * (x * x)) + (b * x) + (c);	
		System.out.println("y = " + y);
//Hacemos la ecuacion y enseñamos el resultado		
		sc.close();
	}

}
