package Instruments;


import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Shop.ItemToSell.InstrumentToSale;

public abstract class Instrument extends InstrumentToSale implements IPlayable {

    protected EnumInstrumentFamily instrumentFamily;
    protected EnumMaterial material;
    protected EnumColor color;
    protected EnumInstrumentType instrumentType;

    public Instrument(  String name,
                        EnumInstrumentFamily enumInstrumentFamily,
                        EnumMaterial material,
                        EnumColor color,
                        Double buyingPrice,
                        Double sellingPrice,
                        int stockLevel){
        super(name, buyingPrice, sellingPrice, stockLevel);
        this.instrumentFamily = enumInstrumentFamily;
        this.material         = material;
        this.color            = color;
    }

    public EnumInstrumentFamily getInstrumentFamily(){
        return this.instrumentFamily;
    }

    public EnumMaterial getMaterial(){
        return this.material;
    }

    public EnumColor getColor(){
        return this.color;
    }

    public EnumInstrumentType getInstrumentType(){
        return this.instrumentType;
    }

    @Override
    public String getDescription() {

        return String.format("Instrument family : %s, " +
                        "Made of : %s, " +
                        "Main color : %s",
                this.getInstrumentFamily().toString(),
                this.getMaterial().toString(),
                this.getColor().toString());
    }

}
