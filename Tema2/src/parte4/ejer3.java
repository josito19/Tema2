package parte4;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
//Creamos el escáner y las variables		
		Scanner sc = new Scanner(System.in);
//numero será el numero leído por el escáner
		int numero;
//suma será	la suma de todos los números positivos introducidos	
		int suma = 0;
//contador será las veces que se repite el bucle		
		int contador = 0;
//media será la suma de los números entre la cantidad de estos 		
		double media;
//Pedimos al usuario los números y los asignamos		
		System.out.println("Introduzca números positivos para calcular su media, y negativo cuando quiera parar:");
		numero = sc.nextInt();
//Creamos un bucle que funcione hasta que el lector lea un número negativo		
		while (numero >= 0) {
//contador incrementará en uno cada vez			
			contador++;
//suma sumará el número siguiente y se asignará el resultado			
			suma += numero;
//Pedimos el siguiente número			
			numero = sc.nextInt();
		}
//Realizamos el cálculo de la media y lo asignamos a la variable	
		media = (double) suma / contador;
//Mostramos la media y cerramos el escáner		
		System.out.println(media);
		sc.close();
	}

}
