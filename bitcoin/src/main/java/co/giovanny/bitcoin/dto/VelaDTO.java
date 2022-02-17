package co.giovanny.bitcoin.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonPropertyOrder()
@JsonIgnoreProperties(ignoreUnknown = true)
public class VelaDTO {
	
	
	  private Long   openTime;
	  private BigDecimal open;
	  private BigDecimal high;
	  private BigDecimal low;
	  private BigDecimal close;
	  private BigDecimal volume;
	  private Long   closeTime;
	  private BigDecimal quoteAssetVolume;
	  private Long   numberOfTrades;
	  private BigDecimal takerBuyBaseAssetVolume;
	  private BigDecimal takerBuyQuoteAssetVolume;
	  
	  
	public Long getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Long openTime) {
		this.openTime = openTime;
	}
	public BigDecimal getOpen() {
		return open;
	}
	public void setOpen(BigDecimal open) {
		this.open = open;
	}
	public BigDecimal getHigh() {
		return high;
	}
	public void setHigh(BigDecimal high) {
		this.high = high;
	}
	public BigDecimal getLow() {
		return low;
	}
	public void setLow(BigDecimal low) {
		this.low = low;
	}
	public BigDecimal getClose() {
		return close;
	}
	public void setClose(BigDecimal close) {
		this.close = close;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	public Long getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(Long closeTime) {
		this.closeTime = closeTime;
	}
	public BigDecimal getQuoteAssetVolume() {
		return quoteAssetVolume;
	}
	public void setQuoteAssetVolume(BigDecimal quoteAssetVolume) {
		this.quoteAssetVolume = quoteAssetVolume;
	}
	public Long getNumberOfTrades() {
		return numberOfTrades;
	}
	public void setNumberOfTrades(Long numberOfTrades) {
		this.numberOfTrades = numberOfTrades;
	}
	public BigDecimal getTakerBuyBaseAssetVolume() {
		return takerBuyBaseAssetVolume;
	}
	public void setTakerBuyBaseAssetVolume(BigDecimal takerBuyBaseAssetVolume) {
		this.takerBuyBaseAssetVolume = takerBuyBaseAssetVolume;
	}
	public BigDecimal getTakerBuyQuoteAssetVolume() {
		return takerBuyQuoteAssetVolume;
	}
	public void setTakerBuyQuoteAssetVolume(BigDecimal takerBuyQuoteAssetVolume) {
		this.takerBuyQuoteAssetVolume = takerBuyQuoteAssetVolume;
	}
	  

	  
	  

}
