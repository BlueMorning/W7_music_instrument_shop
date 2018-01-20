package Accessories;

import Shop.ISell;

public class AccessoryToSale implements ISell {

    private Double buyingPrice;
    private Double sellingPrice;
    private int stockLevel;
    public String description;

    public AccessoryToSale(String description,
                           Double buyingPrice,
                           Double sellingPrice,
                           int stockLevel){

        this.description    = description;
        this.buyingPrice    = buyingPrice;
        this.sellingPrice   = sellingPrice;
        this.stockLevel     = stockLevel;
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
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getStockLevel() {
        return stockLevel;
    }
}
