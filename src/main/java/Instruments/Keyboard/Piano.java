package Instruments.Keyboard;

import Instruments.*;

public class Piano extends Instrument {

    private int keysCount;

    public Piano(EnumMaterial material, EnumColor color, int keysCount) {
        super(EnumInstrumentFamily.KEYBOARD, material, color);
        this.keysCount      = keysCount;
        this.instrumentType = EnumInstrumentType.PIANO;
    }

    public int getKeysCount() {
        return keysCount;
    }

    @Override
    public String play() {
        return "Piano sound";
    }



}
