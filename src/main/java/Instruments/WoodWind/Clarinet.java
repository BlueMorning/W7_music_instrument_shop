package Instruments.WoodWind;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Clarinet extends Instrument {

    private int holesCount;

    public Clarinet(EnumMaterial material, EnumColor color, int holesCount) {
        super(InstrumentFamily.WOODWIND, material, color);
        this.holesCount = holesCount;
    }

    public int getHolesCount() {
        return holesCount;
    }

    @Override
    public String play() {
        return "Clarinet sound";
    }

}
