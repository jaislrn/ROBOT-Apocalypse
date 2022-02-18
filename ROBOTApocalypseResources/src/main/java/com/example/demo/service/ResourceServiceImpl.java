package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.model.Resources;

@Service
public class ResourceServiceImpl implements ResourceService{
	private List<Resources> resources =  new ArrayList<>( Arrays.asList(
			new Resources("P101", "20L", "20Kg", "100", "5000"),
			new Resources("P102", "25L", "30Kg", "500", "10000"),
			new Resources("P103", "26L", "40Kg", "200", "8000"),
			new Resources("P104", "23L", "25Kg", "400", "2000"),
			new Resources("P105", "22L", "26Kg", "500", "300"),
			new Resources("P106", "30L", "27Kg", "700", "400"),
			new Resources("P107", "34L", "29Kg", "300", "1000")
			
			
			
			));
	/*private List<Resources> survivors =  new ArrayList<>( Arrays.asList(
			new Resources("P101", "P1", "22", "M", Arrays.asList("6001","2001L")),
			new Resources("P102", "P2", "26", "F", Arrays.asList("7001","3001L")),
			new Resources("P103", "P3", "27", "M", Arrays.asList("8001","4001L")),
			new Resources("P104", "P4", "32", "F", Arrays.asList("9001","5001L")),
			new Resources("P105", "P5", "44", "M", Arrays.asList("10001","6001L"))
			
			
			/*new Survivor("P102", "P2", "26", "F", "6002"),
			new Survivor("P103", "P3", "27", "M", "6003"),
			new Survivor("P104", "P4", "23", "F", "6004"),
			new Survivor("P105", "P5", "29", "M", "6005")
			* /
			));*/
	

	@Override
	public List<Resources> getAllResources() {
		return resources;
	}
	
	@Override
	public Resources getResource(String id) {
		// TODO Auto-generated method stub
		return resources.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}
	/** /
	@Override
	public List<Resources> getAllSurvivors() {
		// TODO Auto-generated method stub
		return survivors;
	}
	
	@Override
	public Resources getSurvivor(String id) {
		// TODO Auto-generated method stub
		return survivors.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}
	*/
	
	@Override
	public void addResource(Resources resource) {
		resources.add(resource);
	}
	
/*
	@Override
	public void updateSurvivor(String id , Resources survivor) {
		//survivors.add(survivor);
		for(int i=0 ; i<survivors.size() ; i++) {
			Resources s = survivors.get(i);
			if(s.getId().equals(id)) {
				survivors.set(i, survivor);
				return;
			}
		}
	}
	
	@Override
	public void removeSurvivor(String id ) {
		survivors.removeIf(p->p.getId().equals(id));		
	}
	
	/**/

	
}
