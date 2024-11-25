package talento.edu.examenes;

import java.util.Random;

/*
 * 
 */

public class JesusJSE {
	
	/*
	 * 1. Este metodo de ArrayPrimos.
	 */
	
	public static void main(String[] args) {
	
		
			
			int[] arrayPrimos = new int[10];
			
			for (int i = 0; i < arrayPrimos.length; i++) {
				Random random= new Random();
				
				int numeronuevo = random.nextInt(1, 100);
				
				arrayPrimos[i]=numeronuevo;
			}
			for (int i = 0; i < arrayPrimos.length; i++) {
				System.out.println(arrayPrimos[i]);
				
			}
			
		}
		/*
		 * 2. Este metodo verifica si el numero del array pertenece al array.
		 */
		
		public static boolean estaRepetido (int numeroComprobar, int[] array) {
			
			boolean encontrado = false;
			int posicion = 0;
				do {
					if(numeroComprobar==array[posicion]) {
						encontrado = true;
					} else {
						
						posicion=posicion+1;
					}
				} while ((!encontrado)&&(posicion<array.length));
					
			return encontrado;
		}
		
		/*
		 * 3.Método para encontrar el valor mínimo en un array de enteros vacío.
		 * Método para encontrar el valor máximo en un array de enteros
		 */
		
		public static int obtenerMinimo (int[] arrayEnteros)
		{
			int minimo = 0;
			
			return minimo;
		}
		
		public static int obtenerMaximo (int[] arrayEnteros)
		{
			int maximo = 0;
			
			for (int i = 0; i < arrayEnteros.length; i++) {
				if (arrayEnteros[i]>maximo)
				{
					maximo=arrayEnteros[i];
				}
				
			}
			return maximo;
		}
		
		/*
		 * Este método obtenerMedia calcula correctamente la media de los números en un array de enteros. 
		 */
		
		public static float obtenerMedia (int[] arrayEnteros)
		{
			float media = 0;
			float total = 0;
			for (int i=0; i < arrayEnteros.length; i++) {
				total += arrayEnteros[i];
				
			}
			media = total/arrayEnteros.length;
			return media;
		
	}

}
