package ChapterThree;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice hardWare = new Invoice("Hard Disk", "500G HDD", 10, -10000);

        System.out.println(" Item Purchased:" +  hardWare.getProductName() + "Capacity " +  hardWare.getProductDescription() +
                " Quantity " + hardWare.getQuantityPurchased()+ " Price Of Each Item " +  hardWare.getPriceOfItem() +  " Total Cost " +
                hardWare.getInvoiceAmount());
    }
}
