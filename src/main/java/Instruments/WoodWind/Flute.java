package Instruments.WoodWind;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Flute extends Instrument {

    private boolean transverse;

    public Flute(  String name,
                    EnumMaterial material,
                    EnumColor color,
                    Double buyingPrice,
                    Double sellingPrice,
                    int stockLevel,
                    Boolean transverse) {
        super(name, EnumInstrumentFamily.WOODWIND, material, color, buyingPrice, sellingPrice, stockLevel);
        this.transverse        = transverse;
        this.instrumentType    = EnumInstrumentType.FLUTE;
    }

    public boolean isTransverse() {
        return transverse;
    }

    @Override
    public String play() {
        return "Flute sound";
    }


}
