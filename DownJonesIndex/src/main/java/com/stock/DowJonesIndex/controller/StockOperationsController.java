/**
 * 
 */
package com.stock.DowJonesIndex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.DowJonesIndex.model.StockData;
import com.stock.DowJonesIndex.service.StockOperationsService;
import com.stock.DowJonesIndex.util.StockDataPOJO;

/**
 * @author vicky
 *
 */
@Controller
@RequestMapping("/api/stock-data")
public class StockOperationsController {
	
	@Autowired
	StockOperationsService stockOperationsService;
	
	
	@GetMapping(value = "/{stock}")
	public ResponseEntity<List<StockData>>  getStockData(@PathVariable("stock") String stock){
		List<StockData> stockDataList = stockOperationsService.findByStock(stock);
		
		return new ResponseEntity<>(stockDataList, HttpStatus.OK);
		
	}

	
	@PostMapping(value = "/bulk-insert", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String> bulkInsertDataFile(@RequestPart("file") MultipartFile file){
		
		try {
			return new ResponseEntity<>(stockOperationsService.saveFile(file), HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	@PostMapping(value = "/")
	public ResponseEntity<String> postStockData(@RequestBody  StockDataPOJO stockDataFromRequest){
	
		try {
			StockDataPOJO sd = new ObjectMapper().convertValue(stockDataFromRequest, StockDataPOJO.class);
			System.out.println(sd.toString());
			
			
			
			return new ResponseEntity<>(stockOperationsService.saveJsonStock(sd), HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
}
