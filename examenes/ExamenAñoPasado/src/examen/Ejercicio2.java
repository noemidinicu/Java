package examen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigüe si un número entero tiene todas sus cifras
			ordenadas. El programa debe pedir al usuario que teclee un número, y debe
			responder si el número tiene las cifras ordenadas ascendentemente o no.
			Ejemplo:
			El numero 2568 tiene todas sus cifras ordenadas ascendentemente.
			El numero 4637 no tiene las cifras ordenadas.
			
			Nota: El número puede tener un número cualquiera de cifras, no tiene que tener
			exactamente cuatro como en el ejemplo. Si el número tuviese una sola cifra, se
			entenderá que tiene las cifras ordenadas correctamente.
		 */
		        // Crear un objeto Scanner para leer la entrada del usuario
		        Scanner teclado = new Scanner(System.in);

		        // Solicitar al usuario que ingrese un número
		        System.out.print("Ingrese un número entero: ");
		        int num = teclado.nextInt();

		        // Verificar si el número tiene las cifras ordenadas
		        if (cifrasOrdenadas(num)) {
		            System.out.println("El número tiene todas sus cifras ordenadas ascendentemente.");
		        } else {
		            System.out.println("El número no tiene las cifras ordenadas.");
		        }

		        // Cerrar el Scanner
		        teclado.close();
		    }
				static boolean cifrasOrdenadas(int numero) {
				    // Obtiene el último dígito
				    int ultimoDigito = numero % 10;
				    numero /= 10;
			
				    // Verifica cada dígito con el siguiente
				    while (numero > 0) {
				        int digito = numero % 10;
			
				        // Si el dígito actual es mayor que el siguiente, no están ordenados
				        if (digito > ultimoDigito) {
				            return false;
				        }
			
				        ultimoDigito = digito;
				        numero /= 10;
				    }
				    return true;


	}

}
