package cn.su.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cn.su.domain.TimeCost;

public interface TimeCostMapper {

	@Insert("insert into timecost (cost)values(#{cost})")
	int insert(TimeCost timeCost);
	
	@Select("select * from timecost")
	List<TimeCost> findAll();
}
