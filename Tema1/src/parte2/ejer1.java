package parte2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
		float n;
		int ent;
		float dec;
		Scanner sc = new Scanner(System.in);
//Creamos las variables	y el escaner	
		System.out.println("Introduzca un numero con decimales:");
		n = sc.nextFloat();
//Pedimos nuestro numero y le asignamos el valor introducido		
		ent = (int) n;
		dec = n - ent;
//Creamos una variable para la parte entera y otra para la decimal		
		n = dec >= 0.5 ? ent++ : ent;
//		
		System.out.println("Su numero es: " + ent);
		sc.close();
	}

}
