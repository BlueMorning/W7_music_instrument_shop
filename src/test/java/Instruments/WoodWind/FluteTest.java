package Instruments.WoodWind;

import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute();
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.WOODWIND, flute.getInstrumentFamily());
    }
}
