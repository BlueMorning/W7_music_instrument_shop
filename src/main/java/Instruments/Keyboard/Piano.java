package Instruments.Keyboard;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Piano extends Instrument {

    private int keysCount;

    public Piano(EnumMaterial material, EnumColor color, int keysCount) {
        super(InstrumentFamily.KEYBOARD, material, color);
        this.keysCount = keysCount;
    }

    public int getKeysCount() {
        return keysCount;
    }

    @Override
    public String play() {
        return "Piano sound";
    }



}
