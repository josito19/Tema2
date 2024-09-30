package parte2;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		int seg;
		int min;
		int horas;
		int res;
		Scanner sc = new Scanner(System.in);
//Creamos las variables y el escaner
		System.out.println("Introduzca los segundos:");
		seg = sc.nextInt();
//Pedimos los segundos y los asignamos a seg
		min = (seg % 3200) / 60;
//El resto de dividir los segundos entre 3200 dividido entre 60 serán nuestros minutos
		horas = seg / 3200;
//En una hora hay 3200 segundos		
		res = seg % 60;
//Los segundos restantes serán el resto de dividir los segundos tras las operaciones entre 60
		System.out.println(
				"En " + seg + " segundos hay:\n" + horas + " horas\n" + min + " minutos\n" + res + " segundos");
		sc.close();
	}

}
