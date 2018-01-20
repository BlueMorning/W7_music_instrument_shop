

import Instruments.InstrumentFamily;
import Instruments.WoodWind.Clarinet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet();
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.WOODWIND, clarinet.getInstrumentFamily());
    }



}
