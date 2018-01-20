package Instruments.Keyboard;

import Instruments.*;

public class Synthesizer extends Instrument {

    private int instrumentPLayModesCount;

    public Synthesizer(EnumMaterial material, EnumColor color, int instrumentPLayModesCount) {
        super(EnumInstrumentFamily.KEYBOARD, material, color);
        this.instrumentPLayModesCount = instrumentPLayModesCount;
        this.instrumentType = EnumInstrumentType.SYNTHESIZER;
    }

    public int getInstrumentPLayModesCount() {
        return instrumentPLayModesCount;
    }

    @Override
    public String play() {
        return "Synthesizer sound";
    }


}
