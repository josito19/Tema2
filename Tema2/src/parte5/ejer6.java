package parte5;

import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jugador;
		String jugador2;
		boolean j1 = false;
		boolean j2 = false;
		String otra;
		do {
			do {
				System.out.println("¿Piedra, papel o tijera jugador 1?");
				jugador = sc.next();
				if (jugador.equalsIgnoreCase("piedra")) {
					j1 = true;
				} else if (jugador.equalsIgnoreCase("papel")) {
					j1 = true;
				} else if (jugador.equalsIgnoreCase("tijera")) {
					j1 = true;
				}
			} while (!j1);
			do {
				System.out.println("¿Piedra, papel o tijera jugador 2?");
				jugador2 = sc.next();
				if (jugador2.equalsIgnoreCase("piedra")) {
					j2 = true;
				} else if (jugador2.equalsIgnoreCase("papel")) {
					j2 = true;
				} else if (jugador2.equalsIgnoreCase("tijera")) {
					j2 = true;
				}
			} while (!j2);
			if (jugador.equalsIgnoreCase("piedra")) {
				if (jugador2.equalsIgnoreCase("piedra")) {
					System.out.println("Empate");
				} else if (jugador2.equalsIgnoreCase("papel")) {
					System.out.println("Gana el jugador 2");
				} else if (jugador2.equalsIgnoreCase("tijera")) {
					System.out.println("Gana jugador 1");
				}
			} else if (jugador.equalsIgnoreCase("papel")) {
				if (jugador2.equalsIgnoreCase("piedra")) {
					System.out.println("Gana el jugador 1");
				} else if (jugador2.equalsIgnoreCase("papel")) {
					System.out.println("Empate");
				} else if (jugador2.equalsIgnoreCase("tijera")) {
					System.out.println("Gana el jugador 2");
				}
			} else if (jugador.equalsIgnoreCase("tijera")) {
				if (jugador2.equalsIgnoreCase("piedra")) {
					System.out.println("Gana el jugador 2");
				} else if (jugador2.equalsIgnoreCase("papel")) {
					System.out.println("Gana el jugador 1");
				} else if (jugador2.equalsIgnoreCase("tijera")) {
					System.out.println("Empate");
				}
			}
			System.out.println("¿Quiere volver a jugar?");
			otra = sc.next();
		} while (otra.equalsIgnoreCase("s"));
		sc.close();
	}

}
