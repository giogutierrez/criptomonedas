package co.giovanny.bitcoin.service;

import java.util.Date;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import co.giovanny.bitcoin.dto.VelaDTO;
import co.giovanny.bitcoin.entities.Btc;
import co.giovanny.bitcoin.repositories.IBtcRepository;
import co.giovanny.bitcoin.util.Constantes;
import co.giovanny.bitcoin.util.ConsumoRest;

@Service
public class BtcService {

	 private static final Logger LOGGER = Logger.getLogger(BtcService.class.getSimpleName());
	
	 @Autowired
	 IBtcRepository iBtcRepository;
	 
	 @Scheduled(fixedRate = 60000)
	 public void getValorBtc() {
		 		
	 String urlServicio = Constantes.URL_BINANCE + Constantes.TIPO_SERVICIO + Constantes.PAR + "&interval=1m&limit=1";
	 
	 try {
	
		 VelaDTO[] datos = ConsumoRest.restGet(urlServicio);
		 
		 if(datos!= null) 
		 {	 
				for(VelaDTO obj: datos) 
				{
					Btc moneda = new Btc();
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
					
					iBtcRepository.save(moneda);
					
				}
				
		 }else {
			 
		 }
		 
				 
	 } catch (Exception e) {
	   LOGGER.severe("Error servicio binance" + e.getLocalizedMessage());
	}
	 	 	 
	 }
}
