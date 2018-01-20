package Instruments.Keyboard;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Synthesizer extends Instrument {

    private int instrumentPLayModesCount;

    public Synthesizer(EnumMaterial material, EnumColor color, int instrumentPLayModesCount) {
        super(InstrumentFamily.KEYBOARD, material, color);
        this.instrumentPLayModesCount = instrumentPLayModesCount;
    }

    public int getInstrumentPLayModesCount() {
        return instrumentPLayModesCount;
    }

    @Override
    public String play() {
        return "Synthesizer sound";
    }


}
