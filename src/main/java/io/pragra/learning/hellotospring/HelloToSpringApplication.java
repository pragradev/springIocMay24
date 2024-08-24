package io.pragra.learning.hellotospring;

import io.pragra.learning.hellotospring.config.appConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloToSpringApplication {

    public static void main(String[] args) {

        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(appConfig.class);

        MyHibernate hibernate = annotationContext.getBean(MyHibernate.class);
        System.out.println(hibernate);


//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


//        MyHibernate hibernate = context.getBean("mysqlHibernate", MyHibernate.class);
//        MyHibernate hibernate2 = context.getBean("mysqlHibernate", MyHibernate.class);
//        MyHibernate hibernate3 = context.getBean("mysqlHibernate", MyHibernate.class);
//        MyHibernate hibernate4 = context.getBean("mysqlHibernate", MyHibernate.class);
//        MyHibernate hibernate5 = context.getBean("mysqlHibernate", MyHibernate.class);
//        System.out.println(hibernate);
//        System.out.println(hibernate2);
//        System.out.println(hibernate3);
//        System.out.println(hibernate4);
//        System.out.println(hibernate5);



//        BMWM3 m3 = context.getBean("XM3",BMWM3.class);
//        System.out.println(m3);

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
