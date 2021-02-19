//public class TaxCalculator {
//    public void taxCalc(BasicItem basicItem) {
//        if (basicItem.itemPrice != 0) {
//            if ("raw".equals(basicItem.itemType)) {
//                basicItem.tax = 0.125 * basicItem.itemPrice;
//
//            } else if ("manufactured".equals(basicItem.itemType)) {
//                basicItem.tax = 0.125 * basicItem.itemPrice + (0.02 * (basicItem.itemPrice + 0.125 * basicItem.itemPrice));
//            } else if ("imported".equals(basicItem.itemType)) {
//                basicItem.tax = basicItem.itemPrice * 0.1;
//                double surcharge;
//                double total = basicItem.itemPrice + basicItem.tax;
//                //calculating surcharge amount
//                if (total <= 100) {
//                    surcharge = 5;
//                } else if (total <= 200) {
//                    surcharge = 10;
//                } else {
//                    surcharge = 0.05 * total;
//                }
//                basicItem.itemPrice = basicItem.tax + surcharge;
//            }
//        }
//    }
//
//
//}
