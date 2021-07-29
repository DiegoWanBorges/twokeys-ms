package com.twokeys.tkpayment.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer parcel;
	private LocalDate date;
	private Double value;
	
	public Payment() {
	}

	public Payment(Integer parcel, LocalDate date, Double value) {
		this.parcel = parcel;
		this.date = date;
		this.value = value;
	}

	public Integer getParcel() {
		return parcel;
	}

	public void setParcel(Integer parcel) {
		this.parcel = parcel;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
