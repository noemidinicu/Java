package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo del otro.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n2 = scanner.nextInt();
        scanner.close();
        
        if (n1%n2 == 0) {
			System.out.println("Son múltiplos");
		} else {
			System.out.println("No son multiplos");
		}

	}

}
