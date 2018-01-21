package Instruments.Keyboard;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumInstrumentType;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Enumerations.EnumInstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SynthesizerTest {

    Synthesizer synthesizer;

    @Before
    public void before(){
        synthesizer = new Synthesizer("Synthesizer",
                                        EnumMaterial.PLASTIC,
                                        EnumColor.BLACK,
                                        10.0,
                                        50.0,
                                        150,
                                        20);
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(EnumInstrumentFamily.KEYBOARD, synthesizer.getInstrumentFamily());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(EnumInstrumentType.SYNTHESIZER, synthesizer.getInstrumentType());
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
