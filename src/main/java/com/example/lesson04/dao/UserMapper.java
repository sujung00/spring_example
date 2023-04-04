package com.example.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson04.model.User;

@Repository
public interface UserMapper {

	public int insertUserAsField(
			@Param("name") String name, 
			@Param("yyyymmdd")String yyyymmdd,
			@Param("email")String email, 
			@Param("introduce")String introduce);
	
	public User selectLatestUser();
	
	// 0: 거짓(중복X) 그 외 : 참(중복)
	public boolean existUserByName(String name);
}
