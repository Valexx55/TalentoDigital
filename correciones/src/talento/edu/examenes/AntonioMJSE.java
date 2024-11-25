package talento.edu.examenes;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Antonio Moreno Montes
 * Fecha: 17/09/2024
 * 
 * Esta clase corresponde a la solucion del examen del modulo de Java Standard del curso de Desarrollo de Aplicacines con Tecnologias Web de xTalentoDigital 
 * 
 * Se trata de generar un array de 10 numeros enteros aleatorios primos no repetidos, calcular su valor maximo, mimino y la media, ordenarlo de forma descendente (de mayor a menor)
 * y mostrarlos por pantalla.
 */
public class AntonioMJSE {

	/**
	 * Genera un numero entero aleatorio dentro de un rango dado
	 * @param limiteinferior es el limite inferior del rango en el que debe estar el numero generado
	 * @param limitesuperior es el limite superior del rango en el que debe estar el numero generado
	 * @return El numero entero aleatorio generado
	 */
	public static int generarNumeroAleatorio (int limiteinferior, int limitesuperior)
	{
		int numero = 0;
		
		Random random = new Random();
		numero = random.nextInt(limiteinferior, limitesuperior);
	
	return numero;
	}
	
	/**
	 * Comprueba si un numero entero pertenece ya a un arrray de enteros
	 * @param numeroComprobar es el entero que se desea comprobar si esta en el array
	 * @param array es el array de enteros en el que se quiere comprobar si estan los numeros enteros dados
	 * @return Booleano que indica si el numero pertenece o no al array.
	 */
	public static boolean perteneceNumeroAlArray (int numeroComprobar, int[] array)
	{
		boolean encontrado = false;
		int posicion = 0;

		do {
			if (numeroComprobar == array[posicion]){
				encontrado = true;
			} else {
				posicion++;
			}			
		} while ((!encontrado)&&(posicion<array.length));
		
		return encontrado;
	}
	
	/**
	 * Funcion que determina si un numero es primo
	 * @param num es el numero que se desea comprobar si es primo o no
	 * @return Booleano que indica si el numero es primo o no
	 */
	public static boolean esPrimo(int num) {
		boolean esprimo = false;

		esprimo = (num == 1) || esPrimoRec(num, --num);

		return esprimo;
	}

	/**
	 * Funcion recursiva para comprobara si un numero es primo
	 * @param num es el numero que se desea comprobar si es primo o no
	 * @param div el divisor por el se divide el numero para comprobar si es primo o no
	 * @return Booleano que indica si el numero es primo o no
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
	 * Genera el array de numeros enteros aleatorios primos no repetidos
	 * @param limiteInferior es el limite inferior del rango en el que deben estar los numeros generados para el array
	 * @param limiteSuperior es el limite superior del rango en el que deben estar los numeros generados para el array
	 * @return Array de numeros enteros aleatorios primos no repetidos
	 */
	public static int[] crearArrayAleatoriosPrimosNoRepetidos(int limiteInferior, int limiteSuperior)
	{
		int[] array = new int[10];
		boolean completado = false;
		int posicion = 0;
		
		do {
			int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
			if ((!perteneceNumeroAlArray(numeroAleatorio, array))&&(esPrimo(numeroAleatorio))) {
				array[posicion]=numeroAleatorio;//lo meto en el array
				posicion++;// voy a la siguiente, lo dejo preparado
				if (posicion==10) {
					completado=true;
				}
			} else {
				//sigo buscando
				//System.out.println("El numero generado " + numeroAleatorio +" no sirve");
			}

		} while (!completado);
		
	
	return array;
	
	}

	/**
	 * Encuentra el valor maximo contenido en un array
	 * @param arrayEnteros es el array de numeros enteros del cual se quiere calcular su valor maximo 
	 * @return Entero correspondiente al valor maximo contenido en el array
	 */
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
	
	/**
	 * Encuentra el valor minimo contenido en un array
	 * @param arrayEnteros es el array de numeros enteros del cual se quiere calcular su valor minimo
	 * @return Entero correspondiente al valor minimo contenido en el array
	 */
	public static int obtenerMinimo (int[] arrayEnteros)
	{
		int minimo = 100;
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i]<minimo)
			{
				minimo = arrayEnteros[i];
			}
		}
		
		return minimo;
	}
	
	/**
	 * Calcula la media de los numeros enteros contenidos en un array
	 * @param arrayEnteros es el array de numeros enteros del cual se quiere calcular su valor medio
	 * @return El valor medio de los numeros contenidos en el array
	 */
	public static float obtenerMedia (int[] arrayEnteros) 
	{
		float media = 0;
		float total = 0;
		
			for (int i = 0; i < arrayEnteros.length; i++) {
				total = total + arrayEnteros[i];
			}
			System.out.println("La suma de los elementos es " + total);

			media = total/arrayEnteros.length;
			
		
		return media;
	}
	
	/**
	 * Muestra un array por pantalla 
	 * @param array es el array que se desea mostrar por pantalla
	 */
	public static void mostrarArray (int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ ", ");
		}
	}
	
	/**
	 * Genera el array de numeros enteros aleatorios primos no repetidos, lo muestra por pantalla, calcula su maximo, minimo y media, los muestra por pantalla, ordena el array ascendientemente 
	 * (de menor a mayor) y lo muestra de nuevo ordenado por pantalla
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arrayPrimos = crearArrayAleatoriosPrimosNoRepetidos(1, 100);
		mostrarArray(arrayPrimos);
		System.out.println();
		int maximo = obtenerMaximo(arrayPrimos);
		int minimo = obtenerMinimo(arrayPrimos);
		float media = obtenerMedia(arrayPrimos);
		
		System.out.println("Máximo = " + maximo + " Mínimo = " + minimo + " Media = " + media);

		System.out.println("Array ordenado = ");
		Arrays.sort(arrayPrimos);
		mostrarArray(arrayPrimos);
	}

}
