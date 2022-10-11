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
//import com.stock.DowJonesIndex.repository.StockDataRepository;
import com.stock.DowJonesIndex.repository.StockDataRepository;

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
	
	
	public String saveFile(MultipartFile multipartFile) throws IOException {
		
		final String fileType = "text/csv";
		
		/*InputStream inputStream = multipartFile.getInputStream();
		new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
		                    .lines()
		                    .forEach(System.out::println);*/
		
		InputStream inputStream2 = multipartFile.getInputStream();
		new BufferedReader(new InputStreamReader(inputStream2, StandardCharsets.UTF_8))
		                    .lines().skip(1)
		                    .forEach(s -> {
		                    	ArrayList<String> stockLineList = new ArrayList<>(Arrays.asList(s.split(",")));
		                    	System.out.println(stockLineList.get(0));
		                    	//if(stockLineList.get(0).equalsIgnoreCase("quarter")){System.out.println("Skipped first line");}else {
		                    	System.out.println(stockLineList.toString());
		                    	StockData stockData = new StockData(
		                    			 Integer.parseInt(stockLineList.get(0)), stockLineList.get(1),
		                    			null, stockLineList.get(3), stockLineList.get(4), 
		                    			stockLineList.get(5), 
		                    			stockLineList.get(6), 0, 0, 0, 0, 
		                    			stockLineList.get(11), 
		                    			stockLineList.get(12), 0, 0, 0
		                    			);
		                    	
		                    	System.out.println(stockData.toString());
		                    	stockDataRepository.save(stockData);
		                    	//}
		                    });
		return null;
		
	}
	
	
	public List<StockData> findByStock(String stock) {
		
		
		return  stockDataRepository.findByStock(stock);
		
		
	}


	public String saveJsonStock(StockData stockDataJson) {
		try {
		stockDataRepository.save(stockData);
		return "Success";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	
	
}
