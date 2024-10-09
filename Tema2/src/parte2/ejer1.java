package parte2;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int nota;
//Solicitamos la nota y la asignamos a la variable
		System.out.println("Escriba su nota:");
		nota = sc.nextInt();
//Si la nota mayor o igual que 0 y menor o igual que 10, se ejecuta el switch 
		if (nota <= 10 && nota >= 0) {
//Examinará los casos y mostrará el resultado en pantalla
			switch (nota) {
			case 0, 1, 2, 3, 4 -> System.out.println("Tiene un insuficiente");
			case 5 -> System.out.println("Tiene un suficiente");
			case 6 -> System.out.println("Tiene un bien");
			case 7, 8 -> System.out.println("Tiene un notable");
			case 9, 10 -> System.out.println("Tiene un sobresaliente");
			}
//Si la nota es distinta a lo ya definido mostrará nota incorrecta			
		} else {
			System.out.println("Nota incorrecta");
		}

		sc.close();
	}

}
