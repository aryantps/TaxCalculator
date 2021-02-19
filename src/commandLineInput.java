import java.util.*;

public class commandLineInput {

    static Scanner scanner = new Scanner(System.in);
    public void getItemDetails(String[] args) {
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
        //calculateTax function
    }

    private void promptAtStart(){

        //ArrayList<String> argsList = new ArrayList<String>(Arrays.asList(args));
        // Add error handling here for type and values of arguments



    }
    private void promptAfterFirst(){
        System.out.println("Do you want to enter details of any other item (y/n):");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        while ("y".equalsIgnoreCase(choice)){
            //
        }

    }
}

