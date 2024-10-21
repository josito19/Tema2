package parte4;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//Creamos las variables y el escáner		
		Scanner sc = new Scanner(System.in);
//numero será el número introducido en el escáner		
		int numero;
//numero2 será el siguiente número introducido		
		int numero2 = 0;
//Pedimos el número y lo asignamos a la variable numero
		System.out.println("Escriba los números a sumar, cuando desee terminar escriba un número negativo:");
		numero = sc.nextInt();
//Creamos un bucle while para cuando el siguiente número introducido no sea negativo		
		while (numero2 >= 0) {
//A la variable numero se le sumará numero2 y se le asignará el resultado			
			numero += numero2;
//Pedimos el siguiente número			
			numero2 = sc.nextInt();
		}
//Cuando numero2 sea negativo el bucle parará y mostrará el resultado de todas las sumas		
		System.out.println("La suma total es: " + numero);
//Cerramos el escáner
		sc.close();
	}

}
