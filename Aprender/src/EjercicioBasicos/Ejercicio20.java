package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*
		 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca
			un 0.
		 */
		
		int num;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt(); 
		
		
		while (num!=0) {
			if (num>0) {
				System.out.println("El número es positivo");
			}else if (num<0) {
				System.out.println("El número es negativo");
			}
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
		}
		teclado.close();

	}

}
