package com.hello.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hello.mvc03.dto.CustomerDto;
import com.hello.mvc03.model.biz.CustomerBiz;

@Controller
public class HomeController {
	
	@Autowired
	private CustomerBiz biz;
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public String selectList(Model model) {
		model.addAttribute("list", biz.selectList());
		return "boardlist";
	}
	
	@RequestMapping(value="/selectone.do", method=RequestMethod.GET)
	public String selectOne(Model model, String id) {
		model.addAttribute("dto", biz.selectOne(id));
		return "selectone";
	}
	
	@RequestMapping(value="/insertForm.do", method=RequestMethod.GET)
	public String insertForm() {
		return "insertForm";
	}
	
	@RequestMapping(value="/insertRes.do", method=RequestMethod.POST)
	public String insertRes(Model model, CustomerDto dto) {
		int res = biz.insert(dto);
		model.addAttribute("list", biz.selectList());
		if(res > 0) {
			return "boardlist";
		} else {
			return "insertForm";
		}
	}
	
	@RequestMapping(value="/updateForm.do", method=RequestMethod.GET)
	public String updateForm(Model model, CustomerDto dto) {
		model.addAttribute("dto", dto);
		return "updateform";
	}
	
	@RequestMapping(value="/updateRes.do", method=RequestMethod.POST)
	public String updateRes(Model model, CustomerDto dto) {
		int res = biz.update(dto);
		if(res > 0) {
			model.addAttribute("dto", biz.selectOne(dto.getId()));
			return "selectone";
		} else {
			model.addAttribute("dto", biz.selectOne(dto.getId()));
			return "selectone";
		}
	}
	
	@RequestMapping(value="/remove.do", method=RequestMethod.GET)
	public String remove(Model model, String id) {
		int res = biz.delete(id);
		if(res > 0) {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		} else {
			model.addAttribute("list", biz.selectList());
			return "boardlist";
		}
	}
	
}
