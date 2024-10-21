package parte4;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
//Creamos el escáner y las variables		
		Scanner sc = new Scanner(System.in);
//numero será el entero introducido por el usuario		
		int numero;
//contador será el número de veces que se realiza el bucle		
		int contador = 0;
//Solicitamos los números y los asignamos		
		System.out.println("Números:");
		numero = sc.nextInt();
//Creamos un bucle while el cual pedirá números hasta que se le introduzca uno negativo
		while (numero >= 0) {
			contador++;
//Se incrementa en uno el contador			
			numero = sc.nextInt();
//Se lee y asigna el siguiente numero			
		}
//Cuando sea negativo mostramos el contador		
		System.out.println("Ha introducido " + contador + " números.");
//Cerramos el escáner		
		sc.close();
	}

}
