package parte1;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
		String nom;
		String dir;
		String tel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		nom = sc.nextLine();
		System.out.println("Introduzca su direccion");
		dir = sc.nextLine();
		System.out.println("Introduzca su telefono");
        tel = sc.nextLine();
        System.out.println("Nombre: " + nom);
        System.out.println("Direccion: " + dir);
        System.out.println("Telefono: " + tel);
        sc.close();
	}

}
