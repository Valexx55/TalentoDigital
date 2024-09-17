package talento.imc;

/**
 * Clase que contiene la información devuelta por el servidor
 * como respuesta a una peitición de cacular el IMC
 * 
 * JAVA BEAN o BEAN o POJO (Plain Old Java Object)
 * Una clase sencilla, con su constructor y sus métodos de acceso
 * getters y setter
 */
public class ResultadoIMC {
	
	private float imcNumerico;
	private String imcNominal;
	
	public ResultadoIMC(float imcNumerico, String imcNominal) {
		super();
		this.imcNumerico = imcNumerico;
		this.imcNominal = imcNominal;
	}

	public float getImcNumerico() {
		return imcNumerico;
	}

	public void setImcNumerico(float imcNumerico) {
		this.imcNumerico = imcNumerico;
	}

	public String getImcNominal() {
		return imcNominal;
	}

	public void setImcNominal(String imcNominal) {
		this.imcNominal = imcNominal;
	}
	
	
	

}
