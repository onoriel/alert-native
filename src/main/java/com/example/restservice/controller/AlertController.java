package com.example.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.model.Alert;
import com.example.restservice.repository.AlertRepository;

@RestController
@RequestMapping("/services/v1")
public class AlertController {

	@Autowired
	AlertRepository repository;

	@GetMapping("/alerts")
	public List<Alert> getNotices() {
		return repository.findAll();
	}
}
