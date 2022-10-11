/**
 * 
 */
package com.stock.DowJonesIndex.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stock.DowJonesIndex.model.StockData;
import com.stock.DowJonesIndex.service.StockOperationsService;

/**
 * @author vicky
 *
 */
@RestController
public class StockOperationsController {
	
	@Autowired
	StockOperationsService stockOperationsService;
	
	@GetMapping(value = "/home")
	public String getCurrentData(){
		return "Hello!";
		
	}
	
	@GetMapping(value = "/{stock}")
	public ResponseEntity<List<StockData>>  getStockData(@PathVariable("stock") String stock){
		List<StockData> stockDataList = stockOperationsService.findByStock(stock);
		
		System.out.println("stockDataList:{}"+stockDataList.size());
		return new ResponseEntity<>(stockDataList, HttpStatus.OK);
		
	}

	
	@PostMapping(value = "/bulk-insert")
	public ResponseEntity<String> bulkInsertDataFile(@RequestParam("file") MultipartFile file){
		
		
		try {
			return new ResponseEntity<>(stockOperationsService.saveFile(file), HttpStatus.OK);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	@PostMapping(value = "/")
	public ResponseEntity<String> postStockData(StockData stockData){
		
		try {
			return new ResponseEntity<>(stockOperationsService.saveJsonStock(stockData), HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
}
