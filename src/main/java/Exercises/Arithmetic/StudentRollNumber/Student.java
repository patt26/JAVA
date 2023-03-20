package Exercises.Arithmetic.StudentRollNumber;

import java.util.Calendar;
import java.util.Date;

public class Student {
    private String rollNumber;
    private String name;
    private static int count=1;

    public Student(String name) {
        this.rollNumber = generateRollNumber(name);

    }

    private String generateRollNumber(String name) {
        Date d=new Date();
        String random="UNI-"+(d.getYear()+1900)+"-"+count;
        count++;
        System.out.println("Name- "+name+" Roll Number- "+random);
        return random;
    }
}
