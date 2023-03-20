package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller // Spring container가 관리해주는 Spring bean
public class Lesson01Ex01Controller {

	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody // return되는 String이 통째로 ResponseBody에 담긴다.
	@RequestMapping("/1") // url path 매핑
	public String ex01_1() {
		String text = "예제1번<br>문자열을 response body에 보내는 예제";
		return text;
	}
	
	// http://localhost:8080/lesson01/ex01/2
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		//{"사과"=3, "포도"=12, ...} java map
		//{"사과":3, "포도":12, ...} JSON String
		map.put("사과", 3);
		map.put("포도", 12);
		map.put("딸기", 26);
		map.put("망고", 53);
		
		// map => JSON 변환
		// web starter 안에 포함된 jackson 라이브러리가 포함되어 있고 동작하기 때문
		return map; 		
	}
}
