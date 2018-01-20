package Instruments.Strings;

import Instruments.*;

public class Guitar extends Instrument {

    private  int stringsCount;

    public Guitar(EnumMaterial material, EnumColor color, int stringsCount) {
        super(EnumInstrumentFamily.STRINGS, material, color);
        this.stringsCount   = stringsCount;
        this.instrumentType = EnumInstrumentType.GUITAR;
    }

    @Override
    public String play() {
        return "Guitar sound";
    }

    public int getStringsCount() {
        return stringsCount;
    }
}
