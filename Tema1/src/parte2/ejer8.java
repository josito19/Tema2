package parte2;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double l;
		double l1;
		int l2;
		System.out.println("Ingrese la longitud en metros:");
//Creamos el escaner y pedimos la longitud
		l = sc.nextDouble();
		l1 = l * 100;
//Asignamos el valor ingresado y realizamos la conversion		
		l2 = (int) l1;
//Lo casteamos a entero para que no muestre los decimales sobrantes
		System.out.println("Son " + l2 + " centimetros.");
		sc.close();
//Lo mostramos en pantalla y cerramos el escaner
	}

}
