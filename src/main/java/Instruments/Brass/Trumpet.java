package Instruments.Brass;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Trumpet extends Instrument {


    private int valvesCount;

    public Trumpet(  String name,
                         EnumMaterial material,
                         EnumColor color,
                         Double buyingPrice,
                         Double sellingPrice,
                         int stockLevel,
                         int instrumentPLayModesCount) {
        super(name, EnumInstrumentFamily.BRASS, material, color, buyingPrice, sellingPrice, stockLevel);
        this.valvesCount         = instrumentPLayModesCount;
        this.instrumentType      = EnumInstrumentType.TRUMPET;
    }

    public int getValvesCount() {
        return valvesCount;
    }

    @Override
    public String play() {
        return "Trumpet sound";
    }


}
