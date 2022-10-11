/**
 * 
 */
package com.stock.DowJonesIndex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stock.DowJonesIndex.model.StockData;

/**
 * @author vicky
 *
 */
@Repository
public interface StockDataRepository extends JpaRepository<StockData, Integer> {

	
	@Query("Select t from StockData t where t.stock=?1")
    List<StockData> findByStock(String stock);


}
