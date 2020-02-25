package com.cts.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.StockExchangeRepository;
import com.cts.project.pojo.StockExchange;


@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping("/StockExchange")

public class StockexchangeController {
	@Autowired

	private StockExchangeRepository stockexchangeRepository;

	 @RequestMapping("/getAllStockExchange")

	public Iterable<StockExchange> getAllStockExchange()

	{

	 return stockexchangeRepository.findAll();

	}

	 @PostMapping("/saveStockExchange")

	 public StockExchange savestockexchange(@RequestBody StockExchange stockexchange)

	 {

	 System.out.println(stockexchange);

	 stockexchangeRepository.save(stockexchange);

	 return stockexchange;

	 }



	 @PutMapping("/updateStockExchange/{Id}")

	 public StockExchange updatestockexchange(@RequestBody StockExchange stockexchange,@PathVariable("Id") int id)

	 {

	 System.out.println(stockexchange);

	 stockexchangeRepository.save(stockexchange);
	 stockexchange.setId(id);

	 return stockexchange;

	 }

	 @DeleteMapping("/deleteStockExchange/{Id}")

	 public StockExchange deletesector(@RequestBody StockExchange id,@PathVariable("Id") Integer Id)

	 {

	 System.out.println(id);

	 stockexchangeRepository.deleteById(Id);

	 return id;

	 }

	 @GetMapping("/findOneInAll56/{Id}")

	 public StockExchange findoneinall(@PathVariable("Id") Integer Id)

	 {
	 Optional<StockExchange> sector= stockexchangeRepository.findById(Id);

	 return sector.get();

	 }


}
