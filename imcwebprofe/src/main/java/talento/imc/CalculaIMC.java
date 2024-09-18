package talento.imc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.google.gson.Gson;

/**
 * Servlet implementation class CalculaIMC
 */
public class CalculaIMC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculaIMC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.setStatus(500);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1 PROCESO PETICIÓN
		/*String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		String peso = request.getParameter("peso");
		String altura = request.getParameter("altura");*/
		//recibimos el JSON
		Gson gson = new Gson();
		String jsonPersona = request.getReader().readLine();//leo el cuerpo
		Persona persona = gson.fromJson(jsonPersona, Persona.class);//lo paso a objeto JSON A JAVA
		//System.out.println("NOMBRE = " + nombre + " EDAD " + edad + " Peso "+peso+ " Altura "+ altura);
		//2 CALCULO EL IMC
		//Persona persona = new Persona(Float.parseFloat(peso), Float.parseFloat(altura), nombre, Integer.parseInt(edad));
		float imc_numerico = IMC.calculoIMC(persona.getPeso(), persona.getAltura());
		String imc_nominal = IMC.traducirIMC(imc_numerico);
		//3 GENERAMOS LA RESPUESTA
		ResultadoIMC resultadoIMC = new ResultadoIMC(imc_numerico, imc_nominal);
		//convertir resultadoIMC a JSON 
		
		String resultadoIMCJson = gson.toJson(resultadoIMC);
		//y para ello, me ayudo de la librería gson
		response.setContentType("application/json");//con esto indicamos el tipo de info que viaja en el cuerpo
		//response.getWriter().write("SU IMC ES " +imc_nominal + "("+imc_numerico+")");
		response.getWriter().write(resultadoIMCJson);
		response.setStatus(200);
		//doGet(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
