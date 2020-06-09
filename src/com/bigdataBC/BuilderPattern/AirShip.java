package com.bigdataBC.BuilderPattern;

public class AirShip {
    OrbitalMoudle orbitalMoudle;
    Engine engine;
    EscapeTower escapeTower;

    public void lunch(){
        System.out.println("发射");
    }

    public OrbitalMoudle getOrbitalMoudle() {
        return orbitalMoudle;
    }

    public void setOrbitalMoudle(OrbitalMoudle orbitalMoudle) {
        this.orbitalMoudle = orbitalMoudle;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
//轨道舱
class OrbitalMoudle{
    private String name;

    public OrbitalMoudle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//引擎
class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
//逃生舱
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}