package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        int n1 = scanner.nextInt();
        scanner.close();
        
        if (n1<=4) {
			System.out.println("Tienes un insuficiente");
		} else if(n1==5) {
			System.out.println("Tienes un suficiente");
		}else if(n1==6) {
			System.out.println("Tienes un bien");
		}else if(n1<9&&n1>6) {
			System.out.println("Tienes un notable");
		}else if(n1>=9&&n1<11) {
			System.out.println("Tienes un sobresaliente");
		}else {
			System.out.println("Eso para ti es una nota");
		}

	}

}
