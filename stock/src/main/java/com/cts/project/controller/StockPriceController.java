package com.cts.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.dao.StockPriceRepository;
import com.cts.project.pojo.StockPrice;

@RestController
@RequestMapping

public class StockPriceController {
	@Autowired

	private StockPriceRepository stockpriceRepository;

	 @RequestMapping("/getAllStockPrice")

	public Iterable<StockPrice> getAllStockPrice()

	{

	 return stockpriceRepository.findAll();

	}

	 @PostMapping("/saveStockPrice")

	 public StockPrice  savestockprice(@RequestBody StockPrice stockprice)

	 {

	 System.out.println(stockprice);

	 stockpriceRepository.save(stockprice);

	 return stockprice;

	 }



	 @PutMapping("/updateStockPrice/{companycode}")

	 public StockPrice updatestockprice(@RequestBody StockPrice stockprice,@PathVariable("companycode") Integer companycode)

	 {

	 stockprice.setCompanycode(companycode);

	 System.out.println(stockprice);

	 stockpriceRepository.save(stockprice);

	 return stockprice;

	 }

	 @DeleteMapping("/deleteStockPrice/{companycode}")

	 public StockPrice deletestockprice(@RequestBody StockPrice stockprice,@PathVariable("companycode") Integer companycode)

	 {

	 System.out.println(stockprice);

	 stockpriceRepository.deleteById(companycode);

	 return stockprice;

	 }

	 @GetMapping("/findOneInAll678/{companycode}")

	 public StockPrice findoneinall(@PathVariable("companycode") Integer companycode)

	 {
	 Optional<StockPrice> stockprice= stockpriceRepository.findById(companycode);

	 return stockprice.get();

	 }

}
