package com.upgrade.mvc.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrade.mvc.dao.EmpDao;
import com.upgrade.mvc.dto.EmpDto;

@Service
public class EmpBizImpl implements EmpBiz {

	@Autowired
	private EmpDao dao;
	
	@Override
	public List<EmpDto> selectList() {
		return dao.selectList();
	}

	@Override
	public EmpDto selectOne(String id) {
		return null;
	}

	@Override
	public int insert(EmpDto dto) {
		return 0;
	}

	@Override
	public int update(EmpDto dto) {
		return 0;
	}

	@Override
	public int delete(String id) {
		return 0;
	}

}
