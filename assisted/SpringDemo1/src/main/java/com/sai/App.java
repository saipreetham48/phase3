package com.sai;

/**
 * Hello world!
 *
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //BeanFactory factory= new XmlBeanFactory(resources);
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	
    	HelloWorld h= (HelloWorld)context.getBean("obj");
    	h.print();
    	
    	Student s=(Student)context.getBean("a");
    	System.out.println("student id is:"+s.getId());
    	System.out.println("student name is:"+s.getName());
    	Marks ma=(Marks)context.getBean("m");
    	System.out.println("bio"+ma.getBio());
    	System.out.println("mat"+ma.getMat());
    	System.out.println("sci"+ma.getSci());
    }
}