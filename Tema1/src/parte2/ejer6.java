package parte2;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		int pri;
		int seg;
		int ter;
		int cm;
		Scanner sc = new Scanner(System.in);
//Creamos las variables y el escaner		
		System.out.println("Introduzca la primera medida en milimetros:");
		pri = sc.nextInt();
		System.out.println("Introduzca la segunda medida en centimetros:");
		seg = sc.nextInt();
		System.out.println("Introduzca la tercera medida en metros:");
		ter = sc.nextInt();
//Solicitamos las variables y las asignamos
		cm = (pri / 10) + (seg) + (ter * 100);
//Pasamos todas las medidas a centimetros y las sumamos
		System.out.println("El total son: " + cm + " centimetros");
		sc.close();
//Mostramos el resultado y cerramos el escaner		
	}

}
