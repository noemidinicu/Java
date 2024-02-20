package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		/*
		 * Realizar un juego para adivinar un número. Para ello pedir un número N, y luego ir pidiendo
			números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. El proceso termina
			cuando el usuario acierta.
		 */
		
		int num;
		int aleatorio=(int) (Math.random()*10);
		Scanner teclado= new Scanner(System.in);
		
		do {
			System.out.println("Introduzca otro número: ");
			num=teclado.nextInt();
			if(num>aleatorio) {
				System.out.println("Es menor");
			}else if (num<aleatorio) {
				System.out.println("Es mayor");
			}
		} while (num!=aleatorio); {
			if (num == aleatorio) {
				System.out.println("Has adivinado");
			}else {
				System.out.println("Eres un matao!!!");
			}
				
			
		}
		

	}

}
