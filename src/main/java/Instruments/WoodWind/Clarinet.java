package Instruments.WoodWind;

import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Clarinet extends Instrument {

    public Clarinet() {
        super(InstrumentFamily.WOODWIND);
    }

    @Override
    public String play() {
        return "Clarinet sound";
    }
}
