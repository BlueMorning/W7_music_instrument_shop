package Instruments.Keyboard;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Synthesizer extends Instrument {

    private int instrumentPLayModesCount;

    public Synthesizer(  String name,
                         EnumMaterial material,
                         EnumColor color,
                         Double buyingPrice,
                         Double sellingPrice,
                         int stockLevel,
                         int instrumentPLayModesCount) {
        super(name, EnumInstrumentFamily.KEYBOARD, material, color, buyingPrice, sellingPrice, stockLevel);
        this.instrumentPLayModesCount         = instrumentPLayModesCount;
        this.instrumentType                   = EnumInstrumentType.SYNTHESIZER;
    }

    public int getInstrumentPLayModesCount() {
        return instrumentPLayModesCount;
    }

    @Override
    public String play() {
        return "Synthesizer sound";
    }


}
