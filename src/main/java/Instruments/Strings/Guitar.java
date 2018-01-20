package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Guitar extends Instrument {

    public Guitar() {
        super(InstrumentFamily.STRINGS);
    }

    @Override
    public String play() {
        return "Guitar sound";
    }
}
