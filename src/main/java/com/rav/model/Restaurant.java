package com.rav.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	
	public static final String DELIVERY = "delivery";
	public static final String DINE_IN = "dine in";
	
	private String city;
	private String name;
	private Boolean deliver;
	private Integer rate = 0;
	private List<Item> items;
	private String justification = "";
	
	public Restaurant() {
	}

	public Restaurant(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}

	public Restaurant(String city, String name, Boolean deliver, Integer rate) {
		super();
		this.city = city;
		this.name = name;
		this.deliver = deliver;
		this.rate = rate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDeliver() {
		return deliver;
	}
	
	public String getDineType() {
		return (deliver ? DELIVERY : DINE_IN) ;
	}

	public void setDeliver(Boolean deliver) {
		this.deliver = deliver;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}
	
	public void incrementRate() {
		rate ++;
	}

	public List<Item> getItems() {
		if (items == null) {
			items = new ArrayList<>();
		}
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}
	
	public void justify(String justification) {
		if (!this.justification.isEmpty()) {
			this.justification += ", ";
		}
		this.justification += justification;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
