package org.wdy.boot.demo.service;

import java.util.List;

import org.wdy.boot.demo.bean.GoodsDemo;

public interface GoodsDemoService {
	List<GoodsDemo> queryGoodsAll();
	
	int addGoods(GoodsDemo gd);
	
	int deletaGoodsDemo(int id);

	GoodsDemo queryGoodsDameById(GoodsDemo gd);
	
	int updateGoods (GoodsDemo gd);
}
