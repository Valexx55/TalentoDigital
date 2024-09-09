package proyectoimcprofe;

public class Alumno extends Persona {
	
	int nota;

	//Sobrecarga: cuando hay un método repetido (mismo nombre, distintos parámetros)
	public Alumno(float peso, float altura, String nombre, int edad) {
		super(peso, altura, nombre, edad);
		this.nota = 10;
	}
	
	//Constructor canónico -- recibe todos los atributos 
	public Alumno(float peso, float altura, String nombre, int edad, int nota) {
		super(peso, altura, nombre, edad);
		this.nota = nota;
	}
	
	public static void main(String[] args) {
		Alumno alumno = new Alumno(50, 1.5f, "Jose", 30);
		System.out.println("EL alumno tiene nota " + alumno.nota);
	}

}
