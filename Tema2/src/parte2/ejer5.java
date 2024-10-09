package parte2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
//Creamos el escáner y las variables		
		Scanner sc = new Scanner(System.in);
		String cc;
		System.out.println("Introduzca la letra del tipo de carnet de conducir:");
		cc = sc.next();
//Mostramos en pantalla a que vehículo corresponde la letra escrita por el usuario
		switch (cc) {
		case "E" -> System.out.println("Corresponde a remolques");
		case "D" -> System.out.println("Corresponde a autobuses");
		case "C1", "C2", "C3", "C4", "C5" -> System.out.println("Corresponde a camiones");
		case "A" -> System.out.println("Corresponde a motocicletas");
		case "B1", "B2" -> System.out.println("Corresponde a automóviles");
//Si se introduce otra cosa, mostraremos categoría no contemplada
		default -> System.out.println("Categoría no contemplada");
		}

		sc.close();
	}

}
