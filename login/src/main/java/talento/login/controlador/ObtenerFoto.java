package talento.login.controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Servlet implementation class ObtenerFoto
 */
public class ObtenerFoto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ObtenerFoto() {
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

		InputStream is = null;
		int leido = 0;
		long total_leidos = 0;
		byte[] buffer_lectura_escritura = null;

		String idfoto = request.getParameter("idfoto");
		String rutaFoto = EscuchaInicioFinLogin.RUTAS_FOTO + File.separator + idfoto;

		is = new FileInputStream(rutaFoto);

		buffer_lectura_escritura = new byte[1024];
		OutputStream os = response.getOutputStream();
		response.setContentType("img/jpeg");

		while ((leido = is.read(buffer_lectura_escritura)) != -1) {
			os.write(buffer_lectura_escritura, 0, leido);
			total_leidos = total_leidos + leido;
		}

		response.setHeader("Content-Length", Long.toString(total_leidos));

		is.close();
		os.flush();
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
