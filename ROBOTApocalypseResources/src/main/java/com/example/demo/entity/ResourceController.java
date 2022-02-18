package com.example.demo.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Resources;
import com.example.demo.service.ResourceService;

@RestController
public class ResourceController {
	@Autowired
	ResourceService resourceService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/resources")
	public List<Resources> getAllResources() {		
		return resourceService.getAllResources();
	}
	
	@GetMapping("/resources/{sId}")
	public Resources getResource(@PathVariable("sId") String id ) {		
		return resourceService.getResource(id);
	}
	
	@PostMapping("/resources")
	public void postSurvivors(@RequestBody Resources resource ) {	
		//Resources resources =  (Resources) this.restTemplate.getForObject("http://localhost:8002/survivors/"+survivor.getId(), Resources.class);
		
		resourceService.addResource(resource);
	}	
	/*
	@PutMapping("/resources/{sId}")
	public void updateSurvivors(@RequestBody Resources survivor, @PathVariable("sId") String id ) {		
		survivorService.updateSurvivor(id, survivor); 
	}
	
	@DeleteMapping("/resources/{sId}")
	public void deleteSurvivor(@PathVariable("sId") String id) {		
		survivorService.removeSurvivor(id);
	}
	*/
}
