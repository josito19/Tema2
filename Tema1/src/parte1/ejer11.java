package parte1;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int eur;
int peseta;
//Creamos las variables y el scanner
System.out.println("Introduzca los euros");
eur = sc.nextInt();
peseta = eur * 166;
//Asignamos el valor introducido a eur y lo multiplicamos por la conversion en pesetas
System.out.println("Son " + peseta);
//Lo mostramos en pantalla
sc.close();		
		
		
	}

}
