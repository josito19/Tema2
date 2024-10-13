package parte3;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
		int mil;
		int cien;
		int diez;
		int u;
//Solicitamos el número y lo asignamos a la variable		
		System.out.println("Introduca un número del 0 al 9999:");
		n = sc.nextInt();
		mil = n / 1000;
		cien = (n / 100) % 10;
		diez = (n / 10) % 10;
		u = n % 10;
//Tras calcular las unidades, decenas, centenas y milésimas, comprobamos que el número está dentro del rango deseado		
		if (n >= 0 && n <= 9999) {
			if (n >= 0 && n < 10) {
				System.out.println("Un número de una cifra siempre será capicúo");
			} else {
//Números de una cifra siempre serán capicúos.Con dos cifras lo serán si decena = unidad				
				if (n > 9 && n < 100) {

					switch (n) {
					case 11 -> System.out.println("Es capicúa");
					case 22 -> System.out.println("Es capicúa");
					case 33 -> System.out.println("Es capicúa");
					case 44 -> System.out.println("Es capicúa");
					case 55 -> System.out.println("Es capicúa");
					case 66 -> System.out.println("Es capicúa");
					case 77 -> System.out.println("Es capicúa");
					case 88 -> System.out.println("Es capicúa");
					case 99 -> System.out.println("Es capicúa");
					default -> System.out.println("No es capicúa");
					}

				} else {
//Con 3 cifras si centenas = unidades					
					if (n > 99 && n < 1000) {

						if (cien == u) {
							System.out.println("Es capicúa");
						} else {
							System.out.println("No es capicúa");
						}

					} else {
//Con 4 cifras si milésimas = unidades y decenas = centenas						
						if (n > 999 && n < 10000 && mil == u && diez == cien) {
							System.out.println("Es capicúa");
						} else {
							System.out.println("No es capicúa");
						}
					}

				}

			}

		} else {
			System.out.println("Número incorrecto.");
		}

		sc.close();
	}

}
