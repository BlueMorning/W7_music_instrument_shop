package Instruments;


public abstract class Instrument implements IPlayable {

    protected EnumInstrumentFamily instrumentFamily;
    protected EnumMaterial material;
    protected EnumColor color;
    protected EnumInstrumentType instrumentType;

    public Instrument(EnumInstrumentFamily enumInstrumentFamily,
                      EnumMaterial material,
                      EnumColor color){
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
    public String play() {
        return null;
    }

}
