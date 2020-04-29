package com.capgemini.springpractice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springpractice.appconfig.ChaiBiscuit;
import com.capgemini.springpractice.bean.Chai;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ChaiBiscuit.class);
        Chai c = context.getBean(Chai.class);
        c.drink();
        
    }
}
