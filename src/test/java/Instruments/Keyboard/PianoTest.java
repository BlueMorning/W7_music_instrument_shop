package Instruments.Keyboard;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(EnumMaterial.WOOD, EnumColor.BROWN, 88);
    }


    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.KEYBOARD, piano.getInstrumentFamily());
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
