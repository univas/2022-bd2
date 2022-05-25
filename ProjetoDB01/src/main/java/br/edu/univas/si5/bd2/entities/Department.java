package br.edu.univas.si5.bd2.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
	private Integer code;
	private String name;

	public Department() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}