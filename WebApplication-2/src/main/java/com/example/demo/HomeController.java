package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	//http://localhost:8080/home?name=test&salary=100000
	@RequestMapping("home1")

	public ModelAndView home(User user)
	{
		/*System.out.println("Home jsp ");
		System.out.println("User input "+ q);
		session.setAttribute("q",q+"1213");
		return("index.jsp");*/
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("userInfo", user);
		System.out.println(user.getName());
		System.out.println(user.getSalary());
	mv.setViewName("index.jsp");
		
		return mv;
	}

}
