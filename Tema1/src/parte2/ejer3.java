package parte2;

import java.util.Scanner;

public class ejer3 {

	public static void main(String[] args) {
		int n;
		int n1;
		int resto;
		int sumar;
//Creamos las variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su primer numero:");
		n = sc.nextInt();
		System.out.println("Escriba su segundo numero:");
	n1 = sc.nextInt();
		resto = n % n1;
//Asignamos a la variable el resto de dividir entre la segunda variable	
		sumar = resto == 0 ? 0 : n1 - resto;
//Si el resto es 0 se queda así, sino se lo restamos al segundo numero 		
		System.out.println("A " + n + " hay que sumarle " + sumar + " para que sea multiplo de " + n1);
		sc.close();
//Lo mostramos en pantalla y cerramos el escaner		
		
	}

}
