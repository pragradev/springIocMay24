package io.pragra.learning.hellotospring;

import lombok.Data;

@Data
public class DieselEngine implements IEngine{
    private String engineType;

    private Integer horsePower;

    public DieselEngine(String engineType, Integer horsePower){
        this.engineType = engineType;
        this.horsePower = horsePower;
    }


    @Override
    public void display() {
        System.out.println("Engine type: " + engineType + " Horse power: " + horsePower);
    }
}
