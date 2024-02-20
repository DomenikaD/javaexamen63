package ec.edu.ups.ppw.javaexamen63.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw.javaexamen63.model.Cuota;
import ec.edu.ups.ppw.javaexamen63.model.Solicitud;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("solicitud")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SolicitudServices {
	

	    @POST
	    public Response registrarSolicitud(Solicitud solicitud) {
	        solicitud.setFecha(new Date());

	        
	        
	        //~~~~~~~Calcular el 10% de interés~~~~~~~
	        double interes = solicitud.getMonto() * 0.10;
	        
	        
	        
	        
	        

	        //~~~~~~~Calcular las cuotas~~~~~~~
	        double cuotaCapital = solicitud.getMonto() / solicitud.getMeses();
	        double cuotaInteres = interes / solicitud.getMeses();
	        double cuotaTotal = cuotaCapital + cuotaInteres;
	        
	        
	        
	        
	        
	        //~~~~~~~Crear la coleccion de cuotas~~~~~~~
	        List<Cuota> cuotas = new ArrayList();
	        for (int c = 1; c <= solicitud.getMeses(); c++) {
	            Cuota cuota = new Cuota();
	            cuota.setNumeroCuota(c);
	            cuota.setCuotaCapital(cuotaCapital);
	            cuota.setCuotaInteres(cuotaInteres);
	            cuota.setCuotaTota(cuotaTotal);
	            cuotas.add(cuota);
	        }
	        
	        
			return Response.ok(cuotas).build();
	    }
}
