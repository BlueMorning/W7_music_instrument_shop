package Instruments;


import Instruments.Brass.Trumpet;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Enumerations.EnumMaterial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Trumpet", EnumMaterial.METAL, EnumColor.YELLOW, 100.0, 200.0, 5, 6);

    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(EnumInstrumentFamily.BRASS, trumpet.getInstrumentFamily());
    }




}
