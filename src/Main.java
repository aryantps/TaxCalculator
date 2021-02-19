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

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printDetails(ArrayList<BasicItem> items) {
        for (BasicItem detail : items) {
            if (detail.getItemType().equals("")) {
                System.out.println("Missing type field!");
                continue;
            }
            if (detail.getItemName().equals("")) {
                System.out.println("name not entered!");
            } else {
                System.out.println("Item name : " + detail.getItemName());
            }
            System.out.println("Item price : " + detail.getItemPrice());
            System.out.println("Tax per item : " + detail.getTax());
            System.out.println("Total price is : " + (detail.getItemPrice() + detail.getTax()));
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<BasicItem> items = new ArrayList<BasicItem>();
        Scanner sc = new Scanner(System.in);
        char choice = 'n';
        do {
            System.out.println("Enter new item details:");
            String input = sc.next();
            input += sc.nextLine();
            String[] inpArray = input.split(" ");
            BasicItem detail = new BasicItem();
            detail.getItemDetails(inpArray);
            items.add(detail);
            System.out.println("Do you want to enter details of other items (y/n):");
            choice = sc.next().charAt(0);
        } while (choice == 'y');
        printDetails(items);
    }}
