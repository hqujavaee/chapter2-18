package cn.edu.hqu.javaee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.edu.hqu.javaee.domain.Dessert.impl.Child;

public class Chapter218Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		
		for(int i=0;i<10;i++) {
			Child child=context.getBean(Child.class);
			child.consume();
		}
		
		context.close();
	}
}
