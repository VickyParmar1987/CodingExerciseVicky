package com.stock.DowJonesIndex.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "stock_data")
public class StockData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="quarter")
	private int quarter;
	
	@Column(name ="stock")
	private String stock;
	
	@Column(name ="date")
	private Date date;
	
	@Column(name ="open")
	private String open;
	
	@Column(name ="high")
	private String high;
	
	@Column(name ="low")
	private String low;
	
	@Column(name ="close")
	private String close;
	
	@Column(name ="volume")
	private long volume;
	
	@Column(name ="percent_change_price")
	private double percentChangePrice;
	
	@Column(name ="percent_change_volume_over_last_wk")
	private double percentChangeVolumeOverLastWk;
	
	@Column(name ="previous_weeks_volume")
	private long previousWeeksVolume;
	
	@Column(name ="next_weeks_open")
	private String nextWeeksOpen;
	
	@Column(name ="next_weeks_close")
	private String nextWeeksClose;
	
	@Column(name ="percent_change_next_weeks_price")
	private double percentChangeNextWeeksPrice;
	
	@Column(name ="days_to_next_dividend")
	private int daysToNextDividend;
	
	@Column(name ="percent_return_next_dividend")
	private double percentReturnNextDividend;

	public StockData( int quarter, String stock, Date date, String open, String high, String low, String close,
			long volume, double percentChangePrice, double percentChangeVolumeOverLastWk,
			long previousWeeksVolume, String nextWeeksOpen, String nextWeeksClose,
			double percentChangeNextWeeksPrice, int daysToNextDividend, double percent_return_next_dividend) {
		super();
		this.quarter = quarter;
		this.stock = stock;
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.percentChangePrice = percentChangePrice;
		this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
		this.previousWeeksVolume = previousWeeksVolume;
		this.nextWeeksOpen = nextWeeksOpen;
		this.nextWeeksClose = nextWeeksClose;
		this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
		this.daysToNextDividend = daysToNextDividend;
		this.percentReturnNextDividend = percentReturnNextDividend;
	}

	public StockData() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StockData [ quarter=" + quarter + ", stock=" + stock + ", date=" + date + ", open=" + open
				+ ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume
				+ ", percentChangePrice=" + percentChangePrice + ", percentChangeVolumeOverLastWk="
				+ percentChangeVolumeOverLastWk + ", previousWeeksVolume=" + previousWeeksVolume
				+ ", nextWeeksOpen=" + nextWeeksOpen + ", nextWeeksClose=" + nextWeeksClose
				+ ", percentChangeNextWeeksPrice=" + percentChangeNextWeeksPrice + ", daysToNextDividend="
				+ daysToNextDividend + ", percentReturnNextDividend=" + percentReturnNextDividend + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuarter() {
		return quarter;
	}

	public void setQuarter(int quarter) {
		this.quarter = quarter;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public double getPercentChangePrice() {
		return percentChangePrice;
	}

	public void setPercentChangePrice(double percentChangePrice) {
		this.percentChangePrice = percentChangePrice;
	}

	public double getPercentChangeVolumeOverLastWk() {
		return percentChangeVolumeOverLastWk;
	}

	public void setPercentChangeVolumeOverLastWk(double percentChangeVolumeOverLastWk) {
		this.percentChangeVolumeOverLastWk = percentChangeVolumeOverLastWk;
	}

	public long getPreviousWeeksVolume() {
		return previousWeeksVolume;
	}

	public void setPreviousWeeksVolume(long previousWeeksVolume) {
		this.previousWeeksVolume = previousWeeksVolume;
	}

	public String getNextWeeksOpen() {
		return nextWeeksOpen;
	}

	public void setNextWeeksOpen(String nextWeeksOpen) {
		this.nextWeeksOpen = nextWeeksOpen;
	}

	public String getNextWeeksClose() {
		return nextWeeksClose;
	}

	public void setNextWeeksClose(String nextWeeksClose) {
		this.nextWeeksClose = nextWeeksClose;
	}

	public double getPercentChangeNextWeeksPrice() {
		return percentChangeNextWeeksPrice;
	}

	public void setPercentChangeNextWeeksPrice(double percentChangeNextWeeksPrice) {
		this.percentChangeNextWeeksPrice = percentChangeNextWeeksPrice;
	}

	public int getDaysToNextDividend() {
		return daysToNextDividend;
	}

	public void setDaysToNextDividend(int daysToNextDividend) {
		this.daysToNextDividend = daysToNextDividend;
	}

	public double getPercentReturnNextDividend() {
		return percentReturnNextDividend;
	}

	public void setPercentReturnNextDividend(double percentReturnNextDividend) {
		this.percentReturnNextDividend = percentReturnNextDividend;
	}
	

}
