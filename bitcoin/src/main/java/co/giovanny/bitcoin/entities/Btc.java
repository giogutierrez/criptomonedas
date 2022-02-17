package co.giovanny.bitcoin.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity 
@Table(name = "btc", schema = "cripto")
public class Btc {
	
	@Id
	@SequenceGenerator(name = "BTC_GENERATOR", sequenceName = "btc_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BTC_GENERATOR")
	@Column(name = "id_btc")
	private Long id;
	
	@Column(name = "moneda")
	private String moneda;
	
	@Column(name = "opentime_btc")
	private Date   openTime;
	
	@Column(name = "open_btc")
	private BigDecimal open;
	
	@Column(name = "high_btc")
	private BigDecimal high;
	
	@Column(name = "low_btc")
	private BigDecimal low;
	
	@Column(name = "close_btc")
	private BigDecimal close;
	
	@Column(name = "volume_btc")
	private BigDecimal volume;
	
	@Column(name = "closetime_btc")
	private Date   closeTime;
	
	@Column(name = "quoteassetvolume_btc")
	private BigDecimal quoteAssetVolume;
	
	@Column(name = "numberoftrades_btc")
	private Long   numberOfTrades;
	
	@Column(name = "takerbuybaseassetvolume_btc")
	private BigDecimal takerBuyBaseAssetVolume;
	
	@Column(name = "takerbuyquoteassetvolume_btc")
	private BigDecimal takerBuyQuoteAssetVolume;

	
	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
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

	public Date getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Date closeTime) {
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
