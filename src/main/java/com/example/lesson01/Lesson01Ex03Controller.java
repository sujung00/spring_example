package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 	// jsp로 뿌릴 때는 @Controller
public class Lesson01Ex03Controller {

	// http://localhost/lesson01/ex03
	@RequestMapping("/lesson01/ex03")
	public String ex03() {
		// @ResponseBody 없이 단독 @Controller만 사용되는 경우
		// return String(뷰 경로) ViewResolver에 의해 jsp 경로를 찾는다.
		
		// return "/WEB-INF/jsp/lesson01/ex03.jsp"; //jsp view 경로
		// application.propertis에 있는 prefix와 suffix 제외한 경로만 쓴다.
		return "lesson01/ex03"; // jsp의 view 경로
	}
}
