package co.giovanny.link.entities;

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
@Table(name = "link", schema = "cripto")
public class Link {
	
	@Id
	@SequenceGenerator(name = "LINK_GENERATOR", sequenceName = "link_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LINK_GENERATOR")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "moneda")
	private String moneda;
	
	@Column(name = "opentime")
	private Date   openTime;
	
	@Column(name = "open")
	private BigDecimal open;
	
	@Column(name = "high")
	private BigDecimal high;
	
	@Column(name = "low")
	private BigDecimal low;
	
	@Column(name = "close")
	private BigDecimal close;
	
	@Column(name = "volume")
	private BigDecimal volume;
	
	@Column(name = "closetime")
	private Date   closeTime;
	
	@Column(name = "quoteassetvolume")
	private BigDecimal quoteAssetVolume;
	
	@Column(name = "numberoftrades")
	private Long   numberOfTrades;
	
	@Column(name = "takerbuybaseassetvolume")
	private BigDecimal takerBuyBaseAssetVolume;
	
	@Column(name = "takerbuyquoteassetvolume")
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
