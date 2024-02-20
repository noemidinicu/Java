package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos ordenados de mayor a menor.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n2 = scanner.nextInt();
        scanner.close();
        
        if (n1>n2) {
			System.out.println(n1 + " > " + n2);
		} else {
			System.out.println(n2 + " > " + n1);
		}
	}
}
