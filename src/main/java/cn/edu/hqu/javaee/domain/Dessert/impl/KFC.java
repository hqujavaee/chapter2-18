package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Shop;


@Component//每次使用同一个bean
public class KFC implements Shop {
	
	static private int id=0;
	public KFC() {
		id++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KFC-"+id;
	}

}
