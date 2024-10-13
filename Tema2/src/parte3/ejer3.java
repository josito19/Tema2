package deberes;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int dni;
		int l;
		String d;
//Solicitamos el número y lo asignamos		
		System.out.println("Ingrese su dni sin letra");
		dni = sc.nextInt();
//Calculamos el resto de dividir el dni entre 23		
		l = dni % 23;
//Comprobamos que el número introducido está dentro del rango definido		
		if (dni >= 10000000 && dni <= 100000000) {
			switch (l) {
			case 0 -> {
				d = "T";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);
//Hacemos las asignaciones de las letras a los números y lo mostramos en pantalla			
			}
			case 1 -> {
				d = "R";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);
			}
			case 2 -> {
				d = "W";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 3 -> {
				d = "A";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 4 -> {
				d = "G";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 5 -> {
				d = "M";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 6 -> {
				d = "Y";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 7 -> {
				d = "F";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 8 -> {
				d = "P";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 9 -> {
				d = "D";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 10 -> {
				d = "X";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 11 -> {
				d = "B";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 12 -> {
				d = "N";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 13 -> {
				d = "J";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 14 -> {
				d = "Z";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 15 -> {
				d = "S";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 16 -> {
				d = "Q";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 17 -> {
				d = "V";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 18 -> {
				d = "H";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 19 -> {
				d = "L";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 20 -> {
				d = "C";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 21 -> {
				d = "K";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			case 22 -> {
				d = "E";
				System.out.println("Su letra es " + d + ".\nPor lo tanto su dni completo es: " + dni + d);

			}
			}
		} else {
			System.out.println("Número incorrecto");
//Si no está en el rango definido, número incorrecto		
		}
		sc.close();
	}

}
