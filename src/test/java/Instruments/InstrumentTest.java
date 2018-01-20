package Instruments;


import Instruments.Brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(EnumMaterial.METAL, EnumColor.YELLOW, 5);

    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(EnumInstrumentFamily.BRASS, trumpet.getInstrumentFamily());
    }




}
