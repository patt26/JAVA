package Learning.Inheritance;

public class Animal {
    private String name;
    private int legs;
    private String type;
    private String overall;

    public Animal(String name, int legs, String type, String overall) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        this.overall = overall;
    }
    public void eat(){
        System.out.println("eat initailized");
    }
    protected void pop(){
        System.out.println("Pop");
    }

}
