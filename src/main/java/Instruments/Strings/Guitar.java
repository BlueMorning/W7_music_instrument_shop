package Instruments.Strings;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Guitar extends Instrument {

    private  int stringsCount;

    public Guitar(EnumMaterial material, EnumColor color, int stringsCount) {
        super(InstrumentFamily.STRINGS, material, color);
        this.stringsCount = stringsCount;
    }

    @Override
    public String play() {
        return "Guitar sound";
    }

    public int getStringsCount() {
        return stringsCount;
    }
}
