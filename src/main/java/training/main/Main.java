package training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.entities.MyService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// demo 1: Constructor injection
//			BeanB beanb = (BeanB) context.getBean("BeanB");
//			beanb.print();
//
//		demo 2: setter injection
		MyService myService = (MyService) context.getBean("myService");
		System.out.println(myService);

		System.out.println(myService.getDataService().name);
	}

}
