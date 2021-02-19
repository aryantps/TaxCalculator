public class taxCalculator extends BasicItem{
    public taxCalculator(){
        if (this.itemPrice != 0) {
            if ("raw".equals(this.itemType)) {
                this.tax = 0.125 * this.itemPrice;

            } else if ("manufactured".equals(this.itemType)) {
                this.tax = 0.125 * this.itemPrice + (0.02 * (this.itemPrice + 0.125 * this.itemPrice));
            } else if ("imported".equals(this.itemType)) {
                this.tax = this.itemPrice * 0.1;
                double surcharge;
                double total = this.itemPrice + this.tax;
                //calculating surcharge amount
                if (total <= 100) {
                    surcharge = 5;
                } else if (total <= 200) {
                    surcharge = 10;
                } else {
                    surcharge = 0.05 * total;
                }
                this.itemPrice = this.tax + surcharge;
            }
        }
    }
}
