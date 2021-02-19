public class ImportedItemType extends BasicItem{
    double surcharge = 0.0;
    public ImportedItemType(String itemName, double itemPrice){
        super(itemName,itemPrice);
        tax = 0.1 * itemPrice;

        if ((itemPrice + tax) <= 100) {
            surcharge = 5;
        }

        else if ((itemPrice + tax) <= 200) {
            surcharge = 10;
        }

        else if ((itemPrice + tax) > 200) {
            surcharge = 0.05 * (itemPrice + tax);

        }
        tax = tax + surcharge;
    }
    public double getTax(){
        return tax;
    }
}
