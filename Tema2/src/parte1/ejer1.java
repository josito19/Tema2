package parte1;

import java.util.Scanner;

public class ejer1 {

	public static void main(String[] args) {
//Creamos el escáner y la variable
Scanner sc = new Scanner(System.in);
int n;
int n1;
System.out.println("Introduzca un número: ");
n = sc.nextInt();
n1 = n % 2;
if (n1 == 0) {
	System.out.println("Es par.");
} else {
System.out.println("Es impar.");
}
		
sc.close();		
	}

}
