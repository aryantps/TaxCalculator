import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printBasicItem(ArrayList<BasicItem> items) {
        for (BasicItem detail : items) {
            if (detail.getType() == "") {
                System.out.println("Missing type field!");
                continue;
            }
            if (detail.getName() == "") {
                System.out.println("name not entered!");
            } else {
                System.out.println("Item name : " + detail.getName());
            }
            System.out.println("Item price : " + detail.getPrice());
            System.out.println("Tax per item : " + detail.getTax());
            System.out.println("Total price is : " + (detail.getPrice() + detail.getTax()));
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<BasicItem> items = new ArrayList<BasicItem>();
        Scanner sc = new Scanner(System.in);
        char choice = 'n';
        do {
            System.out.println("Enter new item baseItem:");
            String input = sc.next();
            input += sc.nextLine();
            String[] inpArray = input.split(" ");
            BasicItem detail = new BasicItem();
            detail.getItemBasicItem(inpArray);
            items.add(detail);
            System.out.println("Do you want to enter baseItem of other items (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        printBasicItem(items);
    }

}
