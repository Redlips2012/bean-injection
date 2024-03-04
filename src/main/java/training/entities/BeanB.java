package training.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	private BeanA beanA;
	private String name;
	private int number;

	@Autowired
	public BeanB(BeanA beanA, String name, int number) {
		super();
		this.beanA = beanA;
		this.name = name;
		this.number = number;
	}

	public BeanB(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.number);
	}
}
