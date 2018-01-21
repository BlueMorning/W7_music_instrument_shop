package Shop;

import Accessories.AccessoryToSale;
import Instruments.Enumerations.EnumColor;
import Instruments.Enumerations.EnumMaterial;
import Instruments.Keyboard.Piano;
import Shop.ItemToSell.InstrumentToSale;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    InstrumentToSale piano;
    AccessoryToSale accessory;


    @Before
    public void Before(){
        shop       = new Shop();
        piano      = new Piano("Piano", EnumMaterial.WOOD, EnumColor.BROWN, 1000.0, 3000.0, 5, 88);
        accessory  = new AccessoryToSale("Drums Sticks", 10.0, 15.0, 3);
    }

    @Test
    public void hasStock(){
        assertEquals(0, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canAddItem(){
        shop.addNewItemToSell(piano);
        assertEquals(1, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addNewItemToSell(piano);
        assertEquals(1, shop.getStockDistinctItemsCount());

        shop.removeItemToSell(piano);
        assertEquals(0, shop.getStockDistinctItemsCount());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addNewItemToSell(piano);
        assertEquals(10000.0, shop.calculatePotentialProfit(), 0);
    }

    @Test
    public void canCalculatePotentialProfit__polymorphism(){
        shop.addNewItemToSell(piano);
        shop.addNewItemToSell(accessory);
        assertEquals(10015.0, shop.calculatePotentialProfit(), 0);
    }


}
