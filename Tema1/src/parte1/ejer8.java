package parte1;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		String nom;
		String edad;
//Declaramos las variables		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Como te llamas?");
		nom = sc.nextLine();
		System.out.println("¿Cuantos añitos tienes?");
		edad = sc.nextLine();
//Pedimos al ususario nombre y edad y le asignamos esos valores a las variables		
		System.out.println("Hola " + nom + ", tienes " + edad + " años ¡Estas grandecite ya eh campeone!");
//Hablamos en lenguaje inclusivo no vaya a ser ;)		
		sc.close();
	}

}
