package org.shailendra.singh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by shailendra.singh on 7/13/16.
 */
public class Drawing {

    public static void main(String[] a){

        /*
         * BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/spring-config.xml"));
         * XmlBeanFactory is deprecated
         */

        // use ClassPathXmlApplicationContext
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();

    }

}
