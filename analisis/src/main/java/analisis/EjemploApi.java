package analisis;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

public class EjemploApi {

	public EjemploApi() {
		// TODO Auto-generated constructor stub
		String emailAverificar = "juan.benavides@cecar.edu.co";
		String endPoint ="http://apilayer.net/api/check?access_"
				+ "key=703c7b883e3e7e526f362a6d2200c471&email="+emailAverificar
				+ "&smtp=1&format=1" ;
		
		Client client = ClientBuilder.newClient();
		Response response = client.target(endPoint).request().get();
		String result = response.readEntity(String.class);
	    System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		new EjemploApi();
		
	}
}
