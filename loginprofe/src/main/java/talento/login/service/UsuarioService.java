package talento.login.service;

import java.sql.SQLException;

import jakarta.servlet.http.Part;
import talento.login.bean.Usuario;
import talento.login.repository.UsuarioRepository;

public class UsuarioService {

	public boolean existeUsuario(Usuario usuario) throws SQLException {
		boolean existe = false;

		UsuarioRepository usuarioRepository = new UsuarioRepository();
		existe = usuarioRepository.existeUsuario(usuario);

		return existe;
	}

	public void insertarUsuario(Usuario usuario) throws SQLException {
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		usuarioRepository.insertarUsuario(usuario);
	}

}
