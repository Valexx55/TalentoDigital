package talento.dni;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import talento.dni.bd.DniRepository;

import java.io.IOException;
import java.net.http.HttpClient;
import java.sql.SQLException;

import com.google.gson.Gson;

/**
 * Servlet implementation class CalculaLetraDni
 */
//@WebServlet("/CalculaLetraDni")//con esto, le digo a Tomcat: oye, si viene una url que acaba en /CalculaLetraDni, es para esta clase
public class CalculaLetraDni extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculaLetraDni() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dniJson = request.getReader().readLine();
		Gson gson = new Gson();
		Dni dnirecibido = gson.fromJson(dniJson, Dni.class);
		
		char letra = dnirecibido.calcularLetraDNI();
		dnirecibido.setLetra(letra);
		
		DniRepository dniRepository = new DniRepository();
		try {
			
			dniRepository.insertarDni(dnirecibido);
			String dniRespuestaJson = gson.toJson(dnirecibido);
			response.getWriter().write(dniRespuestaJson);
			
			response.setStatus(200);
			response.setContentType("application/json");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			response.setStatus(500);
			response.setContentType("application/json");
			response.getWriter().write("{\"error\": "+e.toString()+"}");
		}
		
		
		
	}

}




















