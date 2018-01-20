package Instruments.Keyboard;

import Instruments.InstrumentFamily;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano();
    }


    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.KEYBOARD, piano.getInstrumentFamily());
    }



}
