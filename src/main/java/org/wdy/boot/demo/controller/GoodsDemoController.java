package org.wdy.boot.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wdy.boot.demo.bean.GoodsDemo;
import org.wdy.boot.demo.service.GoodsDemoService;

@RestController
public class GoodsDemoController {
	@Autowired
	private GoodsDemoService gds;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	
	@GetMapping(value="queryGoodsAll")
	public List<GoodsDemo> queryGoodsAll(){
		return gds.queryGoodsAll();
	}
	
	@PostMapping(value="addGoods")
	public boolean addGoods(@RequestBody GoodsDemo gd) throws ParseException {
		Date parse = sdf.parse(gd.getCreatdate());
		gd.setCreatdate(sdf.format(parse));
		return gds.addGoods(gd) > 0 ? true : false;
		
	}
	
	@DeleteMapping(value="deletaGoodsDemo")
	public boolean deletaGoodsDemo(int id) {
		return gds.deletaGoodsDemo(id) > 0 ? true : false;
	}
	
	@PostMapping(value="queryGoodsDameById")
	public GoodsDemo queryGoodsDameById(@RequestBody GoodsDemo gd){
		return gds.queryGoodsDameById(gd);
	}
	
	@PostMapping(value = "updateGoods")
	public boolean updateGoods (@RequestBody GoodsDemo gd) throws ParseException {
		Date parse = sdf.parse(gd.getCreatdate());
		gd.setCreatdate(sdf.format(parse));
		return gds.updateGoods(gd) > 0 ? true : false;		
	}
}
