package io.pragra.learning.hellotospring;

import lombok.Data;

@Data
public class PetrolEngine implements IEngine{
    private String EngineType = "Petrol Engine";

    private Integer hoesepower = 450;

    @Override
    public void display() {
        System.out.println("Engine type: " + EngineType + " Horse power: " + hoesepower);
    }
}
