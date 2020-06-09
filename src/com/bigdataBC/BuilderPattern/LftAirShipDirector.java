package com.bigdataBC.BuilderPattern;

public class LftAirShipDirector implements AirShipDirector{
    private AirShipBuilder builder;

    public LftAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorShip() {
        OrbitalMoudle orbitalMoudle=builder.builderOrbitalMuodle();
        Engine engine=builder.builderEngine();
        EscapeTower escapeTower=builder.builderEscapeTower();
        //组装飞船
        AirShip ship=new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(escapeTower);
        ship.setOrbitalMoudle(orbitalMoudle);

        return ship;
    }
}
