package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Robot;
import com.example.demo.model.Survivor;

public interface SurvivorService {
	
	List<Survivor> getAllSurvivors();

	Survivor getSurvivor(String id);

	void addSurvivor(Survivor survivor);

	void updateSurvivor(String id, Survivor survivor);

	void removeSurvivor(String id);

	List<Robot> getAllRobots();

	void updateSurvivorFlag(String id);

}
