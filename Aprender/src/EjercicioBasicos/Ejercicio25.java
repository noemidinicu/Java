package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		//Pedir números hasta que se introduzca uno negativo, y calcular la media.
		
		int num,suma, contador=0; 
		float media=0f;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt();
		while (num>0) {
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
			suma=suma+num;
		}
		teclado.close();
		media=suma/ contador;
		//media=suma/contador;
		System.out.println("La media es: "+ media);
	}

}
