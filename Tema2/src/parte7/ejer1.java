package parte7;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int hora;
		int minuto;
		int segundo;
		int incremento;
		// Pedimos y asignamos horas, minutos y segundos
		do {
			System.out.println("Introduzca las horas:");
			hora = sc.nextInt();
			System.out.println("Introduzca los minutos:");
			minuto = sc.nextInt();
			System.out.println("Introduzca los segundos:");
			segundo = sc.nextInt();
			// Comprobamos que los números estén dentro del rango deseado
			if (minuto >= 60 || segundo >= 60) {
				System.out.println("Formato erróneo");
			}
			break;
			// Si lo están cerramos el bucle
		} while (minuto < 60 || segundo < 60);
		// Pedimos el incremento y lo asignamos
		System.out.println("Introduzca los segundos a incrementar:");
		incremento = sc.nextInt();
		// Sumamos segundos e incremento y asignamos el resultado
		segundo += incremento;
		// Si hay más de 60 segundos los minutos serán la división de su suma con los
		// segundos entre 60
		if (segundo >= 60) {
			minuto += segundo / 60;
			// El resto de dividir los segundos entre 60 serán los segundos restantes
			segundo = segundo % 60;
		}
		// Los minutos igual, si hay más de 60 se suma a las horas y se divide entre 60
		if (minuto >= 60) {
			hora += minuto / 60;
			// El resto de dividir minuto entre 60 serán los minutos restantes
			minuto = minuto % 60;
		}
		// Mostramos la hora actualizada en el formato deseado
		System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
		sc.close();
	}

}
