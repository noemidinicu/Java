package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de 0 a 9999: ");
        int n1 = scanner.nextInt();
        scanner.close();
        
        if (n1<9) {
			System.out.println("Es de una cifra");
		} else if(n1>9&&n1<99){
			System.out.println("Es de dos cifras");
		} else if(n1>99&&n1<999){
			System.out.println("Es de tres cifras");
		} else if(n1>999&&n1<9999){
			System.out.println("Es de cuatro cifras");
		}else {
			System.out.println("No te pases de cifras");
		}

	}

}
