package Instruments;


public abstract class Instrument implements IPlayable {

    protected InstrumentFamily instrumentFamily;

    public Instrument(InstrumentFamily instrumentFamily){
        this.instrumentFamily = instrumentFamily;
    }

    public InstrumentFamily getInstrumentFamily(){
        return this.instrumentFamily;
    }

}
