package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserMapper;
import com.example.lesson04.model.User;

@Service
public class UserBO {

	@Autowired
	private UserMapper userMapper;
	
	public int addUserAsField(String name, String yyyymmdd, String email, String introduce) {
		return userMapper.insertUserAsField(name, yyyymmdd, email, introduce);
	}
	
	// input: X 	output:User(최신 가입자)
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
}
