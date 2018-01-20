package Instruments.WoodWind;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Instrument;
import Instruments.InstrumentFamily;

public class Flute extends Instrument {

    private boolean transverse;

    public Flute(EnumMaterial material, EnumColor color, Boolean transverse) {
        super(InstrumentFamily.WOODWIND, material, color);
        this.transverse = transverse;
    }

    public boolean isTransverse() {
        return transverse;
    }

    @Override
    public String play() {
        return "Flute sound";
    }


}
