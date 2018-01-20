package Shop;

public interface ISell {


    Double calculateMargin();
    Double calculateMarkup();
    Double getBuyingPrice();
    Double getSellingPrice();
    String getDescription();

}
