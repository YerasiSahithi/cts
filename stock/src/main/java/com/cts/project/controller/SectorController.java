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
import com.cts.project.dao.SectorRepository;
import com.cts.project.pojo.Sector;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/Sector")

public class SectorController {
	@Autowired

	private SectorRepository sectorRepository;

	 @RequestMapping("/getAllSector")

	public Iterable<Sector> getAllSector()

	{

	 return sectorRepository.findAll();

	}

	 @PostMapping("/saveSector")

	 public Sector savesector(@RequestBody Sector sector)

	 {

	 System.out.println(sector);

	 sectorRepository.save(sector);

	 return sector;

	 }



	 @PutMapping("/updateSector/{Id}")

	 public Sector updatesector(@RequestBody Sector sector,@PathVariable("Id") int id)

	 {

	 System.out.println(sector);

	 sectorRepository.save(sector);
	 sector.setId(id);

	 return sector;

	 }

	 @DeleteMapping("/deleteSector/{Id}")

	 public Sector deletesector(@RequestBody Sector id,@PathVariable("Id") Integer Id)

	 {

	 System.out.println(id);

	 sectorRepository.deleteById(Id);

	 return id;

	 }

	 @GetMapping("/findOneInAll1234/{Id}")

	 public Sector findoneinall(@PathVariable("Id") Integer Id)

	 {
	 Optional<Sector> sector= sectorRepository.findById(Id);

	 return sector.get();

	 }

}
