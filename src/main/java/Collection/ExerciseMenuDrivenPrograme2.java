package Collection;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;


public class ExerciseMenuDrivenPrograme2 {
    static HashMap<String, String> hm = new HashMap<>();
    static Account acc = new Account();
    static Scanner sc = new Scanner(System.in);
    static boolean flag = true;
    Account1 currentAccount;

    public static void main(String[] args) throws Exception {
        while (flag) {
            System.out.println("Select from below operations:\n1:Create Account\n2:Delete Account\n3:View Account\n4:View All Accounts\n5:Save Accounts\n6:Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Balance: ");
                    float bal = sc.nextFloat();
                    acc.CreateAccount(name, bal);
                    break;
                case 2:
                    System.out.print("Enter Account number for Delete: ");
                    String ac = sc.next();
                    acc.DeleteAccount(ac);
                    break;
                case 3:
                    System.out.print("Enter Account Number to view Details: ");
                    String acN = sc.next();
                    ViewAccount(acN);
                    break;
                case 4:
                    ViewAllAccount();
                    break;
                case 5:
                    acc.SaveAllAccounts();
                    break;
                case 6:
                    System.out.println("Exited Successfully");
                    flag = false;
                    break;
                default:
                    System.out.println("Please Enter valid option");
            }
        }
    }

    public void CreateAccount(String Nm, float Bal) throws Exception {
        Account1 acc = new Account1(Nm, Bal);

        System.out.println("Account created Successfully, Find Details below\n" + acc.toString() + "\n");
        hm.put(acc.accountNum, String.valueOf(acc));
        System.out.println("------------------");
        SaveAllAccounts();

    }

    public void DeleteAccount(String accountNum) {
        if (hm.containsKey(accountNum)) {
            hm.remove(accountNum);
            System.out.println("Account Number " + accountNum + " Deleted");
            System.out.println("------------------------");
        } else {
            System.out.println("Account is not present");
            System.out.println("------------------------");
        }
    }

    public static void ViewAccount(String accountNum) {
        System.out.println(hm.get(accountNum));
        System.out.println("--------------------");
    }

    public static void ViewAllAccount() {
        System.out.println("++++++++++++++++++++++");
        RetrievingAccounts();
        System.out.println("Total " + hm.size() + " Accounts are found and they are as follows:");
        hm.forEach((x, y) -> System.out.println("\n" + x + "\n{ \n" + y + "\n}\n**********"));

    }

    public void SaveAllAccounts() throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\AllAccounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(currentAccount);
        System.out.println("All the details are saved in file");

    }

    public static void RetrievingAccounts() {
        Account1 acc2;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\AllAccounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc2 = (Account1) ois.readObject();
                System.out.println(acc2);
                hm.put(acc.accountNum, String.valueOf(acc));
            }
          /*  fis.close();
            ois.close();*/
        } catch (Exception e) {
        }
    }

}

class Account1 implements Serializable {
    String accountNum;
    String name;
    float balance;
    static int count = 100;

    public Account1(String nM, float bal) {
        this.accountNum = "A" + count;
        count++;
        this.name = nM;
        this.balance = bal;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNum + "\nName: " + name + "\nAvailable Balance: " + balance;
    }

    public Account1() {
    }

}



