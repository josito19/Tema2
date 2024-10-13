package deberes;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
//Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int u;
		String uni = "";
		int d;
		String dec = "";
//Pedimos el número y lo asignamos		
		System.out.println("Introduzca un número del 1 al 99:");
		n = sc.nextInt();
		u = n % 10;
		d = (n / 10) % n;
//Comprobamos que está en el rango deseado		
		if (n <= 99 && n >= 1) {
			switch (u) {
			case 1 -> uni = "uno";
			case 2 -> uni = "dos";
			case 3 -> uni = "tres";
			case 4 -> uni = "cuatro";
			case 5 -> uni = "cinco";
			case 6 -> uni = "seis";
			case 7 -> uni = "siete";
			case 8 -> uni = "ocho";
			case 9 -> uni = "nueve";
			}
			switch (d) {
			case 1 -> dec = "dieci";
			case 2 -> dec = "veinti";
			case 3 -> dec = "treinta";
			case 4 -> dec = "cuarenta";
			case 5 -> dec = "cincuenta";
			case 6 -> dec = "sesenta";
			case 7 -> dec = "setenta";
			case 8 -> dec = "ochenta";
			case 9 -> dec = "noventa";
			}
			if (n > 9 && n < 16 || u == 0) {
				switch (n) {
				case 0 -> System.out.println("Cero");
				case 10 -> System.out.println("Diez");
				case 11 -> System.out.println("Once");
				case 12 -> System.out.println("Doce");
				case 13 -> System.out.println("Trece");
				case 14 -> System.out.println("Catorce");
				case 15 -> System.out.println("Quince");
				case 20 -> System.out.println("Veinte");
				case 30 -> System.out.println(dec);
				case 40 -> System.out.println(dec);
				case 50 -> System.out.println(dec);
				case 60 -> System.out.println(dec);
				case 70 -> System.out.println(dec);
				case 80 -> System.out.println(dec);
				case 90 -> System.out.println(dec);
				}
			} else {
				if (n > 0 && n < 10) {
					System.out.println(uni);
				} else {
					System.out.println(dec + " y " + uni);
				}
			}
		} else {
			System.out.println("Número incorrecto");
		}

		sc.close();
	}

}
