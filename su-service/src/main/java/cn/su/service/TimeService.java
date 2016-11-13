package cn.su.service;

import java.util.List;

import cn.su.domain.TimeCost;

public interface TimeService {

	public int save(Long timeCost);
	
	public List<TimeCost> findAll();
}
