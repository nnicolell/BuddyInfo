import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    private void addBuddy(BuddyInfo buddy){

    }

    private void removeBuddy(BuddyInfo buddy){

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
