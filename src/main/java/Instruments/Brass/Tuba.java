package Instruments.Brass;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Tuba extends Instrument {

    private int weight;

    public Tuba(EnumMaterial material, EnumColor color, int weight) {
        super(InstrumentFamily.BRASS, material, color);
        this.weight = weight;
    }

    @Override
    public String play() {
        return "Tuba sound";
    }

    public int getWeight() {
        return weight;
    }
}
