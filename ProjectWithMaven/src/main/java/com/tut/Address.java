package com.tut;

import java.util.Arrays;
import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_Id")
	private int addrssId;
	@Column(length = 50, name = "STREET")
	private String street;
	@Column(length = 150, name = "CITY")
	private String city;
	@Column(name = "is_open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name = "added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@Lob
	private byte[] image;

	public int getAddrssId() {
		return addrssId;
	}

	public void setAddrssId(int addrssId) {
		this.addrssId = addrssId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}



	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address(int addrssId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addrssId = addrssId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addrssId=" + addrssId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x="
				+ x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}

	

}
