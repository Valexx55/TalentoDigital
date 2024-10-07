package validacion;

public interface IValidacion {
	
	//3 cosas para programar un método
		//1 nombre
		//2 parámetros de entrada
		//3 salida
	
	/**
	 * Método para validar un nombre
	 * Un nombres es correcto si su longitud está entre 4 y 10
	 * si no, es incorrecto
	 * 
	 * @param nombre el nombre a validar
	 * @return true si es válido false en caso contrario
	 */
	boolean validarNombre(String nombre); //un método en la interfaz sólo lleva la cabecera
	
	/**
	 * Método para validar las contraseñas
	 * Dos contraseñas son válidas si son iguales
	 * 
	 * @param password1 la contraseña 1
	 * @param password2 la contraseña 2
	 * @return true si son válidas, false en caso contrario
	 */
	boolean validarPassword (String password1, String password2);

}








