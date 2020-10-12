package co.giovanny.link.service;

import java.util.Date;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import co.giovanny.link.dto.VelaDTO;
import co.giovanny.link.entities.Link;
import co.giovanny.link.repositories.ILinkRepository;
import co.giovanny.link.util.Constantes;
import co.giovanny.link.util.ConsumoRest;

@Service
public class LinkService {

	 private static final Logger LOGGER = Logger.getLogger(LinkService.class.getSimpleName());
	
	 @Autowired
	 ILinkRepository iLinkRepository;
	 
	 @Scheduled(fixedRate = 60000)
	 public void getValorBtc() {
		 		
	 String urlServicio = Constantes.URL_BINANCE + Constantes.TIPO_SERVICIO + Constantes.PAR + "&interval=1m&limit=1";
	 
	 try {
	
		 VelaDTO[] datos = ConsumoRest.restGet(urlServicio);
		 
		 if(datos!= null) 
		 {	 
				for(VelaDTO obj: datos) 
				{
					Link moneda = new Link();
					obj     = datos[0];
					
					moneda.setClose(obj.getClose());
					moneda.setCloseTime(new Date(obj.getCloseTime()));
					moneda.setHigh(obj.getHigh());
					moneda.setLow(obj.getLow());
					moneda.setMoneda(Constantes.MONEDA);
					moneda.setNumberOfTrades(obj.getNumberOfTrades());
					moneda.setOpen(obj.getOpen());
					moneda.setOpenTime(new Date(obj.getOpenTime()));
					moneda.setQuoteAssetVolume(obj.getQuoteAssetVolume());
					moneda.setTakerBuyBaseAssetVolume(obj.getTakerBuyBaseAssetVolume());
					moneda.setTakerBuyQuoteAssetVolume(obj.getTakerBuyQuoteAssetVolume());
					moneda.setVolume(obj.getVolume());
					
					iLinkRepository.save(moneda);
					
				}
				
		 }else {
			 
		 }
		 
				 
	 } catch (Exception e) {
	   LOGGER.severe("Error servicio binance" + e.getLocalizedMessage());
	}
	 	 	 
	 }
}
