package com.twokeys.tksales.dto;

import java.io.Serializable;

import com.twokeys.tksales.entities.Client;

public class ClientDTO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String street;
	private String number;
	private String district;
	private String city;
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String street, String number, String district, String city) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.number = number;
		this.district = district;
		this.city = city;
	}
	
	public ClientDTO(Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.street = entity.getStreet();
		this.number = entity.getNumber();
		this.district = entity.getDistrict();
		this.city = entity.getCity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
