package parte2;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		String d1;
		String d2;
		int n1 = 0;
		int n2 = 0;
		int res;
//Pedimos la primera y segunda tiradas y las asignamos		
		System.out.println("¿Cuánto ha salido en la primera tirada?");
		d1 = sc.next();
		System.out.println("¿Cuánto ha salido en la segunda tirada?");
		d2 = sc.next();
//Si el usuario introdujo UNO,DOS,etc se asignará ese valor a n, sino formato incorrecto
		switch (d1) {
		case "UNO" -> n1 = 1;
		case "DOS" -> n1 = 2;
		case "TRES" -> n1 = 3;
		case "CUATRO" -> n1 = 4;
		case "CINCO" -> n1 = 5;
		case "SEIS" -> n1 = 6;
		default -> System.out.println("Formato incorrecto");
		}
		switch (d2) {
		case "UNO" -> n2 = 1;
		case "DOS" -> n2 = 2;
		case "TRES" -> n2 = 3;
		case "CUATRO" -> n2 = 4;
		case "CINCO" -> n2 = 5;
		case "SEIS" -> n2 = 6;
		default -> System.out.println("Formato incorrecto");
		}
//Sumamos los resultados y lo mostramos en pantalla, cerramos el escáner		
		res = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + res);
		sc.close();
	}

}
