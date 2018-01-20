

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.InstrumentFamily;
import Instruments.Strings.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(EnumMaterial.WOOD, EnumColor.BROWN, 6);
    }

    @Test
    public void hasInstrumentFamily(){
        assertEquals(InstrumentFamily.STRINGS, guitar.getInstrumentFamily());
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
