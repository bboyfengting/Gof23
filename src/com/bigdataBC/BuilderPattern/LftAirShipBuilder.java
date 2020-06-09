package com.bigdataBC.BuilderPattern;

public class LftAirShipBuilder implements AirShipBuilder {
    @Override
    public OrbitalMoudle builderOrbitalMuodle() {
        System.out.println("构建轨道舱");
        return new OrbitalMoudle("Lft轨道舱");
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建引擎");
        return new Engine("Lft引擎");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃生舱");
        return new EscapeTower("Lft逃生舱");
    }
}
