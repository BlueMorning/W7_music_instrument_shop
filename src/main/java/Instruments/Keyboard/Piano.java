package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Piano extends Instrument {

    public Piano() {
        super(InstrumentFamily.KEYBOARD);
    }

    @Override
    public String play() {
        return "Piano sound";
    }
}
