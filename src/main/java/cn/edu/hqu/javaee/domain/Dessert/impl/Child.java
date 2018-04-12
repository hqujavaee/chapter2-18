package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Shop;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//每次都会新建立一个bean
public class Child implements Consumer {

	private static int id=0;
	public Child() {
		id++;
	}
	@Autowired
	private Shop container;
	@Autowired
	private IceCream iceCream;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "小孩-"+id;
	}

	@Override
	public void consume() {
		System.out.println(toString()+"正在"+container.toString()+"吃"+iceCream.toString());
	}
}
