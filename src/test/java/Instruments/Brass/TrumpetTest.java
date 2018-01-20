package Instruments.Brass;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.InstrumentFamily;
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
        assertEquals(InstrumentFamily.BRASS, trumpet.getInstrumentFamily());
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
