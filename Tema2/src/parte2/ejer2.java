package parte2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
//Pedimos el numero y lo asignamos
		System.out.println("Introduzca un número del 1-7:");
		n = sc.nextInt();
//Si el número está entre 1-7 se ejecuta el switch		
		if (n >= 1 && n <= 7) {
//Examina los casos y muestra en pantalla el dia al que corresponde
			switch (n) {
			case 1 -> System.out.println("El número 1 corresponde a lunes");
			case 2 -> System.out.println("El número 2 corresponde a martes");
			case 3 -> System.out.println("El número 3 corresponde a miércoles");
			case 4 -> System.out.println("El número 4 corresponde a jueves");
			case 5 -> System.out.println("El número 5 corresponde a viernes");
			case 6 -> System.out.println("El número 6 corresponde a sábado");
			case 7 -> System.out.println("El número 7 corresponde a domingo");
			}
//Si no corresponde a ninguno = número incorrecto, cerramos el escáner			
		} else {
			System.out.println("Introduzca un número válido");
		}

		sc.close();
	}

}
