package validacion;

public class Validar implements IValidacion {

	
	@Override
	public boolean validarNombre(String nombre) {
		boolean valido = false;
		
			valido = ((null!=nombre)&&(nombre.length()>=4)&&(nombre.length()<=10));
		
		return valido;
	}

	@Override
	public boolean validarPassword(String password1, String password2) {
		boolean valido = false;
		
			valido = ((password1!=null)&&(password1.equals(password2)));
		
		return valido;
	}
	
	public static void main(String[] args) {
		//para probar
	}

}
