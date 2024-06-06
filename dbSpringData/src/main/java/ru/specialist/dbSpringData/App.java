package ru.specialist.dbSpringData;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import ru.specialist.dao.DaoConfig;
import ru.specialist.dao.TeacherDao;



public class App 
{
    public static void main( String[] args )
    {
    	//ClassPathXmlApplicationContext context = 
		//		new ClassPathXmlApplicationContext("applicationContext.xml");
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(DaoConfig.class, App.class);

		var tr = context.getBean(TeacherDao.class);
		for(var t : tr.findByName("Иван"))
			System.out.printf("%d %s %s %s\n", t.getId(), t.getName(),
					t.getAddress(), t.getPhone());

		context.close();     
	}
}
