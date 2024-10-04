package talento.login.controlador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class EscuchaInicioFinLogin
 *
 */
public class EscuchaInicioFinLogin implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public final static String RUTAS_FOTO = "fotosperfil";

	public EscuchaInicioFinLogin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		File carpetaFotos = new File(RUTAS_FOTO);
		if (!carpetaFotos.exists())// si no existe
		{
			// creo la carpeta
			System.out.println("La carpeta de las fotos no existe");
			Path path = Path.of(RUTAS_FOTO);
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Error al crear la carpeta");
			}
		} else {
			System.out.println("La carpeta de las fotos ya existe");
		}
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	}

}
