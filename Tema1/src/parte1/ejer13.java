package parte1;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean llueve;
		boolean tarea;
		boolean biblio;
		boolean res1;
//Creamos nuestras variables y el escaner
		System.out.println("¿Tiene que ir a la biblioteca?");
		biblio = sc.nextBoolean();
		System.out.println("¿Esta lloviendo?");
		llueve = sc.nextBoolean();
		System.out.println("¿Tiene tarea?");
		tarea = sc.nextBoolean();
//Pedimos los datos y los asignamos a las variables		
		res1 = biblio || (!llueve && !tarea);
		System.out.println(res1 ? "Puede salir" : "No puede salir");

//Utilizamos && y || para darle el valor al resultado y lo mostrmos en pantalla

		sc.close();

	}

}
