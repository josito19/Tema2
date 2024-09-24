package parte1;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad;
		System.out.println("Introduzca su edad");
//Creamos variables y pedimos la edad
		edad = sc.nextInt();
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
/*
 * Asignamos el valor introducido a la varible edad y creamos un if else el cual
 * nos dirá si es true que es mayor de edad o si es false y por tanto es menor
 */
			sc.close();
		}

	}

}
