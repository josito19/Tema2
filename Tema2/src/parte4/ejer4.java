package parte4;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
//Creamos el escáner y las variables		
		Scanner sc = new Scanner(System.in);
//numero serán los números reales introducidos		
		int numero;
//contador será las veces que se realiza el bucle		
		int contador = 0;
//suma será la suma de los números positivos		
		int suma = 0;
//cero será el número de veces que sale un cero		
		int cero = 0;
//media será la media de los números negativos		
		float media = 0;
//negativo será la cantidad de números negativos que hay		
		int negativo = 0;
//numNegativos será la suma de los números negativos		
		int numNegativos = 0;
//Pedimos al usuario los 10 números reales		
		System.out.println("Introduzca 10 números reales:");
//Creamos un bucle que almacene 10 números		
		while (contador < 10) {
//Asignamos a numero el número escrito por el usuario			
			numero = sc.nextInt();
//Incrementamos el contador en uno			
			contador++;
//Si el número es positivo se sumará y almacenará en la variable suma			
			if (numero > 0) {
				suma += numero;
			}
//Si el número es cero se aumentará en uno la variable cero			
			if (numero == 0) {
				cero++;
			}
//Si el número es negativo se aumenta en uno negativo y se suman y almacenan
//los negativos en numNegativo para luego realizar su media 
			if (numero < 0) {
				negativo++;
				numNegativos += numero;
				media = (float) numNegativos / negativo;
			}

		}
//Mostramos en pantalla la suma, la media y el número de ceros		
		System.out.println("Suma positivos:" + suma + "\nMedia negativos:" + media + "\nNúmero ceros:" + cero);
//Cerramos el escáner
		sc.close();
	}

}
