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

import com.cts.project.dao.CompanyRepository;
import com.cts.project.pojo.Company;

@RestController
@CrossOrigin(origins="http://localhost:4200")  

@RequestMapping("/Company")

public class CompanyController {
	@Autowired

	private CompanyRepository companyRepository;

	 @RequestMapping("/getAllCompany")

	public Iterable<Company> getAllCompany()

	{

	 return companyRepository.findAll();

	}

	 @PostMapping("/saveCompany")

	 public Company savecompany(@RequestBody Company company)

	 {

	 System.out.println(company);

	 companyRepository.save(company);

	 return company;

	 }



	 @PutMapping("/updateCompany/{companyname}")

	 public Company updatecompany(@RequestBody Company company,@PathVariable("companyname") String companyname)

	 {

	 company.setCompanyName(companyname);

	 System.out.println(company);

	 companyRepository.save(company);

	 return company;

	 }

	 @DeleteMapping("/deleteCompany/{companyname}")

	 public Company deletecompany(@RequestBody Company company,@PathVariable("companyname") String companyname)

	 {

	 System.out.println(company);

	 companyRepository.deleteById(companyname);

	 return company;

	 }

	 @GetMapping("/findOneInAll12/{companyname}")

	 public Company findoneinall(@PathVariable("companyname") String companyname)

	 {
	 Optional<Company> company= companyRepository.findById(companyname);

	 return company.get();

	 }
}
