package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//每次都会新建立一个bean
public class IceCream implements Dessert {
	static private int id=0;
	public IceCream() {
		id++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "冰激凌"+id;
	}

}
