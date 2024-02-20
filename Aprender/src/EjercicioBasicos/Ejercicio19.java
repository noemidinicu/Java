package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
			negativo.
		 */
		
		int num, cuadrado;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt(); 
		while (num>=0) {
			cuadrado=num*num;
			System.out.println(cuadrado);
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
		}
		teclado.close();

	}

}
