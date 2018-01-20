package Instruments.Brass;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Trumpet extends Instrument {

    public Trumpet() {
        super(InstrumentFamily.BRASS);
    }

    @Override
    public String play() {
        return "Trumpet sound";
    }
}
