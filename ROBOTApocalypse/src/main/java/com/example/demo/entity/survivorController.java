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
import com.example.demo.model.Robot;
import com.example.demo.model.Survivor;
import com.example.demo.service.SurvivorService;

@RestController
public class survivorController {
	@Autowired
	SurvivorService survivorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/survivors/{sId}")
	public Survivor getSurvivor(@PathVariable("sId") String id ) {		
		Survivor survivor = survivorService.getSurvivor(id);
		
		//http://localhost:8003/resources
		
		//List<Resources> resources =  this.restTemplate.getForObject("http://localhost:8003/resources/P101"/*+survivor.getId()*/, List.class);
		//Resources resources =  (Resources) this.restTemplate.getForObject("http://localhost:8003/resources/P101", Resources.class);
		
		Resources resources =  (Resources) this.restTemplate.getForObject("http://localhost:8003/resources/"+survivor.getId(), Resources.class);
		
		survivor.setResources(resources);
		return survivor;
	}
	
	@GetMapping("/survivors")
	public List<Survivor> getAllSurvivors() {		
		List<Survivor> survivor = survivorService.getAllSurvivors();
		
		/*List resources =  this.restTemplate.getForObject("http://localhost:8003/resources/"+survivor.getId(), List.class);
		survivor.setResources(resources);
		*/return survivor;
	}
	
	/*@GetMapping("/survivors/{sId}")
	public Survivor getSurvivor(@PathVariable("sId") String id ) {		
		return survivorService.getSurvivor(id);
	}*/
	
	@PostMapping("/survivors")
	public void addSurvivors(@RequestBody Survivor survivor ) {		
		//Resources resources =  (Resources) this.restTemplate.postForObject("http://localhost:8003/resources/"+survivor.getId(), survivor, Resources.class);
		
		survivorService.addSurvivor(survivor);
	}	
	
	@PutMapping("/survivors/{sId}")
	public void updateSurvivors(@RequestBody Survivor survivor, @PathVariable("sId") String id ) {		
		survivorService.updateSurvivor(id, survivor); 
	}
	
	@DeleteMapping("/survivor/{sId}")
	public void deleteSurvivor(@PathVariable("sId") String id) {		
		survivorService.removeSurvivor(id);
	}
	
	@GetMapping("/robots")
	public List<Robot> getAllRobots() {		
		return survivorService.getAllRobots();
	}
	
	@GetMapping("/survivors/vote/{sId}")
	public void voteSurvivors(/* @RequestBody Survivor survivor, */ @PathVariable("sId") String id ) {		
		survivorService.updateSurvivorFlag(id);
		//survivor.setFlag();
		/*if(survivor.getFlag() >= 3) {
			survivorService.removeSurvivor(id);
		}*/
	}
}
