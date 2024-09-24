package parte1;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		double radio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el radio");
//creamos el escaner y solicitamos el radio
		radio = sc.nextDouble();
		double longitud = 2 * (Math.PI) * (radio);
		double area = Math.PI * (radio * radio);
		System.out.println("La longitud es " + longitud + " y el area es " + area);
// designamos las variables con sus calculos pertinentes y los mostramos en pantalla
		sc.close();

	}

}
