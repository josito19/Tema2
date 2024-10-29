package parte7;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		// Creamos el escáner y las variables
		Scanner sc = new Scanner(System.in);
		int numero;
		int original;
		int reverso = 0;
		// Pedimos al usuario un número mayor o igual a 0 y lo asignamos a numero
		System.out.println("Introduzca un número mayor o igual a 0:");
		numero = sc.nextInt();
		// Comprobamos que el número es válido
		if (numero < 0) {
			System.out.println("El número debe ser mayor o igual que 0.");
		} else {
			// Guardamos el número original para compararlo luego
			original = numero;
			// Invertimos el número
			while (numero > 0) {
				// Cogemos los dígitos
				int digito = numero % 10;
				// Formamos el número invertido
				reverso = reverso * 10 + digito;
				// Borramos el último dígito
				numero /= 10;
			}
			// Comprobamos si el número original es igual al número invertido
			if (original == reverso) {
				System.out.println("El número es capicúa.");
			} else {
				System.out.println("El número no es capicúa.");
			}
		}
		sc.close();
	}
}
