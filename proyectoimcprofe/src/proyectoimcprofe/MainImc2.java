package proyectoimcprofe;

import java.util.Random;

public class MainImc2 {
	
	/**
	 * TODO TENÉIS QUE HACER UN PROGRAMA QUE GENERE
	 * 5 PERSONAS Y SU EDAD Y SU PESO SEAN GENERADAS AUTOMÁTICAMENTE
	 * DE FORMA ALEATORIA
	 * DE CADA PERSONA, TENÉIS QUE DAR SU IMC NUMÉRICO Y NOMINAL
	 * EL NOMBRE DE LA PERSONA, TIENE QUE SER P+UN NÚMERO
	 * POR EJEMPLO , EL NOMBRE DE LA PERSONA PRIMERA SERÁ P0
	 * EL NOMBRE DE LA PERSONA SEGUDAN SERÁ P1
	 * EL NOMBRE DE LA PERSONA TERCERA SERÁ P2 Y ASÍ..
	 * HASTA P4
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//Random random = new Random();//constuctor por defecto
		//int numeroaleatorio1 = random.nextInt(0, 50);
		//System.out.println("El número aleatorio es "+ numeroaleatorio1);
		
		//float numerofloatrandom = random.nextFloat(0f, 200f);
		//System.out.println("El número float es " + numerofloatrandom);
		String nombrePersonaMayor = null;
		int edadPersonaMayor = 0;
		
		for (int i=0; i<5; i++) {
			//crear la persona
				//dar una edad
				Random random = new Random();
				int edad = random.nextInt(0, 100);
				//dar un peso
				float peso = random.nextFloat(20, 200);
				//dar la altura
				float altura = random.nextFloat(1.40f, 2.30f);
				//dar el nombre
				String nombre = "p"+ i;
				Persona persona = new Persona(peso, altura, nombre, edad);
				//actualizar Persona mayor
				//si la edad de la nueva persona es mayor que la edadPersonaMayor
				if (persona.getEdad()>edadPersonaMayor)
				{
					nombrePersonaMayor = persona.getNombre();
					edadPersonaMayor = persona.getEdad();
				}
					//actualizo edadmayor
					//actualizo nombre de la edad mayor
				persona.mostrarPersona();
			//calcular el imc numérico
				float imcnum = IMC.calculoIMC(persona.getPeso(), persona.getAltura());
				//calcular el imc nominal
				String imcnom = IMC.traducirIMC(imcnum);
				//imprimo el resultado
				System.out.println(persona.getNombre() + " está " + imcnom + "("+imcnum+")");
		}
		System.out.println("Se han creado "+ Persona.totalPersonas + " personas");
		//TODO INFORMAR POR PANTALLA EL NOMBRE Y LA EDAD DE LA PERSONA MÁS MAYOR
		System.out.println("NOMBRE MAYOR =  " +nombrePersonaMayor + " Edad mayor = " + edadPersonaMayor);
	}
}






















