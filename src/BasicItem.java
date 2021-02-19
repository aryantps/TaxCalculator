import java.util.ArrayList;
import java.util.Scanner;

class BasicItem {
    private String itemName;
    private double itemPrice;
    private int itemQuant;
    private String itemType;
    private double tax;
//default constructor
    BasicItem() {
        this.itemName = "";
        this.itemPrice = 0.0;
        this.itemQuant = 0;
        this.itemType = "";
        this.tax = 0.0;
    }

    //getter setter methods
    public String getName() {
        return this.itemName;
    }

    public double getPrice() {
        return this.itemPrice;
    }

    public void setPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuant() { return itemQuant; }

    public String getType() {
        return this.itemType;
    }

    public void setType(String itemType) {
        this.itemType = itemType;
    }

    public double getTax() {
        return this.tax;
    }

    // strips off input array and does type check and value assignmnet
    public void getItemBasicItem(String[] args) {
        for (int i = 0; i < args.length; i++) {
            //check if all the fields have correct values
            try {
                if ("-name".compareTo(args[i]) == 0 && "-type".compareTo(args[i + 1]) != 0 && "-price".compareTo(args[i + 1]) != 0 && "-quantity".compareTo(args[i + 1]) != 0) {
                    this.itemName = args[i + 1];
                    i = i + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
            try {
                if ("-type".compareTo(args[i]) == 0 && "-price".compareTo(args[i + 1]) != 0 && "-quantity".compareTo(args[i + 1]) != 0 && "-name".compareTo(args[i + 1]) != 0) {
                    this.itemType = args[i + 1];
                    i = i + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
            try {
                if ("-price".compareTo(args[i]) == 0 && "-type".compareTo(args[i + 1]) != 0 && "quantity".compareTo(args[i + 1]) != 0 && "-name".compareTo(args[i + 1]) != 0) {
                    try {
                        this.itemPrice = Double.parseDouble(args[i + 1]);
                        i = i + 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input!");
                        System.exit(0);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
            try {
                if ("-quantity".compareTo(args[i]) == 0 && "-type".compareTo(args[i + 1]) != 0 && "-price".compareTo(args[i + 1]) != 0 && "-name".compareTo(args[i + 1]) != 0) {
                    try {
                        this.itemQuant = Integer.parseInt(args[i + 1]);
                        i = i + 1;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input!");
                        System.exit(0);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
        }
        calculateTax();
    }
    // calculate tax based on itemType
    public void calculateTax() {
        if (this.itemPrice != 0) {
            if ("raw".equals(this.itemType)) {
                this.tax = 0.125 * this.itemPrice;

            } else if ("manufactured".equals(this.itemType)) {
                this.tax = 0.125 * this.itemPrice + (0.02 * (this.itemPrice + 0.125 * this.itemPrice));
            } else if ("imported".equals(this.itemType)) {
                this.tax = this.itemPrice * 0.1;
                double surcharge = 0.0;
                double total = this.itemPrice + this.tax;
                //calculating surcharge amount
                if (total <= 100) {
                    surcharge = 5;
                } else if (total <= 200) {
                    surcharge = 10;
                } else {
                    surcharge = 0.05 * total;
                }
                this.tax = this.tax + surcharge;
            }
        }
    }


}
