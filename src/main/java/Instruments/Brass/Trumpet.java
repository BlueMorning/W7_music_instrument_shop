package Instruments.Brass;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Trumpet extends Instrument {


    private int valvesCount;

    public Trumpet(EnumMaterial material, EnumColor color, int valvesCount) {
        super(InstrumentFamily.BRASS, material, color);
        this.valvesCount = valvesCount;
    }

    public int getValvesCount() {
        return valvesCount;
    }

    @Override
    public String play() {
        return "Trumpet sound";
    }


}
