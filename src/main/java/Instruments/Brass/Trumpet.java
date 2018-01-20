package Instruments.Brass;

import Instruments.*;

public class Trumpet extends Instrument {


    private int valvesCount;

    public Trumpet(EnumMaterial material, EnumColor color, int valvesCount) {
        super(EnumInstrumentFamily.BRASS, material, color);
        this.valvesCount    = valvesCount;
        this.instrumentType = EnumInstrumentType.TRUMPET;
    }

    public int getValvesCount() {
        return valvesCount;
    }

    @Override
    public String play() {
        return "Trumpet sound";
    }


}
