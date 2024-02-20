package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n2 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n3 = scanner.nextInt();
        scanner.close();
        
        if (n1>n2 && n1>n3 && n2>n3) {
			System.out.println(n1 + " > " + n2 + " > " + n3);
		} else if(n1<n2 && n1>n3 && n2>n3) {
			System.out.println(n2 + " > " + n1 + " > " + n3);
		}else if(n1<n2 && n1<n3 && n2>n3) {
			System.out.println(n2 + " > " + n3 + " > " + n1);
		}else if(n1>n2 && n1>n3 && n2<n3) {
			System.out.println(n1 + " > " + n3 + " > " + n2);
		}else if(n1<n2 && n1>n3 && n2<n3) {
			System.out.println(n3 + " > " + n2 + " > " + n1);
		}else {
			System.out.println(n3 + " > " + n1 + " > " + n2);
		}

	}

}
