package ru.specialist.annotconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.specialist.graph.Scene;





public class App {

	public static void main(String[] args) {

		
		ApplicationContext gc = 
				new AnnotationConfigApplicationContext(GraphConfig.class);
		
		gc.getBean(Scene.class).draw();
		
		for(String name : gc.getBeanDefinitionNames())
			System.out.println(name);
	}

}
