package Multithreading.ClassroomProblem;

public class Teacher extends Thread {
    Whiteboard wb;
    String[] notes = {"Java is Language", "It is OOPs", "It is Platform independent", "It support Threads", "end"};

    public Teacher(Whiteboard wb1) {
        this.wb = wb1;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {

            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    Whiteboard wb;

    public Student(Whiteboard wb, String name) {
        this.wb = wb;
        this.name = name;
    }

    public void run() {
        String text1;
        wb.attendance();
        do {
            text1 = wb.read();
            System.out.println(name + " Reading " + text1);

        } while (!text1.equals("end"));
    }
}
