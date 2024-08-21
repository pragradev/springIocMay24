package io.pragra.learning.hellotospring;

import lombok.Data;

@Data
public class BMWM3 {
    private IEngine engine;

    private String carName;

    public BMWM3(IEngine engine, String name){
        this.engine = engine;
        this.carName = name;
    }


}
