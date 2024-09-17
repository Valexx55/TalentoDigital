package talento.imc;//paquete carpeta que agrupa clases por familia

public class Persona {

	/** atributos/propiedades/campos de la clase **/
	
	static int totalPersonas = 0;//Llevamos la cuenta del número de personas creadas

	float peso;
	float altura;
	String nombre;
	int edad;

	public Persona(float peso, float altura, String nombre, int edad) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nombre = nombre;
		this.edad = edad;
		Persona.totalPersonas= Persona.totalPersonas+1;
	}

	public Persona() {
		// TODO Constructor por defecto
		// esto crea una persona con peso 0, altura 0, nombre null y edad 0
		Persona.totalPersonas++;
	
	}

	/**
	 * Este método muestra la información completa de la persona (todos sus
	 * atributos) por pantalla
	 */
	
	public void mostrarPersona()
	{
		
		System.out.println("Pesa " + this.peso + " kg, mide " + this.altura + "metros, se llama " + this.nombre + " y su edad es " + this.edad);
	}

	public static void main(String[] args) {
		Persona p1 = new Persona(60, 2, "Juan", 33);
		Persona p2 = new Persona(60, 2, "Paco", 43);
		p1.mostrarPersona();
		p2.mostrarPersona();
	}

	public float getPeso() {
		return this.peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// TODO implementar el método mostrar persona
	// mostrarPersona

	/* métodos */

	// existe un método especial, llamado constructor, que me permite
	// crear variables de una clase. Este método se llama igual que el
	// nombre de la clase y pueden existir varias versiones

}
