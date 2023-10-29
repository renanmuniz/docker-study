package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persons;
import com.example.demo.service.PersonService;

@RestController
@Slf4j
public class BasicController {

	@Autowired
	private PersonService personService;
	
	
	@GetMapping("/all")
	public List<Persons> getAll() {
		log.info("Recebendo requisição em " + LocalDateTime.now());
		var resp = personService.findAll();
		log.info("Respondendo requisição: " + resp.toString());
		return resp;
	}
	
	
	
}
