package Shop;

import Instruments.EnumColor;
import Instruments.EnumMaterial;
import Instruments.Keyboard.Piano;
import Shop.ItemToSell.InstrumentToSale;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    ISell pianoToSale;


    @Before
    public void Before(){
        shop = new Shop();

        piano            = new Piano(EnumMaterial.WOOD, EnumColor.BROWN, 88);
        pianoToSale      = new InstrumentToSale(
                piano, 1000.0, 3000.0, 5);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canAddItem(){
        shop.addNewItemToSell(pianoToSale);
        assertEquals(1, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addNewItemToSell(pianoToSale);
        assertEquals(1, shop.getStockDistinctItemsCount());

        shop.removeItemToSell(pianoToSale);
        assertEquals(0, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addNewItemToSell(pianoToSale);
        assertEquals(10000.0, shop.calculatePotentialProfit(), 0);
    }


}
