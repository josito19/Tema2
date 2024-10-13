package parte3;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int mes;
		int año;
		int dias = 0;
		boolean bi;
//Solicitamos el número del mes y el año y los asignamos a una variable		
		System.out.println("Introduzca el número del mes:");
		mes = sc.nextInt();
		System.out.println("Introduzca el año:");
		año = sc.nextInt();
//Comprobamos que el número está dentro del rango deseado		
		if (mes < 13 && mes > 0) {
//Calculamos si el año es divisible entre 4
			bi = (año % 4 == 0);
//Diferenciamos los meses por los días que tienen en total			
			switch (mes) {
			case 1, 3, 5, 7, 9, 11 -> dias = 31;
			case 4, 6, 8, 10, 12 -> dias = 30;
//Si es bisiesto, febrero tiene 29 días			
			case 2 -> {
				if (bi = true) {
					dias = 29;
				} else {
					dias = 28;
				}
			}
			}

		} else {
//Si no está en el rango mostramos en pantalla el error			
			System.out.println("Mes erróneo");
		}
//Mostramos los días que tiene el mes y cerramos escáner		
		System.out.println("El mes " + mes + " tiene: " + dias + " días.");
		sc.close();
	}

}
