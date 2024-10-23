package parte6;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		//num será el número leído por el escáner
		int num;
		//primo será el cálculo para saber si es primo o no
		int primo;
		//i será nuestro contador para el for
		int i;
		//veri será para identificar cuando son primos y cuando no
		boolean veri = true;
		//Solicitamos el número y lo asignamos a num con el escáner
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		//Irá dividiendo los números hasta dar con los que no tengan divisores que no 
		//sean ellos mismos o 1
		for (i = 2; i <= num - 1; i++) {
			primo = num % i;
			if (primo == 0) {
				//Cuando sea primo veri será false
				veri = false;
				break;
			}
		}
		//Si veri es true será primo, sino no lo será
		System.out.println(veri ? "Es primo" : "No es primo");
		//Cerramos el escáner
		sc.close();
	}

}
