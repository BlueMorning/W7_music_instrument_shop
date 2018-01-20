package Shop;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Keyboard.Piano;
import Shop.ItemToSell.InstrumentToSale;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentToSaleTest {

    Piano piano;
    InstrumentToSale instrumentToSale;


    @Before
    public void before(){
        piano            = new Piano(EnumMaterial.WOOD, EnumColor.BROWN, 88);
        instrumentToSale = new InstrumentToSale(
                piano, 1000.0, 3000.0);
    }


    @Test
    public void hasInstrument(){
        assertEquals(piano, instrumentToSale.getInstrument());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1000.0, instrumentToSale.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(3000.0, instrumentToSale.getSellingPrice(), 0);
    }

    @Test
    public void hasMargin(){
        assertEquals(2000.0, instrumentToSale.calculateMargin(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(2000.0/1000.0, instrumentToSale.calculateMarkup(), 0);
    }

    @Test
    public void hasDescription(){
        String description = "Instrument family : KEYBOARD, " +
                             "Made of : WOOD, " +
                             "Main color : BROWN";
        assertEquals(description, instrumentToSale.getDescription());
    }


}
