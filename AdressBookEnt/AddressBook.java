package AdressBookEnt;

/**
 * Utilized private static final for MAX_Entries to create constant in the class in order to limit the storage for the entries
 * Utilized arrayList in order to easily apply crud operation such as size, add, and use is empty.
 * references:
 * https://stackoverflow.com/questions/17922195/why-static-final-int-max-value-100-gives-compile-time-error
 * https://www.w3schools.com/java/java_arraylist.asp
 * https://www.w3schools.com/java/java_ref_arraylist.asp
 * https://dev.to/tacomanick/java-arraylists-a-dead-easy-tutorial-for-absolute-beginnners-8ig#:~:text=The%20ArrayList%20class%20comes%20with,ArrayList%20is%20pretty%20straight%20forward.
 */
import java.util.ArrayList;

public class AddressBook {

    private ArrayList<AddressBookEntry> entries;
    private static final int MAX_ENTRIES = 100;

    //constructor
    public AddressBook() {
        entries = new ArrayList<>();
    }

    // add an entry
    public boolean addEntry(AddressBookEntry entry) {
        if (entries.size() < MAX_ENTRIES) {
            entries.add(entry);
            return true;
        } else {
            System.out.println("\nReached maximum entry.");
            return false;
        }
    }

    // delete an entry
    public boolean deleteEntry(String name) {
        for (AddressBookEntry entry : entries) {
            /**if (input name comparing to the name stored")
             then remove the entry on the storage
             return true
             */
            if (entry.getName().equalsIgnoreCase(name)) {
                entries.remove(entry);
                return true;
            }
        }
        System.out.println("\nEntry not found.");
        return false;
    }

    // view all entries or prints all entries
    public void viewEntries() {
        if (entries.isEmpty()) {
            System.out.println("\nAddress book is empty.");
        } else {
            for (AddressBookEntry entry : entries) {
                System.out.println(entry);
            }
        }
    }

    // update an entry by name
    public boolean updateEntry(String name, String newAddress, String newTelephone, String newEmail) {
        for (AddressBookEntry entry : entries) {
            /**if (input name comparing to the name stored")
             * then set new address
             * &new tp num
             * &new email
             * return true
             */
            if (entry.getName().equalsIgnoreCase(name)) {
                entry.setAddress(newAddress);
                entry.setTelephoneNumber(newTelephone);
                entry.setEmailAddress(newEmail);
                return true;
            }
        }
        System.out.println("\nEntry was invalid. ");
        return false;
    }

}