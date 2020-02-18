package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		      Employee obj = (Employee) context.getBean("hi");
		      obj.getMessage();
		      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		      obj1.getMessage();

		   }

}
