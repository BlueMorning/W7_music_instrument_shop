package Instruments.Brass;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba("Tuba", EnumMaterial.METAL, EnumColor.YELLOW, 100.0, 300.0, 5, 5);
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
        assertEquals(5, tuba.getWeight());
    }



}