package org.wdy.boot.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.wdy.boot.demo.bean.GoodsDemo;
@Mapper
public interface GoodsDemoMapper {
	List<GoodsDemo> queryGoodsAll();
	
	int addGoods(GoodsDemo gd);
	
	int deletaGoodsDemo(int id);

	GoodsDemo queryGoodsDameById(GoodsDemo gd);

	int updateGoods(GoodsDemo gd);
}
