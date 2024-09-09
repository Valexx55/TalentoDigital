package proyectoimcprofe;

/**
 * @author Vale
 * @version 1.0
 * 
 * 
 *          Esta clase sirve para calcular el IMC El índice de masa corporal es
 *          una medida de salud, que expresa la relación entre el peso y la
 *          estatura de una persona
 * 
 *          La fórmula es = peso (kg) / altura * altura (metros)
 * 
 *          Si el valor queda comprendido entre
 * 
 *          < 16 - DESNUTRIDO >= 16 y < 18 - DELGADO >= 18 y < 25 - IDEAL >= 25
 *          y < 31 - SOBREPESO > 31 - OBESO
 */
public class IMC {

	public static float calculoIMC(float peso, float altura) {
		float resultadoIMC = 0f;

		resultadoIMC = peso / (altura * altura);

		return resultadoIMC;
	}

	public static String traducirIMC(float imc_numerico) {
		String imc_nominal = null;

		if (imc_numerico < 16) {
			imc_nominal = "DESNUTRIDO";
		} else if ((imc_numerico >= 16) && (imc_numerico < 18)) {
			imc_nominal = "DELGADO";
		} else if ((imc_numerico >= 18) && (imc_numerico < 25)) {
			imc_nominal = "IDEAL";
		} else if ((imc_numerico >= 25) && (imc_numerico < 31)) {
			imc_nominal = "SOBREPESO";
		} else {
			imc_nominal = "OBESO";
		}

		return imc_nominal;

	}

}
