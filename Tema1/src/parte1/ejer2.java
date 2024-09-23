package parte1;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creamos el escaner
		System.out.println("¿Cuantos años tienes?");
		int edad = sc.nextInt();
		// creamos la variable edad y le asignamos el escaner
		int e = edad + 1;
		// creamos una variable "e" para sumarle 1 año a la edad
		System.out.println("El año que viene tendra " + e);
		// muestra en pantalla la edad del año que viene
sc.close();
	}

}
