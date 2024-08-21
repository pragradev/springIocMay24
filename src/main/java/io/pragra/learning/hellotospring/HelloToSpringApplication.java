package io.pragra.learning.hellotospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class HelloToSpringApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        BMWM3 m3 = context.getBean(BMWM3.class);
        System.out.println(m3);

//        BMWM3 m3 = new BMWM3(new PetrolEngine(),"M3" );
//        BMWM3 m4 = new BMWM3(new DieselEngine(), "M4");
//        BMWM3 m5 = new BMWM3(new DieselEngine(), "M5");
//
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);


        //SpringApplication.run(HelloToSpringApplication.class, args);
    }

}
