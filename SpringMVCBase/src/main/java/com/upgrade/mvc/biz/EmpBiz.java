package com.upgrade.mvc.biz;

import java.util.List;

import com.upgrade.mvc.dto.EmpDto;


public interface EmpBiz {

	public List<EmpDto> selectList();
	public EmpDto selectOne(String id);
	public int insert(EmpDto dto);
	public int update(EmpDto dto);
	public int delete(String id);
}
