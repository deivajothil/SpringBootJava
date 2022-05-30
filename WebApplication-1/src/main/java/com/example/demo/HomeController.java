package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	//http://localhost:8080/home?qj=test
	@RequestMapping("home")

	public ModelAndView home(String q, HttpSession session)
	{
		/*System.out.println("Home jsp ");
		System.out.println("User input "+ q);
		session.setAttribute("q",q+"1213");
		return("index.jsp");*/
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("q", q+"342342");
		mv.setViewName("index.jsp");
		return mv;
	}

}
