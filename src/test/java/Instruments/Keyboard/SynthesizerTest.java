package Instruments.Keyboard;

import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SynthesizerTest {

    Synthesizer synthesizer;

    @Before
    public void before(){
        synthesizer = new Synthesizer();
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.KEYBOARD, synthesizer.getInstrumentFamily());
    }



}
