package parte4;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		// edad serán las edades introducidas por el usuario
		int edad = 0;
		// suma será la suma de todas las edades
		int suma = 0;
		// contador será el número de veces que se realiza el bucle
		int contador = 0;
		// media será la media de las edades introducidas
		float media = 0;
		// mayores será el número de mayores de edad total
		int mayores = 0;
		// Solicitamos las edades y las asignamos a la variable edad
		System.out.println("Introduzca las edades, para detener introduzca un negativo");
		edad = sc.nextInt();
		// Creamos un bucle while para cuando las edades sean positivas
		while (edad >= 0) {
			// Aumentamos en uno el contador cada vez
			contador++;
			// Sumamos las edades y las asignamos a suma
			suma += edad;
			// Si tienen más de 18 aumentamos en uno la variable mayores
			if (edad >= 18) {
				++mayores;
			}
			// Solicitamos el siguiente número
			edad = sc.nextInt();
		}
		// Calculamos la media y la asignamos, casteando a float para mostrarla
		// correctamente
		media = (float) suma / contador;
		// Mostramos las variables necesarias y cerramos el escáner
		System.out.println("Suma: " + suma + "\nMedia: " + media + "\nNúmero de alumnos: " + contador
				+ "\nMayores de edad: " + mayores);
		sc.close();
	}

}
