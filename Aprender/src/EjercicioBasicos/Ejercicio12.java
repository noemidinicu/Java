package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
		//30 días.
		
		int dia, mes, año;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día: ");
         dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
         mes = scanner.nextInt();
        System.out.println("Introduce el año: ");
         año = scanner.nextInt();
        scanner.close();
        
        if (dia<30 && mes<12 && año!=0) {
			System.out.println("La fecha es correcta");
		}else {
			System.out.println("¿Que fecha es esa?");
		}

	}

}
