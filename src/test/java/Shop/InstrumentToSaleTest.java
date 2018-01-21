package Shop;

import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Keyboard.Piano;
import Shop.ItemToSell.InstrumentToSale;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentToSaleTest {

    InstrumentToSale piano;


    @Before
    public void before(){
        piano      = new Piano("Piano", EnumMaterial.WOOD, EnumColor.BROWN, 1000.0, 3000.0, 5, 88);
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(1000.0, piano.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(3000.0, piano.getSellingPrice(), 0);
    }

    @Test
    public void hasMargin(){
        assertEquals(2000.0, piano.calculateMargin(), 0);
    }

    @Test
    public void hasMarkup(){
        assertEquals(2000.0/1000.0, piano.calculateMarkup(), 0);
    }

    @Test
    public void hasDescription(){
        String description = "Instrument family : KEYBOARD, " +
                             "Made of : WOOD, " +
                             "Main color : BROWN";
        assertEquals(description, piano.getDescription());
    }

    @Test
    public void hasStockLevel(){
        assertEquals(5, piano.getStockLevel());
    }


}
