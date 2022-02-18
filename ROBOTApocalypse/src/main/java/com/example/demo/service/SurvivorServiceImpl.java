package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Robot;
import com.example.demo.model.Survivor;

@Service
public class SurvivorServiceImpl implements SurvivorService{
	
	private List<Survivor> survivors =  new ArrayList<>( Arrays.asList(
			new Survivor("P101", "P1", "22", "M", Arrays.asList("6001","2001L")),
			new Survivor("P102", "P2", "26", "F", Arrays.asList("7001","3001L")),
			new Survivor("P103", "P3", "27", "M", Arrays.asList("8001","4001L")),
			new Survivor("P104", "P4", "32", "F", Arrays.asList("9001","5001L")),
			new Survivor("P105", "P5", "44", "M", Arrays.asList("10001","6001L"))
			
			
			/*new Survivor("P102", "P2", "26", "F", "6002"),
			new Survivor("P103", "P3", "27", "M", "6003"),
			new Survivor("P104", "P4", "23", "F", "6004"),
			new Survivor("P105", "P5", "29", "M", "6005")
			*/
			));
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
	
	@Override
	public List<Survivor> getAllSurvivors() {
		// TODO Auto-generated method stub
		return survivors;
	}
	
	@Override
	public Survivor getSurvivor(String id) {
		// TODO Auto-generated method stub
		return survivors.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}
	
	
	@Override
	public void addSurvivor(Survivor survivor) {
		survivors.add(survivor);
	}

	@Override
	public void updateSurvivor(String id , Survivor survivor) {
		//survivors.add(survivor);
		for(int i=0 ; i<survivors.size() ; i++) {
			Survivor s = survivors.get(i);
			if(s.getId().equals(id)) {
				survivors.set(i, survivor);
				return;
			}
		}
	}
	
	@Override
	public void updateSurvivorFlag(String id) {
		for(int i=0 ; i<survivors.size() ; i++) {
			Survivor s = survivors.get(i);
			if(s.getId().equals(id)) {
				s.setFlag();
				
				if(s.getFlag() >= 3) {
					removeSurvivor(id);
				}
				return;
			}
		}
		
	}
	
	@Override
	public void removeSurvivor(String id ) {
		survivors.removeIf(p->p.getId().equals(id));		
	}
	
	
}
