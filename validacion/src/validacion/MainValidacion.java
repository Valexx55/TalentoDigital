package validacion;

public class MainValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para probar la validación
		//pruebo las 2
		String nombre = null;
		IValidacion iValidacion = new ValidacionAntonio();
		//boolean resultado = iValidacion.validarNombre(nombre);
		//System.out.println("resultado validacion Antonio = " + resultado);
		iValidacion = new ValidacionCarlos();
		boolean resultado = iValidacion.validarNombre(nombre);
		System.out.println("resultado validacion Carlos = " + resultado);
		
		
		
	}

}
