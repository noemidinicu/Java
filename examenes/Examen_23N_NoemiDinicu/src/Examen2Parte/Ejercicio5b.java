package Examen2Parte;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5b {

	public static void main(String[] args) {
		 /*
         * Realiza un programa que seleccione las palabras de la frase que contengan al
         * menos tres vocales distintas.
         * 
         * Ejemplo: Teclea una frase: Me gusta muchisimo programar en lenguaje java
         * Resultado: muchisimo lenguaje
         * 
         * Nota: Supondremos que la frase que nos escriben por teclado está perfecta y
         * no tiene símbolos ni cosas raras. El programa debe funcionar con mayúsculas
         * y minúsculas.
         */

        String frase;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Teclea una frase: ");
        frase = teclado.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(frase);

        // Bucle para buscar palabra
        while (tokenizer.hasMoreTokens()) {
            // Obtenengo palabra 
            String palabra = tokenizer.nextToken();

            // Verificar si la palabra tiene al menos tres vocales distintas
            if (tieneTresVocalesDistintas(palabra)) {
                // Imprimir la palabra si cumple con el requisito
                System.out.print(palabra + " ");
            }
        }

        teclado.close();
    }

    // Cojo un objeto de fuera para poder verificar 
     boolean tieneTresVocalesDistintas(String palabra) {
        // Convierto a minuscular para que sea mas facil 
        String palabraMinuscula = palabra.toLowerCase();

        // Quiero guardar las vocales encontradas asi que las almaceno
        StringBuilder vocalesEncontradas = new StringBuilder();

        // Hago otro bucle
        for (int i = 0; i < palabraMinuscula.length(); i++) {
            char letra = palabraMinuscula.charAt(i);

            // Verifico si la letra es una vocal y que no se repita
            if ("aeiou".indexOf(letra) != -1 && vocalesEncontradas.indexOf(String.valueOf(letra)) == -1) {
                // Agrego la vocal al conjunto de vocales encontradas
                vocalesEncontradas.append(letra);
            }
        }

        // Verificar si el conjunto de vocales tiene al menos tres elementos
        return vocalesEncontradas.length() >= 3;

	}

}
