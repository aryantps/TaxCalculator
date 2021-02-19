public class RawItemType extends BasicItem {
    public RawItemType(String itemName, double itemPrice){
        super(itemName,itemPrice);
        tax = 0.125 * itemPrice ;
    }
    public double getTax(){
        return tax;
    }
}


