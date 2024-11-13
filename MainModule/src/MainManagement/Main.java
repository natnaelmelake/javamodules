package MainManagement;


import ItemManagement.Item;
import UserManagement.User;
import utilityManagement.Utils;
import TransactionManagement.Transaction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter User Email: ");
        String userEmail = scanner.nextLine();

        if (!Utils.validateEmail(userEmail)) {
            System.out.println("Invalid email format.");
            return;
        }

        User user = new User(userId, userName, userEmail);
        Utils.log("User added: " + user);


        System.out.print("Enter Item ID: ");
        int itemId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Item Price: ");
        double itemPrice = scanner.nextDouble();

        if (!Utils.validatePrice(itemPrice)) {
            System.out.println("Invalid price.");
            return;
        }

        Item item = new Item(itemId, itemName, itemPrice);
        Utils.log("Item added: " + item);

        System.out.print("Enter Transaction ID: ");
        int transactionId = scanner.nextInt();
        Transaction transaction = new Transaction(transactionId, user, item);
        Utils.log("Transaction recorded: " + transaction);

        System.out.println("Transaction details: " + transaction);

        scanner.close();
    }
}


