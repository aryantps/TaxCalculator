import java.util.*;

public class commandLineInput {

    static Scanner scanner = new Scanner(System.in);

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

