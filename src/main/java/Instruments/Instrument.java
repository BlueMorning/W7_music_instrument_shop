package Instruments;


public abstract class Instrument implements IPlayable {

    protected InstrumentFamily instrumentFamily;
    protected EnumMaterial material;
    protected EnumColor color;

    public Instrument(InstrumentFamily instrumentFamily, EnumMaterial material, EnumColor color){
        this.instrumentFamily = instrumentFamily;
        this.material         = material;
        this.color            = color;
    }

    public InstrumentFamily getInstrumentFamily(){
        return this.instrumentFamily;
    }

    public EnumMaterial getMaterial(){
        return this.material;
    }

    public EnumColor getColor(){
        return this.color;
    }

}
