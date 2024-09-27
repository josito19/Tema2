package parte2;

import java.util.Scanner;

public class ejer2 {

	public static void main(String[] args) {
		int n;
		int resto;
		int sumar;
//Creamos las variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su numero:");
		n = sc.nextInt();
//Creamos el escanern pedimos el numero y le asignamos una variable		
		resto = n % 7;
//Asignamos a la variable el resto de dividir entre 7		
		sumar = resto == 0 ? 0 : 7 - resto;
//Si el resto es 0 se queda así, sino se lo restamos a 7 		
		System.out.println("A " + n + " hay que sumarle " + sumar + " para que sea multiplo de 7");
		sc.close();
//Lo mostramos en pantalla y cerramos el escaner		
	}

}
