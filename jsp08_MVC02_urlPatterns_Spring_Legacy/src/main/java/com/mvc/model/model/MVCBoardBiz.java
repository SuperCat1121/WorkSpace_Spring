package com.mvc.model.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.model.model.MVCBoardDaoImpl;
import com.mvc.model.model.MVCBoardDto;

public interface MVCBoardBiz {
	public List<MVCBoardDto> selectList();
	public MVCBoardDto selectone(int seq);
	public int insert(MVCBoardDto dto);
	public int update(MVCBoardDto dto);
	public int delete(int seq);
}
