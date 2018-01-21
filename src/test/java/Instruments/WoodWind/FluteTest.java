package Instruments.WoodWind;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute("Flute", EnumMaterial.WOOD, EnumColor.BROWN, 30.0, 60.0, 7, true);
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(EnumInstrumentFamily.WOODWIND, flute.getInstrumentFamily());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.WOOD, flute.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.BROWN, flute.getColor());
    }

    @Test
    public void isTranverse(){
        assertEquals(true, flute.isTransverse());
    }
}
