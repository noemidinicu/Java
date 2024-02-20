package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		//Pedir un número N, y mostrar todos los números del 1 al N.
		
		int num, i;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt();
		i=1;
		while  (i<=num){
		System.out.println(i);
		i++;
		 }
	}

}