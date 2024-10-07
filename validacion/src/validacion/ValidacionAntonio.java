package validacion;

public class ValidacionAntonio implements IValidacion {

	@Override
	public boolean validarNombre(String nombre) {
		// TODO Auto-generated method stub
		if ((4 <= nombre.length()) && (nombre.length() <= 10)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean validarPassword(String password1, String password2) {
		// TODO Auto-generated method stub
		if (password1 == password2) {
			return true;
		} else {
			return false;
		}
	}


}
