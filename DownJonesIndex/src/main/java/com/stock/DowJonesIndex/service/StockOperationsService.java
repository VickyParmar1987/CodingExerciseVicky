/**
 * 
 */
package com.stock.DowJonesIndex.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.stock.DowJonesIndex.model.StockData;
import com.stock.DowJonesIndex.repository.StockDataRepository;
import com.stock.DowJonesIndex.util.StockDataPOJO;

/**
 * @author vicky
 *
 */

@Service("stockOperationsService")
public class StockOperationsService implements StockServiceInterface {

	@Autowired
	StockDataRepository stockDataRepository;

	@Autowired
	StockData stockData;

	/* (non-Javadoc)
	 * @see com.stock.DowJonesIndex.service.StockServiceInterface#saveFile(org.springframework.web.multipart.MultipartFile)
	 */
	public String saveFile(MultipartFile multipartFile) throws IOException {

		InputStream inputStream2 = multipartFile.getInputStream();
		new BufferedReader(new InputStreamReader(inputStream2, StandardCharsets.UTF_8)).lines().skip(1).forEach(s -> {
			ArrayList<String> stockLineList = new ArrayList<>(Arrays.asList(s.split(",")));
			System.out.println(stockLineList.get(0));
			System.out.println(stockLineList.toString());
			StockData stockData = new StockData(Integer.parseInt(stockLineList.get(0)), stockLineList.get(1), null,
					stockLineList.get(3), stockLineList.get(4), stockLineList.get(5), stockLineList.get(6),
					Long.parseLong(stockLineList.get(7)), Double.parseDouble(stockLineList.get(8)), 0, 0,
					stockLineList.get(11), stockLineList.get(12), Double.parseDouble(stockLineList.get(13)),
					Integer.parseInt(stockLineList.get(14)), Double.parseDouble(stockLineList.get(15)));

			System.out.println(stockData.toString());
			stockDataRepository.save(stockData);
		});
		return null;

	}

	/**
	 * @param stock
	 * @return
	 */
	public List<StockData> findByStock(String stock) {

		return stockDataRepository.findByStock(stock);

	}

	/**
	 * @param sd
	 * @return
	 */
	public String saveJsonStock(StockDataPOJO sd) {
		try {
			StockData stockData = new StockData();
			stockData.setQuarter(sd.getQuarter());
			stockData.setStock(sd.getStock());
			stockData.setClose(sd.getClose());
			stockData.setDaysToNextDividend(sd.getDaysToNextDividend());
			stockData.setHigh(sd.getHigh());
			stockData.setLow(sd.getLow());
			stockData.setNextWeeksClose(sd.getNextWeeksClose());
			stockData.setNextWeeksOpen(sd.getNextWeeksOpen());
			stockData.setOpen(sd.getOpen());
			stockData.setPercentChangeNextWeeksPrice(sd.getPercentChangeNextWeeksPrice());
			stockData.setPercentChangePrice(sd.getPercentChangePrice());
			stockData.setPercentChangeVolumeOverLastWk(sd.getPercentChangeVolumeOverLastWk());
			stockData.setPercentReturnNextDividend(sd.getPercentReturnNextDividend());
			stockData.setPreviousWeeksVolume(sd.getPreviousWeeksVolume());
			stockData.setVolume(sd.getVolume());
			stockDataRepository.save(stockData);
			return "Success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
