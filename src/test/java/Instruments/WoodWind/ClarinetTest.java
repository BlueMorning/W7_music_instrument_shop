

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.WoodWind.Clarinet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("Clarinet",
                                EnumMaterial.METAL,
                                EnumColor.BLACK,
                                10.0,
                                50.0,
                                150,
                                10);
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(EnumInstrumentFamily.WOODWIND, clarinet.getInstrumentFamily());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.METAL, clarinet.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.BLACK, clarinet.getColor());
    }

    @Test
    public void hasHoles(){
        assertEquals(10, clarinet.getHolesCount());
    }



}
