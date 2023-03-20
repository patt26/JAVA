package IOStreams.ExerciseOnFloat;

import java.io.DataOutputStream;
import java.io.*;

public class Exercise {
    public static void main(String[] args) throws Exception {
        //writeToFileFloat();
        readFromFileFloat();

    }
    public static void writeToFileFloat() throws Exception{
        FileOutputStream fos=new FileOutputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\float.txt");
        DataOutputStream dos=new DataOutputStream(fos);

        float [] sample={1.3f,4.5f,5.8f,2.43f,6.9f};
        dos.writeInt(sample.length);
        for (float x:sample) {
            dos.writeFloat(x);
        }
    }
    public static void readFromFileFloat() throws Exception{
        FileInputStream fis=new FileInputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\float.txt");
        DataInputStream dis=new DataInputStream(fis);

        int length=dis.readInt();
        float data;
        for(int i=0;i<length;i++){
            data=dis.readFloat();
            System.out.println(data);
        }
    }


}
