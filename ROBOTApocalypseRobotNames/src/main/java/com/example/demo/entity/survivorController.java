package com.example.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Robot;
import com.example.demo.service.RobotService;

@RestController
public class survivorController {
	@Autowired
	RobotService robotService;
	
	
	@GetMapping("/robots")
	public List<Robot> getAllRobots() {		
		return robotService.getAllRobots();
	}
}
