package talento.login.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import talento.login.bean.Usuario;
import talento.login.service.UsuarioService;

import java.io.IOException;

import com.google.gson.Gson;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Login() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			String infoUsuarioJson =  request.getReader().readLine();
			Gson gson = new Gson();
			Usuario usuario = gson.fromJson(infoUsuarioJson, Usuario.class);
			UsuarioService usuarioService = new UsuarioService();
			Usuario u = usuarioService.leerUsuario(usuario);
			if (u!=null)
				{
					System.out.println("El usuario existe");
					int idu = u.getIdusuario();
					HttpSession sesion = request.getSession(true);
					sesion.setAttribute("idusuario", idu);
					response.setStatus(200);
				} else {
					System.out.println("El usuario NO existe");
					response.setStatus(403);
				}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Hubo un error");
			response.setStatus(500);
		}
		
		
	}

}

