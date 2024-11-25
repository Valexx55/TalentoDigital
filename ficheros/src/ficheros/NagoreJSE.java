package ficheros;

import java.util.Random;

public class NagoreJSE {
	
	/**
	 *  Método para encontrar el valor mínimo en el array de enteros:
	 * @param arrayEnteros
	 * @return
	 */
	
	public static int minimo (int[] arrayEnteros) {
		
		int minimo = 100; 
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			
			/**
			 *  Si encontramos un valor menor al actual mínimo, lo actualizamos:
			 */
	
			if (arrayEnteros[i] < minimo) {
				
				minimo = arrayEnteros[i]; 
			}
		}
		
		/**
		 *  Retorna el valor mínimo encontrado: 
		 */
		
		return minimo; 
	}

	
	/** Método para encontrar el valor maximo en el array de enteros:
	 * @param arrayEnteros
	 * @return
	 */
	
	public static int maximo (int[] arrayEnteros) {
		
		int maximo = 0; 
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			
			if (arrayEnteros[i] > maximo) {
				
				maximo = arrayEnteros[i];
			}
		}
		
		return maximo; 
	}
	
	
	/**
	 *  Método para calcular la media de los valores en el array de enteros:
	 * @param arrayEnteros
	 * @return
	 */
	
	public static float media (int[] arrayEnteros) {
		
		float media = 0; 
		
		float total = 0; /** Variable para almacenar la suma de los valores del array.*/
		
		/** Iteramos sobre el array sumando todos los elementos: */
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			
			total = total + arrayEnteros[i];
		}
		
		System.out.println("El total es: " + total);
		
		/** Calculamos la media: */
		
		media = total/arrayEnteros.length; 
		
		return media; 
	}
	
	/** 
	 * Método que genera un array de 
	 * 10 números aleatorios entre un límite inferior y superior: 
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	
	public static int[] numerosAleatorios(int limiteInferior, int limiteSuperior)
	{
		int[] numerosAleatorios = new int[10];
		
			for (int i = 0; i < numerosAleatorios.length; i++) {
				
				/**
				 *  Genera un número aleatorio: 
				 */
				
				Random random = new Random();
				
				int numeronuevo = random.nextInt(1, 100);
				
				/**
				 *  Asignamos el número generado a la posición del array: 
				 */
				
				numerosAleatorios[i] = numeronuevo;
			}
		
		return numerosAleatorios;
	}
	
	
	/**
	 *  Método para mostrar los números del array:
	 * @param array
	 */
	
	public static void mostrarArray (int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ ", ");
		}
	}
	
	
	/**
	 *  Método que genera un número aleatorio entre dos límites: 
	 * @param liminferior
	 * @param limsuperior
	 * @return
	 */
	
	public static int originarNumeroAleatorio (int liminferior, int limsuperior) {
		
		int numero = 0; 
		
			Random random = new Random();
			numero = random.nextInt(liminferior, limsuperior);
										/**
										 *  Genera un número aleatorio entre los límites. 
										 */
		
		return numero; 
	}
	
	
	/**
	 *  Método que genera un array de números primos no repetidos: 
	 * @param limiteInferior
	 * @param limiteSuperior
	 * @return
	 */
	
	public static int[] primosNoRepetidos(int limiteInferior, int limiteSuperior) {
		
		int [] array = new int[10];
		
		/**
		 * Generamos un número aleatorio: 
		 */
		
		int numeroAleatorio = originarNumeroAleatorio(limiteInferior, limiteSuperior);

		return array; 
	}
	
	
	/**
	 * Método para verificar si un número está repetido en el array: 
	 */
	
	public static boolean repetido (int numComprobar, int[] array) {
		
		boolean encontrado = false; 
		
		int posicion = 0; /** Posición inicial en el array. */
		
		/** 
		 * Itera sobre el array hasta que encuentra el número o lo recorre todo el array 
		 */
		
		do {
			
			/** Si encuentra el número en el array, lo actualiza: */
			
			if (numComprobar == array[posicion]) {
				
				encontrado = true; 
				
			} else {
				
				/** Sino, continua con la siguiente posición */
				
				posicion = posicion + 1; 
			}
			
		} while ((!encontrado) && (posicion < array.length)); 
									/**
									 * Continua hasta encontrar el número o recorrer el array 
									*/
		
		
		return encontrado; 
	}
	
	/** Método principal del programa: */
	
	public static void main(String[] args) {
		
		/** Genera u array de números aleatorios entre 1 y 100: */ 

		int[] arrayPrimos = numerosAleatorios(1, 100);
		
		
		/** Muestra los números generados: */
		
		mostrarArray(arrayPrimos);
		System.out.println();
		
		/** Calcula y muestra el valor máximo, mínimo y la media de los números: */
		
		int maximo = maximo(arrayPrimos);
		int minimo = minimo(arrayPrimos);
		float media = media(arrayPrimos);
		
		System.out.println("Máximo: " + maximo + "\t" + "Mínimo: " +
												"\t" + minimo + " Media: " + media);
	}
		
	
	/** Método para verificar si un número es primo: */
	
	public static boolean esPrimo(int num) {
		
		boolean esprimo = false;

		/** Verifica si el número es primo llamando al método: */
		
		esprimo = (num == 1) || esPrimo(num);

		return esprimo;
	}

}
