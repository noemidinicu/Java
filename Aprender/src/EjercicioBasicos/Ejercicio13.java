package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.
		//Sin años bisiestos.
		
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
		} else if (dia<=30 && (mes==4 || mes==6 || mes==8 || mes==10 ||mes==12)&&año!=0) {
			System.out.println("Fecha correcta");
		} else if (dia<=31 && (mes==1||mes==3||mes==5||mes==7||mes==9||mes==11)&&año!=0) {
			System.out.println("Fecha correcta");
		} else if (dia<=28&&mes==2&&año!=0) {
			System.out.println("Fecha correcta");
		} else {
			System.out.println("Fecha incorrecta");

		}

	}

}
