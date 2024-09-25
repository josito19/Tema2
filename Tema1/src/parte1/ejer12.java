package parte1;

import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
float man;
float per;
Scanner sc = new Scanner(System.in);
//creamos las variables y el scanner
System.out.println("¿Cuantos kilos de manzanas y peras ha vendido?");
man = sc.nextFloat();
per = sc.nextFloat();
//Pedimos los datos y los asignamos a las variables
System.out.println("Ha ganado " + ((man * 2.35) + (per * 1.95)));
//hacemos el calculo y mostramos el resultado
sc.close();
	}

}
