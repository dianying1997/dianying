package org.wdy.boot.demo.bean;

public class GoodsDemo {
	private int id;
	private String name;
	private double price;
	private String creatdate; 
	private String keepdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCreatdate() {
		return creatdate;
	}
	public void setCreatdate(String creatdate) {
		this.creatdate = creatdate;
	}
	public String getKeepdate() {
		return keepdate;
	}
	public void setKeepdate(String keepdate) {
		this.keepdate = keepdate;
	}
	public GoodsDemo(int id, String name, double price, String creatdate, String keepdate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.creatdate = creatdate;
		this.keepdate = keepdate;
	}
	public GoodsDemo() {
		super();
	}
	
	
}
