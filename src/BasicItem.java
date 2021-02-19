import java.util.ArrayList;
import java.util.Scanner;

class BasicItem {
    private String name;
    private double price;
    private int quantity;
    private String type;
    private double tax;

    BasicItem() {
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
        this.type = "";
        this.tax = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTax() {
        return this.tax;
    }

    public void getItemBasicItem(String[] args) {
        for (int i = 0; i < args.length; i++) {
            //check if all the fields have correct values
            try {
                if ("-name".compareTo(args[i]) == 0 && "-type".compareTo(args[i + 1]) != 0 && "-price".compareTo(args[i + 1]) != 0 && "-quantity".compareTo(args[i + 1]) != 0) {
                    this.name = args[i + 1];
                    i = i + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
            try {
                if ("-type".compareTo(args[i]) == 0 && "-price".compareTo(args[i + 1]) != 0 && "-quantity".compareTo(args[i + 1]) != 0 && "-name".compareTo(args[i + 1]) != 0) {
                    this.type = args[i + 1];
                    i = i + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Value not entered!");
                System.exit(0);
            }
            try {
                if ("-price".compareTo(args[i]) == 0 && "-type".compareTo(args[i + 1]) != 0 && "quantity".compareTo(args[i + 1]) != 0 && "-name".compareTo(args[i + 1]) != 0) {
                    try {
                        this.price = Double.parseDouble(args[i + 1]);
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
                        this.quantity = Integer.parseInt(args[i + 1]);
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

    public void calculateTax() {
        if (this.price != 0) {
            if ("raw".equals(this.type)) {
                this.tax = 0.125 * this.price;

            } else if ("manufactured".equals(this.type)) {
                this.tax = 0.125 * this.price + (0.02 * (this.price + 0.125 * this.price));
            } else if ("imported".equals(this.type)) {
                this.tax = this.price * 0.1;
                double surcharge = 0.0;
                double total = this.price + this.tax;
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
