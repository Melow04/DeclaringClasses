package AdressBookEnt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String delName ,updateName ,newAddress ,newTelephone, newEmail;
        
        do {
            //menu
            System.out.println("\n| Address Book |\n");
            System.out.println("1. Add an Entry");
            System.out.println("2. Delete an Entry");
            System.out.println("3. View All Entries");
            System.out.println("4. Update an Entry");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // entry
                    AddressBookEntry newEntry = new AddressBookEntry();
                    System.out.print("Enter name: ");
                    newEntry.setName(scanner.nextLine());
                    System.out.print("Enter address: ");
                    newEntry.setAddress(scanner.nextLine());
                    System.out.print("Enter telephone number: ");
                    newEntry.setTelephoneNumber(scanner.nextLine());
                    System.out.print("Enter email: ");
                    newEntry.setEmailAddress(scanner.nextLine());
                    addressBook.addEntry(newEntry);
                    break;
                case 2:
                    // delete an entry
                    System.out.print("Enter the name of the entry to delete: ");
                 delName = scanner.nextLine();
                    addressBook.deleteEntry(delName);
                    break;
                case 3:
                    //all entries
                    addressBook.viewEntries();
                    break;
                case 4:
                    // update
                    System.out.print("Enter the name of the entry to update: ");
                    updateName = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    newAddress = scanner.nextLine();
                    System.out.print("Enter new telephone number: ");
                    newTelephone = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    newEmail = scanner.nextLine();
                    addressBook.updateEntry(updateName, newAddress, newTelephone, newEmail);
                    break;
                case 5:
                    System.out.println("\nExiting the program.");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}