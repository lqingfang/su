package cn.su.domain;

import java.io.Serializable;

public class TimeCost implements Serializable{

	private int id;
	private Long cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
}
