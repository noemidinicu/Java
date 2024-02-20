package EjercicioBasicos;

import java.math.MathContext;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Pedir el radio de un círculo y calcular su área. A=PI*r^2.
		 */
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");
        int radio = scanner.nextInt();
        scanner.close();
        
        double area, r2= radio^2; 
        double PI = Math.PI;
        
        area = (PI+ r2);
        System.out.println("El área del círculo es: "+area);
        		
	}

}
