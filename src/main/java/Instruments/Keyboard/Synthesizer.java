package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Synthesizer extends Instrument {

    public Synthesizer() {
        super(InstrumentFamily.KEYBOARD);
    }

    @Override
    public String play() {
        return "Synthesizer sound";
    }
}
