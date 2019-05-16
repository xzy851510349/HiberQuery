package com.hqyj.Bean;

import java.util.HashSet;
import java.util.Set;


public class Provice {
	private Integer id;
	private String name;
	private Set<City> city = new HashSet<City>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<City> getCity() {
		return city;
	}
	public void setCity(Set<City> city) {
		this.city = city;
	}


}
