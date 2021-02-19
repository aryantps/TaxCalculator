public class ManufacturedItemType extends BasicItem{
    public ManufacturedItemType(String itemName, double itemPrice){
        super(itemName,itemPrice);
        tax = 0.125 * itemPrice + (0.02 * (itemPrice + 0.125 * itemPrice));
    }
    public double getTax(){
        return tax;
    }
}
