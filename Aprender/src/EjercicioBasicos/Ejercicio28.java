package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// Pedir 15 números y escribir la suma total.
		
		Scanner teclado= new Scanner(System.in);
		int num, suma=0;
		for (int i = 0; i <15; i++) {
			System.out.println("Introduce un número: ");
			num=teclado.nextInt();
			suma=suma+num;
		}

		System.out.println(suma);
		teclado.close();
	}

}
