package Instruments.WoodWind;

import Instruments.*;

public class Clarinet extends Instrument {

    private int holesCount;

    public Clarinet(EnumMaterial material, EnumColor color, int holesCount) {
        super(EnumInstrumentFamily.WOODWIND, material, color);
        this.holesCount     = holesCount;
        this.instrumentType = EnumInstrumentType.CLARINET;
    }

    public int getHolesCount() {
        return holesCount;
    }

    @Override
    public String play() {
        return "Clarinet sound";
    }

}
