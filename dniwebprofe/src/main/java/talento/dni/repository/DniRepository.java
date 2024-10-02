package talento.dni.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import talento.dni.Dni;

/**
 * Todas las operaciones sobre la base datos y la tabla DNI van a aquí
 */
public class DniRepository {

	// INSERT INTO `bddni`.`dni` (`numero`, `letra`) VALUES ('53130984', 'H');

	public static final String INSTRUCCION_INSERTAR_DNI = "INSERT INTO `bddni`.`dni` (`numero`, `letra`) VALUES (?, ?)";
	public static final String INSTRUCCION_CONSULTA_DNI = "SELECT *  FROM `bddni`.`dni`";
	public static final String INSTRUCCION_BORRAR_DNI = "DELETE FROM `bddni`.`dni` WHERE (`iddni` = ?)";

	public void insertarDni(Dni dni) throws SQLException {
		Connection conexion = Pool.getConnection();
		PreparedStatement ps = conexion.prepareStatement(INSTRUCCION_INSERTAR_DNI);
		ps.setInt(1, dni.getNumero());
		ps.setString(2, dni.getLetra() + "");
		int numRegistrosAfectados = ps.executeUpdate();
		System.out.println("Se han insertado " + numRegistrosAfectados);
		Pool.liberarRecursos(conexion, ps, null);
	}

	public void borrarDni(int id) throws SQLException {
		try {

			//String saludo = "HOLA";
			//saludo.charAt(5); // EJEMPLO DE RUNTIME EXECPTION _ UNCHECKED - Java no me obliga a tratarla
			
			Connection conexion = Pool.getConnection();
			PreparedStatement ps = conexion.prepareStatement(INSTRUCCION_BORRAR_DNI);
			ps.setInt(1, id);
			int numRegistrosAfectados = ps.executeUpdate();
			System.out.println("Se han eliminado " + numRegistrosAfectados);
			Pool.liberarRecursos(conexion, ps, null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();//imprimo el fallo
			throw e;//propago
		}

	}

	public List<Dni> consultarTodos() throws SQLException {
		List<Dni> listaDni = null;

		// TODO Conectarme a la base de datos y leer los dni
		Connection connection = Pool.getConnection();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(INSTRUCCION_CONSULTA_DNI);
		listaDni = new ArrayList<Dni>();
		while (rs.next()) {
			int numero = rs.getInt("numero");
			String letra = rs.getString("letra");
			int id = rs.getInt("iddni");
			Dni dni = new Dni(numero, letra.charAt(0), id);
			listaDni.add(dni);
		}
		Pool.liberarRecursos(connection, statement, rs);

		return listaDni;
	}

}
