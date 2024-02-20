package ejercicios;

public class Ejercicio_4 {

	public static void main(String[] args) {
	        int tamañoX =7;
	         String dibujoX = dibujoXGrande(tamañoX);
	        
	        System.out.println(dibujoX);
	        
	}
	
	static String dibujoXGrande (int tamaño) {
		StringBuilder dibujo = new StringBuilder();
		
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j <tamaño; j++) {
				if (i==j || i+j == tamaño-1) {
					dibujo.append("x");
				}else {
					dibujo.append(" ");
				}
			}
			
			dibujo.append("\n");
			
		}
		return dibujo.toString();
	}
	
	
	
	}
