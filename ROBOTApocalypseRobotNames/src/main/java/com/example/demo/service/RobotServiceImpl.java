package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Robot;
import com.example.demo.model.Survivor;

@Service
public class RobotServiceImpl implements RobotService{
	
	private List<Robot> listOfRobots =  new ArrayList<>( Arrays.asList(
			new Robot("R101","A","Flying Robot"),
			new Robot("R102","B","Land Robot"),
			new Robot("R103","C","Flying Robot"),
			new Robot("R104","D","Land Robot"),
			new Robot("R105","E","Flying Robot"),
			new Robot("R105","F","Land Robot")
			
			));

	@Override
	public List<Robot> getAllRobots() {
		// TODO Auto-generated method stub
		return listOfRobots;
	}
	
		
}
