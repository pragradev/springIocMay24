package io.pragra.learning.hellotospring.config;

import io.pragra.learning.hellotospring.BMWM3;
import io.pragra.learning.hellotospring.MyHibernate;
import io.pragra.learning.hellotospring.PetrolEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class appConfig {
    @Bean(initMethod = "postInit", destroyMethod = "preDestroy")
    @Scope(value = "prototype")
    public MyHibernate mysqlHibernate(){
        MyHibernate hibernate = new MyHibernate();
        hibernate.setDatabasename("MySQL");
        hibernate.setJdbcUrl("jdbc:mysql.cj.jdbc.driver:localhost:3306:appDb");
        return hibernate;
    }

    @Bean
    @Scope(value = "prototype")

    public BMWM3 XM3(){
        List<String> features = List.of("Moon roof","auto park","turbo charged");
        Map<String,Double> pricing = new HashMap<>();
        pricing.put("M1",60000.0);
        pricing.put("M2",70000.0);
        pricing.put("M3",80000.0);
         BMWM3 bmwm3 = new BMWM3(new PetrolEngine(),"M3",features,pricing);
         return bmwm3;
    }

}
