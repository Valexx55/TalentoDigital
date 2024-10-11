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
import java.sql.SQLException;

import com.google.gson.Gson;

/**
 * Servlet implementation class ObtenerPerfil
 */
public class ObtenerPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObtenerPerfil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion =  request.getSession(false);
		if (sesion!=null)
		{
			int id = (int) sesion.getAttribute("idusuario");
			UsuarioService usuarioService = new UsuarioService();
			try {
				Usuario usuario = usuarioService.leerUsuario(id);
				Gson gson = new Gson();
				String usuariojson = gson.toJson(usuario);
				response.getWriter().write(usuariojson);
				response.setStatus(200);
				response.setContentType("application/json");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.setStatus(500);
			}
		} else {
			response.setStatus(401);
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
