package ficheros;

import java.io.FileReader;
import java.util.Properties;

public class MainProperties {
	//TODO hacemos un programa que lea el fichero de propiedades
	
	public static void main(String[] args) {
		
		try {
			Properties properties = new Properties();
			properties.load(new FileReader("parametros.properties"));
			
			String ip = properties.getProperty("ipbasedatos");
			String usuario = properties.getProperty("usuario");
			String password = properties.getProperty("password");
			String esquema = properties.getProperty("esquema");
			String driver = properties.getProperty("driver");
			
			System.out.println(ip +" "+ usuario + " " + password + " "+ esquema + " "+driver);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
