package com.softtek.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Flower_table")
public class Flower {

	@Id
	@GeneratedValue
	@Column(name = "Flower_id")
	private Integer id;

	@Column
	private String name;

	@Column
	private String colour;

	@Column
	private Integer cost;

	public Flower() {

	}

	public Flower(Integer id, String name, String colour, Integer cost) {
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.cost = cost;
	}

	public Integer getid() {
		return id;
	}

	public void setid(Integer id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcolour() {
		return colour;
	}

	public void setcolour(String colour) {
		this.colour = colour;
	}
	
	public Integer getcost() {
		return cost;
	}

	public void setcost(Integer cost) {
		this.cost = cost;
	}

}
