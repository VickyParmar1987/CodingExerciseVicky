package com.stock.DowJonesIndex.util;

import java.sql.Date;

public class StockDataPOJO {
	
	
		private int quarter;
		
		private String stock;
		
		private String date;
		
		private String open;
		
		private String high;
		
		private String low;
		
		private String close;
		
		private long volume;
		
		private double percentChangePrice;
		
		private double percentChangeVolumeOverLastWk;
		
		private long previousWeeksVolume;
		
		private String nextWeeksOpen;
		
		private String nextWeeksClose;
		
		private double percentChangeNextWeeksPrice;
		
		private int daysToNextDividend;
		
		private double percentReturnNextDividend;

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

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
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

		@Override
		public String toString() {
			return "StockDataPOJO [quarter=" + quarter + ", stock=" + stock + ", date=" + date + ", open=" + open
					+ ", high=" + high + ", low=" + low + ", close=" + close + ", volume=" + volume
					+ ", percentChangePrice=" + percentChangePrice + ", percentChangeVolumeOverLastWk="
					+ percentChangeVolumeOverLastWk + ", previousWeeksVolume=" + previousWeeksVolume
					+ ", nextWeeksOpen=" + nextWeeksOpen + ", nextWeeksClose=" + nextWeeksClose
					+ ", percentChangeNextWeeksPrice=" + percentChangeNextWeeksPrice + ", daysToNextDividend="
					+ daysToNextDividend + ", percentReturnNextDividend=" + percentReturnNextDividend + "]";
		}

		



}
