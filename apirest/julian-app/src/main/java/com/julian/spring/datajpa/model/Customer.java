package com.julian.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;


	@Column(name = "name")
	private String name;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "document_type")
	private String documentType;

	@Column(name = "identification")
	private long identification;

	@Column(name = "age")
	private Integer age;

    @Column(name = "city")
	private String city;

	public Customer() {

	}
	public Customer(String name, String lastname, String documentType, long identification, Integer age, String city) {
        this.name = name;
		this.lastName = lastname;
		this.documentType =documentType;
		this.identification =identification;
		this.age = age;
		this.city = city;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public long getIdentification() {
		return identification;
	}

	public void setIdentification(long identification) {
		this.identification = identification;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}

	
