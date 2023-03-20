package Multithreading.ClassroomProblem;

public class Runner {
    public static void main(String[] args) {
        Whiteboard wb = new Whiteboard();
        Teacher t1 = new Teacher(wb);

        Student s1 = new Student(wb, "Jhon");
        Student s2 = new Student(wb, "Adam");
        Student s3 = new Student(wb, "Alex");
        Student s4 = new Student(wb, "Cole");

        t1.start();
        s1.setPriority(Thread.MAX_PRIORITY);
        s1.start();
        s1.setPriority(Thread.MAX_PRIORITY);
        s2.start();
        s2.setPriority(Thread.MAX_PRIORITY);
        s3.start();
        s3.setPriority(Thread.MAX_PRIORITY);
        s4.start();
        s4.setPriority(Thread.MAX_PRIORITY);

    }
}
