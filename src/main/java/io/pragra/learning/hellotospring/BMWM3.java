package io.pragra.learning.hellotospring;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class BMWM3 {
    private IEngine engine;

    private String carName;
    private List<String> features; // moon roof, turbo charged, auto parking

    private Map<String, Double> modelPricing; // m1=60000, m2=70000, m3=80000

    public BMWM3(IEngine engine, String carName, List<String> features, Map<String, Double> modelPricing) {
        this.engine = engine;
        this.carName = carName;
        this.features = features;
        this.modelPricing = modelPricing;
    }
}
