package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Resources;

public interface ResourceService {
	
	List<Resources> getAllResources();
	/** /
	List<Resources> getAllSurvivors();

	Resources getSurvivor(String id);

	void addSurvivor(Resources survivor);

	void updateSurvivor(String id, Resources survivor);

	void removeSurvivor(String id);/**/

	Resources getResource(String id);
	void addResource(Resources res);
	

}
