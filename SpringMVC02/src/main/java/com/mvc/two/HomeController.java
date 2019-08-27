package com.mvc.two;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.two.model.HelloBiz;

@Controller
public class HomeController {
	
	@Autowired
	private HelloBiz biz;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET) // request가 get으로 넘어올때만 동작
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
		model.addAttribute("hello", "Hello, " + biz.getHello());
		return "hello";
	}
	
	@RequestMapping("/bye.do")
	                  // 넘어오는 파라미터 이름과 넣으려는 파라미터 이름이 같으면
	                  // @RequestParam을 안써줘도 자동으로 들어간다
	public String bye(@RequestParam("name") String name, Model model) {
		model.addAttribute("bye", "Bye, " + name);
		return "bye";
	}
	
}
