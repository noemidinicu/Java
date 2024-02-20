package EjercicioBasicos;

import java.util.Scanner;

public class numero4 {

	public static void main(String[] args) {
		// Pedir un número e indicar si es positivo o negativo.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        
        if (n1>=0) {
			System.out.println("El número es positivo");
		} else if(n1<0) {
			System.out.println("El número es negativo");
		}

	}

}
