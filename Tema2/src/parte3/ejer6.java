package parte3;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		int h;
		int m;
		int s;

		Scanner sc = new Scanner(System.in);
//Solicitamos las horas minutos y segundos y los asignamos		
		System.out.println("Introduzca las horas:");
		h = sc.nextInt();
		System.out.println("Introduzca los minutos:");
		m = sc.nextInt();
		System.out.println("Introduzca los segundos:");
		s = sc.nextInt();
//Comprobamos si los datos están bien introducidos, sino lo notificamos		
		if (h < 25 && h >= 0 && m < 61 && m >= 0 && s < 61 && s >= 0) {
//Incrementamos un segundo
			s++;
//Cuando los segundos sean 60, se suma un minuto y se reinician los segundos			
			switch (s) {
			case 60 -> {
				m++;
				s = 0;
			}
//Cuando los segundos son 61, se suma un minuto y los segundos serán 1			
			case 61 -> {
				m++;
				s = 1;
			}
			}
//Cuando los minutos son 60 se suma una hora y se reinician los minutos
//Cuando son 61 se suma una hora y los minutos son 1			
			switch (m) {
			case 60 -> {
				h++;
				m = 0;
			}
			case 61 -> {
				h++;
				m = 1;
			}
			}
//Lo mostramos en pantalla y cerramos el escáner			
			System.out.println("La hora tras sumar un segundo será:\n" + h + " horas" + "\n" + m + " minutos" + "\n" + s
					+ " segundos");
		}

		else {
			System.out.println("Número incorrecto");
		}
		sc.close();

	}

}
