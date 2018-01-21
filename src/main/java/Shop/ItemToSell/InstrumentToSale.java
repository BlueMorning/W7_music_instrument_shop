package Shop.ItemToSell;

import Instruments.Instrument;
import Shop.ISell;

public abstract class InstrumentToSale implements ISell {

    private String name;
    private Double buyingPrice;
    private Double sellingPrice;
    private int stockLevel;



    public InstrumentToSale(String name,
                            Double buyingPrice,
                            Double sellingPrice,
                            int stockLevel){

        this.name           = name;
        this.buyingPrice    = buyingPrice;
        this.sellingPrice   = sellingPrice;
        this.stockLevel     = stockLevel;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public Double calculateMargin() {
        return (this.sellingPrice - this.buyingPrice);
    }

    @Override
    public Double calculateMarkup()
    {
        if(this.buyingPrice != 0) {
            return calculateMargin() / this.buyingPrice;
        }
        else {
            return 0.0;
        }
    }

    @Override
    public Double getBuyingPrice() {
        return this.buyingPrice;
    }

    @Override
    public Double getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public int getStockLevel() {
        return stockLevel;
    }
}
