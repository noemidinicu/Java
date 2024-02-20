package Examen2Parte;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Profesor este ha sido un intento te lo dejo aqui, pero como me estaba rayando y no queria borrarlo 
		 * he hecho uno nuevo, aunque creo que me he liado con todo. En fin... he hecho algo que no hemos dado 
		 * pero se me ha ocurrido por mirar videos de internet que te explican
		 * espero incluso con eso no haberlo hecho mal
		 */
		
		/*
		 * Realiza un programa que seleccione las palabras de la frase que contengan al
			menos tres vocales distintas.
			
			Ejemplo:
			Teclea una frase: Me gusta muchisimo programar en lenguaje java
			Resultado: muchisimo lenguaje
			
			Nota: Supondremos que la frase que nos escriben por teclado está perfecta y no
			tiene símbolos ni cosas raras. El programa debe funcionar con mayúsculas y
			minúsculas.
		 */
		
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		StringTokenizer tokenizer = new
				StringTokenizer(frase);
       // hacemos un bucle para que se repita la acción 
        while (tokenizer.hasMoreTokens()) {
            // Necesito obtener la palabra actual
            String palabra = tokenizer.nextToken();

            // Verifico si la palabra tiene al menos tres vocales distintas
            if (tieneTresVocalesDistintas(palabra)) {
                // Imprimir la palabra si cumple con el requisito
                System.out.print(palabra + " ");
                
                
             // Convertimos la palabra a minúsculas
                String palabraMinuscula = palabra.toLowerCase();
                
                StringBuilder vocales = new StringBuilder();
                
                // hacemos otro bucle 
                for (int i = 0; i < palabraMinuscula.length; i++) {
					char letra = palabraMinuscula.charAt(i);
					
					//Hacemos un si no se encuentra
					if ("aeiou".indexOf(letra) != -1 && vocales.indexOf(String.valueOf(letra))) == -1 {
						vocales.append(letra);
					}
					
				}

                // Verificar si el conjunto de vocales tiene al menos tres elementos
                if (vocales.length() >= 3) {
                    // Imprimir la palabra si cumple con el requisito
                    System.out.print(palabra + " ");
        }
	}

}
