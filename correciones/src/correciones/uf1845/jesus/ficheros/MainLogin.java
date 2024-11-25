package ficheros;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

/**
 * TODO : hace una conexión a la base de datos para ver si existe 
 * un usuario y su contraseña.
 * 
 * El usuario y la contraseña se piden por teclado (clase Scanner).
 * 
 * La tabla de la base de datos es usuarios del esquema bddni.
 * En dicha tabla, tenemos dos columnas: usuario y password, que son 
 * las que tenemos que consultar.
 * 
 * Una vez solicitadas las credenciales del usuario (usuario y password),
 * hacemos una consulta SELECT en la base de datos. Si está, le mostramos
 * un mensaje de bienvenida.
 * 
 * Si no coincide el nombre o la contraseña, le mostramos un mensaje
 * de login incorrecto.
 *
 * Importante: tratar las excepciones con try-catch y si se produce algún fallo, 
 * imprimirlo con printStackTrace.
 *
 * El driver de la base de datos es MYSQL (jar).
 * El usuario y la contraseña para conectarse a la base de datos viene
 * en un fichero de propiedades (parametros.properties).
 */

public class MainLogin {

    // TODO hacer un método ( nombre de usuario y contraseña)
    // diga si el usuario existe en la base de datos con esa contraseña o no.
    public static boolean esLoginCorrecto(String nombre, String password) {
        boolean loginCorrecto = false;

        Driver driver = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // 0 LEER PROPIEDADES
            Properties properties = new Properties();
            properties.load(new FileReader("parametros.properties"));

            String usuarioc = properties.getProperty("usuario");
            String passwordc = properties.getProperty("password");

            // 1 CARGO EL DRIVER
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            
            // 2 OBTENGO CONEXIÓN
            connection = DriverManager.getConnection("jdbc:mysql://localhost:8081/bddni", usuarioc, passwordc);

            // PREPARAR CONSULTA SQL.
            String consulta = "SELECT * FROM bddni.usuarios WHERE usuario = ? AND password = ?";
            statement = connection.prepareStatement(consulta);
            statement.setString(1, nombre);
            statement.setString(2, password);

            // EJECUTAR CONSULTA
            resultSet = statement.executeQuery();
            loginCorrecto = resultSet.next();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // CERRAR RECURSOS
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return loginCorrecto;
    }

    public static void main(String[] args) {
        System.out.println("Por favor, introduce tu nombre: ");
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre = scanner.nextLine();

            System.out.println("Por favor, introduce tu contraseña: ");
            String password = scanner.nextLine();

            if (esLoginCorrecto(nombre, password)) {
                // MENSAJE "BIENVENIDA"
                System.out.println("¡Bienvenido, " + nombre + "!");
            } else {
                System.out.println("LOGIN INCORRECTO :S");
            }
        }
    }
}