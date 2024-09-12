package conversiones;

/**
 * Esta clase ofrece una serie de métodos para la conversión de unidades de
 * medida y monetarias
 * 
 * 
 */
public class Convertir {

	// TODO haced los métodos de conversión asignados
	// todos los métodos son public static
	/**
	 * ZOE -- kg a lb JUANJO -- lb a kg NAGORE -- soles a euros ANTONIO V -- euros a
	 * soles DANIEL -- dolares a euros CARLOS -- euros a dolares ANTONIO M -- millas
	 * por hora a km por hora RONALD -- km por hora a millas por hora JESÚS --
	 * pulgadas a cm ORIANA -- cm a pulgadas
	 */

	/**
	 * Esta función convierte millas por hora en kilómetros por hora
	 * 
	 * @param mph las millas a convertir
	 * @return la equivalencia en kilómetros
	 */
	public static float millasAKilometrosPorHora(float mph) {
		float kmph = 0;

		kmph = mph * 1.60934f;

		return kmph;
	}

	/**
	 * Esta función convierte kilómetros por hora en millas por hora
	 * 
	 * @param dato las kilómetros a convertir
	 * @return la equivalencia en millas
	 */
	public static float kmPorHoraAMillasPorHora(float dato) {

		float resultado;

		resultado = dato / 1.609f;

		return resultado;
	}

	/**
	 * Esta función convierte Libras a Kilogramos
	 * 
	 * @param Libras a convertir
	 * @return Su equivalencia en kilogramos
	 */
	public static float lbAKg(float libra) {

		float kilogramos = 0f;

		kilogramos = libra * 0.453592f;

		return kilogramos;
	}

	/**
	 * Esta función convierte kilos a libras
	 * 
	 * @param kilos los kilos a convertir
	 * @return la equivalencia en libras
	 */
	public static float kilosALibras(float kilos) {
		float libras = 0;

		libras = kilos * (2.2f);

		return libras;
	}

	/**
	 * Esta funcion convierte soles a euros
	 * 
	 * @param soles la cantidad de soles a convertir
	 * @return la equivalencia en euros
	 */
	public static float solesAEuros(float soles) {

		float euros = 0;

		euros = soles / 0.24f;

		return euros;
	}

	/**
	 * Esta función convierte Euros a Soles
	 * 
	 * @param soles la cantidad a convertir de soles
	 * @return la cantidad equivalente en Euros
	 */
	public static double eurosASoles(double euros) {

		double soles = 0;
		
			soles = euros * 4.2;
			
		return soles;
	}

	/**
	 * Método que convierte euros a dólares
	 * 
	 * @param cantidadEuros la cantidad en euros a convertir
	 * @return la equivalencia en dólares
	 */
	public static float euroADolar(double cantidadEuros) {

		// Realizamos la operación de conversión
		double resultadoConversion = cantidadEuros * 1.2;

		return (float) resultadoConversion;

	}

	/**
	 * Método que convierte dólares en euros
	 * 
	 * @param dolares la cantidad de dólares a convertir
	 * @return la equivalencia en euros
	 */
	public static double dolaresAEuros(double dolares) {
		return dolares * 0.92;
	}

	/**
	 * Esta funcion convierte pulgadas a cm
	 * 
	 * @param dato en pulgadas
	 * @return la equivalencia en cm
	 */
	public static float pulgadasACm(float dato) {
		float resultado = dato * 109.22f;
		return resultado;
	}

	/**
	 * Esta funcion convierte centímetros a pulgadas
	 * 
	 * @param cm los centímetros a convertir
	 * @return su equivalencia en pulgadas
	 */

	public static float cmAPulgadas(float cm) {
		float pulgadas = cm / 2.54f;
		return pulgadas;
	}

}
