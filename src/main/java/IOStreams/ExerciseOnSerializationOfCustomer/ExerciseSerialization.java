package IOStreams.ExerciseOnSerializationOfCustomer;

import Multithreading.ATMProblem.Customer;

import java.io.*;
import java.util.Scanner;

public class ExerciseSerialization {
    customer [] list={new customer("Jhon","283842946"),new customer("Ajay","49104632"),new customer("Smith","4928452"),new customer("Alex","739274")};

    public static void main(String[] args) throws Exception {
       ExerciseSerialization exe=new ExerciseSerialization();
        exe.writeToCustomerFile();
        exe.readFromCustomerFile();
        exe.serachThroughList("Jhon");

    }
    private  void writeToCustomerFile() throws Exception{
        FileOutputStream fos=new FileOutputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\CustomerList.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeInt(list.length);
        for (customer x:list)
        {
            oos.writeObject(x);
        }
    }
    private  void readFromCustomerFile() throws Exception {
        FileInputStream fis = new FileInputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\CustomerList.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int length = ois.readInt();
        customer cus;
        for (int i = 0; i < length; i++) {
            cus = (customer) ois.readObject();
            System.out.println(cus);
        }


    }

    private  void serachThroughList(String name){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<list.length;i++){
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
    }

}
class customer implements Serializable {
   static int count=1;
    String custId;
    String name;
    String phoneNum;

    public customer(){}
    public customer(String n,String p){
        custId="C"+count;
        count++;
        name=n;
        phoneNum=p;
    }

    @Override
    public String toString() {
        return "customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

}}
