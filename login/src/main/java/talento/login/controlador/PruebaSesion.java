package talento.login.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class PruebaSesion
 */
public class PruebaSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PruebaSesion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession httpSession = request.getSession(false);// se crea una nueva sesión o se recupera la existente
		if (httpSession!=null)
		{
			System.out.println("El usuario ya tiene una sesión válida");
		} else {
			System.out.println("El usuario NO tiene una sesión ");
			httpSession = request.getSession();//true
		}
		
		
		Integer num_veces = (Integer) httpSession.getAttribute("num_veces");
		if (num_veces != null) {
			// ya estaba en el saco. Le sumo uno
			num_veces = num_veces+1;
		} else {
			// no estaba en el saco. Es nuevo
			num_veces = 1;
		}
		System.out.println(httpSession.getId() + " ha venido "+ num_veces + " veces");
		httpSession.setAttribute("num_veces", num_veces);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
