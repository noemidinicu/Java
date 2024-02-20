package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de 0 a 9999: ");
        int n1 = scanner.nextInt();
        scanner.close();
        
        int unidadesMillar, decenasMillar, centenas, decenas, unidades;
        
        unidades = n1%10;
        n1= n1/10;
        decenas = n1%100;
        n1= n1/100;
        centenas = n1%1000;
        n1= n1/1000;
        unidadesMillar = n1%10000;
        n1= n1/10000;
        decenasMillar = n1;
        
        System.out.print(unidades+""+decenas+""+centenas+""+unidadesMillar);
	}

}
