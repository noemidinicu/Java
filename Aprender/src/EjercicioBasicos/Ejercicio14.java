package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
		//los meses tienen 30 días.
		
		int dia, mes, año;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día: ");
         dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
         mes = scanner.nextInt();
        System.out.println("Introduce el año: ");
         año = scanner.nextInt();
        scanner.close();
        
        
        if (dia==0 || mes == 0 || año==0) {
			System.out.println("Fecha incorrecta");
		} else if (dia<=30 && mes<=12&&año!=0) {
			  if(dia>30);
		} else {
			System.out.println("Fecha incorrecta");

		}


	}

}
