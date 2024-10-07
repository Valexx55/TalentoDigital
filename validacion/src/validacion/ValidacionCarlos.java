package validacion;

public class ValidacionCarlos implements IValidacion {

	@Override
    public boolean validarNombre(String nombre) {
        if (nombre != null && nombre.length() >= 4 && nombre.length() <= 10) {
            return true; // El nombre es válido
        }
        return false; // El nombre no cumple las condiciones
    }

    @Override
    public boolean validarPassword(String password1, String password2) {
        if (password1 != null && password2 != null && password1.equals(password2)) {
            return true; // Las contraseñas coinciden
        }
        return false; // Las contraseñas no coinciden o son nulas
    }

}
