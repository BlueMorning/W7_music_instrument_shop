package Instruments.WoodWind;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Clarinet extends Instrument {

    private int holesCount;

    public Clarinet(   String name,
                       EnumMaterial material,
                       EnumColor color,
                       Double buyingPrice,
                       Double sellingPrice,
                       int stockLevel,
                       int holesCount) {
        super(name, EnumInstrumentFamily.WOODWIND, material, color, buyingPrice, sellingPrice, stockLevel);
        this.holesCount        = holesCount;
        this.instrumentType    = EnumInstrumentType.FLUTE;
    }

    public int getHolesCount() {
        return holesCount;
    }

    @Override
    public String play() {
        return "Clarinet sound";
    }

}
