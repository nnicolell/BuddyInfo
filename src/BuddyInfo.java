public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(){
        name = "";
        address = "";
        phoneNumber = "";
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo bart = new BuddyInfo("Bart", "123 Sesame Street", "1234567890");
        System.out.println("Hello " + bart.getName());
    }
}

