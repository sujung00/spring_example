package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired //DI(Dependency injection) 의존성 주입 : spring container에 있는 spring bean을 주입한다.
	private UsedGoodsMapper usedGoodsMapper;

	// input : X
	// output : List<UsedGoods>
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		
		return usedGoodsList;
	}
}
