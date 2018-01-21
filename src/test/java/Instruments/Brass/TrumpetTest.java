package Instruments.Brass;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Trumpet", EnumMaterial.METAL, EnumColor.YELLOW, 50.0, 200.0, 6, 6);
    }


    @Test
    public void hasInstrumentFamily(){
        assertEquals(EnumInstrumentFamily.BRASS, trumpet.getInstrumentFamily());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(EnumInstrumentType.TRUMPET, trumpet.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.METAL, trumpet.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.YELLOW, trumpet.getColor());
    }

    @Test
    public void hasValves(){
        assertEquals(6, trumpet.getValvesCount());
    }
}
