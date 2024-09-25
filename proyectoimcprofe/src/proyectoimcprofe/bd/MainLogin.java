package proyectoimcprofe.bd;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MainLogin {

	// TODO haced un método que recibe nombre de usuario y contraseña
	// y nos diga si el usuario existe en la base de datos con esa contraseña o no
	public static boolean esLoginCorrecto(String nombre, String password) {
		boolean loginCorrecto = false;
		
		Driver driver = null;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			//1 CARGO EL DRIVER
			driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			//2 OBTENGO CONEXIÓN
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdhabilidades", "root", "root");
		///SELECT * FROM bdhabilidades.usuarios WHERE nombre = nombre AND password = password
			String consulta = "SELECT * FROM bdhabilidades.usuarios WHERE nombre = ? AND password = ?";
			statement = connection.prepareStatement(consulta);
			statement.setString(1, nombre);
			statement.setString(2, password);
			statement.execute();
			loginCorrecto = statement.getResultSet().next();
			connection.close();
			
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return loginCorrecto;

	}

	public static void main(String[] args) {
			System.out.println("Intro el nombre");
			Scanner scanner = new Scanner(System.in);
			String nombre = scanner.nextLine();
			
			System.out.println("Intro la contraseña");
			String password = scanner.nextLine();
			
			if (esLoginCorrecto(nombre, password))
			{
				System.out.println("LOGIN CORRECTO!");
			} else {
				System.out.println(" LOGIN INCORRECTO :S ");
			}
	}
	
	
	
	
	
	
	
	
	
	

}













