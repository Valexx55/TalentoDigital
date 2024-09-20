package proyectoimcprofe.bd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainBaseDatos {
	
	public static void main(String[] args) {
		
		Driver driver = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			//1 CARGO EL DRIVER
			driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2 OBTENGO CONEXIÓN
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddni", "root", "root");
			//3 CREO LA INSTRUCCIÓN - STATEMENT
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM bddni.persona");
			//TODO recorrer los resultados y mostrar con WHILE
			
		} catch (Exception e) {
			// TODO: handle exception
			//en este bloque de código, es como
			//un airbag o un salvavidas
		}
		
	}

}
