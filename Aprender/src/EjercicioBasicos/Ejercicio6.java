package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pedir dos números y decir cual es el mayor. Este ejercicio es el 7 y el 8 
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n2 = scanner.nextInt();
        scanner.close();
        
        if (n1>n2) {
			System.out.println("El primer numero es mayor");
		} else if(n1==n2){
			System.out.println("Son iguales");
		}else {
			System.out.println("El segundo numero es mayor");
		}

	}

}
