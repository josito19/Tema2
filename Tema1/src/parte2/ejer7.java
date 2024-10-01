package parte2;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {

		int inf;
		int ad;
		float p1;
		float p2;
		float pf;
		float imp;
		float desc;
		Scanner sc = new Scanner(System.in);
//Creamos las variables y el escaner
		System.out.println("Promoción disponible, si su importe es superior a 100€\ntendrá un 5% de descuento.");
		System.out.println("¿Cuantas entradas infantiles quiere?");
		inf = sc.nextInt();
		System.out.println("¿Y cuantas de adultos?");
		ad = sc.nextInt();
//Informamos de la promocion y pedimos el numero de entradas de ambos tipos
		p1 = (float) (inf * 15.50);
		p2 = ad * 20;
		pf = p1 + p2;
//Multiplicamos el numero de entradas por su precio	y lo sumamos			
		desc = (float) (pf * 0.05);		
		imp = (pf >= 100) ? pf - desc : pf;
//Aplicamos el descuento si el importe supera los 100 euros
		System.out.println("Su importe es: " + imp + "€");
		sc.close();
//Mostramos el importe y cerramos el escaner
	}

}
