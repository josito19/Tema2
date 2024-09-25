package parte1;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		final int IVA = 21;
		float p;
		float res;
//Creamos nuestras variables y la constante iva		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el precio");
//Creamos el escaner y solicitamos el precio		
		p = sc.nextFloat();
		res = (p * IVA / 100) + p;
//Asignamos el valor introducido a p y realizamos la operacion		
		System.out.println("Su precio con iva es: " + res);
		sc.close();
//Mostramos en pantalla el resultado y cerramos el escaner

	}

}
