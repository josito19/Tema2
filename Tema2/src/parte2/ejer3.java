package parte2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		float n1;
		float n2;
		String op;
		float res;
//Pedimos los números, los asignamos, y pedimos que seleccione la operación		
		System.out.println("Introduzca el primer número:");
		n1 = sc.nextFloat();
		System.out.println("Introduzca el segundo número:");
		n2 = sc.nextFloat();
		System.out.println(
				"Seleccione una opción:\nA.SUMAR LOS NÚMEROS\nB.RESTAR LOS NÚMEROS\nC.MULTIPLICAR LOS NÚMEROS\nD.DIVIDIR LOS NÚMEROS");
		op = sc.next();
//Si el caracter introducido es A,B,C,D se hace su operación correspondiente
		switch (op) {
		case "A" -> {
			res = (n1 + n2);
			System.out.println("Su suma es: " + res);
		}
		case "B" -> {
			res = (n1 - n2);
			System.out.println("Su resta es: " + res);
		}
		case "C" -> {
			res = (n1 * n2);
			System.out.println("Su multiplicación es: " + res);
		}
		case "D" -> {
			res = (n1 / n2);
			System.out.println("Su división es: " + res);
		}
//Si el carácter no coincide se lo avisamos al usuario y no realizamos operación		
		default -> System.out.println("Revisa las mayúsculas");
		}

		sc.close();
	}

}
