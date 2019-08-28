package com.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.biz.MVCBoardBizImpl;
import com.mvc.dto.MVCBoardDto;

@Controller
public class MVCBoardController {
	
	@Autowired
	private MVCBoardBizImpl biz;
	
	@RequestMapping("/boardlist.do")
	public String selectList(Model model) {
		model.addAttribute("list", biz.selectList());
		return "boardlist";
	}
	
	@RequestMapping(value="/insertform.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String insertForm() {
		return "insertform";
	}
	
	@RequestMapping(value="/insertres.do", method=RequestMethod.POST)
	// @ModelAttribute 생략 가능
	public String insertRes(@ModelAttribute MVCBoardDto dto, Model model) {
		int res = biz.insert(dto);
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		} else {
			return "insert";
		}
	}
	
	@RequestMapping("/selectone.do")
	// @RequestParam("seq") 생략 가능
	public String selectOne(@RequestParam("seq") int seq, Model model) {
		MVCBoardDto dto = biz.selectone(seq);
		model.addAttribute("dto", dto);
		return "selectone";
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(int seq, Model model) {
		model.addAttribute("dto", biz.selectone(seq));
		return "updateform";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(MVCBoardDto dto, Model model) {
		int res = biz.update(dto);
		model.addAttribute("dto", biz.selectone(dto.getSeq()));
		if(res > 0) {
			return "selectone";
		} else {
			return "updateform";
		}
	}
	
	@RequestMapping("/remove.do")
	public String remove(int seq, Model model) {
		int res = biz.delete(seq);
		model.addAttribute("list", biz.selectList());
		if(res > 0) {
			return "boardlist";
		} else {
			return "boardlist";
		}
	}
}
