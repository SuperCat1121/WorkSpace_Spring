package com.mvc.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.MVCBoardDaoImpl;
import com.mvc.dto.MVCBoardDto;

@Service
public class MVCBoardBizImpl implements MVCBoardBiz {

	@Autowired
	MVCBoardDaoImpl dao;
	
	@Override
	public List<MVCBoardDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MVCBoardDto selectone(int seq) {
		return dao.selectone(seq);
	}

	@Override
	public int insert(MVCBoardDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(MVCBoardDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int seq) {
		return dao.delete(seq);
	}

}
