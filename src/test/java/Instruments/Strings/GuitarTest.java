

import Instruments.InstrumentFamily;
import Instruments.Strings.Guitar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar();
    }

    @Test
    public void hasInstrumentFamily(){
        Assert.assertEquals(InstrumentFamily.STRINGS, guitar.getInstrumentFamily());
    }



}
