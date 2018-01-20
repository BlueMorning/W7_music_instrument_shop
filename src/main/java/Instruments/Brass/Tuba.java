package Instruments.Brass;

import Instruments.*;

public class Tuba extends Instrument {

    private int weight;

    public Tuba(EnumMaterial material, EnumColor color, int weight) {
        super(EnumInstrumentFamily.BRASS, material, color);
        this.weight         = weight;
        this.instrumentType = EnumInstrumentType.TUBA;
    }

    @Override
    public String play() {
        return "Tuba sound";
    }

    public int getWeight() {
        return weight;
    }
}
