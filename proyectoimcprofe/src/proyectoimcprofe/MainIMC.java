package proyectoimcprofe;

import java.util.Scanner;

public class MainIMC {
	
	//TODO
	/**
	 * Haced todo esto en una clase nueva que se llame MainPersona (dentro del mismo paquete)
	 * 
	 * Teneis que pedir los datos de una Persona (nombre, edad, peso y altura)
	 * Crear una persona con esos datos
	 * Calcular su IMC
	 * Mostrar el resultado
	 */

	
	public static void main(String[] args) {
		
		
		System.out.println("Estamos empezando");
		System.out.println("Vamos a calcular el IMC");
		float resultado = IMC.calculoIMC(80f, 1.90f);
		System.out.println("SU IMC ES " + resultado);
		//creamos una persona
		int numero = 0;
		Persona persona = null; //declaramos persona y la inicializamos
		persona = new Persona(90, 2, "Carlos", 42);
		
		System.out.println(" Nombre " + " " + persona.nombre);
		System.out.println(" Edad " + " " + persona.edad);
		
	
		Scanner scanner = new Scanner(System.in);//creo un objeto escáner para leer de teclado
		System.out.println("Introduzca palabra");
		String palabraIntroducida = scanner.next();
		System.out.println("Palabra introducida = " + palabraIntroducida);
		System.out.println("Introduzca edad");
		int edad = scanner.nextInt();//este método es para leer un número
		System.out.println("La edad introducida es " + edad);
		System.out.println("Intro peso");
		float peso = scanner.nextFloat();
		System.out.println("El peso intro es " + peso);
		
	}
	
	
	
	
	
	
	
	
	
	
}
