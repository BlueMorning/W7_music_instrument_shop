package Instruments.Brass;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Tuba extends Instrument {

    public Tuba() {
        super(InstrumentFamily.BRASS);
    }

    @Override
    public String play() {
        return "Tuba sound";
    }
}
