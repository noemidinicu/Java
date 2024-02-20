package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		//Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		
		
		int num, contador=0;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt(); 
		
		/*for (int i = 1; i <0; i++) {
		System.out.println(num);
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		}*/
		while (num>0) {
			if (num>=0) {
				contador++;
			}
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
		}
		System.out.println("Han habido "+ contador +" números.");
		teclado.close();

		
		
		

	}

}
