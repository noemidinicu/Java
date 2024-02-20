package examenRepaso1ªEv;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Realiza un programa que averigüe si un número entero tiene todas sus cifras
			ordenadas. El programa debe pedir al usuario que teclee un número, y debe
			responder si el número tiene las cifras ordenadas ascendentemente o no.
					Ejemplo:
					El numero 2568 tiene todas sus cifras ordenadas ascendentemente.
					El numero 4637 no tiene las cifras ordenadas.
			
			Nota: El número puede tener un número cualquiera de cifras, no tiene que tener
			exactamente cuatro como en el ejemplo. Si el número tuviese una sola cifra, se
			entenderá que tiene las cifras ordenadas correctamente.
		 */
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean ordenado = true; //flag para indicar si está ordenado o no
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		//solución usando un String
		String texto = String.valueOf(numero); //convierto el número a texto
		
		for (int i = 0; i <texto.length()-1 ; i++) {
			if (texto.charAt(i) > texto.charAt(i+1)) {
				ordenado = false;
			}
			
		}
				
		if (ordenado) {
			System.out.println("Las cifras están ordenadas");
		} else {
			System.out.println("Las cifras NO están ordenadas");
		}
		
	}

}






