package Shop;

import Shop.ItemToSell.InstrumentToSale;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;


    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public int addNewItemToSell(ISell itemToSell){
        stock.add(itemToSell);
        return stock.size();
    }

    public ISell removeItemToSell(ISell itemToSell){
        if(stock.contains(itemToSell)){
            stock.remove(itemToSell);
        }
        return itemToSell;
    }

    public int getStockDistinctItemsCount(){
        return stock.size();
    }

    public Double calculatePotentialProfit(){

        Double potentialProfit = 0.0;

        for(ISell sellItem : stock) {
            potentialProfit += (sellItem.calculateMargin() * sellItem.getStockLevel());
        }

        return potentialProfit;
    }


}
