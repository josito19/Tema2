package parte1;

import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {
//Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		String j1;
		String j2;
//Pedimos la jugada y asignamos a los Strings
		System.out.println("Jugador 1 saca:");
		j1 = sc.next();
		System.out.println("Jugador 2 saca:");
		j2 = sc.next();
//Si j1 saca piedra y j2 papel, gana j2
		if (j1.equalsIgnoreCase("piedra") && j2.equalsIgnoreCase("papel")) {
			System.out.println("Gana papel");
//Si j1 saca piedra y j2 saca papel, gana piedra	
		} else {
			if (j1.equalsIgnoreCase("piedra") && j2.equalsIgnoreCase("tijeras")) {
				System.out.println("Gana piedra");
//Si j1 saca tijeras y j2 saca piedra, gana piedra	
			} else {
				if (j1.equalsIgnoreCase("tijeras") && j2.equalsIgnoreCase("piedra")) {
					System.out.println("Gana piedra");
//Si j1 saca tijeras y j2 saca papel, gana papel					
				} else {
					if (j1.equalsIgnoreCase("tijeras") && j2.equalsIgnoreCase("papel")) {
						System.out.println("Gana tijeras");
//Si j1 saca papel y j2 saca tijeras, gana tijeras	
					} else {
						if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("tijeras")) {
							System.out.println("Gana tijeras");
//Si j1 saca papel y j2 saca piedra, gana papel	
						} else {
							if (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("piedra")) {
								System.out.println("Gana papel");
							} else {
								System.out.println("Hay empate");
							}

						}

					}

				}

			}
		}
		sc.close();
	}
}
