package com.flnet.operationsystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="city")
public class City {
	@Id
	private int cid;
	@Column(name="cityName")
	private String name;
	private String des;

}
