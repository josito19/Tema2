package parte1;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int res;
		float res1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca sus notas");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		res = (n1 + n2 + n3) / 3;
		System.out.println("Boletín de calificaciones: " + res);
		res1 = (float) (n1 + n2 + n3) / 3;
		System.out.println("Expediente académico: " + res1);

		sc.close();
	}

}
