package proyectoimcprofe;

public class Nie extends Dni {

	private char prefijo;
	
	

	public Nie(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public Nie(int numero, char letra) {
		// TODO Auto-generated constructor stub
		super(numero, letra);
	}

	public Nie(int numero, char letra, char prefijo) {
		super(numero, letra);
		this.prefijo = prefijo;
	}

	@Override // Anotación - marca para Java
	public char calcularLetraDNI() {
		char letraCalculada = ' ';
		int resto = 0;
		String numeroAux = null;

	
			if (this.prefijo == 'Y') {
				// tengo que poner delante un 1
				numeroAux = "1" + this.getNumero();
			} else if (this.prefijo == 'Z') {
				numeroAux = "2" + this.getNumero();
			} else { // es X
				numeroAux = "" + this.getNumero();
			}
	
			resto = Integer.parseInt(numeroAux) % 23;
			letraCalculada = LETRAS_DNI[resto];

		return letraCalculada;
	}
	
	public static void main(String[] args) {
		Nie nieoriana = new Nie(1349674);
		nieoriana.setPrefijo('Z');
		char letraOriana = nieoriana.calcularLetraDNI();
		System.out.println("La letra de Oriana es " + letraOriana);
		
		Dni dniRonald = new Nie(7963907, ' ', 'Y');
		char letraRonald = dniRonald.calcularLetraDNI();//va al hijo --> "POLIMORFISMO"
		System.out.println("la letra de Ronald es "+ letraRonald);
		
		
		Dni dniVale = new Dni(53130984);
		char letravale = dniVale.calcularLetraDNI();
		System.out.println("Letra de vale = " + letravale);
	}

	public char getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(char prefijo) {
		this.prefijo = prefijo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
