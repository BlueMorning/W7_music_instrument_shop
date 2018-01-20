package Instruments.Brass;

import Instruments.EnumColor;
import Instruments.EnumInstrumentType;
import Instruments.EnumMaterial;
import Instruments.EnumInstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(EnumMaterial.METAL, EnumColor.YELLOW, 5);
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
        assertEquals(5, trumpet.getValvesCount());
    }
}
