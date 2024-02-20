package EjercicioBasicos;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Pedir el radio de una circunferencia y calcular su longitud.
		 * L = 2πr
		 */
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        int radio = scanner.nextInt();
        scanner.close();
        Double L, PI= Math.PI;
        L= (2*PI)* radio;
        System.out.println("La longitud es: "+ L);
        
        

	}

}
