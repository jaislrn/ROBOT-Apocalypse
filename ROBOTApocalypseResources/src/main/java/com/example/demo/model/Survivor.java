package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Survivor {
	private String id;
	private String name;
	private String age;
	private String gender;
	//private String lastLoc;
	
	private List<String> lastLoc;
	
	Resources resources;// = new ArrayList<>(); 
	
	public Survivor() {}

	

	
	
	public Survivor(String id, String name, String age, String gender, List<String> lastLoc) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.lastLoc = lastLoc;
	}


	



	public Survivor(String id, String name, String age, String gender, List<String> lastLoc,
			Resources resources) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.lastLoc = lastLoc;
		this.resources = resources;
	}





	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAge() {
		return age;
	}





	public void setAge(String age) {
		this.age = age;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public List<String> getLastLoc() {
		return lastLoc;
	}





	public void setLastLoc(List<String> lastLoc) {
		this.lastLoc = lastLoc;
	}





	public Resources getResources() {
		return resources;
	}





	public void setResources(Resources resources) {
		this.resources = resources;
	}





/** /
	public Survivor(String id, String name, String age, String gender, String lastLoc) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.lastLoc = lastLoc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastLoc() {
		return lastLoc;
	}

	public void setLastLoc(String lastLoc) {
		this.lastLoc = lastLoc;
	}

	@Override
	public String toString() {
		return "Survivor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", lastLoc=" + lastLoc
				+ "]";
	}
	

	
/**/
	/** /
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLastLoc() {
		return lastLoc;
	}

	public void setLastLoc(List<String> lastLoc) {
		this.lastLoc = lastLoc;
	}




	@Override
	public String toString() {
		return "Survivor [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", lastLoc=" + lastLoc
				+ "]";
	}/**/
	
	
	
}
