package ru.specialist.dbHibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.specialist.DAO.Course;
import ru.specialist.DAO.CourseDAO;
import ru.specialist.DAO.DaoConfig;

public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext (DaoConfig.class);
		
		CourseDAO courseDao = context.getBean(CourseDAO.class);
		

		for(Course c : courseDao.findByTitle("web"))
			System.out.println(c);
		
		context.close();
    }
}
