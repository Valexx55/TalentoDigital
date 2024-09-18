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
	//5 RECIBO PETICIÓN EN SERVIDOR "callback de tomcat"
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//6 LEO EL CUERPO SACO EL JSON
		Gson gson = new Gson();
		String jsonPersona = request.getReader().readLine();//leo el cuerpo
		//7 DESERIALIZO A OBJETO JAVA
		Persona persona = gson.fromJson(jsonPersona, Persona.class);//lo paso a objeto JSON A JAVA
		//8 HAGO EL CÁCULO
		float imc_numerico = IMC.calculoIMC(persona.getPeso(), persona.getAltura());
		String imc_nominal = IMC.traducirIMC(imc_numerico);
		//9 GENERAMOS LA RESPUESTA
		ResultadoIMC resultadoIMC = new ResultadoIMC(imc_numerico, imc_nominal);
		//10 PASO LA RESPUESTA A JSON 
		String resultadoIMCJson = gson.toJson(resultadoIMC);
		//11 ENVÍO/COMPONGO RESPUESTA
		response.setContentType("application/json");//con esto indicamos el tipo de info que viaja en el cuerpo
		response.getWriter().write(resultadoIMCJson);
		response.setStatus(200);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
