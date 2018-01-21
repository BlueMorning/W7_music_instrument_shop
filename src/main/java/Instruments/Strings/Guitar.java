package Instruments.Strings;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;


public class Guitar extends Instrument {

    private  int stringsCount;

    public Guitar(  String name,
                     EnumMaterial material,
                     EnumColor color,
                     Double buyingPrice,
                     Double sellingPrice,
                     int stockLevel,
                     int stringsCount) {
        super(name, EnumInstrumentFamily.STRINGS, material, color, buyingPrice, sellingPrice, stockLevel);
        this.stringsCount        = stringsCount;
        this.instrumentType      = EnumInstrumentType.GUITAR;
    }

    @Override
    public String play() {
        return "Guitar sound";
    }

    public int getStringsCount() {
        return stringsCount;
    }
}
