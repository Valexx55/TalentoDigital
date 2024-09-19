package proyectoimcprofe;

public class Dni {

	private int numero;
	private char letra;

	// TODO añadid una función a esta clase,
	// para que dado un dni, se pueda calcular su letra
	// seguid las instrucciones
	// https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/

	public static final char[] LETRAS_DNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public Dni(int numero, char letra) {
		super();
		this.numero = numero;
		this.letra = letra;
	}
	
	

	public Dni(int numero) {
		super();
		this.numero = numero;
	}



	public int getNumero() {
		return numero;
	}

	public char calcularLetraDNI() {
		char letraCalculada = ' ';
		int resto = 0;

			resto = this.numero % 23;
			letraCalculada = LETRAS_DNI[resto];

		return letraCalculada;
	}
	
	public static void main(String[] args) {
		Dni dnivale = new Dni(53130984);
		
		char letraCalculada = dnivale.calcularLetraDNI();
		dnivale.setLetra(letraCalculada);
		
		System.out.println("La letra de Vale es " + letraCalculada);
	}
	
	
	
	

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

}
