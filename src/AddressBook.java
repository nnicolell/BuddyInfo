import java.util.*;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyList;

    public AddressBook() {
        buddyList = new ArrayList<>();
    }

    private void addBuddy(BuddyInfo buddy){
        if (buddy != null){
            buddyList.add(buddy);
        }
    }

    private BuddyInfo removeBuddy(int index){
        if (index >= 0 && index < buddyList.size()){
            return buddyList.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        BuddyInfo buddy2 = new BuddyInfo("David", "Carleton", "363");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
