package IOStreams;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PracIO {
    public static void main(String[] args) throws Exception  {
        WriteToText("Hello World its JAVA");
        ReadFileFromText();
    }

    public static void WriteToText(String str) throws IOException {
        FileOutputStream fos=new FileOutputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\Test.txt");
        byte b[]=str.getBytes();
        fos.write(b);
    }

    public static void ReadFileFromText() throws IOException{
        FileInputStream fis=new FileInputStream("\\C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\Test.txt");
        byte [] b=new byte[fis.available()];
        fis.read(b);
        String str=new String(b);
        System.out.println(str);

    }
}

