package co.giovanny.link.util;

import java.util.logging.Logger;
import org.springframework.web.client.RestTemplate;
import co.giovanny.link.dto.VelaDTO;



public class ConsumoRest 
{
	
	private static final Logger LOGGER  = Logger.getLogger(ConsumoRest.class.getSimpleName());
	
	// Consumo servicio rest
	public static VelaDTO[] restGet(String url)
	{		
		try {
		RestTemplate plantilla = new RestTemplate();
		VelaDTO[] resultado = plantilla.getForObject(url, VelaDTO[].class);
    	return resultado;
		}catch (Exception e) {
			e.printStackTrace();
			LOGGER.severe("Error al consumir servicio LINK "+ e.getMessage()); 
			return null;
		}
	}
}
