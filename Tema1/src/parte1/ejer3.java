package parte1;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*creamos las variables que vamos a usar, año es el año en el que estamos,
 año1 es el año de nacimiento y edad será el resultado del cálculo*/
		int año;
		int año1;
		int edad;
//pedimos introducir el año
		System.out.println("¿En que año estamos?");
		año = sc.nextInt();
//asignamos el valor a introducir por el usuario a nuestra variable año
		System.out.println("¿En que año naciste?");
		año1 = sc.nextInt();
//asignamos el valor a introducir por el usuario a nuestra variable año1 		
		edad = año - año1;
//restamos el año en el que estamos y el año de nacimiento y mostramos en pantalla el resultado		
		System.out.println("Su edad es " + edad);
		sc.close();
	}

}
