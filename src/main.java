/*
 * Class name
 *
 * Version info
 *
 * Copyright notice
 *
 * Author info
 *
 * Creation date
 *
 * Last updated By
 *
 * Last updated Date
 *
 * Description
 */

public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Details> items = new ArrayList<Details>();
        Scanner sc = new Scanner(System.in);
        char choice = 'n';
        do {
            System.out.println("Enter new item details:");
            String input = sc.next();
            input += sc.nextLine();
            String[] inpArray = input.split(" ");
            Details detail = new Details();
            detail.getItemDetails(inpArray);
            items.add(detail);
            System.out.println("Do you want to enter details of other items (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        printDetails(items);
    }
}
