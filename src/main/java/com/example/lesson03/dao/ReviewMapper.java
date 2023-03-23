package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewMapper {

	public Review selectReview(@Param("id") int id);
	
	public int insertReview(Review review);
	
	//@Param이 있기 때문에 하나의 map이 xml로 넘어간다.
	public int insertReviewAsField(
			@Param("storeId") int storeId,
			@Param("menu") String menu,
 			@Param("userName") String userName, 
			@Param("point")Double point, 
			@Param("review")String review);

	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	
	public void deleteReviewById(int id);
}
