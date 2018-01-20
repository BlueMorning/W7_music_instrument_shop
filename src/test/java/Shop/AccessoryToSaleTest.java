package Shop;

import Accessories.AccessoryToSale;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryToSaleTest {

    AccessoryToSale accessoryToSale;

    @Before
    public void before(){
        accessoryToSale = new AccessoryToSale("Drums Sticks", 10.0, 15.0, 3);
    }


    @Test
    public void hasDescription(){
        assertEquals("Drums Sticks", accessoryToSale.getDescription());
    }


}
