package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		//Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
		
		int num;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce un número:");
		num = teclado.nextInt(); 
		
		
		while (num!=0) {
			if (num%2==0) {
				System.out.println("El número es par");
			}else{
				System.out.println("El número es impar");
			}
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
		}
		teclado.close();

	}

}
