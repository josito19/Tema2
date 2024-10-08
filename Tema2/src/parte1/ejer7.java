package parte1;

import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int n;
//Solicitamos el número y lo asignamos
		System.out.println("Introduzca un número entre 0 y 99999");
		n = sc.nextInt();
//Si el número = (1-9] tendrá una cifra		
		if (n > 0 && n <= 9) {
			System.out.println("El número tiene una cifra");
		} else {
//Si el número = (10-99] tendrá dos cifras				
			if (n >= 10 && n <= 99) {
				System.out.println("El número tiene dos cifras");
			} else {
// Si el número = (100-999] tendrá tres cifras
				if (n >= 100 && n <= 999) {
					System.out.println("El número tiene tres cifras");
				} else {
//Si el número = (1000-9999] tendrá cuatro cifras					
					if (n >= 1000 && n <= 9999) {
						System.out.println("El número tiene cuatro cifras");
					} else {
//Si el número = (10000-99999] tendrá cinco cifras
						if (n >= 10000 && n <= 99999) {
							System.out.println("El número tiene cinco cifras");
						} else {
//Sino será cero y no tendrá cifras (Suponiendo que se escriba un número entre 0 y 99999)							
							System.out.println("El numero no tiene cifras ya que es cero");
						}

					}

				}

			}

		}

		sc.close();
	}

}
