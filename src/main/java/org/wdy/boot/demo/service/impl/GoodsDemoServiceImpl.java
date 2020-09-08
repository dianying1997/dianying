package org.wdy.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wdy.boot.demo.bean.GoodsDemo;
import org.wdy.boot.demo.mapper.GoodsDemoMapper;
import org.wdy.boot.demo.service.GoodsDemoService;
@Service
public class GoodsDemoServiceImpl implements GoodsDemoService{
	
	@Autowired
	private GoodsDemoMapper gdm;

	@Override
	public List<GoodsDemo> queryGoodsAll() {
		// TODO Auto-generated method stub
		return gdm.queryGoodsAll();
	}

	@Override
	public int addGoods(GoodsDemo gd) {
		// TODO Auto-generated method stub
		return gdm.addGoods(gd);
	}

	@Override
	public int deletaGoodsDemo(int id) {
		// TODO Auto-generated method stub
		return gdm.deletaGoodsDemo(id);
	}

	@Override
	public GoodsDemo queryGoodsDameById(GoodsDemo gd) {
		// TODO Auto-generated method stub
		return gdm.queryGoodsDameById(gd);
	}

	@Override
	public int updateGoods(GoodsDemo gd) {
		// TODO Auto-generated method stub
		return gdm.updateGoods(gd);
	}

}
