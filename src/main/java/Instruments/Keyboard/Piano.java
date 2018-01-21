package Instruments.Keyboard;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Piano extends Instrument {

    private int keysCount;

    public Piano(String name,
                EnumMaterial material,
                EnumColor color,
                Double buyingPrice,
                Double sellingPrice,
                int stockLevel,
                int keysCount) {
        super(name, EnumInstrumentFamily.KEYBOARD, material, color, buyingPrice, sellingPrice, stockLevel);
        this.keysCount         = keysCount;
        this.instrumentType    = EnumInstrumentType.PIANO;
    }

    public int getKeysCount() {
        return keysCount;
    }

    @Override
    public String play() {
        return "Piano sound";
    }



}
