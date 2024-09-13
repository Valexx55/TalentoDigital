package ejerciciosobligatorios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

//TODO ordenación

public class MainArrays {
	
	public static void main(String[] args) {

		int[] arrayPrimos = crearArrayAleatoriosPrimosNoRepetidos(1, 100); //rellenarArrayConNumerosAleatorios(1, 100);
		mostrarArray(arrayPrimos);
		System.out.println();
		int maximo = obtenerMaximo(arrayPrimos);
		int minimo = obtenerMinimo(arrayPrimos);
		float media = obtenerMedia(arrayPrimos);

		System.out.println("Máximo = " + maximo + " Mínimo = " + minimo + " Media = " + media);

		Arrays.sort(arrayPrimos);
		mostrarArray(arrayPrimos);
		System.out.println("\n\t for each");
		mostrarArray2(arrayPrimos);
	}

	public static int generarNumeroAleatorio(int limiteinferior, int limitesuperior) {
		int numero = 0;

			Random random = new Random();
			numero = random.nextInt(limiteinferior, limitesuperior);

		return numero;
	}

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

	public static int obtenerMinimo(int[] arrayEnteros) {
		int minimo = 100;

		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] < minimo) {
				minimo = arrayEnteros[i];
			}
		}

		return minimo;
	}

	public static int obtenerMaximo(int[] arrayEnteros) {
		int maximo = 0;

		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] > maximo) {
				maximo = arrayEnteros[i];
			}
		}

		return maximo;
	}

	public static float obtenerMedia(int[] arrayEnteros) {
		float media = 0;
		float total = 0;// podría ser int,pero para que salga con decimales la división, lo hacemos
						// float

		// TODO 1 sumar todos los elementos del array (el total)
		for (int i = 0; i < arrayEnteros.length; i++) {
			total = total + arrayEnteros[i];
		}
		System.out.println("La suma de los elementos es " + total);
		// 2 dividir el total entre el número de elementos del array
		media = total / arrayEnteros.length;

		return media;
	}

	public static int[] rellenarArrayConNumerosAleatorios(int limiteInferior, int limiteSuperior) {
		int[] arrayNumerosAleatorios = new int[10];

		for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
			// genero número aleatorio
			Random random = new Random();
			int numeronuevo = random.nextInt(1, 100);
			// se lo meto a la posición del array
			arrayNumerosAleatorios[i] = numeronuevo;
		}

		return arrayNumerosAleatorios;
	}

	public static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	public static void mostrarArray2 (int[] array) {
		//for each
		for (int n : array)
		{
			System.out.println(n);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int[] crearArrayAleatoriosPrimosNoRepetidos(int limiteInferior, int limiteSuperior)
	{
		int[] array = new int[10];
		boolean completado = false;
		int posicion = 0;
		
		do {
			
			int numeroAleatorio = generarNumeroAleatorio(limiteInferior, limiteSuperior);
			if ((!perteneceNumeroAlArray(numeroAleatorio, array))&&(esPrimo(numeroAleatorio)))
			{
				//lo meto en el array
				array[posicion]=numeroAleatorio;
				posicion++;//voy a la siguiente, lo dejo preparado
				if (posicion==10) {
					completado=true;
				}
			} else {
				//sigo buscando
				System.out.println("El número generado " + numeroAleatorio +"no sirve");
			}
			
		} while (!completado);
		
		
	return array;
	
	}

	
	
	
	
	
	public static boolean esPrimo(int num) {
		boolean esprimo = false;

		esprimo = (num == 1) || esPrimoRec(num, --num);

		return esprimo;
	}

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

}
