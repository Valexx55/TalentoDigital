package proyectoimcprofe;

import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {
        System.out.println("Estamos empezando");
        
        Scanner scanner = new Scanner(System.in);
        //PEDIR DATOS
        System.out.print("Introduzca su nombre: ");
        String nombreIntroducido = scanner.next();
        
        System.out.print("Introduzca su edad: ");
        int edadIntroducida = scanner.nextInt();

        System.out.print("Introduzca su peso: ");
        float pesoIntroducido = scanner.nextFloat();

        System.out.print("Introduzca su altura: ");
        float alturaIntroducida = scanner.nextFloat();
        
        //CREAR PERSONA
        Persona nuevaPersona = new Persona(pesoIntroducido, alturaIntroducida, nombreIntroducido, edadIntroducida);
        
        //MOSTRAR PERSONA
        System.out.println("Nombre: " + nuevaPersona.nombre);
        System.out.println("Edad: " + nuevaPersona.edad);
        System.out.println("Peso: " + nuevaPersona.peso);
        System.out.println("Altura: " + nuevaPersona.altura);
        
        //CALCULAR IMC
        float imc = IMC.calculoIMC(nuevaPersona.peso, nuevaPersona.altura);
	
        //MOSTRAR RESULTADO
		System.out.println("CALCULO DE SU IMC ES: " + imc);

        scanner.close();
    }
}






















