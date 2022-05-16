package com.gyojincompany.spring_12_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value = "/write")
	public String write() {
		
		return "write";
	}
	
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("memberId", "BlackTiger");//모델 데이터 설정
		
		mv.setViewName("board/reply");
		
		return mv;
	}
	
	@RequestMapping("/board/content")
	public String content(Model model) {
		
		model.addAttribute("memberId", 3000);
		
		return "board/content";
	}
	
	
}


