package Instruments.Keyboard;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SynthesizerTest {

    Synthesizer synthesizer;

    @Before
    public void before(){
        synthesizer = new Synthesizer(EnumMaterial.PLASTIC, EnumColor.BLACK, 20);
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.KEYBOARD, synthesizer.getInstrumentFamily());
    }

    @Test
    public void hasMaterial(){
        assertEquals(EnumMaterial.PLASTIC, synthesizer.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals(EnumColor.BLACK, synthesizer.getColor());
    }

    @Test
    public void hasInstrumentPLayModes(){
        assertEquals(20, synthesizer.getInstrumentPLayModesCount());
    }


}
