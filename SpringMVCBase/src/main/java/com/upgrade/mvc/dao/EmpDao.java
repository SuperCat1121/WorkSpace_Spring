package com.upgrade.mvc.dao;

import java.util.List;

import com.upgrade.mvc.dto.EmpDto;

public interface EmpDao {

	String namespace = "com.base.emp.";
	
	public List<EmpDto> selectList();
	public EmpDto selectOne(String id);
	public int insert(EmpDto dto);
	public int update(EmpDto dto);
	public int delete(String id);
}
