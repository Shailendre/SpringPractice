package org.shailendra.singh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by shailendra.singh on 7/13/16.
 */
public class DriverClass {

    public static void main(String[] a){

        /*
         * BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/spring-config.xml"));
         * XmlBeanFactory is deprecated
         */

        /*
         use ClassPathXmlApplicationContext
         BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        */

        /*
        * use ApplicationContext as IoC instead of BeanFactory; feature rich
        * */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        /*
        * load triangle bean
        * */
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();

        /*
        * access student bean
        * */
        Student student = (Student) applicationContext.getBean("student");
        student.displayName();
        student.displayAddress();

        /*
        * get question beans using List<?> in answers
        * */
        Question q1 = (Question) applicationContext.getBean("q1");

        /*
         * print the question answer together
         */
        q1.displayQuestion();


        /*
        * get the question in map <qid,question>; question --> qid,String question, Answer answer;
        * answer --> qid,List<?> options
        * */

        Question2 qmap = (Question2) applicationContext.getBean("qmap");

        /*
        * print the questions
        * */
        qmap.displayQuestion();


        /*
        * get the customer bean
        * */

        Customer cust1 = (Customer) applicationContext.getBean("cust1");

        /*
        * print the customer info
        * */

        cust1.displayCustomerInfo();

    }

}
