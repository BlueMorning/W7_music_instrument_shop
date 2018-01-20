package Instruments.Brass;

import Instruments.EnumColor;
import Instruments.EnumInstrumentType;
import Instruments.EnumMaterial;
import Instruments.EnumInstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba(EnumMaterial.METAL, EnumColor.YELLOW, 10);
    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(EnumInstrumentFamily.BRASS, tuba.getInstrumentFamily());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(EnumInstrumentType.TUBA, tuba.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.METAL, tuba.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.YELLOW, tuba.getColor());
    }

    @Test
    public void hasWeight(){
        assertEquals(10, tuba.getWeight());
    }



}