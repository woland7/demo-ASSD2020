package presentation;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import it.unisannio.appplication.CurrencyConverterLocal;

/**
 * Servlet implementation class ConverterController
 */
@Consumes("application/json")	// Non usato
@Produces("application/json")  	// Non usato
@Path("/ConverterController")	
public class ConverterController {
	
    @EJB
	private CurrencyConverterLocal converter;
    
   
    /**
     * //@see HttpServlet#HttpServlet()
     */
    public ConverterController() {
        super();
    }
    @GET
	public Response getCurrency(@QueryParam("euro") float euro)  {
		try {	   
		   float dollars = converter.convert(euro);
		   return Response.ok().entity(dollars).build();
		} catch (Exception e) { 		
		   return Response.status(500, "Errore sul server").build();
		} 
	
	}

}
