package EjercicioBasicos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
		
		int h, m, s;
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
         h = scanner.nextInt();
        System.out.println("Introduce los minutos: ");
         m = scanner.nextInt();
        System.out.println("Introduce los segundos: ");
         s = scanner.nextInt();
        scanner.close();
        
        s++;
        m++;
       
       if (h>23) {
    	   h=0;
    	   }
       if (m>60) {
    	   m=0;
    	   h++;
       		}
       if (s>60) {
    	   s=0;
    	   m++;
        } 
       System.out.println(h+" horas "+m+" minutos "+s+" segundos.");

       

	}

}
