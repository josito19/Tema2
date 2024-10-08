package parte1;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		double discriminante;
		double resultado1;
		double resultado2;
//Solicitamos los coeficientes y los asignamos
		System.out.println("Primer coeficiente:");
		a = sc.nextInt();
		System.out.println("Segundo coeficiente:");
		b = sc.nextInt();
		System.out.println("Tercer coeficiente:");
		c = sc.nextInt();
//Calculamos el discriminante
		discriminante = (b * b) - (4 * a * c);
//Si es cero, habrá una solución, la calculamos y la mostramos		
		if (discriminante == 0) {
			resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			System.out.println("Hay una solución: " + resultado1);
		} else {
//Si es menor que cero no habrá soluciones			
			if (discriminante < 0) {
				System.out.println("No hay soluciones reales");
			} else {
//Si es mayor que 0 habrá dos soluciones, las mostramos
				resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
				resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
				System.out.println("Hay dos soluciones reales: " + resultado1 + " y " + resultado2);
			}
		}

		sc.close();
	}

}
