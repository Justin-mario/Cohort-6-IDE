package ChapterThree;

public class Invoice {
    private String productName;
    private String productDescription;
    private int quantityPurchased;
    private double priceOfItem;
    private double invoiceAmount;

    public Invoice(String productName, String productDescription, int quantityPurchased, double priceOfItem){
        this.productName = productName;
        this.productDescription = productDescription;
        this.priceOfItem = priceOfItem;
        this.quantityPurchased = quantityPurchased;

    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setQuantityPurchased(int quantityPurchased) {

        this.quantityPurchased = quantityPurchased;
    }

    public int getQuantityPurchased() {
        if(quantityPurchased < 0){
            quantityPurchased = 0;}

        return quantityPurchased;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public double getPriceOfItem() {
        if(priceOfItem < 0.0){
            priceOfItem = 0.0; }
        return priceOfItem;
    }

    public double getInvoiceAmount(){
        invoiceAmount = priceOfItem * quantityPurchased;
        return invoiceAmount;
    }
}
