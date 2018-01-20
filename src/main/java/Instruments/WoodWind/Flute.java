package Instruments.WoodWind;

import Instruments.*;

public class Flute extends Instrument {

    private boolean transverse;

    public Flute(EnumMaterial material, EnumColor color, Boolean transverse) {
        super(EnumInstrumentFamily.WOODWIND, material, color);
        this.transverse     = transverse;
        this.instrumentType = EnumInstrumentType.FLUTE;
    }

    public boolean isTransverse() {
        return transverse;
    }

    @Override
    public String play() {
        return "Flute sound";
    }


}
