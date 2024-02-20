package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30
			días.
		 */
		
		int dia, mes, año,dia2,mes2,año2;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día: ");
         dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
         mes = scanner.nextInt();
        System.out.println("Introduce el año: ");
         año = scanner.nextInt();
         System.out.println("Introduce la segunda fecha");
         System.out.println("Introduce el día: ");
         dia2 = scanner.nextInt();
        System.out.println("Introduce el mes: ");
         mes2 = scanner.nextInt();
        System.out.println("Introduce el año: ");
         año2 = scanner.nextInt();
        scanner.close();
        
        if (dia<30 && mes<12 && año!=0) {
			System.out.println("La fecha es correcta");
		}else {
			System.out.println("¿Que fecha es esa?");
		}
		
		if (dia2<30 && mes2<12 && año2!=0) {
				System.out.println("La fecha es correcta");
		}else {
			System.out.println("¿Que fecha es esa?");
		}
		
		System.out.println("Esta es la diferencia "+(dia2 - dia)+"/"+(mes2 -mes)+"/"+(año2-año));
				
	}

}
