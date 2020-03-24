package com.example.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	DemoRepo repo;
	
	@GetMapping("/demo")
	public List<DemoModel> getDemo() {
	    return repo.findAll();
	}
	
	@PostMapping("/demo")
	public DemoModel createDemo(@Valid @RequestBody DemoModel demo) {
	    return repo.save(demo);
	}
}
