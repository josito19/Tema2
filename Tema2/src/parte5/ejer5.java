package parte5;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 50;
		String adivina;
		boolean resp = false;
		System.out.println("Piense en un número entre 1-100");
		do {
			System.out.println("¿Su número es mayor, menor o igual que " + numero + "?");
			adivina = sc.next();
			if (adivina.equalsIgnoreCase("mayor")) {
				numero++;
				resp = false;
			}
			if (adivina.equalsIgnoreCase("menor")) {
				numero--;
				resp = false;
			}
			if (adivina.equalsIgnoreCase("igual")) {
				resp = true;
			}
		} while (!resp);
		System.out.println("Su número es " + numero);

		sc.close();
	}

}
