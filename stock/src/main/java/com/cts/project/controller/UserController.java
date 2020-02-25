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
import org.springframework.web.bind.annotation.CrossOrigin;  

import com.cts.project.dao.Userrepository;
import com.cts.project.pojo.User;

@RestController
@CrossOrigin(origins="http://localhost:4200")  

@RequestMapping("/User")

public class UserController {
	@Autowired

	private Userrepository userRepository;

	 @RequestMapping("/getAllUser")

	public Iterable<User> getAllUser()

	{

	 return userRepository.findAll();

	}

	 @PostMapping("/saveUser")

	 public User saveuser(@RequestBody User user)

	 {

	 System.out.println(user);

	 userRepository.save(user);

	 return user;

	 }



	 @PutMapping("/updateUser/{Id}")

	 public User updateuser(@RequestBody User user,@PathVariable("Id") int id)

	 {

	 System.out.println(user);

	 userRepository.save(user);
	 user.setId(id);

	 return user;

	 }

	 @DeleteMapping("/deleteUser/{id}")

	 public User deleteuser(@RequestBody User id,@PathVariable("id") Integer Id)

	 {

	 System.out.println(id);

	 userRepository.delete(id);

	 return id;

	 }

	 @GetMapping("/findOneInAll/{Id}")

	 public User findoneinall(@PathVariable("Id") Integer Id)

	 {
	 Optional<User> user= userRepository.findById(Id);

	 return user.get();

	 }
}
