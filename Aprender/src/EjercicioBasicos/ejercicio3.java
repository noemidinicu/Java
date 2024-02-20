package EjercicioBasicos;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//Pedir dos números y decir si son iguales o no.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n1 = scanner.nextInt();
        System.out.println("Introduce un número: ");
        int n2 = scanner.nextInt();
        scanner.close();
        
        boolean n3= n1==n2;
        int n4;
        
        System.out.println("¿Son iguales los números?: "+ n3);
        
        /*
         * Tambien lo puedo hacer con un if si es lo que pide el ejercicio
         */
        
        if (n1==n2) {
        	System.out.println("Los numeros son iguales");
        }else {
        	System.out.println("Los numeros son no son iguales");
        }

	}

}
