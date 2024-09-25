package talento.dni.bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import talento.dni.Dni;

public class DniRepository {
	
	//INSERT INTO `bddni`.`dni` (`numero`, `letra`) VALUES ('53130984', 'H');
	
	public static final String INSTRUCCION_INSERTAR_DNI = "INSERT INTO `bddni`.`dni` (`numero`, `letra`) VALUES (?, ?)";
	
	public void insertarDni (Dni dni) throws SQLException
	{
		Connection conexion = Pool.getConnection();
		PreparedStatement ps = conexion.prepareStatement(INSTRUCCION_INSERTAR_DNI);
		ps.setInt(1, dni.getNumero());
		ps.setString(2, dni.getLetra()+"");
		int numRegistrosAfectados = ps.executeUpdate();
		System.out.println("Se han insertado " + numRegistrosAfectados);
		Pool.liberarRecursos(conexion, ps, null);
	}

}
