

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import Instruments.Strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Guitar", EnumMaterial.WOOD, EnumColor.BROWN, 200.0, 400.0, 12, 6);
    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(EnumInstrumentFamily.STRINGS, guitar.getInstrumentFamily());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(EnumInstrumentType.GUITAR, guitar.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.WOOD, guitar.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.BROWN, guitar.getColor());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStringsCount());
    }





}
