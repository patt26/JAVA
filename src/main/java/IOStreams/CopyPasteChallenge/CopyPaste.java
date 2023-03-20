package IOStreams.CopyPasteChallenge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Locale;

public class CopyPaste  {
   static String str;
    static FileOutputStream fos;

    static FileInputStream fis1;
    static FileInputStream fis2;
    static {
        try {
            fis1 = new FileInputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\SourceWithCapitalCase.txt");
            fis2=new FileInputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\CopiedText.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
//        ReadFromFile();
//        WriteToFile();
        ToNewFile();

    }

    public static void ReadFromFile() throws Exception{
       // FileInputStream fis=new FileInputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\SourceWithCapitalCase.txt");
        byte [] b=new byte[fis1.available()];
       fis1.read(b);
       str=new String(b);
       System.out.println(str);
        System.out.println("Writing to new File.....");
    }

    public static void WriteToFile()throws Exception{
      //  FileOutputStream fos=new FileOutputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\CopiedText.txt");
        byte b[]=str.toLowerCase(Locale.ROOT).getBytes();
        fos.write(b);
        System.out.println("Writing completed..");


    }

    public static void ToNewFile() throws Exception{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Pratik.Kharche\\Documents\\All OutputFiles\\NewFile.txt");
        SequenceInputStream seq=new SequenceInputStream(fis1,fis2);
        int b;
        while((b=seq.read())!=-1){
            fos.write(b);
        }
//        byte b[]=new byte[seq.available()];
//        seq.read(b);
//        String str=new String(b);
//        byte []b1=str.getBytes();
//        fos.write(b1);
        System.out.println("Written to new file completed");

    }
}
