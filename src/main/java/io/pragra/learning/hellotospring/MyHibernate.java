package io.pragra.learning.hellotospring;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class MyHibernate {
    private String databasename;
    private String jdbcUrl;



    public void postInit(){
        System.out.println("Establishing databse connection with URL: " + jdbcUrl);
    }

    public void preDestroy(){
        System.out.println("releasing the database connection for " + databasename);
    }




}
