package Instruments.WoodWind;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before(){
        flute = new Flute(EnumMaterial.WOOD, EnumColor.BROWN, true);
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.WOODWIND, flute.getInstrumentFamily());
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
