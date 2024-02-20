package Examen2Parte;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigua si un número es vampiro o no. El método
			debe recibir como parámetro un número entero de 4 cifras y responderá si el
			número es vampiro o no.
			Para averiguar si un número es vampiro hay que dividirlo en dos partes(dos
			colmillos), darle la vuelta a la primera parte(colmillo retorcido) y luego
			multiplicamos las dos partes a ver si obtenemos el número original.
			Ejemplo de cómo funciona:
			Teclea un número de 4 cifras: 1435
			Resultado: Es Vampiro
			Se divide el número en dos partes
			
			14 y 35
			
			Se le da la vuelta al primer número
			
			41 y 35
			
			Luego hace la multiplicación de los dos trozos
			
			41 x 35 = 1435
			
			Como el resultado de la multiplicación es el número original, entonces
			responderá que es “Vampiro”.
			Otros números vampiros son el 1260,1530 y 6880.
		 */
		int numero = 0, Vampiro = 0, cUno, cDos, invertido = 0, bloque1, bloque2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero de 4 cifras: ");
		numero = teclado.nextInt();  
		// Solicito un número de 4 cifras para que lo ingrrese bien
        while (numero < 1000 || numero > 9999) {
            System.out.print("Teclea un número de 4 cifras (SOLO 4): ");
            numero = teclado.nextInt();
        }

        // Separo en dos partes
        bloque1 = numero / 100; //divido entre 100
        bloque2 = numero % 100; //resto de 100

        // Calculamos las cifras y colocamos bien correctamente
        //cUno = bloque1 % 10;
       // cUno = cUno * 10;
        invertido = (bloque1%10)*10 + bloque1/10;
      
        cDos = bloque1 / 10;

        // Sumo cifras y obtengo invertido
        //invertido = cDos + cUno;

        // vampiro igualo con el número invertido y las dos segundas cifras
        Vampiro = invertido * bloque2;

        // Necesito verificar si el número vampiro es igual al original
        if (numero == Vampiro) {
            System.out.println("Este es un numero vampiro");
        } else {
            System.out.println("Este no es un número vampiro");
        }

        teclado.close();
	}

}
