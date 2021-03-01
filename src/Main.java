import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //print details of item

    public static void printBasicItem(ArrayList<BasicItem> items) {
        for (BasicItem detail : items) {
            if (detail.getType() == "") {
                System.out.println("Missing type field!");
                continue;
            }
            if (detail.getName() == "") {
                System.out.println("name not entered!");
            } else {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Item name : " + detail.getName());
            }
            System.out.println("Item price : " + detail.getPrice());
            System.out.println("Tax per item : " + detail.getTax());
            System.out.println("Total price is : " + detail.getItemQuant() * (detail.getPrice() + detail.getTax()));
            System.out.println("---------------------------------------------------------------------");

        }
    }
    //entry point
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<BasicItem> items = new ArrayList<BasicItem>();
        Scanner sc = new Scanner(System.in);
        char choice = 'n';
        do {
            System.out.println("Enter details of new item :\n \t Example : -name butter -price 100 -quantity 3 -type raw \n");
            String input = sc.next();
            input += sc.nextLine();
            String[] inpArray = input.split(" ");
            BasicItem detail = new BasicItem();
            detail.getItemBasicItem(inpArray);
            items.add(detail);
            System.out.println("Do you want to enter details of other items (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        printBasicItem(items);
    }

}
