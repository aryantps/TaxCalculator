public class BasicItem {

    private String itemName;
    private double itemPrice;
    private int itemQuant;
    private double finalPrice;
    public double tax = 0.0;

    public BasicItem(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuant() {
        return itemQuant;
    }

    public void setItemQuant(int itemQuant) {
        this.itemQuant = itemQuant;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = tax + itemPrice * itemQuant;
    }

    private void outputAtEnd(){
        System.out.println("Item name : " + itemName);
        System.out.println("Item Type: "  /* Don't know*/);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Item Quantity: " + itemQuant);
        System.out.println("Sales tax : " + tax);
        System.out.println("Final Price : " + finalPrice);
        System.out.println("\n");


    }

}
