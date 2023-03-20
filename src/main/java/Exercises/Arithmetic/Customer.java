package Exercises.Arithmetic;

public class Customer {
    private int CustId;
    private String Name;
    private String Address;
    private long PhoneNumb;

    public int getCustId() {
        return CustId;
    }

    public String getName() {
        return Name;
    }

    public long getPhoneNumb() {
        return PhoneNumb;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Customer(int custId, String name, long phoneNumb) {
        CustId = custId;
        Name = name;
        PhoneNumb = phoneNumb;
    }

    public Customer(int custId, String name, String address, long phoneNumb) {
        CustId = custId;
        Name = name;
        Address = address;
        PhoneNumb = phoneNumb;
    }
}
