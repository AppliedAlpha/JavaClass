package org.dimigo.abstractclass;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }

    public void stop() {
        engine.stopEngine();
    }
}
