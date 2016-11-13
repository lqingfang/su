package cn.su.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.su.domain.TimeCost;
import cn.su.mapper.TimeCostMapper;
import cn.su.service.TimeService;

@Service
public class TimeServiceImpl implements TimeService {

	@Autowired
	private TimeCostMapper timeCostMapper;
	
	@Override
	public int save(Long cost) {
		TimeCost timeCost = new TimeCost();
		timeCost.setCost(cost);
		int a = timeCostMapper.insert(timeCost);
		return a;
	}

	@Override
	public List<TimeCost> findAll() {
		List<TimeCost> list = timeCostMapper.findAll();
		return list;
	}


}
