package talento.login.service;

import java.sql.SQLException;

import talento.login.bean.Usuario;
import talento.login.repository.UsuarioRepository;

public class UsuarioService {

	public boolean existeUsuario(Usuario usuario) throws SQLException {
		boolean existe = false;

		UsuarioRepository usuarioRepository = new UsuarioRepository();
		existe = usuarioRepository.existeUsuario(usuario);

		return existe;
	}
	
	public Usuario leerUsuario(Usuario usuario) throws SQLException {
		Usuario usuarioleido = null;

			UsuarioRepository usuarioRepository = new UsuarioRepository();
			usuarioleido = usuarioRepository.leerUsuario(usuario);

		return usuarioleido;
	}
	
	public Usuario leerUsuario(int id) throws SQLException {
		Usuario usuarioleido = null;

			UsuarioRepository usuarioRepository = new UsuarioRepository();
			usuarioleido = usuarioRepository.leerUsuarioPorId(id);

		return usuarioleido;
	}

	public void insertarUsuario(Usuario usuario) throws SQLException {
		UsuarioRepository usuarioRepository = new UsuarioRepository();
		usuarioRepository.insertarUsuario(usuario);
	}

}
