package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_3 {

	public static void main(String[] args) {
		 int[] aleatorio = new int[10];

	        // array aleatorios entre 1 y 99
	        Random random = new Random();
	        for (int i = 0; i < aleatorio.length; i++) {
	        	aleatorio[i] = random.nextInt(99) + 1;
	        }

	        // Calcular el centro de masas
	        int Masas = -1;
	        for (int i = 0; i < aleatorio.length; i++) {
	            int sumaAntes = 0;
	            int sumaDespues = 0;

	            for (int j = 0; j < i; j++) {
	                sumaAntes += aleatorio[j];
	            }

	            for (int k = i + 1; k < aleatorio.length; k++) {
	                sumaDespues += aleatorio[k];
	            }

	            if (sumaAntes == sumaDespues) {
	                Masas = i;
	                break; // 
	            }
	        }
	            
	          //NO SE COMO GESTIONAR LO DE MOSTRAR LA POSICION DEL CENTRO DE MASA Y LA DIFERENCIA  Y NO SE ARREGLARLO
	        System.out.println("Array: " + Arrays.toString(aleatorio));
	        System.out.println("Centro de Masas: " + Masas);
	        
	        // te va a dar siempre menos 1 pq ninguno es igual entonces ninguno es el centro de masas, la verdad es que no se como hacerlo asi que, lo siento 
	       

	}

}
