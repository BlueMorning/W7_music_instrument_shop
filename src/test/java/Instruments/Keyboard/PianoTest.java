package Instruments.Keyboard;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Piano", EnumMaterial.WOOD, EnumColor.BROWN, 100.0, 400.0, 10, 88);
    }


    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(EnumInstrumentFamily.KEYBOARD, piano.getInstrumentFamily());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(EnumInstrumentType.PIANO, piano.getInstrumentType());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.WOOD, piano.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.BROWN, piano.getColor());
    }

    @Test
    public void hasKeysCount(){
        assertEquals(88, piano.getKeysCount());
    }



}
