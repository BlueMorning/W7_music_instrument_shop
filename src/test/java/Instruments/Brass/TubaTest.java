package Instruments.Brass;

import Instruments.InstrumentFamily;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before(){
        tuba = new Tuba();
    }


    @Test
    public void hasInstrumentFamily(){
        assertEquals(InstrumentFamily.BRASS, tuba.getInstrumentFamily());
    }



}