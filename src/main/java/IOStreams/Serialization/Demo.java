package IOStreams.Serialization;

import java.io.*;

public class Demo  {
    public static void main(String[] args) throws Exception {
            ReadFromUsingSerialization();

    }
    public static void WriteUsingSerialization() throws Exception{
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\Serialized.txt");
        ObjectOutputStream out=new ObjectOutputStream(fos);

        Student st=new Student();
        st.rollNumber=8;
        st.name="Johnathan";
        st.dept="Science";

        out.writeObject(st);
    }

    public static void ReadFromUsingSerialization() throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\Serialized.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student s;
        s=(Student)ois.readObject();


        System.out.println(s.name+","+s.rollNumber+","+s.dept);
    }
}

class Student implements Serializable {
    int rollNumber;
    String name;
    String dept;

}

