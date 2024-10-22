package parte5;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n1;
		float n2;
		String op;
		float res;
		boolean salir = false;
		do {
			System.out.println("Introduzca los dos números:");
			n1 = sc.nextFloat();
			n2 = sc.nextFloat();
			System.out.println("A.SUMAR LOS NÚMEROS\r\n" + "B.RESTAR LOS NÚMEROS\r\n" + "C.MULTIPLICAR LOS NÚMEROS\r\n"
					+ "D.DIVIDIR LOS NÚMEROS\r\n" + "E.SALIR\r\n" + "");
			op = sc.next();
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
			case "E" -> {
				salir = true;
			}
			default -> System.out.println("Compruebe las mayúsculas");
			}
		} while (!salir);
		System.out.println("Ha salido correctamente.");
		sc.close();
	}

}
