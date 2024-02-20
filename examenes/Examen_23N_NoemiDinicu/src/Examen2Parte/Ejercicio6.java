package Examen2Parte;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. Siempre que escribimos un texto nos surge la duda de si estamos escribiendo
			demasiadas palabras largas; así que vamos a hacer un programa que lea una
			frase y nos diga la longitud media de las palabras.
			Ejemplo:
			Teclea una frase: Que la fuerza te acompañe
			Longitud media: 4.2
		 */
		
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		
		StringTokenizer tokenizer = new StringTokenizer(frase);
		
		//Hago variable pq puedo utilizarlas y son gratis
		
		int palabras = tokenizer.countTokens();
		int longitud = 0;
		
		//Hago un bucle para que cuente
		
		while (tokenizer.hasMoreTokens()) {
			String palabra = tokenizer.nextToken();
			longitud += palabra.length();
		}
	
		
		//hacemos una variable de double por los decimales
		double media;
		
		if (palabras> 0) {
			 media= (double)longitud/palabras;
		}else {
			media= 0.0;
		}
		System.out.println("La longitud media: " + media);
				
			

	}

}
