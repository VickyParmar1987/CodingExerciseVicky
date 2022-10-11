package com.stock.DowJonesIndex.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface StockServiceInterface {
	
	public String saveFile(MultipartFile file) throws IOException;

}
