package talento.dni.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import talento.dni.Dni;
import talento.dni.servicio.DniService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;//nombre canónico de la clase: paquete y el nombre (nombre completo)

import com.google.gson.Gson;

/**
 * Servlet implementation class ServletListadoDni
 */
public class ServletListadoDni extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Logger log = Logger.getLogger("mylog");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletListadoDni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("Peticion GET en el servlet");
		log.debug("Petición GET en el Servlet ServletListadoDni");
		DniService dniService = new DniService();
		try {
			 List<Dni> listaDni =  dniService.recuperarListadoDni();
			 Gson gson = new Gson();
			 String listaJsonDni = gson.toJson(listaDni);
			 response.getWriter().write(listaJsonDni);
			 response.setStatus(200);
			 response.setContentType("application/json"); 
			 log.debug("La petición fue bien " + listaJsonDni);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("ha habido un error de base de datos", e);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ha habido un error general", e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
