package ficheros;

import java.util.Arrays;
import java.util.Random;

public class RMTA {

	public static void main(String[] args) {

			int[] arrayPrimos = crearArrayAleatoriosPrimosNoRepetidos(1, 100);
			
			mostrarArray(arrayPrimos);
			
			System.out.println();
			
			Arrays.sort(arrayPrimos);
			mostrarArray(arrayPrimos);
			
			int maximo = obtenerMax(arrayPrimos);
			
			int minimo = obtenerMin(arrayPrimos);
			
			float media = obtenerMedia(arrayPrimos);
			System.out.println();
			System.out.println("Máximo = " + maximo + " Mínimo = " + minimo + " Media = " + media);

						
	}

	/**
	 * Esta método genera números aleatorios
	 * @param limiteInferior, limiteSuperior para definir el limites de un array
	 * @return será un número aletorio
	 */
	public static int generarNumeroAleatorio(int limiteinferior, int limitesuperior) {
		
		int numero = 0;

		Random random = new Random();
		
		numero = random.nextInt(limiteinferior, limitesuperior);

		return numero;
	}

	/**
	 * Esta método crea array de números Aleatorios y verificar que se haya completado el array
	 * @param  limiteInferior, limiteSuperior para definir el limites de un array
	 * @return un array completado
	 */
	public static int[] crearArrayAleatoriosPrimosNoRepetidos(int limiteInferior, int limiteSuperior) {
		
		int[] array = new int[10];
		
		boolean completado = false;
		
		int posicion = 0;

		do {

			int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
			
			if ((!perteneceNumeroAlArray(numeroAleatorio, array)) && (esPrimo(numeroAleatorio))) {
				
				array[posicion] = numeroAleatorio;
				
				posicion++;
				
				if (posicion == 10) {
					
					completado = true;
				}
			}

		} while (!completado);

		return array;

	}

	/**
	 * Esta método verifica si el numero del array pertenece al array
	 * @param numero y arraynum a evaluar con el recorrido del array
	 * @return un array evaluado
	 */
	public static boolean perteneceNumeroAlArray(int numero, int[] arraynum) {
		
		boolean encontrado = false;
		
		int posicion = 0;

		do {

			if (arraynum[posicion] == numero) {
				
				encontrado = true;
				
			} else {
				
				posicion++;
			}

		} while ((!encontrado) && (posicion < arraynum.length));

		return encontrado;
	}

	/**
	 * Esta método verifica si el numero del array pertenece al array
	 * @param num para ser evaluado si es primo
	 * @return un array evaluado
	 */
	public static boolean esPrimo(int num) {
		
		boolean esprimo = false;

		esprimo = (num == 1) || esPrimoRec(num, --num);

		return esprimo;
	}
	
	/**
	 * Esta método verifica si el numero del array pertenece al array
	 * @param num, div para ser evaluados si es primo
	 * @return un array evaluado
	 */
	public static boolean esPrimoRec(int num, int div) {
		
		boolean esprimo = true;

		if (div == 1)
			
			esprimo = true;
		
		else if ((num % div) == 0) {
			
			esprimo = false;
			
		} else
			
			esprimo = esPrimoRec(num, --div);
		
		return esprimo;
	}

	/**
	 * Esta método se encarga para mostrar resultados en pantalla
	 * @param array completado a mostrar en pantalla
	 * @return el metodo no tiene return por que es void
	 */
	public static void mostrarArray(int[] array) {
		
		for (int n : array) {
			
			System.out.print(n + ",");
		}
	}

	/**
	 * Esta método obtiene el minimo del array
	 * @param arrayEnteros para obtener el minimo
	 * @return el numero minimo
	 */
	public static int obtenerMin(int[] arrayEnteros) {
		
		int minimo = 100;

		for (int i = 0; i < arrayEnteros.length; i++) {
			
			if (arrayEnteros[i] < minimo) {
				
				minimo = arrayEnteros[i];
			}
		}

		return minimo;
	}

	/**
	 * Esta método obtiene el maximo del array
	 * @param arrayEnteros para obtener el maximo
	 * @return el numero maximo
	 */
	public static int obtenerMax(int[] arrayEnteros) {
		int maximo = 0;

		for (int i = 0; i < arrayEnteros.length; i++) {
			
			if (arrayEnteros[i] > maximo) {
				
				maximo = arrayEnteros[i];
			}
		}

		return maximo;
	}

	/**
	 * Esta método obtiene la media del conjunto de numeros del array
	 * @param arrayEnteros para obtener la media
	 * @return la media
	 */	
	public static float obtenerMedia(int[] arrayEnteros) {
		
		float media = 0;
		
		float total = 0;

		for (int i = 0; i < arrayEnteros.length; i++) {
			
			total = total + arrayEnteros[i];
		}
		
		media = total / arrayEnteros.length;

		return media;
	}

}
