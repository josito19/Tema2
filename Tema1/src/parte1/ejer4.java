package parte1;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
//nombramos las variables y creamos el scanner
		double nota;
		double nota1;
		double media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca sus dos notas");
		nota = sc.nextDouble();
		nota1 = sc.nextDouble();
//pedimos las notas y les asignamos el valor que el usuario escriba en pantalla		
		media = (nota + nota1) / 2;
		System.out.println("Su media es " + media);
//hacemos el cálculo de la media y lo mostramos en pantalla		
		sc.close();

	}

}
