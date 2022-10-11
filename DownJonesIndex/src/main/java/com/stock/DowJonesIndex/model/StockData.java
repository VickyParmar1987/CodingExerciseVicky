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
	

}
