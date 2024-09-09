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
		/*float resultado = IMC.calculoIMC(80f, 1.90f);
		System.out.println("SU IMC ES " + resultado);
		//creamos una persona
		int numero = 0;*/
		Persona persona = null; //declaramos persona y la inicializamos
		persona = new Persona(90, 2, "Carlos", 42);
		Persona persona2 = new Persona(45, 1.60f, "María", 49);
		
		//persona.setNombre("Paco");
		System.out.println(" Nombre " + " " + persona.getNombre());
		System.out.println(" Edad " + " " + persona.getEdad());
		
		System.out.println(" Nombre " + " " + persona2.getNombre());
		System.out.println(" Edad " + " " + persona2.getEdad());
		
		String cadena1 = "HOLA";
		String cadena2 = "ADIÓS";
		
		System.out.println("Cadena 1 longitud = " + cadena1.length());
		System.out.println("Cadena 2 longitud = " + cadena2.length());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		float imc_numerico = IMC.calculoIMC(persona.peso, persona.altura);
		String imc_nominal = IMC.traducirIMC(imc_numerico);
		
		
		
		
		
		
		
		
		
		System.out.println(persona.nombre + " está en " + imc_numerico + " " + imc_nominal);
		
	
		
		/*Scanner scanner = new Scanner(System.in);//creo un objeto escáner para leer de teclado
		System.out.println("Introduzca palabra");
		String palabraIntroducida = scanner.next();
		System.out.println("Palabra introducida = " + palabraIntroducida);
		System.out.println("Introduzca edad");
		int edad = scanner.nextInt();//este método es para leer un número
		System.out.println("La edad introducida es " + edad);
		System.out.println("Intro peso");
		float peso = scanner.nextFloat();
		System.out.println("El peso intro es " + peso);*/
		
	}
	
	
	
	
	
	
	
	
	
	
}
