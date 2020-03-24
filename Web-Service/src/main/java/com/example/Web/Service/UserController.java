package com.example.Web.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

import com.example.Web.Service.UserRepository;
import com.example.Web.Service.UserModel;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping("/users")
	public List<UserModel> getAllUsers(){
		return repository.findAll();
	}
	
	@PostMapping("/users")
	public List<UserModel> createUser(@Valid @RequestBody List<UserModel> users) {
		return repository.saveAll(users);
	}
	
	@DeleteMapping("/users")
	public String deleteAllUsers() {
		repository.deleteAll();
		return "All users deleted";
	}
	
	@GetMapping("/users/{idStudent}")
	public UserModel getUserById(@PathVariable("idStudent") Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("UserModel"));
	}
	
	@PutMapping("/users/{idStudent}")
	public UserModel updateUser(@PathVariable("idStudent") Long id,
								@Valid @RequestBody UserModel details) {
		UserModel user = repository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("UserModel"));
		
		user.setAge(details.getAge());
		user.setDepartment(details.getDepartment());
		user.setEmail(details.getEmail());
		user.setGender(details.getGender());
		user.setName(details.getName());
		user.setPassword(details.getPassword());
		user.setPhoneNumber(details.getPhoneNumber());
		user.setPoints(details.getPoints());
		user.setPreference(details.getPreference());
		user.setSexuality(details.getSexuality());
		user.setSurname(details.getSurname());
		
		
		UserModel updatedUser = repository.save(user);
		return updatedUser;
	}
	
	@DeleteMapping("/users/{idStudent}")
	public String deleteUser(@PathVariable("idStudent") Long id){
		UserModel user = repository.findById(id)
				.orElseThrow(() -> new ResourceAccessException("UserModel"));
		repository.delete(user);
		return id+ " deleted";
	}
	
	@GetMapping("/test")
	public String doNothing() {
		String str = "HELLO";
		System.out.print("working");
		return str;
	}

}
