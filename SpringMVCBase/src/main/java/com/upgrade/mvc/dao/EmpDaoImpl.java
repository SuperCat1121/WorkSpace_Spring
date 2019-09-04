package com.upgrade.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upgrade.mvc.dto.EmpDto;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<EmpDto> selectList() {
		List<EmpDto> list = new ArrayList<EmpDto>();
		try {
			list = sqlSession.selectList(namespace + "selectList");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SELECT LIST ERROR");
		}
		return list;
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
