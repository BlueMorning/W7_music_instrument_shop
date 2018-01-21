package Instruments.Brass;

import Instruments.*;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;

public class Tuba extends Instrument {

    private int weight;

    public Tuba(String name,
                EnumMaterial material,
                EnumColor color,
                Double buyingPrice,
                Double sellingPrice,
                int stockLevel,
                int weight) {
        super(name, EnumInstrumentFamily.BRASS, material, color, buyingPrice, sellingPrice, stockLevel);
        this.weight         = weight;
        this.instrumentType = EnumInstrumentType.TUBA;
    }

    @Override
    public String play() {
        return "Tuba sound";
    }

    public int getWeight() {
        return weight;
    }
}
