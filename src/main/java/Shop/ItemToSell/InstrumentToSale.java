package Shop.ItemToSell;

import Instruments.Instrument;
import Shop.ISell;

public class InstrumentToSale implements ISell {

    private Instrument instrument;
    private Double buyingPrice;
    private Double sellingPrice;
    private int stockLevel;


    public InstrumentToSale(Instrument instrument,
                            Double buyingPrice,
                            Double sellingPrice,
                            int stockLevel){

        this.instrument     = instrument;
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
        return String.format("Instrument family : %s, " +
                             "Made of : %s, " +
                             "Main color : %s",
                             this.instrument.getInstrumentFamily().toString(),
                             this.instrument.getMaterial().toString(),
                             this.instrument.getColor().toString());
    }

    @Override
    public int getStockLevel() {
        return stockLevel;
    }

    public Instrument getInstrument() {
        return instrument;
    }
}
