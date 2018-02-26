package com.huy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "data")
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@NotEmpty
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "about1")
	private String about1;
	
	@Column(name = "about2")
	private String about2;

	public Data() {
		super();
	}

	public Data(int id, String name, String about1, String about2) {
		super();
		this.id = id;
		this.name = name;
		this.about1 = about1;
		this.about2 = about2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout1() {
		return about1;
	}

	public void setAbout1(String about1) {
		this.about1 = about1;
	}
	
	public String getAbout2() {
		return about1;
	}

	public void setAbout2(String about2) {
		this.about2 = about2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
