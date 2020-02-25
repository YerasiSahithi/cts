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

import com.cts.project.dao.IPORepository;
import com.cts.project.pojo.IPO;


@RestController
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping("/IPO")


public class IPOController {
	@Autowired
	private IPORepository ipoRepository;

	 @RequestMapping("/getAllIPO")

	public Iterable<IPO> getAllIPO()

	{

	 return ipoRepository.findAll();

	}

	 @PostMapping("/saveIPO")

	 public IPO saveIPO(@RequestBody IPO ipo)

	 {

	 System.out.println(ipo);

	 ipoRepository.save(ipo);

	 return ipo;

	 }



	 @PutMapping("/updateIPO/{Id}")

	 public IPO updateipo(@RequestBody IPO ipo,@PathVariable("Id") Integer id)

	 {

	 System.out.println(ipo);

	 ipoRepository.save(ipo);
	 ipo.setId(id);

	 return ipo;

	 }

	 @DeleteMapping("/deleteIPO/{Id}")

	 public IPO deleteipo(@RequestBody IPO id,@PathVariable("Id") Integer Id)

	 {

	 System.out.println(id);

	 ipoRepository.deleteById(Id);

	 return id;

	 }

	 @GetMapping("/findOneInAll123/{Id}")

	 public IPO findoneinall(@PathVariable("Id") Integer Id)

	 {
	 Optional<IPO> ipo= ipoRepository.findById(Id);

	 return ipo.get();

	 }


}
