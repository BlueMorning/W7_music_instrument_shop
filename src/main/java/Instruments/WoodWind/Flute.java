package Instruments.WoodWind;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Flute extends Instrument {

    public Flute() {
        super(InstrumentFamily.WOODWIND);
    }

    @Override
    public String play() {
        return "Flute sound";
    }
}
