package parte3;

import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {
//Creamos el escáner y las variables		
		int ran1;
		int ran2;
		int sum;

		Scanner sc = new Scanner(System.in);
//Creamos los dos números aleatorios y los mostramos		
		ran1 = (int) (Math.random() * 99) + 1;
		ran2 = (int) (Math.random() * 99) + 1;
		System.out.println("Sume estos dos números:\n" + ran1 + "\n" + ran2);
//Asignamos la suma a una variable
		sum = sc.nextInt();
//Si el número introducido coincide con la suma res correcto, sino incorrecto		
		if (ran1 + ran2 == sum) {
			System.out.println("Resultado correcto, enhorabuena!");
		} else {
			System.out.println("Resultado incorrecto, más suerte a la próxima.");
		}

		sc.close();
	}

}
