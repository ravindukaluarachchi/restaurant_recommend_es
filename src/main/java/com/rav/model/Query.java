package com.rav.model;

public class Query {
	private String city;
	private String item;
	private Boolean deliver;
	private Float minRate;
	private Float maxRate;
	
	public Query() {
	}

	public Query(String city, String item, Boolean deliver) {
		super();
		this.city = city;
		this.item = item;
		this.deliver = deliver;
	}

	public Query(String city, String item, Boolean deliver, Float minRate, Float maxRate) {
		super();
		this.city = city;
		this.item = item;
		this.deliver = deliver;
		this.minRate = minRate;
		this.maxRate = maxRate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getItem() {
		return item;
	}

	public Item getItemObj() {
		return new Item(item,0f);
	}
	
	public void setItem(String item) {
		this.item = item;
	}

	public Boolean getDeliver() {
		return deliver;
	}

	public void setDeliver(Boolean deliver) {
		this.deliver = deliver;
	}

	public Float getMinRate() {
		return minRate;
	}

	public void setMinRate(Float minRate) {
		this.minRate = minRate;
	}

	public Float getMaxRate() {
		return maxRate;
	}

	public void setMaxRate(Float maxRate) {
		this.maxRate = maxRate;
	}

	@Override
	public String toString() {
		return "Query [city=" + city + ", item=" + item + ", deliver=" + deliver + ", minRate=" + minRate + ", maxRate="
				+ maxRate + "]";
	}

	

}
