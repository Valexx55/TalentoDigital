package talento.dni.controlador;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class InicioFinAppWeb
 *
 */
public class InicioFinAppWeb implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InicioFinAppWeb() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("APP DNI WEB ARRANCADA");
    	//PEDIR WHATSAPSS
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	System.out.println("APP DNI WEB PARADA");
    	//CERRAR LA CÁMARA
    	
    }
	
}






