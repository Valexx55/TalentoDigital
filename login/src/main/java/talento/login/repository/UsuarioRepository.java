package talento.login.repository;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import talento.login.bean.Usuario;

public class UsuarioRepository {

	public static final String EXISTE_USUARIO = "SELECT * FROM bddni.usuarios WHERE usuario = ? AND password = ?";
	public static final String LEER_USUARIO_ID = "SELECT * FROM bddni.usuarios WHERE idusuario = ?";
	public static final String INSERTAR_USUARIO = "INSERT INTO `bddni`.`usuarios` (`usuario`, `password`, `foto`, `rutafoto`) VALUES (?,?,?,?);";

	public boolean existeUsuario(Usuario usuario) throws SQLException {
		boolean existe = false;

		Connection connection = Pool.getConnection();
		PreparedStatement ps = connection.prepareStatement(EXISTE_USUARIO);
		ps.setString(1, usuario.getUsuario());
		ps.setString(2, usuario.getPassword());
		ps.execute();
		existe = ps.getResultSet().next();

		Pool.liberarRecursos(connection, ps, null);

		return existe;
	}

	public Usuario leerUsuario(Usuario usuario) throws SQLException {
		Usuario usuarioLeido = null;

		Connection connection = Pool.getConnection();
		PreparedStatement ps = connection.prepareStatement(EXISTE_USUARIO);
		ps.setString(1, usuario.getUsuario());
		ps.setString(2, usuario.getPassword());
		ResultSet rs = ps.executeQuery();

		if (rs.next())
		{
			int idusuario = rs.getInt(1);
			String nombreu = rs.getString("usuario");
			String pwdu = rs.getString("password");
			String rutafoto = rs.getString("rutafoto");

			usuarioLeido = new Usuario(idusuario, nombreu, pwdu, rutafoto);
		}
		

		Pool.liberarRecursos(connection, ps, rs);

		return usuarioLeido;
	}
	
	public Usuario leerUsuarioPorId(int idusuario) throws SQLException {
		Usuario usuarioLeido = null;

		Connection connection = Pool.getConnection();
		PreparedStatement ps = connection.prepareStatement(LEER_USUARIO_ID);
		ps.setInt(1, idusuario);
		ResultSet rs = ps.executeQuery();

		if (rs.next())
		{
			int id = rs.getInt(1);
			String nombreu = rs.getString("usuario");
			String pwdu = rs.getString("password");
			String rutafoto = rs.getString("rutafoto");

			usuarioLeido = new Usuario(id, nombreu, pwdu, rutafoto);
		}
		

		Pool.liberarRecursos(connection, ps, rs);

		return usuarioLeido;
	}

	
	
	

	public void insertarUsuario(Usuario usuario) throws SQLException {
		Connection connection = Pool.getConnection();
		PreparedStatement ps = connection.prepareStatement(INSERTAR_USUARIO);
		ps.setString(1, usuario.getUsuario());
		ps.setString(2, usuario.getPassword());
		ps.setBinaryStream(3, new ByteArrayInputStream(usuario.getFoto()), usuario.getFoto().length);
		ps.setString(4, usuario.getRutaFoto());
		ps.executeUpdate();

		Pool.liberarRecursos(connection, ps, null);
	}

}
