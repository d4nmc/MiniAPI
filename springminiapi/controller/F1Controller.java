package com.natwest.springminiapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.springminiapi.domain.Formula1;
import com.natwest.springminiapi.service.Formula1Service;

@RestController
@RequestMapping("/formula1")
public class F1Controller {

	private Formula1Service service;

	@Autowired
	public F1Controller(Formula1Service service) {
		this.service = service;
	}

	@GetMapping("/test")
	public String test() {
		return "This is a test";
	}

	@PostMapping("/create")
	public ResponseEntity<Formula1> create(@RequestBody Formula1 f1) {
		return new ResponseEntity<Formula1>(this.service.create(f1), HttpStatus.CREATED);

	}

	@GetMapping("/read")
	public ResponseEntity<List<Formula1>> read() {
		return new ResponseEntity<List<Formula1>>(this.service.read(), HttpStatus.OK);
	}

	@PutMapping("/replace/{id}")

	public ResponseEntity<Formula1> update(@PathVariable Long id, @RequestBody Formula1 f1) {
		return new ResponseEntity<Formula1>(this.service.update(id, f1), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);

	}

}
