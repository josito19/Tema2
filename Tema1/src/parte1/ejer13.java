package parte1;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean llueve;
		boolean tarea;
		boolean biblio;
		String res1 = ("No puede salir");
		String res2 = ("Puede salir");
		
		System.out.println("¿Tiene que ir a la biblioteca?");
		biblio = sc.nextBoolean();
		System.out.println("¿Esta lloviendo?");
		llueve = sc.nextBoolean();
		System.out.println("¿Tiene tarea?");
		tarea = sc.nextBoolean();
		System.out.println(biblio ? res2 : (llueve ? res2 : (tarea ? res1 : res2)));
		System.out.println(biblio&&llueve ? res2 : (llueve ? res2 : (tarea ? res1 : res2)));
	System.out.println(biblio ?  : );
	

	}

}
