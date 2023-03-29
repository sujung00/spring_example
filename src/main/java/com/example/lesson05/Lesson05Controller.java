package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson01.Data;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	// http://localhost/lesson05/ex01
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	// http://localhost/lesson05/ex02
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruitList = new ArrayList<>();
		fruitList.add("사과");
		fruitList.add("배");
		fruitList.add("포도");
		fruitList.add("복숭아");
		fruitList.add("자두");
		
		model.addAttribute("fruits", fruitList);
		
		// List<Map>
		List<Map<String, Object>> userList = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "김수정");
		user.put("age", 24);
		user.put("hobby", "등산");
		userList.add(user);
		
		user = new HashMap<>();
		user.put("name", "이광우");
		user.put("age", 26);
		user.put("hobby", "운동");
		userList.add(user);
		
		model.addAttribute("users", userList);
		
		return "lesson05/ex02";
	}
	
	// http://localhost/lesson05/ex03
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date today = new Date();
		model.addAttribute("today", today);
		return "lesson05/ex03";
	}
	
	// http://localhost/lesson05/ex04
	@GetMapping("/ex04")
	public String ex04() {
		return "/lesson05/ex04";
	}

}
