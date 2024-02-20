package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		
		int num,suma=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt();
		while (num!=0) {
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
			suma=suma+num;
			
		}
		teclado.close();
		System.out.println("La suma es: "+ suma);

	}

}
